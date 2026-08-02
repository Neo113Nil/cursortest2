package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class iea extends ot8 implements ct8 {
    public static final iea b = new iea(3, kea.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kea keaVar = (kea) obj;
        h2h h2hVar = (h2h) obj2;
        int i = kea.c;
        while (true) {
            Object O = keaVar.O();
            if (!(O instanceof k0a)) {
                if (!(O instanceof eb3)) {
                    O = lea.a(O);
                }
                h2hVar.e = O;
            } else if (keaVar.f0(O) >= 0) {
                h2hVar.c = bea.A(keaVar, true, new hea(keaVar, h2hVar));
                break;
            }
        }
        return Unit.a;
    }
}
