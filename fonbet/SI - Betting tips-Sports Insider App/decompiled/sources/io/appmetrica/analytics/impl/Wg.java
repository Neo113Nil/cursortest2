package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Wg extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final xo f13107b;

    public Wg(@NonNull X4 x42) {
        this(x42, x42.u());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(@NonNull P5 p52) {
        X4 x42 = this.f12818a;
        if (this.f13107b.c()) {
            return false;
        }
        if (!this.f13107b.d()) {
            C0277k9 c0277k9 = x42.f13154n;
            c0277k9.f14108c.b(P5.a(p52, EnumC0047bb.EVENT_TYPE_FIRST_ACTIVATION));
        }
        xo xoVar = this.f13107b;
        synchronized (xoVar) {
            yo yoVar = xoVar.f14934a;
            yoVar.a(yoVar.a().put("first_event_done", true));
        }
        return false;
    }

    public Wg(X4 x42, xo xoVar) {
        super(x42);
        this.f13107b = xoVar;
    }
}
