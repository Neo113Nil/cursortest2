package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.nR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3037nR implements InterfaceC1691Em {
    public static String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final AnonymousClass45 A08;

    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final F6 A09;
    public final int A0A;

    public C3037nR() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C3037nR(int i, int i2, int i3, float f) {
        this(null, -1, i, i2, i3, 1279, 719, f, 0.75f, 2000L, AnonymousClass45.A00);
    }

    public C3037nR(F6 f6) {
        this(f6, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, AnonymousClass45.A00);
    }

    public C3037nR(@MetaExoPlayerCustomization("No longer set through factory") F6 f6, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i, @MetaExoPlayerCustomization("Removed from upstream") int i2, int i3, int i4, int i5, int i6, float f, float f2, long j, AnonymousClass45 anonymousClass45) {
        this.A09 = f6;
        this.A0A = i;
        this.A05 = i2;
        this.A02 = i3;
        this.A06 = i4;
        this.A04 = i5;
        this.A03 = i6;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = j;
        this.A08 = anonymousClass45;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C13641a A00(C3175pg c3175pg, int[] iArr, int i, F6 f6, BP<EU> bp) {
        return new C13641a(c3175pg, iArr, i, f6, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, bp, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1691Em
    public final InterfaceC3024nE[] A5b(C1690El[] c1690ElArr, F6 f6, C3060no c3060no, Timeline timeline) {
        BP A00;
        InterfaceC3024nE A002;
        A00 = C13641a.A00(c1690ElArr);
        InterfaceC3024nE[] interfaceC3024nEArr = new InterfaceC3024nE[c1690ElArr.length];
        for (int i = 0; i < c1690ElArr.length; i++) {
            C1690El c1690El = c1690ElArr[i];
            if (c1690El != null && c1690El.A02.length != 0) {
                int length = c1690El.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    A002 = new C1Z(c1690El.A01, c1690El.A02[0], c1690El.A00);
                } else {
                    A002 = A00(c1690El.A01, c1690El.A02, c1690El.A00, f6, (BP) A00.get(i));
                }
                interfaceC3024nEArr[i] = A002;
            }
        }
        return interfaceC3024nEArr;
    }
}
