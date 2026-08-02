package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.kg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3550kg {
    public static N8 b;
    public static C3876x5 c;
    public static final C3550kg a = new C3550kg();
    public static final AtomicBoolean d = new AtomicBoolean(false);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        if (r5 == r6) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
    
        if (r5 == r6) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        C3498ig c3498ig;
        int i;
        Unit unit;
        C3876x5 c3876x5;
        Unit unit2;
        if (sq3Var instanceof C3498ig) {
            c3498ig = (C3498ig) sq3Var;
            int i2 = c3498ig.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3498ig.c = i2 - Integer.MIN_VALUE;
                Object obj = c3498ig.a;
                lu3 lu3Var = lu3.a;
                i = c3498ig.c;
                if (i != 0) {
                    y6a.M(obj);
                    if (!((AdConfig) AbstractC3435g4.a.a(AdConfig.class)).getPingV2().getEnabled()) {
                        return Unit.a;
                    }
                    if (d.compareAndSet(false, true)) {
                        Fg fg = new Fg(AbstractC3750s9.b());
                        b = new N8(fg);
                        c = new C3876x5(fg);
                        N8 n8 = b;
                        if (n8 != null) {
                            c3498ig.c = 1;
                            C3800u7 c3800u7 = n8.d;
                            c3800u7.getClass();
                            EnumC3602mg enumC3602mg = EnumC3602mg.STARTED;
                            if (c3800u7.d == EnumC3602mg.STOPPED) {
                                c3800u7.d = enumC3602mg;
                                unit = c3800u7.b();
                                if (unit != lu3Var) {
                                    unit = Unit.a;
                                }
                            } else {
                                unit = Unit.a;
                            }
                            if (unit != lu3Var) {
                                unit = Unit.a;
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                c3876x5 = c;
                if (c3876x5 != null) {
                    c3498ig.c = 2;
                    C3705qf c3705qf = c3876x5.d;
                    c3705qf.getClass();
                    EnumC3602mg enumC3602mg2 = EnumC3602mg.STARTED;
                    if (c3705qf.d == EnumC3602mg.STOPPED) {
                        c3705qf.d = enumC3602mg2;
                        unit2 = c3705qf.b();
                        if (unit2 != lu3Var) {
                            unit2 = Unit.a;
                        }
                    } else {
                        unit2 = Unit.a;
                    }
                    if (unit2 != lu3Var) {
                        unit2 = Unit.a;
                    }
                }
                return Unit.a;
            }
        }
        c3498ig = new C3498ig(this, sq3Var);
        Object obj2 = c3498ig.a;
        lu3 lu3Var2 = lu3.a;
        i = c3498ig.c;
        if (i != 0) {
        }
        c3876x5 = c;
        if (c3876x5 != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r5 == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
    
        if (r5 == r6) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        C3524jg c3524jg;
        int i;
        Object obj;
        C3876x5 c3876x5;
        Object obj2;
        if (sq3Var instanceof C3524jg) {
            c3524jg = (C3524jg) sq3Var;
            int i2 = c3524jg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3524jg.c = i2 - Integer.MIN_VALUE;
                Object obj3 = c3524jg.a;
                lu3 lu3Var = lu3.a;
                i = c3524jg.c;
                if (i != 0) {
                    y6a.M(obj3);
                    if (d.compareAndSet(true, false)) {
                        N8 n8 = b;
                        if (n8 != null) {
                            c3524jg.c = 1;
                            C3800u7 c3800u7 = n8.d;
                            c3800u7.getClass();
                            EnumC3602mg enumC3602mg = EnumC3602mg.STOPPED;
                            if (c3800u7.d == EnumC3602mg.STARTED) {
                                c3800u7.d = enumC3602mg;
                                obj = c3800u7.e(c3524jg);
                                if (obj != lu3Var) {
                                    obj = Unit.a;
                                }
                            } else {
                                obj = Unit.a;
                            }
                            if (obj != lu3Var) {
                                obj = Unit.a;
                            }
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj3);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj3);
                c3876x5 = c;
                if (c3876x5 != null) {
                    c3524jg.c = 2;
                    C3705qf c3705qf = c3876x5.d;
                    c3705qf.getClass();
                    EnumC3602mg enumC3602mg2 = EnumC3602mg.STOPPED;
                    if (c3705qf.d == EnumC3602mg.STARTED) {
                        c3705qf.d = enumC3602mg2;
                        obj2 = c3705qf.d(c3524jg);
                        if (obj2 != lu3Var) {
                            obj2 = Unit.a;
                        }
                    } else {
                        obj2 = Unit.a;
                    }
                    if (obj2 != lu3Var) {
                        obj2 = Unit.a;
                    }
                }
                return Unit.a;
            }
        }
        c3524jg = new C3524jg(this, sq3Var);
        Object obj32 = c3524jg.a;
        lu3 lu3Var2 = lu3.a;
        i = c3524jg.c;
        if (i != 0) {
        }
        c3876x5 = c;
        if (c3876x5 != null) {
        }
        return Unit.a;
    }
}
