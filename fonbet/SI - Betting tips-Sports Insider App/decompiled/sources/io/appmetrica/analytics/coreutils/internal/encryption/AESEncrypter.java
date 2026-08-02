package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* renamed from: a, reason: collision with root package name */
    private final String f11704a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f11705b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f11706c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f11704a = str;
        this.f11705b = bArr;
        this.f11706c = bArr2;
    }

    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(@NonNull byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(@NonNull byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f11705b, "AES");
            Cipher cipher = Cipher.getInstance(this.f11704a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f11706c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getAlgorithm() {
        return this.f11704a;
    }

    public byte[] getIV() {
        return this.f11706c;
    }

    public byte[] getPassword() {
        return this.f11705b;
    }

    public byte[] decrypt(@NonNull byte[] bArr, int i5, int i10) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f11705b, "AES");
            Cipher cipher = Cipher.getInstance(this.f11704a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f11706c));
            return cipher.doFinal(bArr, i5, i10);
        } catch (Throwable unused) {
            return null;
        }
    }
}
