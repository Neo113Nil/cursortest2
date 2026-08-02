package com.nimbusds.jose;

import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.jcip.annotations.Immutable;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
/* loaded from: classes8.dex */
public class JWEObjectJSON extends JOSEObjectJSON {
    private static final long serialVersionUID = 1;
    private final byte[] aad;
    private Base64URL authTag;
    private Base64URL cipherText;
    private final JWEHeader header;
    private Base64URL iv;
    private final List<Recipient> recipients;
    private JWEObject.State state;
    private UnprotectedHeader unprotectedHeader;

    @Immutable
    public static final class Recipient {
        private final Base64URL encryptedKey;
        private final UnprotectedHeader unprotectedHeader;

        public Recipient(UnprotectedHeader unprotectedHeader, Base64URL base64URL) {
            this.unprotectedHeader = unprotectedHeader;
            this.encryptedKey = base64URL;
        }

        public UnprotectedHeader getUnprotectedHeader() {
            return this.unprotectedHeader;
        }

        public Base64URL getEncryptedKey() {
            return this.encryptedKey;
        }

        public Map<String, Object> toJSONObject() {
            Map<String, Object> newJSONObject = JSONObjectUtils.newJSONObject();
            UnprotectedHeader unprotectedHeader = this.unprotectedHeader;
            if (unprotectedHeader != null && !unprotectedHeader.getIncludedParams().isEmpty()) {
                newJSONObject.put("header", this.unprotectedHeader.toJSONObject());
            }
            Base64URL base64URL = this.encryptedKey;
            if (base64URL != null) {
                newJSONObject.put("encrypted_key", base64URL.toString());
            }
            return newJSONObject;
        }

        public static Recipient parse(Map<String, Object> map) throws ParseException {
            return new Recipient(UnprotectedHeader.parse(JSONObjectUtils.getJSONObject(map, "header")), JSONObjectUtils.getBase64URL(map, "encrypted_key"));
        }
    }

    public JWEObjectJSON(JWEObject jWEObject) {
        super(jWEObject.getPayload());
        LinkedList linkedList = new LinkedList();
        this.recipients = linkedList;
        this.header = jWEObject.getHeader();
        this.aad = null;
        this.iv = jWEObject.getIV();
        this.cipherText = jWEObject.getCipherText();
        this.authTag = jWEObject.getAuthTag();
        if (jWEObject.getState() == JWEObject.State.ENCRYPTED) {
            linkedList.add(new Recipient(null, jWEObject.getEncryptedKey()));
            this.state = JWEObject.State.ENCRYPTED;
        } else if (jWEObject.getState() == JWEObject.State.DECRYPTED) {
            linkedList.add(new Recipient(null, jWEObject.getEncryptedKey()));
            this.state = JWEObject.State.DECRYPTED;
        } else {
            this.state = JWEObject.State.UNENCRYPTED;
        }
    }

    public JWEObjectJSON(JWEHeader jWEHeader, Payload payload) {
        this(jWEHeader, payload, null, null);
    }

