package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Z2 extends M2 {
    public Z2(int i5, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i5, str, publicLogger);
    }

    public final int b() {
        return this.f12558a;
    }

    @Override // io.appmetrica.analytics.impl.Ln
    public final byte[] a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i5 = this.f12558a;
            if (length > i5) {
                byte[] bArr2 = new byte[i5];
                System.arraycopy(bArr, 0, bArr2, 0, i5);
                this.f12560c.warning("\"%s\" %s exceeded limit of %d bytes", this.f12559b, bArr, Integer.valueOf(this.f12558a));
                return bArr2;
            }
        }
        return bArr;
    }

    @NonNull
    public final String a() {
        return this.f12559b;
    }
}
