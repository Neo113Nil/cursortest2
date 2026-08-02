package Wc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f13208a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f13209b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13210c;

    /* renamed from: d, reason: collision with root package name */
    public final a f13211d;

    /* renamed from: e, reason: collision with root package name */
    public final a f13212e;

    /* renamed from: f, reason: collision with root package name */
    public final a f13213f;

    /* renamed from: g, reason: collision with root package name */
    public final a f13214g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f13215h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f13216i;

    /* renamed from: j, reason: collision with root package name */
    public final String f13217j;

    /* renamed from: k, reason: collision with root package name */
    public final Float f13218k;

    /* renamed from: l, reason: collision with root package name */
    public final Float f13219l;

    /* renamed from: m, reason: collision with root package name */
    public final String f13220m;

    /* renamed from: n, reason: collision with root package name */
    public final String f13221n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f13222o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f13223p;

    public b(Integer num, Integer num2, String str, a aVar, a aVar2, a aVar3, a aVar4, Integer num3, Boolean bool, String str2, Float f10, Float f11, String str3, String str4, Integer num4, Integer num5) {
        this.f13208a = num;
        this.f13209b = num2;
        this.f13210c = str;
        this.f13211d = aVar;
        this.f13212e = aVar2;
        this.f13213f = aVar3;
        this.f13214g = aVar4;
        this.f13215h = num3;
        this.f13216i = bool;
        this.f13217j = str2;
        this.f13218k = f10;
        this.f13219l = f11;
        this.f13220m = str3;
        this.f13221n = str4;
        this.f13222o = num4;
        this.f13223p = num5;
    }

    public final a a() {
        return this.f13214g;
    }

    public final a b() {
        return this.f13213f;
    }

    public final a c() {
        return this.f13211d;
    }

    public final a d() {
        return this.f13212e;
    }

    public final Integer e() {
        return this.f13208a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f13208a, bVar.f13208a) && Intrinsics.areEqual(this.f13209b, bVar.f13209b) && Intrinsics.areEqual(this.f13210c, bVar.f13210c) && Intrinsics.areEqual(this.f13211d, bVar.f13211d) && Intrinsics.areEqual(this.f13212e, bVar.f13212e) && Intrinsics.areEqual(this.f13213f, bVar.f13213f) && Intrinsics.areEqual(this.f13214g, bVar.f13214g) && Intrinsics.areEqual(this.f13215h, bVar.f13215h) && Intrinsics.areEqual(this.f13216i, bVar.f13216i) && Intrinsics.areEqual(this.f13217j, bVar.f13217j) && Intrinsics.areEqual((Object) this.f13218k, (Object) bVar.f13218k) && Intrinsics.areEqual((Object) this.f13219l, (Object) bVar.f13219l) && Intrinsics.areEqual(this.f13220m, bVar.f13220m) && Intrinsics.areEqual(this.f13221n, bVar.f13221n) && Intrinsics.areEqual(this.f13222o, bVar.f13222o) && Intrinsics.areEqual(this.f13223p, bVar.f13223p);
    }

    public final Integer f() {
        return this.f13215h;
    }

    public final Boolean g() {
        return this.f13216i;
    }

    public final Integer h() {
        return this.f13222o;
    }

    public int hashCode() {
        Integer num = this.f13208a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f13209b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f13210c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f13211d;
        int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f13212e;
        int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        a aVar3 = this.f13213f;
        int hashCode6 = (hashCode5 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        a aVar4 = this.f13214g;
        int hashCode7 = (hashCode6 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        Integer num3 = this.f13215h;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.f13216i;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f13217j;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f10 = this.f13218k;
        int hashCode11 = (hashCode10 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Float f11 = this.f13219l;
        int hashCode12 = (hashCode11 + (f11 == null ? 0 : f11.hashCode())) * 31;
        String str3 = this.f13220m;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13221n;
        int hashCode14 = (hashCode13 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.f13222o;
        int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f13223p;
        return hashCode15 + (num5 != null ? num5.hashCode() : 0);
    }

    public final Integer i() {
        return this.f13223p;
    }

    public final String j() {
        return this.f13210c;
    }

    public final Integer k() {
        return this.f13209b;
    }

    public final String l() {
        return this.f13217j;
    }

    public final String m() {
        return this.f13221n;
    }

    public final String n() {
        return this.f13220m;
    }

    public final Float o() {
        return this.f13219l;
    }

    public final Float p() {
        return this.f13218k;
    }

    public String toString() {
        return "TabsAppearance(tabBarBackgroundColor=" + this.f13208a + ", tabBarItemRippleColor=" + this.f13209b + ", tabBarItemLabelVisibilityMode=" + this.f13210c + ", normal=" + this.f13211d + ", selected=" + this.f13212e + ", focused=" + this.f13213f + ", disabled=" + this.f13214g + ", tabBarItemActiveIndicatorColor=" + this.f13215h + ", tabBarItemActiveIndicatorEnabled=" + this.f13216i + ", tabBarItemTitleFontFamily=" + this.f13217j + ", tabBarItemTitleSmallLabelFontSize=" + this.f13218k + ", tabBarItemTitleLargeLabelFontSize=" + this.f13219l + ", tabBarItemTitleFontWeight=" + this.f13220m + ", tabBarItemTitleFontStyle=" + this.f13221n + ", tabBarItemBadgeBackgroundColor=" + this.f13222o + ", tabBarItemBadgeTextColor=" + this.f13223p + ")";
    }
}
