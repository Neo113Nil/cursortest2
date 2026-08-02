package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzjg {
    public final long a;
    public final long b;
    public long c = C.TIME_UNSET;
    public long d = C.TIME_UNSET;
    public long f = C.TIME_UNSET;
    public long g = C.TIME_UNSET;
    public float i = 1.0f;
    public long j = C.TIME_UNSET;
    public long e = C.TIME_UNSET;
    public long h = C.TIME_UNSET;
    public long k = C.TIME_UNSET;
    public long l = C.TIME_UNSET;

    public /* synthetic */ zzjg(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final void a() {
        long j = this.h;
        if (j == C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.b;
        this.h = j2;
        long j3 = this.g;
        if (j3 != C.TIME_UNSET && j2 > j3) {
            this.h = j3;
        }
        this.j = C.TIME_UNSET;
    }

    public final void b() {
        long j;
        long j2 = this.c;
        if (j2 != C.TIME_UNSET) {
            j = this.d;
            if (j == C.TIME_UNSET) {
                long j3 = this.f;
                if (j3 != C.TIME_UNSET && j2 < j3) {
                    j2 = j3;
                }
                j = this.g;
                if (j == C.TIME_UNSET || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.e == j) {
            return;
        }
        this.e = j;
        this.h = j;
        this.k = C.TIME_UNSET;
        this.l = C.TIME_UNSET;
        this.j = C.TIME_UNSET;
    }
}
