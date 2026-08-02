package defpackage;

import android.view.textclassifier.TextClassifier;
import com.facebook.internal.t;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.acm.recorder.b;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.client_metrics_data.c;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.moloco.sdk.internal.l0;
import com.moloco.sdk.internal.ortb.model.d;
import com.moloco.sdk.internal.ortb.model.n0;
import com.moloco.sdk.internal.publisher.h0;
import com.moloco.sdk.internal.publisher.nativead.model.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h2 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ long t;
    public Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(esf esfVar, esf esfVar2, o7a o7aVar, long j, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 1;
        this.u = esfVar;
        this.v = esfVar2;
        this.w = o7aVar;
        this.t = j;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                return new h2((yda) obj3, this.t, (wzc) obj2, rq3Var, 0);
            case 1:
                return new h2((esf) this.u, (esf) obj3, (o7a) obj2, this.t, rq3Var);
            case 2:
                return new h2((lqa) obj3, (j38) obj2, this.t, rq3Var, 2);
            case 3:
                h2 h2Var = new h2((kje) obj3, (CharSequence) obj2, this.t, rq3Var, 3);
                h2Var.u = obj;
                return h2Var;
            case 4:
                h2 h2Var2 = new h2((svg) obj3, this.t, (csf) obj2, rq3Var, 4);
                h2Var2.u = obj;
                return h2Var2;
            case 5:
                return new h2((k8j) this.u, this.t, (o8j) obj3, (j8j) obj2, rq3Var);
            case 6:
                return new h2((e1d) obj3, this.t, (wzc) obj2, rq3Var, 6);
            case 7:
                return new h2((eje) this.u, (CharSequence) obj3, this.t, (lcj) obj2, rq3Var, 7);
            case 8:
                return new h2((lcj) obj3, this.t, (wzc) obj2, rq3Var, 8);
            case 9:
                return new h2((e) obj3, (joa) obj2, this.t, rq3Var, 9);
            case 10:
                h2 h2Var3 = new h2((List) obj3, (joa) obj2, this.t, rq3Var, 10);
                h2Var3.u = obj;
                return h2Var3;
            case 11:
                h2 h2Var4 = new h2((List) obj3, (mqi) obj2, this.t, rq3Var, 11);
                h2Var4.u = obj;
                return h2Var4;
            case 12:
                h2 h2Var5 = new h2((n) obj3, (g) obj2, this.t, rq3Var, 12);
                h2Var5.u = obj;
                return h2Var5;
            default:
                return new h2((a0) this.u, (b0) obj3, this.t, (g) obj2, rq3Var, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
        }
        return ((h2) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0397, code lost:
    
        if (r0.a(r7, r22) == r2) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0400, code lost:
    
        if (r1.a(r2, r22) == r0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03ef, code lost:
    
        if (r1.invoke(r2, r22) == r0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04fb, code lost:
    
        if (defpackage.q50.a(r2, r9, r8, r10, r22, 4) != r7) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0545, code lost:
    
        if (defpackage.cga.U(r22) == r1) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x056d, code lost:
    
        if (defpackage.n4o.y((r9 - r7) / 1000000, r22) == r1) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05e8, code lost:
    
        if (r0.a(r3, r22) != r1) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05c4, code lost:
    
        if (r6.Z(r22) == r1) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0135, code lost:
    
        if (r2 == r1) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fb, code lost:
    
        if (r3 == r1) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03aa  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, rq3] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v43, types: [fdi] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m6f m6fVar;
        j38 j38Var;
        e1d e1dVar;
        l6f l6fVar;
        l6f l6fVar2;
        Object R;
        lcj lcjVar;
        l6f l6fVar3;
        l6f l6fVar4;
        Object r;
        e eVar;
        CancellationException cancellationException;
        zu4 t;
        Object w;
        n0 n0Var;
        CancellationException cancellationException2;
        Object obj2;
        a aVar;
        Object T;
        ?? r15;
        h hVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e bannerImpl;
        int i = 1;
        switch (this.r) {
            case 0:
                wzc wzcVar = (wzc) this.w;
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 == 0) {
                    y6a.M(obj);
                    yda ydaVar = (yda) this.v;
                    this.s = 1;
                    break;
                } else if (i2 == 1) {
                    y6a.M(obj);
                } else if (i2 == 2) {
                    m6fVar = (m6f) this.u;
                    y6a.M(obj);
                    this.u = null;
                    this.s = 3;
                    break;
                } else {
                    if (i2 == 3) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l6f l6fVar5 = new l6f(this.t);
                m6f m6fVar2 = new m6f(l6fVar5);
                this.u = m6fVar2;
                this.s = 2;
                if (wzcVar.a(l6fVar5, this) != lu3Var) {
                    m6fVar = m6fVar2;
                    this.u = null;
                    this.s = 3;
                }
                return lu3Var;
            case 1:
                o7a o7aVar = (o7a) this.w;
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                int i4 = 5;
                if (i3 == 0) {
                    y6a.M(obj);
                    long j = ((esf) this.u).a;
                    long j2 = ((esf) this.v).a;
                    if (j < j2) {
                        this.s = 2;
                        break;
                    } else {
                        this.s = 1;
                        break;
                    }
                    return lu3Var2;
                }
                if (i3 == 1) {
                    y6a.M(obj);
                    long j3 = this.t;
                    o7aVar.b.b.h(new yz(j3, i4));
                    synchronized (o7aVar.c) {
                        o7aVar.e = j3;
                        Unit unit = Unit.a;
                    }
                } else {
                    if (i3 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    long nanoTime = System.nanoTime();
                    o7aVar.b.b.h(new yz(nanoTime, i4));
                    synchronized (o7aVar.c) {
                        o7aVar.e = nanoTime;
                        Unit unit2 = Unit.a;
                    }
                }
                return Unit.a;
            case 2:
                long j4 = this.t;
                lqa lqaVar = (lqa) this.v;
                q50 q50Var = lqaVar.o;
                lu3 lu3Var3 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    boolean e = q50Var.e();
                    j38 j38Var2 = (j38) this.w;
                    if (e) {
                        j38Var2 = j38Var2 instanceof g0i ? (g0i) j38Var2 : mqa.a;
                    }
                    j38Var = j38Var2;
                    if (!q50Var.e()) {
                        r6a r6aVar = new r6a(j4);
                        this.u = j38Var;
                        this.s = 1;
                        if (q50Var.f(this, r6aVar) == lu3Var3) {
                            return lu3Var3;
                        }
                    }
                    long c = r6a.c(((r6a) q50Var.d()).a, j4);
                    r6a r6aVar2 = new r6a(c);
                    o76 o76Var = new o76(lqaVar, c, i);
                    this.u = null;
                    this.s = 2;
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        ((eoh) lqaVar.h).setValue(Boolean.FALSE);
                        lqaVar.g = false;
                        return Unit.a;
                    }
                    j38Var = (j38) this.u;
                    y6a.M(obj);
                }
                lqaVar.c.invoke();
                long c2 = r6a.c(((r6a) q50Var.d()).a, j4);
                r6a r6aVar22 = new r6a(c2);
                o76 o76Var2 = new o76(lqaVar, c2, i);
                this.u = null;
                this.s = 2;
            case 3:
                lu3 lu3Var4 = lu3.a;
                int i6 = this.s;
                if (i6 == 0) {
                    y6a.M(obj);
                    TextClassifier textClassifier = (TextClassifier) this.u;
                    kje kjeVar = (kje) this.v;
                    CharSequence charSequence = (CharSequence) this.w;
                    long j5 = this.t;
                    this.s = 1;
                    if (kjeVar.b(charSequence, j5, textClassifier, this) == lu3Var4) {
                        return lu3Var4;
                    }
                } else {
                    if (i6 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 4:
                svg svgVar = (svg) this.v;
                lu3 lu3Var5 = lu3.a;
                int i7 = this.s;
                if (i7 == 0) {
                    y6a.M(obj);
                    qvg qvgVar = (qvg) this.u;
                    float g = svgVar.g(this.t);
                    wbc wbcVar = new wbc(24, (csf) this.w, svgVar, qvgVar);
                    this.s = 1;
                    if (d2a.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, g, null, wbcVar, this, 12) == lu3Var5) {
                        return lu3Var5;
                    }
                } else {
                    if (i7 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                int i8 = this.s;
                if (i8 == 0) {
                    y6a.M(obj);
                    Function2 function2 = ((k8j) this.u).q;
                    if (function2 != null) {
                        dnd dndVar = new dnd(this.t);
                        this.s = 1;
                        break;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                o8j o8jVar = (o8j) this.v;
                j8j j8jVar = (j8j) this.w;
                this.s = 2;
                break;
            case 6:
                wzc wzcVar2 = (wzc) this.w;
                e1d e1dVar2 = (e1d) this.v;
                lu3 lu3Var7 = lu3.a;
                int i9 = this.s;
                if (i9 == 0) {
                    y6a.M(obj);
                    l6f l6fVar6 = (l6f) e1dVar2.getValue();
                    if (l6fVar6 != null) {
                        k6f k6fVar = new k6f(l6fVar6);
                        if (wzcVar2 != null) {
                            this.u = e1dVar2;
                            this.s = 1;
                            break;
                        }
                        e1dVar = e1dVar2;
                    }
                    l6fVar = new l6f(this.t);
                    if (wzcVar2 != null) {
                        this.u = l6fVar;
                        this.s = 2;
                        if (wzcVar2.a(l6fVar, this) != lu3Var7) {
                            l6fVar2 = l6fVar;
                            l6fVar = l6fVar2;
                        }
                        return lu3Var7;
                    }
                    e1dVar2.setValue(l6fVar);
                    return Unit.a;
                }
                if (i9 != 1) {
                    if (i9 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l6fVar2 = (l6f) this.u;
                    y6a.M(obj);
                    l6fVar = l6fVar2;
                    e1dVar2.setValue(l6fVar);
                    return Unit.a;
                }
                e1dVar = (e1d) this.u;
                y6a.M(obj);
                e1dVar.setValue(null);
                l6fVar = new l6f(this.t);
                if (wzcVar2 != null) {
                }
                e1dVar2.setValue(l6fVar);
                return Unit.a;
            case 7:
                long j6 = this.t;
                CharSequence charSequence2 = (CharSequence) this.v;
                jwj jwjVar = ((lcj) this.w).a;
                lu3 lu3Var8 = lu3.a;
                int i10 = this.s;
                if (i10 == 0) {
                    y6a.M(obj);
                    eje ejeVar = (eje) this.u;
                    this.s = 1;
                    kje kjeVar2 = (kje) ejeVar;
                    kjeVar2.getClass();
                    R = (charSequence2.length() == 0 || pej.d(j6)) ? null : xw3.R(kjeVar2.a, new ije(kjeVar2, new jje(charSequence2, j6, kjeVar2, null), null), this);
                    if (R == lu3Var8) {
                        return lu3Var8;
                    }
                } else {
                    if (i10 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    R = obj;
                }
                pej pejVar = (pej) R;
                if (pejVar != null) {
                    long j7 = pejVar.a;
                    if (Intrinsics.c(jwjVar.d().c, charSequence2) && pej.c(jwjVar.d().d, j6) && !pej.c(j7, jwjVar.d().d)) {
                        jwjVar.j(j7);
                    }
                }
                return Unit.a;
            case 8:
                wzc wzcVar3 = (wzc) this.w;
                lcj lcjVar2 = (lcj) this.v;
                lu3 lu3Var9 = lu3.a;
                int i11 = this.s;
                if (i11 == 0) {
                    y6a.M(obj);
                    l6f l6fVar7 = lcjVar2.w;
                    if (l6fVar7 != null) {
                        k6f k6fVar2 = new k6f(l6fVar7);
                        this.u = lcjVar2;
                        this.s = 1;
                        if (wzcVar3.a(k6fVar2, this) != lu3Var9) {
                            lcjVar = lcjVar2;
                        }
                        return lu3Var9;
                    }
                    l6fVar3 = new l6f(this.t);
                    this.u = l6fVar3;
                    this.s = 2;
                    if (wzcVar3.a(l6fVar3, this) != lu3Var9) {
                        l6fVar4 = l6fVar3;
                        lcjVar2.w = l6fVar4;
                        return Unit.a;
                    }
                    return lu3Var9;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l6fVar4 = (l6f) this.u;
                    y6a.M(obj);
                    lcjVar2.w = l6fVar4;
                    return Unit.a;
                }
                lcjVar = (lcj) this.u;
                y6a.M(obj);
                lcjVar.w = null;
                l6fVar3 = new l6f(this.t);
                this.u = l6fVar3;
                this.s = 2;
                if (wzcVar3.a(l6fVar3, this) != lu3Var9) {
                }
                return lu3Var9;
            case 9:
                lu3 lu3Var10 = lu3.a;
                int i12 = this.s;
                if (i12 == 0) {
                    y6a.M(obj);
                    e eVar2 = (e) this.v;
                    joa joaVar = (joa) this.w;
                    long j8 = this.t;
                    this.u = eVar2;
                    this.s = 1;
                    r = h0.r(eVar2, joaVar, j8, this);
                    if (r == lu3Var10) {
                        return lu3Var10;
                    }
                    eVar = eVar2;
                } else {
                    if (i12 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    eVar = (e) this.u;
                    y6a.M(obj);
                    r = obj;
                }
                return new Pair(eVar, r);
            case 10:
                lu3 lu3Var11 = lu3.a;
                int i13 = this.s;
                if (i13 != 0) {
                    if (i13 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ku3 ku3Var = (ku3) this.u;
                List list = (List) this.v;
                joa joaVar2 = (joa) this.w;
                long j9 = this.t;
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(xw3.t(ku3Var, null, new h2((e) it.next(), joaVar2, j9, (rq3) null, 9), 3));
                }
                this.s = 1;
                Object u = m6k.u(arrayList, this);
                return u == lu3Var11 ? lu3Var11 : u;
            case 11:
                lu3 lu3Var12 = lu3.a;
                int i14 = this.s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                ku3 ku3Var2 = (ku3) this.u;
                List list2 = (List) this.v;
                mqi mqiVar = (mqi) this.w;
                long j10 = this.t;
                ArrayList arrayList2 = new ArrayList(k13.r(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(xw3.t(ku3Var2, null, new a74((e) it2.next(), mqiVar, j10, (rq3) null, 11), 3));
                }
                this.s = 1;
                Object u2 = m6k.u(arrayList2, this);
                return u2 == lu3Var12 ? lu3Var12 : u2;
            case 12:
                g gVar = (g) this.w;
                n nVar = (n) this.v;
                lu3 lu3Var13 = lu3.a;
                int i15 = this.s;
                rq3 rq3Var = null;
                if (i15 == 0) {
                    y6a.M(obj);
                    ku3 ku3Var3 = (ku3) this.u;
                    if (nVar.g instanceof k0) {
                        gVar.a();
                        return Unit.a;
                    }
                    cancellationException = null;
                    av4 t2 = xw3.t(ku3Var3, null, new z40(this.t, nVar, rq3Var, 12), 3);
                    d dVar = nVar.a.d.a;
                    m mVar = new m(this.t, (dVar == null || (n0Var = dVar.i) == null) ? null : h0.b(n0Var), nVar, null, 0);
                    nVar = nVar;
                    t = xw3.t(ku3Var3, null, mVar, 3);
                    try {
                        this.u = t;
                        this.s = 1;
                        w = t2.w(this);
                        cancellationException = cancellationException;
                        if (w == lu3Var13) {
                            return lu3Var13;
                        }
                    } catch (qij unused) {
                        obj2 = t;
                        cancellationException2 = cancellationException;
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "VastAdLoad", "main VAST ad didn't load due to timeout", false, 4, null);
                        ((kea) obj2).e(cancellationException2);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.a;
                        nVar.g = new j0(aVar2);
                        gVar.b(aVar2);
                        return Unit.a;
                    }
                } else if (i15 == 1) {
                    zu4 zu4Var = (zu4) this.u;
                    try {
                        y6a.M(obj);
                        t = zu4Var;
                        cancellationException = null;
                        w = obj;
                    } catch (qij unused2) {
                        cancellationException2 = null;
                        obj2 = zu4Var;
                        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "VastAdLoad", "main VAST ad didn't load due to timeout", false, 4, null);
                        ((kea) obj2).e(cancellationException2);
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar22 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.a;
                        nVar.g = new j0(aVar22);
                        gVar.b(aVar22);
                        return Unit.a;
                    }
                } else if (i15 == 2) {
                    a aVar3 = (a) this.u;
                    y6a.M(obj);
                    aVar = aVar3;
                    r15 = 0;
                    T = obj;
                    a a = a.a(aVar, (m0) T);
                    nVar.g = new k0(a);
                    b bVar = nVar.f;
                    if (bVar != null) {
                        c[] cVarArr = c.b;
                        hVar = ((com.moloco.sdk.acm.recorder.c) bVar).c("vast_show_file_not_exists_load_to_show_ms");
                    } else {
                        hVar = r15;
                    }
                    nVar.k = hVar;
                    this.u = r15;
                    this.s = 3;
                    hs4 hs4Var = z45.a;
                    Object R2 = xw3.R(hq4.c, new pdk(nVar, a, r15, 20), this);
                    if (R2 != lu3Var13) {
                        R2 = Unit.a;
                        break;
                    }
                } else {
                    if (i15 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    r15 = 0;
                    nVar.h.m(r15, Boolean.TRUE);
                    gVar.a();
                    return Unit.a;
                }
                l0 l0Var = (l0) w;
                if (!(l0Var instanceof k0)) {
                    if (l0Var instanceof j0) {
                        nVar.b(t, gVar, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((j0) l0Var).a);
                        return Unit.a;
                    }
                    zzl.b();
                    return null;
                }
                aVar = (a) ((k0) l0Var).a;
                this.u = aVar;
                this.s = 2;
                T = t.T(this);
                r15 = cancellationException;
                break;
                break;
            default:
                b0 b0Var = (b0) this.v;
                lu3 lu3Var14 = lu3.a;
                int i16 = this.s;
                if (i16 == 0) {
                    y6a.M(obj);
                    a0 a0Var = (a0) this.u;
                    this.s = 1;
                    if (a0Var.b(this) == lu3Var14) {
                        return lu3Var14;
                    }
                } else {
                    if (i16 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                bannerImpl = b0Var.getBannerImpl();
                if (bannerImpl != null) {
                    bannerImpl.a(this.t, new t(11, (g) this.w, b0Var));
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(k8j k8jVar, long j, o8j o8jVar, j8j j8jVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 5;
        this.u = k8jVar;
        this.t = j;
        this.v = o8jVar;
        this.w = j8jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Object obj, long j, Object obj2, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.t = j;
        this.w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Object obj, Object obj2, long j, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.v = obj;
        this.w = obj2;
        this.t = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h2(Object obj, Object obj2, long j, Object obj3, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.u = obj;
        this.v = obj2;
        this.t = j;
        this.w = obj3;
    }
}
