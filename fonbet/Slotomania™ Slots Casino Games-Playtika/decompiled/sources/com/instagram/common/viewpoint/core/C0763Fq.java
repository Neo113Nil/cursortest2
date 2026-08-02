package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0763Fq extends RK implements InterfaceC1243Yo {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public C0959Ng A00;
    public AbstractC1639fo A01;
    public C1640fp A02;
    public C1640fp A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C1695gi A06;
    public final C6M A07;

    public C0763Fq(C6M c6m, SparseBooleanArray sparseBooleanArray, C1640fp c1640fp, int i, C1695gi c1695gi, C0959Ng c0959Ng) {
        super(c6m);
        this.A06 = c1695gi;
        this.A07 = c6m;
        this.A05 = sparseBooleanArray;
        this.A02 = c1640fp;
        this.A04 = i;
        this.A00 = c0959Ng;
    }

    private void A05(VA va, Y2 y2, String str, C1533e5 c1533e5) {
        if (this.A05.get(c1533e5.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new C0765Fs(this, str, c1533e5, va, c1533e5.A04(), y2);
        this.A03 = new C1640fp(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new C0764Fr(this, c1533e5));
    }

    public final void A0p(C1533e5 c1533e5, VA va, C1101Sx c1101Sx, Y2 y2, String str, int i, int i2, int i3) {
        int A02 = c1533e5.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(A02));
        this.A07.setupNativeCtaExtension(c1533e5);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int rightMargin = A02 == 0 ? i3 : i2;
        if (A02 < this.A04 - 1) {
            i3 = i2;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i3, 0);
        String A082 = c1533e5.A03().A0H().A08();
        String A09 = c1533e5.A03().A0H().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(A09));
        if (this.A07.A1V()) {
            this.A07.setVideoPlaceholderUrl(A082);
            this.A07.setVideoUrl(c1101Sx.A0T(A09));
        } else {
            this.A07.setImageUrl(A082);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c1533e5.A03().A0J(), c1533e5.A04());
        this.A07.A1W(c1533e5.A04());
        A05(va, y2, str, c1533e5);
    }

    public final void A0q(C1640fp c1640fp) {
        this.A02 = c1640fp;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1243Yo
    public final void AJF() {
        this.A07.A1Q();
    }
}
