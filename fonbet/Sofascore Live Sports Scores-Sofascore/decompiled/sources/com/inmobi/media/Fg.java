package com.inmobi.media;

import android.content.ContentValues;
import defpackage.a70;
import defpackage.dmi;
import defpackage.k13;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.mz1;
import defpackage.sq3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Fg {
    public final C3724r9 a;

    public Fg(C3724r9 c3724r9) {
        c3724r9.getClass();
        this.a = c3724r9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[LOOP:0: B:17:0x0071->B:19:0x0077, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        Bg bg;
        int i;
        Iterator it;
        C3473hg c3473hg;
        if (sq3Var instanceof Bg) {
            bg = (Bg) sq3Var;
            int i2 = bg.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bg.d = i2 - Integer.MIN_VALUE;
                Object obj = bg.b;
                lu3 lu3Var = lu3.a;
                i = bg.d;
                if (i != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.a;
                    bg.d = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, "SELECT * FROM pings WHERE priority='" + str + "' ORDER BY time_created ASC LIMIT 1", null), bg);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        C3473hg c3473hg2 = bg.a;
                        y6a.M(obj);
                        return c3473hg2;
                    }
                    y6a.M(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Gg.a((ContentValues) it.next()));
                }
                c3473hg = (C3473hg) CollectionsKt.firstOrNull(arrayList);
                if (c3473hg != null) {
                    C3724r9 c3724r92 = this.a;
                    String[] strArr = {c3473hg.b};
                    bg.a = c3473hg;
                    bg.d = 2;
                    if (c3724r92.a("pings", "id=?", strArr, bg) == lu3Var) {
                        return lu3Var;
                    }
                }
                return c3473hg;
            }
        }
        bg = new Bg(this, sq3Var);
        Object obj2 = bg.b;
        lu3 lu3Var2 = lu3.a;
        i = bg.d;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        c3473hg = (C3473hg) CollectionsKt.firstOrNull(arrayList2);
        if (c3473hg != null) {
        }
        return c3473hg;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086 A[LOOP:0: B:11:0x0080->B:13:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Integer num, sq3 sq3Var) {
        Dg dg;
        int i;
        Iterator it;
        if (sq3Var instanceof Dg) {
            dg = (Dg) sq3Var;
            int i2 = dg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dg.c = i2 - Integer.MIN_VALUE;
                Object obj = dg.a;
                lu3 lu3Var = lu3.a;
                i = dg.c;
                if (i != 0) {
                    y6a.M(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    String j = num != null ? ljg.j(num.intValue(), " LIMIT ") : "";
                    StringBuilder sb = new StringBuilder("SELECT * FROM pings WHERE priority='");
                    sb.append(str);
                    sb.append("' AND retry_count>=1 AND retryAfter<=");
                    sb.append(currentTimeMillis);
                    String o = mz1.o(sb, " ORDER BY time_created ASC", j);
                    C3724r9 c3724r9 = this.a;
                    dg.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, o, null), dg);
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
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Gg.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        dg = new Dg(this, sq3Var);
        Object obj2 = dg.a;
        lu3 lu3Var2 = lu3.a;
        i = dg.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    public final Object b(String str, sq3 sq3Var) {
        String o = lnb.o("SELECT COUNT(*) FROM pings WHERE priority='", str, "'");
        C3724r9 c3724r9 = this.a;
        c3724r9.getClass();
        return c3724r9.a(new C3492i9(c3724r9, o, null), sq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[LOOP:0: B:11:0x007c->B:13:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Integer num, String str, long j, sq3 sq3Var) {
        Eg eg;
        int i;
        String str2;
        Iterator it;
        if (sq3Var instanceof Eg) {
            eg = (Eg) sq3Var;
            int i2 = eg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eg.c = i2 - Integer.MIN_VALUE;
                Object obj = eg.a;
                lu3 lu3Var = lu3.a;
                i = eg.c;
                if (i != 0) {
                    y6a.M(obj);
                    if (num != null) {
                        str2 = ljg.j(num.intValue(), " LIMIT ");
                    } else {
                        str2 = "";
                    }
                    StringBuilder sb = new StringBuilder("SELECT * FROM pings WHERE priority='");
                    sb.append(str);
                    sb.append("' AND retry_count=0 AND time_created<");
                    sb.append(j);
                    String o = mz1.o(sb, " ORDER BY time_created ASC", str2);
                    C3724r9 c3724r9 = this.a;
                    eg.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, o, null), eg);
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
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Gg.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        eg = new Eg(this, sq3Var);
        Object obj2 = eg.a;
        lu3 lu3Var2 = lu3.a;
        i = eg.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086 A[LOOP:0: B:11:0x0080->B:13:0x0086, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Integer num, sq3 sq3Var) {
        Cg cg;
        int i;
        String str2;
        Iterator it;
        if (sq3Var instanceof Cg) {
            cg = (Cg) sq3Var;
            int i2 = cg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cg.c = i2 - Integer.MIN_VALUE;
                Object obj = cg.a;
                lu3 lu3Var = lu3.a;
                i = cg.c;
                if (i != 0) {
                    y6a.M(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (num != null) {
                        str2 = ljg.j(num.intValue(), " LIMIT ");
                    } else {
                        str2 = "";
                    }
                    StringBuilder sb = new StringBuilder("SELECT * FROM pings WHERE priority='");
                    sb.append(str);
                    sb.append("' AND retryAfter<=");
                    sb.append(currentTimeMillis);
                    String o = mz1.o(sb, " ORDER BY time_created ASC", str2);
                    C3724r9 c3724r9 = this.a;
                    cg.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, o, null), cg);
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
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Gg.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        cg = new Cg(this, sq3Var);
        Object obj2 = cg.a;
        lu3 lu3Var2 = lu3.a;
        i = cg.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    public final Object a(long j, sq3 sq3Var) {
        Object a = C3724r9.a(this.a, "pings", dmi.q("time_created<", String.valueOf(System.currentTimeMillis() - j)), sq3Var, 4);
        return a == lu3.a ? a : Unit.a;
    }
}
