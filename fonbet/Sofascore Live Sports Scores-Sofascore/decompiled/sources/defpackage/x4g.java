package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class x4g implements b75 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5g b;

    public /* synthetic */ x4g(b5g b5gVar, int i) {
        this.a = i;
        this.b = b5gVar;
    }

    @Override // defpackage.b75
    public final double h(double d) {
        int i = this.a;
        b5g b5gVar = this.b;
        switch (i) {
            case 0:
                return llf.a(b5gVar.k.h(d), b5gVar.e, b5gVar.f);
            default:
                return b5gVar.n.h(llf.a(d, b5gVar.e, b5gVar.f));
        }
    }
}
