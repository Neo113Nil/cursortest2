package ig;

import java.io.Serializable;

/* renamed from: ig.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC7072a {

    /* renamed from: ig.a$a, reason: collision with other inner class name */
    static final class C1099a extends AbstractC7072a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final p f66401a;

        C1099a(p pVar) {
            this.f66401a = pVar;
        }

        public final p a() {
            return this.f66401a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1099a)) {
                return false;
            }
            return this.f66401a.equals(((C1099a) obj).f66401a);
        }

        public final int hashCode() {
            return this.f66401a.hashCode() + 1;
        }

        public final String toString() {
            return "SystemClock[" + this.f66401a + "]";
        }
    }

    protected AbstractC7072a() {
    }
}
