package kc;

import d9.e;
import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements nc.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f18990a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18991b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18992c;

    public a(int i5, String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f18990a = i5;
        this.f18991b = name;
        this.f18992c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18990a == aVar.f18990a && Intrinsics.areEqual(this.f18991b, aVar.f18991b) && Intrinsics.areEqual(this.f18992c, aVar.f18992c);
    }

    @Override // nc.a
    public final int getId() {
        return this.f18990a;
    }

    @Override // nc.a
    public final String getLogo() {
        return this.f18992c;
    }

    @Override // nc.a
    public final String getName() {
        return this.f18991b;
    }

    public final int hashCode() {
        int j = k.j(this.f18990a * 31, 31, this.f18991b);
        String str = this.f18992c;
        return j + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Category(id=");
        sb2.append(this.f18990a);
        sb2.append(", name=");
        sb2.append(this.f18991b);
        sb2.append(", logo=");
        return e.k(sb2, this.f18992c, ')');
    }
}
