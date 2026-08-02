package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class jyg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e93 b;
    public final /* synthetic */ pyg c;

    public /* synthetic */ jyg(e93 e93Var, pyg pygVar) {
        this.a = 1;
        this.b = e93Var;
        this.c = pygVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        e93 e93Var = this.b;
        pyg pygVar = this.c;
        switch (i) {
            case 0:
                gyg gygVar = (gyg) obj;
                gygVar.getClass();
                tee teeVar = gygVar.d;
                pygVar.getClass();
                return gyg.a(gygVar, pyg.u(teeVar, e93Var), null, null, null, null, 247);
            case 1:
                gyg gygVar2 = (gyg) obj;
                gygVar2.getClass();
                return gyg.a(gygVar2, gygVar2.d.put((Object) e93Var, (Object) new i73(pygVar.B(e93Var), pygVar.o, pygVar.p)), null, null, null, null, 247);
            default:
                i73 i73Var = (i73) obj;
                i73Var.getClass();
                return new i73(pygVar.B(e93Var), i73Var.c, i73Var.d);
        }
    }

    public /* synthetic */ jyg(pyg pygVar, e93 e93Var, int i) {
        this.a = i;
        this.c = pygVar;
        this.b = e93Var;
    }
}
