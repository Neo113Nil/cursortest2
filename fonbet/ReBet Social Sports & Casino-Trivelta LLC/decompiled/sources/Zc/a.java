package Zc;

import androidx.core.graphics.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0308a f14755e = new C0308a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final a f14756f = new a(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f14757a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14758b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14759c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14760d;

    /* renamed from: Zc.a$a, reason: collision with other inner class name */
    public static final class C0308a {
        public /* synthetic */ C0308a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(e insets) {
            Intrinsics.checkNotNullParameter(insets, "insets");
            return new a(insets.f19098a, insets.f19099b, insets.f19100c, insets.f19101d);
        }

        public final a b() {
            return a.f14756f;
        }

        public final a c(a i12, a i22) {
            Intrinsics.checkNotNullParameter(i12, "i1");
            Intrinsics.checkNotNullParameter(i22, "i2");
            return new a(Math.max(i12.c(), i22.c()), Math.max(i12.e(), i22.e()), Math.max(i12.d(), i22.d()), Math.max(i12.b(), i22.b()));
        }

        public C0308a() {
        }
    }

    public a(float f10, float f11, float f12, float f13) {
        this.f14757a = f10;
        this.f14758b = f11;
        this.f14759c = f12;
        this.f14760d = f13;
    }

    public final float b() {
        return this.f14760d;
    }

    public final float c() {
        return this.f14757a;
    }

    public final float d() {
        return this.f14759c;
    }

    public final float e() {
        return this.f14758b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f14757a, aVar.f14757a) == 0 && Float.compare(this.f14758b, aVar.f14758b) == 0 && Float.compare(this.f14759c, aVar.f14759c) == 0 && Float.compare(this.f14760d, aVar.f14760d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f14757a) * 31) + Float.hashCode(this.f14758b)) * 31) + Float.hashCode(this.f14759c)) * 31) + Float.hashCode(this.f14760d);
    }

    public String toString() {
        return "EdgeInsets(left=" + this.f14757a + ", top=" + this.f14758b + ", right=" + this.f14759c + ", bottom=" + this.f14760d + ")";
    }
}
