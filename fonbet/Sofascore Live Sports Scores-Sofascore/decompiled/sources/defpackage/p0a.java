package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class p0a implements ohk, bt3 {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Integer d;

    public p0a(Integer num, Integer num2, Integer num3, Boolean bool) {
        this.a = bool;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    @Override // defpackage.ohk
    public final Integer B() {
        return this.c;
    }

    @Override // defpackage.ohk
    public final Boolean F() {
        return this.a;
    }

    @Override // defpackage.ohk
    public final Integer a() {
        return this.d;
    }

    @Override // defpackage.ohk
    public final void b(Integer num) {
        this.c = num;
    }

    @Override // defpackage.ohk
    public final void c(Integer num) {
        this.b = num;
    }

    @Override // defpackage.bt3
    public final Object copy() {
        return new p0a(this.b, this.c, this.d, this.a);
    }

    public final nhk d() {
        int i = Intrinsics.c(this.a, Boolean.TRUE) ? -1 : 1;
        Integer num = this.b;
        Integer valueOf = num != null ? Integer.valueOf(num.intValue() * i) : null;
        Integer num2 = this.c;
        Integer valueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i) : null;
        Integer num3 = this.d;
        return thk.a(valueOf, valueOf2, num3 != null ? Integer.valueOf(num3.intValue() * i) : null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0a)) {
            return false;
        }
        p0a p0aVar = (p0a) obj;
        return Intrinsics.c(this.a, p0aVar.a) && Intrinsics.c(this.b, p0aVar.b) && Intrinsics.c(this.c, p0aVar.c) && Intrinsics.c(this.d, p0aVar.d);
    }

    @Override // defpackage.ohk
    public final Integer h() {
        return this.b;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.b;
        int hashCode2 = hashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.c;
        int hashCode3 = hashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.d;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // defpackage.ohk
    public final void o(Integer num) {
        this.d = num;
    }

    public final String toString() {
        Boolean bool = this.a;
        StringBuilder sb = new StringBuilder(bool != null ? bool.booleanValue() ? "-" : "+" : " ");
        Object obj = this.b;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.d;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }

    @Override // defpackage.ohk
    public final void w(Boolean bool) {
        this.a = bool;
    }
}
