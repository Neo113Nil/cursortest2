package defpackage;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class bob {
    public static final Map a() {
        Object obj;
        Object obj2;
        glf.a.getClass();
        Pair pair = new Pair(znb.cacheBusting, String.valueOf(glf.b.e(10000000, 99999999)));
        new Date();
        ad2 ad2Var = oc3.a;
        String format = OffsetDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        format.getClass();
        Pair pair2 = new Pair(znb.timestamp, format);
        String str = gcd.a;
        Pair pair3 = new Pair(znb.appBundle, oie.a().getPackageName());
        Pair pair4 = new Pair(znb.omidPartner, "Adsbynimbus/2.37.0");
        if (iie.b.isLimitAdTrackingEnabled()) {
            obj2 = "0";
            obj = obj2;
        } else {
            obj = "0";
            obj2 = "1";
        }
        return tub.h(pair, pair2, pair3, pair4, new Pair(znb.limitAdTracking, obj2), new Pair(znb.vastVersions, "2, 3, 5, 6, 7, 8"), new Pair(znb.adCount, "1"), new Pair(znb.adType, "video"), new Pair(znb.placementType, "1"), new Pair(znb.serverSide, obj), new Pair(znb.clickType, "1"));
    }
}
