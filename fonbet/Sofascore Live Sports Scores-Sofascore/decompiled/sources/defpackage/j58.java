package defpackage;

import com.sofascore.model.AnalystOfferRemoteConfig;
import com.sofascore.model.firebase.HiddenOddsTournaments;
import com.sofascore.model.firebase.RemoteAdConfig;
import com.sofascore.model.wc26.WorldCupRound;
import com.sofascore.model.wc26.WorldCupTimeline;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class j58 {
    public static final yea a;

    static {
        bga bgaVar = vga.a;
        a = vga.a;
    }

    public static List a() {
        Object u2gVar;
        yea yeaVar = a;
        e58 f = e58.f();
        f.getClass();
        String g = f.g("chat_translate_availableTranslations");
        Object obj = null;
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(l98.W(new xg0(uhi.a, 0)), g);
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
        List list = (List) obj;
        return list == null ? km5.a : list;
    }

    public static RemoteAdConfig b() {
        Object u2gVar;
        yea yeaVar = a;
        e58 f = e58.f();
        f.getClass();
        nxf[] nxfVarArr = nxf.a;
        String g = f.g("ad_inventory_config");
        Object obj = null;
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(l98.W(RemoteAdConfig.INSTANCE.serializer()), g);
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
        return (RemoteAdConfig) obj;
    }

    public static AnalystOfferRemoteConfig c() {
        Object u2gVar;
        yea yeaVar = a;
        e58 f = e58.f();
        f.getClass();
        String g = f.g("analyst_offer_dates");
        Object obj = null;
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(l98.W(AnalystOfferRemoteConfig.INSTANCE.serializer()), g);
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
        return (AnalystOfferRemoteConfig) obj;
    }

    public static List d() {
        Object u2gVar;
        yea yeaVar = a;
        e58 f = e58.f();
        f.getClass();
        String g = f.g("baseball_knockout_tournaments");
        Object obj = null;
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(l98.W(new xg0(a7a.a, 0)), g);
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
        List list = (List) obj;
        return list == null ? km5.a : list;
    }

    public static List e() {
        Object u2gVar;
        yea yeaVar = a;
        e58 f = e58.f();
        f.getClass();
        nxf[] nxfVarArr = nxf.a;
        String g = f.g("fantasy_announcements");
        Object obj = null;
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(new xg0(FantasyRemoteAnnouncement.Companion.serializer(), 0), g);
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
        List list = (List) obj;
        return list == null ? km5.a : list;
    }

    public static List f(String str) {
        Object u2gVar;
        Map<String, List<Integer>> tournaments;
        List<Integer> list;
        yea yeaVar = a;
        e58 f = e58.f();
        f.getClass();
        String g = f.g("country_hidden_odds_tournaments");
        Object obj = null;
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(HiddenOddsTournaments.INSTANCE.serializer(), g);
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
        HiddenOddsTournaments hiddenOddsTournaments = (HiddenOddsTournaments) obj;
        return (hiddenOddsTournaments == null || (tournaments = hiddenOddsTournaments.getTournaments()) == null || (list = tournaments.get(str)) == null) ? km5.a : list;
    }

    public static List g() {
        Object u2gVar;
        yea yeaVar = a;
        e58 f = e58.f();
        f.getClass();
        String g = f.g("world_cup_rounds");
        Object obj = null;
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(l98.W(new xg0(WorldCupRound.INSTANCE.serializer(), 0)), g);
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
        List list = (List) obj;
        return list == null ? km5.a : list;
    }

    public static WorldCupTimeline h() {
        Object u2gVar;
        yea yeaVar = a;
        e58 f = e58.f();
        f.getClass();
        String g = f.g("world_cup_timestamps");
        Object obj = null;
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(WorldCupTimeline.INSTANCE.serializer(), g);
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
        return (WorldCupTimeline) obj;
    }

    public static boolean i(Integer num, String str) {
        return Boolean.valueOf(CollectionsKt.R(f(str), num)).equals(Boolean.TRUE);
    }

    public static boolean j() {
        return fn0.B("analyst_world_cup_offer_enabled");
    }

    public static boolean k() {
        return fn0.B("show_basketball_rating");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (defpackage.iie.c.length() > 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(boolean z) {
        ia0 ia0Var = ia0.q;
        xk b = pk.b(ok3.p(), false);
        if (z) {
            String str = gcd.a;
            if (iie.d.length() > 0) {
            }
        }
        return b != null ? b == xk.c : fn0.B("nimbus_ads_enabled");
    }
}
