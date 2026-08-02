package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.KeyLengthException;
import com.nimbusds.jose.jca.JWEJCAContext;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.ByteUtils;
import com.nimbusds.jose.util.Container;
import com.nimbusds.jose.util.IntegerOverflowException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes8.dex */
public class ContentCryptoProvider {
    public static final Map<Integer, Set<EncryptionMethod>> COMPATIBLE_ENCRYPTION_METHODS;
    public static final Set<EncryptionMethod> SUPPORTED_ENCRYPTION_METHODS;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(EncryptionMethod.A128CBC_HS256);
        linkedHashSet.add(EncryptionMethod.A192CBC_HS384);
        linkedHashSet.add(EncryptionMethod.A256CBC_HS512);
        linkedHashSet.add(EncryptionMethod.A128GCM);
        linkedHashSet.add(EncryptionMethod.A192GCM);
        linkedHashSet.add(EncryptionMethod.A256GCM);
        linkedHashSet.add(EncryptionMethod.A128CBC_HS256_DEPRECATED);
        linkedHashSet.add(EncryptionMethod.A256CBC_HS512_DEPRECATED);
        linkedHashSet.add(EncryptionMethod.XC20P);
        SUPPORTED_ENCRYPTION_METHODS = Collections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(EncryptionMethod.A128GCM);
        hashSet2.add(EncryptionMethod.A192GCM);
        hashSet3.add(EncryptionMethod.A256GCM);
        hashSet3.add(EncryptionMethod.A128CBC_HS256);
        hashSet3.add(EncryptionMethod.A128CBC_HS256_DEPRECATED);
        hashSet3.add(EncryptionMethod.XC20P);
        hashSet4.add(EncryptionMethod.A192CBC_HS384);
        hashSet5.add(EncryptionMethod.A256CBC_HS512);
        hashSet5.add(EncryptionMethod.A256CBC_HS512_DEPRECATED);
        hashMap.put(128, Collections.unmodifiableSet(hashSet));
        hashMap.put(192, Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, Collections.unmodifiableSet(hashSet3));
        hashMap.put(384, Collections.unmodifiableSet(hashSet4));
        hashMap.put(512, Collections.unmodifiableSet(hashSet5));
        COMPATIBLE_ENCRYPTION_METHODS = Collections.unmodifiableMap(hashMap);
    }

    public static SecretKey generateCEK(EncryptionMethod encryptionMethod, SecureRandom secureRandom) throws JOSEException {
        Set<EncryptionMethod> set = SUPPORTED_ENCRYPTION_METHODS;
        if (!set.contains(encryptionMethod)) {
            throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(encryptionMethod, set));
        }
        byte[] bArr = new byte[ByteUtils.byteLength(encryptionMethod.cekBitLength())];
        secureRandom.nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }

    private static void checkCEKLength(SecretKey secretKey, EncryptionMethod encryptionMethod) throws KeyLengthException {
        try {
            int safeBitLength = ByteUtils.safeBitLength(secretKey.getEncoded());
            if (safeBitLength == 0 || encryptionMethod.cekBitLength() == safeBitLength) {
                return;
            }
            throw new KeyLengthException("The Content Encryption Key (CEK) length for " + encryptionMethod + " must be " + encryptionMethod.cekBitLength() + " bits");
        } catch (IntegerOverflowException e) {
            throw new KeyLengthException("The Content Encryption Key (CEK) is too long: " + e.getMessage());
        }
    }

    public static JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, SecretKey secretKey, Base64URL base64URL, JWEJCAContext jWEJCAContext) throws JOSEException {
        return encrypt(jWEHeader, bArr, null, secretKey, base64URL, jWEJCAContext);
    }

    public static JWECryptoParts encrypt(JWEHeader jWEHeader, byte[] bArr, byte[] bArr2, SecretKey secretKey, Base64URL base64URL, JWEJCAContext jWEJCAContext) throws JOSEException {
        JWEHeader jWEHeader2;
        byte[] generateIV;
        AuthenticatedCipherText encryptAuthenticated;
        if (bArr2 == null) {
            return encrypt(jWEHeader, bArr, AAD.compute(jWEHeader), secretKey, base64URL, jWEJCAContext);
        }
        checkCEKLength(secretKey, jWEHeader.getEncryptionMethod());
        byte[] applyCompression = DeflateHelper.applyCompression(jWEHeader, bArr);
        if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
            jWEHeader2 = jWEHeader;
            generateIV = AESCBC.generateIV(jWEJCAContext.getSecureRandom());
            encryptAuthenticated = AESCBC.encryptAuthenticated(secretKey, generateIV, applyCompression, bArr2, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
            jWEHeader2 = jWEHeader;
            Container container = new Container(AESGCM.generateIV(jWEJCAContext.getSecureRandom()));
            encryptAuthenticated = AESGCM.encrypt(secretKey, container, applyCompression, bArr2, jWEJCAContext.getContentEncryptionProvider());
            generateIV = (byte[]) container.get();
        } else {
            if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
                byte[] generateIV2 = AESCBC.generateIV(jWEJCAContext.getSecureRandom());
                encryptAuthenticated = AESCBC.encryptWithConcatKDF(jWEHeader, secretKey, base64URL, generateIV2, applyCompression, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
                generateIV = generateIV2;
            } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.XC20P)) {
                Container container2 = new Container(null);
                encryptAuthenticated = XC20P.encryptAuthenticated(secretKey, container2, applyCompression, bArr2);
                generateIV = (byte[]) container2.get();
            } else {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
            }
            return new JWECryptoParts(jWEHeader, base64URL, Base64URL.encode(generateIV), Base64URL.encode(encryptAuthenticated.getCipherText()), Base64URL.encode(encryptAuthenticated.getAuthenticationTag()));
        }
        jWEHeader = jWEHeader2;
        return new JWECryptoParts(jWEHeader, base64URL, Base64URL.encode(generateIV), Base64URL.encode(encryptAuthenticated.getCipherText()), Base64URL.encode(encryptAuthenticated.getAuthenticationTag()));
    }

    public static byte[] decrypt(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, SecretKey secretKey, JWEJCAContext jWEJCAContext) throws JOSEException {
        return decrypt(jWEHeader, null, base64URL, base64URL2, base64URL3, base64URL4, secretKey, jWEJCAContext);
    }

    public static byte[] decrypt(JWEHeader jWEHeader, byte[] bArr, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, SecretKey secretKey, JWEJCAContext jWEJCAContext) throws JOSEException {
        JWEHeader jWEHeader2;
        byte[] decryptAuthenticated;
        SecretKey secretKey2;
        Base64URL base64URL5;
        if (bArr == null) {
            return decrypt(jWEHeader, AAD.compute(jWEHeader), base64URL, base64URL2, base64URL3, base64URL4, secretKey, jWEJCAContext);
        }
        checkCEKLength(secretKey, jWEHeader.getEncryptionMethod());
        if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192CBC_HS384) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512)) {
            jWEHeader2 = jWEHeader;
            decryptAuthenticated = AESCBC.decryptAuthenticated(secretKey, base64URL2.decode(), base64URL3.decode(), bArr, base64URL4.decode(), jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
        } else {
            if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128GCM) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A192GCM)) {
                jWEHeader2 = jWEHeader;
                secretKey2 = secretKey;
                base64URL5 = base64URL2;
            } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256GCM)) {
                jWEHeader2 = jWEHeader;
                base64URL5 = base64URL2;
                secretKey2 = secretKey;
            } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A128CBC_HS256_DEPRECATED) || jWEHeader.getEncryptionMethod().equals(EncryptionMethod.A256CBC_HS512_DEPRECATED)) {
                jWEHeader2 = jWEHeader;
                decryptAuthenticated = AESCBC.decryptWithConcatKDF(jWEHeader2, secretKey, base64URL, base64URL2, base64URL3, base64URL4, jWEJCAContext.getContentEncryptionProvider(), jWEJCAContext.getMACProvider());
            } else if (jWEHeader.getEncryptionMethod().equals(EncryptionMethod.XC20P)) {
                decryptAuthenticated = XC20P.decryptAuthenticated(secretKey, base64URL2.decode(), base64URL3.decode(), bArr, base64URL4.decode());
                jWEHeader2 = jWEHeader;
            } else {
                throw new JOSEException(AlgorithmSupportMessage.unsupportedEncryptionMethod(jWEHeader.getEncryptionMethod(), SUPPORTED_ENCRYPTION_METHODS));
            }
            decryptAuthenticated = AESGCM.decrypt(secretKey2, base64URL5.decode(), base64URL3.decode(), bArr, base64URL4.decode(), jWEJCAContext.getContentEncryptionProvider());
        }
        return DeflateHelper.applyDecompression(jWEHeader2, decryptAuthenticated);
    }
}
