package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3032nM extends AbstractC1686Eh<C3032nM> implements Comparable<C3032nM> {
    public static String[] A0I = {"kuPF6Ds61I7lkNvdz9bcVPsTInik8V3M", "Qk0zKRkYsaxRz9XBLHG1rmY7ne3qL", "U5xl3sY91uvZaW", "4oEkNGaUX02G9U6MTdWApFSB5pjWlUNx", "CFtCC3eFdvC", "EnNVjubCw6rdwWEp5vRTdV2Ipxq1ST06", "834ujo2VifTXBI2K", "5tr2zEJniV6LNy5ijK5ku"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C15709i A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C3032nM(int i, C3175pg c3175pg, int i2, C15709i c15709i, int i3, boolean z, InterfaceC2883kj<C3212qI> interfaceC2883kj) {
        super(i, c3175pg, i2);
        int A00;
        this.A0A = c15709i;
        this.A0B = C15699h.A0K(super.A02.A0V);
        this.A0F = C15699h.A0S(i3, false);
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        while (true) {
            if (i6 >= c15709i.A0I.size()) {
                break;
            }
            int A02 = C15699h.A02(super.A02, c15709i.A0I.get(i6), false);
            if (A02 > 0) {
                i5 = i6;
                i4 = A02;
                break;
            }
            i6++;
        }
        this.A04 = i5;
        this.A05 = i4;
        A00 = C15699h.A00(super.A02.A0E, ((C3171pc) c15709i).A0B);
        this.A07 = A00;
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((C3171pc) c15709i).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((C3171pc) c15709i).A02) && interfaceC2883kj.A4C(super.A02);
        String[] A1L = C5C.A1L();
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= A1L.length) {
                break;
            }
            int A022 = C15699h.A02(super.A02, A1L[i9], false);
            if (A022 > 0) {
                i7 = i9;
                i8 = A022;
                break;
            }
            i9++;
        }
        this.A02 = i7;
        this.A03 = i8;
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        while (true) {
            if (i11 < c15709i.A0J.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(c15709i.A0J.get(i11))) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        this.A06 = i10;
        this.A0H = AbstractC15247i.A02(i3) == 128;
        this.A0G = AbstractC15247i.A04(i3) == 64;
        this.A09 = A00(i3, z);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<C3032nM> list, List<C3032nM> list2) {
        return ((C3032nM) Collections.max(list)).compareTo((C3032nM) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static BP<C3032nM> A03(int i, C3175pg c3175pg, C15709i c15709i, int[] iArr, boolean z, InterfaceC2883kj<C3212qI> interfaceC2883kj) {
        C2K A01 = BP.A01();
        for (int i2 = 0; i2 < c3175pg.A01; i2++) {
            A01.A04(new C3032nM(i, c3175pg, i2, c15709i, iArr[i2], z, interfaceC2883kj));
        }
        return A01.A05();
    }

    private int A00(int i, boolean z) {
        if (!C15699h.A0S(i, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (C15699h.A0S(i, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3032nM c3032nM) {
        AbstractC3214qK abstractC3214qK;
        AbstractC3214qK A06;
        AbstractC3214qK abstractC3214qK2;
        AbstractC3214qK abstractC3214qK3;
        if (!this.A0E || !this.A0F) {
            abstractC3214qK = C15699h.A09;
            A06 = abstractC3214qK.A06();
        } else {
            A06 = C15699h.A09;
        }
        AbstractC3064ns A08 = AbstractC3064ns.A01().A09(this.A0F, c3032nM.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(c3032nM.A04), AbstractC3214qK.A03().A06()).A06(this.A05, c3032nM.A05).A06(this.A07, c3032nM.A07).A09(this.A0D, c3032nM.A0D).A09(this.A0C, c3032nM.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(c3032nM.A02), AbstractC3214qK.A03().A06()).A06(this.A03, c3032nM.A03).A09(this.A0E, c3032nM.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(c3032nM.A06), AbstractC3214qK.A03().A06());
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(c3032nM.A00);
        if (this.A0A.A0O) {
            abstractC3214qK3 = C15699h.A09;
            abstractC3214qK2 = abstractC3214qK3.A06();
        } else {
            abstractC3214qK2 = C15699h.A0A;
        }
        AbstractC3064ns A082 = A08.A08(valueOf, valueOf2, abstractC3214qK2).A09(this.A0H, c3032nM.A0H).A09(this.A0G, c3032nM.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(c3032nM.A01), A06).A08(Integer.valueOf(this.A08), Integer.valueOf(c3032nM.A08), A06);
        Integer valueOf3 = Integer.valueOf(this.A00);
        Integer valueOf4 = Integer.valueOf(c3032nM.A00);
        if (!C5C.A1E(this.A0B, c3032nM.A0B)) {
            A06 = C15699h.A0A;
        }
        return A082.A08(valueOf3, valueOf4, A06).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r4 == ((com.facebook.ads.redexgen.core.AbstractC1686Eh) r6).A02.A06) goto L10;
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC1686Eh
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A09(C3032nM c3032nM) {
        if (!this.A0A.A00) {
            if (super.A02.A06 != -1) {
                int i = super.A02.A06;
                String[] strArr = A0I;
                if (strArr[5].charAt(5) == strArr[0].charAt(5)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "4j0Ebeo7wJOJZxGoc5hIgJQJaA3nIP6d";
                strArr2[0] = "7JU6hRyIHJ6Xx4Pnq3EsCWmSiYve8JpD";
            }
        }
        return (this.A0A.A02 || (super.A02.A0W != null && TextUtils.equals(super.A02.A0W, ((AbstractC1686Eh) c3032nM).A02.A0W))) && (this.A0A.A03 || (super.A02.A0G != -1 && super.A02.A0G == ((AbstractC1686Eh) c3032nM).A02.A0G)) && (this.A0A.A01 || (this.A0H == c3032nM.A0H && this.A0G == c3032nM.A0G));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1686Eh
    public final int A08() {
        return this.A09;
    }
}
