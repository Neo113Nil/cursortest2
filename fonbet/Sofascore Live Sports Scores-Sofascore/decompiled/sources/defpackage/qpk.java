package defpackage;

import android.util.Range;
import com.google.android.gms.internal.ads.zzguk;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qpk {
    public long a;
    public long b;
    public double c;
    public Range d;

    public qpk(int i) {
        switch (i) {
            case 1:
                Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
                this.d = range;
                this.c = ((Double) range.getUpper()).doubleValue();
                this.a = C.TIME_UNSET;
                this.b = C.TIME_UNSET;
                break;
            default:
                Range range2 = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
                this.d = range2;
                this.c = ((Double) range2.getUpper()).doubleValue();
                this.a = C.TIME_UNSET;
                this.b = C.TIME_UNSET;
                break;
        }
    }

    public void a(long j, long j2) {
        double doubleValue;
        z1a.s(j != C.TIME_UNSET);
        z1a.s(j2 != C.TIME_UNSET);
        long j3 = this.a;
        if (j3 != C.TIME_UNSET) {
            if (this.b != C.TIME_UNSET && j != j3) {
                doubleValue = (j2 - r4) / (j - j3);
                this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
                this.a = j;
                this.b = j2;
            }
        }
        doubleValue = ((Double) this.d.getUpper()).doubleValue();
        this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.a = j;
        this.b = j2;
    }

    public void b() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = C.TIME_UNSET;
        this.b = C.TIME_UNSET;
    }

    public void c(float f) {
        z1a.s(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        b();
    }

    public void d(long j, long j2) {
        double doubleValue;
        zzguk.a(j != C.TIME_UNSET);
        zzguk.a(j2 != C.TIME_UNSET);
        long j3 = this.a;
        if (j3 != C.TIME_UNSET) {
            if (this.b != C.TIME_UNSET && j != j3) {
                doubleValue = (j2 - r4) / (j - j3);
                this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
                this.a = j;
                this.b = j2;
            }
        }
        doubleValue = ((Double) this.d.getUpper()).doubleValue();
        this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.a = j;
        this.b = j2;
    }

    public void e(float f) {
        zzguk.a(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        f();
    }

    public void f() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = C.TIME_UNSET;
        this.b = C.TIME_UNSET;
    }
}
