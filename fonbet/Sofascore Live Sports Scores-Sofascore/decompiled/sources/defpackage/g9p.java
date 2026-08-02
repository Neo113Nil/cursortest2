package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g9p extends efp {
    public map a = null;

    @Override // defpackage.efp
    public final map a() {
        map mapVar = this.a;
        if (mapVar != null) {
            return mapVar;
        }
        a70.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        map mapVar = this.a;
        if (mapVar != null) {
            return mapVar.read(e7nVar);
        }
        a70.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        return null;
    }

    @Override // defpackage.map
    public final void write(f7n f7nVar, Object obj) {
        map mapVar = this.a;
        if (mapVar != null) {
            mapVar.write(f7nVar, obj);
        } else {
            a70.r("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
    }
}
