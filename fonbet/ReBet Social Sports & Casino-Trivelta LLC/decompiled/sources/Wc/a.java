package Wc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f13206a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f13207b;

    public a(Integer num, Integer num2) {
        this.f13206a = num;
        this.f13207b = num2;
    }

    public final Integer a() {
        return this.f13206a;
    }

    public final Integer b() {
        return this.f13207b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f13206a, aVar.f13206a) && Intrinsics.areEqual(this.f13207b, aVar.f13207b);
    }

    public int hashCode() {
        Integer num = this.f13206a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f13207b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ItemStateAppearance(tabBarItemIconColor=" + this.f13206a + ", tabBarItemTitleFontColor=" + this.f13207b + ")";
    }
}
