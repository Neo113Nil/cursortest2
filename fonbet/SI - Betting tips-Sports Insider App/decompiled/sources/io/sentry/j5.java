package io.sentry;

import java.util.Date;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j5 extends k4 {

    /* renamed from: a, reason: collision with root package name */
    public final Date f16566a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16567b;

    public j5(Date date, long j) {
        this.f16566a = date;
        this.f16567b = j;
    }

    @Override // io.sentry.k4, java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(k4 k4Var) {
        if (!(k4Var instanceof j5)) {
            return super.compareTo(k4Var);
        }
        j5 j5Var = (j5) k4Var;
        long time = this.f16566a.getTime();
        long time2 = j5Var.f16566a.getTime();
        return time == time2 ? Long.valueOf(this.f16567b).compareTo(Long.valueOf(j5Var.f16567b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.k4
    public final long b(k4 k4Var) {
        return k4Var instanceof j5 ? this.f16567b - ((j5) k4Var).f16567b : super.b(k4Var);
    }

    @Override // io.sentry.k4
    public final long c(k4 k4Var) {
        if (k4Var == null || !(k4Var instanceof j5)) {
            return super.c(k4Var);
        }
        j5 j5Var = (j5) k4Var;
        long j = j5Var.f16567b;
        int compareTo = compareTo(k4Var);
        long j6 = this.f16567b;
        if (compareTo < 0) {
            return d() + (j - j6);
        }
        return j5Var.d() + (j6 - j);
    }

    @Override // io.sentry.k4
    public final long d() {
        return this.f16566a.getTime() * 1000000;
    }

    public j5() {
        this(com.google.android.play.core.appupdate.b.n(), System.nanoTime());
    }
}
