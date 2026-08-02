package com.inmobi.media;

import defpackage.a70;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yda;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.qf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3705qf extends AbstractC3680pg {
    public final h2d f;
    public yda g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3705qf(Fg fg, C3824v5 c3824v5, C3860wf c3860wf) {
        super(fg, c3824v5, c3860wf);
        fg.getClass();
        c3824v5.getClass();
        c3860wf.getClass();
        this.f = new j2d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c4, code lost:
    
        if (r13 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        if (r14 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        if (r14 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
    
        if (r14.a(r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4 A[LOOP:0: B:30:0x00ce->B:32:0x00d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        C3523jf c3523jf;
        int i;
        int normal;
        List list;
        Iterator it;
        Object obj;
        if (sq3Var instanceof C3523jf) {
            c3523jf = (C3523jf) sq3Var;
            int i2 = c3523jf.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3523jf.e = i2 - Integer.MIN_VALUE;
                Object obj2 = c3523jf.c;
                Object obj3 = lu3.a;
                i = c3523jf.e;
                if (i != 0) {
                    y6a.M(obj2);
                    if (this.d != EnumC3602mg.STARTED) {
                        return Unit.a;
                    }
                    normal = AbstractC3680pg.a().getMaxBatchSize().getNormal();
                    Fg fg = this.a;
                    long normal2 = AbstractC3680pg.a().getExpiry().getNormal() * 1000;
                    c3523jf.a = normal;
                    c3523jf.e = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj2);
                            list = (List) obj2;
                            if (list.isEmpty()) {
                                Fg fg2 = this.a;
                                c3523jf.b = list;
                                c3523jf.e = 3;
                                obj2 = fg2.b("normal", c3523jf);
                            }
                            it = list.iterator();
                            while (it.hasNext()) {
                            }
                            return Unit.a;
                        }
                        if (i != 3) {
                            if (i == 4) {
                                y6a.M(obj2);
                                return Unit.a;
                            }
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = c3523jf.b;
                        y6a.M(obj2);
                        if (((Number) obj2).intValue() == 0) {
                            c3523jf.b = null;
                            c3523jf.e = 4;
                            EnumC3602mg enumC3602mg = EnumC3602mg.STOPPED;
                            if (this.d == EnumC3602mg.STARTED) {
                                this.d = enumC3602mg;
                                obj = d(c3523jf);
                                if (obj != obj3) {
                                    obj = Unit.a;
                                }
                            } else {
                                obj = Unit.a;
                            }
                        }
                        it = list.iterator();
                        while (it.hasNext()) {
                            xw3.L(L9.c, null, null, new C3575lf(this, (C3473hg) it.next(), null), 3);
                        }
                        return Unit.a;
                    }
                    normal = c3523jf.a;
                    y6a.M(obj2);
                }
                Fg fg3 = this.a;
                Integer num = new Integer(normal);
                c3523jf.e = 2;
                obj2 = fg3.a("normal", num, c3523jf);
            }
        }
        c3523jf = new C3523jf(this, sq3Var);
        Object obj22 = c3523jf.c;
        Object obj32 = lu3.a;
        i = c3523jf.e;
        if (i != 0) {
        }
        Fg fg32 = this.a;
        Integer num2 = new Integer(normal);
        c3523jf.e = 2;
        obj22 = fg32.a("normal", num2, c3523jf);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:11:0x0041, B:13:0x0045, B:15:0x004b, B:18:0x005a, B:22:0x0060, B:24:0x0073, B:27:0x0079), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:11:0x0041, B:13:0x0045, B:15:0x004b, B:18:0x005a, B:22:0x0060, B:24:0x0073, B:27:0x0079), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:11:0x0041, B:13:0x0045, B:15:0x004b, B:18:0x005a, B:22:0x0060, B:24:0x0073, B:27:0x0079), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(sq3 sq3Var) {
        C3627nf c3627nf;
        int i;
        h2d h2dVar;
        yda ydaVar;
        long normal;
        try {
            if (sq3Var instanceof C3627nf) {
                c3627nf = (C3627nf) sq3Var;
                int i2 = c3627nf.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3627nf.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3627nf.b;
                    lu3 lu3Var = lu3.a;
                    i = c3627nf.d;
                    if (i != 0) {
                        y6a.M(obj);
                        h2dVar = this.f;
                        c3627nf.a = h2dVar;
                        c3627nf.d = 1;
                        if (h2dVar.e(c3627nf) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2d h2dVar2 = c3627nf.a;
                        y6a.M(obj);
                        h2dVar = h2dVar2;
                    }
                    ydaVar = this.g;
                    if (ydaVar != null) {
                        if (ydaVar.t()) {
                            yda ydaVar2 = this.g;
                            ydaVar2.getClass();
                            if (!ydaVar2.isCancelled()) {
                            }
                        }
                        Unit unit = Unit.a;
                        h2dVar.f(null);
                        return unit;
                    }
                    normal = AbstractC3680pg.a().getInterval().getNormal();
                    if (normal > 0) {
                        Unit unit2 = Unit.a;
                        h2dVar.f(null);
                        return unit2;
                    }
                    this.g = N3.a(L9.c, 0L, normal * 1000, new C3653of(this, null));
                    Unit unit3 = Unit.a;
                    h2dVar.f(null);
                    return unit3;
                }
            }
            ydaVar = this.g;
            if (ydaVar != null) {
            }
            normal = AbstractC3680pg.a().getInterval().getNormal();
            if (normal > 0) {
            }
        } catch (Throwable th) {
            h2dVar.f(null);
            throw th;
        }
        c3627nf = new C3627nf(this, sq3Var);
        Object obj2 = c3627nf.b;
        lu3 lu3Var2 = lu3.a;
        i = c3627nf.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:11:0x0041, B:13:0x0045, B:14:0x004b), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(sq3 sq3Var) {
        C3679pf c3679pf;
        int i;
        h2d h2dVar;
        yda ydaVar;
        try {
            if (sq3Var instanceof C3679pf) {
                c3679pf = (C3679pf) sq3Var;
                int i2 = c3679pf.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3679pf.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3679pf.b;
                    lu3 lu3Var = lu3.a;
                    i = c3679pf.d;
                    if (i != 0) {
                        y6a.M(obj);
                        h2d h2dVar2 = this.f;
                        c3679pf.a = h2dVar2;
                        c3679pf.d = 1;
                        if (h2dVar2.e(c3679pf) == lu3Var) {
                            return lu3Var;
                        }
                        h2dVar = h2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2dVar = c3679pf.a;
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
        c3679pf = new C3679pf(this, sq3Var);
        Object obj2 = c3679pf.b;
        lu3 lu3Var2 = lu3.a;
        i = c3679pf.d;
        if (i != 0) {
        }
    }

    @Override // com.inmobi.media.AbstractC3680pg
    public final Unit b() {
        xw3.L(L9.c, null, null, new C3601mf(this, null), 3);
        return Unit.a;
    }
}
