package com.inmobi.media;

import defpackage.a70;
import defpackage.fc6;
import defpackage.hoi;
import defpackage.hs4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.r69;
import defpackage.rob;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import defpackage.z45;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.oi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3656oi extends hoi implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3656oi(String str, GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.c = str;
        this.d = gestureDetectorOnGestureListenerC3889xi;
        this.e = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        C3656oi c3656oi = new C3656oi(this.c, this.d, this.e, rq3Var);
        c3656oi.b = obj;
        return c3656oi;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3656oi) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e5, code lost:
    
        if (defpackage.xw3.R(r14, r5, r13) == r1) goto L36;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        try {
        } catch (Throwable th) {
            p2g p2gVar = w2g.b;
            u2gVar = new u2g(th);
        }
        if (i == 0) {
            y6a.M(obj);
            String str = this.c;
            p2g p2gVar2 = w2g.b;
            F9 f9 = (F9) Ve.c.getValue();
            Xe xe = new Xe(str, null, null, null, null, false, 62);
            this.a = 1;
            obj = f9.a.a(xe, this);
            if (obj == lu3Var) {
                return lu3Var;
            }
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
        InterfaceC3317bf interfaceC3317bf = (InterfaceC3317bf) obj;
        u2gVar = interfaceC3317bf.c() == 200 ? new Pair(interfaceC3317bf.d().r(Charsets.UTF_8), new Integer(200)) : new Pair(null, new Integer(interfaceC3317bf.c()));
        p2g p2gVar3 = w2g.b;
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.d;
        String str2 = this.c;
        long j = this.e;
        Throwable a = w2g.a(u2gVar);
        if (a != null) {
            InterfaceC3880x9 interfaceC3880x9 = gestureDetectorOnGestureListenerC3889xi.i;
            if (interfaceC3880x9 != null) {
                String str3 = GestureDetectorOnGestureListenerC3889xi.i1;
                str3.getClass();
                ((C3906y9) interfaceC3880x9).b(str3, fc6.n("Error prefetching HTML content from URL: ", str2, " ", a.getMessage()));
            }
            Hi renderViewTelemetry = gestureDetectorOnGestureListenerC3889xi.getRenderViewTelemetry();
            if (renderViewTelemetry != null) {
                renderViewTelemetry.a(j, new Short((short) 3101));
            }
            u2gVar = new Pair(null, new Integer(3101));
        }
        Pair pair = (Pair) u2gVar;
        String str4 = (String) pair.a;
        int intValue = ((Number) pair.b).intValue();
        hs4 hs4Var = z45.a;
        r69 r69Var = rob.a;
        C3630ni c3630ni = new C3630ni(this.d, str4, this.e, intValue, null);
        this.a = 2;
    }
}
