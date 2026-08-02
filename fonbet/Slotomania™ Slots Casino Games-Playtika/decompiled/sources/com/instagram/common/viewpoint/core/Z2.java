package com.instagram.common.viewpoint.core;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network/classes2.dex */
public final class Z2 extends FrameLayout {
    public static byte[] A0D;
    public static String[] A0E = {"EYRP1PEEhxzmFZofVXiCCrEXWQs6qPAa", "IPRTBS", "NsAYUXCCkxBbK0XyUhCt1xHChz5fZfMK", "fEJJ0", "6651Qynk9CVpAvzNTMvYSQKVDYa6iazW", "nD7S5n7VHEDKGeK1PzI1a27Vk58dSaaa", "vFV0GS7SjmRPmH7mLZ5yrXn6gSrRknN8", "LPfldR2r"};
    public static final int A0F;
    public boolean A00;
    public final C1865ji A01;
    public final AbstractC1860jd A02;
    public final C1695gi A03;
    public final VA A04;
    public final VI A05;
    public final Y2 A06;
    public final C1001Ow A07;
    public final AbstractC0995Oq A08;
    public final AbstractC1639fo A09;
    public final C1640fp A0A;
    public final String A0B;
    public final WeakReference<Z1> A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public Z2(C1695gi c1695gi, VA va, C1101Sx c1101Sx, WeakReference<Z1> weakReference, int i, int i2, int i3, int i4, C1865ji c1865ji, String str) {
        super(c1695gi);
        this.A06 = new Y2();
        this.A03 = c1695gi;
        this.A04 = va;
        this.A01 = c1865ji;
        this.A0C = weakReference;
        this.A0B = str;
        AbstractC1860jd A0F2 = this.A01.A0F();
        if (A0F2 == null) {
            throw new IllegalStateException(A09(0, 32, 86));
        }
        this.A02 = this.A01.A0F();
        YB.A0N(this, -1);
        this.A05 = new VI(this.A01.A7O(), this.A04);
        this.A09 = A06();
        this.A0A = A07(i, i4, i2, i3);
        LinearLayout linearLayout = new LinearLayout(c1695gi);
        linearLayout.setOrientation(1);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        this.A08 = A04(c1101Sx);
        if (this.A08 != null) {
            linearLayout.addView(this.A08, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
        this.A07 = A02(A0F2);
        linearLayout.addView(this.A07, new LinearLayout.LayoutParams(-1, -2));
    }

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 99);
            if (A0E[6].charAt(17) == 'I') {
                throw new RuntimeException();
            }
            A0E[6] = "HyV3wef6DGt1nbLL1fRSvAmBe6VeBas4";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0D = new byte[]{-6, Ascii.GS, -39, Ascii.GS, Ascii.SUB, 45, Ascii.SUB, -39, Ascii.ESC, 46, 39, Ascii.GS, 37, Ascii.RS, -39, 34, 44, -39, Ascii.FS, Ascii.SUB, 39, 39, 40, 45, -39, Ascii.ESC, Ascii.RS, -39, 39, 46, 37, 37, 52, SignedBytes.MAX_POWER_OF_TWO, 62, -1, 55, 50, 52, 54, 51, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 60, -1, 50, 53, 68, -1, 51, 50, 63, 63, 54, 67, -1, 52, Base64.padSymbol, 58, 52, 60, 54, 53};
    }

    static {
        A0F();
        A0F = (int) (XX.A02 * 40.0f);
    }

