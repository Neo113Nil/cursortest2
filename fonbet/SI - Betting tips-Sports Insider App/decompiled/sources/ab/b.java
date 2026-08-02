package ab;

import android.graphics.Typeface;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.fragment.app.p0;
import androidx.lifecycle.g0;
import androidx.lifecycle.w;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k1;
import c1.c1;
import cd.p;
import cd.q;
import cd.r;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.news.fragment.NewsFragment;
import com.sports.insider.ui.onboarding.IdentifyFragment;
import com.sports.insider.ui.onboarding.NoEthernetFragment;
import com.sports.insider.ui.onboarding.SportInsiderFragment;
import com.sports.insider.ui.pays.LivePayFragment;
import com.sports.insider.ui.pays.PayExpressFragment;
import com.sports.insider.ui.pays.PayPremiumFragment;
import com.sports.insider.ui.pays.VipAccessFragment;
import com.sports.insider.ui.views.CustomButton;
import com.sports.insider.ui.views.ProfitView;
import com.sports.insider.ui.views.ProfitViewV2;
import ec.d0;
import eg.a0;
import eg.m0;
import eg.x1;
import eg.z0;
import f1.k;
import f3.x;
import ge.s;
import h2.c;
import hg.t0;
import io.appmetrica.analytics.impl.C0122e9;
import j$.time.Instant;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.v;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import le.d1;
import le.f2;
import le.h;
import lg.e;
import m2.f0;
import md.m;
import me.c0;
import mf.i;
import nc.f;
import org.json.JSONArray;
import org.json.JSONObject;
import pc.u;
import rc.b0;
import y8.d;
import zg.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f119b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f120c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f119b = i5;
        this.f120c = obj;
        this.f121d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v55, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f119b) {
            case 0:
                return new b((x) this.f120c, (String) this.f121d, continuation, 0);
            case 1:
                b bVar = new b((z) this.f121d, continuation, 1);
                bVar.f120c = obj;
                return bVar;
            case 2:
                b bVar2 = new b((c1) this.f121d, continuation, 2);
                bVar2.f120c = obj;
                return bVar2;
            case 3:
                return new b((ArrayList) this.f120c, (cd.b) this.f121d, continuation, 3);
            case 4:
                b bVar3 = new b((MyApp) this.f121d, continuation, 4);
                bVar3.f120c = obj;
                return bVar3;
            case 5:
                return new b((w) this.f120c, (MyApp) this.f121d, continuation, 5);
            case 6:
                b bVar4 = new b((Function0) this.f121d, continuation, 6);
                bVar4.f120c = obj;
                return bVar4;
            case 7:
                b bVar5 = new b((Set) this.f121d, continuation, 7);
                bVar5.f120c = obj;
                return bVar5;
            case 8:
                b bVar6 = new b((s) this.f121d, continuation, 8);
                bVar6.f120c = obj;
                return bVar6;
            case 9:
                b bVar7 = new b((c) this.f121d, continuation, 9);
                bVar7.f120c = obj;
                return bVar7;
            case 10:
                return new b((id.c) this.f120c, (List) this.f121d, continuation, 10);
            case 11:
                return new b((id.x) this.f120c, (p0) this.f121d, continuation, 11);
            case 12:
                return new b((NewsFragment) this.f120c, (Parcelable) this.f121d, continuation, 12);
            case 13:
                return new b((d) this.f120c, (String) this.f121d, continuation, 13);
            case 14:
                return new b((List) this.f120c, (List) this.f121d, continuation, 14);
            case 15:
                b bVar8 = new b((IdentifyFragment) this.f121d, continuation, 15);
                bVar8.f120c = obj;
                return bVar8;
            case 16:
                return new b((NoEthernetFragment) this.f120c, (Typeface) this.f121d, continuation, 16);
            case 17:
                b bVar9 = new b((SportInsiderFragment) this.f121d, continuation, 17);
                bVar9.f120c = obj;
                return bVar9;
            case 18:
                return new b((h) this.f120c, (f) this.f121d, continuation, 18);
            case 19:
                return new b((LivePayFragment) this.f120c, (Pair) this.f121d, continuation, 19);
            case 20:
                return new b((PayExpressFragment) this.f120c, (Pair) this.f121d, continuation, 20);
            case 21:
                b bVar10 = new b((d1) this.f121d, continuation, 21);
                bVar10.f120c = obj;
                return bVar10;
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new b((PayPremiumFragment) this.f120c, (Pair) this.f121d, continuation, 22);
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new b((Boolean) this.f120c, (PayPremiumFragment) this.f121d, continuation, 23);
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                b bVar11 = new b((f2) this.f121d, continuation, 24);
                bVar11.f120c = obj;
                return bVar11;
            case C0122e9.F /* 25 */:
                return new b((VipAccessFragment) this.f120c, (Pair) this.f121d, continuation, 25);
            case C0122e9.G /* 26 */:
                return new b((VipAccessFragment) this.f120c, (Typeface) this.f121d, continuation, 26);
            case C0122e9.H /* 27 */:
                b bVar12 = new b((i) this.f121d, continuation);
                bVar12.f120c = obj;
                return bVar12;
            case 28:
                return new b((String) this.f121d, (m) this.f120c, continuation);
            default:
                b bVar13 = new b((c0) this.f121d, continuation, 29);
                bVar13.f120c = obj;
                return bVar13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f119b) {
            case 0:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 1:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 2:
                return ((b) create((c1) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 3:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 4:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 5:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 6:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 7:
                return ((b) create((g1.a) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 8:
                return ((b) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 9:
                ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
                throw null;
            case 10:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 11:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 12:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 13:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 14:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 15:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 16:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 17:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 18:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 19:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 20:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 21:
                return ((b) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return ((b) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case C0122e9.F /* 25 */:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case C0122e9.G /* 26 */:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case C0122e9.H /* 27 */:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 28:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((b) create((eg.z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.android.billingclient.api.d] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long epochSecond;
        int i5;
        RecyclerView recyclerView;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        ProfitViewV2 profitViewV2;
        ProfitView profitView;
        ProfitView profitView2;
        ProfitView profitView3;
        CustomButton customButton;
        TextView textView5;
        TextView textView6;
        File file;
        long j;
        int i10 = 3;
        long j6 = 0;
        boolean z5 = false;
        r8 = false;
        r8 = false;
        boolean z7 = false;
        int i11 = 0;
        r8 = false;
        boolean z10 = false;
        z5 = false;
        int i12 = 1;
        ?? r11 = 0;
        switch (this.f119b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                h8.b.B(obj);
                x.e0().c((String) this.f121d);
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                h8.b.B(obj);
                eg.z zVar = (eg.z) this.f120c;
                z zVar2 = (z) this.f121d;
                y yVar = zVar2.f2260a;
                if (((g0) yVar).f2169d.compareTo(androidx.lifecycle.x.f2254b) >= 0) {
                    yVar.a(zVar2);
                } else {
                    eg.c0.h(zVar.C());
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                h8.b.B(obj);
                c1 c1Var = (c1) this.f120c;
                if ((c1Var instanceof c1.d) && ((c1.d) c1Var).f3348a <= ((c1.d) ((c1) this.f121d)).f3348a) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 3:
                lf.a aVar4 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    JSONArray jSONArray = rh.g.f22531e;
                    int length = jSONArray != null ? jSONArray.length() : 0;
                    if (length > 0) {
                        IntRange intRange = new IntRange(0, length, 1);
                        ArrayList arrayList = (ArrayList) this.f120c;
                        cd.b bVar = (cd.b) this.f121d;
                        Iterator it = intRange.iterator();
                        while (((zf.b) it).f25972c) {
                            int nextInt = ((i0) it).nextInt();
                            JSONArray jSONArray2 = rh.g.f22531e;
                            Object obj2 = jSONArray2 != null ? jSONArray2.get(nextInt) : null;
                            JSONObject jSONObject = obj2 instanceof JSONObject ? (JSONObject) obj2 : null;
                            if (CollectionsKt.A(arrayList, jSONObject != null ? jSONObject.getString("product") : null)) {
                                bVar.n("buyAfterAnnouncement", String.valueOf(jSONObject));
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                return Unit.f19194a;
            case 4:
                eg.z zVar3 = (eg.z) this.f120c;
                lf.a aVar5 = lf.a.f20034a;
                h8.b.B(obj);
                e eVar = m0.f9201a;
                lg.d dVar = lg.d.f20063c;
                eg.y yVar2 = new eg.y("initLocaleLanguage");
                dVar.getClass();
                eg.c0.e(zVar3, kotlin.coroutines.e.c(dVar, yVar2), new ad.a((MyApp) this.f121d, r11, i10), 2);
                return Unit.f19194a;
            case 5:
                lf.a aVar6 = lf.a.f20034a;
                h8.b.B(obj);
                w wVar = (w) this.f120c;
                if (wVar == w.ON_START || wVar == w.ON_STOP) {
                    r rVar = (r) ((MyApp) this.f121d).f6832a.getValue();
                    boolean z11 = ((w) this.f120c) == w.ON_STOP;
                    rVar.getClass();
                    Continuation continuation = null;
                    try {
                        epochSecond = Instant.now().getEpochSecond();
                    } catch (Exception e7) {
                        e = e7;
                    }
                    try {
                        long epochMilli = Instant.now().toEpochMilli();
                        if (z11) {
                            long j10 = epochMilli - r.f3804d;
                            if (j10 < 0) {
                                j10 = 0;
                            }
                            if (j10 > 0) {
                                try {
                                    q qVar = (q) y3.m(q.class, null, 6);
                                    eg.z zVar4 = qVar.f3802b;
                                    e eVar2 = m0.f9201a;
                                    eg.c0.t(zVar4, lg.d.f20063c, null, new p(qVar, j10, null), 2);
                                } catch (Exception unused2) {
                                }
                            }
                        } else {
                            r.f3804d += epochMilli;
                        }
                        rVar.g(z11 ? "StopSession" : "StartSession", String.valueOf(epochSecond));
                    } catch (Exception e9) {
                        e = e9;
                        j6 = epochSecond;
                        Exception ex = e;
                        io.sentry.e eVar3 = new io.sentry.e("params: " + j6 + ", " + z11);
                        Intrinsics.checkNotNullParameter(ex, "ex");
                        jg.d dVar2 = MyApp.f6830c;
                        e eVar4 = m0.f9201a;
                        eg.c0.t(dVar2, lg.d.f20063c, null, new ge.f((Object) ex, (Comparable) eVar3, "addEventSession", continuation, 18), 2);
                        return Unit.f19194a;
                    }
                }
                return Unit.f19194a;
            case 6:
                lf.a aVar7 = lf.a.f20034a;
                h8.b.B(obj);
                CoroutineContext C = ((eg.z) this.f120c).C();
                Function0 function0 = (Function0) this.f121d;
                try {
                    x1 x1Var = new x1();
                    x1Var.f9240f = eg.c0.r(eg.c0.o(C), x1Var);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = x1.f9238g;
                    try {
                        do {
                            i5 = atomicIntegerFieldUpdater.get(x1Var);
                            if (i5 != 0) {
                                if (i5 != 2 && i5 != 3) {
                                    x1.n(i5);
                                    throw null;
                                }
                            }
                            return function0.invoke();
                        } while (!atomicIntegerFieldUpdater.compareAndSet(x1Var, i5, 0));
                        return function0.invoke();
                    } finally {
                        x1Var.m();
                    }
                } catch (InterruptedException e10) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
                }
            case 7:
                lf.a aVar8 = lf.a.f20034a;
                h8.b.B(obj);
                Set keySet = ((g1.a) this.f120c).a().keySet();
                ArrayList arrayList2 = new ArrayList(v.k(keySet, 10));
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((g1.c) it2.next()).f9707a);
                }
                Set set = (Set) this.f121d;
                if (set != k.f9316a) {
                    if (set == null || !set.isEmpty()) {
                        Iterator it3 = set.iterator();
                        while (it3.hasNext()) {
                            if (!arrayList2.contains((String) it3.next())) {
                            }
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                z10 = true;
                return Boolean.valueOf(z10);
            case 8:
                List list = (List) this.f120c;
                lf.a aVar9 = lf.a.f20034a;
                h8.b.B(obj);
                s sVar = (s) this.f121d;
                sVar.f9997f.j(list);
                hg.d1 d1Var = sVar.f9998g;
                Boolean valueOf = Boolean.valueOf(list.isEmpty());
                d1Var.getClass();
                d1Var.k(null, valueOf);
                return Unit.f19194a;
            case 9:
                lf.a aVar10 = lf.a.f20034a;
                h8.b.B(obj);
                throw null;
            case 10:
                lf.a aVar11 = lf.a.f20034a;
                h8.b.B(obj);
                id.x xVar = (id.x) ((id.c) this.f120c).f11146a.getValue();
                List list2 = (List) this.f121d;
                xVar.getClass();
                List f6 = id.x.f(list2);
                Iterator it4 = f6.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        i11 = -1;
                    } else if (!((ja.c) it4.next()).a()) {
                        i11++;
                    }
                }
                ArrayList X = CollectionsKt.X(f6);
                if (i11 > -1) {
                    X.add(i11, new hc.a());
                }
                return CollectionsKt.W(X);
            case 11:
                lf.a aVar12 = lf.a.f20034a;
                h8.b.B(obj);
                u uVar = (u) y3.m(u.class, null, 6);
                p0 activity = (p0) this.f121d;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                yb.i n9 = u.n();
                n9.getClass();
                Intrinsics.checkNotNullParameter(activity, "activity");
                com.android.billingclient.api.d dVar3 = yb.i.f25817e;
                if (dVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                    dVar3 = null;
                }
                if (dVar3.f("bbb").f4037a == 0) {
                    com.android.billingclient.api.d dVar4 = yb.i.f25817e;
                    if (dVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                    } else {
                        r11 = dVar4;
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.add(2);
                    r11.i(activity, new com.android.billingclient.api.m(hashSet), new io.sentry.android.core.internal.gestures.c(23, n9));
                }
                return Unit.f19194a;
            case 12:
                lf.a aVar13 = lf.a.f20034a;
                h8.b.B(obj);
                ec.e eVar5 = (ec.e) ((NewsFragment) this.f120c).f22459a;
                k1 layoutManager = (eVar5 == null || (recyclerView = eVar5.f8930b) == null) ? null : recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.onRestoreInstanceState((Parcelable) this.f121d);
                }
                return Unit.f19194a;
            case 13:
                lf.a aVar14 = lf.a.f20034a;
                h8.b.B(obj);
                fa.a c2 = d.c((d) this.f120c);
                String pushToken = (String) this.f121d;
                c2.d("fbToken", pushToken);
                ed.b bVar2 = new ed.b();
                Intrinsics.checkNotNullParameter(pushToken, "pushToken");
                eg.c0.t(MyApp.f6830c, b0.b(), null, new androidx.lifecycle.c(bVar2, pushToken, (Continuation) r11, 11), 2);
                return Unit.f19194a;
            case 14:
                lf.a aVar15 = lf.a.f20034a;
                h8.b.B(obj);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll((List) this.f120c);
                arrayList3.addAll((List) this.f121d);
                return CollectionsKt.W(arrayList3);
            case 15:
                eg.z zVar5 = (eg.z) this.f120c;
                lf.a aVar16 = lf.a.f20034a;
                h8.b.B(obj);
                eg.c0.t(zVar5, new eg.y("NavigationCoroutine"), null, new ke.h((IdentifyFragment) this.f121d, r11, i12), 2);
                return Unit.f19194a;
            case 16:
                Typeface typeface = (Typeface) this.f121d;
                lf.a aVar17 = lf.a.f20034a;
                h8.b.B(obj);
                NoEthernetFragment noEthernetFragment = (NoEthernetFragment) this.f120c;
                ec.u uVar2 = (ec.u) noEthernetFragment.f22459a;
                if (uVar2 != null && (textView4 = uVar2.f9016k) != null) {
                    textView4.setTypeface(typeface);
                }
                ec.u uVar3 = (ec.u) noEthernetFragment.f22459a;
                if (uVar3 != null && (textView3 = uVar3.f9017l) != null) {
                    textView3.setTypeface(typeface);
                }
                ec.u uVar4 = (ec.u) noEthernetFragment.f22459a;
                if (uVar4 != null && (textView2 = uVar4.f9013g) != null) {
                    textView2.setTypeface(typeface);
                }
                ec.u uVar5 = (ec.u) noEthernetFragment.f22459a;
                if (uVar5 != null && (textView = uVar5.j) != null) {
                    textView.setTypeface(typeface);
                }
                return Unit.f19194a;
            case 17:
                eg.z zVar6 = (eg.z) this.f120c;
                lf.a aVar18 = lf.a.f20034a;
                h8.b.B(obj);
                eg.c0.t(zVar6, new eg.y("NavigationCoroutine"), null, new ke.u((SportInsiderFragment) this.f121d, r11, i12), 2);
                return Unit.f19194a;
            case 18:
                lf.a aVar19 = lf.a.f20034a;
                h8.b.B(obj);
                h hVar = (h) this.f120c;
                f fVar = (f) this.f121d;
                hVar.f19806p = fVar != null ? fVar.productId() : null;
                hVar.f19807r = fVar != null ? fVar.planId() : null;
                hVar.f19809t = fVar != null ? fVar.offerId() : null;
                hVar.q = fVar != null ? fVar.productIdStrike() : null;
                hVar.f19808s = fVar != null ? fVar.planIdStrike() : null;
                hVar.f19810u = fVar != null ? fVar.offerIdStrike() : null;
                return Unit.f19194a;
            case 19:
                lf.a aVar20 = lf.a.f20034a;
                h8.b.B(obj);
                ec.c0 c0Var = (ec.c0) ((LivePayFragment) this.f120c).f22459a;
                if (c0Var == null || (profitViewV2 = c0Var.f8891g) == null) {
                    return null;
                }
                profitViewV2.setProfitLists((Pair) this.f121d);
                return Unit.f19194a;
            case 20:
                lf.a aVar21 = lf.a.f20034a;
                h8.b.B(obj);
                ec.v vVar = (ec.v) ((PayExpressFragment) this.f120c).f22459a;
                if (vVar == null || (profitView = vVar.f9025h) == null) {
                    return null;
                }
                profitView.setListProfit((Pair) this.f121d);
                return Unit.f19194a;
            case 21:
                String str = (String) this.f120c;
                lf.a aVar22 = lf.a.f20034a;
                h8.b.B(obj);
                ((d1) this.f121d).J.h(str);
                return Unit.f19194a;
            case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                lf.a aVar23 = lf.a.f20034a;
                h8.b.B(obj);
                ec.w wVar2 = (ec.w) ((PayPremiumFragment) this.f120c).f22459a;
                if (wVar2 == null || (profitView2 = wVar2.f9036h) == null) {
                    return null;
                }
                profitView2.setListProfit((Pair) this.f121d);
                return Unit.f19194a;
            case g.ISCRASH_FIELD_NUMBER /* 23 */:
                PayPremiumFragment payPremiumFragment = (PayPremiumFragment) this.f121d;
                lf.a aVar24 = lf.a.f20034a;
                h8.b.B(obj);
                if (Intrinsics.areEqual((Boolean) this.f120c, Boolean.TRUE)) {
                    ((zc.k) payPremiumFragment.H().f19769f.f25125h.getValue()).getClass();
                    return zc.k.h(R.string.btn_text_subscribe);
                }
                ((zc.k) payPremiumFragment.H().f19769f.f25125h.getValue()).getClass();
                return zc.k.h(R.string.GetForecast);
            case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                String str2 = (String) this.f120c;
                lf.a aVar25 = lf.a.f20034a;
                h8.b.B(obj);
                ((f2) this.f121d).K.h(str2);
                return Unit.f19194a;
            case C0122e9.F /* 25 */:
                lf.a aVar26 = lf.a.f20034a;
                h8.b.B(obj);
                d0 d0Var = (d0) ((VipAccessFragment) this.f120c).f22459a;
                if (d0Var == null || (profitView3 = d0Var.f8925h) == null) {
                    return null;
                }
                profitView3.setListProfit((Pair) this.f121d);
                return Unit.f19194a;
            case C0122e9.G /* 26 */:
                Typeface typeface2 = (Typeface) this.f121d;
                lf.a aVar27 = lf.a.f20034a;
                h8.b.B(obj);
                VipAccessFragment vipAccessFragment = (VipAccessFragment) this.f120c;
                d0 d0Var2 = (d0) vipAccessFragment.f22459a;
                if (d0Var2 != null && (textView6 = d0Var2.f8928l) != null) {
                    textView6.setTypeface(typeface2);
                }
                d0 d0Var3 = (d0) vipAccessFragment.f22459a;
                if (d0Var3 != null && (textView5 = d0Var3.f8927k) != null) {
                    textView5.setTypeface(typeface2);
                }
                d0 d0Var4 = (d0) vipAccessFragment.f22459a;
                if (d0Var4 == null || (customButton = d0Var4.f8923f) == null) {
                    return null;
                }
                customButton.setButtonTypeface(typeface2);
                return Unit.f19194a;
            case C0122e9.H /* 27 */:
                lf.a aVar28 = lf.a.f20034a;
                h8.b.B(obj);
                CoroutineContext.Element r5 = ((eg.z) this.f120c).C().r(kotlin.coroutines.d.f19226f0);
                Intrinsics.checkNotNull(r5);
                kotlin.coroutines.d dVar5 = (kotlin.coroutines.d) r5;
                eg.r a7 = eg.c0.a();
                eg.c0.s(z0.f9245a, dVar5, a0.f9139d, new f0(a7, (Function2) this.f121d, (Continuation) null));
                while (!a7.N()) {
                    try {
                        return eg.c0.w(dVar5, new androidx.lifecycle.b(a7, (Continuation) r11, 15));
                    } catch (InterruptedException unused3) {
                    }
                }
                return a7.B();
            case 28:
                lf.a aVar29 = lf.a.f20034a;
                h8.b.B(obj);
                int i13 = 18;
                try {
                    file = new File(StringsKt.M((String) this.f121d, "file:/"));
                    ((m) this.f120c).getClass();
                    gf.k.b(new id.a(13));
                    gf.k.b(new id.a(14));
                    Intrinsics.checkNotNullParameter(file, "file");
                    try {
                    } catch (Exception ex2) {
                        Intrinsics.checkNotNullParameter(ex2, "ex");
                        jg.d dVar6 = MyApp.f6830c;
                        e eVar6 = m0.f9201a;
                        eg.c0.t(dVar6, lg.d.f20063c, null, new q4.r(ex2, r11, i13), 2);
                    }
                } catch (Exception ex3) {
                    Intrinsics.checkNotNullParameter(ex3, "ex");
                    jg.d dVar7 = MyApp.f6830c;
                    e eVar7 = m0.f9201a;
                    eg.c0.t(dVar7, lg.d.f20063c, null, new q4.r(ex3, r11, i13), 2);
                }
                if (file.exists() && file.isFile()) {
                    j = file.length();
                    if (j != 0) {
                        if (j < 5000000) {
                            z7 = true;
                        } else {
                            file.deleteOnExit();
                            t0 t0Var = rc.x.f22455a;
                            rc.x.a(R.string.the_maximum_file_size_is_five_mb, true);
                        }
                    }
                    return Boolean.valueOf(z7);
                }
                j = 0;
                if (j != 0) {
                }
                return Boolean.valueOf(z7);
            default:
                eg.z zVar7 = (eg.z) this.f120c;
                lf.a aVar30 = lf.a.f20034a;
                h8.b.B(obj);
                e eVar8 = m0.f9201a;
                fg.e eVar9 = jg.q.f18523a;
                c0 c0Var2 = (c0) this.f121d;
                eg.c0.e(zVar7, eVar9, new me.w(c0Var2, r11, false ? 1 : 0), 2);
                eg.c0.e(zVar7, eVar9, new me.w(c0Var2, r11, i12), 2);
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f119b = i5;
        this.f121d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, m mVar, Continuation continuation) {
        super(2, continuation);
        this.f119b = 28;
        this.f121d = str;
        this.f120c = mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f119b = 27;
        this.f121d = (i) function2;
    }
}
