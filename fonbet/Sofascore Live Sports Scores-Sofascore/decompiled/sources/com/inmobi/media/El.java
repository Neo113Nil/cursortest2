package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class El extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ hoi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public El(long j, rq3 rq3Var, Function1 function1) {
        super(2, rq3Var);
        this.b = j;
        this.c = (hoi) function1;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hoi, kotlin.jvm.functions.Function1] */
    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new El(this.b, rq3Var, this.c);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [hoi, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new El(this.b, (rq3) obj2, this.c).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r7.invoke(r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (defpackage.n4o.y(r4, r6) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r7v2, types: [hoi, kotlin.jvm.functions.Function1] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            long j = this.b;
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
        ?? r7 = this.c;
        this.a = 2;
    }
}
