package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2075nM extends AbstractC0729Eh<C2075nM> implements Comparable<C2075nM> {
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
    public final C06139i A0A;
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
    public C2075nM(int i, C2218pg c2218pg, int i2, C06139i c06139i, int i3, boolean z, InterfaceC1926kj<C2255qI> interfaceC1926kj) {
        super(i, c2218pg, i2);
        int A00;
        this.A0A = c06139i;
        this.A0B = C06129h.A0K(super.A02.A0V);
        this.A0F = C06129h.A0S(i3, false);
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        int i6 = 0;
        while (true) {
            if (i6 >= c06139i.A0I.size()) {
                break;
            }
            int A02 = C06129h.A02(super.A02, c06139i.A0I.get(i6), false);
            if (A02 > 0) {
                i5 = i6;
                i4 = A02;
                break;
            }
            i6++;
        }
        this.A04 = i5;
        this.A05 = i4;
        A00 = C06129h.A00(super.A02.A0E, ((C2214pc) c06139i).A0B);
        this.A07 = A00;
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((C2214pc) c06139i).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((C2214pc) c06139i).A02) && interfaceC1926kj.A4C(super.A02);
        String[] A1L = C5C.A1L();
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= A1L.length) {
                break;
            }
            int A022 = C06129h.A02(super.A02, A1L[i9], false);
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
            if (i11 < c06139i.A0J.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(c06139i.A0J.get(i11))) {
                    i10 = i11;
                    break;
                }
                i11++;
            } else {
                break;
            }
        }
        this.A06 = i10;
        this.A0H = AbstractC05677i.A02(i3) == 128;
        this.A0G = AbstractC05677i.A04(i3) == 64;
        this.A09 = A00(i3, z);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<C2075nM> list, List<C2075nM> list2) {
        return ((C2075nM) Collections.max(list)).compareTo((C2075nM) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static BP<C2075nM> A03(int i, C2218pg c2218pg, C06139i c06139i, int[] iArr, boolean z, InterfaceC1926kj<C2255qI> interfaceC1926kj) {
        C2K A01 = BP.A01();
        for (int i2 = 0; i2 < c2218pg.A01; i2++) {
            A01.A04(new C2075nM(i, c2218pg, i2, c06139i, iArr[i2], z, interfaceC1926kj));
        }
        return A01.A05();
    }

    private int A00(int i, boolean z) {
        if (!C06129h.A0S(i, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E && !this.A0A.A09) {
            return 0;
        }
        if (C06129h.A0S(i, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2075nM c2075nM) {
        AbstractC2257qK abstractC2257qK;
        AbstractC2257qK A06;
        AbstractC2257qK abstractC2257qK2;
        AbstractC2257qK abstractC2257qK3;
        if (!this.A0E || !this.A0F) {
            abstractC2257qK = C06129h.A09;
            A06 = abstractC2257qK.A06();
        } else {
            A06 = C06129h.A09;
        }
        AbstractC2107ns A08 = AbstractC2107ns.A01().A09(this.A0F, c2075nM.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(c2075nM.A04), AbstractC2257qK.A03().A06()).A06(this.A05, c2075nM.A05).A06(this.A07, c2075nM.A07).A09(this.A0D, c2075nM.A0D).A09(this.A0C, c2075nM.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(c2075nM.A02), AbstractC2257qK.A03().A06()).A06(this.A03, c2075nM.A03).A09(this.A0E, c2075nM.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(c2075nM.A06), AbstractC2257qK.A03().A06());
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(c2075nM.A00);
        if (this.A0A.A0O) {
            abstractC2257qK3 = C06129h.A09;
            abstractC2257qK2 = abstractC2257qK3.A06();
        } else {
            abstractC2257qK2 = C06129h.A0A;
        }
        AbstractC2107ns A082 = A08.A08(valueOf, valueOf2, abstractC2257qK2).A09(this.A0H, c2075nM.A0H).A09(this.A0G, c2075nM.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(c2075nM.A01), A06).A08(Integer.valueOf(this.A08), Integer.valueOf(c2075nM.A08), A06);
        Integer valueOf3 = Integer.valueOf(this.A00);
        Integer valueOf4 = Integer.valueOf(c2075nM.A00);
        if (!C5C.A1E(this.A0B, c2075nM.A0B)) {
            A06 = C06129h.A0A;
        }
        return A082.A08(valueOf3, valueOf4, A06).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r4 == ((com.instagram.common.viewpoint.core.AbstractC0729Eh) r6).A02.A06) goto L10;
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC0729Eh
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A09(C2075nM c2075nM) {
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
        return (this.A0A.A02 || (super.A02.A0W != null && TextUtils.equals(super.A02.A0W, ((AbstractC0729Eh) c2075nM).A02.A0W))) && (this.A0A.A03 || (super.A02.A0G != -1 && super.A02.A0G == ((AbstractC0729Eh) c2075nM).A02.A0G)) && (this.A0A.A01 || (this.A0H == c2075nM.A0H && this.A0G == c2075nM.A0G));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0729Eh
    public final int A08() {
        return this.A09;
    }
}
