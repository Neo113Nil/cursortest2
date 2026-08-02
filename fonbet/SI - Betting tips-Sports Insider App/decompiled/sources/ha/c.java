package ha;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Long f10443a;

    /* renamed from: b, reason: collision with root package name */
    public final b f10444b;

    /* renamed from: c, reason: collision with root package name */
    public final b f10445c;

    /* renamed from: d, reason: collision with root package name */
    public final b f10446d;

    /* renamed from: e, reason: collision with root package name */
    public final b f10447e;

    /* renamed from: f, reason: collision with root package name */
    public final b f10448f;

    /* renamed from: g, reason: collision with root package name */
    public final b f10449g;

    /* renamed from: h, reason: collision with root package name */
    public final b f10450h;

    public c(Long l6, b bVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, b bVar7) {
        this.f10443a = l6;
        this.f10444b = bVar;
        this.f10445c = bVar2;
        this.f10446d = bVar3;
        this.f10447e = bVar4;
        this.f10448f = bVar5;
        this.f10449g = bVar6;
        this.f10450h = bVar7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f10443a, cVar.f10443a) && Intrinsics.areEqual(this.f10444b, cVar.f10444b) && Intrinsics.areEqual(this.f10445c, cVar.f10445c) && Intrinsics.areEqual(this.f10446d, cVar.f10446d) && Intrinsics.areEqual(this.f10447e, cVar.f10447e) && Intrinsics.areEqual(this.f10448f, cVar.f10448f) && Intrinsics.areEqual(this.f10449g, cVar.f10449g) && Intrinsics.areEqual(this.f10450h, cVar.f10450h);
    }

    public final int hashCode() {
        Long l6 = this.f10443a;
        int hashCode = (l6 == null ? 0 : l6.hashCode()) * 31;
        b bVar = this.f10444b;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f10445c;
        int hashCode3 = (hashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        b bVar3 = this.f10446d;
        int hashCode4 = (hashCode3 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        b bVar4 = this.f10447e;
        int hashCode5 = (hashCode4 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
        b bVar5 = this.f10448f;
        int hashCode6 = (hashCode5 + (bVar5 == null ? 0 : bVar5.hashCode())) * 31;
        b bVar6 = this.f10449g;
        int hashCode7 = (hashCode6 + (bVar6 == null ? 0 : bVar6.hashCode())) * 31;
        b bVar7 = this.f10450h;
        return hashCode7 + (bVar7 != null ? bVar7.hashCode() : 0);
    }

    public final String toString() {
        return "PricesData(time=" + this.f10443a + ", diamondSubscription=" + this.f10444b + ", expressSingle=" + this.f10445c + ", expressSubscription=" + this.f10446d + ", premiumSingle=" + this.f10447e + ", premiumSubscription=" + this.f10448f + ", liveWeek=" + this.f10449g + ", liveMonth=" + this.f10450h + ')';
    }
}