    public JWEObjectJSON(JWEHeader jWEHeader, Payload payload, UnprotectedHeader unprotectedHeader, byte[] bArr) {
        super(payload);
        this.recipients = new LinkedList();
        if (jWEHeader == null) {
            throw new IllegalArgumentException("The JWE protected header must not be null");
        }
        this.header = jWEHeader;
        if (payload == null) {
            throw new IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
        this.unprotectedHeader = unprotectedHeader;
        this.aad = bArr;
        this.cipherText = null;
        this.state = JWEObject.State.UNENCRYPTED;
    }

    public JWEObjectJSON(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, List<Recipient> list, UnprotectedHeader unprotectedHeader, byte[] bArr) {
        super(null);
        LinkedList linkedList = new LinkedList();
        this.recipients = linkedList;
        if (jWEHeader == null) {
            throw new IllegalArgumentException("The JWE protected header must not be null");
        }
        if (base64URL == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.header = jWEHeader;
        linkedList.addAll(list);
        this.unprotectedHeader = unprotectedHeader;
        this.aad = bArr;
        this.iv = base64URL2;
        this.cipherText = base64URL;
        this.authTag = base64URL3;
        this.state = JWEObject.State.ENCRYPTED;
    }

    public JWEHeader getHeader() {
        return this.header;
    }

    public UnprotectedHeader getUnprotectedHeader() {
        return this.unprotectedHeader;
    }

    public Base64URL getEncryptedKey() {
        if (this.recipients.isEmpty()) {
            return null;
        }
        if (this.recipients.size() == 1) {
            return this.recipients.get(0).getEncryptedKey();
        }
        List<Object> newJSONArray = JSONArrayUtils.newJSONArray();
        Iterator<Recipient> it = this.recipients.iterator();
        while (it.hasNext()) {
            newJSONArray.add(it.next().toJSONObject());
        }
        Map<String, Object> newJSONObject = JSONObjectUtils.newJSONObject();
        newJSONObject.put("recipients", newJSONArray);
        return Base64URL.encode(JSONObjectUtils.toJSONString(newJSONObject));
    }

    public Base64URL getIV() {
        return this.iv;
    }

    public Base64URL getCipherText() {
        return this.cipherText;
    }

    public Base64URL getAuthTag() {
        return this.authTag;
    }

    public byte[] getAAD() {
        StringBuilder sb = new StringBuilder(this.header.toBase64URL().toString());
        byte[] bArr = this.aad;
        if (bArr != null && bArr.length > 0) {
            sb.append(".");
            sb.append(new String(this.aad, StandardCharsets.US_ASCII));
        }
        return sb.toString().getBytes(StandardCharsets.US_ASCII);
    }

    public List<Recipient> getRecipients() {
        return Collections.unmodifiableList(this.recipients);
    }

    public JWEObject.State getState() {
        return this.state;
    }

    private void ensureUnencryptedState() {
        if (this.state != JWEObject.State.UNENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    private void ensureEncryptedState() {
        if (this.state != JWEObject.State.ENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted state");
        }
    }

    private void ensureEncryptedOrDecryptedState() {
        if (this.state != JWEObject.State.ENCRYPTED && this.state != JWEObject.State.DECRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    private void ensureJWEEncrypterSupport(JWEEncrypter jWEEncrypter) throws JOSEException {
        if (!jWEEncrypter.supportedJWEAlgorithms().contains(getHeader().getAlgorithm())) {
            throw new JOSEException("The " + getHeader().getAlgorithm() + " algorithm is not supported by the JWE encrypter: Supported algorithms: " + jWEEncrypter.supportedJWEAlgorithms());
        }
        if (jWEEncrypter.supportedEncryptionMethods().contains(getHeader().getEncryptionMethod())) {
            return;
        }
        throw new JOSEException("The " + getHeader().getEncryptionMethod() + " encryption method or key size is not supported by the JWE encrypter: Supported methods: " + jWEEncrypter.supportedEncryptionMethods());
    }

    public synchronized void encrypt(JWEEncrypter jWEEncrypter) throws JOSEException {
        ensureUnencryptedState();
        ensureJWEEncrypterSupport(jWEEncrypter);
        getHeader();
        try {
            JWEHeader jWEHeader = (JWEHeader) getHeader().join(this.unprotectedHeader);
            JWECryptoParts encrypt = jWEEncrypter.encrypt(jWEHeader, getPayload().toBytes(), getAAD());
            Base64URL encryptedKey = encrypt.getEncryptedKey();
            try {
                for (Map<String, Object> map : JSONObjectUtils.getJSONObjectArray(JSONObjectUtils.parse(encryptedKey.decodeToString()), "recipients")) {
                    this.recipients.add(Recipient.parse(map));
                }
            } catch (Exception unused) {
                Map<String, Object> jSONObject = encrypt.getHeader().toJSONObject();
                for (String str : jWEHeader.getIncludedParams()) {
                    if (jSONObject.containsKey(str)) {
                        jSONObject.remove(str);
                    }
                }
                try {
                    this.recipients.add(new Recipient(UnprotectedHeader.parse(jSONObject), encryptedKey));
                } catch (Exception e) {
                    throw new JOSEException(e.getMessage(), e);
                }
            }
            this.iv = encrypt.getInitializationVector();
            this.cipherText = encrypt.getCipherText();
            this.authTag = encrypt.getAuthenticationTag();
            this.state = JWEObject.State.ENCRYPTED;
        } catch (JOSEException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new JOSEException(e3.getMessage(), e3);
        }
    }

    public synchronized void decrypt(JWEDecrypter jWEDecrypter) throws JOSEException {
        ensureEncryptedState();
        try {
            setPayload(new Payload(jWEDecrypter.decrypt(getHeader(), getEncryptedKey(), getIV(), getCipherText(), getAuthTag(), getAAD())));
            this.state = JWEObject.State.DECRYPTED;
        } catch (JOSEException e) {
            throw e;
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    private Map<String, Object> toBaseJSONObject() {
        Map<String, Object> newJSONObject = JSONObjectUtils.newJSONObject();
        newJSONObject.put("protected", this.header.toBase64URL().toString());
        if (this.aad != null) {
            newJSONObject.put("aad", new String(this.aad, StandardCharsets.US_ASCII));
        }
        newJSONObject.put("ciphertext", this.cipherText.toString());
        newJSONObject.put(HeaderParameterNames.INITIALIZATION_VECTOR, this.iv.toString());
        newJSONObject.put("tag", this.authTag.toString());
        return newJSONObject;
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public Map<String, Object> toGeneralJSONObject() {
        ensureEncryptedOrDecryptedState();
        if (this.recipients.isEmpty() || (this.recipients.get(0).getUnprotectedHeader() == null && this.recipients.get(0).getEncryptedKey() == null)) {
            throw new IllegalStateException("The general JWE JSON serialization requires at least one recipient");
        }
        Map<String, Object> baseJSONObject = toBaseJSONObject();
        UnprotectedHeader unprotectedHeader = this.unprotectedHeader;
        if (unprotectedHeader != null) {
            baseJSONObject.put("unprotected", unprotectedHeader.toJSONObject());
        }
        List<Object> newJSONArray = JSONArrayUtils.newJSONArray();
        Iterator<Recipient> it = this.recipients.iterator();
        while (it.hasNext()) {
            newJSONArray.add(it.next().toJSONObject());
        }
        baseJSONObject.put("recipients", newJSONArray);
        return baseJSONObject;
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public Map<String, Object> toFlattenedJSONObject() {
        ensureEncryptedOrDecryptedState();
        if (this.recipients.size() != 1) {
            throw new IllegalStateException("The flattened JWE JSON serialization requires exactly one recipient");
        }
        Map<String, Object> baseJSONObject = toBaseJSONObject();
        Map<String, Object> newJSONObject = JSONObjectUtils.newJSONObject();
        if (this.recipients.get(0).getUnprotectedHeader() != null) {
            newJSONObject.putAll(this.recipients.get(0).getUnprotectedHeader().toJSONObject());
        }
        UnprotectedHeader unprotectedHeader = this.unprotectedHeader;
        if (unprotectedHeader != null) {
            newJSONObject.putAll(unprotectedHeader.toJSONObject());
        }
        if (newJSONObject.size() > 0) {
            baseJSONObject.put("unprotected", newJSONObject);
        }
        if (this.recipients.get(0).getEncryptedKey() != null) {
            baseJSONObject.put("encrypted_key", this.recipients.get(0).getEncryptedKey().toString());
        }
        return baseJSONObject;
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public String serializeGeneral() {
        return JSONObjectUtils.toJSONString(toGeneralJSONObject());
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public String serializeFlattened() {
        return JSONObjectUtils.toJSONString(toFlattenedJSONObject());
    }

    public static JWEObjectJSON parse(Map<String, Object> map) throws ParseException {
        if (map == null) {
            throw new IllegalArgumentException("The JSON object must not be null");
        }
        if (!map.containsKey("protected")) {
            throw new ParseException("The JWE protected header mast be present", 0);
        }
        LinkedList linkedList = new LinkedList();
        JWEHeader parse = JWEHeader.parse(JSONObjectUtils.getBase64URL(map, "protected"));
        UnprotectedHeader parse2 = UnprotectedHeader.parse(JSONObjectUtils.getJSONObject(map, "unprotected"));
        Base64URL base64URL = JSONObjectUtils.getBase64URL(map, "ciphertext");
        Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, HeaderParameterNames.INITIALIZATION_VECTOR);
        Base64URL base64URL3 = JSONObjectUtils.getBase64URL(map, "tag");
        Base64URL base64URL4 = JSONObjectUtils.getBase64URL(map, "aad");
        JWEHeader jWEHeader = (JWEHeader) parse.join(parse2);
        if (map.containsKey("recipients")) {
            Map<String, Object>[] jSONObjectArray = JSONObjectUtils.getJSONObjectArray(map, "recipients");
            if (jSONObjectArray == null || jSONObjectArray.length == 0) {
                throw new ParseException("The \"recipients\" member must be present in general JSON Serialization", 0);
            }
            for (Map<String, Object> map2 : jSONObjectArray) {
                Recipient parse3 = Recipient.parse(map2);
                try {
                    HeaderValidation.ensureDisjoint(jWEHeader, parse3.getUnprotectedHeader());
                    linkedList.add(parse3);
                } catch (IllegalHeaderException e) {
                    throw new ParseException(e.getMessage(), 0);
                }
            }
        } else {
            linkedList.add(new Recipient(null, JSONObjectUtils.getBase64URL(map, "encrypted_key")));
        }
        return new JWEObjectJSON(parse, base64URL, base64URL2, base64URL3, linkedList, parse2, base64URL4 != null ? base64URL4.toString().getBytes(StandardCharsets.US_ASCII) : null);
    }

    public static JWEObjectJSON parse(String str) throws ParseException {
        if (str == null) {
            throw new IllegalArgumentException("The JSON object string must not be null");
        }
        return parse(JSONObjectUtils.parse(str));
    }
}
