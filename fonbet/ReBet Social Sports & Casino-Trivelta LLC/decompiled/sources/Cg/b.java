package Cg;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2270a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2271b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2272c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2273d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2274e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2275f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2276g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2277h;

    /* renamed from: i, reason: collision with root package name */
    public final a f2278i;

    public b(String name, String str, String str2, String str3, Object obj, String str4, boolean z10, boolean z11, a aVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2270a = name;
        this.f2271b = str;
        this.f2272c = str2;
        this.f2273d = str3;
        this.f2274e = obj;
        this.f2275f = str4;
        this.f2276g = z10;
        this.f2277h = z11;
        this.f2278i = aVar;
    }

    public final Object a() {
        return this.f2274e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f2270a, bVar.f2270a) && Intrinsics.areEqual(this.f2271b, bVar.f2271b) && Intrinsics.areEqual(this.f2272c, bVar.f2272c) && Intrinsics.areEqual(this.f2273d, bVar.f2273d) && Intrinsics.areEqual(this.f2274e, bVar.f2274e) && Intrinsics.areEqual(this.f2275f, bVar.f2275f) && this.f2276g == bVar.f2276g && this.f2277h == bVar.f2277h && Intrinsics.areEqual(this.f2278i, bVar.f2278i);
    }

    public int hashCode() {
        int hashCode = this.f2270a.hashCode() * 31;
        String str = this.f2271b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2272c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2273d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.f2274e;
        int hashCode5 = (hashCode4 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str4 = this.f2275f;
        int hashCode6 = (((((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.f2276g)) * 31) + Boolean.hashCode(this.f2277h)) * 31;
        a aVar = this.f2278i;
        return hashCode6 + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ZSIQAVMetaData(name=" + this.f2270a + ", mediaId=" + this.f2271b + ", conversationId=" + this.f2272c + ", location=" + this.f2273d + ", profileImage=" + this.f2274e + ", userEmail=" + this.f2275f + ", isDirectCall=" + this.f2276g + ", isTransferCall=" + this.f2277h + ", ringingTimerConfig=" + this.f2278i + ')';
    }
}
