package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.4U, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C4U extends PJ {
    public static byte[] A0A;
    public static String[] A0B = {"HroiSjGkBhlygt0UHqritDnsLvuB4mll", "UPUcpMrNl24qq0HclW9U9iERj7I4qSt3", "AR1kUYImMXSQek2fbhOL", "An1bOYQQ6mWkitzD6HneRzMou2TxbTlk", "bk2AprBMZM1jRI7qHazMlP7Iu4yWRtui", "rxrENBx6Cu3lgzyCTlNUNM4zg8", "bB4G8QrXsE48YFBGJh1Aken7ZdbC0Xcx", "YDFainhA1ZmikU8Mw"};
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public C1728Fy A00;
    public AbstractC2596fo A01;
    public final RelativeLayout A02;
    public final C2058Sx A03;
    public final Y2 A04;
    public final C1J A05;
    public final C2345bj A06;
    public final C2597fp A07;
    public final String A08;
    public final List<C2490e5> A09;

    public static String A0E(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
        }
        return new String(copyOfRange);
    }

    public static void A0H() {
        A0A = new byte[]{75, 83, 81, 72};
    }

    static {
        A0H();
        A0D = (int) (XX.A02 * 48.0f);
        A0E = XV.A0v;
        A0F = (int) (XX.A02 * 8.0f);
        A0H = (int) (XX.A02 * 56.0f);
        A0C = (int) (XX.A02 * 48.0f);
        A0G = (int) (XX.A02 * 12.0f);
    }

    public C4U(C2652gi c2652gi, VA va, C2058Sx c2058Sx, InterfaceC2193Yh interfaceC2193Yh, AbstractC2817jd abstractC2817jd) {
        super(c2652gi, va, interfaceC2193Yh, abstractC2817jd);
        this.A04 = new Y2();
        if (abstractC2817jd instanceof C15277l) {
            super.A09 = true;
            super.A08 = new C2520ea(c2652gi, new MG(), this.A0D.A1G(), interfaceC2193Yh);
        }
        this.A03 = c2058Sx;
        this.A08 = this.A0D.A2E();
        int A0m = this.A0D.A0m();
        this.A01 = A0C();
        int A0n = this.A0D.A0n();
        this.A07 = new C2597fp(this, 1, new WeakReference(this.A01), this.A0E);
        List<NR> A2G = this.A0D.A2G();
        this.A07.A0W(A0m);
        this.A07.A0X(A0n);
        this.A09 = new ArrayList(A2G.size());
        super.A07 = this.A0D.A28();
        A0G();
        this.A02 = new RelativeLayout(this.A0E);
        this.A05 = new C1J(this.A0E);
        this.A05.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        YB.A0K(this.A05);
        this.A06 = new C2345bj(this.A0E, super.A07.A01(), this.A09.size());
        int viewabilityInitialDelayMs = A0F;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, viewabilityInitialDelayMs);
        layoutParams.setMargins(0, A0G, 0, 0);
        layoutParams.addRule(3, this.A05.getId());
        layoutParams.addRule(14);
        this.A06.setLayoutParams(layoutParams);
    }

    private int A00() {
        return A0H + A0D + (A0E * 4) + (this.A0D.A2Q() ? A0C : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EnumC1901Mq A02(String str) {
        EnumC1901Mq enumC1901Mq = EnumC1901Mq.A09;
        if (this.A05 == null) {
            return enumC1901Mq;
        }
        FY holder = (FY) this.A05.A1G(this.A05.getLayoutManager().A25());
        if (holder != null && holder.A0p() != null) {
            enumC1901Mq = holder.A0p().A0E(str);
            if (holder.A0p().getCtaActionHelper().A06() == null) {
                holder.A0p().getCtaActionHelper().A07(new C1726Fw(this));
            }
        }
        return enumC1901Mq;
    }

    private C1727Fx A0C() {
        return new C1727Fx(this);
    }

    private void A0G() {
        int index = this.A0D.A2G().size();
        int i = 0;
        for (NR adInfoItem : this.A0D.A2G()) {
            int index2 = i + 1;
            this.A09.add(new C2490e5(i, index, adInfoItem));
            i = index2;
        }
    }

    private final void A0I() {
        this.A02.removeAllViews();
        this.A05.removeAllViews();
        this.A05.A1S();
        this.A06.removeAllViews();
    }

    private final void A0J(int i, Bundle bundle) {
        int A00;
        int extraSpacing;
        int height;
        int i2 = XX.A04.widthPixels;
        int i3 = XX.A04.heightPixels;
        if (i == 1) {
            A00 = Math.min(i2 - (A0E * 4), i3 / 2);
            extraSpacing = (i2 - A00) / 8;
            height = extraSpacing * 4;
        } else {
            A00 = i3 - A00();
            extraSpacing = A0E;
            height = extraSpacing * 2;
        }
        this.A00 = new C1728Fy(this.A05, i, this.A09, this.A07, bundle);
        int childSpacing = A00;
        this.A05.setAdapter(new C1719Fp(this.A0E, this.A09, this.A0D, this.A0F, this.A03, this.A07, this.A04, getAudienceNetworkListener(), this.A08, childSpacing, extraSpacing, height, i, this.A00, this.A0H));
        this.A05.A1h(this.A05.getOnScrollListener());
        if (i == 1) {
            A0K(this.A00);
        }
        RelativeLayout relativeLayout = this.A02;
        C1J c1j = this.A05;
        String[] strArr = A0B;
        if (strArr[7].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A0B[3] = "F7mqI2GIhyyFDyTzZV2pklBppM1xGubd";
        relativeLayout.addView(c1j);
        if (this.A06 != null) {
            this.A02.addView(this.A06);
        }
        if (C2102Up.A1z(this.A0E)) {
            this.A0E.A0B().AKn(this.A05, this.A0D.A2E(), false);
        }
        A0f(this.A02, false, i);
    }

    private void A0K(C1728Fy c1728Fy) {
        new C7N().A0G(this.A05);
        c1728Fy.A0Y(new C1725Fv(this));
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public final AbstractC2187Yb A0b() {
        return new PU(this.A0E, this.A0D, 0);
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public final void A0d() {
        EnumC1901Mq A02 = A02(A0E(0, 4, 13));
        if (this.A0D.A2N()) {
            return;
        }
        EnumC1901Mq actionOutcome = EnumC1901Mq.A09;
        if (A02 != actionOutcome) {
            EnumC1901Mq actionOutcome2 = EnumC1901Mq.A06;
            if (A02 != actionOutcome2) {
                A0m();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public final boolean A0l() {
        return false;
    }

    public final void A0m() {
        if (this.A0H.getToolbarActionMode() == 8) {
            this.A0H.setToolbarActionMode(2);
        }
        this.A0D.A2K(false);
        this.A0D.A29().A0M(-1);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2194Yi
    public final void AAu(Intent intent, Bundle bundle, C2014Re c2014Re) {
        A0g(c2014Re);
        A0J(c2014Re.A05().getResources().getConfiguration().orientation, bundle);
        c2014Re.A0A(new C1724Fu(this, c2014Re));
        int A04 = this.A0D.A29().A0H().A04();
        if (super.A09) {
            A04 = this.A0D.A29().A0H().A03();
        }
        if (A04 > 0) {
            A0e(A04);
        }
        AbstractC2817jd abstractC2817jd = this.A0D;
        if (A0B[4].charAt(27) == 'g') {
            throw new RuntimeException();
        }
        A0B[5] = "xzqo3WeAICTwOfDq1ABGux21r55vxNP";
        int unskippableSec = abstractC2817jd.A29().A0H().A02();
        if (unskippableSec >= 0) {
            this.A0H.setToolbarActionMode(8);
        }
        if (this.A0D.A2T()) {
            this.A0H.setOnClickListener(new ViewOnClickListenerC2491e6(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC2194Yi
    public final void AFA(boolean z) {
        super.AFA(z);
        if (this.A00 != null) {
            this.A00.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC2194Yi
    public final void AFi(boolean z) {
        super.AFi(z);
        if (this.A00 != null) {
            this.A00.A0R();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2194Yi
    public final void AIv(Bundle bundle) {
        if (this.A00 != null) {
            this.A00.A0W(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.core.PJ
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AIv(bundle);
        A0I();
        A0J(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.core.PJ, com.facebook.ads.redexgen.core.InterfaceC2194Yi
    public final void onDestroy() {
        super.onDestroy();
        if (C2102Up.A1z(this.A0E)) {
            VM A0B2 = this.A0E.A0B();
            if (A0B[3].charAt(27) != 'x') {
                throw new RuntimeException();
            }
            A0B[4] = "QmrF4TvQsO2B2hMNxlVLyQwFLZRqn96s";
            A0B2.AKU(this.A05);
        }
        if (!TextUtils.isEmpty(this.A08)) {
            this.A0F.AB7(this.A08, new C2309b9().A03(this.A07).A02(this.A04).A05());
        }
        A0I();
        this.A07.A0V();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A04.A06(this.A0E, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
