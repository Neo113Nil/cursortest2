package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class t1f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vh b;

    public /* synthetic */ t1f(vh vhVar, int i) {
        this.a = i;
        this.b = vhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        yda ydaVar = null;
        vh vhVar = this.b;
        switch (i) {
            case 0:
                yda ydaVar2 = (yda) obj;
                if (ydaVar2 != null) {
                    ydaVar2.n(new t1f(vhVar, 1));
                    ydaVar = ydaVar2;
                }
                vhVar.e = ydaVar;
                break;
            default:
                vhVar.e = null;
                break;
        }
        return Unit.a;
    }
}
