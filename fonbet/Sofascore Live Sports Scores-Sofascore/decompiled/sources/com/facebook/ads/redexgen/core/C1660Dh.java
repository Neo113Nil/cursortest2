package com.facebook.ads.redexgen.core;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: com.facebook.ads.redexgen.X.Dh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1660Dh implements InterfaceC2540eu {
    public View A00;
    public C1689Ek A01;
    public EnumC2555f9 A02;
    public boolean A03;
    public final Handler A04;
    public final EA A05;
    public final E4 A06;
    public final E2 A07;
    public final AbstractC1672Dt A08;
    public final boolean A09;
    public final boolean A0A;

    public C1660Dh(View view, EnumC2555f9 enumC2555f9, boolean z) {
        this(view, enumC2555f9, z, false);
    }

    public C1660Dh(View view, EnumC2555f9 enumC2555f9, boolean z, boolean z2) {
        this.A06 = new E4() { // from class: com.facebook.ads.redexgen.X.3p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4B c4b) {
                C1660Dh.this.A06(1, 0);
            }
        };
        this.A07 = new E2() { // from class: com.facebook.ads.redexgen.X.3n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e3) {
                boolean z3;
                EnumC2555f9 enumC2555f92;
                boolean z4;
                z3 = C1660Dh.this.A03;
                if (!z3) {
                    return;
                }
                enumC2555f92 = C1660Dh.this.A02;
                if (enumC2555f92 != EnumC2555f9.A02) {
                    z4 = C1660Dh.this.A09;
                    if (!z4) {
                        C1660Dh.this.A06(0, 8);
                        return;
                    }
                }
                C1660Dh.this.A02 = null;
                C1660Dh.this.A05();
            }
        };
        this.A05 = new EA() { // from class: com.facebook.ads.redexgen.X.3e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                EnumC2555f9 enumC2555f92;
                View view2;
                View view3;
                enumC2555f92 = C1660Dh.this.A02;
                if (enumC2555f92 == EnumC2555f9.A03) {
                    return;
                }
                view2 = C1660Dh.this.A00;
                view2.setAlpha(1.0f);
                view3 = C1660Dh.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C14163c(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, enumC2555f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(500L).setListener(new C2554f8(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC2555f9 enumC2555f9) {
        this.A02 = enumC2555f9;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC2555f9 == EnumC2555f9.A03) {
            this.A00.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.A00.setVisibility(8);
        } else {
            this.A00.setAlpha(1.0f);
            this.A00.setVisibility(0);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540eu
    public final void AAv(C1689Ek c1689Ek) {
        this.A01 = c1689Ek;
        c1689Ek.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540eu
    public final void AKV(C1689Ek c1689Ek) {
        A06(1, 0);
        c1689Ek.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