    private C1001Ow A02(AbstractC1860jd abstractC1860jd) {
        C0953Na A00;
        NR A29 = abstractC1860jd.A29();
        PW pw = new PW() { // from class: com.facebook.ads.redexgen.X.6f
            public static byte[] A01;
            public static String[] A02 = {"69whQSJFXzC5tMS1mvBQof2SK7ErE5ZD", "1jHEgafKgZ1qGtZeFln5jYEaZuoTSi1L", "X7dL0uEA8hI8yFDxVjmpGWGPGaRf3imC", "xkNxR1N5ht6u5HrBYV6Jaj9BRbbqvvjX", "FzWiIV8jsRMCATg74qRy8XJg", "NPgeBhkCK5cdUCtVbQG3V7Bzbyz9qF6p", "wkBgnizDM2wMuU", "fQJYdDBiu8hI0YoMzyDMv7ESaoH1tCRU"};

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    String[] strArr = A02;
                    if (strArr[5].charAt(30) == strArr[3].charAt(30)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[5] = "zFlqgUHcpRBmVFunDUsFQIo1zDN3Ly6W";
                    strArr2[3] = "vgtBZdmtnd3XTM9GsG6r3isUaM0HNLHl";
                    if (i4 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
                    i4++;
                }
            }

            public static void A01() {
                A01 = new byte[]{-102};
            }

            static {
                A01();
            }

            @Override // com.instagram.common.viewpoint.core.InterfaceC1236Yh
            public final void A4j(String str) {
                String str2;
                C1695gi c1695gi;
                StringBuilder append = new StringBuilder().append(str).append(A00(0, 1, 92));
                str2 = Z2.this.A0B;
                Intent intent = new Intent(append.append(str2).toString());
                c1695gi = Z2.this.A03;
                P2.A00(c1695gi).A07(intent);
            }
        };
        if (getOrientation() == 1) {
            A00 = abstractC1860jd.A28().A01();
        } else {
            NN A28 = abstractC1860jd.A28();
            String[] strArr = A0E;
            if (strArr[1].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0E[7] = "bY8FFe1Y";
            A00 = A28.A00();
        }
        C1001Ow c1001Ow = new C1001Ow(this.A03, A0F, A00, A29.A0J().A06(), A09(32, 31, 110), this.A04, pw, this.A0A, this.A06, abstractC1860jd.A2A());
        c1001Ow.setInfo(A29.A0I(), A29.A0J(), this.A01.A7O(), abstractC1860jd.A2C().A01(), null, null);
        if (C1145Up.A1N(this.A03)) {
            c1001Ow.A0k();
        }
        return c1001Ow;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.6q] */
    private AbstractC0995Oq A04(C1101Sx c1101Sx) {
        final ViewOnClickListenerC1254Yz viewOnClickListenerC1254Yz = new ViewOnClickListenerC1254Yz(this);
        String videoUrl = this.A01.A0e();
        if (A0H(c1101Sx, this.A01) && videoUrl != null) {
            C05396g videoView = new C05396g(this.A03, this.A04, c1101Sx, this.A05, viewOnClickListenerC1254Yz, this.A02).A0I(this.A01.A7O(), videoUrl, this.A01.A0H() != null ? this.A01.A0H().getUrl() : null, this.A01.A0R(), this.A01.A0Q());
            if (C1145Up.A1R(this.A03)) {
                setViewAsCTA(videoView);
            }
            return videoView;
        }
        C1157Vb A0H = this.A01.A0H();
        if (A0H == null) {
            return null;
        }
        final C1695gi c1695gi = this.A03;
        final VI vi = this.A05;
        final AbstractC1860jd abstractC1860jd = this.A02;
        C05496q A0I = new AbstractC0995Oq(c1695gi, viewOnClickListenerC1254Yz, vi, abstractC1860jd) { // from class: com.facebook.ads.redexgen.X.6q
            public final C1348b5 A00;

            {
                super(c1695gi, viewOnClickListenerC1254Yz, vi, abstractC1860jd);
                this.A00 = new C1348b5(c1695gi);
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC0995Oq
            public final void A0E() {
                super.A0E();
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC0995Oq
            public final void A0F() {
                super.A0F();
                if (this.A04 != null) {
                    YB.A0J(this.A04);
                    this.A04.setLayoutParams(AbstractC0995Oq.A0A(null));
                    addView(this.A04);
                }
            }

            public final C05496q A0I(String str) {
                new LM(this.A00, this.A08).A05(this.A00.getHeight(), this.A00.getWidth()).A06(new C0996Or(this)).A07(str);
                A0F();
                return this;
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC0995Oq
            public int getMediaViewId() {
                return this.A00.getId();
            }
        }.A0I(A0H.getUrl());
        if (C1145Up.A1P(this.A03)) {
            setViewAsCTA(A0I);
        }
        return A0I;
    }

    private C0980Ob A06() {
        return new C0980Ob(this);
    }

    private C1640fp A07(int i, int i2, int i3, int i4) {
        C1640fp c1640fp = new C1640fp(this, i, i2, true, new WeakReference(this.A09), this.A03);
        c1640fp.A0W(i3);
        c1640fp.A0X(i4);
        return c1640fp;
    }

    private void A0C() {
        String A0M = this.A01.A0M();
        if (!TextUtils.isEmpty(A0M)) {
            X6 x6 = new X6();
            C1695gi c1695gi = this.A03;
            Uri A00 = XB.A00(A0M);
            String adChoicesLinkUrl = this.A01.A7O();
            X6.A0O(x6, c1695gi, A00, adChoicesLinkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A05.A04(VH.A0A, null);
        if (!AbstractC0986Oh.A00(this.A03.A02()).A0O(this.A03, false)) {
            A0C();
            return;
        }
        AbstractC1258Zd A01 = AbstractC1259Ze.A01(this.A03, this.A04, this.A01.A7O(), this);
        if (A01 == null) {
            A0C();
            return;
        }
        YB.A0W(this);
        addView(A01, new FrameLayout.LayoutParams(-1, -1));
        A01.A0N();
    }

    private void A0E() {
        if (getVisibility() == 0 && this.A00 && hasWindowFocus()) {
            this.A0A.A0U();
        } else {
            this.A0A.A0V();
        }
    }

    public static boolean A0H(C1101Sx c1101Sx, C1865ji c1865ji) {
        String A0e = c1865ji.A0e();
        if (TextUtils.isEmpty(A0e)) {
            return false;
        }
        String videoUrl = c1101Sx.A0T(A0e);
        return !TextUtils.isEmpty(videoUrl);
    }

    public final void A0I() {
        if (this.A08 != null) {
            this.A08.A0D();
        }
        if (this.A0A != null) {
            this.A0A.A0V();
        }
        YB.A0J(this);
    }

    public final void A0J() {
        if (this.A08 != null) {
            AbstractC0995Oq abstractC0995Oq = this.A08;
            if (A0E[2].charAt(13) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[0] = "hgkEcT5pEsAUKYMkvVnojxGMD5WCOUSh";
            strArr[5] = "qBRuzdoZQfMYUt1SZmDdshQz8Ndd8EXP";
            abstractC0995Oq.A0E();
        }
    }

    private int getOrientation() {
        Activity activity = this.A03.A0E();
        if (activity != null) {
            return activity.getResources().getConfiguration().orientation;
        }
        return 1;
    }

    public C1640fp getViewabilityChecker() {
        return this.A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A00 = true;
        A0E();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00 = false;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0E();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0E();
    }

    private void setViewAsCTA(View view) {
        view.setOnClickListener(new Z0(this));
    }
}
