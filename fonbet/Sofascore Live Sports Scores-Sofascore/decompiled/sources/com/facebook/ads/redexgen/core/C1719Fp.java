package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Fp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1719Fp extends AbstractC2000Qq<FY> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC2187Yb A04;
    public InterfaceC2193Yh A05;
    public String A06;
    public List<C2490e5> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC2817jd A0A;
    public final C2058Sx A0B;
    public final C2652gi A0C;
    public final VA A0D;
    public final Y2 A0E;
    public final C1728Fy A0F;
    public final C2597fp A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C1719Fp(C2652gi c2652gi, List<C2490e5> list, AbstractC2817jd abstractC2817jd, VA va, C2058Sx c2058Sx, C2597fp c2597fp, Y2 y2, InterfaceC2193Yh interfaceC2193Yh, String str, int i, int i2, int i3, int i4, C1728Fy c1728Fy, AbstractC2187Yb abstractC2187Yb) {
        this.A0C = c2652gi;
        this.A0D = va;
        this.A0B = c2058Sx;
        this.A0G = c2597fp;
        this.A0E = y2;
        this.A05 = interfaceC2193Yh;
        this.A0A = abstractC2817jd;
        this.A07 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A06 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0F = c1728Fy;
        this.A04 = abstractC2187Yb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2000Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FY A0F(ViewGroup viewGroup, int i) {
        return new FY(AbstractC2422cy.A00(new C2368c6(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0P(this.A04).A0U(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC2000Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FY fy, int i) {
        fy.A0q(this.A07.get(i), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i == 0) {
            fy.AJF();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2000Qq
    public final int A0B() {
        return this.A07.size();
    }
}
