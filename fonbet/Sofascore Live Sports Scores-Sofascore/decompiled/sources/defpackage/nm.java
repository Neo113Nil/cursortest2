package defpackage;

import com.sofascore.model.chat.AirCashData;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.model.profile.UserBadge;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class nm {
    public static final AirCashData a;
    public static final ChatUser b;
    public static final LinkedHashMap c;
    public static int d;
    public static int e;
    public static int f;
    public static long g;

    static {
        Object u2gVar;
        yea yeaVar = j58.a;
        e58 f2 = e58.f();
        f2.getClass();
        String g2 = f2.g("air_cash_promotion");
        Object obj = null;
        if (g2.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(l98.W(AirCashData.INSTANCE.serializer()), g2);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            Throwable a2 = w2g.a(u2gVar);
            if (a2 != null) {
                s38.a().c(a2);
            }
            if (!(u2gVar instanceof u2g)) {
                obj = u2gVar;
            }
        }
        AirCashData airCashData = (AirCashData) obj;
        if (airCashData == null) {
            airCashData = new AirCashData(0, 0, 0, 0, 0, "", "");
        }
        a = airCashData;
        b = new ChatUser("air_cash", airCashData.getUsername(), false, false, false, false, (String) null, (String) null, 0, 0, (UserBadge) null, 2044, (DefaultConstructorMarker) null);
        c = new LinkedHashMap();
        d();
    }

    public static Message a() {
        Message message = new Message(a.getMessage(), b, g + 1, 0, 0, true);
        message.setLinkify(true);
        message.setAd(true);
        d();
        return message;
    }

    public static boolean b(int i) {
        AirCashData airCashData = a;
        if (airCashData.getShowEventPercentage() > 0) {
            Integer valueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = c;
            if (linkedHashMap.containsKey(valueOf)) {
                return true;
            }
            glf.a.getClass();
            r2 = glf.b.k(100) + 1 <= airCashData.getShowEventPercentage();
            linkedHashMap.put(Integer.valueOf(i), Boolean.valueOf(r2));
        }
        return r2;
    }

    public static boolean c(long j) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        int i = d + 1;
        d = i;
        if (g + f >= currentTimeMillis || i < e) {
            return false;
        }
        g = j;
        return true;
    }

    public static void d() {
        d = 0;
        g = 0L;
        flf flfVar = glf.a;
        AirCashData airCashData = a;
        int minMessageDistance = airCashData.getMinMessageDistance();
        int maxMessageDistance = airCashData.getMaxMessageDistance() + 1;
        flfVar.getClass();
        d7 d7Var = glf.b;
        e = d7Var.e(minMessageDistance, maxMessageDistance);
        f = d7Var.e(airCashData.getMinTimeDistance(), airCashData.getMaxTimeDistance() + 1);
    }
}
