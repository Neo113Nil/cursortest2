package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ok extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ Context s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok(Context context, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = context;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        ok okVar = new ok(this.s, rq3Var);
        okVar.r = obj;
        return okVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ok) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        Context context = this.s;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) u2gVar;
        if (info == null || info.isLimitAdTrackingEnabled()) {
            return null;
        }
        return info.getId();
    }
}
