package androidx.work.impl.constraints;

import xsna.vu5;

/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: WorkConstraintsTracker.kt */
    /* renamed from: androidx.work.impl.constraints.a$a, reason: collision with other inner class name */
    public static final class C0094a extends a {
        public static final C0094a a = new C0094a();
    }

    /* compiled from: WorkConstraintsTracker.kt */
    public static final class b extends a {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
        }
    }
}
