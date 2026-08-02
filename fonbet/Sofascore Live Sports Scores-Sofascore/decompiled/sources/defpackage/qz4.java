package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.ImageView;
import com.inmobi.media.E3;
import com.inmobi.media.N2;
import com.sofascore.model.Country;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.newNetwork.AffiliateBanner;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qz4 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ qz4(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Integer] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<Integer> mccList;
        Object obj2 = 0;
        obj2 = 0;
        switch (this.a) {
            case 0:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_SHOW_REFERRAL", false);
            case 1:
                Context context = (Context) obj;
                context.getClass();
                Boolean bool = (Boolean) n9e.x(context, new bj4(20));
                bool.booleanValue();
                return bool;
            case 2:
                Context context2 = (Context) obj;
                context2.getClass();
                Boolean bool2 = (Boolean) n9e.x(context2, new bj4(22));
                bool2.booleanValue();
                return bool2;
            case 3:
                Context context3 = (Context) obj;
                context3.getClass();
                Boolean bool3 = (Boolean) n9e.x(context3, new bj4(23));
                bool3.booleanValue();
                return bool3;
            case 4:
                Context context4 = (Context) obj;
                context4.getClass();
                Boolean bool4 = (Boolean) n9e.x(context4, new bj4(28));
                bool4.booleanValue();
                return bool4;
            case 5:
                Context context5 = (Context) obj;
                context5.getClass();
                Boolean bool5 = (Boolean) n9e.x(context5, new bj4(25));
                bool5.booleanValue();
                return bool5;
            case 6:
                Context context6 = (Context) obj;
                context6.getClass();
                Boolean bool6 = (Boolean) n9e.x(context6, new bj4(21));
                bool6.booleanValue();
                return bool6;
            case 7:
                Context context7 = (Context) obj;
                context7.getClass();
                SharedPreferences sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext = context7.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                return Boolean.valueOf(sharedPreferences.getBoolean("FORCE_SHOW_FANTASY", false));
            case 8:
                String str = (String) obj;
                return str == null ? "None" : str;
            case 9:
                return ((mi6) obj) != null ? "android_appsflyer_personalized_onboarding" : "None";
            case 10:
                ri6 ri6Var = (ri6) obj;
                return ri6Var != null ? ri6Var.a() : "None";
            case 11:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 12:
                Country country = (Country) obj;
                String name = country != null ? country.getName() : null;
                if (country != null && (mccList = country.getMccList()) != null) {
                    obj2 = (Integer) CollectionsKt.firstOrNull(mccList);
                }
                return name + " (" + obj2 + ")";
            case 13:
                vuf vufVar = (vuf) obj;
                return dmi.r(vufVar != null ? vufVar.d() : null, " (", vufVar != null ? vufVar.getCode() : null, ")");
            case 14:
                AffiliateBanner affiliateBanner = (AffiliateBanner) obj;
                Integer valueOf = affiliateBanner != null ? Integer.valueOf(affiliateBanner.getId()) : null;
                String name2 = affiliateBanner != null ? affiliateBanner.getName() : null;
                Integer valueOf2 = affiliateBanner != null ? Integer.valueOf(affiliateBanner.getWidth()) : null;
                Integer valueOf3 = affiliateBanner != null ? Integer.valueOf(affiliateBanner.getHeight()) : null;
                StringBuilder m = wv8.m("id: ", valueOf, " ", name2, " ");
                m.append(valueOf2);
                m.append("x");
                m.append(valueOf3);
                return m.toString();
            case 15:
                xk xkVar = (xk) obj;
                return String.valueOf(xkVar != null ? xkVar.a : null);
            case 16:
                rx2 rx2Var = (rx2) obj;
                rx2Var.getClass();
                rx2Var.a.h.f(rj9.f, new tl(3, obj2));
                return Unit.a;
            case 17:
                return Unit.a;
            case 18:
                return Boolean.TRUE;
            case 19:
                return E3.a((N2) obj);
            case 20:
                gj5 gj5Var = (gj5) obj;
                gj5Var.getClass();
                return Integer.valueOf(gj5Var.a);
            case 21:
                return Unit.a;
            case 22:
                PlayerData playerData = (PlayerData) obj;
                playerData.getClass();
                String str3 = gg5.a;
                int c0 = CollectionsKt.c0(b.j(PlayerKt.E_SPORTS_TOP, PlayerKt.E_SPORTS_JUN, PlayerKt.E_SPORTS_MID, PlayerKt.E_SPORTS_ADC, PlayerKt.E_SPORTS_SUP), playerData.getPosition());
                Integer valueOf4 = c0 >= 0 ? Integer.valueOf(c0) : null;
                if (valueOf4 != null) {
                    return valueOf4;
                }
                return Integer.MAX_VALUE;
            case 23:
                PlayerData playerData2 = (PlayerData) obj;
                playerData2.getClass();
                return playerData2.getPlayer().getName();
            case 24:
                PlayerData playerData3 = (PlayerData) obj;
                playerData3.getClass();
                String str4 = gg5.a;
                int c02 = CollectionsKt.c0(b.j(PlayerKt.E_SPORTS_HARD_CARRY, PlayerKt.E_SPORTS_MID, PlayerKt.E_SPORTS_OFFLANER, PlayerKt.E_SPORTS_SOFT_SUPPORT, PlayerKt.E_SPORTS_HARD_SUPPORT), playerData3.getPosition());
                Integer valueOf5 = c02 >= 0 ? Integer.valueOf(c02) : null;
                if (valueOf5 != null) {
                    return valueOf5;
                }
                return Integer.MAX_VALUE;
            case 25:
                PlayerData playerData4 = (PlayerData) obj;
                playerData4.getClass();
                return playerData4.getPlayer().getName();
            case 26:
                os5 os5Var = (os5) obj;
                os5Var.getClass();
                return os5Var.getClass().getName();
            case 27:
                ((ha5) obj).getClass();
                return Unit.a;
            case 28:
                SharedPreferences sharedPreferences2 = (SharedPreferences) obj;
                sharedPreferences2.getClass();
                return sharedPreferences2.getString("PR_XAIST", null);
            default:
                Context context8 = (Context) obj;
                context8.getClass();
                return new ImageView(context8);
        }
    }
}
