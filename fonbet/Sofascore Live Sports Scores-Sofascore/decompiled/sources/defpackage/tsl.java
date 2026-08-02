package defpackage;

import com.blaze.blazesdk.analytics.AnalyticsApi;
import com.blaze.blazesdk.logger.apis.BlazeLoggerApi;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class tsl {
    public static String a;
    public static vsl d;
    public static AnalyticsApi e;
    public static BlazeLoggerApi f;
    public static final mqi b = ypa.b(new wel(10));
    public static final mqi c = ypa.b(new wel(11));
    public static final mqi g = ypa.b(new wel(12));

    public static Object a(Class cls, String str, jod jodVar) {
        try {
            Gson create = new GsonBuilder().registerTypeAdapterFactory(new swl()).create();
            ujg ujgVar = new ujg(18);
            ujgVar.G(str);
            if (create == null) {
                throw new NullPointerException("gson == null");
            }
            ((ArrayList) ujgVar.e).add(new q49(create));
            Objects.requireNonNull(jodVar, "client == null");
            ujgVar.d = jodVar;
            return ujgVar.H().e(cls);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            return null;
        }
    }

    public static String b() {
        dql dqlVar;
        String str = a;
        if (str == null) {
            tul tulVar = jdm.d;
            List list = (tulVar == null || (dqlVar = tulVar.h) == null) ? null : dqlVar.a;
            if (list != null) {
                glf.a.getClass();
                String str2 = (String) (list.isEmpty() ? null : CollectionsKt.U(glf.b.k(list.size()), list));
                if (str2 != null) {
                    str = str2;
                    a = str;
                }
            }
            str = BlazeSDK.INSTANCE.isProd$blazesdk_release() ? "blaze-audit.clipro.tv" : "blaze-audit-uat.clipro.tv";
            a = str;
        }
        return lnb.o("https://", str, "/api/eventaudit/v1.1/");
    }
}
