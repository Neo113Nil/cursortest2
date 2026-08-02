package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ape implements ct8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cpe b;

    public /* synthetic */ ape(cpe cpeVar, int i) {
        this.a = i;
        this.b = cpeVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        cpe cpeVar = this.b;
        xtc xtcVar = (xtc) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                return cpe.p(cpeVar, xtcVar, of3Var, intValue);
            default:
                return cpe.s(cpeVar, xtcVar, of3Var, intValue);
        }
    }
}
