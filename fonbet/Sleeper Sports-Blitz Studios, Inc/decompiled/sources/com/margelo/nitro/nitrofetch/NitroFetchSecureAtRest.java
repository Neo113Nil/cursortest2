package com.margelo.nitro.nitrofetch;

import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.stats.CodePackage;
import com.nimbusds.jose.HeaderParameterNames;
import java.security.KeyStore;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: NativeStorage.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005J\u0016\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroFetchSecureAtRest;", "", "<init>", "()V", "PREFS_NAME", "", "KEYSTORE_ALIAS", "ANDROID_KEYSTORE", "TRANSFORMATION", "GCM_IV_LENGTH", "", "GCM_TAG_BITS", "ENC_PREFIX", "keyStore", "Ljava/security/KeyStore;", "getOrCreateSecretKey", "Ljavax/crypto/SecretKey;", "encrypt", "plaintext", "decrypt", HeaderParameterNames.BASE64_URL_ENCODE_PAYLOAD, "getDecryptedForPrefs", "prefs", "Landroid/content/SharedPreferences;", SDKConstants.PARAM_KEY, "putEncrypted", "", "plain", "removeFromPrefs", "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroFetchSecureAtRest {
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    public static final String ENC_PREFIX = "nfc1:";
    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_BITS = 128;
    public static final NitroFetchSecureAtRest INSTANCE = new NitroFetchSecureAtRest();
    private static final String KEYSTORE_ALIAS = "nitro_fetch_aes_gcm_v1";
    public static final String PREFS_NAME = "nitro_fetch_storage";
    private static final String TRANSFORMATION = "AES/GCM/NoPadding";

    private NitroFetchSecureAtRest() {
    }

    private final KeyStore keyStore() {
        KeyStore keyStore = KeyStore.getInstance(ANDROID_KEYSTORE);
        keyStore.load(null);
        Intrinsics.checkNotNullExpressionValue(keyStore, "apply(...)");
        return keyStore;
    }

    private final SecretKey getOrCreateSecretKey() {
        KeyStore keyStore = keyStore();
        if (keyStore.containsAlias(KEYSTORE_ALIAS)) {
            KeyStore.Entry entry = keyStore.getEntry(KEYSTORE_ALIAS, null);
            Intrinsics.checkNotNull(entry, "null cannot be cast to non-null type java.security.KeyStore.SecretKeyEntry");
            SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
            Intrinsics.checkNotNullExpressionValue(secretKey, "getSecretKey(...)");
            return secretKey;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", ANDROID_KEYSTORE);
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(KEYSTORE_ALIAS, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        keyGenerator.init(build);
        SecretKey generateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(generateKey, "generateKey(...)");
        return generateKey;
    }

    private final String encrypt(String plaintext) {
        SecretKey orCreateSecretKey = getOrCreateSecretKey();
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(1, orCreateSecretKey);
        byte[] iv = cipher.getIV();
        byte[] bytes = plaintext.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] doFinal = cipher.doFinal(bytes);
        byte[] bArr = new byte[iv.length + doFinal.length];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(doFinal, 0, bArr, iv.length, doFinal.length);
        String encodeToString = Base64.encodeToString(bArr, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    private final String decrypt(String b64) {
        byte[] decode = Base64.decode(b64, 2);
        if (decode.length < 28) {
            throw new IllegalArgumentException("truncated");
        }
        Intrinsics.checkNotNull(decode);
        byte[] copyOfRange = ArraysKt.copyOfRange(decode, 0, 12);
        byte[] copyOfRange2 = ArraysKt.copyOfRange(decode, 12, decode.length);
        SecretKey orCreateSecretKey = getOrCreateSecretKey();
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(2, orCreateSecretKey, new GCMParameterSpec(128, copyOfRange));
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        Intrinsics.checkNotNullExpressionValue(doFinal, "doFinal(...)");
        return new String(doFinal, Charsets.UTF_8);
    }

    public final String getDecryptedForPrefs(SharedPreferences prefs, String key) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(key, "key");
        String string = prefs.getString(key, null);
        if (string == null) {
            return null;
        }
        if (string.length() == 0) {
            return "";
        }
        try {
            if (StringsKt.startsWith$default(string, ENC_PREFIX, false, 2, (Object) null)) {
                String substring = string.substring(5);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                string = decrypt(substring);
            } else {
                putEncrypted(prefs, key, string);
            }
        } catch (Throwable unused) {
        }
        return string;
    }

    public final boolean putEncrypted(SharedPreferences prefs, String key, String plain) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(plain, "plain");
        return prefs.edit().putString(key, ENC_PREFIX + encrypt(plain)).commit();
    }

    public final boolean removeFromPrefs(SharedPreferences prefs, String key) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        Intrinsics.checkNotNullParameter(key, "key");
        return prefs.edit().remove(key).commit();
    }
}
