package com.inmobi.media;

import android.content.ContentValues;
import defpackage.a70;
import defpackage.fc6;
import defpackage.k13;
import defpackage.lnb;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Kb {
    public final C3724r9 a;
    public WeakReference b;

    public Kb(C3724r9 c3724r9) {
        c3724r9.getClass();
        this.a = c3724r9;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[LOOP:0: B:11:0x006a->B:13:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, int i, sq3 sq3Var) {
        Eb eb;
        int i2;
        Iterator it;
        if (sq3Var instanceof Eb) {
            eb = (Eb) sq3Var;
            int i3 = eb.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eb.c = i3 - Integer.MIN_VALUE;
                Object obj = eb.a;
                lu3 lu3Var = lu3.a;
                i2 = eb.c;
                if (i2 != 0) {
                    y6a.M(obj);
                    StringBuilder sb = new StringBuilder("SELECT * FROM logs_v2 WHERE id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > ");
                    sb.append(j);
                    sb.append(" ORDER BY saveTimestamp DESC LIMIT ");
                    String h = fc6.h(i, ") AS recent_logs);", sb);
                    C3724r9 c3724r9 = this.a;
                    eb.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, h, null), eb);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Mb.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        eb = new Eb(this, sq3Var);
        Object obj2 = eb.a;
        lu3 lu3Var2 = lu3.a;
        i2 = eb.c;
        if (i2 != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[LOOP:0: B:11:0x0057->B:13:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        Gb gb;
        int i;
        Iterator it;
        if (sq3Var instanceof Gb) {
            gb = (Gb) sq3Var;
            int i2 = gb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gb.c = i2 - Integer.MIN_VALUE;
                Object obj = gb.a;
                lu3 lu3Var = lu3.a;
                i = gb.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.a;
                    gb.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=0", null), gb);
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
                    arrayList.add(Mb.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        gb = new Gb(this, sq3Var);
        Object obj2 = gb.a;
        lu3 lu3Var2 = lu3.a;
        i = gb.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Db db, sq3 sq3Var) {
        Jb jb;
        int i;
        WeakReference weakReference;
        if (sq3Var instanceof Jb) {
            jb = (Jb) sq3Var;
            int i2 = jb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jb.c = i2 - Integer.MIN_VALUE;
                Jb jb2 = jb;
                Object obj = jb2.a;
                lu3 lu3Var = lu3.a;
                i = jb2.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.a;
                    ContentValues a = Mb.a(db);
                    String[] strArr = {db.a};
                    jb2.c = 1;
                    if (C3724r9.a(c3724r9, "logs_v2", a, "filename=?", strArr, jb2, 16) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                weakReference = this.b;
                if (weakReference != null && ((C3932z9) weakReference.get()) != null) {
                    C3932z9.a();
                }
                return Unit.a;
            }
        }
        jb = new Jb(this, sq3Var);
        Jb jb22 = jb;
        Object obj2 = jb22.a;
        lu3 lu3Var2 = lu3.a;
        i = jb22.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            C3932z9.a();
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, sq3 sq3Var) {
        Hb hb;
        int i;
        if (sq3Var instanceof Hb) {
            hb = (Hb) sq3Var;
            int i2 = hb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hb.c = i2 - Integer.MIN_VALUE;
                Object obj = hb.a;
                lu3 lu3Var = lu3.a;
                i = hb.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.a;
                    hb.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3492i9(c3724r9, "SELECT COUNT(*) FROM logs_v2 WHERE filename='" + str + "'", null), hb);
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
                return Boolean.valueOf(((Number) obj).intValue() != 0);
            }
        }
        hb = new Hb(this, sq3Var);
        Object obj2 = hb.a;
        lu3 lu3Var2 = lu3.a;
        i = hb.c;
        if (i != 0) {
        }
        return Boolean.valueOf(((Number) obj2).intValue() != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[LOOP:0: B:11:0x0057->B:13:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        Fb fb;
        int i;
        Iterator it;
        if (sq3Var instanceof Fb) {
            fb = (Fb) sq3Var;
            int i2 = fb.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fb.c = i2 - Integer.MIN_VALUE;
                Object obj = fb.a;
                lu3 lu3Var = lu3.a;
                i = fb.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.a;
                    fb.c = 1;
                    c3724r9.getClass();
                    obj = c3724r9.a(new C3621n9(c3724r9, "SELECT * FROM logs_v2 WHERE hasLoggerFinished=1", null), fb);
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
                    arrayList.add(Mb.a((ContentValues) it.next()));
                }
                return arrayList;
            }
        }
        fb = new Fb(this, sq3Var);
        Object obj2 = fb.a;
        lu3 lu3Var2 = lu3.a;
        i = fb.c;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Db db, sq3 sq3Var) {
        Ib ib;
        int i;
        WeakReference weakReference;
        if (sq3Var instanceof Ib) {
            ib = (Ib) sq3Var;
            int i2 = ib.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ib.c = i2 - Integer.MIN_VALUE;
                Object obj = ib.a;
                lu3 lu3Var = lu3.a;
                i = ib.c;
                if (i != 0) {
                    y6a.M(obj);
                    C3724r9 c3724r9 = this.a;
                    ContentValues a = Mb.a(db);
                    ib.c = 1;
                    if (c3724r9.a("logs_v2", a, 4, ib) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                weakReference = this.b;
                if (weakReference != null && ((C3932z9) weakReference.get()) != null) {
                    C3932z9.a();
                }
                return Unit.a;
            }
        }
        ib = new Ib(this, sq3Var);
        Object obj2 = ib.a;
        lu3 lu3Var2 = lu3.a;
        i = ib.c;
        if (i != 0) {
        }
        weakReference = this.b;
        if (weakReference != null) {
            C3932z9.a();
        }
        return Unit.a;
    }

    public final Object a(String str, sq3 sq3Var) {
        Object a = C3724r9.a(this.a, "logs_v2", lnb.o("filename='", str, "'"), sq3Var, 4);
        return a == lu3.a ? a : Unit.a;
    }
}
