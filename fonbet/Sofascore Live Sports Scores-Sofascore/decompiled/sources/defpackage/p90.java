package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p90 implements zff {
    public final /* synthetic */ int a;
    public final x6k b;

    public /* synthetic */ p90(x6k x6kVar, int i) {
        this.a = i;
        this.b = x6kVar;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        x6k x6kVar = this.b;
        switch (i) {
            case 0:
                return (r38) x6kVar.b;
            case 1:
                l48 l48Var = (l48) x6kVar.c;
                i2a.v(l48Var);
                return l48Var;
            default:
                return new d4a((r38) x6kVar.b, 16);
        }
    }
}
