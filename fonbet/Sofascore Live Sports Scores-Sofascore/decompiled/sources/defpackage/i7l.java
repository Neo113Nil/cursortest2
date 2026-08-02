package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.icu.text.DateTimePatternGenerator;
import android.text.format.DateFormat;
import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.StatusKt;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i7l {
    public final qa6 a;
    public final bt7 b;

    public i7l(qa6 qa6Var, bt7 bt7Var) {
        qa6Var.getClass();
        this.a = qa6Var;
        this.b = bt7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x008e, code lost:
    
        if (r2 == r4) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, sq3 sq3Var) {
        e7l e7lVar;
        Object obj;
        int i;
        Object U;
        Context context2;
        jdb jdbVar;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        String obj2;
        Context context3 = context;
        if (sq3Var instanceof e7l) {
            e7lVar = (e7l) sq3Var;
            int i2 = e7lVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e7lVar.v = i2 - Integer.MIN_VALUE;
                Object obj3 = e7lVar.t;
                obj = lu3.a;
                i = e7lVar.v;
                if (i != 0) {
                    y6a.M(obj3);
                    context3.getClass();
                    SharedPreferences sharedPreferences3 = uic.j;
                    if (sharedPreferences3 == null) {
                        Context applicationContext = context3.getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences3 = a5f.d(applicationContext);
                            uic.j = sharedPreferences3;
                        }
                        sharedPreferences3.getClass();
                    }
                    SharedPreferences.Editor edit = sharedPreferences3.edit();
                    edit.getClass();
                    edit.putLong("LAST_REFRESH_CLICK", yaa.w());
                    edit.commit();
                    this.b.e(context3);
                    w3a.Q(context3);
                    e7lVar.r = context3;
                    e7lVar.v = 1;
                    obj3 = c(e7lVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            jdb jdbVar2 = e7lVar.s;
                            y6a.M(obj3);
                            return jdbVar2;
                        }
                        jdbVar = e7lVar.s;
                        context2 = e7lVar.r;
                        y6a.M(obj3);
                        boolean booleanValue = ((Boolean) obj3).booleanValue();
                        context2.getClass();
                        sharedPreferences = uic.j;
                        if (sharedPreferences == null) {
                            Context applicationContext2 = context2.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences = a5f.d(applicationContext2);
                                uic.j = sharedPreferences;
                            }
                            sharedPreferences.getClass();
                        }
                        String string = sharedPreferences.getString("PREF_NOTIFICATION_STATUS", "NOTIFICATION_ENABLED");
                        String str = string != null ? string : "NOTIFICATION_ENABLED";
                        if (new fgd(context2).b.areNotificationsEnabled()) {
                            str = "NOTIFICATION_DISABLED";
                        } else if (str.equals("NOTIFICATION_DISABLED")) {
                            str = "NOTIFICATION_ENABLED";
                        }
                        sharedPreferences2 = uic.j;
                        if (sharedPreferences2 == null) {
                            Context applicationContext3 = context2.getApplicationContext();
                            synchronized (uic.i) {
                                sharedPreferences2 = a5f.d(applicationContext3);
                                uic.j = sharedPreferences2;
                            }
                            sharedPreferences2.getClass();
                        }
                        long j = sharedPreferences2.getLong("LAST_REFRESH_CLICK", 0L);
                        DateTimePatternGenerator b = hk4.b();
                        if (DateFormat.is24HourFormat(context2)) {
                            String bestPattern = b.getBestPattern("hm");
                            bestPattern.getClass();
                            obj2 = StringsKt.l0(c.r(bestPattern, "a", "", false)).toString();
                        } else {
                            obj2 = b.getBestPattern("Hm");
                        }
                        obj2.getClass();
                        ytj ytjVar = new ytj(booleanValue, str, fc6.i(j, hk4.a(obj2)));
                        e7lVar.r = null;
                        e7lVar.s = jdbVar;
                        e7lVar.v = 3;
                        return b(context2, ytjVar, e7lVar) != obj ? obj : jdbVar;
                    }
                    context3 = e7lVar.r;
                    y6a.M(obj3);
                }
                jdb jdbVar3 = (jdb) obj3;
                qa6 qa6Var = this.a;
                final List a = l5i.a();
                e7lVar.r = context3;
                e7lVar.s = jdbVar3;
                e7lVar.v = 2;
                qa6Var.getClass();
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                final long timeInMillis = calendar.getTimeInMillis() / 1000;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, 0);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                calendar2.add(5, 8);
                final long timeInMillis2 = calendar2.getTimeInMillis() / 1000;
                final v76 v76Var = qa6Var.a;
                final List<String> ongoing_status_types = StatusKt.getONGOING_STATUS_TYPES();
                v76Var.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT EXISTS(SELECT 1 FROM events_table WHERE hide = 0 AND startTimestamp < ? AND status_type LIKE 'finished' AND (startTimestamp >= ? OR endTimestamp > ? OR status_type IN (");
                final int size = ongoing_status_types.size();
                pea.m(size, sb);
                sb.append(")) UNION SELECT 1 FROM my_stage_table WHERE isHidden = 0 AND type IN (");
                final int size2 = a.size();
                pea.m(size2, sb);
                sb.append(") AND status_type LIKE 'finished' AND startDateTimestamp >= ");
                sb.append("?");
                sb.append(" AND startDateTimestamp < ");
                final String o = mz1.o(sb, "?", ")");
                U = gz8.U(e7lVar, v76Var.a, true, false, new Function1() { // from class: p76
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        long j2 = timeInMillis2;
                        long j3 = timeInMillis;
                        List list = ongoing_status_types;
                        int i3 = size;
                        List<ServerType> list2 = a;
                        v76 v76Var2 = v76Var;
                        int i4 = size2;
                        glg glgVar = (glg) obj4;
                        glgVar.getClass();
                        nlg V0 = glgVar.V0(o);
                        try {
                            V0.q(1, j2);
                            V0.q(2, j3);
                            V0.q(3, j3);
                            Iterator it = list.iterator();
                            int i5 = 4;
                            while (it.hasNext()) {
                                V0.L(i5, (String) it.next());
                                i5++;
                            }
                            int i6 = i3 + 4;
                            int i7 = i6;
                            for (ServerType serverType : list2) {
                                v76Var2.getClass();
                                V0.L(i7, v76.a(serverType));
                                i7++;
                            }
                            V0.q(i6 + i4, j3);
                            V0.q(i3 + 5 + i4, j2);
                            boolean z = V0.U0() ? ((int) V0.getLong(0)) != 0 : false;
                            V0.close();
                            return Boolean.valueOf(z);
                        } catch (Throwable th) {
                            V0.close();
                            throw th;
                        }
                    }
                });
                if (U != obj) {
                    context2 = context3;
                    jdbVar = jdbVar3;
                    obj3 = U;
                    boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                    context2.getClass();
                    sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                    }
                    String string2 = sharedPreferences.getString("PREF_NOTIFICATION_STATUS", "NOTIFICATION_ENABLED");
                    if (string2 != null) {
                    }
                    if (new fgd(context2).b.areNotificationsEnabled()) {
                    }
                    sharedPreferences2 = uic.j;
                    if (sharedPreferences2 == null) {
                    }
                    long j2 = sharedPreferences2.getLong("LAST_REFRESH_CLICK", 0L);
                    DateTimePatternGenerator b2 = hk4.b();
                    if (DateFormat.is24HourFormat(context2)) {
                    }
                    obj2.getClass();
                    ytj ytjVar2 = new ytj(booleanValue2, str, fc6.i(j2, hk4.a(obj2)));
                    e7lVar.r = null;
                    e7lVar.s = jdbVar;
                    e7lVar.v = 3;
                    if (b(context2, ytjVar2, e7lVar) != obj) {
                    }
                }
            }
        }
        e7lVar = new e7l(this, sq3Var);
        Object obj32 = e7lVar.t;
        obj = lu3.a;
        i = e7lVar.v;
        if (i != 0) {
        }
        jdb jdbVar32 = (jdb) obj32;
        qa6 qa6Var2 = this.a;
        final List a2 = l5i.a();
        e7lVar.r = context3;
        e7lVar.s = jdbVar32;
        e7lVar.v = 2;
        qa6Var2.getClass();
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        calendar3.set(14, 0);
        final long timeInMillis3 = calendar3.getTimeInMillis() / 1000;
        Calendar calendar22 = Calendar.getInstance();
        calendar22.set(11, 0);
        calendar22.set(12, 0);
        calendar22.set(13, 0);
        calendar22.set(14, 0);
        calendar22.add(5, 8);
        final long timeInMillis22 = calendar22.getTimeInMillis() / 1000;
        final v76 v76Var2 = qa6Var2.a;
        final List ongoing_status_types2 = StatusKt.getONGOING_STATUS_TYPES();
        v76Var2.getClass();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT EXISTS(SELECT 1 FROM events_table WHERE hide = 0 AND startTimestamp < ? AND status_type LIKE 'finished' AND (startTimestamp >= ? OR endTimestamp > ? OR status_type IN (");
        final int size3 = ongoing_status_types2.size();
        pea.m(size3, sb2);
        sb2.append(")) UNION SELECT 1 FROM my_stage_table WHERE isHidden = 0 AND type IN (");
        final int size22 = a2.size();
        pea.m(size22, sb2);
        sb2.append(") AND status_type LIKE 'finished' AND startDateTimestamp >= ");
        sb2.append("?");
        sb2.append(" AND startDateTimestamp < ");
        final String o2 = mz1.o(sb2, "?", ")");
        U = gz8.U(e7lVar, v76Var2.a, true, false, new Function1() { // from class: p76
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                long j22 = timeInMillis22;
                long j3 = timeInMillis3;
                List list = ongoing_status_types2;
                int i3 = size3;
                List<ServerType> list2 = a2;
                v76 v76Var22 = v76Var2;
                int i4 = size22;
                glg glgVar = (glg) obj4;
                glgVar.getClass();
                nlg V0 = glgVar.V0(o2);
                try {
                    V0.q(1, j22);
                    V0.q(2, j3);
                    V0.q(3, j3);
                    Iterator it = list.iterator();
                    int i5 = 4;
                    while (it.hasNext()) {
                        V0.L(i5, (String) it.next());
                        i5++;
                    }
                    int i6 = i3 + 4;
                    int i7 = i6;
                    for (ServerType serverType : list2) {
                        v76Var22.getClass();
                        V0.L(i7, v76.a(serverType));
                        i7++;
                    }
                    V0.q(i6 + i4, j3);
                    V0.q(i3 + 5 + i4, j22);
                    boolean z = V0.U0() ? ((int) V0.getLong(0)) != 0 : false;
                    V0.close();
                    return Boolean.valueOf(z);
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            }
        });
        if (U != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x01da, code lost:
    
        if (defpackage.td4.y0(r0, r15, r3) == r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c9, code lost:
    
        if (r2 == r4) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r14v12, types: [ct8] */
    /* JADX WARN: Type inference failed for: r15v8, types: [ct8] */
    /* JADX WARN: Type inference failed for: r1v12, types: [ct8] */
    /* JADX WARN: Type inference failed for: r8v14, types: [ct8] */
    /* JADX WARN: Type inference failed for: r8v3, types: [re0] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.content.Context, ct8, java.util.Iterator, java.util.List, re0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01aa -> B:20:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, ytj ytjVar, sq3 sq3Var) {
        f7l f7lVar;
        int i;
        Object obj;
        ytj ytjVar2;
        Context context2;
        List list;
        Iterator it;
        int i2;
        List list2;
        Iterator it2;
        ytj ytjVar3;
        re0 re0Var;
        Context context3;
        f7l f7lVar2;
        Object obj2;
        int i3;
        t53 t53Var;
        ytj ytjVar4;
        re0 re0Var2;
        int i4;
        int i5;
        Object c;
        Context context4 = context;
        if (sq3Var instanceof f7l) {
            f7lVar = (f7l) sq3Var;
            int i6 = f7lVar.A;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                f7lVar.A = i6 - Integer.MIN_VALUE;
                Object obj3 = f7lVar.y;
                Object obj4 = lu3.a;
                i = f7lVar.A;
                int i7 = 0;
                int i8 = 2;
                int i9 = 1;
                rq3 rq3Var = null;
                if (i != 0) {
                    obj = null;
                    y6a.M(obj3);
                    ry8 ry8Var = new ry8(context4);
                    f7lVar.r = context4;
                    ytjVar2 = ytjVar;
                    f7lVar.s = ytjVar2;
                    f7lVar.A = 1;
                    obj3 = ry8Var.a(auh.class, f7lVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            obj = null;
                            i5 = f7lVar.x;
                            i4 = f7lVar.w;
                            re0Var2 = f7lVar.v;
                            Iterator it3 = f7lVar.u;
                            List list3 = f7lVar.t;
                            ct8 ct8Var = f7lVar.s;
                            context2 = f7lVar.r;
                            y6a.M(obj3);
                            list2 = list3;
                            it2 = it3;
                            ytjVar4 = ct8Var;
                            p0d p0dVar = (p0d) obj3;
                            n6l n6lVar = n6l.a;
                            p0dVar.getClass();
                            Integer num = (Integer) p0dVar.c(n6l.g);
                            float intValue = num == null ? num.intValue() : i7;
                            Integer num2 = (Integer) p0dVar.c(n6l.i);
                            if (num2 == null) {
                            }
                            List a = n6l.a(p0dVar);
                            d8d d8dVar = new d8d(this, rq3Var, i9);
                            f7lVar.r = context2;
                            f7lVar.s = ytjVar4;
                            f7lVar.t = list2;
                            f7lVar.u = it2;
                            f7lVar.v = re0Var2;
                            f7lVar.w = i4;
                            f7lVar.x = i5;
                            f7lVar.A = 3;
                            f7l f7lVar3 = f7lVar;
                            Context context5 = context2;
                            c = n6lVar.c(intValue, r21, a, context5, d8dVar, f7lVar3);
                            if (c != obj4) {
                            }
                            return obj4;
                        }
                        if (i == 3) {
                            obj = null;
                            int i10 = f7lVar.x;
                            int i11 = f7lVar.w;
                            re0 re0Var3 = f7lVar.v;
                            Iterator it4 = f7lVar.u;
                            List list4 = f7lVar.t;
                            ct8 ct8Var2 = f7lVar.s;
                            Context context6 = f7lVar.r;
                            y6a.M(obj3);
                            i3 = i10;
                            i2 = i11;
                            f7lVar2 = f7lVar;
                            obj2 = obj3;
                            re0Var = re0Var3;
                            context3 = context6;
                            it2 = it4;
                            list2 = list4;
                            ytjVar3 = ct8Var2;
                            ytj ytjVar5 = ytjVar3;
                            l6l l6lVar = (l6l) obj2;
                            rq3 rq3Var2 = rq3Var;
                            t53Var = new t53(ytjVar5, l6lVar.a, l6lVar.b, rq3Var2, 13);
                            ?? r8 = rq3Var2;
                            f7lVar2.r = context3;
                            f7lVar2.s = ytjVar5;
                            f7lVar2.t = list2;
                            f7lVar2.u = it2;
                            f7lVar2.v = r8;
                            f7lVar2.w = i2;
                            f7lVar2.x = i3;
                            f7lVar2.A = 4;
                            if (ml4.u0(context3, re0Var, t53Var, f7lVar2) != obj4) {
                            }
                            return obj4;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ct8 ct8Var3 = f7lVar.s;
                            y6a.M(obj3);
                            return Unit.a;
                        }
                        i2 = f7lVar.w;
                        Iterator it5 = f7lVar.u;
                        List list5 = f7lVar.t;
                        ct8 ct8Var4 = f7lVar.s;
                        obj = null;
                        context3 = f7lVar.r;
                        y6a.M(obj3);
                        rq3 rq3Var3 = null;
                        it2 = it5;
                        ytjVar2 = ct8Var4;
                        context2 = context3;
                        rq3Var = rq3Var3;
                        it = it2;
                        list = list5;
                        i7 = 0;
                        i8 = 2;
                        if (!it.hasNext()) {
                            re0 re0Var4 = (re0) it.next();
                            f7lVar.r = context2;
                            f7lVar.s = ytjVar2;
                            f7lVar.t = list;
                            f7lVar.u = it;
                            f7lVar.v = re0Var4;
                            f7lVar.w = i2;
                            f7lVar.x = i7;
                            f7lVar.A = i8;
                            doa doaVar = doa.d;
                            if (re0Var4 == null) {
                                a70.p("The glance ID is not the one of an App Widget");
                                return obj;
                            }
                            Object c2 = dz8.a.c(context2, doaVar, l98.M(re0Var4.a), f7lVar);
                            if (c2 != obj4) {
                                re0Var2 = re0Var4;
                                obj3 = c2;
                                list2 = list;
                                it2 = it;
                                ytjVar4 = ytjVar2;
                                i4 = i2;
                                i5 = i7;
                                p0d p0dVar2 = (p0d) obj3;
                                n6l n6lVar2 = n6l.a;
                                p0dVar2.getClass();
                                Integer num3 = (Integer) p0dVar2.c(n6l.g);
                                float intValue2 = num3 == null ? num3.intValue() : i7;
                                Integer num22 = (Integer) p0dVar2.c(n6l.i);
                                int intValue3 = num22 == null ? num22.intValue() : 0;
                                List a2 = n6l.a(p0dVar2);
                                d8d d8dVar2 = new d8d(this, rq3Var, i9);
                                f7lVar.r = context2;
                                f7lVar.s = ytjVar4;
                                f7lVar.t = list2;
                                f7lVar.u = it2;
                                f7lVar.v = re0Var2;
                                f7lVar.w = i4;
                                f7lVar.x = i5;
                                f7lVar.A = 3;
                                f7l f7lVar32 = f7lVar;
                                Context context52 = context2;
                                c = n6lVar2.c(intValue2, intValue3, a2, context52, d8dVar2, f7lVar32);
                                if (c != obj4) {
                                    obj2 = c;
                                    re0Var = re0Var2;
                                    context3 = context52;
                                    i3 = i5;
                                    i2 = i4;
                                    f7lVar2 = f7lVar32;
                                    ytjVar3 = ytjVar4;
                                    ytj ytjVar52 = ytjVar3;
                                    l6l l6lVar2 = (l6l) obj2;
                                    rq3 rq3Var22 = rq3Var;
                                    t53Var = new t53(ytjVar52, l6lVar2.a, l6lVar2.b, rq3Var22, 13);
                                    ?? r82 = rq3Var22;
                                    f7lVar2.r = context3;
                                    f7lVar2.s = ytjVar52;
                                    f7lVar2.t = list2;
                                    f7lVar2.u = it2;
                                    f7lVar2.v = r82;
                                    f7lVar2.w = i2;
                                    f7lVar2.x = i3;
                                    f7lVar2.A = 4;
                                    if (ml4.u0(context3, re0Var, t53Var, f7lVar2) != obj4) {
                                        f7lVar = f7lVar2;
                                        ytjVar2 = ytjVar52;
                                        list5 = list2;
                                        rq3Var3 = r82;
                                        context2 = context3;
                                        rq3Var = rq3Var3;
                                        it = it2;
                                        list = list5;
                                        i7 = 0;
                                        i8 = 2;
                                        if (!it.hasNext()) {
                                            ?? r83 = rq3Var;
                                            if (list.isEmpty()) {
                                                return Unit.a;
                                            }
                                            auh auhVar = new auh(0);
                                            f7lVar.r = r83;
                                            f7lVar.s = r83;
                                            f7lVar.t = r83;
                                            f7lVar.u = r83;
                                            f7lVar.v = r83;
                                            f7lVar.A = 5;
                                        }
                                    }
                                }
                            }
                        }
                        return obj4;
                    }
                    obj = null;
                    ct8 ct8Var5 = f7lVar.s;
                    Context context7 = f7lVar.r;
                    y6a.M(obj3);
                    ytjVar2 = ct8Var5;
                    context4 = context7;
                }
                List list6 = (List) obj3;
                context2 = context4;
                list = list6;
                it = list6.iterator();
                i2 = 0;
                if (!it.hasNext()) {
                }
                return obj4;
            }
        }
        f7lVar = new f7l(this, sq3Var);
        Object obj32 = f7lVar.y;
        Object obj42 = lu3.a;
        i = f7lVar.A;
        int i72 = 0;
        int i82 = 2;
        int i92 = 1;
        rq3 rq3Var4 = null;
        if (i != 0) {
        }
        List list62 = (List) obj32;
        context2 = context4;
        list = list62;
        it = list62.iterator();
        i2 = 0;
        if (!it.hasNext()) {
        }
        return obj42;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        g7l g7lVar;
        int i;
        if (sq3Var instanceof g7l) {
            g7lVar = (g7l) sq3Var;
            int i2 = g7lVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g7lVar.t = i2 - Integer.MIN_VALUE;
                Object obj = g7lVar.r;
                lu3 lu3Var = lu3.a;
                i = g7lVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    g7lVar.t = 1;
                    obj = this.b.d(g7lVar);
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
                Boolean bool = (Boolean) obj;
                return (!Intrinsics.c(bool, Boolean.TRUE) || bool == null) ? jdb.a() : new hdb();
            }
        }
        g7lVar = new g7l(this, sq3Var);
        Object obj2 = g7lVar.r;
        lu3 lu3Var2 = lu3.a;
        i = g7lVar.t;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        if (Intrinsics.c(bool2, Boolean.TRUE)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        if (defpackage.td4.y0(r10, r7, r0) == r13) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
    
        if (r10 == r13) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r12v5, types: [kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Context context, qdj qdjVar, sq3 sq3Var) {
        h7l h7lVar;
        int i;
        qdj qdjVar2;
        Context context2;
        Function1 function1;
        Iterator it;
        int i2;
        List list;
        if (sq3Var instanceof h7l) {
            h7lVar = (h7l) sq3Var;
            int i3 = h7lVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h7lVar.y = i3 - Integer.MIN_VALUE;
                Object obj = h7lVar.w;
                Object obj2 = lu3.a;
                i = h7lVar.y;
                int i4 = 0;
                int i5 = 3;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    ry8 ry8Var = new ry8(context);
                    h7lVar.r = context;
                    h7lVar.s = qdjVar;
                    h7lVar.y = 1;
                    obj = ry8Var.a(auh.class, h7lVar);
                    qdjVar2 = qdjVar;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Function1 function12 = h7lVar.s;
                            y6a.M(obj);
                            return Unit.a;
                        }
                        i2 = h7lVar.v;
                        it = h7lVar.u;
                        list = h7lVar.t;
                        function1 = h7lVar.s;
                        context2 = h7lVar.r;
                        y6a.M(obj);
                        while (true) {
                            if (it.hasNext()) {
                                re0 re0Var = (re0) it.next();
                                cb4 cb4Var = new cb4(function1, rq3Var, i5);
                                h7lVar.r = context2;
                                h7lVar.s = function1;
                                h7lVar.t = list;
                                h7lVar.u = it;
                                h7lVar.v = i2;
                                h7lVar.y = 2;
                                if (ml4.u0(context2, re0Var, cb4Var, h7lVar) == obj2) {
                                    break;
                                }
                            } else {
                                if (list.isEmpty()) {
                                    return Unit.a;
                                }
                                auh auhVar = new auh(i4);
                                h7lVar.r = null;
                                h7lVar.s = null;
                                h7lVar.t = null;
                                h7lVar.u = null;
                                h7lVar.y = 3;
                            }
                        }
                        return obj2;
                    }
                    Function1 function13 = h7lVar.s;
                    context = h7lVar.r;
                    y6a.M(obj);
                    qdjVar2 = function13;
                }
                List list2 = (List) obj;
                context2 = context;
                function1 = qdjVar2;
                it = list2.iterator();
                i2 = 0;
                list = list2;
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                return obj2;
            }
        }
        h7lVar = new h7l(this, sq3Var);
        Object obj3 = h7lVar.w;
        Object obj22 = lu3.a;
        i = h7lVar.y;
        int i42 = 0;
        int i52 = 3;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        List list22 = (List) obj3;
        context2 = context;
        function1 = qdjVar2;
        it = list22.iterator();
        i2 = 0;
        list = list22;
        while (true) {
            if (it.hasNext()) {
            }
        }
        return obj22;
    }
}
