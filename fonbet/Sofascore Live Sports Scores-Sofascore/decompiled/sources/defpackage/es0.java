package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class es0 {
    public final long a;
    public final long b;
    public final long c;

    public es0(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long j4 = lfj.c;
        if (lfj.a(j, j4)) {
            a70.p("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
            throw null;
        }
        if (lfj.a(j2, j4)) {
            a70.p("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        if (lfj.a(j3, j4)) {
            a70.p("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
            throw null;
        }
        if (mfj.a(lfj.b(j), lfj.b(j2))) {
            v8a.m(j, j2);
            if (Float.compare(lfj.c(j), lfj.c(j2)) > 0) {
                this.a = j2;
                j = j2;
            }
        }
        if (mfj.a(lfj.b(j3), 4294967296L)) {
            long E = v8a.E(4294967296L, 1.0E-4f);
            v8a.m(j3, E);
            if (Float.compare(lfj.c(j3), lfj.c(E)) < 0) {
                a70.p("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                throw null;
            }
        }
        if (lfj.c(j) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            a70.p("AutoSize.StepBased: minFontSize must not be negative");
            throw null;
        }
        if (lfj.c(j2) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        a70.p("AutoSize.StepBased: maxFontSize must not be negative");
        throw null;
    }

    public static boolean a(aej aejVar) {
        eyc eycVar = aejVar.b;
        long j = aejVar.c;
        zdj zdjVar = aejVar.a;
        int i = zdjVar.f;
        if (i == 1 || i == 3) {
            return ((float) ((int) (j >> 32))) < eycVar.d || eycVar.c || ((float) ((int) (j & 4294967295L))) < eycVar.e;
        }
        if (i != 4 && i != 5 && i != 2) {
            sw9.t(b6a.C(zdjVar.f), " is not supported.", "TextOverflow type ");
            return false;
        }
        int i2 = eycVar.f;
        if (i2 != 0) {
            if (i2 == 1) {
                return aejVar.l(0);
            }
            if (i == 4 || i == 5) {
                return ((float) ((int) (j >> 32))) < eycVar.d || eycVar.c || ((float) ((int) (j & 4294967295L))) < eycVar.e;
            }
            if (i == 2) {
                return aejVar.l(i2 - 1);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof es0)) {
            return false;
        }
        es0 es0Var = (es0) obj;
        return lfj.a(es0Var.a, this.a) && lfj.a(es0Var.b, this.b) && lfj.a(es0Var.c, this.c);
    }

    public final int hashCode() {
        mfj[] mfjVarArr = lfj.b;
        return Long.hashCode(this.c) + ljg.c(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
