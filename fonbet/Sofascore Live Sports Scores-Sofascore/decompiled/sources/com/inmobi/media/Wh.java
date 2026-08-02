package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.xw3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Wh extends hoi implements Function2 {
    public Object a;
    public Kb b;
    public int c;
    public final /* synthetic */ Xh d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wh(Xh xh, long j, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.d = xh;
        this.e = j;
        this.f = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Wh(this.d, this.e, this.f, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Wh) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r2.b(r7, r17) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009c  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Db db;
        Kb kb;
        Object b;
        Kb kb2;
        lu3 lu3Var = lu3.a;
        int i = this.c;
        if (i == 0) {
            y6a.M(obj);
            Xh xh = this.d;
            long j = this.e;
            boolean z = this.f;
            String str = xh.j;
            db = new Db(str, j, 0, 0L, z, xh.k.get(), 12);
            kb = (Kb) Lb.a.getValue();
            this.a = db;
            this.b = kb;
            this.c = 1;
            b = kb.b(str, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                if (i != 3) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Kb kb3 = (Kb) this.a;
                y6a.M(obj);
                kb2 = kb3;
                ku3 ku3Var = AbstractC3417fc.a;
                long j2 = this.e;
                Xh xh2 = this.d;
                long j3 = j2 - xh2.b;
                int i2 = xh2.c;
                kb2.getClass();
                if (!AbstractC3417fc.c.getAndSet(true)) {
                    xw3.L(Hl.a, null, null, new El(com.ironsource.Ua.s, null, new C3366dc(kb2, j3, i2, null)), 3);
                }
                return Unit.a;
            }
            kb = this.b;
            db = (Db) this.a;
            y6a.M(obj);
            b = obj;
        }
        if (((Boolean) b).booleanValue()) {
            this.a = null;
            this.b = null;
            this.c = 2;
        } else {
            this.a = kb;
            this.b = null;
            this.c = 3;
            if (kb.a(db, this) != lu3Var) {
                kb2 = kb;
                ku3 ku3Var2 = AbstractC3417fc.a;
                long j22 = this.e;
                Xh xh22 = this.d;
                long j32 = j22 - xh22.b;
                int i22 = xh22.c;
                kb2.getClass();
                if (!AbstractC3417fc.c.getAndSet(true)) {
                }
                return Unit.a;
            }
        }
        return lu3Var;
    }
}
