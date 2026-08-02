package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1739Gj extends FrameLayout implements InterfaceC2194Yi {
    public static byte[] A0F;
    public static String[] A0G = {"TjJo4iSgng0vXhs45r72rqpPNY8skILr", "91ouIxxhnH3Z5", "W0nriFofCJUyd1UjJ1D34NnkecurTiQg", "io9DF8pP4zbnzlMZ0cU9ebyf5c8MGTpw", "GW5XhaY0JB8EDDs", "wmyPNYIHMh217", "CqbXOmo7iYNySqq5By1vz3nqMfrwlLlZ", "8HyCFF6UzaJGyjOzTS3wQDIkiaQQj"};
    public static final RelativeLayout.LayoutParams A0H;
    public boolean A00;
    public ViewGroup A01;
    public boolean A02;
    public final AbstractC2817jd A03;
    public final C2058Sx A04;
    public final C2652gi A05;
    public final VA A06;
    public final VI A07;
    public final Y2 A08;
    public final AbstractC2187Yb A09;
    public final InterfaceC2193Yh A0A;
    public final ZU A0B;
    public final C2597fp A0C;
    public final ViewOnSystemUiVisibilityChangeListenerC2183Xx A0D;
    public final AbstractC2596fo A0E;

    public static String A0Z(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A0b() {
        A0F = new byte[]{-22, -19, -4, -23, -24};
    }

    public abstract void A0g();

    public abstract void A0h();

    public abstract void A0k(C2014Re c2014Re);

    public abstract boolean A0l();

    public abstract boolean A0m();

    static {
        A0b();
        A0H = new RelativeLayout.LayoutParams(-1, -1);
    }

    public AbstractC1739Gj(C2652gi c2652gi, ZU zu, VA va, AbstractC2817jd abstractC2817jd, C2058Sx c2058Sx, InterfaceC2193Yh interfaceC2193Yh) {
        super(c2652gi);
        this.A02 = false;
        this.A0E = new H8(this);
        this.A08 = new Y2();
        this.A00 = false;
        this.A05 = c2652gi;
        this.A0B = zu;
        this.A06 = va;
        this.A03 = abstractC2817jd;
        this.A04 = c2058Sx;
        this.A0A = interfaceC2193Yh;
        this.A07 = new VI(this.A03.A2E(), this.A06);
        this.A0C = new C2597fp(this, 1, new WeakReference(this.A0E), this.A05);
        this.A0C.A0W(this.A03.A0m());
        this.A0C.A0X(this.A03.A0n());
        this.A09 = A0Y();
        this.A0D = new ViewOnSystemUiVisibilityChangeListenerC2183Xx(this);
        this.A0D.A05(EnumC2182Xw.A02);
        if (!A0m() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
    }

    private AbstractC2187Yb A0Y() {
        AbstractC2187Yb A0c = A0c();
        A0c.setFullscreen(true);
        int A04 = this.A03.A29().A0H().A04();
        A0c.setPageDetails(this.A03.A2C(), this.A03.A2E(), A04, this.A03.A2D());
        A0c.A0D(this.A03.A28().A01(), ViewOnClickListenerC1850Kr.A05(this.A03));
        if (this.A03.A29().A0H().A02() == 0) {
            this.A02 = true;
            A0c.setToolbarActionMode(8);
        } else if (A04 < 0 && this.A03.A29().A0S()) {
            A0c.setToolbarActionMode(4);
        }
        if (this.A03.A29().A0H().A02() >= 0) {
            A0c.setProgressSpinnerInvisible(true);
        }
        A0c.setToolbarListener(new C1741Gl(this));
        return A0c;
    }

    private void A0a() {
        if (this.A03.A29().A0W()) {
            C2475dq A0F2 = new Cdo(this.A05, this.A03.A29().A0I(), this.A03.A2C()).A0A(this.A03.A28().A01()).A0F();
            VK.A04(A0F2, this.A07, VH.A0U);
            addView(A0F2, A0H);
            A0F2.A04(new C1754Gy(this));
            return;
        }
        A0h();
    }

    public AbstractC2187Yb A0c() {
        if (A0m()) {
            if (this.A03.A1W()) {
                return new C1966Pe(this.A05, getAppOpenAdVariant(), this.A03, 8, new C1745Gp(this));
            }
            return new PU(this.A05, this.A03, 1);
        }
        return new FullScreenAdToolbar(this.A05, this.A0A, this.A07, 1, this.A03.A22(), this.A03.A1s());
    }

    public void A0d() {
        Rect requestedMargins;
        if (!this.A03.A1W() || (requestedMargins = this.A09.getRequestedMargins()) == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A09.getLayoutParams();
        layoutParams.setMargins(requestedMargins.left, requestedMargins.top, requestedMargins.right, requestedMargins.bottom);
        this.A09.setLayoutParams(layoutParams);
    }

    public final void A0e() {
        if (!this.A00) {
            this.A0C.A0U();
            this.A00 = true;
        }
    }

    public final void A0f() {
        if (this.A09.getToolbarActionMode() == 8) {
            this.A09.setToolbarActionMode(2);
        }
        if (this.A03.A29().A0H().A07() != null) {
            this.A03.A29().A0H().A07().A0S(0);
        }
        this.A03.A2K(false);
        this.A03.A29().A0M(-1);
    }

    public final void A0i(int i, AbstractRunnableC2139Wc abstractRunnableC2139Wc, DZ dz) {
        new XO(i, new H0(this, i, dz, abstractRunnableC2139Wc)).A07();
    }

    public final void A0j(ViewGroup viewGroup) {
        if (this.A03.A1W() && getAppOpenAdVariant() == EnumC2192Yg.A08) {
            C2347bl c2347bl = new C2347bl(this.A05);
            c2347bl.setRadius(XV.A0v);
            c2347bl.addView(viewGroup, new ViewGroup.LayoutParams(-1, -1));
            this.A01 = c2347bl;
            return;
        }
        this.A01 = viewGroup;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2194Yi
    public final void AAu(Intent intent, Bundle bundle, C2014Re c2014Re) {
        this.A0A.A45(this, A0H);
        A0k(c2014Re);
        A0a();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2194Yi
    public final void AIv(Bundle bundle) {
    }

    private EnumC2192Yg getAppOpenAdVariant() {
        if (this.A03.A0v().equals(A0Z(0, 5, 93))) {
            return EnumC2192Yg.A08;
        }
        return EnumC2192Yg.A09;
    }

    public Integer getBackgroundColorForToolbar() {
        if (this.A03.A1W()) {
            return getAppOpenAdVariant().A03;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2194Yi
    public String getCurrentClientToken() {
        return this.A03.A2E();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2194Yi
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!A0m() && Build.VERSION.SDK_INT >= 35) {
            setFitsSystemWindows(true);
        }
        A0d();
        if (A0G[6].charAt(4) == 'Z') {
            throw new RuntimeException();
        }
        A0G[3] = "kF6RESICu85JPno09mseATff07y9WxI4";
    }

    public void onDestroy() {
        this.A0D.A03();
        if (!TextUtils.isEmpty(this.A03.A2E())) {
            this.A06.AB7(this.A03.A2E(), new C2309b9().A03(this.A0C).A02(this.A08).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A08.A06(this.A05, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC2193Yh interfaceC2193Yh) {
    }

    public void setUpFullscreenMode(boolean z) {
        EnumC2182Xw enumC2182Xw;
        if (z) {
            enumC2182Xw = EnumC2182Xw.A03;
        } else {
            enumC2182Xw = EnumC2182Xw.A02;
        }
        this.A0D.A05(enumC2182Xw);
    }
}
