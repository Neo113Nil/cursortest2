package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.model.notifications.NotificationSettingKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jgd {
    public static final jgd a = new jgd();
    public static final mqi b = ypa.b(new ivc(23));
    public static final mqi c = ypa.b(new ivc(24));
    public static Set d = rm5.a;

    public static Object a(sq3 sq3Var) {
        return gz8.U(sq3Var, ((yhd) b.getValue()).a.a, true, false, new a7d(19));
    }

    public static LinkedHashMap b(List list, List list2) {
        List split$default;
        boolean z;
        Object obj;
        int c2 = sub.c(k13.r(list, 10));
        if (c2 < 16) {
            c2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannel = (NotificationChannel) it.next();
            String id = notificationChannel.getId();
            id.getClass();
            boolean z2 = false;
            split$default = StringsKt__StringsKt.split$default(id, new String[]{"_"}, false, 0, 6, null);
            String f0 = CollectionsKt.f0(CollectionsKt.T(split$default), "_", null, null, null, 62);
            if (Build.VERSION.SDK_INT >= 28) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.c(((NotificationChannelGroup) obj).getId(), notificationChannel.getGroup())) {
                        break;
                    }
                }
                NotificationChannelGroup notificationChannelGroup = (NotificationChannelGroup) obj;
                z = Intrinsics.c(notificationChannelGroup != null ? Boolean.valueOf(notificationChannelGroup.isBlocked()) : null, Boolean.TRUE);
            } else {
                z = false;
            }
            if (notificationChannel.getImportance() != 0 && !z) {
                z2 = true;
            }
            linkedHashMap.put(f0, Boolean.valueOf(z2));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:42|43))(3:44|45|(1:47))|12|13|(5:15|(3:17|68|22)|27|(3:29|8c|34)|38)|39|40))|50|6|7|(0)(0)|12|13|(0)|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x002a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004e, code lost:
    
        r7 = defpackage.w2g.b;
        r7 = new defpackage.u2g(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, sq3 sq3Var) {
        ggd ggdVar;
        int i;
        Object u2gVar;
        if (sq3Var instanceof ggd) {
            ggdVar = (ggd) sq3Var;
            int i2 = ggdVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ggdVar.u = i2 - Integer.MIN_VALUE;
                Object obj = ggdVar.s;
                lu3 lu3Var = lu3.a;
                i = ggdVar.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    p2g p2gVar = w2g.b;
                    k50 k50Var = new k50(context, this, rq3Var, 15);
                    ggdVar.r = context;
                    ggdVar.u = 1;
                    obj = s9a.r(k50Var, ggdVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = ggdVar.r;
                    y6a.M(obj);
                }
                u2gVar = (yda) obj;
                p2g p2gVar2 = w2g.b;
                if (!(u2gVar instanceof u2g)) {
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
                    SharedPreferences.Editor i3 = dmi.i(sharedPreferences, "PREF_NEW_NOTIFICATION_SETUP", true);
                    Unit unit = Unit.a;
                    i3.apply();
                    SharedPreferences sharedPreferences2 = uic.j;
                    if (sharedPreferences2 == null) {
                        Context applicationContext2 = context.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences2 = a5f.d(applicationContext2);
                            uic.j = sharedPreferences2;
                        }
                        sharedPreferences2.getClass();
                    }
                    wt3.v(sharedPreferences2, "ADD_RINGTONE_PREFv2", true);
                }
                return Unit.a;
            }
        }
        ggdVar = new ggd(this, sq3Var);
        Object obj2 = ggdVar.s;
        lu3 lu3Var2 = lu3.a;
        i = ggdVar.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        u2gVar = (yda) obj2;
        p2g p2gVar22 = w2g.b;
        if (!(u2gVar instanceof u2g)) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[LOOP:1: B:22:0x006b->B:24:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sq3 sq3Var) {
        igd igdVar;
        int i;
        Iterator it;
        if (sq3Var instanceof igd) {
            igdVar = (igd) sq3Var;
            int i2 = igdVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                igdVar.t = i2 - Integer.MIN_VALUE;
                Object obj = igdVar.r;
                lu3 lu3Var = lu3.a;
                i = igdVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    igdVar.t = 1;
                    obj = a(igdVar);
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
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (!((NotificationSetting) obj2).getEnabled()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(NotificationSettingKt.getBackendChannelName((NotificationSetting) it.next()));
                }
                d = CollectionsKt.W0(arrayList2);
                return Unit.a;
            }
        }
        igdVar = new igd(this, sq3Var);
        Object obj3 = igdVar.r;
        lu3 lu3Var2 = lu3.a;
        i = igdVar.t;
        if (i != 0) {
        }
        ArrayList arrayList3 = new ArrayList();
        while (r4.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList(k13.r(arrayList3, 10));
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        d = CollectionsKt.W0(arrayList22);
        return Unit.a;
    }
}
