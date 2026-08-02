package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.ironsource.E9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.tub;
import defpackage.y6a;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class V0 {
    public static final V0 a = new V0();

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        U0 u0;
        int i;
        AdResponse adResponse;
        try {
            if (sq3Var instanceof U0) {
                u0 = (U0) sq3Var;
                int i2 = u0.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    u0.c = i2 - Integer.MIN_VALUE;
                    Object obj = u0.a;
                    lu3 lu3Var = lu3.a;
                    i = u0.c;
                    if (i != 0) {
                        y6a.M(obj);
                        u0.c = 1;
                        obj = AdResponse.class.cast(AbstractC3907ya.a(new JSONObject(str), AdResponse.class, null, null));
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
                    adResponse = (AdResponse) obj;
                    if (adResponse == null) {
                        return adResponse;
                    }
                    throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3527jj(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, new Short((short) 2232)))));
                }
            }
            if (i != 0) {
            }
            adResponse = (AdResponse) obj;
            if (adResponse == null) {
            }
        } catch (Exception e) {
            int i3 = !(e instanceof JSONException) ? e instanceof ClassCastException ? 2207 : E9.a.g : 2113;
            e.toString();
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C3527jj(tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, new Short((short) i3)))));
        }
        u0 = new U0(this, sq3Var);
        Object obj2 = u0.a;
        lu3 lu3Var2 = lu3.a;
        i = u0.c;
    }
}
