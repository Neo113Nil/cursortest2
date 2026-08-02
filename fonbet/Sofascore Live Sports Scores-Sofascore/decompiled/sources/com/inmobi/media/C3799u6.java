package com.inmobi.media;

import defpackage.a70;
import defpackage.hoi;
import defpackage.joa;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.ok3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.u6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3799u6 extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Ze c;
    public final /* synthetic */ int d;
    public final /* synthetic */ C3592m6 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Zk i;
    public final /* synthetic */ C3773t6 j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3799u6(long j, Ze ze, int i, C3592m6 c3592m6, String str, int i2, long j2, Zk zk, C3773t6 c3773t6, boolean z, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = j;
        this.c = ze;
        this.d = i;
        this.e = c3592m6;
        this.f = str;
        this.g = i2;
        this.h = j2;
        this.i = zk;
        this.j = c3773t6;
        this.k = z;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3799u6(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3799u6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x003e, code lost:
    
        if (r15 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0029, code lost:
    
        if (defpackage.n4o.y(r5, r14) == r0) goto L15;
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
            long j = this.b * 1000;
            this.a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                InterfaceC3317bf interfaceC3317bf = (InterfaceC3317bf) obj;
                joa joaVar = AbstractC3825v6.a;
                if (Fl.a(interfaceC3317bf)) {
                    C3773t6 c3773t6 = this.j;
                    C3592m6 c3592m6 = this.e;
                    c3773t6.getClass();
                    c3592m6.getClass();
                    c3773t6.e.getClass();
                    ok3.J(new C3696q6(c3773t6, c3592m6, null));
                    c3773t6.a(System.currentTimeMillis());
                    if (c3773t6.d != null) {
                        ArrayList arrayList = c3592m6.a;
                        arrayList.getClass();
                        Integer num = Ak.c;
                        if (num != null && arrayList.contains(Integer.valueOf(num.intValue()))) {
                            Ak.b = 0;
                            Qa qa = Ak.a;
                            if (qa != null) {
                                ConcurrentHashMap concurrentHashMap = Qa.b;
                                qa.a("count", 0, false);
                            }
                            Ak.c = null;
                        }
                    }
                    c3773t6.f.set(false);
                } else if (this.d > 1) {
                    interfaceC3317bf.c();
                    interfaceC3317bf.e();
                    AbstractC3825v6.a(this.e, this.f, this.g, this.d - 1, this.h, this.i, this.j, this.k);
                } else {
                    C3773t6 c3773t62 = this.j;
                    C3592m6 c3592m62 = this.e;
                    c3773t62.getClass();
                    c3592m62.getClass();
                    c3773t62.e.getClass();
                    ok3.J(new C3670p6(c3592m62, true, c3773t62, null));
                    c3773t62.a(System.currentTimeMillis());
                    if (c3773t62.d != null) {
                        ArrayList arrayList2 = c3592m62.a;
                        arrayList2.getClass();
                        Integer num2 = Ak.c;
                        if (num2 != null && arrayList2.contains(Integer.valueOf(num2.intValue()))) {
                            Ak.c = null;
                        }
                    }
                    c3773t62.f.set(false);
                }
                return Unit.a;
            }
            y6a.M(obj);
        }
        F9 f9 = (F9) Ve.g.getValue();
        Ze ze = this.c;
        this.a = 2;
        obj = f9.a.a(ze, this);
    }
}
