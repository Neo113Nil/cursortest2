package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uq4 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public long d = C.TIME_UNSET;
    public long e = C.TIME_UNSET;
    public long g = C.TIME_UNSET;
    public long h = C.TIME_UNSET;
    public float k = 0.97f;
    public float j = 1.03f;
    public float l = 1.0f;
    public long m = C.TIME_UNSET;
    public long f = C.TIME_UNSET;
    public long i = C.TIME_UNSET;
    public long n = C.TIME_UNSET;
    public long o = C.TIME_UNSET;

    public /* synthetic */ uq4(long j, long j2, int i) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final void a() {
        long j;
        switch (this.a) {
            case 0:
                long j2 = this.d;
                if (j2 != C.TIME_UNSET) {
                    long j3 = this.e;
                    if (j3 != C.TIME_UNSET) {
                        j2 = j3;
                    }
                    long j4 = this.g;
                    if (j4 != C.TIME_UNSET && j2 < j4) {
                        j2 = j4;
                    }
                    long j5 = this.h;
                    if (j5 != C.TIME_UNSET && j2 > j5) {
                        j2 = j5;
                    }
                } else {
                    j2 = -9223372036854775807L;
                }
                if (this.f != j2) {
                    this.f = j2;
                    this.i = j2;
                    this.n = C.TIME_UNSET;
                    this.o = C.TIME_UNSET;
                    this.m = C.TIME_UNSET;
                    break;
                }
                break;
            default:
                long j6 = this.d;
                if (j6 != C.TIME_UNSET) {
                    j = this.e;
                    if (j == C.TIME_UNSET) {
                        long j7 = this.g;
                        if (j7 != C.TIME_UNSET && j6 < j7) {
                            j6 = j7;
                        }
                        j = this.h;
                        if (j == C.TIME_UNSET || j6 <= j) {
                            j = j6;
                        }
                    }
                } else {
                    j = -9223372036854775807L;
                }
                if (this.f != j) {
                    this.f = j;
                    this.i = j;
                    this.n = C.TIME_UNSET;
                    this.o = C.TIME_UNSET;
                    this.m = C.TIME_UNSET;
                    break;
                }
                break;
        }
    }
}
