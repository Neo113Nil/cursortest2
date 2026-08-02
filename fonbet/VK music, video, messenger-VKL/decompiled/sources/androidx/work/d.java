package androidx.work;

import androidx.work.e;
import java.util.concurrent.TimeUnit;
import xsna.fxx0;

/* compiled from: PeriodicWorkRequest.kt */
/* loaded from: classes.dex */
public final class d extends e {

    /* compiled from: PeriodicWorkRequest.kt */
    public static final class a extends e.a<a, d> {
        public a() {
            throw null;
        }

        public a(Class<? extends b> cls, long j, TimeUnit timeUnit) {
            super(cls);
            this.c.e(timeUnit.toMillis(j));
        }

        @Override // androidx.work.e.a
        public final d c() {
            if (this.a && this.c.j.d) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            fxx0 fxx0Var = this.c;
            if (fxx0Var.q) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new d(this.b, fxx0Var, this.d);
        }

        @Override // androidx.work.e.a
        public final a d() {
            return this;
        }
    }
}
