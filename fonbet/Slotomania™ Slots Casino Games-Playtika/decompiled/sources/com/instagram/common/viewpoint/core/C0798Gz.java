package com.instagram.common.viewpoint.core;

import com.google.android.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.Gz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0798Gz {
    public static final C0798Gz A03 = new C0798Gz(-3, C.TIME_UNSET, -1);
    public final int A00;
    public final long A01;
    public final long A02;

    public C0798Gz(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public static C0798Gz A03(long j) {
        return new C0798Gz(0, C.TIME_UNSET, j);
    }

    public static C0798Gz A04(long j, long j2) {
        return new C0798Gz(-1, j, j2);
    }

    public static C0798Gz A05(long j, long j2) {
        return new C0798Gz(-2, j, j2);
    }
}
