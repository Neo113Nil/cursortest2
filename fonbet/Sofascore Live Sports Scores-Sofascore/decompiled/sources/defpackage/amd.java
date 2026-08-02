package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.odds.FeaturedOddsDisplayArea;
import com.sofascore.model.odds.OddsCountryProvider;
import com.sofascore.model.odds.OddsProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class amd {
    public final Context a;
    public final cg4 b;
    public final boolean c;
    public final List d;
    public final List e;
    public volatile List f;
    public volatile List g;
    public Integer h;
    public final int i;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ba, code lost:
    
        if (r1 == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public amd(Context context, cg4 cg4Var) {
        List list;
        List list2;
        SharedPreferences d;
        Object u2gVar;
        OddsCountryProvider d2;
        OddsProvider provider;
        cg4Var.getClass();
        this.a = context;
        this.b = cg4Var;
        this.c = aef.h(context);
        if (xld.g(context)) {
            OddsCountryProvider a = xld.a(context, true);
            if (a != null) {
                List c = a.c(a);
                List<OddsCountryProvider> subProviders = a.getSubProviders();
                list = CollectionsKt.w0(subProviders == null ? km5.a : subProviders, c);
            } else {
                list = km5.a;
            }
        } else {
            list = km5.a;
        }
        this.d = list;
        if (xld.g(context)) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    sharedPreferences = a5f.d(applicationContext);
                    uic.j = sharedPreferences;
                }
                sharedPreferences.getClass();
            }
            Object obj = null;
            String string = sharedPreferences.getString("ODDS_CHOSEN_PROVIDER", null);
            try {
                p2g p2gVar = w2g.b;
                if (string != null) {
                    bga bgaVar = xld.a;
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
            List c2 = xld.c(context);
            if (oddsCountryProvider != null && (provider = oddsCountryProvider.getProvider()) != null) {
                int id = provider.getId();
                Iterator it = c2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((OddsCountryProvider) next).getProvider().getId() == id) {
                        obj = next;
                        break;
                    }
                }
                d2 = (OddsCountryProvider) obj;
            }
            d2 = xld.d(c2);
            if (d2 != null) {
                List c3 = a.c(d2);
                List<OddsCountryProvider> subProviders2 = d2.getSubProviders();
                list2 = CollectionsKt.w0(subProviders2 == null ? km5.a : subProviders2, c3);
            } else {
                list2 = km5.a;
            }
        } else {
            list2 = km5.a;
        }
        this.e = list2;
        bga bgaVar2 = xld.a;
        Context context2 = this.a;
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = context2.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext2);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences2 = d;
        }
        this.i = sharedPreferences2.getInt("ODDS_TAB_MINIMUM_REQUIRED_PROVIDERS", 0);
    }

    public final ArrayList a(Integer num) {
        SharedPreferences d;
        qv7 qv7Var = rv7.c;
        if (!ml4.e0()) {
            Context context = this.a;
            yea yeaVar = j58.a;
            if (!fn0.B("should_show_world_cup")) {
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
                if (!sharedPreferences.getBoolean("DEV_MODE_SHOW_WORLD_CUP", false)) {
                    return null;
                }
            }
        }
        ArrayList b = b(num);
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (((OddsCountryProvider) obj).getFeaturedOddsDisplayArea() == FeaturedOddsDisplayArea.TOURNAMENT_AND_EVENTS) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final ArrayList b(Integer num) {
        Iterable iterable;
        Object u2gVar;
        List list;
        SharedPreferences d;
        Context context = this.a;
        if (xld.g(context)) {
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
            String string = sharedPreferences.getString("ODDS_PROVIDER_FEATURED", null);
            if (string == null) {
                list = new ArrayList();
            } else {
                try {
                    p2g p2gVar = w2g.b;
                    bga bgaVar = xld.a;
                    bgaVar.getClass();
                    u2gVar = (List) bgaVar.b(l98.W(new xg0(OddsCountryProvider.INSTANCE.serializer(), 0)), string);
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                if (u2gVar instanceof u2g) {
                    u2gVar = null;
                }
                list = (List) u2gVar;
                if (list == null) {
                    list = new ArrayList();
                }
            }
            OddsCountryProvider d2 = xld.d(list);
            if (d2 != null) {
                List c = a.c(d2);
                List<OddsCountryProvider> subProviders = d2.getSubProviders();
                if (subProviders == null) {
                    subProviders = km5.a;
                }
                iterable = CollectionsKt.w0(subProviders, c);
            } else {
                iterable = km5.a;
            }
        } else {
            iterable = km5.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            OddsCountryProvider oddsCountryProvider = (OddsCountryProvider) obj;
            if (Intrinsics.c(oddsCountryProvider.getFeaturedUniqueTournamentId(), num) && oddsCountryProvider.getFeaturedOddsDisplayArea() != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final List c() {
        List list = this.f;
        return list == null ? this.d : list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (((int) java.time.temporal.ChronoUnit.DAYS.between(defpackage.vxd.o(java.time.Instant.ofEpochMilli(r11)), defpackage.vxd.o(java.time.Instant.ofEpochMilli(defpackage.yaa.v())))) < 10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (r8.h(r1, r11, r2) != r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bf, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        if (r1 == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(OddsCountryProvider oddsCountryProvider, sq3 sq3Var) {
        zld zldVar;
        int i;
        OddsCountryProvider oddsCountryProvider2;
        int i2;
        if (sq3Var instanceof zld) {
            zldVar = (zld) sq3Var;
            int i3 = zldVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zldVar.v = i3 - Integer.MIN_VALUE;
                Object obj = zldVar.t;
                lu3 lu3Var = lu3.a;
                i = zldVar.v;
                cg4 cg4Var = this.b;
                if (i != 0) {
                    y6a.M(obj);
                    String j = ljg.j(oddsCountryProvider.getProvider().getId(), "pref_affiliate_container_first_showed_timestamp_");
                    oddsCountryProvider2 = oddsCountryProvider;
                    zldVar.r = oddsCountryProvider2;
                    zldVar.v = 1;
                    obj = cg4Var.d(j, zldVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = zldVar.s;
                        y6a.M(obj);
                        return Boolean.valueOf(i2 != 0);
                    }
                    oddsCountryProvider2 = zldVar.r;
                    y6a.M(obj);
                }
                long longValue = ((Number) obj).longValue();
                if (this.c) {
                    if (longValue != 0) {
                    }
                    if (oddsCountryProvider2.getSignupLink() != null && oddsCountryProvider2.getBranded()) {
                        i2 = 1;
                        if (i2 != 0 && longValue == 0) {
                            String j2 = ljg.j(oddsCountryProvider2.getProvider().getId(), "pref_affiliate_container_first_showed_timestamp_");
                            long currentTimeMillis = System.currentTimeMillis();
                            zldVar.r = null;
                            zldVar.s = i2;
                            zldVar.v = 2;
                        }
                        return Boolean.valueOf(i2 != 0);
                    }
                }
                i2 = 0;
                if (i2 != 0) {
                    String j22 = ljg.j(oddsCountryProvider2.getProvider().getId(), "pref_affiliate_container_first_showed_timestamp_");
                    long currentTimeMillis2 = System.currentTimeMillis();
                    zldVar.r = null;
                    zldVar.s = i2;
                    zldVar.v = 2;
                }
                return Boolean.valueOf(i2 != 0);
            }
        }
        zldVar = new zld(this, sq3Var);
        Object obj2 = zldVar.t;
        lu3 lu3Var2 = lu3.a;
        i = zldVar.v;
        cg4 cg4Var2 = this.b;
        if (i != 0) {
        }
        long longValue2 = ((Number) obj2).longValue();
        if (this.c) {
        }
        i2 = 0;
        if (i2 != 0) {
        }
        return Boolean.valueOf(i2 != 0);
    }
}
