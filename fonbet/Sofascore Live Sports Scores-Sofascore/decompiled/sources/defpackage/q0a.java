package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class q0a implements inl, bt3 {
    public Integer a;
    public Integer b;

    public q0a(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    @Override // defpackage.inl
    public final void A(Integer num) {
        this.a = num;
    }

    @Override // defpackage.inl
    public final Integer C() {
        return this.b;
    }

    @Override // defpackage.bt3
    public final Object copy() {
        return new q0a(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0a)) {
            return false;
        }
        q0a q0aVar = (q0a) obj;
        return Intrinsics.c(this.a, q0aVar.a) && Intrinsics.c(this.b, q0aVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.b;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // defpackage.inl
    public final void r(Integer num) {
        this.b = num;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Object obj = this.a;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append('-');
        Integer num = this.b;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }

    @Override // defpackage.inl
    public final Integer u() {
        return this.a;
    }
}
