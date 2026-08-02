package ah;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static final a f16175d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final u f16176e = new u("HTTP", 2, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final u f16177f = new u("HTTP", 1, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final u f16178g = new u("HTTP", 1, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final u f16179h = new u("SPDY", 3, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final u f16180i = new u("QUIC", 1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f16181a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16182b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16183c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a() {
            return u.f16178g;
        }

        public final u b() {
            return u.f16177f;
        }

        public final u c() {
            return u.f16176e;
        }

        public final u d() {
            return u.f16180i;
        }

        public final u e() {
            return u.f16179h;
        }

        public a() {
        }
    }

    public u(String name, int i10, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f16181a = name;
        this.f16182b = i10;
        this.f16183c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f16181a, uVar.f16181a) && this.f16182b == uVar.f16182b && this.f16183c == uVar.f16183c;
    }

    public int hashCode() {
        return (((this.f16181a.hashCode() * 31) + Integer.hashCode(this.f16182b)) * 31) + Integer.hashCode(this.f16183c);
    }

    public String toString() {
        return this.f16181a + '/' + this.f16182b + '.' + this.f16183c;
    }
}
