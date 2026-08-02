package com.inmobi.media;

import com.sofascore.model.newNetwork.FootballShotmapItem;
import defpackage.a70;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.u7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3800u7 extends AbstractC3680pg {
    public static final /* synthetic */ int h = 0;
    public final h2d f;
    public yda g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3800u7(Fg fg, M8 m8, C3860wf c3860wf) {
        super(fg, m8, c3860wf);
        fg.getClass();
        m8.getClass();
        c3860wf.getClass();
        this.f = new j2d();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(9:19|20|21|(2:23|(2:25|(1:27)(1:30))(1:31))|32|(2:35|33)|36|37|38))(8:39|40|(4:42|(2:44|29)|21|(0))|32|(1:33)|36|37|38))(2:45|46))(3:50|51|(2:53|(2:55|29))(2:56|57))|47|(2:49|29)|40|(0)|32|(1:33)|36|37|38))|62|6|7|(0)(0)|47|(0)|40|(0)|32|(1:33)|36|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
    
        if (r13 == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ec, code lost:
    
        r13.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f0, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f1, code lost:
    
        r13.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa A[Catch: Error -> 0x00eb, Exception -> 0x00f0, TryCatch #2 {Error -> 0x00eb, Exception -> 0x00f0, blocks: (B:13:0x002f, B:14:0x00c7, B:20:0x003c, B:21:0x00a2, B:23:0x00aa, B:25:0x00b6, B:30:0x00bf, B:31:0x00c2, B:32:0x00ca, B:33:0x00d1, B:35:0x00d7, B:39:0x0040, B:40:0x008c, B:42:0x0095, B:46:0x0046, B:47:0x007c, B:51:0x004d, B:53:0x0053, B:56:0x00e8), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7 A[Catch: Error -> 0x00eb, Exception -> 0x00f0, LOOP:0: B:33:0x00d1->B:35:0x00d7, LOOP_END, TryCatch #2 {Error -> 0x00eb, Exception -> 0x00f0, blocks: (B:13:0x002f, B:14:0x00c7, B:20:0x003c, B:21:0x00a2, B:23:0x00aa, B:25:0x00b6, B:30:0x00bf, B:31:0x00c2, B:32:0x00ca, B:33:0x00d1, B:35:0x00d7, B:39:0x0040, B:40:0x008c, B:42:0x0095, B:46:0x0046, B:47:0x007c, B:51:0x004d, B:53:0x0053, B:56:0x00e8), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095 A[Catch: Error -> 0x00eb, Exception -> 0x00f0, TryCatch #2 {Error -> 0x00eb, Exception -> 0x00f0, blocks: (B:13:0x002f, B:14:0x00c7, B:20:0x003c, B:21:0x00a2, B:23:0x00aa, B:25:0x00b6, B:30:0x00bf, B:31:0x00c2, B:32:0x00ca, B:33:0x00d1, B:35:0x00d7, B:39:0x0040, B:40:0x008c, B:42:0x0095, B:46:0x0046, B:47:0x007c, B:51:0x004d, B:53:0x0053, B:56:0x00e8), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        C3515j7 c3515j7;
        Object obj;
        Object obj2;
        int i;
        int high;
        List list;
        Iterator it;
        Object obj3;
        if (sq3Var instanceof C3515j7) {
            c3515j7 = (C3515j7) sq3Var;
            int i2 = c3515j7.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3515j7.e = i2 - Integer.MIN_VALUE;
                obj = c3515j7.c;
                obj2 = lu3.a;
                i = c3515j7.e;
                if (i != 0) {
                    y6a.M(obj);
                    if (this.d != EnumC3602mg.STARTED) {
                        return Unit.a;
                    }
                    high = AbstractC3680pg.a().getMaxBatchSize().getHigh();
                    Fg fg = this.a;
                    long high2 = AbstractC3680pg.a().getExpiry().getHigh() * 1000;
                    c3515j7.a = high;
                    c3515j7.e = 1;
                    if (fg.a(high2, c3515j7) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            list = (List) obj;
                            if (list.isEmpty()) {
                                Fg fg2 = this.a;
                                c3515j7.b = list;
                                c3515j7.e = 3;
                                obj = fg2.b(FootballShotmapItem.GOAL_HIGH, c3515j7);
                                if (obj == obj2) {
                                    return obj2;
                                }
                                if (((Number) obj).intValue() == 0) {
                                }
                            }
                            list.size();
                            it = list.iterator();
                            while (it.hasNext()) {
                            }
                            return Unit.a;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                y6a.M(obj);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = c3515j7.b;
                        y6a.M(obj);
                        if (((Number) obj).intValue() == 0) {
                            c3515j7.b = null;
                            c3515j7.e = 4;
                            EnumC3602mg enumC3602mg = EnumC3602mg.STOPPED;
                            if (this.d == EnumC3602mg.STARTED) {
                                this.d = enumC3602mg;
                                obj3 = e(c3515j7);
                                if (obj3 != obj2) {
                                    obj3 = Unit.a;
                                }
                            } else {
                                obj3 = Unit.a;
                            }
                        }
                        list.size();
                        it = list.iterator();
                        while (it.hasNext()) {
                            xw3.L(L9.d, null, null, new C3567l7(this, (C3473hg) it.next(), null), 3);
                        }
                        return Unit.a;
                    }
                    high = c3515j7.a;
                    y6a.M(obj);
                }
                Fg fg3 = this.a;
                Integer num = new Integer(high);
                c3515j7.e = 2;
                obj = fg3.b(FootballShotmapItem.GOAL_HIGH, num, c3515j7);
                if (obj == obj2) {
                    return obj2;
                }
                list = (List) obj;
                if (list.isEmpty()) {
                }
                list.size();
                it = list.iterator();
                while (it.hasNext()) {
                }
                return Unit.a;
            }
        }
        c3515j7 = new C3515j7(this, sq3Var);
        obj = c3515j7.c;
        obj2 = lu3.a;
        i = c3515j7.e;
        if (i != 0) {
        }
        Fg fg32 = this.a;
        Integer num2 = new Integer(high);
        c3515j7.e = 2;
        obj = fg32.b(FootballShotmapItem.GOAL_HIGH, num2, c3515j7);
        if (obj == obj2) {
        }
        list = (List) obj;
        if (list.isEmpty()) {
        }
        list.size();
        it = list.iterator();
        while (it.hasNext()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b5 -> B:12:0x00b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        C3593m7 c3593m7;
        int i;
        int i2;
        long j;
        List list;
        long j2;
        if (sq3Var instanceof C3593m7) {
            c3593m7 = (C3593m7) sq3Var;
            int i3 = c3593m7.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c3593m7.e = i3 - Integer.MIN_VALUE;
                C3593m7 c3593m72 = c3593m7;
                Object obj = c3593m72.c;
                lu3 lu3Var = lu3.a;
                i = c3593m72.e;
                if (i != 0) {
                    y6a.M(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    int high = AbstractC3680pg.a().getMaxBatchSize().getHigh();
                    Fg fg = this.a;
                    Integer num = new Integer(high);
                    c3593m72.a = currentTimeMillis;
                    c3593m72.b = high;
                    c3593m72.e = 1;
                    Object a = fg.a(num, FootballShotmapItem.GOAL_HIGH, currentTimeMillis, c3593m72);
                    if (a != lu3Var) {
                        i2 = high;
                        obj = a;
                        j = currentTimeMillis;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = c3593m72.b;
                    long j3 = c3593m72.a;
                    y6a.M(obj);
                    j2 = j3;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (Iterable) obj) {
                        if (!this.e.containsKey(((C3473hg) obj2).b)) {
                            arrayList.add(obj2);
                        }
                    }
                    list = CollectionsKt.L0(arrayList, i2);
                    if (!list.isEmpty() || this.d != EnumC3602mg.STARTED) {
                        return Unit.a;
                    }
                    list.size();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        xw3.L(L9.d, null, null, new C3645o7(this, (C3473hg) it.next(), null), 3);
                    }
                    Fg fg2 = this.a;
                    c3593m72.a = j2;
                    c3593m72.b = i2;
                    c3593m72.e = 2;
                    C3593m7 c3593m73 = c3593m72;
                    obj = fg2.a(null, FootballShotmapItem.GOAL_HIGH, j2, c3593m73);
                    if (obj != lu3Var) {
                        c3593m72 = c3593m73;
                        ArrayList arrayList2 = new ArrayList();
                        while (r1.hasNext()) {
                        }
                        list = CollectionsKt.L0(arrayList2, i2);
                        if (!list.isEmpty()) {
                        }
                        return Unit.a;
                    }
                    return lu3Var;
                }
                i2 = c3593m72.b;
                j = c3593m72.a;
                y6a.M(obj);
                list = (List) obj;
                j2 = j;
                if (!list.isEmpty()) {
                }
                return Unit.a;
            }
        }
        c3593m7 = new C3593m7(this, sq3Var);
        C3593m7 c3593m722 = c3593m7;
        Object obj3 = c3593m722.c;
        lu3 lu3Var2 = lu3.a;
        i = c3593m722.e;
        if (i != 0) {
        }
        list = (List) obj3;
        j2 = j;
        if (!list.isEmpty()) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[Catch: all -> 0x004a, TryCatch #0 {all -> 0x004a, blocks: (B:11:0x0041, B:13:0x0045, B:15:0x0050, B:19:0x0056, B:21:0x0069, B:24:0x006f), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #0 {all -> 0x004a, blocks: (B:11:0x0041, B:13:0x0045, B:15:0x0050, B:19:0x0056, B:21:0x0069, B:24:0x006f), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x004a, TRY_ENTER, TryCatch #0 {all -> 0x004a, blocks: (B:11:0x0041, B:13:0x0045, B:15:0x0050, B:19:0x0056, B:21:0x0069, B:24:0x006f), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sq3 sq3Var) {
        C3722r7 c3722r7;
        int i;
        h2d h2dVar;
        yda ydaVar;
        try {
            if (sq3Var instanceof C3722r7) {
                c3722r7 = (C3722r7) sq3Var;
                int i2 = c3722r7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3722r7.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3722r7.b;
                    lu3 lu3Var = lu3.a;
                    i = c3722r7.d;
                    if (i != 0) {
                        y6a.M(obj);
                        h2dVar = this.f;
                        c3722r7.a = h2dVar;
                        c3722r7.d = 1;
                        if (h2dVar.e(c3722r7) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2d h2dVar2 = c3722r7.a;
                        y6a.M(obj);
                        h2dVar = h2dVar2;
                    }
                    ydaVar = this.g;
                    if (!(ydaVar == null ? ydaVar.isActive() : false)) {
                        Unit unit = Unit.a;
                        h2dVar.f(null);
                        return unit;
                    }
                    long high = AbstractC3680pg.a().getInterval().getHigh();
                    if (high <= 0) {
                        Unit unit2 = Unit.a;
                        h2dVar.f(null);
                        return unit2;
                    }
                    ku3 ku3Var = L9.d;
                    IntRange intRange = AbstractC3446gf.a;
                    this.g = N3.a(ku3Var, 0L, high * 1000, new C3748s7(this, null));
                    Unit unit3 = Unit.a;
                    h2dVar.f(null);
                    return unit3;
                }
            }
            ydaVar = this.g;
            if (!(ydaVar == null ? ydaVar.isActive() : false)) {
            }
        } catch (Throwable th) {
            h2dVar.f(null);
            throw th;
        }
        c3722r7 = new C3722r7(this, sq3Var);
        Object obj2 = c3722r7.b;
        lu3 lu3Var2 = lu3.a;
        i = c3722r7.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:11:0x0041, B:13:0x0045, B:14:0x004b), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sq3 sq3Var) {
        C3774t7 c3774t7;
        int i;
        h2d h2dVar;
        yda ydaVar;
        try {
            if (sq3Var instanceof C3774t7) {
                c3774t7 = (C3774t7) sq3Var;
                int i2 = c3774t7.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3774t7.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3774t7.b;
                    lu3 lu3Var = lu3.a;
                    i = c3774t7.d;
                    if (i != 0) {
                        y6a.M(obj);
                        h2d h2dVar2 = this.f;
                        c3774t7.a = h2dVar2;
                        c3774t7.d = 1;
                        if (h2dVar2.e(c3774t7) == lu3Var) {
                            return lu3Var;
                        }
                        h2dVar = h2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2dVar = c3774t7.a;
                        y6a.M(obj);
                    }
                    ydaVar = this.g;
                    if (ydaVar != null) {
                        ydaVar.e(null);
                    }
                    this.g = null;
                    Unit unit = Unit.a;
                    h2dVar.f(null);
                    return unit;
                }
            }
            ydaVar = this.g;
            if (ydaVar != null) {
            }
            this.g = null;
            Unit unit2 = Unit.a;
            h2dVar.f(null);
            return unit2;
        } catch (Throwable th) {
            h2dVar.f(null);
            throw th;
        }
        c3774t7 = new C3774t7(this, sq3Var);
        Object obj2 = c3774t7.b;
        lu3 lu3Var2 = lu3.a;
        i = c3774t7.d;
        if (i != 0) {
        }
    }

    @Override // com.inmobi.media.AbstractC3680pg
    public final Unit b() {
        ku3 ku3Var = L9.d;
        xw3.L(ku3Var, null, null, new C3671p7(this, null), 3);
        xw3.L(ku3Var, null, null, new C3697q7(this, null), 3);
        return Unit.a;
    }
}
