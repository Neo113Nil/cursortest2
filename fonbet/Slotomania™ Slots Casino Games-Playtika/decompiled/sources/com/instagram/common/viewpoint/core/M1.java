package com.instagram.common.viewpoint.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class M1 extends AbstractC1043Qq<C0763Fq> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1236Yh A03;
    public C1640fp A04;
    public String A05;
    public List<C1533e5> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1860jd A08;
    public final C1101Sx A09;
    public final C1695gi A0A;
    public final VA A0B;
    public final UK A0C;
    public final Y2 A0D;
    public final C6X A0E;
    public final DZ A0F;

    public M1(C1695gi c1695gi, List<C1533e5> list, AbstractC1860jd abstractC1860jd, VA va, UK uk2, InterfaceC1236Yh interfaceC1236Yh, String str, C6X c6x, DZ dz) {
        this.A0A = c1695gi;
        this.A0B = va;
        this.A0C = uk2;
        this.A09 = uk2.A14();
        this.A04 = uk2.A1G();
        this.A0D = uk2.A1E();
        this.A03 = interfaceC1236Yh;
        this.A08 = abstractC1860jd;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c6x;
        this.A0F = dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1043Qq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0763Fq A0F(ViewGroup viewGroup, int i) {
        return new C0763Fq(AbstractC1375bW.A00(new C1411c6(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0R(this.A0F).A0N(this.A0C).A0U(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A2A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1043Qq
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C0763Fq c0763Fq, int i) {
        C1533e5 c1533e5 = this.A06.get(i);
        c0763Fq.A0q(this.A04);
        c0763Fq.A0p(c1533e5, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1043Qq
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i, int i2, int i3) {
        boolean needsUpdate = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C1640fp c1640fp) {
        this.A04 = c1640fp;
    }
}
