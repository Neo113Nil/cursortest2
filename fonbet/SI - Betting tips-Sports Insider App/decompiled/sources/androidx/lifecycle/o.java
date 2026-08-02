package androidx.lifecycle;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.view.InputEvent;
import android.view.View;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.ui.pays.LivePayFragment;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.pays.VipAccessFragment;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2221b;

    /* renamed from: c, reason: collision with root package name */
    public int f2222c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2223d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2225f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(y yVar, hg.g gVar, Continuation continuation) {
        super(2, continuation);
        this.f2221b = 0;
        x xVar = x.f2253a;
        this.f2224e = yVar;
        this.f2225f = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r0.A0(r9) == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (r0 == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        if (r10 == r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0042, code lost:
    
        if (r10 == r2) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Object obj) {
        Object A;
        String str = (String) this.f2225f;
        la.o oVar = (la.o) this.f2224e;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f2222c;
        if (i5 == 0) {
            h8.b.B(obj);
            fb.b bVar = new fb.b();
            this.f2222c = 1;
            obj = bVar.C0(this);
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3 && i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wa.b bVar2 = (wa.b) this.f2223d;
                    h8.b.B(obj);
                    r10 = bVar2;
                    return new Integer(r10.f25041a);
                }
                h8.b.B(obj);
                wa.b bVar3 = (wa.b) obj;
                int i10 = bVar3.f25041a;
                if (i10 != 200) {
                    if (i10 == 401) {
                        fb.b bVar4 = new fb.b();
                        this.f2223d = bVar3;
                        this.f2222c = 4;
                    }
                    return new Integer(bVar3.f25041a);
                }
                ArrayList arrayList = bVar3.f25042b;
                this.f2223d = bVar3;
                this.f2222c = 3;
                if (arrayList == null) {
                    A = Unit.f19194a;
                } else {
                    lg.e eVar = eg.m0.f9201a;
                    A = eg.c0.A(lg.d.f20063c, new la.n(arrayList, oVar, str, null), this);
                    if (A != aVar) {
                        A = Unit.f19194a;
                    }
                }
                bVar3 = bVar2;
                return new Integer(bVar3.f25041a);
            }
            h8.b.B(obj);
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return new Integer(401);
        }
        na.b bVar5 = new na.b();
        String str3 = gc.d.f9945a;
        String d10 = d2.i.d();
        this.f2222c = 2;
        obj = bVar5.v0(str, d10, str2, this);
    }

    private final Object e(Object obj) {
        le.h hVar = (le.h) this.f2224e;
        eg.z zVar = (eg.z) this.f2223d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f2222c;
        if (i5 == 0) {
            h8.b.B(obj);
            wc.e eVar = hVar.f19797f;
            this.f2223d = zVar;
            this.f2222c = 1;
            obj = eVar.d(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        Continuation continuation = null;
        if (((Boolean) obj).booleanValue()) {
            u1.a i10 = d1.i(hVar);
            lg.e eVar2 = eg.m0.f9201a;
            eg.c0.t(i10, jg.q.f18523a, null, new le.b(hVar, continuation, 4), 2);
        } else {
            String str = hVar.f19806p;
            Object obj2 = this.f2225f;
            if (str != null) {
                hVar.f19797f.e((Activity) obj2, str, hVar.f19765b, true, hVar.f19807r, hVar.f19809t);
            }
            lg.e eVar3 = eg.m0.f9201a;
            eg.c0.e(zVar, lg.d.f20063c, new kd.e(hVar, (Activity) obj2, continuation, 6), 2);
        }
        eg.c0.e(zVar, null, new le.b(hVar, continuation, 0), 3);
        return Unit.f19194a;
    }

    private final Object g(Object obj) {
        String str;
        le.h hVar = (le.h) this.f2223d;
        wc.e eVar = hVar.f19797f;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f2222c;
        if (i5 == 0) {
            h8.b.B(obj);
            String n9 = eVar.n((ic.n) this.f2224e);
            Object obj2 = this.f2225f;
            ic.n nVar = (ic.n) obj2;
            zc.c cVar = eVar.f25080h;
            if (nVar != null) {
                Iterator it = ((ic.a0) nVar).f11074e.iterator();
                while (it.hasNext()) {
                    ic.d0 d0Var = (ic.d0) ((ic.m) it.next());
                    if (d0Var.f11101e == 1) {
                        str = d0Var.f11097a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            str = null;
            cVar.getClass();
            String a7 = zc.c.a(str);
            lg.e eVar2 = eg.m0.f9201a;
            fg.e eVar3 = jg.q.f18523a;
            la.d1 d1Var = new la.d1(hVar, (ic.n) this.f2224e, (ic.n) obj2, n9, a7, null, 1);
            this.f2222c = 1;
            if (eg.c0.A(eVar3, d1Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }

    private final Object h(Object obj) {
        LivePayFragment livePayFragment = (LivePayFragment) this.f2224e;
        eg.z zVar = (eg.z) this.f2223d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f2222c;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            Context context = ((View) this.f2225f).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f2223d = zVar;
            this.f2222c = 1;
            obj = eg.c0.i(new ge.f(context, livePayFragment, continuation, 3), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        lg.e eVar = eg.m0.f9201a;
        eg.c0.e(zVar, lg.d.f20063c, new kd.e((eg.f0) obj, livePayFragment, continuation, 11), 2);
        return Unit.f19194a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        if (r12 == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (eg.c0.i(new le.d0(r0, r8, r6), r11) == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (eg.c0.i(new le.d0(r0, r8, r4), r11) == r2) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        PayExpressFragment payExpressFragment = (PayExpressFragment) this.f2224e;
        eg.z zVar = (eg.z) this.f2223d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f2222c;
        int i10 = 0;
        int i11 = 1;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            ec.v vVar = (ec.v) payExpressFragment.f22459a;
            if (vVar != null) {
                vVar.f9024g.setTypePrediction(3);
            }
            ec.v vVar2 = (ec.v) payExpressFragment.f22459a;
            if (vVar2 != null) {
                vVar2.f9024g.k(14, 80, "5.0");
            }
            this.f2223d = zVar;
            this.f2222c = 1;
        } else if (i5 == 1) {
            h8.b.B(obj);
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                lg.e eVar = eg.m0.f9201a;
                eg.c0.e(zVar, lg.d.f20063c, new le.l0((eg.f0) obj, payExpressFragment, continuation, i10), 2);
                return Unit.f19194a;
            }
            h8.b.B(obj);
            Context context = ((View) this.f2225f).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f2223d = zVar;
            this.f2222c = 3;
            obj = eg.c0.i(new ge.f(context, payExpressFragment, continuation, 5), this);
        }
        this.f2223d = zVar;
        this.f2222c = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0087, code lost:
    
        if (r11 == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (eg.c0.i(new le.j1(r0, r7, r5), r10) == r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (eg.c0.i(new le.j1(r0, r7, 0), r10) == r2) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        PayPremiumFragment payPremiumFragment = (PayPremiumFragment) this.f2224e;
        eg.z zVar = (eg.z) this.f2223d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f2222c;
        int i10 = 1;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            ec.w wVar = (ec.w) payPremiumFragment.f22459a;
            if (wVar != null) {
                wVar.f9035g.setTypePrediction(2);
            }
            ec.w wVar2 = (ec.w) payPremiumFragment.f22459a;
            if (wVar2 != null) {
                wVar2.f9035g.k(21, 83, "1.8");
            }
            this.f2223d = zVar;
            this.f2222c = 1;
        } else if (i5 == 1) {
            h8.b.B(obj);
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                lg.e eVar = eg.m0.f9201a;
                eg.c0.e(zVar, lg.d.f20063c, new le.l0((eg.f0) obj, payPremiumFragment, continuation, i10), 2);
                return Unit.f19194a;
            }
            h8.b.B(obj);
            Context context = ((View) this.f2225f).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f2223d = zVar;
            this.f2222c = 3;
            obj = eg.c0.i(new ge.f(context, payPremiumFragment, continuation, 7), this);
        }
        this.f2223d = zVar;
        this.f2222c = 2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        int i5 = this.f2221b;
        Object obj2 = this.f2225f;
        switch (i5) {
            case 0:
                y yVar = (y) this.f2224e;
                x xVar = x.f2253a;
                o oVar = new o(yVar, (hg.g) obj2, continuation);
                oVar.f2223d = obj;
                return oVar;
            case 1:
                o oVar2 = new o((c1.i0) obj2, continuation, 1);
                oVar2.f2223d = obj;
                return oVar2;
            case 2:
                o oVar3 = new o((c1.i0) this.f2224e, (Function2) obj2, continuation);
                oVar3.f2223d = obj;
                return oVar3;
            case 3:
                o oVar4 = new o((c4.v) this.f2224e, (q4.h) obj2, continuation, 3);
                oVar4.f2223d = obj;
                return oVar4;
            case 4:
                return new o((Integer) this.f2223d, (String) this.f2224e, (cd.d) obj2, continuation, 4);
            case 5:
                o oVar5 = new o((Function2) this.f2224e, (u.h) obj2, continuation);
                oVar5.f2223d = obj;
                return oVar5;
            case 6:
                return new o((f3.j0) this.f2223d, (e3.w) this.f2224e, (n3.r) obj2, continuation, 6);
            case 7:
                return new o((g2.b) this.f2223d, (Uri) this.f2224e, (InputEvent) obj2, continuation, 7);
            case 8:
                return new o((s7.t) this.f2223d, (androidx.fragment.app.p0) this.f2224e, (Uri) obj2, continuation, 8);
            case 9:
                return new o((Pair[]) this.f2224e, (m3.f) obj2, continuation, 9);
            case 10:
                o oVar6 = new o((hg.g) obj2, (hg.t0) this.f2224e, continuation);
                oVar6.f2223d = obj;
                return oVar6;
            case 11:
                return new o((hg.a1) this.f2223d, (hg.g) obj2, (hg.t0) this.f2224e, continuation);
            case 12:
                o oVar7 = new o((e3.f) this.f2224e, (i3.e) obj2, continuation, 12);
                oVar7.f2223d = obj;
                return oVar7;
            case 13:
                return new o((com.android.billingclient.api.m) this.f2223d, (m3.o) this.f2224e, (i3.g) obj2, continuation, 13);
            case 14:
                return new o((mc.a) this.f2223d, (List) this.f2224e, (id.x) obj2, continuation, 14);
            case 15:
                o oVar8 = new o((hg.h) this.f2224e, (ig.e) obj2, continuation, 15);
                oVar8.f2223d = obj;
                return oVar8;
            case 16:
                return new o((ig.k) this.f2224e, (hg.h) obj2, this.f2223d, continuation);
            case 17:
                o oVar9 = new o((hg.n) this.f2224e, (hg.h) obj2, continuation, 17);
                oVar9.f2223d = obj;
                return oVar9;
            case 18:
                return new o((fb.b) this.f2223d, (String) this.f2224e, (String) obj2, this.f2222c, continuation);
            case 19:
                return new o((y8.d) this.f2224e, (String) obj2, continuation, 19);
            case 20:
                o oVar10 = new o((k2.o0) obj2, continuation, 20);
                oVar10.f2223d = obj;
                return oVar10;
            case 21:
                o oVar11 = new o((la.m) obj2, continuation, 21);
                oVar11.f2223d = obj;
                return oVar11;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new o((la.o) this.f2224e, (String) obj2, continuation, 22);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new o((la.s0) this.f2223d, (Pair) this.f2224e, (String) obj2, continuation, 23);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                o oVar12 = new o((le.h) this.f2224e, (Activity) obj2, continuation, 24);
                oVar12.f2223d = obj;
                return oVar12;
            case C0122e9.F /* 25 */:
                return new o((le.h) this.f2223d, (ic.n) this.f2224e, (ic.n) obj2, continuation, 25);
            case C0122e9.G /* 26 */:
                o oVar13 = new o((LivePayFragment) this.f2224e, (View) obj2, continuation, 26);
                oVar13.f2223d = obj;
                return oVar13;
            case C0122e9.H /* 27 */:
                o oVar14 = new o((PayExpressFragment) this.f2224e, (View) obj2, continuation, 27);
                oVar14.f2223d = obj;
                return oVar14;
            case 28:
                o oVar15 = new o((PayPremiumFragment) this.f2224e, (View) obj2, continuation, 28);
                oVar15.f2223d = obj;
                return oVar15;
            default:
                o oVar16 = new o((VipAccessFragment) this.f2224e, (View) obj2, continuation, 29);
                oVar16.f2223d = obj;
                return oVar16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2221b) {
        }
        return ((o) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01ce, code lost:
    
        if (r14 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x07bb, code lost:
    
        if (r0 == r1) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0117, code lost:
    
        if (kotlin.text.StringsKt.H(r3) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0a30  */
    /* JADX WARN: Type inference failed for: r1v79, types: [mf.i, vf.a] */
    /* JADX WARN: Type inference failed for: r3v20, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r9v11, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        gg.w wVar;
        hg.h hVar;
        Object A;
        c1.c1 c1Var;
        boolean z5;
        Object invoke;
        Object obj2;
        Object t3;
        Integer intOrNull;
        Object A2;
        LinkedHashMap linkedHashMap;
        Function0 zVar;
        Object A3;
        Object i5;
        k2.c0 c0Var;
        Object a7;
        k2.m mVar;
        ReentrantLock reentrantLock;
        k2.l[] lVarArr;
        k2.l lVar;
        k2.m mVar2;
        ReentrantLock reentrantLock2;
        Object j;
        la.m mVar3;
        Object i10;
        int i11 = 20;
        int i12 = 6;
        int i13 = 4;
        int i14 = 3;
        boolean z7 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        int i15 = 2;
        boolean z25 = true;
        switch (this.f2221b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i16 = this.f2222c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    gg.w wVar2 = (gg.w) this.f2223d;
                    y yVar = (y) this.f2224e;
                    x xVar = x.f2257e;
                    c cVar = new c(this.f2225f, (Object) wVar2, (Continuation) (z10 ? 1 : 0), 1);
                    this.f2223d = wVar2;
                    this.f2222c = 1;
                    if (d1.j(yVar, xVar, cVar, this) == aVar) {
                        return aVar;
                    }
                    wVar = wVar2;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar = (gg.w) this.f2223d;
                    h8.b.B(obj);
                }
                ((gg.v) wVar).k0(null);
                return Unit.f19194a;
            case 1:
                c1.i0 i0Var = (c1.i0) this.f2225f;
                lf.a aVar2 = lf.a.f20034a;
                int i17 = this.f2222c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    hVar = (hg.h) this.f2223d;
                    this.f2223d = hVar;
                    this.f2222c = 1;
                    A = eg.c0.A(i0Var.f3403c.f18494a, new c1.p(i0Var, z11 ? 1 : 0, i15), this);
                    if (A == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return Unit.f19194a;
                        }
                        c1Var = (c1.d) this.f2224e;
                        hVar = (hg.h) this.f2223d;
                        h8.b.B(obj);
                        int i18 = 0;
                        hg.q qVar = new hg.q(new c1.u(i18, new hg.u(new bd.g(new bd.g(new c1.p(i0Var, z14 ? 1 : 0, i18), i0Var.f3408h.f3414a), new c1.q(i15, z13 ? 1 : 0, i18), i14), new ab.b((Object) c1Var, (Continuation) (z12 ? 1 : 0), i15), 1)), new c1.r(i0Var, (Continuation) null));
                        this.f2223d = null;
                        this.f2224e = null;
                        this.f2222c = 3;
                        if (!(hVar instanceof hg.f1)) {
                            throw ((hg.f1) hVar).f10681a;
                        }
                        Object a10 = qVar.a(hVar, this);
                        if (a10 != aVar2) {
                            a10 = Unit.f19194a;
                        }
                        if (a10 == aVar2) {
                            return aVar2;
                        }
                        return Unit.f19194a;
                    }
                    hVar = (hg.h) this.f2223d;
                    h8.b.B(obj);
                    A = obj;
                }
                c1.c1 c1Var2 = (c1.c1) A;
                if (!(c1Var2 instanceof c1.d)) {
                    if (c1Var2 instanceof c1.d1) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    if (c1Var2 instanceof c1.w0) {
                        throw ((c1.w0) c1Var2).f3493b;
                    }
                    if (c1Var2 instanceof c1.s0) {
                        return Unit.f19194a;
                    }
                    if (c1Var2 instanceof c1.v0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    throw new gf.m();
                }
                c1.d dVar = (c1.d) c1Var2;
                Object obj3 = dVar.f3349b;
                this.f2223d = hVar;
                this.f2224e = dVar;
                this.f2222c = 2;
                if (hVar.d(obj3, this) == aVar2) {
                    return aVar2;
                }
                c1Var = c1Var2;
                int i182 = 0;
                hg.q qVar2 = new hg.q(new c1.u(i182, new hg.u(new bd.g(new bd.g(new c1.p(i0Var, z14 ? 1 : 0, i182), i0Var.f3408h.f3414a), new c1.q(i15, z13 ? 1 : 0, i182), i14), new ab.b((Object) c1Var, (Continuation) (z12 ? 1 : 0), i15), 1)), new c1.r(i0Var, (Continuation) null));
                this.f2223d = null;
                this.f2224e = null;
                this.f2222c = 3;
                if (!(hVar instanceof hg.f1)) {
                }
            case 2:
                c1.i0 i0Var2 = (c1.i0) this.f2224e;
                lf.a aVar3 = lf.a.f20034a;
                int i19 = this.f2222c;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                eg.z zVar2 = (eg.z) this.f2223d;
                eg.r a11 = eg.c0.a();
                c1.c1 b10 = i0Var2.f3408h.b();
                if (b10 instanceof c1.d) {
                    b10 = new c1.v0(((c1.d) b10).f3348a);
                }
                c1.u0 u0Var = new c1.u0((mf.i) this.f2225f, a11, b10, zVar2.C());
                com.google.firebase.messaging.x xVar2 = i0Var2.f3411l;
                Object g10 = ((gg.h) xVar2.f6184c).g(u0Var);
                if (g10 instanceof gg.m) {
                    Throwable th2 = ((gg.m) g10).f10093a;
                    if (th2 == null) {
                        throw new gg.r("Channel was closed normally");
                    }
                    throw th2;
                }
                if (g10 instanceof gg.n) {
                    throw new IllegalStateException("Check failed.");
                }
                if (((AtomicInteger) ((h9.c) xVar2.f6185d).f10430b).getAndIncrement() == 0) {
                    eg.c0.t((jg.d) xVar2.f6182a, null, null, new c((Object) xVar2, (Continuation) (z15 ? 1 : 0), 9), 3);
                }
                this.f2222c = 1;
                Object m6 = a11.m(this);
                return m6 == aVar3 ? aVar3 : m6;
            case 3:
                q4.h hVar2 = (q4.h) this.f2225f;
                c4.v vVar = (c4.v) this.f2224e;
                eg.z zVar3 = (eg.z) this.f2223d;
                lf.a aVar4 = lf.a.f20034a;
                int i20 = this.f2222c;
                if (i20 != 0) {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                eg.f0 o3 = c4.p.d(hVar2, eg.c0.e(zVar3, (CoroutineContext) vVar.f3628a.f3604c.getValue(), new c4.s(vVar, hVar2, z16 ? 1 : 0, 1), 2)).o();
                this.f2223d = null;
                this.f2222c = 1;
                Object R = o3.R(this);
                return R == aVar4 ? aVar4 : R;
            case 4:
                lf.a aVar5 = lf.a.f20034a;
                int i21 = this.f2222c;
                if (i21 == 0) {
                    h8.b.B(obj);
                    JSONObject put = new JSONObject().put("funcName", "pushUserCancelBilling");
                    Integer num = (Integer) this.f2223d;
                    if (num != null && num.intValue() > 0) {
                        put.put("id", num.intValue());
                    }
                    put.put("type", (String) this.f2224e);
                    cd.d dVar2 = (cd.d) this.f2225f;
                    this.f2222c = 1;
                    if (dVar2.e("BILLING_FUNC_USES", put, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 5:
                u.h hVar3 = (u.h) this.f2225f;
                lf.a aVar6 = lf.a.f20034a;
                int i22 = this.f2222c;
                try {
                    try {
                        if (i22 == 0) {
                            h8.b.B(obj);
                            eg.z zVar4 = (eg.z) this.f2223d;
                            ?? r32 = (mf.i) this.f2224e;
                            z5 = true;
                            try {
                                this.f2222c = 1;
                                invoke = r32.invoke(zVar4, this);
                                if (invoke == aVar6) {
                                    return aVar6;
                                }
                            } catch (CancellationException unused) {
                                hVar3.f24001d = z5;
                                u.k kVar = hVar3.f23999b;
                                if (kVar != null && kVar.f24004b.cancel(z5)) {
                                    hVar3.f23998a = null;
                                    hVar3.f23999b = null;
                                    hVar3.f24000c = null;
                                }
                                return Unit.f19194a;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            invoke = obj;
                        }
                        hVar3.a(invoke);
                    } catch (CancellationException unused2) {
                        z5 = true;
                    }
                } catch (Throwable th3) {
                    hVar3.b(th3);
                }
                return Unit.f19194a;
            case 6:
                e3.w wVar3 = (e3.w) this.f2224e;
                f3.j0 j0Var = (f3.j0) this.f2223d;
                m3.o oVar = j0Var.f9377a;
                Object obj4 = lf.a.f20034a;
                int i23 = this.f2222c;
                if (i23 == 0) {
                    h8.b.B(obj);
                    Context context = j0Var.f9378b;
                    n3.r rVar = (n3.r) this.f2225f;
                    com.google.firebase.messaging.x xVar3 = j0Var.f9380d;
                    this.f2222c = 1;
                    String str = n3.p.f20846a;
                    if (!oVar.q || Build.VERSION.SDK_INT >= 31) {
                        obj2 = Unit.f19194a;
                        break;
                    } else {
                        e5.p pVar = (e5.p) xVar3.f6185d;
                        Intrinsics.checkNotNullExpressionValue(pVar, "getMainThreadExecutor(...)");
                        Object A4 = eg.c0.A(eg.c0.l(pVar), new u0(wVar3, oVar, rVar, context, (Continuation) null, 9), this);
                        obj2 = A4;
                        if (A4 != obj4) {
                            obj2 = Unit.f19194a;
                            break;
                        }
                    }
                } else {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                }
                e3.x.e().a(f3.l0.f9396a, "Starting work for " + oVar.f20333c);
                u.k b11 = wVar3.b();
                Intrinsics.checkNotNullExpressionValue(b11, "startWork(...)");
                this.f2222c = 2;
                Object a12 = f3.l0.a(b11, wVar3, this);
                if (a12 != obj4) {
                    return a12;
                }
                return obj4;
            case 7:
                lf.a aVar7 = lf.a.f20034a;
                int i24 = this.f2222c;
                if (i24 == 0) {
                    h8.b.B(obj);
                    d5 d5Var = ((g2.b) this.f2223d).f9712a;
                    Uri uri = (Uri) this.f2224e;
                    InputEvent inputEvent = (InputEvent) this.f2225f;
                    this.f2222c = 1;
                    if (d5Var.L(uri, inputEvent, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 8:
                lf.a aVar8 = lf.a.f20034a;
                int i25 = this.f2222c;
                if (i25 == 0) {
                    h8.b.B(obj);
                    androidx.fragment.app.p0 p0Var = (androidx.fragment.app.p0) this.f2224e;
                    Uri uri2 = (Uri) this.f2225f;
                    this.f2222c = 1;
                    String queryParameter = uri2.getQueryParameter("productId");
                    if (queryParameter == null) {
                        t3 = Unit.f19194a;
                    } else {
                        String queryParameter2 = uri2.getQueryParameter("announcementId");
                        t3 = ((pc.u) y3.m(pc.u.class, null, 6)).t(p0Var, queryParameter, (!kotlin.text.z.j(uri2.getPath(), "/subs", true) && kotlin.text.z.j(uri2.getPath(), "/inapp", true)) ? 0 : 2, (queryParameter2 == null || (intOrNull = StringsKt.toIntOrNull(queryParameter2)) == null) ? -1 : intOrNull.intValue(), null, null, this);
                        if (t3 != aVar8) {
                            t3 = Unit.f19194a;
                        }
                    }
                    if (t3 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 9:
                lf.a aVar9 = lf.a.f20034a;
                int i26 = this.f2222c;
                try {
                    if (i26 == 0) {
                        h8.b.B(obj);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Pair pair : (Pair[]) this.f2224e) {
                            if (pair != null) {
                                linkedHashMap2.put(pair.f19192a, pair.f19193b);
                            }
                        }
                        lg.e eVar = eg.m0.f9201a;
                        lg.d dVar3 = lg.d.f20063c;
                        c1.a1 a1Var = new c1.a1(i15, z17 ? 1 : 0, i15);
                        this.f2223d = linkedHashMap2;
                        this.f2222c = 1;
                        A2 = eg.c0.A(dVar3, a1Var, this);
                        if (A2 == aVar9) {
                            return aVar9;
                        }
                        linkedHashMap = linkedHashMap2;
                    } else {
                        if (i26 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        linkedHashMap = (LinkedHashMap) this.f2223d;
                        h8.b.B(obj);
                        A2 = obj;
                    }
                    String str2 = (String) A2;
                    if (str2 != null) {
                        Map c2 = m3.f.c((m3.f) this.f2225f, str2);
                        if (!c2.isEmpty()) {
                            linkedHashMap.putAll(c2);
                        }
                    }
                    return kotlin.collections.n0.i(linkedHashMap);
                } catch (Exception unused3) {
                    return kotlin.collections.n0.c();
                }
            case 10:
                hg.t0 t0Var = (hg.t0) this.f2224e;
                lf.a aVar10 = lf.a.f20034a;
                int i27 = this.f2222c;
                if (i27 == 0) {
                    h8.b.B(obj);
                    int ordinal = ((hg.w0) this.f2223d).ordinal();
                    if (ordinal == 0) {
                        hg.g gVar = (hg.g) this.f2225f;
                        this.f2222c = 1;
                        if (gVar.a(t0Var, this) == aVar10) {
                            return aVar10;
                        }
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new gf.m();
                        }
                        synchronized (t0Var) {
                            try {
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            try {
                                t0Var.u(t0Var.p() + t0Var.f10772k, t0Var.j, t0Var.p() + t0Var.f10772k, t0Var.p() + t0Var.f10772k + t0Var.f10773l);
                                Unit unit = Unit.f19194a;
                            } catch (Throwable th5) {
                                th = th5;
                                t0Var = t0Var;
                                throw th;
                            }
                        }
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 11:
                hg.g gVar2 = (hg.g) this.f2225f;
                hg.t0 t0Var2 = (hg.t0) this.f2224e;
                lf.a aVar11 = lf.a.f20034a;
                int i28 = this.f2222c;
                if (i28 != 0) {
                    if (i28 != 1) {
                        if (i28 == 2) {
                            h8.b.B(obj);
                            this.f2222c = 3;
                            if (gVar2.a(t0Var2, this) == aVar11) {
                                return aVar11;
                            }
                            return Unit.f19194a;
                        }
                        if (i28 != 3 && i28 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    h8.b.B(obj);
                    return Unit.f19194a;
                }
                h8.b.B(obj);
                hg.a1 a1Var2 = (hg.a1) this.f2223d;
                if (a1Var2 == hg.x0.f10795a) {
                    this.f2222c = 1;
                    if (gVar2.a(t0Var2, this) == aVar11) {
                        return aVar11;
                    }
                } else if (a1Var2 == hg.x0.f10796b) {
                    ig.z i29 = t0Var2.i();
                    bd.b bVar = new bd.b(i15, z19 ? 1 : 0, i15);
                    this.f2222c = 2;
                    if (hg.u0.l(i29, bVar, this) == aVar11) {
                        return aVar11;
                    }
                    this.f2222c = 3;
                    if (gVar2.a(t0Var2, this) == aVar11) {
                    }
                } else {
                    ig.z i30 = t0Var2.i();
                    hg.z0 z0Var = new hg.z0(a1Var2, null);
                    int i31 = hg.e0.f10676a;
                    hg.g i32 = hg.u0.i(hg.u0.i(new hg.u(new ig.k(z0Var, i30, kotlin.coroutines.g.f19227a, -2, gg.a.f10048a), new c1.q(i15, z18 ? 1 : 0, 1), 1)));
                    o oVar2 = new o(gVar2, t0Var2, (Continuation) null);
                    this.f2222c = 4;
                    if (hg.u0.g(i32, oVar2, this) == aVar11) {
                        return aVar11;
                    }
                }
                return Unit.f19194a;
            case 12:
                i3.e eVar2 = (i3.e) this.f2225f;
                ConnectivityManager connManager = eVar2.f10907a;
                lf.a aVar12 = lf.a.f20034a;
                int i33 = this.f2222c;
                if (i33 == 0) {
                    h8.b.B(obj);
                    gg.w wVar4 = (gg.w) this.f2223d;
                    NetworkRequest networkRequest = ((e3.f) this.f2224e).a();
                    if (networkRequest == null) {
                        gg.v vVar2 = (gg.v) wVar4;
                        vVar2.getClass();
                        vVar2.k0(null);
                        return Unit.f19194a;
                    }
                    fg.d onConstraintState = new fg.d(i13, eg.c0.t(wVar4, null, null, new c((Object) eVar2, (Object) wVar4, (Continuation) (z20 ? 1 : 0), 15), 3), wVar4);
                    if (Build.VERSION.SDK_INT >= 30) {
                        i3.h.f10912a.getClass();
                        zVar = i3.h.a(connManager, networkRequest, onConstraintState);
                    } else {
                        int i34 = i3.d.f10904c;
                        Intrinsics.checkNotNullParameter(connManager, "connManager");
                        Intrinsics.checkNotNullParameter(networkRequest, "networkRequest");
                        Intrinsics.checkNotNullParameter(onConstraintState, "onConstraintState");
                        i3.d dVar4 = new i3.d(onConstraintState);
                        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                        try {
                            e3.x.e().a(i3.k.f10922a, "NetworkRequestConstraintController register callback");
                            connManager.registerNetworkCallback(networkRequest, dVar4);
                            booleanRef.element = true;
                        } catch (RuntimeException e7) {
                            String name = e7.getClass().getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            if (!kotlin.text.z.i(name, "TooManyRequestsException", false)) {
                                throw e7;
                            }
                            e3.x.e().b(i3.k.f10922a, "NetworkRequestConstraintController couldn't register callback", e7);
                            onConstraintState.invoke(new i3.b(7));
                        }
                        zVar = new f3.z(booleanRef, connManager, dVar4, i15);
                    }
                    gh.t tVar = new gh.t(1, zVar);
                    this.f2222c = 1;
                    if (m4.g.e(wVar4, tVar, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 13:
                m3.o oVar3 = (m3.o) this.f2224e;
                lf.a aVar13 = lf.a.f20034a;
                int i35 = this.f2222c;
                if (i35 == 0) {
                    h8.b.B(obj);
                    hg.g f6 = ((com.android.billingclient.api.m) this.f2223d).f(oVar3);
                    bd.f fVar = new bd.f(i13, (i3.g) this.f2225f, oVar3);
                    this.f2222c = 1;
                    if (f6.a(fVar, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 14:
                id.x xVar4 = (id.x) this.f2225f;
                List list = (List) this.f2224e;
                lf.a aVar14 = lf.a.f20034a;
                int i36 = this.f2222c;
                if (i36 == 0) {
                    h8.b.B(obj);
                    int ordinal2 = ((mc.a) this.f2223d).ordinal();
                    if (ordinal2 == 1) {
                        xVar4.getClass();
                        List f10 = id.x.f(list);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : f10) {
                            ja.c cVar2 = (ja.c) obj5;
                            if (!cVar2.a() && cVar2.f18391d == 1) {
                                arrayList.add(obj5);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj6 : f10) {
                            ja.c cVar3 = (ja.c) obj6;
                            if (cVar3.a() || cVar3.f18391d != 1) {
                                arrayList2.add(obj6);
                            }
                        }
                        return CollectionsKt.N(arrayList, arrayList2);
                    }
                    if (ordinal2 == 2 || ordinal2 == 3) {
                        return list;
                    }
                    this.f2222c = 1;
                    xVar4.getClass();
                    A3 = eg.c0.A(eg.m0.f9201a, new id.r(list, z21 ? 1 : 0, 5), this);
                    if (A3 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A3 = obj;
                }
                return (List) A3;
            case 15:
                Object obj7 = lf.a.f20034a;
                int i37 = this.f2222c;
                if (i37 == 0) {
                    h8.b.B(obj);
                    eg.z zVar5 = (eg.z) this.f2223d;
                    hg.h hVar4 = (hg.h) this.f2224e;
                    ig.e eVar3 = (ig.e) this.f2225f;
                    CoroutineContext coroutineContext = eVar3.f11248a;
                    int i38 = eVar3.f11249b;
                    if (i38 == -3) {
                        i38 = -2;
                    }
                    gg.a aVar15 = eVar3.f11250c;
                    eg.a0 a0Var = eg.a0.f9138c;
                    Function2 cVar4 = new c((Object) eVar3, (Continuation) (z22 ? 1 : 0), i11);
                    gg.v vVar3 = new gg.v(eg.u.b(zVar5, coroutineContext), k2.x.a(i38, 4, aVar15));
                    vVar3.j0(a0Var, vVar3, cVar4);
                    this.f2222c = 1;
                    Object j6 = hg.u0.j(hVar4, vVar3, true, this);
                    Object obj8 = j6;
                    if (j6 != obj7) {
                        obj8 = Unit.f19194a;
                    }
                    if (obj8 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 16:
                lf.a aVar16 = lf.a.f20034a;
                int i39 = this.f2222c;
                if (i39 == 0) {
                    h8.b.B(obj);
                    ?? r12 = ((ig.k) this.f2224e).f11265e;
                    hg.h hVar5 = (hg.h) this.f2225f;
                    Object obj9 = this.f2223d;
                    this.f2222c = 1;
                    if (r12.invoke(hVar5, obj9, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i39 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 17:
                lf.a aVar17 = lf.a.f20034a;
                int i40 = this.f2222c;
                if (i40 == 0) {
                    h8.b.B(obj);
                    eg.z zVar6 = (eg.z) this.f2223d;
                    hg.n nVar = (hg.n) this.f2224e;
                    hg.h hVar6 = (hg.h) this.f2225f;
                    this.f2222c = 1;
                    if (nVar.invoke(zVar6, hVar6, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 18:
                lf.a aVar18 = lf.a.f20034a;
                h8.b.B(obj);
                sb.j e0 = f3.x.e0();
                String order = (String) this.f2224e;
                String product = (String) this.f2225f;
                int i41 = this.f2222c;
                e0.getClass();
                Intrinsics.checkNotNullParameter(order, "order");
                Intrinsics.checkNotNullParameter(product, "sku");
                tb.f fVar2 = e0.f23426a;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(order, "order");
                k2.w wVar5 = fVar2.f23832a;
                if (((Number) f3.x.n0(wVar5, true, false, new a2.k(order, 27))).intValue() > 0) {
                    Intrinsics.checkNotNullParameter(order, "order");
                    ((Number) f3.x.n0(wVar5, false, true, new m3.h(i41, order, i12))).intValue();
                } else {
                    Intrinsics.checkNotNullParameter(order, "order");
                    Intrinsics.checkNotNullParameter(product, "product");
                    ((Number) f3.x.n0(wVar5, false, true, new pb.a(order, product, i41, i12))).longValue();
                }
                return Unit.f19194a;
            case 19:
                y8.d dVar5 = (y8.d) this.f2224e;
                lf.a aVar19 = lf.a.f20034a;
                int i42 = this.f2222c;
                Continuation continuation = null;
                if (i42 == 0) {
                    h8.b.B(obj);
                    this.f2222c = 1;
                    i5 = eg.c0.i(new jd.c(dVar5, null), this);
                    if (i5 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i42 != 1) {
                        if (i42 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str3 = (String) this.f2223d;
                        h8.b.B(obj);
                        return str3;
                    }
                    h8.b.B(obj);
                    i5 = obj;
                }
                String str4 = (String) i5;
                String str5 = (String) this.f2225f;
                this.f2223d = str4;
                this.f2222c = 2;
                Object i43 = eg.c0.i(new ge.f(str4, str5, (Object) dVar5, continuation, 1), this);
                if (i43 != aVar19) {
                    i43 = Unit.f19194a;
                }
                return i43 == aVar19 ? aVar19 : str4;
            case 20:
                lf.a aVar20 = lf.a.f20034a;
                int i44 = this.f2222c;
                if (i44 == 0) {
                    h8.b.B(obj);
                    c0Var = (k2.c0) this.f2223d;
                    this.f2223d = c0Var;
                    this.f2222c = 1;
                    a7 = c0Var.a(this);
                    if (a7 == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i44 != 1) {
                        if (i44 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        reentrantLock2 = (ReentrantLock) this.f2224e;
                        mVar2 = (k2.m) this.f2223d;
                        try {
                            h8.b.B(obj);
                            reentrantLock = reentrantLock2;
                            mVar = mVar2;
                            mVar.f18719f = false;
                            Unit unit2 = Unit.f19194a;
                            reentrantLock.unlock();
                            return Unit.f19194a;
                        } catch (Throwable th6) {
                            th = th6;
                            try {
                                mVar2.f18719f = z7;
                                throw th;
                            } catch (Throwable th7) {
                                th = th7;
                                reentrantLock = reentrantLock2;
                                reentrantLock.unlock();
                                throw th;
                            }
                        }
                    }
                    c0Var = (k2.c0) this.f2223d;
                    h8.b.B(obj);
                    a7 = obj;
                }
                if (((Boolean) a7).booleanValue()) {
                    return Unit.f19194a;
                }
                k2.o0 o0Var = (k2.o0) this.f2225f;
                mVar = o0Var.f18744h;
                reentrantLock = mVar.f18718e;
                reentrantLock.lock();
                try {
                    mVar.f18719f = true;
                    ReentrantLock reentrantLock3 = mVar.f18714a;
                    reentrantLock3.lock();
                    try {
                        if (mVar.f18717d) {
                            mVar.f18717d = false;
                            int length = mVar.f18715b.length;
                            lVarArr = new k2.l[length];
                            int i45 = 0;
                            boolean z26 = false;
                            while (i45 < length) {
                                boolean z27 = mVar.f18715b[i45] > 0 ? z25 : z7;
                                boolean[] zArr = mVar.f18716c;
                                if (z27 != zArr[i45]) {
                                    zArr[i45] = z27;
                                    lVar = z27 ? k2.l.f18703b : k2.l.f18704c;
                                    z26 = true;
                                } else {
                                    lVar = k2.l.f18702a;
                                }
                                lVarArr[i45] = lVar;
                                i45++;
                                z7 = false;
                                z25 = true;
                            }
                            break;
                        }
                        lVarArr = null;
                        if (lVarArr != null) {
                            try {
                                if (lVarArr.length != 0) {
                                    k2.b0 b0Var = k2.b0.f18651b;
                                    k2.n0 n0Var = new k2.n0(lVarArr, o0Var, c0Var, null);
                                    this.f2223d = mVar;
                                    this.f2224e = reentrantLock;
                                    this.f2222c = 2;
                                    if (c0Var.b(b0Var, n0Var, this) == aVar20) {
                                        return aVar20;
                                    }
                                    mVar2 = mVar;
                                    reentrantLock2 = reentrantLock;
                                    reentrantLock = reentrantLock2;
                                    mVar = mVar2;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                mVar2 = mVar;
                                reentrantLock2 = reentrantLock;
                                z7 = false;
                                mVar2.f18719f = z7;
                                throw th;
                            }
                        }
                        mVar.f18719f = false;
                        Unit unit22 = Unit.f19194a;
                        reentrantLock.unlock();
                        return Unit.f19194a;
                    } finally {
                        reentrantLock3.unlock();
                    }
                } catch (Throwable th9) {
                    th = th9;
                    reentrantLock.unlock();
                    throw th;
                }
            case 21:
                eg.z zVar7 = (eg.z) this.f2223d;
                lf.a aVar21 = lf.a.f20034a;
                int i46 = this.f2222c;
                try {
                    if (i46 == 0) {
                        h8.b.B(obj);
                        la.m mVar4 = (la.m) this.f2225f;
                        mVar4.getClass();
                        y8.d dVar6 = new y8.d();
                        this.f2223d = zVar7;
                        this.f2224e = mVar4;
                        this.f2222c = 1;
                        j = dVar6.j(500L, this);
                        if (j == aVar21) {
                            return aVar21;
                        }
                        mVar3 = mVar4;
                    } else {
                        if (i46 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mVar3 = (la.m) this.f2224e;
                        h8.b.B(obj);
                        j = obj;
                    }
                    String str6 = (String) j;
                    if (str6 != null) {
                        if (str6.length() == 0) {
                            str6 = null;
                        }
                        if (str6 != null) {
                            break;
                        }
                    }
                    str6 = null;
                    mVar3.f19547d = str6;
                } catch (Exception e9) {
                    c4.w wVar6 = zc.a.f25907a;
                    eg.y yVar2 = (eg.y) zVar7.C().r(eg.y.f9241c);
                    zc.a.a(yVar2 != null ? yVar2.f9242b : null, e9);
                }
                return Unit.f19194a;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return c(obj);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                Pair pair2 = (Pair) this.f2224e;
                lf.a aVar22 = lf.a.f20034a;
                int i47 = this.f2222c;
                if (i47 != 0) {
                    if (i47 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                la.s0 s0Var = (la.s0) this.f2223d;
                long longValue = ((Number) pair2.f19192a).longValue();
                long longValue2 = ((Number) pair2.f19193b).longValue();
                String str7 = (String) this.f2225f;
                this.f2222c = 1;
                Object c8 = la.s0.c(s0Var, longValue, longValue2, str7, null, this);
                return c8 == aVar22 ? aVar22 : c8;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return e(obj);
            case C0122e9.F /* 25 */:
                return g(obj);
            case C0122e9.G /* 26 */:
                return h(obj);
            case C0122e9.H /* 27 */:
                return j(obj);
            case 28:
                return k(obj);
            default:
                VipAccessFragment vipAccessFragment = (VipAccessFragment) this.f2224e;
                eg.z zVar8 = (eg.z) this.f2223d;
                lf.a aVar23 = lf.a.f20034a;
                int i48 = this.f2222c;
                if (i48 == 0) {
                    h8.b.B(obj);
                    Context context2 = ((View) this.f2225f).getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                    this.f2223d = zVar8;
                    this.f2222c = 1;
                    i10 = eg.c0.i(new ge.f((Object) context2, (Object) vipAccessFragment, (Continuation) (z23 ? 1 : 0), 8), this);
                    if (i10 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    i10 = obj;
                }
                lg.e eVar4 = eg.m0.f9201a;
                eg.c0.e(zVar8, lg.d.f20063c, new kd.e(i10, (Object) vipAccessFragment, (Continuation) (z24 ? 1 : 0), i11), 2);
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(c1.i0 i0Var, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f2221b = 2;
        this.f2224e = i0Var;
        this.f2225f = (mf.i) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fb.b bVar, String str, String str2, int i5, Continuation continuation) {
        super(2, continuation);
        this.f2221b = 18;
        this.f2223d = bVar;
        this.f2224e = str;
        this.f2225f = str2;
        this.f2222c = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hg.g gVar, hg.t0 t0Var, Continuation continuation) {
        super(2, continuation);
        this.f2221b = 10;
        this.f2225f = gVar;
        this.f2224e = t0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hg.a1 a1Var, hg.g gVar, hg.t0 t0Var, Continuation continuation) {
        super(2, continuation);
        this.f2221b = 11;
        this.f2223d = a1Var;
        this.f2225f = gVar;
        this.f2224e = t0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ig.k kVar, hg.h hVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f2221b = 16;
        this.f2224e = kVar;
        this.f2225f = hVar;
        this.f2223d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Continuation continuation, int i5) {
        super(2, continuation);
        this.f2221b = i5;
        this.f2223d = obj;
        this.f2224e = obj2;
        this.f2225f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f2221b = i5;
        this.f2224e = obj;
        this.f2225f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f2221b = i5;
        this.f2225f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(Function2 function2, u.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f2221b = 5;
        this.f2224e = (mf.i) function2;
        this.f2225f = hVar;
    }
}
