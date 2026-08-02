package com.nimbusds.jose.crypto;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEEncrypter;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.UnprotectedHeader;
import com.nimbusds.jose.crypto.impl.AAD;
import com.nimbusds.jose.crypto.impl.JWEHeaderValidation;
import com.nimbusds.jose.crypto.impl.MultiCryptoProvider;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.KeyType;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.SecretKey;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
/* loaded from: classes8.dex */
public class MultiEncrypter extends MultiCryptoProvider implements JWEEncrypter {
    private static final String[] RECIPIENT_HEADER_PARAMS = {"kid", "alg", "x5u", "x5t", "x5t#S256", "x5c"};
    private final JWKSet keys;

    public MultiEncrypter(JWKSet jWKSet) throws KeyLengthException {
        this(jWKSet, findDirectCEK(jWKSet));
    }

    public MultiEncrypter(JWKSet jWKSet, SecretKey secretKey) throws KeyLengthException {
        super(secretKey);
        if (jWKSet == null) {
            throw new IllegalArgumentException("The JWK set must not be null");
        }
        for (JWK jwk : jWKSet.getKeys()) {
            KeyType keyType = jwk.getKeyType();
            if (jwk.getAlgorithm() == null) {
                throw new IllegalArgumentException("Each JWK must specify a key encryption algorithm");
            }
            JWEAlgorithm parse = JWEAlgorithm.parse(jwk.getAlgorithm().toString());
            if (JWEAlgorithm.DIR.equals(parse) && KeyType.OCT.equals(keyType) && !jwk.toOctetSequenceKey().toSecretKey("AES").equals(secretKey)) {
                throw new IllegalArgumentException("Bad CEK");
            }
            if (!KeyType.RSA.equals(keyType) || !RSAEncrypter.SUPPORTED_ALGORITHMS.contains(parse)) {
                if (!KeyType.EC.equals(keyType) || !ECDHEncrypter.SUPPORTED_ALGORITHMS.contains(parse)) {
                    if (!KeyType.OCT.equals(keyType) || !AESEncrypter.SUPPORTED_ALGORITHMS.contains(parse)) {
                        if (!KeyType.OCT.equals(keyType) || !DirectEncrypter.SUPPORTED_ALGORITHMS.contains(parse)) {
                            if (!KeyType.OKP.equals(keyType) || !X25519Encrypter.SUPPORTED_ALGORITHMS.contains(parse)) {
                                throw new IllegalArgumentException("Unsupported key encryption algorithm: " + parse);
                            }
                        }
                    }
                }
            }
        }
        this.keys = jWKSet;
    }

    private static SecretKey findDirectCEK(JWKSet jWKSet) {
        if (jWKSet == null) {
            return null;
        }
        for (JWK jwk : jWKSet.getKeys()) {
            if (JWEAlgorithm.DIR.equals(jwk.getAlgorithm()) && KeyType.OCT.equals(jwk.getKeyType())) {
                return jwk.toOctetSequenceKey().toSecretKey("AES");
            }
        }
        return null;
    }

    @Deprecated
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr) throws JOSEException {
        return encrypt(jWEHeader, bArr, AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws JOSEException {
        JWEEncrypter x25519Encrypter;
        Payload payload;
        if (bArr2 == null) {
            throw new JOSEException("Missing JWE additional authenticated data (AAD)");
        }
        SecretKey cek = getCEK(jWEHeader.getEncryptionMethod());
        Payload payload2 = new Payload(bArr);
        List<Object> newJSONArray = JSONArrayUtils.newJSONArray();
        Base64URL base64URL = null;
        Base64URL base64URL2 = null;
        Base64URL base64URL3 = null;
        Base64URL base64URL4 = null;
        for (JWK jwk : this.keys.getKeys()) {
            KeyType keyType = jwk.getKeyType();
            Map<String, Object> jSONObject = jwk.toJSONObject();
            UnprotectedHeader.Builder builder = new UnprotectedHeader.Builder();
            String[] strArr = RECIPIENT_HEADER_PARAMS;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i;
                String str = strArr[i2];
                if (jSONObject.containsKey(str)) {
                    payload = payload2;
                    builder.param(str, jSONObject.get(str));
                } else {
                    payload = payload2;
                }
                i = i2 + 1;
                payload2 = payload;
            }
            Payload payload3 = payload2;
            try {
                JWEHeader jWEHeader2 = (JWEHeader) jWEHeader.join(builder.build());
                JWEAlgorithm algorithmAndEnsureNotNull = JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader2);
                if (KeyType.RSA.equals(keyType) && RSAEncrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new RSAEncrypter(jwk.toRSAKey().toRSAPublicKey(), cek);
                } else if (KeyType.EC.equals(keyType) && ECDHEncrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new ECDHEncrypter(jwk.toECKey().toECPublicKey(), cek);
                } else if (KeyType.OCT.equals(keyType) && AESEncrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new AESEncrypter(jwk.toOctetSequenceKey().toSecretKey("AES"), cek);
                } else if (KeyType.OCT.equals(keyType) && DirectEncrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new DirectEncrypter(jwk.toOctetSequenceKey().toSecretKey("AES"));
                } else if (KeyType.OKP.equals(keyType) && X25519Encrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new X25519Encrypter(jwk.toOctetKeyPair().toPublicJWK(), cek);
                } else {
                    payload2 = payload3;
                }
                JWECryptoParts encrypt = x25519Encrypter.encrypt(jWEHeader2, payload3.toBytes(), bArr2);
                Map<String, Object> jSONObject2 = encrypt.getHeader().toJSONObject();
                Iterator<String> it = jWEHeader.getIncludedParams().iterator();
                while (it.hasNext()) {
                    jSONObject2.remove(it.next());
                }
                Map<String, Object> newJSONObject = JSONObjectUtils.newJSONObject();
                newJSONObject.put("header", jSONObject2);
                if (!JWEAlgorithm.DIR.equals(algorithmAndEnsureNotNull)) {
                    newJSONObject.put("encrypted_key", encrypt.getEncryptedKey().toString());
                }
                newJSONArray.add(newJSONObject);
                if (newJSONArray.size() == 1) {
                    payload2 = new Payload("");
                    base64URL = encrypt.getEncryptedKey();
                    Base64URL initializationVector = encrypt.getInitializationVector();
                    Base64URL cipherText = encrypt.getCipherText();
                    base64URL4 = encrypt.getAuthenticationTag();
                    base64URL2 = initializationVector;
                    base64URL3 = cipherText;
                } else {
                    payload2 = payload3;
                }
            } catch (Exception e) {
                throw new JOSEException(e.getMessage(), e);
            }
        }
        if (newJSONArray.size() > 1) {
            Map<String, Object> newJSONObject2 = JSONObjectUtils.newJSONObject();
            newJSONObject2.put("recipients", newJSONArray);
            base64URL = Base64URL.encode(JSONObjectUtils.toJSONString(newJSONObject2));
        }
        return new JWECryptoParts(jWEHeader, base64URL, base64URL2, base64URL3, base64URL4);
    }
}
