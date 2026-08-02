package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035b implements G8 {

    /* renamed from: a, reason: collision with root package name */
    public final AESEncrypter f13363a;

    public C0035b() {
        this(new C0009a(C0353na.k().g()));
    }

    @Override // io.appmetrica.analytics.impl.G8
    @NonNull
    public final C0650z8 a(@NonNull P5 p52) {
        byte[] encrypt;
        String encodeToString;
        String value = p52.getValue();
        if (!TextUtils.isEmpty(value)) {
            try {
                encrypt = this.f13363a.encrypt(value.getBytes("UTF-8"));
            } catch (Throwable unused) {
            }
            if (encrypt != null) {
                encodeToString = Base64.encodeToString(encrypt, 0);
                p52.setValue(encodeToString);
                return new C0650z8(p52, I8.AES_VALUE_ENCRYPTION);
            }
        }
        encodeToString = null;
        p52.setValue(encodeToString);
        return new C0650z8(p52, I8.AES_VALUE_ENCRYPTION);
    }

    public C0035b(C0009a c0009a) {
        this(new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c0009a.b(), c0009a.a()));
    }

    public C0035b(AESEncrypter aESEncrypter) {
        this.f13363a = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.impl.G8
    @NonNull
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr != null && bArr.length > 0) {
            try {
                return this.f13363a.decrypt(Base64.decode(bArr, 0));
            } catch (Throwable unused) {
            }
        }
        return bArr2;
    }

    @NonNull
    public final I8 a() {
        return I8.AES_VALUE_ENCRYPTION;
    }
}
