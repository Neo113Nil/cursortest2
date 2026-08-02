package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nie extends hoi implements Function2 {
    public /* synthetic */ Object r;

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        nie nieVar = new nie(2, rq3Var);
        nieVar.r = obj;
        return nieVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nie) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        dsf dsfVar = new dsf();
        while (dsfVar.a < 3) {
            try {
                p2g p2gVar = w2g.b;
                iie iieVar = iie.a;
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(oie.a());
                advertisingIdInfo.getClass();
                iie.b = advertisingIdInfo;
                u2gVar = Unit.a;
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            if (w2g.a(u2gVar) != null) {
                dsfVar.a++;
            }
            if (!(u2gVar instanceof u2g)) {
                dsfVar.a = 3;
            }
        }
        return Unit.a;
    }
}
