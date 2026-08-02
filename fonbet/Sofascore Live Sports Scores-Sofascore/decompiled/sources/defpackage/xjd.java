package defpackage;

import android.app.AlertDialog;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xjd extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xjd(Object obj, int i) {
        super(1);
        this.i = i;
        this.j = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        int i = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return obj == ((l0d) obj2) ? "(this)" : String.valueOf(obj);
            case 1:
                nwf nwfVar = (nwf) obj;
                zqd zqdVar = (zqd) obj2;
                wla wlaVar = zqdVar.r;
                nwf nwfVar2 = wlaVar != null ? (nwf) ((eoh) wlaVar.a).getValue() : null;
                zqdVar.x = nwfVar2;
                zqdVar.k1(zqdVar.p, nwfVar, nwfVar2);
                return Unit.a;
            case 2:
                return obj == ((m0d) obj2) ? "(this)" : String.valueOf(obj);
            case 3:
                return obj == ((y0d) obj2) ? "(this)" : String.valueOf(obj);
            case 4:
                y3h.j((b4h) obj, ((u5g) obj2).a);
                return Unit.a;
            case 5:
                ((List) obj).add((Float) ((nra) obj2).invoke());
                return true;
            case 6:
                ((yda) obj2).e(null);
                return Unit.a;
            case 7:
                f4g f4gVar = (f4g) obj;
                rah rahVar = (rah) obj2;
                f4gVar.m(f4gVar.s.j() * rahVar.a);
                f4gVar.o(rahVar.b);
                f4gVar.d(rahVar.c);
                f4gVar.c(rahVar.d);
                f4gVar.p(rahVar.e);
                return Unit.a;
            case 8:
                f4g f4gVar2 = (f4g) obj;
                lhh lhhVar = (lhh) obj2;
                f4gVar2.k(lhhVar.o);
                f4gVar2.l(lhhVar.p);
                f4gVar2.b(lhhVar.q);
                f4gVar2.w(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                f4gVar2.y(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                f4gVar2.m(lhhVar.r);
                f4gVar2.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                f4gVar2.h(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                f4gVar2.i(lhhVar.s);
                float f = lhhVar.t;
                if (f4gVar2.m != f) {
                    f4gVar2.a |= a.o;
                    f4gVar2.m = f;
                }
                f4gVar2.s(lhhVar.u);
                f4gVar2.o(lhhVar.v);
                f4gVar2.d(lhhVar.w);
                f4gVar2.f(null);
                f4gVar2.c(lhhVar.x);
                f4gVar2.p(lhhVar.y);
                f4gVar2.e(lhhVar.z);
                int i2 = lhhVar.A;
                if (f4gVar2.v != i2) {
                    f4gVar2.a |= 524288;
                    f4gVar2.v = i2;
                }
                return Unit.a;
            case 9:
                Throwable th = (Throwable) obj;
                noi noiVar = (noi) obj2;
                lj2 lj2Var = noiVar.c;
                if (lj2Var != null) {
                    lj2Var.a(th);
                }
                noiVar.c = null;
                return Unit.a;
            case 10:
                hcd hcdVar = (hcd) obj;
                hcdVar.getClass();
                d7j d7jVar = (d7j) obj2;
                lcd lcdVar = d7jVar.f;
                lcdVar.e = d7jVar;
                lcdVar.removeAllViews();
                of ofVar = d7jVar.g;
                if (ofVar != null) {
                    ofVar.a();
                }
                fhh fhhVar = qyf.a;
                rik.t(hcdVar, lcdVar, d7jVar);
                return Unit.a;
            case 11:
                ((AlertDialog) obj2).dismiss();
                return Unit.a;
            case 12:
                v6l v6lVar = (v6l) ((List) obj2).get(((Number) obj).intValue());
                if (v6lVar instanceof r6l) {
                    j = ((r6l) v6lVar).a.getId();
                } else {
                    if (!(v6lVar instanceof u6l)) {
                        zzl.b();
                        return null;
                    }
                    j = -((u6l) v6lVar).a.getId();
                }
                return Long.valueOf(j);
            default:
                String str = ((k38) obj).a;
                str.getClass();
                return new k38(kda.K(str, (tm0) obj2));
        }
    }
}
