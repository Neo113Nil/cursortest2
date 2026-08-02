package Q5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f9469a;

    /* renamed from: b, reason: collision with root package name */
    public final Regex f9470b;

    /* renamed from: c, reason: collision with root package name */
    public final List f9471c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9472d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9473e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9474f;

    public r(String str, Regex regex, List list, List list2, boolean z10, boolean z11) {
        this.f9469a = str;
        this.f9470b = regex;
        this.f9471c = list;
        this.f9472d = list2;
        this.f9473e = z10;
        this.f9474f = z11;
    }

    public final boolean a() {
        return this.f9473e;
    }

    public final boolean b() {
        return this.f9474f;
    }

    public final List c() {
        return this.f9471c;
    }

    public final List d() {
        return this.f9472d;
    }

    public final String e() {
        return this.f9469a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.f9469a, rVar.f9469a) && Intrinsics.areEqual(this.f9470b, rVar.f9470b) && Intrinsics.areEqual(this.f9471c, rVar.f9471c) && Intrinsics.areEqual(this.f9472d, rVar.f9472d) && this.f9473e == rVar.f9473e && this.f9474f == rVar.f9474f;
    }

    public final Regex f() {
        return this.f9470b;
    }

    public int hashCode() {
        String str = this.f9469a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Regex regex = this.f9470b;
        int hashCode2 = (hashCode + (regex == null ? 0 : regex.hashCode())) * 31;
        List list = this.f9471c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f9472d;
        return ((((hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f9473e)) * 31) + Boolean.hashCode(this.f9474f);
    }

    public String toString() {
        return "NetworkCaptureRule(url=" + this.f9469a + ", urlPattern=" + this.f9470b + ", reqHeaders=" + this.f9471c + ", resHeaders=" + this.f9472d + ", collectReqPayload=" + this.f9473e + ", collectResPayload=" + this.f9474f + ")";
    }
}
