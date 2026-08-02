package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.pl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3179pl implements AnonymousClass24 {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public C3220qS A06 = C3220qS.A08;
    public static String[] A07 = {"4zGdQbqEEbqON0fsiZAaEQkKoAoKYmna", "yJpzHCnd9V3wUr5Wrx8duzmTaMKaViaS", "6le5bHbrSJ1W0fbLNXPlurR", "jvR1cNhZ0960aRA7pVRRRMqTg6KbIJja", "KqjZe5mn0dP", "Q", "Z7fKuPhHzVcFnrI", "fPry0FIfciS3iZV36uBdTRShtkwqjgIo"};
    public static final String A0D = C5C.A0h(0);
    public static final String A0A = C5C.A0h(1);
    public static final String A0C = C5C.A0h(2);
    public static final String A0B = C5C.A0h(3);
    public static final String A09 = C5C.A0h(4);
    public static final AnonymousClass23<C3179pl> A08 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pp
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            C3179pl A01;
            A01 = C3179pl.A01(bundle);
            return A01;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C3179pl A01(Bundle bundle) {
        int i = bundle.getInt(A0D, 0);
        long j = bundle.getLong(A0A, C.TIME_UNSET);
        long j2 = bundle.getLong(A0C, 0L);
        boolean z = bundle.getBoolean(A0B, false);
        Bundle bundle2 = bundle.getBundle(A09);
        C3220qS A6f = bundle2 != null ? C3220qS.A09.A6f(bundle2) : C3220qS.A08;
        C3179pl c3179pl = new C3179pl();
        c3179pl.A0G(null, null, i, j, j2, A6f, z);
        return c3179pl;
    }

    public final int A03() {
        return this.A06.A00;
    }

    public final int A04(int i) {
        return this.A06.A07(i).A00;
    }

    public final int A05(int i) {
        return this.A06.A07(i).A04();
    }

    public final int A06(int i, int i2) {
        return this.A06.A07(i).A05(i2);
    }

    public final int A07(long j) {
        return this.A06.A05(j, this.A01);
    }

    public final int A08(long j) {
        return this.A06.A06(j, this.A01);
    }

    public final long A09() {
        return this.A06.A02;
    }

    public final long A0A() {
        return this.A01;
    }

    public final long A0B() {
        return C5C.A0P(this.A02);
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D(int i) {
        return this.A06.A07(i).A03;
    }

    public final long A0E(int i, int i2) {
        C3221qT A072 = this.A06.A07(i);
        return A072.A00 != -1 ? A072.A06[i2] : C.TIME_UNSET;
    }

    public final C3179pl A0F(Object obj, Object obj2, int i, long j, long j2) {
        return A0G(obj, obj2, i, j, j2, C3220qS.A08, false);
    }

    public final C3179pl A0G(Object obj, Object obj2, int i, long j, long j2, C3220qS c3220qS, boolean z) {
        this.A03 = obj;
        this.A04 = obj2;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
        this.A06 = c3220qS;
        this.A05 = z;
        return this;
    }

    public final boolean A0H(int i) {
        return !this.A06.A07(i).A07();
    }

    @MetaExoPlayerCustomization("Can be removed once MediaPeriodQueue is updated.")
    public final boolean A0I(int i, int i2) {
        C3221qT c3221qT = this.A06.A05[i];
        return (c3221qT.A00 == -1 || c3221qT.A05[i2] == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C3179pl c3179pl = (C3179pl) obj;
        if (C5C.A1E(this.A03, c3179pl.A03) && C5C.A1E(this.A04, c3179pl.A04) && this.A00 == c3179pl.A00 && this.A01 == c3179pl.A01 && this.A02 == c3179pl.A02 && this.A05 == c3179pl.A05 && C5C.A1E(this.A06, c3179pl.A06)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((7 * 31) + (this.A03 == null ? 0 : this.A03.hashCode())) * 31;
        if (this.A04 != null) {
            Object obj = this.A04;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A07[6] = "a7xjZFv85Fgc1YV";
            i = obj.hashCode();
        }
        return ((((((((((hashCode + i) * 31) + this.A00) * 31) + ((int) (this.A01 ^ (this.A01 >>> 32)))) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A06.hashCode();
    }
}
