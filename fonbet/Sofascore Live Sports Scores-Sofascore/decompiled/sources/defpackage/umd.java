package defpackage;

import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class umd {
    public final NetworkCoroutineAPI a;

    public umd(NetworkCoroutineAPI networkCoroutineAPI) {
        networkCoroutineAPI.getClass();
        this.a = networkCoroutineAPI;
    }

    public static /* synthetic */ Object e(umd umdVar, OddsCountryProvider oddsCountryProvider, String str, Function2 function2, hoi hoiVar, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        return umdVar.d(oddsCountryProvider, str, true, function2, hoiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, sq3 sq3Var) {
        hmd hmdVar;
        int i3;
        if (sq3Var instanceof hmd) {
            hmdVar = (hmd) sq3Var;
            int i4 = hmdVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hmdVar.t = i4 - Integer.MIN_VALUE;
                Object obj = hmdVar.r;
                lu3 lu3Var = lu3.a;
                i3 = hmdVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    fmd fmdVar = new fmd(this, i, i2, null, 1);
                    hmdVar.t = 1;
                    obj = yaa.P(fmdVar, hmdVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        hmdVar = new hmd(this, sq3Var);
        Object obj2 = hmdVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = hmdVar.t;
        if (i3 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object b(Event event, OddsCountryProvider oddsCountryProvider, hoi hoiVar) {
        return s9a.r(new kmd(this, oddsCountryProvider, event, (rq3) null, 0), hoiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, int i2, sq3 sq3Var) {
        rmd rmdVar;
        int i3;
        boolean z;
        if (sq3Var instanceof rmd) {
            rmdVar = (rmd) sq3Var;
            int i4 = rmdVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rmdVar.t = i4 - Integer.MIN_VALUE;
                Object obj = rmdVar.r;
                lu3 lu3Var = lu3.a;
                i3 = rmdVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    if (i2 != 1) {
                        z = false;
                        return Boolean.valueOf(z);
                    }
                    fmd fmdVar = new fmd(this, i, i2, null, 5);
                    rmdVar.t = 1;
                    obj = yaa.P(fmdVar, rmdVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                z = x2gVar instanceof v2g;
                return Boolean.valueOf(z);
            }
        }
        rmdVar = new rmd(this, sq3Var);
        Object obj2 = rmdVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = rmdVar.t;
        if (i3 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        z = x2gVar2 instanceof v2g;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(OddsCountryProvider oddsCountryProvider, String str, boolean z, Function2 function2, sq3 sq3Var) {
        tmd tmdVar;
        Object obj;
        int i;
        int i2;
        Integer num;
        OddsCountryProvider oddsCountryProvider2;
        Function2 function22;
        boolean z2;
        OddsCountryProvider oddsCountryProvider3;
        if (sq3Var instanceof tmd) {
            tmdVar = (tmd) sq3Var;
            int i3 = tmdVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tmdVar.y = i3 - Integer.MIN_VALUE;
                obj = tmdVar.w;
                lu3 lu3Var = lu3.a;
                i = tmdVar.y;
                if (i != 0) {
                    y6a.M(obj);
                    int oddsDisplayProviderId = oddsCountryProvider.getProvider().getOddsDisplayProviderId(str);
                    OddsProvider fallbackProvider = oddsCountryProvider.getFallbackProvider();
                    Integer num2 = fallbackProvider != null ? new Integer(fallbackProvider.getId()) : null;
                    Integer num3 = new Integer(oddsDisplayProviderId);
                    tmdVar.r = oddsCountryProvider;
                    tmdVar.s = (hoi) function2;
                    tmdVar.t = num2;
                    tmdVar.u = z;
                    tmdVar.v = oddsDisplayProviderId;
                    tmdVar.y = 1;
                    Object invoke = function2.invoke(num3, tmdVar);
                    if (invoke != lu3Var) {
                        i2 = oddsDisplayProviderId;
                        obj = invoke;
                        num = num2;
                        oddsCountryProvider2 = oddsCountryProvider;
                        function22 = function2;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = tmdVar.u;
                    num = tmdVar.t;
                    oddsCountryProvider3 = tmdVar.r;
                    y6a.M(obj);
                    if (obj != null) {
                        if (z2) {
                            oddsCountryProvider3.getProvider().setFallbackOddsId(num);
                        }
                        return obj;
                    }
                    return null;
                }
                i2 = tmdVar.v;
                z = tmdVar.u;
                num = tmdVar.t;
                Function2 function23 = (Function2) tmdVar.s;
                oddsCountryProvider2 = tmdVar.r;
                y6a.M(obj);
                function22 = function23;
                if (obj == null) {
                    return obj;
                }
                if (num != null) {
                    Integer num4 = num.intValue() != i2 ? num : null;
                    if (num4 != null) {
                        Integer num5 = new Integer(num4.intValue());
                        tmdVar.r = oddsCountryProvider2;
                        tmdVar.s = null;
                        tmdVar.t = num;
                        tmdVar.u = z;
                        tmdVar.v = i2;
                        tmdVar.y = 2;
                        obj = function22.invoke(num5, tmdVar);
                        if (obj != lu3Var) {
                            z2 = z;
                            oddsCountryProvider3 = oddsCountryProvider2;
                            if (obj != null) {
                            }
                        }
                        return lu3Var;
                    }
                }
                return null;
            }
        }
        tmdVar = new tmd(this, sq3Var);
        obj = tmdVar.w;
        lu3 lu3Var2 = lu3.a;
        i = tmdVar.y;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }
}
