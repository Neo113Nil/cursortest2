package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.internal.model.i3;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k0 extends s {
    public final VungleAdSize q;
    public VungleAdSize r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, VungleAdSize vungleAdSize) {
        super(context);
        context.getClass();
        vungleAdSize.getClass();
        this.q = vungleAdSize;
    }

    @Override // com.vungle.ads.internal.s
    public final void a(com.vungle.ads.internal.model.h0 h0Var) {
        h0Var.getClass();
        super.a(h0Var);
        com.vungle.ads.internal.util.s e = e();
        Long a = e != null ? e.a() : null;
        if ((a != null && a.longValue() == 3) || (a != null && a.longValue() == 4)) {
            l();
        }
        if (this.q.getIsAdaptiveWidth() || this.q.getIsAdaptiveHeight()) {
            Pair a2 = com.vungle.ads.internal.util.a0.a(d());
            int intValue = ((Number) a2.a).intValue();
            int intValue2 = ((Number) a2.b).intValue();
            int d = this.q.getIsAdaptiveWidth() ? h0Var.d() : this.q.getWidth();
            int a3 = this.q.getIsAdaptiveHeight() ? h0Var.a() : this.q.getHeight();
            int min = Math.min(intValue, d);
            int min2 = Math.min(intValue2, a3);
            if (this.q.getIsAdaptiveHeight() && this.q.getHeight() > 0) {
                min2 = Math.min(this.q.getHeight(), min2);
            }
            this.r = new VungleAdSize(min, min2);
        }
    }

    @Override // com.vungle.ads.internal.s
    public final VungleAdSize b() {
        return this.q;
    }

    public final VungleAdSize m() {
        return this.r;
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(i3 i3Var) {
        i3Var.getClass();
        return i3Var.e() || i3Var.h() || i3Var.f();
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(VungleAdSize vungleAdSize) {
        if (vungleAdSize != null) {
            return vungleAdSize.isValidSize$vungle_ads_release();
        }
        return false;
    }

    public final j0 a(com.vungle.ads.internal.presenter.b bVar) {
        bVar.getClass();
        return new j0(bVar, this);
    }
}
