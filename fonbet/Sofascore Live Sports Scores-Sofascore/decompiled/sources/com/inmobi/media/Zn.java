package com.inmobi.media;

import defpackage.a70;
import defpackage.b1d;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Zn extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ C3300ao b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zn(C3300ao c3300ao, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = c3300ao;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new Zn(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Zn(this.b, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (defpackage.n4o.y(r4, r6) == r0) goto L15;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            long j = this.b.b.b;
            this.a = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return Unit.a;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        C3300ao c3300ao = this.b;
        c3300ao.d.b = true;
        b1d b1dVar = c3300ao.c;
        Unit unit = Unit.a;
        this.a = 2;
    }
}
