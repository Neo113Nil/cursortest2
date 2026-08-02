package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079ch extends Rg {
    public C0079ch(@NotNull X4 x42) {
        super(x42);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NotNull P5 p52) {
        Dk dk;
        Tk tk;
        C0277k9 c0277k9 = this.f12818a.f13154n;
        Rk rk = c0277k9.f14108c;
        if (rk.f12827g == 0) {
            dk = rk.f12824d.b();
            Dk b10 = rk.f12825e.b();
            if ((dk == null ? -1L : dk.f12156d) <= (b10 != null ? b10.f12156d : -1L)) {
                dk = b10;
            }
        } else {
            dk = rk.f12826f;
        }
        if (dk != null) {
            tk = new Tk();
            tk.f12936a = dk.f12156d;
            long andIncrement = dk.f12158f.getAndIncrement();
            Uk uk = dk.f12154b;
            uk.a(Uk.f12987g, Long.valueOf(dk.f12158f.get()));
            uk.b();
            tk.f12937b = andIncrement;
            tk.f12938c = TimeUnit.MILLISECONDS.toSeconds(dk.j);
            tk.f12939d = dk.f12155c.f12276a;
        } else {
            long j = p52.j;
            long a7 = rk.f12822b.a();
            L6 l6 = rk.f12821a.f13146e;
            Vk vk = Vk.BACKGROUND;
            l6.a(a7, vk, j);
            tk = new Tk();
            tk.f12936a = a7;
            tk.f12939d = vk;
            tk.f12937b = 0L;
            tk.f12938c = 0L;
        }
        c0277k9.a(p52, tk);
        return false;
    }
}
