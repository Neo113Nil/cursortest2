package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class mw6 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ Integer d;

    public /* synthetic */ mw6(Integer num, String str, xtc xtcVar, int i) {
        this.d = num;
        this.b = str;
        this.c = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Integer num = this.d;
        xtc xtcVar = this.c;
        String str = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                tgj.b(aba.K(385), of3Var, xtcVar, num, str);
                break;
            default:
                i9a.g(aba.K(1), of3Var, xtcVar, num, str);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ mw6(String str, xtc xtcVar, Integer num, int i) {
        this.b = str;
        this.c = xtcVar;
        this.d = num;
    }
}
