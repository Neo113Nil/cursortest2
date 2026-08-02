package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class fr4 implements tmi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fr4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tmi
    public final Object get() {
        int i = this.a;
        Object obj = this.c;
        p03 p03Var = (p03) this.b;
        switch (i) {
            case 0:
                return new gdf((ne4) obj, (gp4) p03Var.b);
            default:
                return new hdf((oe4) obj, (hp4) p03Var.b);
        }
    }
}
