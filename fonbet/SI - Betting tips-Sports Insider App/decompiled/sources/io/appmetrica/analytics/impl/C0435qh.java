package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0435qh extends Rg {
    public C0435qh(X4 x42) {
        super(x42);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NonNull P5 p52) {
        ((C0273k5) this.f12818a.f13156p).e();
        Rk rk = this.f12818a.j;
        synchronized (rk) {
            try {
                Dk b10 = rk.b(p52);
                if (b10.f12159g) {
                    b10.f12159g = false;
                    Uk uk = b10.f12154b;
                    uk.a(Uk.f12989i, Boolean.FALSE);
                    uk.b();
                }
                if (rk.f12827g != 1) {
                    rk.b(rk.f12826f, p52);
                }
                rk.f12827g = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
