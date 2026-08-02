package defpackage;

import com.blaze.blazesdk.ads.custom_native.BlazeGoogleCustomNativeAdsHandler;
import com.blaze.blazesdk.ads.custom_native.models.BlazeAdRequestData;
import com.blaze.blazesdk.ads.custom_native.models.BlazeGoogleCustomNativeAdModel;
import com.blaze.blazesdk.shared.BlazeSDK;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pwl {
    public static final pwl a = new pwl();
    public static final Map b;

    static {
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        synchronizedMap.getClass();
        b = synchronizedMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(BlazeAdRequestData blazeAdRequestData, sq3 sq3Var) {
        sql sqlVar;
        int i;
        BlazeGoogleCustomNativeAdModel blazeGoogleCustomNativeAdModel;
        try {
            if (sq3Var instanceof sql) {
                sqlVar = (sql) sq3Var;
                int i2 = sqlVar.t;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sqlVar.t = i2 - Integer.MIN_VALUE;
                    Object obj = sqlVar.r;
                    lu3 lu3Var = lu3.a;
                    i = sqlVar.t;
                    if (i != 0) {
                        y6a.M(obj);
                        try {
                            blazeGoogleCustomNativeAdModel = (BlazeGoogleCustomNativeAdModel) b.remove(new Integer(blazeAdRequestData.hashCode()));
                        } catch (Throwable unused) {
                            blazeGoogleCustomNativeAdModel = null;
                        }
                        if (blazeGoogleCustomNativeAdModel != null) {
                            return blazeGoogleCustomNativeAdModel;
                        }
                        BlazeGoogleCustomNativeAdsHandler googleCustomNativeAdsHandler$blazesdk_release = BlazeSDK.INSTANCE.getGoogleCustomNativeAdsHandler$blazesdk_release();
                        if (googleCustomNativeAdsHandler$blazesdk_release == null) {
                            return null;
                        }
                        sqlVar.t = 1;
                        obj = googleCustomNativeAdsHandler$blazesdk_release.provideAd(blazeAdRequestData, sqlVar);
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
                    return (BlazeGoogleCustomNativeAdModel) obj;
                }
            }
            if (i != 0) {
            }
            return (BlazeGoogleCustomNativeAdModel) obj;
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return null;
        }
        sqlVar = new sql(this, sq3Var);
        Object obj2 = sqlVar.r;
        lu3 lu3Var2 = lu3.a;
        i = sqlVar.t;
    }
}
