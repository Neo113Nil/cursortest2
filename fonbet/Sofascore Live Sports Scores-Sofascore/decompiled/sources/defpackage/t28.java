package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t28 implements q4a {
    public final q4a a;
    public final q4a b;

    public t28(q4a q4aVar, q4a q4aVar2) {
        this.a = q4aVar;
        this.b = q4aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t28.class != obj.getClass()) {
            return false;
        }
        t28 t28Var = (t28) obj;
        return this.a.equals(t28Var.a) && Intrinsics.c(this.b, t28Var.b) && Intrinsics.c(k(), t28Var.k());
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 32;
        kja k = k();
        return hashCode + (k != null ? k.hashCode() : 0);
    }

    @Override // defpackage.q4a
    public final void i(b4h b4hVar) {
        this.a.i(b4hVar);
        this.b.i(b4hVar);
    }

    @Override // defpackage.q4a
    public final void j(l9j l9jVar) {
        this.a.j(l9jVar);
        this.b.j(l9jVar);
    }

    @Override // defpackage.q4a
    public final kja k() {
        kja k = this.b.k();
        q4a q4aVar = this.a;
        return k != null ? k.b(q4aVar.k()) : q4aVar.k();
    }

    public final String toString() {
        return this.a + ".then(" + this.b + ')';
    }
}
