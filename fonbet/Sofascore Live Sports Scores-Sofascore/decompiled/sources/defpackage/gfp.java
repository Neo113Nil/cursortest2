package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gfp implements nap {
    public final z6n a;
    public final boolean b;
    public final p7o c;

    public gfp(Object obj, z6n z6nVar, boolean z) {
        p7o p7oVar = obj instanceof p7o ? (p7o) obj : null;
        this.c = p7oVar;
        if (p7oVar != null) {
            this.a = z6nVar;
            this.b = z;
        } else {
            Objects.requireNonNull(obj);
            String name = obj.getClass().getName();
            a70.p(wt3.m("Type adapter ", name, new StringBuilder(name.length() + 63), " must implement JsonSerializer or JsonDeserializer"));
            throw null;
        }
    }

    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        z6n z6nVar2 = this.a;
        if (z6nVar2.equals(z6nVar) || (this.b && z6nVar2.b == z6nVar.a)) {
            return new hfp(this.c, h9pVar, z6nVar, this, true);
        }
        return null;
    }
}
