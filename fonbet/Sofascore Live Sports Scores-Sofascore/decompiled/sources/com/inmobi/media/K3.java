package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.n4o;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class K3 extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hoi c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K3(long j, rq3 rq3Var, Function1 function1) {
        super(2, rq3Var);
        this.c = (hoi) function1;
        this.d = j;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hoi, kotlin.jvm.functions.Function1] */
    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        K3 k3 = new K3(this.d, rq3Var, this.c);
        k3.b = obj;
        return k3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((K3) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (defpackage.n4o.y(r4, r6) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r7.invoke(r6) == r0) goto L23;
     */
    /* JADX WARN: Type inference failed for: r7v4, types: [hoi, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0059 -> B:12:0x003c). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ku3 ku3Var;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            ku3 ku3Var2 = (ku3) this.b;
            this.b = ku3Var2;
            this.a = 1;
            if (n4o.y(0L, this) != lu3Var) {
                ku3Var = ku3Var2;
            }
            return lu3Var;
        }
        if (i != 1) {
            if (i == 2) {
                ku3Var = (ku3) this.b;
                y6a.M(obj);
                long j = this.d;
                this.b = ku3Var;
                this.a = 3;
            } else if (i != 3) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        ku3Var = (ku3) this.b;
        y6a.M(obj);
        if (!s9a.w(ku3Var)) {
            return Unit.a;
        }
        ?? r7 = this.c;
        this.b = ku3Var;
        this.a = 2;
    }
}
