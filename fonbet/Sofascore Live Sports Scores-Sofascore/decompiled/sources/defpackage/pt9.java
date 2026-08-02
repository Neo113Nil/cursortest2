package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class pt9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsf b;

    public /* synthetic */ pt9(dsf dsfVar, int i) {
        this.a = i;
        this.b = dsfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        dsf dsfVar = this.b;
        switch (i) {
            case 0:
                int i2 = dsfVar.a;
                dsfVar.a = i2 + 1;
                return i2 + ":" + ((awj) obj).a();
            default:
                aej aejVar = (aej) obj;
                aejVar.getClass();
                v6a it = llf.j(0, aejVar.b.f).iterator();
                if (!it.c) {
                    yhk.d();
                    return null;
                }
                int nextInt = it.nextInt();
                int ceil = (int) Math.ceil(aejVar.g(nextInt) - aejVar.f(nextInt));
                while (it.c) {
                    int nextInt2 = it.nextInt();
                    int ceil2 = (int) Math.ceil(aejVar.g(nextInt2) - aejVar.f(nextInt2));
                    if (ceil < ceil2) {
                        ceil = ceil2;
                    }
                }
                dsfVar.a = ceil;
                return Unit.a;
        }
    }
}
