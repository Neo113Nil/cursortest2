package Fh;

import java.util.List;
import rh.EnumC6295m;
import rh.InterfaceC6290h;
import rh.InterfaceC6292j;
import uh.InterfaceC6579c;

/* loaded from: classes3.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final g f3683a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3684b;

    /* renamed from: c, reason: collision with root package name */
    public final g f3685c;

    /* renamed from: d, reason: collision with root package name */
    public final g f3686d;

    /* renamed from: e, reason: collision with root package name */
    public final g f3687e;

    public e(g gVar, g gVar2, g gVar3, g gVar4, g gVar5) {
        this.f3683a = gVar;
        this.f3684b = gVar2 == null ? g.a() : gVar2;
        this.f3685c = gVar3 == null ? g.d() : gVar3;
        this.f3686d = gVar4 == null ? g.a() : gVar4;
        this.f3687e = gVar5 == null ? g.d() : gVar5;
    }

    @Override // Fh.g
    public i b(InterfaceC6579c interfaceC6579c, String str, String str2, EnumC6295m enumC6295m, oh.g gVar, List list) {
        InterfaceC6292j a10 = InterfaceC6290h.f(interfaceC6579c).a();
        return !a10.isValid() ? this.f3683a.b(interfaceC6579c, str, str2, enumC6295m, gVar, list) : a10.a() ? a10.b() ? this.f3684b.b(interfaceC6579c, str, str2, enumC6295m, gVar, list) : this.f3685c.b(interfaceC6579c, str, str2, enumC6295m, gVar, list) : a10.b() ? this.f3686d.b(interfaceC6579c, str, str2, enumC6295m, gVar, list) : this.f3687e.b(interfaceC6579c, str, str2, enumC6295m, gVar, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3683a.equals(eVar.f3683a) && this.f3684b.equals(eVar.f3684b) && this.f3685c.equals(eVar.f3685c) && this.f3686d.equals(eVar.f3686d) && this.f3687e.equals(eVar.f3687e);
    }

    @Override // Fh.g
    public String getDescription() {
        return String.format("ParentBased{root:%s,remoteParentSampled:%s,remoteParentNotSampled:%s,localParentSampled:%s,localParentNotSampled:%s}", this.f3683a.getDescription(), this.f3684b.getDescription(), this.f3685c.getDescription(), this.f3686d.getDescription(), this.f3687e.getDescription());
    }

    public int hashCode() {
        return (((((((this.f3683a.hashCode() * 31) + this.f3684b.hashCode()) * 31) + this.f3685c.hashCode()) * 31) + this.f3686d.hashCode()) * 31) + this.f3687e.hashCode();
    }

    public String toString() {
        return getDescription();
    }
}
