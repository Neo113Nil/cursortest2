package defpackage;

import com.sofascore.model.newNetwork.AffiliateBanner;
import com.sofascore.model.newNetwork.AffiliateBannersResponse;
import com.sofascore.network.api.NetworkCoroutineAPI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class el {
    public final NetworkCoroutineAPI a;

    public el(NetworkCoroutineAPI networkCoroutineAPI) {
        networkCoroutineAPI.getClass();
        this.a = networkCoroutineAPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        al alVar;
        int i;
        AffiliateBannersResponse affiliateBannersResponse;
        List<AffiliateBanner> ads;
        if (sq3Var instanceof al) {
            alVar = (al) sq3Var;
            int i2 = alVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alVar.t = i2 - Integer.MIN_VALUE;
                Object obj = alVar.r;
                lu3 lu3Var = lu3.a;
                i = alVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    bl blVar = new bl(this, str, rq3Var, 0);
                    alVar.t = 1;
                    obj = yaa.P(blVar, alVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                affiliateBannersResponse = (AffiliateBannersResponse) yaa.x((x2g) obj);
                if (affiliateBannersResponse != null || (ads = affiliateBannersResponse.getAds()) == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : ads) {
                    if (Intrinsics.c(((AffiliateBanner) obj2).getType(), "html")) {
                        arrayList.add(obj2);
                    }
                }
                return CollectionsKt.H0(arrayList, new qe8(9));
            }
        }
        alVar = new al(this, sq3Var);
        Object obj3 = alVar.r;
        lu3 lu3Var2 = lu3.a;
        i = alVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        affiliateBannersResponse = (AffiliateBannersResponse) yaa.x((x2g) obj3);
        if (affiliateBannersResponse != null) {
        }
        return null;
    }
}
