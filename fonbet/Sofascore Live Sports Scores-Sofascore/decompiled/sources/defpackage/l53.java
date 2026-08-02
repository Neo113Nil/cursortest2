package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l53 extends n53 {
    public final /* synthetic */ int f;
    public final /* synthetic */ o53 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l53(o53 o53Var, int i) {
        super(o53Var);
        this.f = i;
        this.g = o53Var;
    }

    @Override // defpackage.n53
    public final Object a(int i) {
        int i2 = this.f;
        o53 o53Var = this.g;
        switch (i2) {
            case 0:
                return o53Var.o()[i];
            case 1:
                return new i79(o53Var, i);
            default:
                return o53Var.p()[i];
        }
    }
}
