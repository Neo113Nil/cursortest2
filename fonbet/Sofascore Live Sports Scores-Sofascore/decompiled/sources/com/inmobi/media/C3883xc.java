package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.xc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3883xc extends hoi implements Function2 {
    public int a;
    public final /* synthetic */ C3909yc b;
    public final /* synthetic */ G6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3883xc(C3909yc c3909yc, G6 g6, rq3 rq3Var) {
        super(2, rq3Var);
        this.b = c3909yc;
        this.c = g6;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3883xc(this.b, this.c, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3883xc(this.b, this.c, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (r1.a(r14, r13) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r14.a(r13) == r0) goto L25;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC3640o2 nm;
        lu3 lu3Var = lu3.a;
        int i = this.a;
        if (i == 0) {
            y6a.M(obj);
            C3909yc c3909yc = this.b;
            F6 f6 = c3909yc.d;
            G6 g6 = this.c;
            f6.getClass();
            g6.getClass();
            if (g6 instanceof Wj) {
                nm = new Vj(f6.a, f6.b, (Wj) g6, f6.c, f6.d);
            } else {
                if (!(g6 instanceof Om)) {
                    zzl.b();
                    return null;
                }
                nm = new Nm(f6.a, f6.b, (Om) g6, f6.c, f6.d);
            }
            c3909yc.b = nm;
            AbstractC3640o2 abstractC3640o2 = this.b.b;
            if (abstractC3640o2 != null) {
                this.a = 1;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    y6a.M(obj);
                    return this.b.c;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        C3909yc c3909yc2 = this.b;
        AbstractC3640o2 abstractC3640o22 = c3909yc2.b;
        if (abstractC3640o22 != null) {
            MediaView mediaView = c3909yc2.c;
            this.a = 2;
        }
        return this.b.c;
    }
}
