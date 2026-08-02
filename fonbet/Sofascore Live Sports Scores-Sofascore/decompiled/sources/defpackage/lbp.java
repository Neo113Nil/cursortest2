package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lbp extends map {
    public volatile map a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ h9p d;
    public final /* synthetic */ z6n e;
    public final /* synthetic */ nbp f;

    public lbp(nbp nbpVar, boolean z, boolean z2, h9p h9pVar, z6n z6nVar) {
        this.b = z;
        this.c = z2;
        this.d = h9pVar;
        this.e = z6nVar;
        this.f = nbpVar;
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        if (this.b) {
            e7nVar.E0();
            return null;
        }
        map mapVar = this.a;
        if (mapVar == null) {
            mapVar = this.d.c(this.f, this.e);
            this.a = mapVar;
        }
        return mapVar.read(e7nVar);
    }

    @Override // defpackage.map
    public final void write(f7n f7nVar, Object obj) {
        if (this.c) {
            f7nVar.f0();
            return;
        }
        map mapVar = this.a;
        if (mapVar == null) {
            mapVar = this.d.c(this.f, this.e);
            this.a = mapVar;
        }
        mapVar.write(f7nVar, obj);
    }
}
