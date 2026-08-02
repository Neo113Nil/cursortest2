package androidx.lifecycle;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import com.sports.insider.ui.live.LiveFragment;
import com.sports.insider.ui.news.fragment.NewsFragment;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2141b;

    /* renamed from: c, reason: collision with root package name */
    public int f2142c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fb.b bVar, int i5, String str, Continuation continuation) {
        super(2, continuation);
        this.f2141b = 28;
        this.f2143d = bVar;
        this.f2142c = i5;
        this.f2144e = str;
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f2141b) {
            case 0:
                c cVar = new c((androidx.appcompat.widget.a0) this.f2144e, continuation, 0);
                cVar.f2143d = obj;
                return cVar;
            case 1:
                return new c((hg.g) this.f2143d, (gg.w) this.f2144e, continuation, 1);
            case 2:
                return new c((o0) this.f2144e, this.f2143d, continuation, 2, false);
            case 3:
                c cVar2 = new c((Function2) this.f2144e, continuation, 3);
                cVar2.f2143d = obj;
                return cVar2;
            case 4:
                return new c((bd.j) this.f2143d, (List) this.f2144e, continuation, 4);
            case 5:
                c cVar3 = new c((List) this.f2144e, continuation, 5);
                cVar3.f2143d = obj;
                return cVar3;
            case 6:
                return new c((c1.i0) this.f2143d, (c1.u0) this.f2144e, continuation, 6);
            case 7:
                return new c((Function2) this.f2143d, (c1.d) this.f2144e, continuation);
            case 8:
                c cVar4 = new c((c1.i0) this.f2144e, continuation, 8);
                cVar4.f2143d = obj;
                return cVar4;
            case 9:
                return new c((com.google.firebase.messaging.x) this.f2144e, continuation, 9);
            case 10:
                return new c((cd.d) this.f2144e, this.f2143d, continuation, 10, false);
            case 11:
                return new c((ed.b) this.f2143d, (String) this.f2144e, continuation, 11);
            case 12:
                return new c((g2.b) this.f2143d, (Uri) this.f2144e, continuation, 12);
            case 13:
                return new c((LiveFragment) this.f2143d, (nc.b) this.f2144e, continuation, 13);
            case 14:
                c cVar5 = new c((ge.s) this.f2144e, continuation, 14);
                cVar5.f2143d = obj;
                return cVar5;
            case 15:
                return new c((i3.e) this.f2143d, (gg.w) this.f2144e, continuation, 15);
            case 16:
                return new c((id.c) this.f2144e, continuation, 16);
            case 17:
                c cVar6 = new c((id.e) this.f2144e, this.f2142c, continuation);
                cVar6.f2143d = obj;
                return cVar6;
            case 18:
                return new c((id.x) this.f2143d, (androidx.fragment.app.p0) this.f2144e, continuation, 18);
            case 19:
                return new c((NewsFragment) this.f2143d, (Parcelable) this.f2144e, continuation, 19);
            case 20:
                c cVar7 = new c((ig.e) this.f2144e, continuation, 20);
                cVar7.f2143d = obj;
                return cVar7;
            case 21:
                c cVar8 = new c((ig.f) this.f2144e, continuation, 21);
                cVar8.f2143d = obj;
                return cVar8;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                c cVar9 = new c((hg.h) this.f2144e, continuation, 22);
                cVar9.f2143d = obj;
                return cVar9;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                c cVar10 = new c((j3.b) this.f2144e, continuation, 23);
                cVar10.f2143d = obj;
                return cVar10;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new c((eg.g0) this.f2143d, (String) this.f2144e, continuation, 24);
            case C0122e9.F /* 25 */:
                return new c((List) this.f2143d, (je.b) this.f2144e, continuation, 25);
            case C0122e9.G /* 26 */:
                c cVar11 = new c((Function1) this.f2144e, continuation, 26);
                cVar11.f2143d = obj;
                return cVar11;
            case C0122e9.H /* 27 */:
                return new c((k2.o0) this.f2143d, (Function0) this.f2144e, continuation, 27);
            case 28:
                return new c((fb.b) this.f2143d, this.f2142c, (String) this.f2144e, continuation);
            default:
                return new c((String) this.f2143d, (gf.t) this.f2144e, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2141b) {
        }
        return ((c) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:459:0x0803, code lost:
    
        if (c1.i0.d(r3, r16) == r4) goto L432;
     */
    /* JADX WARN: Removed duplicated region for block: B:296:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:333:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v31, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r2v36, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r5v10, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:304:0x06fb -> B:270:0x06fe). Please report as a decompilation issue!!! */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b10;
        Object obj2;
        Object obj3;
        c cVar;
        gg.h hVar;
        vf.a aVar;
        gg.p pVar;
        Object obj4;
        id.c cVar2;
        Object A;
        Object A2;
        Object m6;
        Object A3;
        Object b11;
        int i5 = 12;
        int i10 = 7;
        Continuation continuation = null;
        int i11 = 1;
        switch (this.f2141b) {
            case 0:
                androidx.appcompat.widget.a0 a0Var = (androidx.appcompat.widget.a0) this.f2144e;
                lf.a aVar2 = lf.a.f20034a;
                int i12 = this.f2142c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    o0 o0Var = new o0((i) a0Var.f680b, ((eg.z) this.f2143d).C());
                    p pVar2 = (p) a0Var.f681c;
                    this.f2142c = 1;
                    if (pVar2.invoke(o0Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                ((a2.q) a0Var.f683e).invoke();
                return Unit.f19194a;
            case 1:
                lf.a aVar3 = lf.a.f20034a;
                int i13 = this.f2142c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    hg.g gVar = (hg.g) this.f2143d;
                    n nVar = new n(r7, (gg.w) this.f2144e);
                    this.f2142c = 1;
                    if (gVar.a(nVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                o0 o0Var2 = (o0) this.f2144e;
                lf.a aVar4 = lf.a.f20034a;
                int i14 = this.f2142c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    i iVar = o0Var2.f2226a;
                    this.f2142c = 1;
                    if (iVar.k(this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                o0Var2.f2226a.j(this.f2143d);
                return Unit.f19194a;
            case 3:
                lf.a aVar5 = lf.a.f20034a;
                int i15 = this.f2142c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    eg.z zVar = (eg.z) this.f2143d;
                    Function2 function2 = (Function2) this.f2144e;
                    this.f2142c = 1;
                    if (function2.invoke(zVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar6 = lf.a.f20034a;
                int i16 = this.f2142c;
                try {
                    if (i16 == 0) {
                        h8.b.B(obj);
                        bd.j jVar = (bd.j) this.f2143d;
                        List list = (List) this.f2144e;
                        this.f2142c = 1;
                        b10 = bd.j.b(jVar, list, this);
                        if (b10 == aVar6) {
                            return aVar6;
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        b10 = obj;
                    }
                    return (List) b10;
                } catch (Exception e7) {
                    zc.d.b(6, null, e7);
                    return kotlin.collections.e0.f19204a;
                }
            case 5:
                lf.a aVar7 = lf.a.f20034a;
                int i17 = this.f2142c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    c1.t0 t0Var = (c1.t0) this.f2143d;
                    List list2 = (List) this.f2144e;
                    this.f2142c = 1;
                    if (c1.h.a(list2, t0Var, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 6:
                c1.u0 u0Var = (c1.u0) this.f2144e;
                c1.i0 i0Var = (c1.i0) this.f2143d;
                lf.a aVar8 = lf.a.f20034a;
                int i18 = this.f2142c;
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 == 2) {
                            h8.b.B(obj);
                        } else if (i18 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                c1.c1 b12 = i0Var.f3408h.b();
                if (b12 instanceof c1.d) {
                    ?? r22 = u0Var.f3481a;
                    CoroutineContext coroutineContext = u0Var.f3484d;
                    this.f2142c = 1;
                    Object b13 = i0Var.g().b(new c1.f0(i0Var, coroutineContext, r22, null), this);
                    if (b13 != aVar8) {
                        return b13;
                    }
                } else {
                    if (!(b12 instanceof c1.w0) && !(b12 instanceof c1.d1)) {
                        if (b12 instanceof c1.s0) {
                            throw ((c1.s0) b12).f3476b;
                        }
                        if (b12 instanceof c1.v0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new gf.m();
                    }
                    if (b12 != u0Var.f3483c) {
                        throw ((c1.w0) b12).f3493b;
                    }
                    this.f2142c = 2;
                    break;
                }
                return aVar8;
                ?? r5 = u0Var.f3481a;
                CoroutineContext coroutineContext2 = u0Var.f3484d;
                this.f2142c = 3;
                Object b14 = i0Var.g().b(new c1.f0(i0Var, coroutineContext2, r5, null), this);
                if (b14 != aVar8) {
                    return b14;
                }
                return aVar8;
            case 7:
                lf.a aVar9 = lf.a.f20034a;
                int i19 = this.f2142c;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                ?? r23 = (mf.i) this.f2143d;
                Object obj5 = ((c1.d) this.f2144e).f3349b;
                this.f2142c = 1;
                Object invoke = r23.invoke(obj5, this);
                return invoke == aVar9 ? aVar9 : invoke;
            case 8:
                lf.a aVar10 = lf.a.f20034a;
                int i20 = this.f2142c;
                if (i20 == 0) {
                    h8.b.B(obj);
                    c1.u0 u0Var2 = (c1.u0) this.f2143d;
                    c1.i0 i0Var2 = (c1.i0) this.f2144e;
                    this.f2142c = 1;
                    if (c1.i0.b(i0Var2, u0Var2, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 9:
                com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) this.f2144e;
                lf.a aVar11 = lf.a.f20034a;
                int i21 = this.f2142c;
                if (i21 == 0) {
                    h8.b.B(obj);
                    if (((AtomicInteger) ((h9.c) xVar.f6185d).f10430b).get() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    eg.c0.k(((jg.d) xVar.f6182a).f18494a);
                    cVar = (c) xVar.f6183b;
                    hVar = (gg.h) xVar.f6184c;
                    this.f2143d = cVar;
                    this.f2142c = i11;
                    hVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = gg.h.f10065c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gg.h.f10069g;
                    gg.p pVar3 = (gg.p) atomicReferenceFieldUpdater.get(hVar);
                    while (!hVar.w()) {
                    }
                    Throwable r6 = hVar.r();
                    int i22 = jg.v.f18528a;
                    throw r6;
                }
                if (i21 != 1) {
                    if (i21 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    if (((AtomicInteger) ((h9.c) xVar.f6185d).f10430b).decrementAndGet() == 0) {
                        return Unit.f19194a;
                    }
                    i11 = 1;
                    eg.c0.k(((jg.d) xVar.f6182a).f18494a);
                    cVar = (c) xVar.f6183b;
                    hVar = (gg.h) xVar.f6184c;
                    this.f2143d = cVar;
                    this.f2142c = i11;
                    hVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = gg.h.f10065c;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = gg.h.f10069g;
                    gg.p pVar32 = (gg.p) atomicReferenceFieldUpdater2.get(hVar);
                    while (!hVar.w()) {
                        long andIncrement = atomicLongFieldUpdater2.getAndIncrement(hVar);
                        long j = gg.j.f10075b;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = atomicReferenceFieldUpdater2;
                        long j6 = andIncrement / j;
                        int i23 = (int) (andIncrement % j);
                        if (pVar32.f18527c != j6) {
                            gg.p p10 = hVar.p(j6, pVar32);
                            if (p10 == null) {
                                continue;
                                atomicReferenceFieldUpdater2 = atomicReferenceFieldUpdater3;
                            } else {
                                pVar32 = p10;
                            }
                        }
                        Object H = hVar.H(pVar32, i23, andIncrement, null);
                        com.android.billingclient.api.a aVar12 = gg.j.f10085m;
                        if (H == aVar12) {
                            throw new IllegalStateException("unexpected");
                        }
                        com.android.billingclient.api.a aVar13 = gg.j.f10087o;
                        if (H != aVar13) {
                            if (H == gg.j.f10086n) {
                                eg.l p11 = eg.c0.p(lf.d.b(this));
                                try {
                                    Object H2 = hVar.H(pVar32, i23, andIncrement, p11);
                                    if (H2 != aVar12) {
                                        if (H2 != aVar13) {
                                            pVar32.b();
                                            aVar = null;
                                        } else {
                                            if (andIncrement < hVar.t()) {
                                                pVar32.b();
                                            }
                                            gg.p pVar4 = (gg.p) atomicReferenceFieldUpdater3.get(hVar);
                                            while (true) {
                                                if (hVar.w()) {
                                                    gf.o oVar = gf.q.f10031a;
                                                    p11.resumeWith(h8.b.h(hVar.r()));
                                                } else {
                                                    long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(hVar);
                                                    long j10 = gg.j.f10075b;
                                                    long j11 = andIncrement2 / j10;
                                                    int i24 = (int) (andIncrement2 % j10);
                                                    if (pVar4.f18527c == j11) {
                                                        pVar = pVar4;
                                                    } else {
                                                        gg.p p12 = hVar.p(j11, pVar4);
                                                        if (p12 != null) {
                                                            pVar = p12;
                                                        }
                                                    }
                                                    H2 = hVar.H(pVar, i24, andIncrement2, p11);
                                                    gg.p pVar5 = pVar;
                                                    if (H2 == gg.j.f10085m) {
                                                        p11.b(pVar5, i24);
                                                    } else if (H2 == gg.j.f10087o) {
                                                        if (andIncrement2 < hVar.t()) {
                                                            pVar5.b();
                                                        }
                                                        pVar4 = pVar5;
                                                    } else {
                                                        if (H2 == gg.j.f10086n) {
                                                            throw new IllegalStateException("unexpected");
                                                        }
                                                        pVar5.b();
                                                        aVar = null;
                                                    }
                                                }
                                            }
                                        }
                                        p11.a(H2, aVar);
                                    } else {
                                        p11.b(pVar32, i23);
                                    }
                                    obj3 = p11.r();
                                    if (obj3 == lf.a.f20034a) {
                                        Intrinsics.checkNotNullParameter(this, "frame");
                                    }
                                } catch (Throwable th2) {
                                    p11.A();
                                    throw th2;
                                }
                            } else {
                                pVar32.b();
                                obj3 = H;
                            }
                            if (obj3 == aVar11) {
                                return aVar11;
                            }
                            obj2 = null;
                            this.f2143d = obj2;
                            this.f2142c = 2;
                            if (cVar.invoke(obj3, this) == aVar11) {
                                return aVar11;
                            }
                            if (((AtomicInteger) ((h9.c) xVar.f6185d).f10430b).decrementAndGet() == 0) {
                            }
                        } else {
                            if (andIncrement < hVar.t()) {
                                pVar32.b();
                            }
                            atomicReferenceFieldUpdater2 = atomicReferenceFieldUpdater3;
                        }
                    }
                    Throwable r62 = hVar.r();
                    int i222 = jg.v.f18528a;
                    throw r62;
                }
                cVar = (c) this.f2143d;
                h8.b.B(obj);
                obj3 = obj;
                obj2 = null;
                this.f2143d = obj2;
                this.f2142c = 2;
                if (cVar.invoke(obj3, this) == aVar11) {
                }
                if (((AtomicInteger) ((h9.c) xVar.f6185d).f10430b).decrementAndGet() == 0) {
                }
            case 10:
                lf.a aVar14 = lf.a.f20034a;
                int i25 = this.f2142c;
                if (i25 == 0) {
                    h8.b.B(obj);
                    cd.d dVar = (cd.d) this.f2144e;
                    JSONObject put = new JSONObject().put("funcName", new JSONObject().put("FrequentlyQuestions", this.f2143d));
                    this.f2142c = 1;
                    if (dVar.e("SUPPORT_FUNC_USES", put, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 11:
                lf.a aVar15 = lf.a.f20034a;
                int i26 = this.f2142c;
                if (i26 == 0) {
                    h8.b.B(obj);
                    ed.b bVar = (ed.b) this.f2143d;
                    JSONObject put2 = new JSONObject().put("PushToken", (String) this.f2144e);
                    Intrinsics.checkNotNullExpressionValue(put2, "put(...)");
                    this.f2142c = 1;
                    if (bVar.d(put2, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 12:
                lf.a aVar16 = lf.a.f20034a;
                int i27 = this.f2142c;
                if (i27 == 0) {
                    h8.b.B(obj);
                    d5 d5Var = ((g2.b) this.f2143d).f9712a;
                    Uri uri = (Uri) this.f2144e;
                    this.f2142c = 1;
                    if (d5Var.N(uri, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 13:
                lf.a aVar17 = lf.a.f20034a;
                int i28 = this.f2142c;
                try {
                    if (i28 == 0) {
                        h8.b.B(obj);
                        Context requireContext = ((LiveFragment) this.f2143d).requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        sd.b bVar2 = new sd.b(requireContext, 3);
                        Bundle bundle = new Bundle();
                        nc.b bVar3 = (nc.b) this.f2144e;
                        bundle.putString("Text", bVar3.getMessage());
                        bundle.putString("Title", bVar3.getTitle());
                        this.f2142c = 1;
                        if (bVar2.b(bundle, this) == aVar17) {
                            return aVar17;
                        }
                    } else {
                        if (i28 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (StringIndexOutOfBoundsException unused) {
                } catch (Exception e9) {
                    zc.d.b(4, "lClickText", e9);
                }
                return Unit.f19194a;
            case 14:
                Integer num = (Integer) this.f2143d;
                Object obj6 = lf.a.f20034a;
                int i29 = this.f2142c;
                if (i29 == 0) {
                    h8.b.B(obj);
                    ge.s sVar = (ge.s) this.f2144e;
                    this.f2143d = null;
                    this.f2142c = 1;
                    if (num != null) {
                        bd.j jVar2 = sVar.f9995d;
                        int intValue = num.intValue();
                        jVar2.getClass();
                        lg.e eVar = eg.m0.f9201a;
                        obj4 = eg.c0.A(lg.d.f20063c, new bd.i(intValue, r7, jVar2, continuation), this);
                        if (obj4 != obj6) {
                            obj4 = Unit.f19194a;
                        }
                        if (obj4 != obj6) {
                            obj4 = Unit.f19194a;
                        }
                    } else {
                        obj4 = Unit.f19194a;
                    }
                    if (obj4 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i29 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 15:
                lf.a aVar18 = lf.a.f20034a;
                int i30 = this.f2142c;
                if (i30 == 0) {
                    h8.b.B(obj);
                    this.f2142c = 1;
                    if (eg.c0.j(1000L, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                e3.x.e().a(i3.k.f10922a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                ((gg.v) ((gg.w) this.f2144e)).g(new i3.b(7));
                return Unit.f19194a;
            case 16:
                lf.a aVar19 = lf.a.f20034a;
                int i31 = this.f2142c;
                try {
                    if (i31 == 0) {
                        h8.b.B(obj);
                        cVar2 = (id.c) this.f2144e;
                        id.x xVar2 = (id.x) cVar2.f11146a.getValue();
                        this.f2143d = cVar2;
                        this.f2142c = 1;
                        xVar2.getClass();
                        id.x.d().getClass();
                        fb.b bVar4 = new fb.b();
                        lg.e eVar2 = eg.m0.f9201a;
                        A = eg.c0.A(lg.d.f20063c, new ad.a(bVar4, continuation, i5), this);
                        if (A == aVar19) {
                            return aVar19;
                        }
                    } else {
                        if (i31 != 1) {
                            if (i31 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            A2 = obj;
                            return (List) A2;
                        }
                        cVar2 = (id.c) this.f2143d;
                        h8.b.B(obj);
                        A = obj;
                    }
                    this.f2143d = null;
                    this.f2142c = 2;
                    cVar2.getClass();
                    lg.e eVar3 = eg.m0.f9201a;
                    A2 = eg.c0.A(lg.d.f20063c, new ab.b(cVar2, (List) A, continuation, 10), this);
                    if (A2 == aVar19) {
                        return aVar19;
                    }
                    return (List) A2;
                } catch (Exception unused2) {
                    return kotlin.collections.e0.f19204a;
                }
            case 17:
                g1.a aVar20 = (g1.a) this.f2143d;
                lf.a aVar21 = lf.a.f20034a;
                h8.b.B(obj);
                String name = "kind" + this.f2142c;
                Intrinsics.checkNotNullParameter(name, "name");
                g1.c key = new g1.c(name);
                Integer num2 = (Integer) aVar20.c(key);
                Integer num3 = new Integer((num2 != null ? num2.intValue() : 0) + 1);
                Intrinsics.checkNotNullParameter(key, "key");
                aVar20.f(key, num3);
                return Unit.f19194a;
            case 18:
                id.x xVar3 = (id.x) this.f2143d;
                Object obj7 = lf.a.f20034a;
                int i32 = this.f2142c;
                if (i32 == 0) {
                    h8.b.B(obj);
                    rc.x.a(R.string.payment_verification, false);
                    pc.u uVar = (pc.u) y3.m(pc.u.class, null, 6);
                    this.f2142c = 1;
                    uVar.getClass();
                    lg.e eVar4 = eg.m0.f9201a;
                    Object A4 = eg.c0.A(lg.d.f20063c, new pc.f(uVar, true, 1000L, null), this);
                    if (A4 != obj7) {
                        A4 = Unit.f19194a;
                    }
                    if (A4 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i32 != 1) {
                        if (i32 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar5 = eg.m0.f9201a;
                fg.e eVar6 = jg.q.f18523a;
                ab.b bVar5 = new ab.b(xVar3, (androidx.fragment.app.p0) this.f2144e, continuation, 11);
                this.f2142c = 2;
                if (eg.c0.A(eVar6, bVar5, this) == obj7) {
                    return obj7;
                }
                return Unit.f19194a;
            case 19:
                lf.a aVar22 = lf.a.f20034a;
                int i33 = this.f2142c;
                if (i33 == 0) {
                    h8.b.B(obj);
                    this.f2142c = 1;
                    if (eg.c0.j(10L, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i33 != 1) {
                        if (i33 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar7 = eg.m0.f9201a;
                fg.e eVar8 = jg.q.f18523a;
                ab.b bVar6 = new ab.b((NewsFragment) this.f2143d, (Parcelable) this.f2144e, continuation, i5);
                this.f2142c = 2;
                if (eg.c0.A(eVar8, bVar6, this) == aVar22) {
                    return aVar22;
                }
                return Unit.f19194a;
            case 20:
                lf.a aVar23 = lf.a.f20034a;
                int i34 = this.f2142c;
                if (i34 == 0) {
                    h8.b.B(obj);
                    gg.w wVar = (gg.w) this.f2143d;
                    ig.e eVar9 = (ig.e) this.f2144e;
                    this.f2142c = 1;
                    if (eVar9.d(wVar, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 21:
                lf.a aVar24 = lf.a.f20034a;
                int i35 = this.f2142c;
                if (i35 == 0) {
                    h8.b.B(obj);
                    hg.h hVar2 = (hg.h) this.f2143d;
                    ig.f fVar = (ig.f) this.f2144e;
                    this.f2142c = 1;
                    if (fVar.g(hVar2, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                lf.a aVar25 = lf.a.f20034a;
                int i36 = this.f2142c;
                if (i36 == 0) {
                    h8.b.B(obj);
                    Object obj8 = this.f2143d;
                    hg.h hVar3 = (hg.h) this.f2144e;
                    this.f2142c = 1;
                    if (hVar3.d(obj8, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                lf.a aVar26 = lf.a.f20034a;
                int i37 = this.f2142c;
                if (i37 == 0) {
                    h8.b.B(obj);
                    gg.w wVar2 = (gg.w) this.f2143d;
                    j3.b bVar7 = (j3.b) this.f2144e;
                    j3.a listener = new j3.a(bVar7, wVar2);
                    k3.f fVar2 = bVar7.f18250a;
                    fVar2.getClass();
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    synchronized (fVar2.f18799c) {
                        try {
                            if (fVar2.f18800d.add(listener)) {
                                if (fVar2.f18800d.size() == 1) {
                                    fVar2.f18801e = fVar2.a();
                                    e3.x.e().a(k3.g.f18802a, fVar2.getClass().getSimpleName() + ": initial state = " + fVar2.f18801e);
                                    fVar2.c();
                                }
                                listener.a(fVar2.f18801e);
                            }
                            Unit unit = Unit.f19194a;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    a2.l lVar = new a2.l(i10, (j3.b) this.f2144e, listener);
                    this.f2142c = 1;
                    if (m4.g.e(wVar2, lVar, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                lf.a aVar27 = lf.a.f20034a;
                int i38 = this.f2142c;
                if (i38 == 0) {
                    h8.b.B(obj);
                    eg.g0 g0Var = (eg.g0) this.f2143d;
                    this.f2142c = 1;
                    m6 = g0Var.m(this);
                    if (m6 == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    m6 = obj;
                }
                String str = (String) m6;
                return str == null ? (String) this.f2144e : str;
            case C0122e9.F /* 25 */:
                hg.d1 d1Var = ((je.b) this.f2144e).f18468e;
                List list3 = (List) this.f2143d;
                lf.a aVar28 = lf.a.f20034a;
                int i39 = this.f2142c;
                if (i39 == 0) {
                    h8.b.B(obj);
                    if (!list3.isEmpty()) {
                        List W = CollectionsKt.W((Iterable) d1Var.getValue());
                        lg.e eVar10 = eg.m0.f9201a;
                        lg.d dVar2 = lg.d.f20063c;
                        ab.b bVar8 = new ab.b(W, list3, continuation, 14);
                        this.f2142c = 1;
                        A3 = eg.c0.A(dVar2, bVar8, this);
                        if (A3 == aVar28) {
                            return aVar28;
                        }
                    }
                    return Unit.f19194a;
                }
                if (i39 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                A3 = obj;
                d1Var.j((List) A3);
                return Unit.f19194a;
            case C0122e9.G /* 26 */:
                lf.a aVar29 = lf.a.f20034a;
                int i40 = this.f2142c;
                if (i40 != 0) {
                    if (i40 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                if (((eg.z) this.f2143d).C().r(k2.z.f18790b) == null) {
                    throw new IllegalStateException("Expected a TransactionElement in the CoroutineContext but none was found.");
                }
                Function1 function1 = (Function1) this.f2144e;
                this.f2142c = 1;
                Object invoke2 = function1.invoke(this);
                return invoke2 == aVar29 ? aVar29 : invoke2;
            case C0122e9.H /* 27 */:
                Function0 function0 = (Function0) this.f2144e;
                lf.a aVar30 = lf.a.f20034a;
                int i41 = this.f2142c;
                try {
                    if (i41 == 0) {
                        h8.b.B(obj);
                        k2.o0 o0Var3 = (k2.o0) this.f2143d;
                        this.f2142c = 1;
                        b11 = k2.o0.b(o0Var3, this);
                        if (b11 == aVar30) {
                            return aVar30;
                        }
                    } else {
                        if (i41 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        b11 = obj;
                    }
                    function0.invoke();
                    return Unit.f19194a;
                } catch (Throwable th4) {
                    function0.invoke();
                    throw th4;
                }
            case 28:
                lf.a aVar31 = lf.a.f20034a;
                h8.b.B(obj);
                sb.j e0 = f3.x.e0();
                int i42 = this.f2142c;
                String json = (String) this.f2144e;
                e0.getClass();
                Intrinsics.checkNotNullParameter(json, "json");
                ub.f fVar3 = e0.f23427b;
                k2.w wVar3 = fVar3.f24213a;
                k2.w wVar4 = fVar3.f24213a;
                if (io.sentry.config.a.C(Integer.valueOf(((Number) f3.x.n0(wVar3, true, false, new eb.b(i42, 26))).intValue()))) {
                    ((Number) f3.x.n0(wVar4, false, true, new m3.h(json, i42, 9))).intValue();
                } else {
                    ((Number) f3.x.n0(wVar4, false, true, new m3.h(i42, json, 8))).longValue();
                }
                return Unit.f19194a;
            default:
                lf.a aVar32 = lf.a.f20034a;
                int i43 = this.f2142c;
                if (i43 == 0) {
                    h8.b.B(obj);
                    xc.a aVar33 = (xc.a) ((gf.t) this.f2144e).getValue();
                    String str2 = (String) this.f2143d;
                    this.f2142c = 1;
                    aVar33.getClass();
                    lg.e eVar11 = eg.m0.f9201a;
                    if (eg.c0.A(lg.d.f20063c, new te.k0(aVar33, str2, continuation, i11), this) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(id.e eVar, int i5, Continuation continuation) {
        super(2, continuation);
        this.f2141b = 17;
        this.f2144e = eVar;
        this.f2142c = i5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f2141b = i5;
        this.f2143d = obj;
        this.f2144e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Continuation continuation, int i5, boolean z5) {
        super(2, continuation);
        this.f2141b = i5;
        this.f2144e = obj;
        this.f2143d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f2141b = i5;
        this.f2144e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, c1.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f2141b = 7;
        this.f2143d = (mf.i) function2;
        this.f2144e = dVar;
    }
}
