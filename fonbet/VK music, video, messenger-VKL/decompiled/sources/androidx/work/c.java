package androidx.work;

import androidx.work.e;

/* compiled from: OneTimeWorkRequest.kt */
/* loaded from: classes.dex */
public final class c extends e {

    /* compiled from: OneTimeWorkRequest.kt */
    public static final class a extends e.a<a, c> {
        public a() {
            throw null;
        }

        @Override // androidx.work.e.a
        public final c c() {
            if (this.a && this.c.j.d) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new c(this.b, this.c, this.d);
        }

        @Override // androidx.work.e.a
        public final a d() {
            return this;
        }
    }
}
