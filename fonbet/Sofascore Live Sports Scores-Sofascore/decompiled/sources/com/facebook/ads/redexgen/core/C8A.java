package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.8A, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8A {
    public static String[] A06 = {"jkVScMAnmSDw5NjtFKaMDw93YHVTZfVV", "X8vR6FaiUrrVUV4OyPqbjTz4nTbdT", "DJqg7VUdCo9q2ysxPrWS1RTdTLsj", "4FrbkvGGO58oIWN02YSUZA4iQkwc41Il", "lEgbsVLzgPUjgc1", "ISDPu1y88m9uUW9z", "L6djBwtYOA2bka2PQ69EdZLSIG4ne", "x8MPEelqUvAzBLNZGFUUNdgpeh0HUacA"};
    public C3060no A00;
    public C3060no A01;
    public C3060no A02;
    public BP<C3060no> A03 = BP.A03();
    public AbstractC3104oX<C3060no, Timeline> A04 = AbstractC3104oX.A04();
    public final C3179pl A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3060no A00(InterfaceC14153b interfaceC14153b, BP<C3060no> bp, C3060no c3060no, C3179pl c3179pl) {
        int i;
        int i2;
        Timeline A7g = interfaceC14153b.A7g();
        int A7c = interfaceC14153b.A7c();
        Object A0M = A7g.A0N() ? null : A7g.A0M(A7c);
        if (!interfaceC14153b.AAd()) {
            boolean A0N = A7g.A0N();
            String[] strArr = A06;
            if (strArr[7].charAt(14) != strArr[3].charAt(14)) {
                throw new RuntimeException();
            }
            A06[6] = "fPIpfte6042F2VeKOBsTFTkNJVxhR";
            if (!A0N) {
                i = A7g.A0H(A7c, c3179pl).A07(C5C.A0O(interfaceC14153b.A7e()) - c3179pl.A0C());
                for (i2 = 0; i2 < bp.size(); i2++) {
                    C3060no c3060no2 = bp.get(i2);
                    if (A04(c3060no2, A0M, interfaceC14153b.AAd(), interfaceC14153b.A7Y(), interfaceC14153b.A7Z(), i)) {
                        return c3060no2;
                    }
                }
                if (bp.isEmpty() && c3060no != null) {
                    if (!A04(c3060no, A0M, interfaceC14153b.AAd(), interfaceC14153b.A7Y(), interfaceC14153b.A7Z(), i)) {
                        return c3060no;
                    }
                }
                return null;
            }
        }
        i = -1;
        while (i2 < bp.size()) {
        }
        if (bp.isEmpty()) {
            if (!A04(c3060no, A0M, interfaceC14153b.AAd(), interfaceC14153b.A7Y(), interfaceC14153b.A7Z(), i)) {
            }
        }
        return null;
    }

    public C8A(C3179pl c3179pl) {
        this.A05 = c3179pl;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "builder of ImmutableMap should be a buildOrThrow")
    private void A02(Timeline timeline) {
        C3102oV<C3060no, Timeline> A03 = AbstractC3104oX.A03();
        if (this.A03.isEmpty()) {
            A03(A03, this.A01, timeline);
            C3060no c3060no = this.A02;
            C3060no c3060no2 = this.A01;
            if (A06[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[2] = "UxUdIKnoAyUMpq9t4QIr4fpxRPT3";
            strArr[1] = "6BCX8szW2uTmGViuSf00Yq1AObOIr";
            if (!CB.A01(c3060no, c3060no2)) {
                A03(A03, this.A02, timeline);
            }
            if (!CB.A01(this.A00, this.A01) && !CB.A01(this.A00, this.A02)) {
                A03(A03, this.A00, timeline);
            }
        } else {
            for (int i = 0; i < this.A03.size(); i++) {
                A03(A03, this.A03.get(i), timeline);
            }
            if (!this.A03.contains(this.A00)) {
                A03(A03, this.A00, timeline);
            }
        }
        this.A04 = A03.A07();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oV != com.google.common.collect.ImmutableMap$Builder<com.facebook.ads.androidx.media3.exoplayer.source.MediaSource$MediaPeriodId, com.facebook.ads.androidx.media3.common.Timeline> */
    private void A03(C3102oV<C3060no, Timeline> c3102oV, C3060no c3060no, Timeline timeline) {
        if (c3060no == null) {
            return;
        }
        if (timeline.A0A(c3060no.A04) != -1) {
            c3102oV.A05(c3060no, timeline);
            return;
        }
        Timeline existingTimeline = this.A04.get(c3060no);
        if (existingTimeline == null) {
            return;
        }
        c3102oV.A05(c3060no, existingTimeline);
    }

    public static boolean A04(C3060no c3060no, Object obj, boolean z, int i, int i2, int i3) {
        if (c3060no.A04.equals(obj)) {
            return (z && c3060no.A00 == i && c3060no.A01 == i2) || (!z && c3060no.A00 == -1 && c3060no.A02 == i3);
        }
        return false;
    }

    public final Timeline A05(C3060no c3060no) {
        return this.A04.get(c3060no);
    }

    public final C3060no A06() {
        return this.A00;
    }

    public final void A07(InterfaceC14153b interfaceC14153b) {
        this.A00 = A00(interfaceC14153b, this.A03, this.A01, this.A05);
        A02(interfaceC14153b.A7g());
    }
}
