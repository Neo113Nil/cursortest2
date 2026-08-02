package com.inmobi.media;

import defpackage.a70;
import defpackage.f1d;
import defpackage.fdi;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.t98;
import defpackage.v98;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yda;
import defpackage.z88;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.x2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3873x2 implements G8 {
    public final ku3 a;
    public final Wn b;
    public final f1d c;
    public final h2d d;
    public final AtomicBoolean e;
    public yda f;
    public final Se g;

    public AbstractC3873x2(ku3 ku3Var, Tn tn, Wn wn, f1d f1dVar) {
        ku3Var.getClass();
        tn.getClass();
        wn.getClass();
        f1dVar.getClass();
        this.a = ku3Var;
        this.b = wn;
        this.c = f1dVar;
        this.d = new j2d();
        this.e = new AtomicBoolean(false);
        this.g = new Se(ku3Var, tn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(AbstractC3873x2 abstractC3873x2, sq3 sq3Var) {
        C3769t2 c3769t2;
        int i;
        h2d h2dVar;
        abstractC3873x2.getClass();
        try {
            if (sq3Var instanceof C3769t2) {
                c3769t2 = (C3769t2) sq3Var;
                int i2 = c3769t2.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3769t2.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3769t2.b;
                    lu3 lu3Var = lu3.a;
                    i = c3769t2.d;
                    if (i != 0) {
                        y6a.M(obj);
                        h2d h2dVar2 = abstractC3873x2.d;
                        c3769t2.a = h2dVar2;
                        c3769t2.d = 1;
                        if (h2dVar2.e(c3769t2) == lu3Var) {
                            return lu3Var;
                        }
                        h2dVar = h2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2dVar = c3769t2.a;
                        y6a.M(obj);
                    }
                    C3300ao c = abstractC3873x2.c();
                    Ng ng = c.a;
                    ng.f.set(true);
                    P6.a(ng.e);
                    ng.e = null;
                    P6.a(c.d.a);
                    c.d.a = null;
                    P6.a(c.e);
                    c.e = null;
                    abstractC3873x2.g.b();
                    return Unit.a;
                }
            }
            C3300ao c2 = abstractC3873x2.c();
            Ng ng2 = c2.a;
            ng2.f.set(true);
            P6.a(ng2.e);
            ng2.e = null;
            P6.a(c2.d.a);
            c2.d.a = null;
            P6.a(c2.e);
            c2.e = null;
            abstractC3873x2.g.b();
            return Unit.a;
        } finally {
            h2dVar.f(null);
        }
        c3769t2 = new C3769t2(abstractC3873x2, sq3Var);
        Object obj2 = c3769t2.b;
        lu3 lu3Var2 = lu3.a;
        i = c3769t2.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:11:0x0044, B:14:0x004e, B:15:0x0057, B:17:0x005f, B:18:0x008a, B:23:0x006f, B:24:0x0054), top: B:10:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:11:0x0044, B:14:0x004e, B:15:0x0057, B:17:0x005f, B:18:0x008a, B:23:0x006f, B:24:0x0054), top: B:10:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:11:0x0044, B:14:0x004e, B:15:0x0057, B:17:0x005f, B:18:0x008a, B:23:0x006f, B:24:0x0054), top: B:10:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:11:0x0044, B:14:0x004e, B:15:0x0057, B:17:0x005f, B:18:0x008a, B:23:0x006f, B:24:0x0054), top: B:10:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(AbstractC3873x2 abstractC3873x2, sq3 sq3Var) {
        C3795u2 c3795u2;
        int i;
        h2d h2dVar;
        boolean z;
        abstractC3873x2.getClass();
        try {
            if (sq3Var instanceof C3795u2) {
                c3795u2 = (C3795u2) sq3Var;
                int i2 = c3795u2.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3795u2.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3795u2.b;
                    lu3 lu3Var = lu3.a;
                    i = c3795u2.d;
                    if (i != 0) {
                        y6a.M(obj);
                        h2d h2dVar2 = abstractC3873x2.d;
                        c3795u2.a = h2dVar2;
                        c3795u2.d = 1;
                        if (h2dVar2.e(c3795u2) == lu3Var) {
                            return lu3Var;
                        }
                        h2dVar = h2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2dVar = c3795u2.a;
                        y6a.M(obj);
                    }
                    z = abstractC3873x2.e.get();
                    Se se = abstractC3873x2.g;
                    if (z) {
                        se.b();
                    } else {
                        se.a();
                    }
                    if (abstractC3873x2.e.get()) {
                        Ng ng = abstractC3873x2.c().a;
                        ((fdi) ng.b).l(EnumC3610mo.HIDDEN);
                        ng.f.set(true);
                        P6.a(ng.e);
                        ng.e = null;
                    } else {
                        Ng ng2 = abstractC3873x2.c().a;
                        ng2.f.set(false);
                        ng2.a();
                    }
                    Unit unit = Unit.a;
                    h2dVar.f(null);
                    return unit;
                }
            }
            z = abstractC3873x2.e.get();
            Se se2 = abstractC3873x2.g;
            if (z) {
            }
            if (abstractC3873x2.e.get()) {
            }
            Unit unit2 = Unit.a;
            h2dVar.f(null);
            return unit2;
        } catch (Throwable th) {
            h2dVar.f(null);
            throw th;
        }
        c3795u2 = new C3795u2(abstractC3873x2, sq3Var);
        Object obj2 = c3795u2.b;
        lu3 lu3Var2 = lu3.a;
        i = c3795u2.d;
        if (i != 0) {
        }
    }

    public abstract C3300ao c();

    @Override // com.inmobi.media.G8
    public final void a() {
        this.e.set(false);
        this.g.b();
        C3300ao c = c();
        Ng ng = c.a;
        ng.f.set(true);
        P6.a(ng.e);
        ng.e = null;
        P6.a(c.d.a);
        c.d.a = null;
        P6.a(c.e);
        c.e = null;
        P6.a(this.f);
        this.f = null;
    }

    @Override // com.inmobi.media.G8
    public final z88 b() {
        if (this.f == null) {
            this.f = xw3.L(this.a, null, null, new C3743s2(this.c, null, this), 3);
            Unit unit = Unit.a;
        }
        C3300ao c = c();
        if (c.e == null) {
            Ng ng = c.a;
            ng.a();
            c.e = xw3.L(c.b.a, null, null, new Yn(ng.b, null, c), 3);
            Unit unit2 = Unit.a;
        }
        return new t98(new v98(new C3821v2(this, null), c.c), new C3847w2(this, null), 0);
    }
}
