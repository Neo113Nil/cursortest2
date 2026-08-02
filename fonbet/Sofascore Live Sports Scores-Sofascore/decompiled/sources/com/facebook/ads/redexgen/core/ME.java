package com.facebook.ads.redexgen.core;

import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class ME extends AbstractC2215Zd {
    public static String[] A03 = {"ps9u6Kn8p", "fRCCllxRFm9XYnsS5Nz0CDYYbd8rz98F", "veZY5LUK4HkumILqtvhVtf9OT9QK1Jmh", "8c6Edyt19YE2bwpDp37rWBgdyfN4I4si", "Dgwj6SSLqT", "biYcUlACC5CMDg3zbjwwDR7mq5XP76DA", "rp5V5gFYHfFnaijOqqdMDMWavMrEx7HP", "ycj43TNZcka4uMSCxDz6fuqQ2r9gi3g6"};
    public static final int A04 = (int) (XX.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C1942Og A01;
    public final C2652gi A02;

    public ME(C2652gi c2652gi, VA va, String str, C1922Nm c1922Nm, InterfaceC2194Yi interfaceC2194Yi, InterfaceC2193Yh interfaceC2193Yh) {
        super(c2652gi, va, str, c1922Nm, interfaceC2194Yi, interfaceC2193Yh);
        this.A02 = c2652gi;
        this.A01 = AbstractC1943Oh.A00(c2652gi.A02());
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        YB.A0N(this.A00, -1728053248);
        if (C2102Up.A2b(c2652gi)) {
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Zi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ME.this.A0T(view);
                }
            });
        }
    }

    public static RelativeLayout.LayoutParams A00(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A01() {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2215Zd
    public final void A0O() {
        C1946Ok A0A = this.A01.A0A();
        C2230Zs c2230Zs = new C2230Zs(this.A02);
        c2230Zs.setInfo(YM.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c2230Zs.setOnClickListener(new ViewOnClickListenerC2221Zj(this));
        C1946Ok A0B = this.A01.A0B();
        C2230Zs c2230Zs2 = new C2230Zs(this.A02);
        c2230Zs2.setInfo(YM.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c2230Zs2.setOnClickListener(new ViewOnClickListenerC2222Zk(this));
        C2230Zs c2230Zs3 = new C2230Zs(this.A02);
        c2230Zs3.setInfo(YM.AD_CHOICES_ICON, this.A01.A0M(), "");
        c2230Zs3.setOnClickListener(new ViewOnClickListenerC2223Zl(this));
        LinearLayout.LayoutParams itemParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(A04 * 2, A04, A04 * 2, A04);
        YB.A0N(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(c2230Zs, itemParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(c2230Zs2, itemParams);
        }
        linearLayout.addView(c2230Zs3, itemParams);
        A01();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A00(false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2215Zd
    public final void A0P() {
        this.A00.removeAllViews();
        YB.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2215Zd
    public final void A0Q(C1946Ok c1946Ok, EnumC1944Oi enumC1944Oi) {
        String A0E;
        int i;
        String str;
        if (enumC1944Oi == EnumC1944Oi.A05) {
            return;
        }
        boolean z = enumC1944Oi == EnumC1944Oi.A06;
        C2212Za c2212Za = new C2212Za(this.A02, this.A0D);
        if (z) {
            C1942Og c1942Og = this.A01;
            if (A03[4].length() != 10) {
                throw new RuntimeException();
            }
            A03[6] = "KfE81dulHFmzGO7NxqDM7oaE1pV2dKkX";
            A0E = c1942Og.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        C2212Za A0D = c2212Za.A0H(A0E).A0G(this.A01.A0D()).A0E(c1946Ok.A04()).A0D(z ? YM.REPORT_AD : YM.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        C2212Za A0C = A0D.A0C(i);
        if (this.A0C != null) {
            C1922Nm c1922Nm = this.A0C;
            if (A03[1].charAt(11) != 'X') {
                str = c1922Nm.A01();
            } else {
                A03[0] = "vLdx3pZGf";
                str = c1922Nm.A01();
            }
        } else {
            str = "";
        }
        C2213Zb adHiddenView = A0C.A0F(str).A0L();
        YB.A0N(adHiddenView, -1);
        YB.A0W(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A00(true));
        super.A0Q(c1946Ok, enumC1944Oi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2215Zd
    public final void A0R(C1946Ok c1946Ok, EnumC1944Oi enumC1944Oi) {
        String A0H;
        boolean z = enumC1944Oi == EnumC1944Oi.A06;
        C2652gi c2652gi = this.A02;
        InterfaceC2217Zf interfaceC2217Zf = this.A0D;
        if (z) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        C2233Zv c2233Zv = new C2233Zv(c2652gi, c1946Ok, interfaceC2217Zf, A0H, z ? YM.REPORT_AD : YM.HIDE_AD);
        c2233Zv.setClickable(true);
        YB.A0N(c2233Zv, -1);
        c2233Zv.setPadding(A04 * 2, A04, A04 * 2, A04);
        A01();
        this.A00.removeAllViews();
        RelativeLayout relativeLayout = this.A00;
        String[] strArr = A03;
        if (strArr[3].charAt(9) == strArr[5].charAt(9)) {
            throw new RuntimeException();
        }
        A03[1] = "OoQvJ70CiRWXlhIiWSDPNsGTFrOY4nX1";
        relativeLayout.addView(c2233Zv, A00(false));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2215Zd
    public final boolean A0S() {
        return false;
    }

    public final /* synthetic */ void A0T(View view) {
        this.A0D.A54();
    }
}
