package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.newNetwork.OddsProvidersResponse;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class xld {
    public static final bga a = vga.a;

    public static OddsCountryProvider a(Context context, boolean z) {
        Object u2gVar;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        String string = sharedPreferences.getString("ODDS_CHOSEN_PROVIDER", null);
        try {
            p2g p2gVar = w2g.b;
            if (string != null) {
                bga bgaVar = a;
                bgaVar.getClass();
                u2gVar = (OddsCountryProvider) bgaVar.b(l98.W(OddsCountryProvider.INSTANCE.serializer()), string);
            } else {
                u2gVar = null;
            }
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) (u2gVar instanceof u2g ? null : u2gVar);
        return (oddsCountryProvider == null && z) ? d(b(context)) : oddsCountryProvider;
    }

    public static List b(Context context) {
        Object u2gVar;
        SharedPreferences d;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        String string = sharedPreferences.getString("ODDS_PROVIDERS", null);
        if (string == null) {
            return new ArrayList();
        }
        try {
            p2g p2gVar = w2g.b;
            bga bgaVar = a;
            bgaVar.getClass();
            u2gVar = (List) bgaVar.b(l98.W(new xg0(OddsCountryProvider.INSTANCE.serializer(), 0)), string);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        List list = (List) (u2gVar instanceof u2g ? null : u2gVar);
        return list == null ? new ArrayList() : list;
    }

    public static List c(Context context) {
        Object u2gVar;
        SharedPreferences d;
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        String string = sharedPreferences.getString("ODDS_TAB_PROVIDERS", null);
        if (string == null) {
            return new ArrayList();
        }
        try {
            p2g p2gVar = w2g.b;
            bga bgaVar = a;
            bgaVar.getClass();
            u2gVar = (List) bgaVar.b(l98.W(new xg0(OddsCountryProvider.INSTANCE.serializer(), 0)), string);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        List list = (List) (u2gVar instanceof u2g ? null : u2gVar);
        return list == null ? new ArrayList() : list;
    }

    public static OddsCountryProvider d(List list) {
        list.getClass();
        TreeMap treeMap = new TreeMap();
        Random random = new Random();
        Iterator it = list.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) it.next();
            double weight = oddsCountryProvider.getWeight();
            if (weight > 0.0d) {
                d += weight;
                treeMap.put(Double.valueOf(d), oddsCountryProvider);
            }
        }
        Map.Entry higherEntry = treeMap.higherEntry(Double.valueOf(random.nextDouble() * d));
        return (OddsCountryProvider) (higherEntry != null ? higherEntry.getValue() : null);
    }

    public static boolean e(Context context) {
        SharedPreferences d;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        return sharedPreferences.getBoolean("ODDS_PROVIDERS_DISABLED", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r2, "25_or_older") != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(Context context, SharedPreferences sharedPreferences) {
        boolean z;
        SharedPreferences d;
        context.getClass();
        sharedPreferences.getClass();
        if (!sharedPreferences.getBoolean("PREF_PROVIDER_ODDS_ENABLE", true) || zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
            if (zu3.V.hasMcc(Integer.valueOf(ke0.c))) {
                SharedPreferences sharedPreferences2 = uic.j;
                if (sharedPreferences2 == null) {
                    Context applicationContext = context.getApplicationContext();
                    synchronized (uic.i) {
                        d = a5f.d(applicationContext);
                        uic.j = d;
                    }
                    d.getClass();
                    sharedPreferences2 = d;
                }
                ccd ccdVar = vl.b;
                String string = sharedPreferences2.getString("PREF_MANAGE_ODDS_ADDS_V2", "under_18");
                ccd ccdVar2 = vl.b;
            }
            z = false;
            ia0 ia0Var = ia0.q;
            if (mz1.C() || z) {
                return z;
            }
            return true;
        }
        z = true;
        ia0 ia0Var2 = ia0.q;
        if (mz1.C()) {
        }
        return z;
    }

    public static boolean g(Context context) {
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences2 = a5f.d(applicationContext2);
                uic.j = sharedPreferences2;
            }
            sharedPreferences2.getClass();
        }
        return sharedPreferences2.getBoolean("ODDS_VISIBLE", false) && f(context, sharedPreferences);
    }

    public static void h(Context context, String str, OddsProvidersResponse oddsProvidersResponse, boolean z) {
        List<OddsCountryProvider> list;
        Object obj;
        Object obj2;
        Integer minimumRequiredProviders;
        OddsProvider provider;
        if (oddsProvidersResponse == null || (list = oddsProvidersResponse.getProviders()) == null) {
            list = km5.a;
        }
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                sharedPreferences = a5f.d(applicationContext);
                uic.j = sharedPreferences;
            }
            sharedPreferences.getClass();
        }
        int i = 0;
        OddsCountryProvider a2 = a(context, false);
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) obj2;
            if (a2 != null && (provider = a2.getProvider()) != null && oddsCountryProvider.getProvider().getId() == provider.getId()) {
                break;
            }
        }
        OddsCountryProvider oddsCountryProvider2 = (OddsCountryProvider) obj2;
        Iterator<T> it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            i2 += ((OddsCountryProvider) it2.next()).getWeight();
        }
        if (z) {
            int i3 = 17;
            if (oddsCountryProvider2 == null) {
                n9e.u(context, new mnc(obj, i3));
                if (f(context, sharedPreferences)) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    edit.putString("PREF_PROVIDER_ODDS", null);
                    edit.apply();
                }
            } else {
                n9e.u(context, new mnc(oddsCountryProvider2, i3));
            }
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.getClass();
        if (a(context, false) == null && z) {
            edit2.putBoolean("ODDS_VISIBLE", i2 > 0);
        }
        if (z) {
            edit2.putBoolean("ODDS_PROVIDERS_DISABLED", list.isEmpty());
        }
        int hashCode = str.hashCode();
        if (hashCode != -315375014) {
            if (hashCode != 96801) {
                if (hashCode == 1121504592 && str.equals("app-odds")) {
                    bga bgaVar = a;
                    bgaVar.getClass();
                    edit2.putString("ODDS_TAB_PROVIDERS", bgaVar.c(new xg0(OddsCountryProvider.INSTANCE.serializer(), 0), list));
                    if (oddsProvidersResponse != null && (minimumRequiredProviders = oddsProvidersResponse.getMinimumRequiredProviders()) != null) {
                        i = minimumRequiredProviders.intValue();
                    }
                    edit2.putInt("ODDS_TAB_MINIMUM_REQUIRED_PROVIDERS", i);
                }
            } else if (str.equals("app")) {
                bga bgaVar2 = a;
                bgaVar2.getClass();
                edit2.putString("ODDS_PROVIDERS", bgaVar2.c(new xg0(OddsCountryProvider.INSTANCE.serializer(), 0), list));
            }
        } else if (str.equals("app-featured")) {
            bga bgaVar3 = a;
            bgaVar3.getClass();
            edit2.putString("ODDS_PROVIDER_FEATURED", bgaVar3.c(new xg0(OddsCountryProvider.INSTANCE.serializer(), 0), list));
        }
        edit2.apply();
    }
}
