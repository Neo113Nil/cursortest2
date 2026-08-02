package defpackage;

import android.content.Context;
import com.sofascore.model.database.DbNatsEvent;
import com.sofascore.results.mvvm.base.AbstractActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s5d {
    public final Context a;
    public final z4d b;
    public p4d e;
    public x4d f;
    public final ArrayList c = new ArrayList();
    public zj3 d = zj3.c;
    public final j2d g = new j2d();

    public s5d(Context context, z4d z4dVar) {
        this.a = context;
        this.b = z4dVar;
    }

    public final void a(AbstractActivity abstractActivity, String str, Function0 function0, boolean z, Function1 function1) {
        e6b e6bVar = e6b.a;
        xw3.L(wca.x(abstractActivity.getLifecycle()), null, null, new pf4(this, str, abstractActivity, function0, z, function1, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:30|31|(3:33|(1:35)(1:38)|(2:37|27)))|19|20|(2:22|(1:(1:25))(1:28))|12|13))|41|6|7|(0)(0)|19|20|(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        if (((defpackage.a5d) r7).b(r10, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0040, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r11 = defpackage.w2g.b;
        r8 = new defpackage.u2g(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(p4d p4dVar, Integer num, DbNatsEvent dbNatsEvent, sq3 sq3Var) {
        r5d r5dVar;
        int i;
        Throwable a;
        if (sq3Var instanceof r5d) {
            r5dVar = (r5d) sq3Var;
            int i2 = r5dVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r5dVar.w = i2 - Integer.MIN_VALUE;
                Object obj = r5dVar.u;
                Object obj2 = lu3.a;
                i = r5dVar.w;
                z4d z4dVar = this.b;
                if (i != 0) {
                    y6a.M(obj);
                    p2g p2gVar = w2g.b;
                    p4dVar.n0(dbNatsEvent.getTopic(), c.m(dbNatsEvent.getMessage()));
                    if (num != null) {
                        int intValue = num.intValue();
                        r5dVar.r = num;
                        r5dVar.s = dbNatsEvent;
                        r5dVar.t = null;
                        r5dVar.w = 1;
                        Object U = gz8.U(r5dVar, ((a5d) z4dVar).a, false, true, new bvb(intValue, 4));
                        if (U != obj2) {
                            U = Unit.a;
                        }
                        if (U == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dbNatsEvent = r5dVar.s;
                    num = r5dVar.r;
                    y6a.M(obj);
                }
                Object u2gVar = Unit.a;
                p2g p2gVar2 = w2g.b;
                a = w2g.a(u2gVar);
                if (a != null) {
                    if (a instanceof CancellationException) {
                        throw a;
                    }
                    if (num == null) {
                        s38.a().c(new t5d(a));
                        r5dVar.r = null;
                        r5dVar.s = null;
                        r5dVar.t = u2gVar;
                        r5dVar.w = 2;
                    }
                }
                return Unit.a;
            }
        }
        r5dVar = new r5d(this, sq3Var);
        Object obj3 = r5dVar.u;
        Object obj22 = lu3.a;
        i = r5dVar.w;
        z4d z4dVar2 = this.b;
        if (i != 0) {
        }
        Object u2gVar2 = Unit.a;
        p2g p2gVar22 = w2g.b;
        a = w2g.a(u2gVar2);
        if (a != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f3, code lost:
    
        if (((defpackage.a5d) r8).b(r1, r4) == r5) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0079: MOVE (r1 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:122), block:B:91:0x0079 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0176 A[Catch: all -> 0x003b, TryCatch #4 {all -> 0x003b, blocks: (B:13:0x0036, B:14:0x01d7, B:23:0x0170, B:25:0x0176, B:32:0x01a4, B:43:0x0161, B:48:0x013b, B:58:0x0109, B:60:0x010d, B:66:0x0131, B:67:0x01be), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d A[Catch: all -> 0x003b, TryCatch #4 {all -> 0x003b, blocks: (B:13:0x0036, B:14:0x01d7, B:23:0x0170, B:25:0x0176, B:32:0x01a4, B:43:0x0161, B:48:0x013b, B:58:0x0109, B:60:0x010d, B:66:0x0131, B:67:0x01be), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be A[Catch: all -> 0x003b, TryCatch #4 {all -> 0x003b, blocks: (B:13:0x0036, B:14:0x01d7, B:23:0x0170, B:25:0x0176, B:32:0x01a4, B:43:0x0161, B:48:0x013b, B:58:0x0109, B:60:0x010d, B:66:0x0131, B:67:0x01be), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r11v14, types: [h2d] */
    /* JADX WARN: Type inference failed for: r11v8, types: [h2d] */
    /* JADX WARN: Type inference failed for: r12v14, types: [h2d] */
    /* JADX WARN: Type inference failed for: r13v10, types: [h2d] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, s5d] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.sofascore.model.database.DbNatsEvent] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23, types: [h2d] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v3, types: [h2d] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [h2d] */
    /* JADX WARN: Type inference failed for: r8v1, types: [a5d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(DbNatsEvent dbNatsEvent, boolean z, sq3 sq3Var) {
        q5d q5dVar;
        int i;
        Object obj;
        j2d j2dVar;
        int i2;
        DbNatsEvent dbNatsEvent2;
        Object R;
        DbNatsEvent dbNatsEvent3;
        j2d j2dVar2;
        boolean z2;
        int i3;
        p4d p4dVar;
        DbNatsEvent dbNatsEvent4;
        p4d p4dVar2;
        int i4;
        int i5;
        j2d j2dVar3;
        Object U;
        p4d p4dVar3;
        DbNatsEvent dbNatsEvent5;
        j2d j2dVar4;
        int i6;
        int i7;
        Iterator it;
        int i8;
        p4d p4dVar4;
        boolean z3;
        DbNatsEvent dbNatsEvent6;
        j2d j2dVar5;
        ?? r1 = dbNatsEvent;
        boolean z4 = z;
        try {
            try {
                if (sq3Var instanceof q5d) {
                    q5dVar = (q5d) sq3Var;
                    int i9 = q5dVar.C;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        q5dVar.C = i9 - Integer.MIN_VALUE;
                        Object obj2 = q5dVar.A;
                        lu3 lu3Var = lu3.a;
                        i = q5dVar.C;
                        z4d z4dVar = this.b;
                        rq3 rq3Var = null;
                        switch (i) {
                            case 0:
                                y6a.M(obj2);
                                if (z4 || !waa.D(this.a)) {
                                    q5dVar.r = null;
                                    q5dVar.v = z4;
                                    q5dVar.C = 1;
                                    break;
                                } else {
                                    q5dVar.r = r1;
                                    j2dVar = this.g;
                                    q5dVar.s = j2dVar;
                                    q5dVar.v = z4;
                                    q5dVar.w = 0;
                                    q5dVar.C = 2;
                                    if (j2dVar.e(q5dVar) != lu3Var) {
                                        i2 = 0;
                                        dbNatsEvent2 = r1;
                                        try {
                                            q5dVar.r = dbNatsEvent2;
                                            q5dVar.s = j2dVar;
                                            q5dVar.v = z4;
                                            q5dVar.w = i2;
                                            q5dVar.x = 0;
                                            q5dVar.C = 3;
                                            hs4 hs4Var = z45.a;
                                            R = xw3.R(hq4.c, new j8c(this, rq3Var, 10), q5dVar);
                                            if (R != lu3Var) {
                                                dbNatsEvent3 = dbNatsEvent2;
                                                j2dVar2 = j2dVar;
                                                obj2 = R;
                                                z2 = z4;
                                                i3 = 0;
                                                p4dVar = (p4d) obj2;
                                                if (p4dVar != null) {
                                                    q5dVar.r = null;
                                                    q5dVar.s = j2dVar2;
                                                    q5dVar.t = null;
                                                    q5dVar.v = z2;
                                                    q5dVar.w = i2;
                                                    q5dVar.x = i3;
                                                    q5dVar.C = 8;
                                                    r1 = j2dVar2;
                                                    if (((a5d) z4dVar).b(dbNatsEvent3, q5dVar) == lu3Var) {
                                                    }
                                                    Unit unit = Unit.a;
                                                    r1.f(null);
                                                    return Unit.a;
                                                }
                                                q5dVar.r = dbNatsEvent3;
                                                q5dVar.s = j2dVar2;
                                                q5dVar.t = p4dVar;
                                                q5dVar.v = z2;
                                                q5dVar.w = i2;
                                                q5dVar.x = i3;
                                                q5dVar.y = 0;
                                                q5dVar.C = 4;
                                                Object U2 = gz8.U(q5dVar, ((a5d) z4dVar).a, false, true, new clc(18));
                                                if (U2 != lu3Var) {
                                                    U2 = Unit.a;
                                                }
                                                if (U2 != lu3Var) {
                                                    dbNatsEvent4 = dbNatsEvent3;
                                                    p4dVar2 = p4dVar;
                                                    i4 = i3;
                                                    i5 = 0;
                                                    j2dVar3 = j2dVar2;
                                                    q5dVar.r = dbNatsEvent4;
                                                    q5dVar.s = j2dVar3;
                                                    q5dVar.t = p4dVar2;
                                                    q5dVar.v = z2;
                                                    q5dVar.w = i2;
                                                    q5dVar.x = i4;
                                                    q5dVar.y = i5;
                                                    q5dVar.C = 5;
                                                    U = gz8.U(q5dVar, ((a5d) z4dVar).a, true, false, new clc(19));
                                                    if (U == lu3Var) {
                                                        p4dVar3 = p4dVar2;
                                                        dbNatsEvent5 = dbNatsEvent4;
                                                        j2dVar4 = j2dVar3;
                                                        int i10 = i2;
                                                        i6 = i4;
                                                        i7 = 0;
                                                        it = ((Iterable) U).iterator();
                                                        i8 = i10;
                                                        boolean z5 = z2;
                                                        p4dVar4 = p4dVar3;
                                                        z3 = z5;
                                                        dbNatsEvent6 = dbNatsEvent5;
                                                        j2dVar5 = j2dVar4;
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                DbNatsEvent dbNatsEvent7 = (DbNatsEvent) it.next();
                                                                Integer num = new Integer(dbNatsEvent7.getId());
                                                                q5dVar.r = dbNatsEvent6;
                                                                q5dVar.s = j2dVar5;
                                                                q5dVar.t = p4dVar4;
                                                                q5dVar.u = it;
                                                                q5dVar.v = z3;
                                                                q5dVar.w = i8;
                                                                q5dVar.x = i6;
                                                                q5dVar.y = i5;
                                                                q5dVar.z = i7;
                                                                q5dVar.C = 6;
                                                                if (b(p4dVar4, num, dbNatsEvent7, q5dVar) == lu3Var) {
                                                                }
                                                            } else {
                                                                q5dVar.r = dbNatsEvent6;
                                                                q5dVar.s = j2dVar5;
                                                                q5dVar.t = null;
                                                                q5dVar.u = null;
                                                                q5dVar.v = z3;
                                                                q5dVar.w = i8;
                                                                q5dVar.x = i6;
                                                                q5dVar.y = i5;
                                                                q5dVar.C = 7;
                                                                r1 = j2dVar5;
                                                                if (b(p4dVar4, null, dbNatsEvent6, q5dVar) == lu3Var) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            r1 = j2dVar;
                                            r1.f(null);
                                            throw th;
                                        }
                                    }
                                }
                                return lu3Var;
                            case 1:
                                y6a.M(obj2);
                                return Unit.a;
                            case 2:
                                int i11 = q5dVar.w;
                                z4 = q5dVar.v;
                                ?? r6 = q5dVar.s;
                                DbNatsEvent dbNatsEvent8 = q5dVar.r;
                                y6a.M(obj2);
                                j2dVar = r6;
                                i2 = i11;
                                dbNatsEvent2 = dbNatsEvent8;
                                q5dVar.r = dbNatsEvent2;
                                q5dVar.s = j2dVar;
                                q5dVar.v = z4;
                                q5dVar.w = i2;
                                q5dVar.x = 0;
                                q5dVar.C = 3;
                                hs4 hs4Var2 = z45.a;
                                R = xw3.R(hq4.c, new j8c(this, rq3Var, 10), q5dVar);
                                if (R != lu3Var) {
                                }
                                return lu3Var;
                            case 3:
                                int i12 = q5dVar.x;
                                int i13 = q5dVar.w;
                                boolean z6 = q5dVar.v;
                                ?? r11 = q5dVar.s;
                                dbNatsEvent3 = q5dVar.r;
                                y6a.M(obj2);
                                i3 = i12;
                                j2dVar2 = r11;
                                z2 = z6;
                                i2 = i13;
                                p4dVar = (p4d) obj2;
                                if (p4dVar != null) {
                                }
                                return lu3Var;
                            case 4:
                                int i14 = q5dVar.y;
                                int i15 = q5dVar.x;
                                i2 = q5dVar.w;
                                z2 = q5dVar.v;
                                p4dVar2 = q5dVar.t;
                                ?? r13 = q5dVar.s;
                                dbNatsEvent4 = q5dVar.r;
                                try {
                                    y6a.M(obj2);
                                    i4 = i15;
                                    i5 = i14;
                                    j2dVar3 = r13;
                                    q5dVar.r = dbNatsEvent4;
                                    q5dVar.s = j2dVar3;
                                    q5dVar.t = p4dVar2;
                                    q5dVar.v = z2;
                                    q5dVar.w = i2;
                                    q5dVar.x = i4;
                                    q5dVar.y = i5;
                                    q5dVar.C = 5;
                                    U = gz8.U(q5dVar, ((a5d) z4dVar).a, true, false, new clc(19));
                                    if (U == lu3Var) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r1 = r13;
                                    r1.f(null);
                                    throw th;
                                }
                                break;
                            case 5:
                                int i16 = q5dVar.y;
                                int i17 = q5dVar.x;
                                i2 = q5dVar.w;
                                boolean z7 = q5dVar.v;
                                p4dVar3 = q5dVar.t;
                                ?? r112 = q5dVar.s;
                                dbNatsEvent5 = q5dVar.r;
                                y6a.M(obj2);
                                i5 = i16;
                                j2dVar4 = r112;
                                z2 = z7;
                                U = obj2;
                                i4 = i17;
                                int i102 = i2;
                                i6 = i4;
                                i7 = 0;
                                it = ((Iterable) U).iterator();
                                i8 = i102;
                                boolean z52 = z2;
                                p4dVar4 = p4dVar3;
                                z3 = z52;
                                dbNatsEvent6 = dbNatsEvent5;
                                j2dVar5 = j2dVar4;
                                while (true) {
                                    if (it.hasNext()) {
                                    }
                                }
                                return lu3Var;
                            case 6:
                                int i18 = q5dVar.z;
                                i5 = q5dVar.y;
                                i6 = q5dVar.x;
                                i8 = q5dVar.w;
                                z3 = q5dVar.v;
                                it = q5dVar.u;
                                p4dVar4 = q5dVar.t;
                                ?? r12 = q5dVar.s;
                                dbNatsEvent6 = q5dVar.r;
                                try {
                                    y6a.M(obj2);
                                    i7 = i18;
                                    j2dVar5 = r12;
                                    while (true) {
                                        if (it.hasNext()) {
                                        }
                                    }
                                    return lu3Var;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r1 = r12;
                                    r1.f(null);
                                    throw th;
                                }
                            case 7:
                            case 8:
                                h2d h2dVar = q5dVar.s;
                                y6a.M(obj2);
                                r1 = h2dVar;
                                Unit unit2 = Unit.a;
                                r1.f(null);
                                return Unit.a;
                            default:
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                switch (i) {
                }
            } catch (Throwable th4) {
                th = th4;
                r1 = obj;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        q5dVar = new q5d(this, sq3Var);
        Object obj22 = q5dVar.A;
        lu3 lu3Var2 = lu3.a;
        i = q5dVar.C;
        z4d z4dVar2 = this.b;
        rq3 rq3Var2 = null;
    }
}
