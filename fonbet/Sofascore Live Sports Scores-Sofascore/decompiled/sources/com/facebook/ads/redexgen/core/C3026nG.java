package com.facebook.ads.redexgen.core;

import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.nG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3026nG extends AbstractC1686Eh<C3026nG> implements Comparable<C3026nG> {
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
    public static int A01(List<C3026nG> list, List<C3026nG> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public C3026nG(int i, C3175pg c3175pg, int i2, C15709i c15709i, int i3, String str) {
        super(i, c3175pg, i2);
        List<String> list;
        int A00;
        int i4 = 0;
        this.A08 = C15699h.A0S(i3, false);
        int i5 = super.A02.A0H & (~((C3171pc) c15709i).A00);
        this.A06 = (i5 & 1) != 0;
        this.A07 = (i5 & 2) != 0;
        int i6 = Integer.MAX_VALUE;
        int bestLanguageScore = 0;
        if (c15709i.A0K.isEmpty()) {
            list = MetaExoPlayerCustomizedCollections.A03("");
        } else {
            list = c15709i.A0K;
        }
        int bestLanguageIndex = 0;
        while (true) {
            if (bestLanguageIndex >= list.size()) {
                break;
            }
            int A02 = C15699h.A02(super.A02, list.get(bestLanguageIndex), c15709i.A0P);
            if (A02 > 0) {
                i6 = bestLanguageIndex;
                bestLanguageScore = A02;
                break;
            }
            bestLanguageIndex++;
        }
        this.A00 = i6;
        this.A01 = bestLanguageScore;
        A00 = C15699h.A00(super.A02.A0E, ((C3171pc) c15709i).A0C);
        this.A02 = A00;
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = C15699h.A02(super.A02, str, C15699h.A0K(str) == null);
        boolean z = this.A01 > 0 || (c15709i.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (C15699h.A0S(i3, c15709i.A0B) && z) {
            i4 = 1;
        }
        this.A04 = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3026nG c3026nG) {
        AbstractC3064ns A06 = AbstractC3064ns.A01().A09(this.A08, c3026nG.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c3026nG.A00), AbstractC3214qK.A03().A06()).A06(this.A01, c3026nG.A01).A06(this.A02, c3026nG.A02).A09(this.A06, c3026nG.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c3026nG.A07), this.A01 == 0 ? AbstractC3214qK.A03() : AbstractC3214qK.A03().A06()).A06(this.A03, c3026nG.A03);
        if (this.A02 == 0) {
            A06 = A06.A0A(this.A05, c3026nG.A05);
        }
        return A06.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TextTrackInfo> */
    public static BP<C3026nG> A02(int i, C3175pg c3175pg, C15709i c15709i, int[] iArr, String str) {
        C2K A01 = BP.A01();
        for (int i2 = 0; i2 < c3175pg.A01; i2++) {
            A01.A04(new C3026nG(i, c3175pg, i2, c15709i, iArr[i2], str));
        }
        return A01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1686Eh
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C3026nG c3026nG) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1686Eh
    public final int A08() {
        return this.A04;
    }
}
