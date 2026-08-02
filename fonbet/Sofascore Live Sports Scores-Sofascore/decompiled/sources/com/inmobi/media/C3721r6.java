package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.r6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3721r6 extends hoi implements Function1 {
    public int a;
    public final /* synthetic */ C3773t6 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3721r6(C3773t6 c3773t6, boolean z, rq3 rq3Var) {
        super(1, rq3Var);
        this.b = c3773t6;
        this.c = z;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new C3721r6(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3721r6(this.b, this.c, (rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
            if (i == 0) {
                y6a.M(obj);
                C3773t6 c3773t6 = this.b;
                boolean z = this.c;
                this.a = 1;
                Object a = C3773t6.a(c3773t6, z, this);
                this = a;
                if (a == lu3Var) {
                    return lu3Var;
                }
            } else {
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                this = this;
            }
        } catch (Exception unused) {
            C3773t6 c3773t62 = this.b;
            String str = c3773t62.e;
            c3773t62.f.set(false);
        }
        return Unit.a;
    }
}
