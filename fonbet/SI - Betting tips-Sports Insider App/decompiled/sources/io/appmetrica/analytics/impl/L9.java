package io.appmetrica.analytics.impl;

import android.util.Base64;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class L9 implements G8 {
    @Override // io.appmetrica.analytics.impl.G8
    public final C0650z8 a(P5 p52) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.G8
    public final byte[] a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public final I8 a() {
        return I8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
