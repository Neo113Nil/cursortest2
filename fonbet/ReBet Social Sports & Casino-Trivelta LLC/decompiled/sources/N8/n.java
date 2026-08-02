package N8;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: g, reason: collision with root package name */
    public static final a f7957g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Integer f7958a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f7959b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f7960c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f7961d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f7962e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f7963f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public n(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.f7958a = num;
        this.f7959b = num2;
        this.f7960c = num3;
        this.f7961d = num4;
        this.f7962e = num5;
        this.f7963f = num6;
    }

    public final Integer a() {
        return this.f7959b;
    }

    public final Integer b() {
        return this.f7960c;
    }

    public final Integer c() {
        return this.f7961d;
    }

    public final Integer d() {
        return this.f7958a;
    }

    public final Integer e() {
        return this.f7963f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f7958a, nVar.f7958a) && Intrinsics.areEqual(this.f7959b, nVar.f7959b) && Intrinsics.areEqual(this.f7960c, nVar.f7960c) && Intrinsics.areEqual(this.f7961d, nVar.f7961d) && Intrinsics.areEqual(this.f7962e, nVar.f7962e) && Intrinsics.areEqual(this.f7963f, nVar.f7963f);
    }

    public final Integer f() {
        return this.f7962e;
    }

    public int hashCode() {
        Integer num = this.f7958a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f7959b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f7960c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f7961d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f7962e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f7963f;
        return hashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    public String toString() {
        return "ViewDimensions(width=" + this.f7958a + ", height=" + this.f7959b + ", locationInWindowX=" + this.f7960c + ", locationInWindowY=" + this.f7961d + ", windowSizeWidth=" + this.f7962e + ", windowSizeHeight=" + this.f7963f + ')';
    }
}
