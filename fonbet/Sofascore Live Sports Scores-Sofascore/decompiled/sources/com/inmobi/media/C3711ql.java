package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ql, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3711ql extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3711ql(boolean z, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = z;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3711ql(this.b, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3711ql(this.b, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r5.b(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (com.inmobi.media.C3892xl.a(r4) == r0) goto L17;
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
            if (this.b) {
                C3892xl c3892xl = C3892xl.a;
                this.a = 1;
            } else {
                this.a = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
