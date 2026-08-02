package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tw0 extends vw0 {
    public final int a;
    public final r9k b;
    public final m9k c;
    public final Integer d;

    public tw0(int i, r9k r9kVar, m9k m9kVar, Integer num) {
        this.a = i;
        this.b = r9kVar;
        this.c = m9kVar;
        this.d = num;
    }

    @Override // defpackage.vw0
    public final Integer a() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.vw0
    public final r9k b() {
        return this.b;
    }

    @Override // defpackage.vw0
    public final r9k c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw0)) {
            return false;
        }
        tw0 tw0Var = (tw0) obj;
        return this.a == tw0Var.a && this.b.equals(tw0Var.b) && this.c.equals(tw0Var.c) && Intrinsics.c(this.d, tw0Var.d);
    }

    public final int hashCode() {
        int c = dmi.c((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c.a);
        Integer num = this.d;
        return c + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Manager(id=" + this.a + ", label=" + this.b + ", name=" + this.c + ", teamId=" + this.d + ")";
    }
}
