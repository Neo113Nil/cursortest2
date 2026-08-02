package Dj;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: Dj.a$a, reason: collision with other inner class name */
    public static final class C0059a extends a {
        public abstract String c();
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2809a;

        /* renamed from: b, reason: collision with root package name */
        public final Dj.b f2810b;

        public b(boolean z10) {
            super(null);
            this.f2809a = z10;
            this.f2810b = Dj.b.f2814b;
        }

        @Override // Dj.a
        public Dj.b a() {
            return this.f2810b;
        }

        @Override // Dj.a
        public boolean b() {
            return this.f2809a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f2809a == ((b) obj).f2809a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f2809a);
        }

        public String toString() {
            return "Headset(isActive=" + this.f2809a + ')';
        }
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f2811a;

        /* renamed from: b, reason: collision with root package name */
        public final Dj.b f2812b;

        public c(boolean z10) {
            super(null);
            this.f2811a = z10;
            this.f2812b = Dj.b.f2813a;
        }

        @Override // Dj.a
        public Dj.b a() {
            return this.f2812b;
        }

        @Override // Dj.a
        public boolean b() {
            return this.f2811a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f2811a == ((c) obj).f2811a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f2811a);
        }

        public String toString() {
            return "Speakers(isActive=" + this.f2811a + ')';
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Dj.b a();

    public abstract boolean b();

    public a() {
    }
}
