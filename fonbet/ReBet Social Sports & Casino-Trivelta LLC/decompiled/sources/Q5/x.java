package Q5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f9504a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9505b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9506c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9507d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9508e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9509f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f9510g;

    /* renamed from: h, reason: collision with root package name */
    public final Double f9511h;

    public x(String type, String str, String str2, String str3, String str4, String str5, Double d10, Double d11) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f9504a = type;
        this.f9505b = str;
        this.f9506c = str2;
        this.f9507d = str3;
        this.f9508e = str4;
        this.f9509f = str5;
        this.f9510g = d10;
        this.f9511h = d11;
    }

    public final String a() {
        return this.f9505b;
    }

    public final String b() {
        return this.f9507d;
    }

    public final String c() {
        return this.f9509f;
    }

    public final String d() {
        return this.f9506c;
    }

    public final String e() {
        return this.f9508e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(this.f9504a, xVar.f9504a) && Intrinsics.areEqual(this.f9505b, xVar.f9505b) && Intrinsics.areEqual(this.f9506c, xVar.f9506c) && Intrinsics.areEqual(this.f9507d, xVar.f9507d) && Intrinsics.areEqual(this.f9508e, xVar.f9508e) && Intrinsics.areEqual(this.f9509f, xVar.f9509f) && Intrinsics.areEqual((Object) this.f9510g, (Object) xVar.f9510g) && Intrinsics.areEqual((Object) this.f9511h, (Object) xVar.f9511h);
    }

    public final String f() {
        return this.f9504a;
    }

    public final Double g() {
        return this.f9510g;
    }

    public final Double h() {
        return this.f9511h;
    }

    public int hashCode() {
        int hashCode = this.f9504a.hashCode() * 31;
        String str = this.f9505b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9506c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9507d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9508e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9509f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d10 = this.f9510g;
        int hashCode7 = (hashCode6 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f9511h;
        return hashCode7 + (d11 != null ? d11.hashCode() : 0);
    }

    public String toString() {
        return "UserInteractionDetails(type=" + this.f9504a + ", direction=" + this.f9505b + ", targetElement=" + this.f9506c + ", elementClasses=" + this.f9507d + ", targetId=" + this.f9508e + ", innerText=" + this.f9509f + ", x=" + this.f9510g + ", y=" + this.f9511h + ")";
    }
}
