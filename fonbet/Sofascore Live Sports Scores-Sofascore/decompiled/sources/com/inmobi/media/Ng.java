package com.inmobi.media;

import defpackage.a70;
import defpackage.f1d;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.r69;
import defpackage.rob;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yda;
import defpackage.z45;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ng {
    public final InterfaceC3636no a;
    public final f1d b;
    public final ku3 c;
    public final Pg d;
    public yda e;
    public final AtomicBoolean f;

    public Ng(ku3 ku3Var, Pg pg, InterfaceC3636no interfaceC3636no) {
        ku3Var.getClass();
        pg.getClass();
        interfaceC3636no.getClass();
        this.a = interfaceC3636no;
        this.b = gdi.a(EnumC3610mo.HIDDEN);
        this.c = ku3Var;
        this.d = pg;
        this.f = new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (defpackage.n4o.y(r6, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (defpackage.xw3.R(r9, r2, r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005d -> B:16:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Ng ng, sq3 sq3Var) {
        Lg lg;
        int i;
        ng.getClass();
        if (sq3Var instanceof Lg) {
            lg = (Lg) sq3Var;
            int i2 = lg.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lg.c = i2 - Integer.MIN_VALUE;
                Object obj = lg.a;
                lu3 lu3Var = lu3.a;
                i = lg.c;
                if (i != 0) {
                    if (i == 1) {
                        y6a.M(obj);
                        long j = ng.d.a;
                        lg.c = 2;
                    } else if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                y6a.M(obj);
                if (!ng.f.get()) {
                    return Unit.a;
                }
                hs4 hs4Var = z45.a;
                r69 r69Var = rob.a;
                Mg mg = new Mg(ng, null);
                lg.c = 1;
            }
        }
        lg = new Lg(ng, sq3Var);
        Object obj2 = lg.a;
        lu3 lu3Var2 = lu3.a;
        i = lg.c;
        if (i != 0) {
        }
        y6a.M(obj2);
        if (!ng.f.get()) {
        }
    }

    public final void a() {
        if (this.f.get() || this.e != null) {
            return;
        }
        this.e = xw3.L(this.c, null, null, new Kg(this, null), 3);
    }
}
