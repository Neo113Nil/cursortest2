package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class tqd extends ot8 implements ct8 {
    public static final tqd b = new tqd(3, uqd.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uqd uqdVar = (uqd) obj;
        h2h h2hVar = (h2h) obj2;
        long j = uqdVar.a;
        if (j <= 0) {
            h2hVar.e = Unit.a;
        } else {
            gjc gjcVar = new gjc(11, h2hVar, uqdVar);
            h2hVar.getClass();
            CoroutineContext coroutineContext = h2hVar.a;
            h2hVar.c = n4o.E(coroutineContext).g(j, gjcVar, coroutineContext);
        }
        return Unit.a;
    }
}
