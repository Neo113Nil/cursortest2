package defpackage;

import android.content.res.Resources;
import android.os.Build;
import com.blaze.blazesdk.logger.models.BlazeLog;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.ironsource.U3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class lwl {
    public static void a(p0m p0mVar, vul vulVar, Function0 function0) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        List list;
        Object obj;
        p0mVar.getClass();
        vulVar.getClass();
        String c = p1m.c();
        tul tulVar = jdm.d;
        e8m e8mVar = tulVar != null ? tulVar.g : null;
        if (e8mVar == null || e8mVar.a) {
            e8m e8mVar2 = tulVar != null ? tulVar.g : null;
            if (e8mVar2 != null && (list = e8mVar2.g) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    c2m c2mVar = (c2m) obj;
                    if (Intrinsics.c(c2mVar.a, p0mVar.getValue()) && Intrinsics.c(c2mVar.b, c)) {
                        break;
                    }
                }
                c2m c2mVar2 = (c2m) obj;
                if (c2mVar2 != null) {
                    boolean isVersionInRange$default = yxl.isVersionInRange$default("1.17.1", c2mVar2.c, c2mVar2.d, 0, 4, null);
                    List list2 = c2mVar2.e;
                    boolean z = false;
                    if (list2 != null && !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (yxl.isVersionEqualTo$default("1.17.1", (String) it2.next(), 0, 2, null)) {
                                z = true;
                                break;
                            }
                        }
                    }
                    if (isVersionInRange$default || z) {
                        return;
                    }
                }
            }
            tul tulVar2 = jdm.d;
            e8m e8mVar3 = tulVar2 != null ? tulVar2.g : null;
            vul vulVar2 = e8mVar3 != null ? e8mVar3.e : null;
            if (vulVar2 == null || vulVar.ordinal() < vulVar2.ordinal()) {
                return;
            }
            Object invoke = function0.invoke();
            String defaultMessage = p0mVar.getDefaultMessage();
            if (invoke != null && !invoke.equals(Unit.a)) {
                defaultMessage = defaultMessage + ' ' + invoke;
            }
            BlazeLog blazeLog = new BlazeLog(defaultMessage, vulVar, null, null, null, p0mVar, 28, null);
            Map<String, Object> metadata = blazeLog.getMetadata();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("utc"));
            String format = simpleDateFormat.format(new Date());
            format.getClass();
            p0m logIdentifier = blazeLog.getLogIdentifier();
            metadata.getClass();
            logIdentifier.getClass();
            BlazeLog.INSTANCE.getClass();
            str = BlazeLog.SESSION_ID;
            metadata.put(str, p1m.a);
            str2 = BlazeLog.ID;
            metadata.put(str2, UUID.randomUUID().toString());
            str3 = BlazeLog.SDK_TYPE;
            metadata.put(str3, p1m.c());
            str4 = BlazeLog.SDK_VERSION;
            metadata.put(str4, p1m.d());
            str5 = BlazeLog.API_KEY;
            BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
            metadata.put(str5, blazeSDK.getApiKey$blazesdk_release());
            str6 = BlazeLog.DEVICE_TYPE;
            metadata.put(str6, p1m.e);
            str7 = BlazeLog.DEVICE_BRAND;
            String str17 = Build.BRAND;
            str17.getClass();
            metadata.put(str7, str17);
            str8 = BlazeLog.DEVICE_MODEL;
            String str18 = Build.MODEL;
            str18.getClass();
            metadata.put(str8, str18);
            str9 = BlazeLog.OPERATING_SYSTEM;
            metadata.put(str9, U3.d);
            str10 = BlazeLog.OPERATING_SYSTEM_VERSION;
            metadata.put(str10, Integer.valueOf(Build.VERSION.SDK_INT));
            str11 = BlazeLog.SCREEN_RESOLUTION;
            int i = Resources.getSystem().getDisplayMetrics().widthPixels;
            int i2 = Resources.getSystem().getDisplayMetrics().heightPixels;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('X');
            sb.append(i2);
            metadata.put(str11, sb.toString());
            str12 = BlazeLog.CONNECTION_TYPE;
            metadata.put(str12, p1m.a());
            str13 = BlazeLog.APP_ID;
            metadata.put(str13, p1m.c);
            str14 = BlazeLog.APP_VERSION;
            metadata.put(str14, p1m.d);
            str15 = BlazeLog.REPORTING_TIMESTAMP;
            metadata.put(str15, format);
            str16 = BlazeLog.LOG_IDENTIFIER;
            metadata.put(str16, logIdentifier.getValue());
            evl.dispatchOnIO$default(blazeSDK, null, new osl(blazeLog, null), 1, null);
        }
    }

    public static void b(p0m p0mVar, Function0 function0) {
        p0mVar.getClass();
        a(p0mVar, vul.ERROR, function0);
    }

    public static void critical$default(lwl lwlVar, p0m p0mVar, Function0 function0, int i, Object obj) {
        throw null;
    }

    public static void debug$default(lwl lwlVar, p0m p0mVar, Function0 function0, int i, Object obj) {
        throw null;
    }

    public static /* synthetic */ void error$default(lwl lwlVar, p0m p0mVar, Function0 function0, int i, Object obj) {
        throw null;
    }

    public static void info$default(lwl lwlVar, p0m p0mVar, Function0 function0, int i, Object obj) {
        throw null;
    }

    public static void warn$default(lwl lwlVar, p0m p0mVar, Function0 function0, int i, Object obj) {
        throw null;
    }
}
