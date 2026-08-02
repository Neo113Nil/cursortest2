package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class bj4 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ bj4(zh9 zh9Var) {
        this.a = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                wtg wtgVar = new wtg(new wc4(4), new wc4(5));
                KProperty[] kPropertyArr = y3h.a;
                a4h a4hVar = w3h.v;
                KProperty kProperty = y3h.a[12];
                ((b4h) obj).a(a4hVar, wtgVar);
                return Unit.a;
            case 1:
                return Unit.a;
            case 2:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int intValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new pr4(intValue, ((Float) obj3).floatValue(), new el2(list, 1));
            case 3:
                kh9 kh9Var = (kh9) obj;
                kh9Var.getClass();
                kh9Var.c = false;
                kh9Var.a.add(new ok0(2, null));
                return Unit.a;
            case 4:
                y3h.m((b4h) obj);
                return Unit.a;
            case 5:
                ((Context) obj).getClass();
                ia0 ia0Var = ia0.q;
                return Boolean.valueOf(ok3.p().e().getForceAds());
            case 6:
                ((Context) obj).getClass();
                ia0 ia0Var2 = ia0.q;
                return Boolean.valueOf(ok3.p().e().getShowTestRating());
            case 7:
                Context context = (Context) obj;
                context.getClass();
                Boolean bool = (Boolean) n9e.x(context, new bj4(18));
                bool.booleanValue();
                return bool;
            case 8:
                Context context2 = (Context) obj;
                context2.getClass();
                Boolean bool2 = (Boolean) n9e.x(context2, new bj4(29));
                bool2.booleanValue();
                return bool2;
            case 9:
                Context context3 = (Context) obj;
                context3.getClass();
                Boolean bool3 = (Boolean) n9e.x(context3, new bj4(19));
                bool3.booleanValue();
                return bool3;
            case 10:
                Context context4 = (Context) obj;
                context4.getClass();
                Boolean bool4 = (Boolean) n9e.x(context4, new bj4(15));
                bool4.booleanValue();
                return bool4;
            case 11:
                Context context5 = (Context) obj;
                context5.getClass();
                Boolean bool5 = (Boolean) n9e.x(context5, new qz4(objArr == true ? 1 : 0));
                bool5.booleanValue();
                return bool5;
            case 12:
                Context context6 = (Context) obj;
                context6.getClass();
                Boolean bool6 = (Boolean) n9e.x(context6, new bj4(17));
                bool6.booleanValue();
                return bool6;
            case 13:
                Context context7 = (Context) obj;
                context7.getClass();
                Boolean bool7 = (Boolean) n9e.x(context7, new bj4(26));
                bool7.booleanValue();
                return bool7;
            case 14:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_FORCE_DEVICE_TIME", false);
            case 15:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_SHORTEN_AI_RELEVANCE", false);
            case 16:
                Context context8 = (Context) obj;
                context8.getClass();
                Boolean bool8 = (Boolean) n9e.x(context8, new bj4(24));
                bool8.booleanValue();
                return bool8;
            case 17:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_FEED_IGNORE_CARD_RULES", false);
            case 18:
                return vxd.i((SharedPreferences) obj, "PREF_FORCE_SHOW_LEADERBOARD_NOTIFICATION", false);
            case 19:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_UNSAFE_NETWORK", false);
            case 20:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_SHOW_WORLD_CUP", false);
            case 21:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_SIMULATE_LOW_RAM", false);
            case 22:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_FORCE_LIVE_ACTION_WIDGET", false);
            case 23:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_LEAK_CANARY_ENABLED", false);
            case 24:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_SHOW_SOFA_SEASON", false);
            case 25:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_MULTI_ENTITY_COMPARISON", false);
            case 26:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                sharedPreferences.getClass();
                Boolean bool9 = nv.b;
                return Boolean.valueOf(sharedPreferences.getBoolean("DEV_MODE_FORCE_TELEMETRY", bool9 != null ? bool9.booleanValue() : false));
            case 27:
                Context context9 = (Context) obj;
                context9.getClass();
                Boolean bool10 = (Boolean) n9e.x(context9, new bj4(14));
                bool10.booleanValue();
                return bool10;
            case 28:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_FORCE_BIDDING_ADAPTERS", false);
            default:
                return vxd.i((SharedPreferences) obj, "DEV_MODE_FUN_FACTS", false);
        }
    }

    public /* synthetic */ bj4(int i) {
        this.a = i;
    }
}
