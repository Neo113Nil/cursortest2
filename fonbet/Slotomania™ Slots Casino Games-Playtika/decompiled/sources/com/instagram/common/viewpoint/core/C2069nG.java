package com.instagram.common.viewpoint.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2069nG extends AbstractC0729Eh<C2069nG> implements Comparable<C2069nG> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(List<C2069nG> list, List<C2069nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C2069nG(int i, C2218pg c2218pg, int i2, C06139i c06139i, int i3, String str) {
        super(i, c2218pg, i2);
        List<String> list;
        int A00;
        int i4 = 0;
        this.A08 = C06129h.A0S(i3, false);
        int i5 = super.A02.A0H & (~((C2214pc) c06139i).A00);
        this.A06 = (i5 & 1) != 0;
        this.A07 = (i5 & 2) != 0;
        int i6 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c06139i.A0K.isEmpty()) {
            list = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            list = c06139i.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= list.size()) {
                break;
            }
            int A02 = C06129h.A02(super.A02, list.get(bestLanguageIndex), c06139i.A0P);
            if (A02 > 0) {
                i6 = bestLanguageIndex;
                bestLanguageScore = A02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i6;
        this.A01 = bestLanguageScore;
        A00 = C06129h.A00(super.A02.A0E, ((C2214pc) c06139i).A0C);
        this.A02 = A00;
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C06129h.A02(super.A02, str, C06129h.A0K(str) == null);
        boolean z = this.A01 > 0 || (c06139i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C06129h.A0S(i3, c06139i.A0B) && z) {
            i4 = 1;
        }
        this.A04 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C2069nG c2069nG) {
        AbstractC2107ns A06 = AbstractC2107ns.A01().A09(this.A08, c2069nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c2069nG.A00), AbstractC2257qK.A03().A06()).A06(this.A01, c2069nG.A01).A06(this.A02, c2069nG.A02).A09(this.A06, c2069nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c2069nG.A07), this.A01 == 0 ? AbstractC2257qK.A03() : AbstractC2257qK.A03().A06()).A06(this.A03, c2069nG.A03);
        if (this.A02 == 0) {
            A06 = A06.A0A(this.A05, c2069nG.A05);
        }
        return A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C2069nG> A02(int i, C2218pg c2218pg, C06139i c06139i, int[] iArr, String str) {
        C2K A01 = BP.A01();
        for (int i2 = 0; i2 < c2218pg.A01; i2++) {
            A01.A04(new C2069nG(i, c2218pg, i2, c06139i, iArr[i2], str));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC0729Eh
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C2069nG c2069nG) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0729Eh
    public final int A08() {
        return this.A04;
    }
}
