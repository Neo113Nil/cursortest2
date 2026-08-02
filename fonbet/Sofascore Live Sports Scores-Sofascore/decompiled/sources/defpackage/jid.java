package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.sofascore.model.mvvm.model.StageIds;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.notifications.NotificationSetting;
import com.sofascore.model.profile.UserNotificationsRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jid {
    public final bfk a;
    public final w3b b;
    public final j0j c;
    public final wve d;
    public final qa6 e;
    public final tak f;
    public final wi7 g;
    public final dhk h;
    public final SharedPreferences i;

    public jid(bfk bfkVar, w3b w3bVar, j0j j0jVar, wve wveVar, qa6 qa6Var, tak takVar, wi7 wi7Var, dhk dhkVar, SharedPreferences sharedPreferences) {
        bfkVar.getClass();
        w3bVar.getClass();
        j0jVar.getClass();
        wveVar.getClass();
        qa6Var.getClass();
        takVar.getClass();
        wi7Var.getClass();
        dhkVar.getClass();
        sharedPreferences.getClass();
        this.a = bfkVar;
        this.b = w3bVar;
        this.c = j0jVar;
        this.d = wveVar;
        this.e = qa6Var;
        this.f = takVar;
        this.g = wi7Var;
        this.h = dhkVar;
        this.i = sharedPreferences;
    }

    public static Object c(jid jidVar, Context context, sq3 sq3Var) {
        jidVar.getClass();
        Object r = s9a.r(new kv7(context, jidVar, false, null), sq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    public static Object g(jid jidVar, Context context, sq3 sq3Var) {
        jidVar.getClass();
        Object r = s9a.r(new j8c(context, jidVar, (rq3) null, 16), sq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    public static Object i(jid jidVar, Context context, sq3 sq3Var) {
        jidVar.getClass();
        Object r = s9a.r(new w21((Object) context, (Object) jidVar, false, (rq3) null, 3), sq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r8 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, boolean z, sq3 sq3Var) {
        bid bidVar;
        Object obj;
        int i;
        SharedPreferences d;
        HashSet hashSet;
        if (sq3Var instanceof bid) {
            bidVar = (bid) sq3Var;
            int i2 = bidVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidVar.u = i2 - Integer.MIN_VALUE;
                obj = bidVar.s;
                lu3 lu3Var = lu3.a;
                i = bidVar.u;
                if (i != 0) {
                    y6a.M(obj);
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
                    if (sharedPreferences.getBoolean("INIT_DONE", false)) {
                        qa6 qa6Var = this.e;
                        bidVar.r = z;
                        bidVar.u = 1;
                        obj = qa6Var.h(bidVar);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    SharedPreferences.Editor edit = this.i.edit();
                    edit.getClass();
                    edit.putBoolean("RETRY_EVENTS", !booleanValue);
                    edit.apply();
                    return Unit.a;
                }
                z = bidVar.r;
                y6a.M(obj);
                hashSet = (HashSet) obj;
                if (!z && hashSet.isEmpty()) {
                    return Unit.a;
                }
                dhk dhkVar = this.h;
                bidVar.r = z;
                bidVar.u = 2;
                obj = dhkVar.i(hashSet, bidVar);
            }
        }
        bidVar = new bid(this, sq3Var);
        obj = bidVar.s;
        lu3 lu3Var2 = lu3.a;
        i = bidVar.u;
        if (i != 0) {
        }
        hashSet = (HashSet) obj;
        if (!z) {
        }
        dhk dhkVar2 = this.h;
        bidVar.r = z;
        bidVar.u = 2;
        obj = dhkVar2.i(hashSet, bidVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r8 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, boolean z, sq3 sq3Var) {
        cid cidVar;
        Object obj;
        int i;
        SharedPreferences d;
        HashSet hashSet;
        if (sq3Var instanceof cid) {
            cidVar = (cid) sq3Var;
            int i2 = cidVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cidVar.u = i2 - Integer.MIN_VALUE;
                obj = cidVar.s;
                lu3 lu3Var = lu3.a;
                i = cidVar.u;
                if (i != 0) {
                    y6a.M(obj);
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
                    if (sharedPreferences.getBoolean("INIT_DONE", false)) {
                        wi7 wi7Var = this.g;
                        cidVar.r = z;
                        cidVar.u = 1;
                        obj = wi7Var.A(cidVar);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    SharedPreferences.Editor edit = this.i.edit();
                    edit.getClass();
                    edit.putBoolean("RETRY_COMPETITIONS", !booleanValue);
                    edit.apply();
                    return Unit.a;
                }
                z = cidVar.r;
                y6a.M(obj);
                hashSet = (HashSet) obj;
                if (!z && hashSet.isEmpty()) {
                    return Unit.a;
                }
                dhk dhkVar = this.h;
                cidVar.r = z;
                cidVar.u = 2;
                obj = dhkVar.j(hashSet, cidVar);
            }
        }
        cidVar = new cid(this, sq3Var);
        obj = cidVar.s;
        lu3 lu3Var2 = lu3.a;
        i = cidVar.u;
        if (i != 0) {
        }
        hashSet = (HashSet) obj;
        if (!z) {
        }
        dhk dhkVar2 = this.h;
        cidVar.r = z;
        cidVar.u = 2;
        obj = dhkVar2.j(hashSet, cidVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r8 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, boolean z, sq3 sq3Var) {
        eid eidVar;
        Object obj;
        int i;
        SharedPreferences d;
        HashSet hashSet;
        if (sq3Var instanceof eid) {
            eidVar = (eid) sq3Var;
            int i2 = eidVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eidVar.u = i2 - Integer.MIN_VALUE;
                obj = eidVar.s;
                lu3 lu3Var = lu3.a;
                i = eidVar.u;
                if (i != 0) {
                    y6a.M(obj);
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
                    if (sharedPreferences.getBoolean("INIT_DONE", false)) {
                        qa6 qa6Var = this.e;
                        eidVar.r = z;
                        eidVar.u = 1;
                        obj = qa6Var.g(eidVar);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    SharedPreferences.Editor edit = this.i.edit();
                    edit.getClass();
                    edit.putBoolean("RETRY_MUTED_EVENTS", !booleanValue);
                    edit.apply();
                    return Unit.a;
                }
                z = eidVar.r;
                y6a.M(obj);
                hashSet = (HashSet) obj;
                if (!z && hashSet.isEmpty()) {
                    return Unit.a;
                }
                dhk dhkVar = this.h;
                eidVar.r = z;
                eidVar.u = 2;
                obj = dhkVar.m(hashSet, eidVar);
            }
        }
        eidVar = new eid(this, sq3Var);
        obj = eidVar.s;
        lu3 lu3Var2 = lu3.a;
        i = eidVar.u;
        if (i != 0) {
        }
        hashSet = (HashSet) obj;
        if (!z) {
        }
        dhk dhkVar2 = this.h;
        eidVar.r = z;
        eidVar.u = 2;
        obj = dhkVar2.m(hashSet, eidVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r8 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Context context, boolean z, sq3 sq3Var) {
        fid fidVar;
        Object obj;
        int i;
        SharedPreferences d;
        HashSet hashSet;
        if (sq3Var instanceof fid) {
            fidVar = (fid) sq3Var;
            int i2 = fidVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fidVar.u = i2 - Integer.MIN_VALUE;
                obj = fidVar.s;
                lu3 lu3Var = lu3.a;
                i = fidVar.u;
                if (i != 0) {
                    y6a.M(obj);
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
                    if (sharedPreferences.getBoolean("INIT_DONE", false)) {
                        qa6 qa6Var = this.e;
                        fidVar.r = z;
                        fidVar.u = 1;
                        obj = qa6Var.i(fidVar);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    SharedPreferences.Editor edit = this.i.edit();
                    edit.getClass();
                    edit.putBoolean("RETRY_MUTED_STAGES", !booleanValue);
                    edit.apply();
                    return Unit.a;
                }
                z = fidVar.r;
                y6a.M(obj);
                hashSet = (HashSet) obj;
                if (!z && hashSet.isEmpty()) {
                    return Unit.a;
                }
                dhk dhkVar = this.h;
                fidVar.r = z;
                fidVar.u = 2;
                obj = dhkVar.n(hashSet, fidVar);
            }
        }
        fidVar = new fid(this, sq3Var);
        obj = fidVar.s;
        lu3 lu3Var2 = lu3.a;
        i = fidVar.u;
        if (i != 0) {
        }
        hashSet = (HashSet) obj;
        if (!z) {
        }
        dhk dhkVar2 = this.h;
        fidVar.r = z;
        fidVar.u = 2;
        obj = dhkVar2.n(hashSet, fidVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0070, code lost:
    
        if (r11 == r3) goto L89;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [km5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Context context, sq3 sq3Var) {
        gid gidVar;
        lu3 lu3Var;
        int i;
        String O;
        jgd jgdVar;
        Context context2;
        Object a;
        Iterator it;
        Iterator it2;
        Iterator it3;
        SharedPreferences sharedPreferences;
        Object o;
        Context context3;
        ?? arrayList;
        boolean booleanValue;
        if (sq3Var instanceof gid) {
            gidVar = (gid) sq3Var;
            int i2 = gidVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gidVar.w = i2 - Integer.MIN_VALUE;
                Object obj = gidVar.u;
                lu3Var = lu3.a;
                i = gidVar.w;
                if (i != 0) {
                    y6a.M(obj);
                    O = m6k.O(context);
                    O.getClass();
                    if (O.length() == 0) {
                        return Boolean.TRUE;
                    }
                    jgdVar = jgd.a;
                    context2 = context;
                    gidVar.r = context2;
                    gidVar.s = O;
                    gidVar.t = jgdVar;
                    gidVar.w = 1;
                    a = jgd.a(gidVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        context3 = gidVar.r;
                        y6a.M(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                        SharedPreferences.Editor edit = this.i.edit();
                        edit.getClass();
                        edit.putBoolean("RETRY_NOTIFICATIONS", !booleanValue);
                        edit.apply();
                        if (booleanValue) {
                            return Boolean.FALSE;
                        }
                        context3.getClass();
                        boolean areNotificationsEnabled = Build.VERSION.SDK_INT >= 33 ? eq3.b(context3, "android.permission.POST_NOTIFICATIONS") == 0 : new fgd(context3).b.areNotificationsEnabled();
                        SharedPreferences sharedPreferences2 = uic.j;
                        if (sharedPreferences2 == null) {
                            Context applicationContext = context3.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences2 = a5f.d(applicationContext);
                                uic.j = sharedPreferences2;
                            }
                            sharedPreferences2.getClass();
                        }
                        SharedPreferences.Editor i3 = dmi.i(sharedPreferences2, "PREF_NOTIFICATION_STATUS_ON_LAST_SYNC", areNotificationsEnabled);
                        Unit unit = Unit.a;
                        i3.apply();
                        return Boolean.TRUE;
                    }
                    jgdVar = gidVar.t;
                    O = gidVar.s;
                    Context context4 = gidVar.r;
                    y6a.M(obj);
                    a = obj;
                    context2 = context4;
                }
                List list = (List) a;
                jgdVar.getClass();
                list.getClass();
                context2.getClass();
                LinkedHashMap i4 = wxf.i(context2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (Intrinsics.c(((NotificationSetting) obj2).getGroup(), SearchResponseKt.PLAYER_ENTITY)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    NotificationSetting notificationSetting = (NotificationSetting) it.next();
                    Set set = wyh.z;
                    ArrayList arrayList4 = new ArrayList(k13.r(set, 10));
                    Iterator it4 = set.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(new NotificationSetting((String) it4.next(), notificationSetting.getName(), notificationSetting.getEnabled(), notificationSetting.getChannelId(), null, 16, null));
                    }
                    arrayList3.add(arrayList4);
                }
                ArrayList s = k13.s(arrayList3);
                boolean areNotificationsEnabled2 = Build.VERSION.SDK_INT < 33 ? eq3.b(context2, "android.permission.POST_NOTIFICATIONS") == 0 : new fgd(context2).b.areNotificationsEnabled();
                ArrayList w0 = CollectionsKt.w0(s, list);
                ArrayList arrayList5 = new ArrayList();
                it2 = w0.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!ph0.a0(new String[]{SearchResponseKt.PLAYER_ENTITY, "other"}).contains(((NotificationSetting) next).getGroup())) {
                        arrayList5.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    String group = ((NotificationSetting) next2).getGroup();
                    Object obj3 = linkedHashMap.get(group);
                    if (obj3 == null) {
                        obj3 = wv8.n(linkedHashMap, group);
                    }
                    ((List) obj3).add(next2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(sub.c(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    if (areNotificationsEnabled2) {
                        Iterable iterable = (Iterable) entry.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj4 : iterable) {
                            NotificationSetting notificationSetting2 = (NotificationSetting) obj4;
                            if (notificationSetting2.getEnabled() && Intrinsics.c((Boolean) i4.get(notificationSetting2.getChannelId()), Boolean.TRUE)) {
                                arrayList6.add(obj4);
                            }
                        }
                        arrayList = new ArrayList(k13.r(arrayList6, 10));
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            arrayList.add(((NotificationSetting) it5.next()).getName());
                        }
                    } else {
                        arrayList = km5.a;
                    }
                    linkedHashMap2.put(key, arrayList);
                }
                sharedPreferences = uic.j;
                if (sharedPreferences == null) {
                    Context applicationContext2 = context2.getApplicationContext();
                    synchronized (uic.i) {
                        sharedPreferences = a5f.d(applicationContext2);
                        uic.j = sharedPreferences;
                    }
                    sharedPreferences.getClass();
                }
                long j = sharedPreferences.getLong("PREF_DISABLE_NOTIFICATION_TIME", 0L);
                O.getClass();
                UserNotificationsRequest userNotificationsRequest = new UserNotificationsRequest(j, O, linkedHashMap2);
                dhk dhkVar = this.h;
                gidVar.r = context2;
                gidVar.s = null;
                gidVar.t = null;
                gidVar.w = 2;
                o = dhkVar.o(userNotificationsRequest, gidVar);
                if (o != lu3Var) {
                    context3 = context2;
                    obj = o;
                    booleanValue = ((Boolean) obj).booleanValue();
                    SharedPreferences.Editor edit2 = this.i.edit();
                    edit2.getClass();
                    edit2.putBoolean("RETRY_NOTIFICATIONS", !booleanValue);
                    edit2.apply();
                    if (booleanValue) {
                    }
                }
                return lu3Var;
            }
        }
        gidVar = new gid(this, sq3Var);
        Object obj5 = gidVar.u;
        lu3Var = lu3.a;
        i = gidVar.w;
        if (i != 0) {
        }
        List list2 = (List) a;
        jgdVar.getClass();
        list2.getClass();
        context2.getClass();
        LinkedHashMap i42 = wxf.i(context2);
        ArrayList arrayList22 = new ArrayList();
        while (r14.hasNext()) {
        }
        ArrayList arrayList32 = new ArrayList(k13.r(arrayList22, 10));
        it = arrayList22.iterator();
        while (it.hasNext()) {
        }
        ArrayList s2 = k13.s(arrayList32);
        if (Build.VERSION.SDK_INT < 33) {
        }
        ArrayList w02 = CollectionsKt.w0(s2, list2);
        ArrayList arrayList52 = new ArrayList();
        it2 = w02.iterator();
        while (it2.hasNext()) {
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        it3 = arrayList52.iterator();
        while (it3.hasNext()) {
        }
        LinkedHashMap linkedHashMap22 = new LinkedHashMap(sub.c(linkedHashMap3.size()));
        while (r4.hasNext()) {
        }
        sharedPreferences = uic.j;
        if (sharedPreferences == null) {
        }
        long j2 = sharedPreferences.getLong("PREF_DISABLE_NOTIFICATION_TIME", 0L);
        O.getClass();
        UserNotificationsRequest userNotificationsRequest2 = new UserNotificationsRequest(j2, O, linkedHashMap22);
        dhk dhkVar2 = this.h;
        gidVar.r = context2;
        gidVar.s = null;
        gidVar.t = null;
        gidVar.w = 2;
        o = dhkVar2.o(userNotificationsRequest2, gidVar);
        if (o != lu3Var) {
        }
        return lu3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r8 != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006b, code lost:
    
        if (r8 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[LOOP:0: B:19:0x007f->B:21:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Context context, boolean z, sq3 sq3Var) {
        hid hidVar;
        Object obj;
        int i;
        SharedPreferences d;
        Iterator it;
        HashSet hashSet;
        if (sq3Var instanceof hid) {
            hidVar = (hid) sq3Var;
            int i2 = hidVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hidVar.u = i2 - Integer.MIN_VALUE;
                obj = hidVar.s;
                lu3 lu3Var = lu3.a;
                i = hidVar.u;
                if (i != 0) {
                    y6a.M(obj);
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
                    if (sharedPreferences.getBoolean("INIT_DONE", false)) {
                        qa6 qa6Var = this.e;
                        hidVar.r = z;
                        hidVar.u = 1;
                        obj = qa6Var.k(hidVar);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    SharedPreferences.Editor edit = this.i.edit();
                    edit.getClass();
                    edit.putBoolean("RETRY_STAGES", !booleanValue);
                    edit.apply();
                    return Unit.a;
                }
                z = hidVar.r;
                y6a.M(obj);
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    w1l.A(arrayList, ((StageIds) it.next()).getId());
                }
                hashSet = new HashSet(arrayList);
                if (!z && hashSet.isEmpty()) {
                    return Unit.a;
                }
                dhk dhkVar = this.h;
                hidVar.r = z;
                hidVar.u = 2;
                obj = dhkVar.r(hashSet, hidVar);
            }
        }
        hidVar = new hid(this, sq3Var);
        obj = hidVar.s;
        lu3 lu3Var2 = lu3.a;
        i = hidVar.u;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        hashSet = new HashSet(arrayList2);
        if (!z) {
        }
        dhk dhkVar2 = this.h;
        hidVar.r = z;
        hidVar.u = 2;
        obj = dhkVar2.r(hashSet, hidVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r8 != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        if (r8 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Context context, boolean z, sq3 sq3Var) {
        iid iidVar;
        Object obj;
        int i;
        SharedPreferences d;
        HashSet hashSet;
        if (sq3Var instanceof iid) {
            iidVar = (iid) sq3Var;
            int i2 = iidVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iidVar.u = i2 - Integer.MIN_VALUE;
                obj = iidVar.s;
                lu3 lu3Var = lu3.a;
                i = iidVar.u;
                if (i != 0) {
                    y6a.M(obj);
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
                    if (sharedPreferences.getBoolean("INIT_DONE", false)) {
                        tak takVar = this.f;
                        iidVar.r = z;
                        iidVar.u = 1;
                        obj = takVar.c(iidVar);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    SharedPreferences.Editor edit = this.i.edit();
                    edit.getClass();
                    edit.putBoolean("RETRY_UNIQUE_STAGES", !booleanValue);
                    edit.apply();
                    return Unit.a;
                }
                z = iidVar.r;
                y6a.M(obj);
                hashSet = (HashSet) obj;
                if (!z && hashSet.isEmpty()) {
                    return Unit.a;
                }
                dhk dhkVar = this.h;
                iidVar.r = z;
                iidVar.u = 2;
                obj = dhkVar.u(hashSet, iidVar);
            }
        }
        iidVar = new iid(this, sq3Var);
        obj = iidVar.s;
        lu3 lu3Var2 = lu3.a;
        i = iidVar.u;
        if (i != 0) {
        }
        hashSet = (HashSet) obj;
        if (!z) {
        }
        dhk dhkVar2 = this.h;
        iidVar.r = z;
        iidVar.u = 2;
        obj = dhkVar2.u(hashSet, iidVar);
    }
}
