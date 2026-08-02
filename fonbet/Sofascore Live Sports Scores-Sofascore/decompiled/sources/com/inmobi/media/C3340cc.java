package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.cc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3340cc extends hoi implements Function2 {
    public Kb a;
    public Iterator b;
    public int c;
    public final /* synthetic */ Kb d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3340cc(Kb kb, long j, int i, rq3 rq3Var) {
        super(2, rq3Var);
        this.d = kb;
        this.e = j;
        this.f = i;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3340cc(this.d, this.e, this.f, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3340cc) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:7:0x0011, B:9:0x003c, B:11:0x0042, B:23:0x001e, B:24:0x0034, B:26:0x0025), top: B:2:0x0007 }] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Kb kb;
        Iterator it;
        lu3 lu3Var = lu3.a;
        int i = this.c;
        try {
            if (i == 0) {
                y6a.M(obj);
                Kb kb2 = this.d;
                long j = this.e;
                int i2 = this.f;
                this.c = 1;
                obj = kb2.a(j, i2, this);
                if (obj == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = this.b;
                    kb = this.a;
                    y6a.M(obj);
                    while (it.hasNext()) {
                        Db db = (Db) it.next();
                        AbstractC3443gc.a(db.a);
                        String str = db.a;
                        this.a = kb;
                        this.b = it;
                        this.c = 2;
                        if (kb.a(str, this) == lu3Var) {
                            return lu3Var;
                        }
                    }
                    AbstractC3417fc.c.set(false);
                    return Unit.a;
                }
                y6a.M(obj);
            }
            kb = this.d;
            it = ((List) obj).iterator();
            while (it.hasNext()) {
            }
            AbstractC3417fc.c.set(false);
            return Unit.a;
        } catch (Throwable th) {
            AbstractC3417fc.c.set(false);
            throw th;
        }
    }
}
