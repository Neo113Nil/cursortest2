package jc;

import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f18432a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18433b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18434c;

    /* renamed from: d, reason: collision with root package name */
    public final b f18435d;

    public d(int i5, int i10, String str, b icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f18432a = i5;
        this.f18433b = i10;
        this.f18434c = str;
        this.f18435d = icon;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f18432a == dVar.f18432a && this.f18433b == dVar.f18433b && Intrinsics.areEqual(this.f18434c, dVar.f18434c) && Intrinsics.areEqual(this.f18435d, dVar.f18435d);
    }

    public final int hashCode() {
        return this.f18435d.hashCode() + k.j(((((this.f18432a * 31) + this.f18433b) * 31) + 1231) * 31, 31, this.f18434c);
    }

    public final String toString() {
        return "FaqModelRG(title=" + this.f18432a + ", name=" + this.f18433b + ", ic=true, action=" + this.f18434c + ", icon=" + this.f18435d + ')';
    }
}
