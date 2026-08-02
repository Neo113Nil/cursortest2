package defpackage;

import java.lang.reflect.Type;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hfp extends efp {
    public final p7o a;
    public final h9p b;
    public final z6n c;
    public final nap d;
    public final boolean e;
    public volatile map f;

    public hfp(p7o p7oVar, h9p h9pVar, z6n z6nVar, nap napVar, boolean z) {
        this.a = p7oVar;
        this.b = h9pVar;
        this.c = z6nVar;
        this.d = napVar;
        this.e = z;
    }

    @Override // defpackage.efp
    public final map a() {
        if (this.a != null) {
            return this;
        }
        map mapVar = this.f;
        if (mapVar != null) {
            return mapVar;
        }
        map c = this.b.c(this.d, this.c);
        this.f = c;
        return c;
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        map mapVar = this.f;
        if (mapVar == null) {
            mapVar = this.b.c(this.d, this.c);
            this.f = mapVar;
        }
        return mapVar.read(e7nVar);
    }

    @Override // defpackage.map
    public final void write(f7n f7nVar, Object obj) {
        if (this.a == null) {
            map mapVar = this.f;
            if (mapVar == null) {
                mapVar = this.b.c(this.d, this.c);
                this.f = mapVar;
            }
            mapVar.write(f7nVar, obj);
            return;
        }
        if (this.e && obj == null) {
            f7nVar.f0();
        } else {
            Type type = this.c.b;
            throw fn0.h(obj);
        }
    }
}
