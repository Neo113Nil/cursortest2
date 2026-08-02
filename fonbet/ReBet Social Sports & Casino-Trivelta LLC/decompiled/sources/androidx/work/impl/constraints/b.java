package androidx.work.impl.constraints;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class b {

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23858a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: androidx.work.impl.constraints.b$b, reason: collision with other inner class name */
    public static final class C0420b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f23859a;

        public C0420b(int i10) {
            super(null);
            this.f23859a = i10;
        }

        public final int a() {
            return this.f23859a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0420b) && this.f23859a == ((C0420b) obj).f23859a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f23859a);
        }

        public String toString() {
            return "ConstraintsNotMet(reason=" + this.f23859a + ')';
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public b() {
    }
}
