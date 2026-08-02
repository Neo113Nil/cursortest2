package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Dg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC1659Dg extends RelativeLayout implements InterfaceC2540eu, View.OnClickListener {
    public C1689Ek A00;
    public final EA A01;
    public final E4 A02;
    public final E2 A03;
    public final E0 A04;
    public final C2564fI A05;
    public static final int A07 = (int) (XX.A02 * 16.0f);
    public static final int A06 = (int) (XX.A02 * 6.0f);

    public ViewOnClickListenerC1659Dg(C2652gi c2652gi) {
        super(c2652gi);
        this.A04 = new E0() { // from class: com.facebook.ads.redexgen.X.3a
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E1 e1) {
                ViewOnClickListenerC1659Dg.this.setVisibility(0);
            }
        };
        this.A02 = new E4() { // from class: com.facebook.ads.redexgen.X.3Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4B c4b) {
                C2564fI c2564fI;
                c2564fI = ViewOnClickListenerC1659Dg.this.A05;
                c2564fI.setChecked(true);
            }
        };
        this.A03 = new E2() { // from class: com.facebook.ads.redexgen.X.3Y
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(E3 e3) {
                C2564fI c2564fI;
                c2564fI = ViewOnClickListenerC1659Dg.this.A05;
                c2564fI.setChecked(false);
            }
        };
        this.A01 = new EA() { // from class: com.facebook.ads.redexgen.X.3X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.UN
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C4K c4k) {
                C2564fI c2564fI;
                c2564fI = ViewOnClickListenerC1659Dg.this.A05;
                c2564fI.setChecked(true);
            }
        };
        YB.A0V(this, YB.A06(855638016, A06));
        this.A05 = new C2564fI(c2652gi, true);
        this.A05.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A07, A07);
        layoutParams.addRule(13);
        setVisibility(8);
        addView(this.A05, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540eu
    public final void AAv(C1689Ek c1689Ek) {
        this.A00 = c1689Ek;
        setOnClickListener(this);
        this.A05.setOnClickListener(this);
        if (this.A00 != null) {
            this.A00.getEventBus().A03(this.A04, this.A01, this.A02, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2540eu
    public final void AKV(C1689Ek c1689Ek) {
        if (this.A00 != null) {
            this.A00.getEventBus().A04(this.A03, this.A02, this.A01, this.A04);
        }
        setOnClickListener(null);
        this.A05.setOnClickListener(null);
        this.A00 = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                return;
            }
            if (this.A00.getState() == EnumC2594fm.A07 || this.A00.getState() == EnumC2594fm.A05 || this.A00.getState() == EnumC2594fm.A06) {
                this.A00.A0e(EnumC2539et.A04, 11);
            } else if (this.A00.getState() == EnumC2594fm.A0A) {
                this.A00.A0i(true, 7);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A05.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A05.setPlayAccessibilityLabel(str);
    }
}
