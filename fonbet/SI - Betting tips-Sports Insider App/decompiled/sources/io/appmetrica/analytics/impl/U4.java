package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class U4 extends T4 {
    public U4(@NotNull X4 x42) {
        super(x42);
    }

    @Override // io.appmetrica.analytics.impl.T4
    public final boolean b(int i5) {
        return i5 < 113;
    }

    @Override // io.appmetrica.analytics.impl.T4
    public final void c() {
        We we2 = this.f12902a.f13144c;
        try {
            Uk uk = new Uk(we2, C0644z2.f14985g);
            Long a7 = uk.f12992c.a(Uk.f12984d);
            if (a7 != null) {
                uk.a(Uk.f12984d, Long.valueOf(TimeUnit.SECONDS.toMillis(a7.longValue())));
            }
            Long a10 = uk.f12992c.a(Uk.f12985e);
            if (a10 != null) {
                uk.a(Uk.f12985e, Long.valueOf(TimeUnit.SECONDS.toMillis(a10.longValue())));
            }
        } catch (Throwable unused) {
        }
        try {
            Uk uk2 = new Uk(we2, C0201ha.f13893g);
            Long a11 = uk2.f12992c.a(Uk.f12984d);
            if (a11 != null) {
                uk2.a(Uk.f12984d, Long.valueOf(TimeUnit.SECONDS.toMillis(a11.longValue())));
            }
            Long a12 = uk2.f12992c.a(Uk.f12985e);
            if (a12 != null) {
                uk2.a(Uk.f12985e, Long.valueOf(TimeUnit.SECONDS.toMillis(a12.longValue())));
            }
        } catch (Throwable unused2) {
        }
    }
}
