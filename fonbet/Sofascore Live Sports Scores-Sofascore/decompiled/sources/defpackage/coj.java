package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class coj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gv9 b;
    public final /* synthetic */ gv9 c;
    public final /* synthetic */ qnj d;

    public /* synthetic */ coj(gv9 gv9Var, gv9 gv9Var2, qnj qnjVar, int i) {
        this.a = i;
        this.b = gv9Var;
        this.c = gv9Var2;
        this.d = qnjVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ynj ynjVar = (ynj) obj;
                ynjVar.getClass();
                return ynj.a(ynjVar, this.b, this.c, null, false, this.d, 12);
            default:
                return ynj.a((ynj) obj, this.b, this.c, null, false, this.d, 28);
        }
    }
}
