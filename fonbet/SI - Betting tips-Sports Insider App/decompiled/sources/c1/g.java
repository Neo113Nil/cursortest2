package c1;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.lifecycle.k1;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.ui.views.PredictionCard;
import eg.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3380b;

    /* renamed from: c, reason: collision with root package name */
    public int f3381c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3382d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3383e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3384f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f3385g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3386h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3387i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k1 k1Var, Activity activity, String str, String str2, String str3, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3380b = i5;
        this.f3382d = k1Var;
        this.f3383e = activity;
        this.f3385g = str;
        this.f3386h = str2;
        this.f3387i = str3;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f3380b) {
            case 0:
                g gVar = new g((List) this.f3386h, (ArrayList) this.f3387i, continuation);
                gVar.f3385g = obj;
                return gVar;
            case 1:
                return new g((la.s0) this.f3382d, (String) this.f3383e, (String) this.f3384f, (String) this.f3385g, (String) this.f3386h, (Integer) this.f3387i, continuation);
            case 2:
                g gVar2 = new g((le.z) this.f3382d, (Activity) this.f3383e, (String) this.f3385g, (String) this.f3386h, (String) this.f3387i, continuation, 2);
                gVar2.f3384f = obj;
                return gVar2;
            case 3:
                g gVar3 = new g((List) this.f3386h, (List) this.f3383e, (List) this.f3385g, (me.c0) this.f3387i, continuation);
                gVar3.f3384f = obj;
                return gVar3;
            case 4:
                g gVar4 = new g((e3.w) this.f3385g, (com.android.billingclient.api.m) this.f3386h, (m3.o) this.f3387i, continuation, 4);
                gVar4.f3384f = obj;
                return gVar4;
            case 5:
                g gVar5 = new g((se.p) this.f3382d, (Activity) this.f3383e, (String) this.f3385g, (String) this.f3386h, (String) this.f3387i, continuation, 5);
                gVar5.f3384f = obj;
                return gVar5;
            case 6:
                return new g((ve.q) this.f3385g, (qe.a) this.f3386h, (qe.a) this.f3387i, continuation, 6);
            case 7:
                return new g((ve.u) this.f3385g, (qe.a) this.f3386h, (qe.a) this.f3387i, continuation, 7);
            case 8:
                return new g((PredictionCard) this.f3385g, (me.d) this.f3386h, (me.d) this.f3387i, continuation, 8);
            default:
                return new g((ve.f0) this.f3385g, (qe.a) this.f3386h, (qe.a) this.f3387i, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3380b) {
        }
        return ((g) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0407  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v225 */
    /* JADX WARN: Type inference failed for: r2v226 */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24, types: [eg.e1] */
    /* JADX WARN: Type inference failed for: r2v28, types: [eg.e1] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v19, types: [g8.b] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:265:0x0a2b -> B:260:0x0a08). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:267:0x0a54 -> B:260:0x0a08). Please report as a decompilation issue!!! */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        ArrayList arrayList;
        Iterator it;
        Object obj3;
        e1.b bVar;
        Object B;
        LinkedHashSet linkedHashSet;
        Object f6;
        AtomicInteger atomicInteger;
        u.k kVar;
        Object d10;
        AtomicInteger atomicInteger2;
        ?? r42;
        CancellationException e7;
        Object A;
        Object A2;
        Typeface typeface;
        Object A3;
        Object A4;
        Typeface typeface2;
        Typeface typeface3;
        ve.q qVar;
        Object A5;
        ve.q qVar2;
        Object A6;
        ve.q qVar3;
        Object A7;
        ve.q qVar4;
        Typeface typeface4;
        Object A8;
        ve.q qVar5;
        Object A9;
        ve.q qVar6;
        Object A10;
        ve.q qVar7;
        Object A11;
        ve.q qVar8;
        Object A12;
        ve.q qVar9;
        Typeface typeface5;
        Object A13;
        Typeface typeface6;
        Object A14;
        Typeface typeface7;
        Object A15;
        Typeface typeface8;
        ve.u uVar;
        Object A16;
        ve.u uVar2;
        Object A17;
        Typeface typeface9;
        Object A18;
        Typeface typeface10;
        Object A19;
        PredictionCard predictionCard;
        Object A20;
        Typeface typeface11;
        Object A21;
        Typeface typeface12;
        Object A22;
        Typeface typeface13;
        ve.f0 f0Var;
        Object A23;
        Typeface typeface14;
        ve.f0 f0Var2;
        Object A24;
        ve.f0 f0Var3;
        Object A25;
        ve.f0 f0Var4;
        Typeface typeface15;
        Object A26;
        ve.f0 f0Var5;
        Object A27;
        ve.f0 f0Var6;
        Object A28;
        ve.f0 f0Var7;
        Object A29;
        ve.f0 f0Var8;
        Object A30;
        ve.f0 f0Var9;
        Typeface typeface16;
        int i5 = 11;
        int i10 = 10;
        int i11 = 5;
        int i12 = 4;
        Continuation continuation = null;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        switch (this.f3380b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i16 = this.f3381c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    obj2 = this.f3385g;
                    List list = (List) this.f3386h;
                    arrayList = (ArrayList) this.f3387i;
                    it = list.iterator();
                } else if (i16 == 1) {
                    obj2 = this.f3384f;
                    e1.b bVar2 = (e1.b) this.f3383e;
                    Iterator it2 = (Iterator) this.f3382d;
                    ?? r43 = (List) this.f3385g;
                    h8.b.B(obj);
                    bVar = bVar2;
                    it = it2;
                    arrayList = r43;
                    obj3 = obj;
                    if (((Boolean) obj3).booleanValue()) {
                        arrayList.add(new f(bVar, continuation, r8));
                        this.f3385g = arrayList;
                        this.f3382d = it;
                        this.f3383e = null;
                        this.f3384f = null;
                        this.f3381c = 2;
                        obj2 = bVar.f8461b.invoke(new e1.d((SharedPreferences) bVar.f8464e.getValue(), bVar.f8465f), obj2, this);
                        if (obj2 == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Iterator it3 = (Iterator) this.f3382d;
                    ?? r22 = (List) this.f3385g;
                    h8.b.B(obj);
                    arrayList = r22;
                    it = it3;
                    obj2 = obj;
                }
                if (!it.hasNext()) {
                    bVar = (e1.b) it.next();
                    this.f3385g = arrayList;
                    this.f3382d = it;
                    this.f3383e = bVar;
                    this.f3384f = obj2;
                    this.f3381c = 1;
                    obj3 = bVar.a(obj2, this);
                    if (obj3 == aVar) {
                        return aVar;
                    }
                    if (((Boolean) obj3).booleanValue()) {
                    }
                    if (!it.hasNext()) {
                        return obj2;
                    }
                }
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i17 = this.f3381c;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                na.b bVar3 = new na.b();
                String str = (String) this.f3383e;
                String str2 = (String) this.f3384f;
                String str3 = (String) this.f3385g;
                String str4 = (String) this.f3386h;
                String str5 = gc.d.f9945a;
                String d11 = d2.i.d();
                Integer num = (Integer) this.f3387i;
                this.f3381c = 1;
                Object B0 = bVar3.B0(str, str2, str3, str4, d11, num, this);
                return B0 == aVar2 ? aVar2 : B0;
            case 2:
                le.z zVar = (le.z) this.f3382d;
                com.google.firebase.messaging.x xVar = zVar.f20027y;
                eg.z zVar2 = (eg.z) this.f3384f;
                lf.a aVar3 = lf.a.f20034a;
                int i18 = this.f3381c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    this.f3384f = zVar2;
                    this.f3381c = 1;
                    B = xVar.B(this);
                    if (B == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    B = obj;
                }
                if (((Boolean) B).booleanValue()) {
                    eg.c0.t(androidx.lifecycle.d1.i(zVar), null, null, new le.u(zVar, continuation, 7), 3);
                } else {
                    Activity activity = (Activity) this.f3383e;
                    String productId = (String) this.f3385g;
                    int i19 = zVar.f20014k;
                    String str6 = (String) this.f3386h;
                    String str7 = (String) this.f3387i;
                    xVar.getClass();
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(productId, "productId");
                    jg.d dVar = MyApp.f6830c;
                    lg.e eVar = eg.m0.f9201a;
                    eg.y yVar = new eg.y("LaunchBilling");
                    eVar.getClass();
                    eg.c0.t(dVar, kotlin.coroutines.e.c(eVar, yVar), null, new la.e(xVar, activity, productId, i19, str6, str7, (Continuation) null, 3), 2);
                    eg.c0.e(zVar2, lg.d.f20063c, new kd.e(zVar, (Activity) this.f3383e, continuation, 12), 2);
                }
                eg.c0.e(zVar2, null, new le.u(zVar, continuation, r8), 3);
                return Unit.f19194a;
            case 3:
                List list2 = (List) this.f3385g;
                List list3 = (List) this.f3383e;
                List list4 = (List) this.f3386h;
                eg.z zVar3 = (eg.z) this.f3384f;
                lf.a aVar4 = lf.a.f20034a;
                int i20 = this.f3381c;
                try {
                    if (i20 == 0) {
                        h8.b.B(obj);
                        if ((list4 == null || list4.isEmpty()) && ((list3 == null || list3.isEmpty()) && (list2 == null || list2.isEmpty()))) {
                            return Unit.f19194a;
                        }
                        gf.u uVar3 = new gf.u(list4, list3, list2);
                        lg.e eVar2 = eg.m0.f9201a;
                        lg.d dVar2 = lg.d.f20063c;
                        eg.g0 e9 = eg.c0.e(zVar3, dVar2, new me.u(uVar3, continuation, i14), 2);
                        eg.g0 e10 = eg.c0.e(zVar3, dVar2, new me.u(uVar3, continuation, i15), 2);
                        eg.g0 e11 = eg.c0.e(zVar3, dVar2, new me.u(uVar3, continuation, r8), 2);
                        linkedHashSet = new LinkedHashSet();
                        this.f3384f = null;
                        this.f3382d = linkedHashSet;
                        this.f3381c = 1;
                        f6 = eg.c0.f(new eg.f0[]{e9, e10, e11}, this);
                        if (f6 == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i20 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        LinkedHashSet linkedHashSet2 = (LinkedHashSet) this.f3382d;
                        h8.b.B(obj);
                        linkedHashSet = linkedHashSet2;
                        f6 = obj;
                    }
                    Iterator it4 = ((Iterable) f6).iterator();
                    while (it4.hasNext()) {
                        linkedHashSet.addAll((Set) it4.next());
                    }
                    ((me.c0) this.f3387i).S.j(linkedHashSet);
                } catch (Exception ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar3 = MyApp.f6830c;
                    lg.e eVar3 = eg.m0.f9201a;
                    eg.c0.t(dVar3, lg.d.f20063c, null, new q4.r(ex, continuation, 18), 2);
                }
                return Unit.f19194a;
            case 4:
                e3.w wVar = (e3.w) this.f3385g;
                Object obj4 = lf.a.f20034a;
                ?? r23 = this.f3381c;
                try {
                    try {
                        if (r23 == 0) {
                            h8.b.B(obj);
                            eg.z zVar4 = (eg.z) this.f3384f;
                            AtomicInteger atomicInteger3 = new AtomicInteger(-256);
                            u.k b10 = wVar.b();
                            Intrinsics.checkNotNullExpressionValue(b10, "startWork(...)");
                            androidx.lifecycle.u0 u0Var = new androidx.lifecycle.u0((com.android.billingclient.api.m) this.f3386h, (m3.o) this.f3387i, atomicInteger3, b10, (Continuation) null, 11);
                            atomicInteger = atomicInteger3;
                            kVar = b10;
                            t1 t3 = eg.c0.t(zVar4, null, null, u0Var, 3);
                            try {
                                this.f3384f = atomicInteger;
                                this.f3382d = kVar;
                                this.f3383e = t3;
                                this.f3381c = 1;
                                d10 = y3.d(kVar, this);
                                r23 = t3;
                                if (d10 == obj4) {
                                    return obj4;
                                }
                            } catch (CancellationException e12) {
                                e7 = e12;
                                r42 = kVar;
                                atomicInteger2 = atomicInteger;
                                String str8 = p3.f.f21509a;
                                e3.x.e().b(str8, "Delegated worker " + wVar.getClass() + " was cancelled", e7);
                                if (atomicInteger2.get() != -256) {
                                }
                                if (r42.isCancelled()) {
                                }
                                throw e7;
                            }
                        } else {
                            if (r23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t1 t1Var = (t1) this.f3383e;
                            r42 = (g8.b) this.f3382d;
                            atomicInteger2 = (AtomicInteger) this.f3384f;
                            try {
                                h8.b.B(obj);
                                atomicInteger = atomicInteger2;
                                kVar = r42;
                                d10 = obj;
                                r23 = t1Var;
                            } catch (CancellationException e13) {
                                e7 = e13;
                                String str82 = p3.f.f21509a;
                                e3.x.e().b(str82, "Delegated worker " + wVar.getClass() + " was cancelled", e7);
                                r8 = atomicInteger2.get() != -256 ? 1 : 0;
                                if (r42.isCancelled() || r8 == 0) {
                                    throw e7;
                                }
                                throw new p3.a(atomicInteger2.get());
                            }
                        }
                        obj4 = (e3.v) d10;
                        r23.k(null);
                        return obj4;
                    } catch (Throwable th2) {
                        String str9 = p3.f.f21509a;
                        e3.x.e().b(str9, "Delegated worker " + wVar.getClass() + " threw exception in startWork.", th2);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    r23.k(null);
                    throw th3;
                }
            case 5:
                se.p pVar = (se.p) this.f3382d;
                wc.i iVar = pVar.A;
                eg.z zVar5 = (eg.z) this.f3384f;
                lf.a aVar5 = lf.a.f20034a;
                int i21 = this.f3381c;
                if (i21 == 0) {
                    h8.b.B(obj);
                    this.f3384f = zVar5;
                    this.f3381c = 1;
                    iVar.getClass();
                    lg.e eVar4 = eg.m0.f9201a;
                    A = eg.c0.A(lg.d.f20063c, new wc.f(iVar, continuation, i12), this);
                    if (A == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A = obj;
                }
                if (((Boolean) A).booleanValue()) {
                    u1.a i22 = androidx.lifecycle.d1.i(pVar);
                    CoroutineContext coroutineContext = pVar.L;
                    lg.e eVar5 = eg.m0.f9201a;
                    eg.c0.t(i22, coroutineContext.t(jg.q.f18523a), null, new se.j(pVar, continuation, 9), 2);
                } else {
                    Activity activity2 = (Activity) this.f3383e;
                    String productId2 = (String) this.f3385g;
                    int i23 = se.p.T;
                    String str10 = (String) this.f3386h;
                    String str11 = (String) this.f3387i;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(activity2, "activity");
                    Intrinsics.checkNotNullParameter(productId2, "productId");
                    jg.d dVar4 = MyApp.f6830c;
                    eg.y yVar2 = iVar.f25110a;
                    eg.y yVar3 = new eg.y("LaunchBilling");
                    yVar2.getClass();
                    eg.c0.t(dVar4, kotlin.coroutines.e.c(yVar2, yVar3), null, new la.e(iVar, activity2, productId2, i23, str10, str11, (Continuation) null, 2), 2);
                    eg.c0.e(zVar5, lg.d.f20063c, new oe.j(pVar, (Activity) this.f3383e, continuation, 27), 2);
                }
                eg.c0.e(zVar5, null, new se.j(pVar, continuation, r8), 3);
                return Unit.f19194a;
            case 6:
                ve.q qVar10 = (ve.q) this.f3385g;
                lf.a aVar6 = lf.a.f20034a;
                switch (this.f3381c) {
                    case 0:
                        h8.b.B(obj);
                        lg.e eVar6 = eg.m0.f9201a;
                        lg.d dVar5 = lg.d.f20063c;
                        androidx.lifecycle.b bVar4 = new androidx.lifecycle.b((qe.a) this.f3386h, continuation, 29);
                        this.f3381c = 1;
                        A2 = eg.c0.A(dVar5, bVar4, this);
                        if (A2 == aVar6) {
                            return aVar6;
                        }
                        typeface = (Typeface) A2;
                        lg.e eVar7 = eg.m0.f9201a;
                        lg.d dVar6 = lg.d.f20063c;
                        ve.p pVar2 = new ve.p((qe.a) this.f3387i, continuation, r8);
                        this.f3382d = typeface;
                        this.f3381c = 2;
                        A3 = eg.c0.A(dVar6, pVar2, this);
                        if (A3 == aVar6) {
                            return aVar6;
                        }
                        Typeface typeface17 = typeface;
                        Typeface typeface18 = (Typeface) A3;
                        lg.e eVar8 = eg.m0.f9201a;
                        lg.d dVar7 = lg.d.f20063c;
                        ve.o oVar = new ve.o(qVar10, continuation, r8);
                        this.f3382d = typeface17;
                        this.f3383e = typeface18;
                        this.f3384f = qVar10;
                        this.f3381c = 3;
                        A4 = eg.c0.A(dVar7, oVar, this);
                        if (A4 == aVar6) {
                            return aVar6;
                        }
                        typeface2 = typeface17;
                        typeface3 = typeface18;
                        qVar = qVar10;
                        Intrinsics.checkNotNullExpressionValue(A4, "withContext(...)");
                        qVar.f24804s0 = (String) A4;
                        lg.e eVar9 = eg.m0.f9201a;
                        lg.d dVar8 = lg.d.f20063c;
                        ve.o oVar2 = new ve.o(qVar10, continuation, i15);
                        this.f3382d = typeface2;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 4;
                        A5 = eg.c0.A(dVar8, oVar2, this);
                        if (A5 != aVar6) {
                            return aVar6;
                        }
                        qVar2 = qVar10;
                        Intrinsics.checkNotNullExpressionValue(A5, "withContext(...)");
                        qVar2.f24806t0 = (String) A5;
                        lg.e eVar10 = eg.m0.f9201a;
                        lg.d dVar9 = lg.d.f20063c;
                        ve.o oVar3 = new ve.o(qVar10, continuation, i14);
                        this.f3382d = typeface2;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 5;
                        A6 = eg.c0.A(dVar9, oVar3, this);
                        if (A6 != aVar6) {
                            return aVar6;
                        }
                        qVar3 = qVar10;
                        Intrinsics.checkNotNullExpressionValue(A6, "withContext(...)");
                        qVar3.f24809u0 = (String) A6;
                        lg.e eVar11 = eg.m0.f9201a;
                        lg.d dVar10 = lg.d.f20063c;
                        ve.o oVar4 = new ve.o(qVar10, continuation, i13);
                        this.f3382d = typeface2;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 6;
                        A7 = eg.c0.A(dVar10, oVar4, this);
                        if (A7 != aVar6) {
                            return aVar6;
                        }
                        qVar4 = qVar10;
                        typeface4 = typeface2;
                        Intrinsics.checkNotNullExpressionValue(A7, "withContext(...)");
                        qVar4.f24812v0 = (String) A7;
                        lg.e eVar12 = eg.m0.f9201a;
                        lg.d dVar11 = lg.d.f20063c;
                        ve.o oVar5 = new ve.o(qVar10, continuation, i12);
                        this.f3382d = typeface4;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 7;
                        A8 = eg.c0.A(dVar11, oVar5, this);
                        if (A8 != aVar6) {
                            return aVar6;
                        }
                        qVar5 = qVar10;
                        Intrinsics.checkNotNullExpressionValue(A8, "withContext(...)");
                        qVar5.f24815w0 = (String) A8;
                        lg.e eVar13 = eg.m0.f9201a;
                        lg.d dVar12 = lg.d.f20063c;
                        ve.o oVar6 = new ve.o(qVar10, continuation, i11);
                        this.f3382d = typeface4;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 8;
                        A9 = eg.c0.A(dVar12, oVar6, this);
                        if (A9 != aVar6) {
                            return aVar6;
                        }
                        qVar6 = qVar10;
                        Intrinsics.checkNotNullExpressionValue(A9, "withContext(...)");
                        qVar6.x0 = (String) A9;
                        lg.e eVar14 = eg.m0.f9201a;
                        lg.d dVar13 = lg.d.f20063c;
                        ve.o oVar7 = new ve.o(qVar10, continuation, 6);
                        this.f3382d = typeface4;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 9;
                        A10 = eg.c0.A(dVar13, oVar7, this);
                        if (A10 != aVar6) {
                            return aVar6;
                        }
                        qVar7 = qVar10;
                        Intrinsics.checkNotNullExpressionValue(A10, "withContext(...)");
                        qVar7.f24820y0 = (String) A10;
                        lg.e eVar15 = eg.m0.f9201a;
                        lg.d dVar14 = lg.d.f20063c;
                        ve.o oVar8 = new ve.o(qVar10, continuation, 7);
                        this.f3382d = typeface4;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 10;
                        A11 = eg.c0.A(dVar14, oVar8, this);
                        if (A11 != aVar6) {
                            return aVar6;
                        }
                        qVar8 = qVar10;
                        Intrinsics.checkNotNullExpressionValue(A11, "withContext(...)");
                        qVar8.z0 = (String) A11;
                        lg.e eVar16 = eg.m0.f9201a;
                        lg.d dVar15 = lg.d.f20063c;
                        ve.o oVar9 = new ve.o(qVar10, continuation, 8);
                        this.f3382d = typeface4;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 11;
                        A12 = eg.c0.A(dVar15, oVar9, this);
                        if (A12 != aVar6) {
                            return aVar6;
                        }
                        qVar9 = qVar10;
                        typeface5 = typeface4;
                        Intrinsics.checkNotNullExpressionValue(A12, "withContext(...)");
                        qVar9.A0 = (String) A12;
                        qVar10.setArimBoldTypeface(typeface5);
                        qVar10.setArimoRegularTypeface(typeface3);
                        qVar10.requestLayout();
                        qVar10.invalidate();
                        qVar10.M1 = true;
                        return Unit.f19194a;
                    case 1:
                        h8.b.B(obj);
                        A2 = obj;
                        typeface = (Typeface) A2;
                        lg.e eVar72 = eg.m0.f9201a;
                        lg.d dVar62 = lg.d.f20063c;
                        ve.p pVar22 = new ve.p((qe.a) this.f3387i, continuation, r8);
                        this.f3382d = typeface;
                        this.f3381c = 2;
                        A3 = eg.c0.A(dVar62, pVar22, this);
                        if (A3 == aVar6) {
                        }
                        Typeface typeface172 = typeface;
                        Typeface typeface182 = (Typeface) A3;
                        lg.e eVar82 = eg.m0.f9201a;
                        lg.d dVar72 = lg.d.f20063c;
                        ve.o oVar10 = new ve.o(qVar10, continuation, r8);
                        this.f3382d = typeface172;
                        this.f3383e = typeface182;
                        this.f3384f = qVar10;
                        this.f3381c = 3;
                        A4 = eg.c0.A(dVar72, oVar10, this);
                        if (A4 == aVar6) {
                        }
                        break;
                    case 2:
                        typeface = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        A3 = obj;
                        Typeface typeface1722 = typeface;
                        Typeface typeface1822 = (Typeface) A3;
                        lg.e eVar822 = eg.m0.f9201a;
                        lg.d dVar722 = lg.d.f20063c;
                        ve.o oVar102 = new ve.o(qVar10, continuation, r8);
                        this.f3382d = typeface1722;
                        this.f3383e = typeface1822;
                        this.f3384f = qVar10;
                        this.f3381c = 3;
                        A4 = eg.c0.A(dVar722, oVar102, this);
                        if (A4 == aVar6) {
                        }
                        break;
                    case 3:
                        ve.q qVar11 = (ve.q) this.f3384f;
                        Typeface typeface19 = (Typeface) this.f3383e;
                        Typeface typeface20 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface2 = typeface20;
                        typeface3 = typeface19;
                        qVar = qVar11;
                        A4 = obj;
                        Intrinsics.checkNotNullExpressionValue(A4, "withContext(...)");
                        qVar.f24804s0 = (String) A4;
                        lg.e eVar92 = eg.m0.f9201a;
                        lg.d dVar82 = lg.d.f20063c;
                        ve.o oVar22 = new ve.o(qVar10, continuation, i15);
                        this.f3382d = typeface2;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 4;
                        A5 = eg.c0.A(dVar82, oVar22, this);
                        if (A5 != aVar6) {
                        }
                        break;
                    case 4:
                        ve.q qVar12 = (ve.q) this.f3384f;
                        Typeface typeface21 = (Typeface) this.f3383e;
                        Typeface typeface22 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface2 = typeface22;
                        typeface3 = typeface21;
                        qVar2 = qVar12;
                        A5 = obj;
                        Intrinsics.checkNotNullExpressionValue(A5, "withContext(...)");
                        qVar2.f24806t0 = (String) A5;
                        lg.e eVar102 = eg.m0.f9201a;
                        lg.d dVar92 = lg.d.f20063c;
                        ve.o oVar32 = new ve.o(qVar10, continuation, i14);
                        this.f3382d = typeface2;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 5;
                        A6 = eg.c0.A(dVar92, oVar32, this);
                        if (A6 != aVar6) {
                        }
                        break;
                    case 5:
                        ve.q qVar13 = (ve.q) this.f3384f;
                        Typeface typeface23 = (Typeface) this.f3383e;
                        Typeface typeface24 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface2 = typeface24;
                        typeface3 = typeface23;
                        qVar3 = qVar13;
                        A6 = obj;
                        Intrinsics.checkNotNullExpressionValue(A6, "withContext(...)");
                        qVar3.f24809u0 = (String) A6;
                        lg.e eVar112 = eg.m0.f9201a;
                        lg.d dVar102 = lg.d.f20063c;
                        ve.o oVar42 = new ve.o(qVar10, continuation, i13);
                        this.f3382d = typeface2;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 6;
                        A7 = eg.c0.A(dVar102, oVar42, this);
                        if (A7 != aVar6) {
                        }
                        break;
                    case 6:
                        ve.q qVar14 = (ve.q) this.f3384f;
                        Typeface typeface25 = (Typeface) this.f3383e;
                        typeface4 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface3 = typeface25;
                        qVar4 = qVar14;
                        A7 = obj;
                        Intrinsics.checkNotNullExpressionValue(A7, "withContext(...)");
                        qVar4.f24812v0 = (String) A7;
                        lg.e eVar122 = eg.m0.f9201a;
                        lg.d dVar112 = lg.d.f20063c;
                        ve.o oVar52 = new ve.o(qVar10, continuation, i12);
                        this.f3382d = typeface4;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 7;
                        A8 = eg.c0.A(dVar112, oVar52, this);
                        if (A8 != aVar6) {
                        }
                        break;
                    case 7:
                        ve.q qVar15 = (ve.q) this.f3384f;
                        Typeface typeface26 = (Typeface) this.f3383e;
                        typeface4 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface3 = typeface26;
                        qVar5 = qVar15;
                        A8 = obj;
                        Intrinsics.checkNotNullExpressionValue(A8, "withContext(...)");
                        qVar5.f24815w0 = (String) A8;
                        lg.e eVar132 = eg.m0.f9201a;
                        lg.d dVar122 = lg.d.f20063c;
                        ve.o oVar62 = new ve.o(qVar10, continuation, i11);
                        this.f3382d = typeface4;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 8;
                        A9 = eg.c0.A(dVar122, oVar62, this);
                        if (A9 != aVar6) {
                        }
                        break;
                    case 8:
                        ve.q qVar16 = (ve.q) this.f3384f;
                        Typeface typeface27 = (Typeface) this.f3383e;
                        typeface4 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface3 = typeface27;
                        qVar6 = qVar16;
                        A9 = obj;
                        Intrinsics.checkNotNullExpressionValue(A9, "withContext(...)");
                        qVar6.x0 = (String) A9;
                        lg.e eVar142 = eg.m0.f9201a;
                        lg.d dVar132 = lg.d.f20063c;
                        ve.o oVar72 = new ve.o(qVar10, continuation, 6);
                        this.f3382d = typeface4;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 9;
                        A10 = eg.c0.A(dVar132, oVar72, this);
                        if (A10 != aVar6) {
                        }
                        break;
                    case 9:
                        ve.q qVar17 = (ve.q) this.f3384f;
                        Typeface typeface28 = (Typeface) this.f3383e;
                        typeface4 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface3 = typeface28;
                        qVar7 = qVar17;
                        A10 = obj;
                        Intrinsics.checkNotNullExpressionValue(A10, "withContext(...)");
                        qVar7.f24820y0 = (String) A10;
                        lg.e eVar152 = eg.m0.f9201a;
                        lg.d dVar142 = lg.d.f20063c;
                        ve.o oVar82 = new ve.o(qVar10, continuation, 7);
                        this.f3382d = typeface4;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 10;
                        A11 = eg.c0.A(dVar142, oVar82, this);
                        if (A11 != aVar6) {
                        }
                        break;
                    case 10:
                        ve.q qVar18 = (ve.q) this.f3384f;
                        Typeface typeface29 = (Typeface) this.f3383e;
                        typeface4 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface3 = typeface29;
                        qVar8 = qVar18;
                        A11 = obj;
                        Intrinsics.checkNotNullExpressionValue(A11, "withContext(...)");
                        qVar8.z0 = (String) A11;
                        lg.e eVar162 = eg.m0.f9201a;
                        lg.d dVar152 = lg.d.f20063c;
                        ve.o oVar92 = new ve.o(qVar10, continuation, 8);
                        this.f3382d = typeface4;
                        this.f3383e = typeface3;
                        this.f3384f = qVar10;
                        this.f3381c = 11;
                        A12 = eg.c0.A(dVar152, oVar92, this);
                        if (A12 != aVar6) {
                        }
                        break;
                    case 11:
                        qVar9 = (ve.q) this.f3384f;
                        Typeface typeface30 = (Typeface) this.f3383e;
                        typeface5 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface3 = typeface30;
                        A12 = obj;
                        Intrinsics.checkNotNullExpressionValue(A12, "withContext(...)");
                        qVar9.A0 = (String) A12;
                        qVar10.setArimBoldTypeface(typeface5);
                        qVar10.setArimoRegularTypeface(typeface3);
                        qVar10.requestLayout();
                        qVar10.invalidate();
                        qVar10.M1 = true;
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            case 7:
                ve.u uVar4 = (ve.u) this.f3385g;
                lf.a aVar7 = lf.a.f20034a;
                int i24 = this.f3381c;
                if (i24 == 0) {
                    h8.b.B(obj);
                    lg.e eVar17 = eg.m0.f9201a;
                    lg.d dVar16 = lg.d.f20063c;
                    ve.p pVar3 = new ve.p((qe.a) this.f3386h, continuation, i15);
                    this.f3381c = 1;
                    A13 = eg.c0.A(dVar16, pVar3, this);
                    if (A13 == aVar7) {
                        return aVar7;
                    }
                } else if (i24 == 1) {
                    h8.b.B(obj);
                    A13 = obj;
                } else {
                    if (i24 != 2) {
                        if (i24 != 3) {
                            if (i24 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            uVar2 = (ve.u) this.f3384f;
                            Typeface typeface31 = (Typeface) this.f3383e;
                            Typeface typeface32 = (Typeface) this.f3382d;
                            h8.b.B(obj);
                            typeface8 = typeface32;
                            typeface7 = typeface31;
                            A16 = obj;
                            Intrinsics.checkNotNullExpressionValue(A16, "withContext(...)");
                            uVar2.T0 = (String) A16;
                            uVar4.setArimBoldTypeface(typeface8);
                            uVar4.setArimoRegularTypeface(typeface7);
                            uVar4.requestLayout();
                            uVar4.invalidate();
                            uVar4.c2 = true;
                            return Unit.f19194a;
                        }
                        uVar = (ve.u) this.f3384f;
                        typeface7 = (Typeface) this.f3383e;
                        Typeface typeface33 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface8 = typeface33;
                        A15 = obj;
                        Intrinsics.checkNotNullExpressionValue(A15, "withContext(...)");
                        uVar.U0 = (String) A15;
                        lg.e eVar18 = eg.m0.f9201a;
                        lg.d dVar17 = lg.d.f20063c;
                        ve.t tVar = new ve.t(uVar4, continuation, i15);
                        this.f3382d = typeface8;
                        this.f3383e = typeface7;
                        this.f3384f = uVar4;
                        this.f3381c = 4;
                        A16 = eg.c0.A(dVar17, tVar, this);
                        if (A16 != aVar7) {
                            return aVar7;
                        }
                        uVar2 = uVar4;
                        Intrinsics.checkNotNullExpressionValue(A16, "withContext(...)");
                        uVar2.T0 = (String) A16;
                        uVar4.setArimBoldTypeface(typeface8);
                        uVar4.setArimoRegularTypeface(typeface7);
                        uVar4.requestLayout();
                        uVar4.invalidate();
                        uVar4.c2 = true;
                        return Unit.f19194a;
                    }
                    typeface6 = (Typeface) this.f3382d;
                    h8.b.B(obj);
                    A14 = obj;
                    typeface7 = (Typeface) A14;
                    lg.e eVar19 = eg.m0.f9201a;
                    lg.d dVar18 = lg.d.f20063c;
                    ve.t tVar2 = new ve.t(uVar4, continuation, r8);
                    this.f3382d = typeface6;
                    this.f3383e = typeface7;
                    this.f3384f = uVar4;
                    this.f3381c = 3;
                    A15 = eg.c0.A(dVar18, tVar2, this);
                    if (A15 != aVar7) {
                        return aVar7;
                    }
                    typeface8 = typeface6;
                    uVar = uVar4;
                    Intrinsics.checkNotNullExpressionValue(A15, "withContext(...)");
                    uVar.U0 = (String) A15;
                    lg.e eVar182 = eg.m0.f9201a;
                    lg.d dVar172 = lg.d.f20063c;
                    ve.t tVar3 = new ve.t(uVar4, continuation, i15);
                    this.f3382d = typeface8;
                    this.f3383e = typeface7;
                    this.f3384f = uVar4;
                    this.f3381c = 4;
                    A16 = eg.c0.A(dVar172, tVar3, this);
                    if (A16 != aVar7) {
                    }
                }
                typeface6 = (Typeface) A13;
                lg.e eVar20 = eg.m0.f9201a;
                lg.d dVar19 = lg.d.f20063c;
                ve.p pVar4 = new ve.p((qe.a) this.f3387i, continuation, i14);
                this.f3382d = typeface6;
                this.f3381c = 2;
                A14 = eg.c0.A(dVar19, pVar4, this);
                if (A14 == aVar7) {
                    return aVar7;
                }
                typeface7 = (Typeface) A14;
                lg.e eVar192 = eg.m0.f9201a;
                lg.d dVar182 = lg.d.f20063c;
                ve.t tVar22 = new ve.t(uVar4, continuation, r8);
                this.f3382d = typeface6;
                this.f3383e = typeface7;
                this.f3384f = uVar4;
                this.f3381c = 3;
                A15 = eg.c0.A(dVar182, tVar22, this);
                if (A15 != aVar7) {
                }
            case 8:
                PredictionCard predictionCard2 = (PredictionCard) this.f3385g;
                TextPaint textPaint = predictionCard2.f7781w0;
                TextPaint textPaint2 = predictionCard2.f7779v0;
                lf.a aVar8 = lf.a.f20034a;
                int i25 = this.f3381c;
                if (i25 == 0) {
                    h8.b.B(obj);
                    lg.e eVar21 = eg.m0.f9201a;
                    lg.d dVar20 = lg.d.f20063c;
                    ve.p pVar5 = new ve.p((me.d) this.f3386h, continuation, 9);
                    this.f3381c = 1;
                    A17 = eg.c0.A(dVar20, pVar5, this);
                    if (A17 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i25 != 1) {
                        if (i25 != 2) {
                            if (i25 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            predictionCard = (PredictionCard) this.f3384f;
                            Typeface typeface34 = (Typeface) this.f3383e;
                            typeface9 = (Typeface) this.f3382d;
                            h8.b.B(obj);
                            typeface10 = typeface34;
                            A19 = obj;
                            Intrinsics.checkNotNullExpressionValue(A19, "withContext(...)");
                            predictionCard.f7746a = (String) A19;
                            predictionCard2.setArimoBoldTypeface(typeface10);
                            predictionCard2.setArimoRegularTypeface(typeface9);
                            predictionCard2.f7748c = textPaint2.measureText("00:00:00");
                            Paint.FontMetrics fontMetrics = textPaint2.getFontMetrics();
                            predictionCard2.f7749d = Math.abs(fontMetrics.top) + fontMetrics.bottom;
                            predictionCard2.f7750e = textPaint.measureText("12.12.2025   00:00");
                            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
                            predictionCard2.f7751f = Math.abs(fontMetrics2.top) + fontMetrics2.bottom;
                            predictionCard2.d();
                            predictionCard2.H0 = true;
                            return Unit.f19194a;
                        }
                        typeface9 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        A18 = obj;
                        typeface10 = (Typeface) A18;
                        lg.e eVar22 = eg.m0.f9201a;
                        lg.d dVar21 = lg.d.f20063c;
                        q4.r rVar = new q4.r(predictionCard2, continuation, 12);
                        this.f3382d = typeface9;
                        this.f3383e = typeface10;
                        this.f3384f = predictionCard2;
                        this.f3381c = 3;
                        A19 = eg.c0.A(dVar21, rVar, this);
                        if (A19 != aVar8) {
                            return aVar8;
                        }
                        predictionCard = predictionCard2;
                        Intrinsics.checkNotNullExpressionValue(A19, "withContext(...)");
                        predictionCard.f7746a = (String) A19;
                        predictionCard2.setArimoBoldTypeface(typeface10);
                        predictionCard2.setArimoRegularTypeface(typeface9);
                        predictionCard2.f7748c = textPaint2.measureText("00:00:00");
                        Paint.FontMetrics fontMetrics3 = textPaint2.getFontMetrics();
                        predictionCard2.f7749d = Math.abs(fontMetrics3.top) + fontMetrics3.bottom;
                        predictionCard2.f7750e = textPaint.measureText("12.12.2025   00:00");
                        Paint.FontMetrics fontMetrics22 = textPaint.getFontMetrics();
                        predictionCard2.f7751f = Math.abs(fontMetrics22.top) + fontMetrics22.bottom;
                        predictionCard2.d();
                        predictionCard2.H0 = true;
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A17 = obj;
                }
                typeface9 = (Typeface) A17;
                lg.e eVar23 = eg.m0.f9201a;
                lg.d dVar22 = lg.d.f20063c;
                ve.p pVar6 = new ve.p((me.d) this.f3387i, continuation, 8);
                this.f3382d = typeface9;
                this.f3381c = 2;
                A18 = eg.c0.A(dVar22, pVar6, this);
                if (A18 == aVar8) {
                    return aVar8;
                }
                typeface10 = (Typeface) A18;
                lg.e eVar222 = eg.m0.f9201a;
                lg.d dVar212 = lg.d.f20063c;
                q4.r rVar2 = new q4.r(predictionCard2, continuation, 12);
                this.f3382d = typeface9;
                this.f3383e = typeface10;
                this.f3384f = predictionCard2;
                this.f3381c = 3;
                A19 = eg.c0.A(dVar212, rVar2, this);
                if (A19 != aVar8) {
                }
            default:
                ve.f0 f0Var10 = (ve.f0) this.f3385g;
                lf.a aVar9 = lf.a.f20034a;
                switch (this.f3381c) {
                    case 0:
                        h8.b.B(obj);
                        lg.e eVar24 = eg.m0.f9201a;
                        lg.d dVar23 = lg.d.f20063c;
                        ve.p pVar7 = new ve.p((qe.a) this.f3386h, continuation, i10);
                        this.f3381c = 1;
                        A20 = eg.c0.A(dVar23, pVar7, this);
                        if (A20 == aVar9) {
                            return aVar9;
                        }
                        typeface11 = (Typeface) A20;
                        lg.e eVar25 = eg.m0.f9201a;
                        lg.d dVar24 = lg.d.f20063c;
                        ve.p pVar8 = new ve.p((qe.a) this.f3387i, continuation, i5);
                        this.f3382d = typeface11;
                        this.f3381c = 2;
                        A21 = eg.c0.A(dVar24, pVar8, this);
                        if (A21 == aVar9) {
                            return aVar9;
                        }
                        typeface12 = (Typeface) A21;
                        lg.e eVar26 = eg.m0.f9201a;
                        lg.d dVar25 = lg.d.f20063c;
                        ve.e0 e0Var = new ve.e0(f0Var10, continuation, r8);
                        this.f3382d = typeface11;
                        this.f3383e = typeface12;
                        this.f3384f = f0Var10;
                        this.f3381c = 3;
                        A22 = eg.c0.A(dVar25, e0Var, this);
                        if (A22 == aVar9) {
                            return aVar9;
                        }
                        typeface13 = typeface11;
                        f0Var = f0Var10;
                        Intrinsics.checkNotNullExpressionValue(A22, "withContext(...)");
                        f0Var.f24677v0 = (String) A22;
                        lg.e eVar27 = eg.m0.f9201a;
                        lg.d dVar26 = lg.d.f20063c;
                        ve.e0 e0Var2 = new ve.e0(f0Var10, continuation, i15);
                        this.f3382d = typeface13;
                        this.f3383e = typeface12;
                        this.f3384f = f0Var10;
                        this.f3381c = 4;
                        A23 = eg.c0.A(dVar26, e0Var2, this);
                        if (A23 != aVar9) {
                            return aVar9;
                        }
                        typeface14 = typeface12;
                        f0Var2 = f0Var10;
                        Intrinsics.checkNotNullExpressionValue(A23, "withContext(...)");
                        f0Var2.f24680w0 = (String) A23;
                        lg.e eVar28 = eg.m0.f9201a;
                        lg.d dVar27 = lg.d.f20063c;
                        ve.e0 e0Var3 = new ve.e0(f0Var10, continuation, i14);
                        this.f3382d = typeface13;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 5;
                        A24 = eg.c0.A(dVar27, e0Var3, this);
                        if (A24 != aVar9) {
                            return aVar9;
                        }
                        f0Var3 = f0Var10;
                        Intrinsics.checkNotNullExpressionValue(A24, "withContext(...)");
                        f0Var3.x0 = (String) A24;
                        lg.e eVar29 = eg.m0.f9201a;
                        lg.d dVar28 = lg.d.f20063c;
                        ve.e0 e0Var4 = new ve.e0(f0Var10, continuation, i13);
                        this.f3382d = typeface13;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 6;
                        A25 = eg.c0.A(dVar28, e0Var4, this);
                        if (A25 != aVar9) {
                            return aVar9;
                        }
                        f0Var4 = f0Var10;
                        typeface15 = typeface13;
                        Intrinsics.checkNotNullExpressionValue(A25, "withContext(...)");
                        f0Var4.f24685y0 = (String) A25;
                        lg.e eVar30 = eg.m0.f9201a;
                        lg.d dVar29 = lg.d.f20063c;
                        ve.e0 e0Var5 = new ve.e0(f0Var10, continuation, i12);
                        this.f3382d = typeface15;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 7;
                        A26 = eg.c0.A(dVar29, e0Var5, this);
                        if (A26 != aVar9) {
                            return aVar9;
                        }
                        f0Var5 = f0Var10;
                        Intrinsics.checkNotNullExpressionValue(A26, "withContext(...)");
                        f0Var5.z0 = (String) A26;
                        lg.e eVar31 = eg.m0.f9201a;
                        lg.d dVar30 = lg.d.f20063c;
                        ve.e0 e0Var6 = new ve.e0(f0Var10, continuation, i11);
                        this.f3382d = typeface15;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 8;
                        A27 = eg.c0.A(dVar30, e0Var6, this);
                        if (A27 != aVar9) {
                            return aVar9;
                        }
                        f0Var6 = f0Var10;
                        Intrinsics.checkNotNullExpressionValue(A27, "withContext(...)");
                        f0Var6.A0 = (String) A27;
                        lg.e eVar32 = eg.m0.f9201a;
                        lg.d dVar31 = lg.d.f20063c;
                        ve.e0 e0Var7 = new ve.e0(f0Var10, continuation, 6);
                        this.f3382d = typeface15;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 9;
                        A28 = eg.c0.A(dVar31, e0Var7, this);
                        if (A28 != aVar9) {
                            return aVar9;
                        }
                        f0Var7 = f0Var10;
                        Intrinsics.checkNotNullExpressionValue(A28, "withContext(...)");
                        f0Var7.B0 = (String) A28;
                        lg.e eVar33 = eg.m0.f9201a;
                        lg.d dVar32 = lg.d.f20063c;
                        ve.e0 e0Var8 = new ve.e0(f0Var10, continuation, 7);
                        this.f3382d = typeface15;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 10;
                        A29 = eg.c0.A(dVar32, e0Var8, this);
                        if (A29 != aVar9) {
                            return aVar9;
                        }
                        f0Var8 = f0Var10;
                        Intrinsics.checkNotNullExpressionValue(A29, "withContext(...)");
                        f0Var8.C0 = (String) A29;
                        lg.e eVar34 = eg.m0.f9201a;
                        lg.d dVar33 = lg.d.f20063c;
                        ve.e0 e0Var9 = new ve.e0(f0Var10, continuation, 8);
                        this.f3382d = typeface15;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 11;
                        A30 = eg.c0.A(dVar33, e0Var9, this);
                        if (A30 != aVar9) {
                            return aVar9;
                        }
                        f0Var9 = f0Var10;
                        typeface16 = typeface15;
                        Intrinsics.checkNotNullExpressionValue(A30, "withContext(...)");
                        f0Var9.D0 = (String) A30;
                        f0Var10.setArimBoldTypeface(typeface16);
                        f0Var10.setArimoRegularTypeface(typeface14);
                        f0Var10.requestLayout();
                        f0Var10.invalidate();
                        f0Var10.R1 = true;
                        return Unit.f19194a;
                    case 1:
                        h8.b.B(obj);
                        A20 = obj;
                        typeface11 = (Typeface) A20;
                        lg.e eVar252 = eg.m0.f9201a;
                        lg.d dVar242 = lg.d.f20063c;
                        ve.p pVar82 = new ve.p((qe.a) this.f3387i, continuation, i5);
                        this.f3382d = typeface11;
                        this.f3381c = 2;
                        A21 = eg.c0.A(dVar242, pVar82, this);
                        if (A21 == aVar9) {
                        }
                        typeface12 = (Typeface) A21;
                        lg.e eVar262 = eg.m0.f9201a;
                        lg.d dVar252 = lg.d.f20063c;
                        ve.e0 e0Var10 = new ve.e0(f0Var10, continuation, r8);
                        this.f3382d = typeface11;
                        this.f3383e = typeface12;
                        this.f3384f = f0Var10;
                        this.f3381c = 3;
                        A22 = eg.c0.A(dVar252, e0Var10, this);
                        if (A22 == aVar9) {
                        }
                        break;
                    case 2:
                        typeface11 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        A21 = obj;
                        typeface12 = (Typeface) A21;
                        lg.e eVar2622 = eg.m0.f9201a;
                        lg.d dVar2522 = lg.d.f20063c;
                        ve.e0 e0Var102 = new ve.e0(f0Var10, continuation, r8);
                        this.f3382d = typeface11;
                        this.f3383e = typeface12;
                        this.f3384f = f0Var10;
                        this.f3381c = 3;
                        A22 = eg.c0.A(dVar2522, e0Var102, this);
                        if (A22 == aVar9) {
                        }
                        break;
                    case 3:
                        f0Var = (ve.f0) this.f3384f;
                        typeface12 = (Typeface) this.f3383e;
                        typeface13 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        A22 = obj;
                        Intrinsics.checkNotNullExpressionValue(A22, "withContext(...)");
                        f0Var.f24677v0 = (String) A22;
                        lg.e eVar272 = eg.m0.f9201a;
                        lg.d dVar262 = lg.d.f20063c;
                        ve.e0 e0Var22 = new ve.e0(f0Var10, continuation, i15);
                        this.f3382d = typeface13;
                        this.f3383e = typeface12;
                        this.f3384f = f0Var10;
                        this.f3381c = 4;
                        A23 = eg.c0.A(dVar262, e0Var22, this);
                        if (A23 != aVar9) {
                        }
                        break;
                    case 4:
                        ve.f0 f0Var11 = (ve.f0) this.f3384f;
                        Typeface typeface35 = (Typeface) this.f3383e;
                        typeface13 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface14 = typeface35;
                        f0Var2 = f0Var11;
                        A23 = obj;
                        Intrinsics.checkNotNullExpressionValue(A23, "withContext(...)");
                        f0Var2.f24680w0 = (String) A23;
                        lg.e eVar282 = eg.m0.f9201a;
                        lg.d dVar272 = lg.d.f20063c;
                        ve.e0 e0Var32 = new ve.e0(f0Var10, continuation, i14);
                        this.f3382d = typeface13;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 5;
                        A24 = eg.c0.A(dVar272, e0Var32, this);
                        if (A24 != aVar9) {
                        }
                        break;
                    case 5:
                        ve.f0 f0Var12 = (ve.f0) this.f3384f;
                        Typeface typeface36 = (Typeface) this.f3383e;
                        typeface13 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface14 = typeface36;
                        f0Var3 = f0Var12;
                        A24 = obj;
                        Intrinsics.checkNotNullExpressionValue(A24, "withContext(...)");
                        f0Var3.x0 = (String) A24;
                        lg.e eVar292 = eg.m0.f9201a;
                        lg.d dVar282 = lg.d.f20063c;
                        ve.e0 e0Var42 = new ve.e0(f0Var10, continuation, i13);
                        this.f3382d = typeface13;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 6;
                        A25 = eg.c0.A(dVar282, e0Var42, this);
                        if (A25 != aVar9) {
                        }
                        break;
                    case 6:
                        ve.f0 f0Var13 = (ve.f0) this.f3384f;
                        Typeface typeface37 = (Typeface) this.f3383e;
                        typeface15 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface14 = typeface37;
                        f0Var4 = f0Var13;
                        A25 = obj;
                        Intrinsics.checkNotNullExpressionValue(A25, "withContext(...)");
                        f0Var4.f24685y0 = (String) A25;
                        lg.e eVar302 = eg.m0.f9201a;
                        lg.d dVar292 = lg.d.f20063c;
                        ve.e0 e0Var52 = new ve.e0(f0Var10, continuation, i12);
                        this.f3382d = typeface15;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 7;
                        A26 = eg.c0.A(dVar292, e0Var52, this);
                        if (A26 != aVar9) {
                        }
                        break;
                    case 7:
                        ve.f0 f0Var14 = (ve.f0) this.f3384f;
                        Typeface typeface38 = (Typeface) this.f3383e;
                        typeface15 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface14 = typeface38;
                        f0Var5 = f0Var14;
                        A26 = obj;
                        Intrinsics.checkNotNullExpressionValue(A26, "withContext(...)");
                        f0Var5.z0 = (String) A26;
                        lg.e eVar312 = eg.m0.f9201a;
                        lg.d dVar302 = lg.d.f20063c;
                        ve.e0 e0Var62 = new ve.e0(f0Var10, continuation, i11);
                        this.f3382d = typeface15;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 8;
                        A27 = eg.c0.A(dVar302, e0Var62, this);
                        if (A27 != aVar9) {
                        }
                        break;
                    case 8:
                        ve.f0 f0Var15 = (ve.f0) this.f3384f;
                        Typeface typeface39 = (Typeface) this.f3383e;
                        typeface15 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface14 = typeface39;
                        f0Var6 = f0Var15;
                        A27 = obj;
                        Intrinsics.checkNotNullExpressionValue(A27, "withContext(...)");
                        f0Var6.A0 = (String) A27;
                        lg.e eVar322 = eg.m0.f9201a;
                        lg.d dVar312 = lg.d.f20063c;
                        ve.e0 e0Var72 = new ve.e0(f0Var10, continuation, 6);
                        this.f3382d = typeface15;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 9;
                        A28 = eg.c0.A(dVar312, e0Var72, this);
                        if (A28 != aVar9) {
                        }
                        break;
                    case 9:
                        ve.f0 f0Var16 = (ve.f0) this.f3384f;
                        Typeface typeface40 = (Typeface) this.f3383e;
                        typeface15 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface14 = typeface40;
                        f0Var7 = f0Var16;
                        A28 = obj;
                        Intrinsics.checkNotNullExpressionValue(A28, "withContext(...)");
                        f0Var7.B0 = (String) A28;
                        lg.e eVar332 = eg.m0.f9201a;
                        lg.d dVar322 = lg.d.f20063c;
                        ve.e0 e0Var82 = new ve.e0(f0Var10, continuation, 7);
                        this.f3382d = typeface15;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 10;
                        A29 = eg.c0.A(dVar322, e0Var82, this);
                        if (A29 != aVar9) {
                        }
                        break;
                    case 10:
                        ve.f0 f0Var17 = (ve.f0) this.f3384f;
                        Typeface typeface41 = (Typeface) this.f3383e;
                        typeface15 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface14 = typeface41;
                        f0Var8 = f0Var17;
                        A29 = obj;
                        Intrinsics.checkNotNullExpressionValue(A29, "withContext(...)");
                        f0Var8.C0 = (String) A29;
                        lg.e eVar342 = eg.m0.f9201a;
                        lg.d dVar332 = lg.d.f20063c;
                        ve.e0 e0Var92 = new ve.e0(f0Var10, continuation, 8);
                        this.f3382d = typeface15;
                        this.f3383e = typeface14;
                        this.f3384f = f0Var10;
                        this.f3381c = 11;
                        A30 = eg.c0.A(dVar332, e0Var92, this);
                        if (A30 != aVar9) {
                        }
                        break;
                    case 11:
                        f0Var9 = (ve.f0) this.f3384f;
                        Typeface typeface42 = (Typeface) this.f3383e;
                        typeface16 = (Typeface) this.f3382d;
                        h8.b.B(obj);
                        typeface14 = typeface42;
                        A30 = obj;
                        Intrinsics.checkNotNullExpressionValue(A30, "withContext(...)");
                        f0Var9.D0 = (String) A30;
                        f0Var10.setArimBoldTypeface(typeface16);
                        f0Var10.setArimoRegularTypeface(typeface14);
                        f0Var10.requestLayout();
                        f0Var10.invalidate();
                        f0Var10.R1 = true;
                        return Unit.f19194a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Continuation continuation, int i5) {
        super(2, continuation);
        this.f3380b = i5;
        this.f3385g = obj;
        this.f3386h = obj2;
        this.f3387i = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f3380b = 0;
        this.f3386h = list;
        this.f3387i = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, List list2, List list3, me.c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.f3380b = 3;
        this.f3386h = list;
        this.f3383e = list2;
        this.f3385g = list3;
        this.f3387i = c0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(la.s0 s0Var, String str, String str2, String str3, String str4, Integer num, Continuation continuation) {
        super(2, continuation);
        this.f3380b = 1;
        this.f3382d = s0Var;
        this.f3383e = str;
        this.f3384f = str2;
        this.f3385g = str3;
        this.f3386h = str4;
        this.f3387i = num;
    }
}
