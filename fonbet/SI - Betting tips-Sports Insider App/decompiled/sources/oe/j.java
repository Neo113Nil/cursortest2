package oe;

import android.app.Activity;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.p0;
import androidx.lifecycle.d1;
import androidx.lifecycle.e0;
import androidx.lifecycle.y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d2;
import androidx.recyclerview.widget.k1;
import com.android.billingclient.api.w;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.play.core.appupdate.n;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.domain.service.PreviewLastDayService;
import com.sports.insider.ui.activities.MainActivity;
import com.sports.insider.ui.strip.FollowPredictionsFragment;
import eg.c0;
import eg.h1;
import eg.m0;
import eg.z;
import ge.o;
import gg.l;
import hg.a1;
import hg.o0;
import hg.t0;
import hg.u;
import hg.u0;
import hg.x0;
import ic.h0;
import io.appmetrica.analytics.impl.C0122e9;
import io.sentry.d4;
import j$.time.Instant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import jg.q;
import k2.v;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import la.m;
import org.json.JSONObject;
import pd.t;
import pe.s;
import q4.r;
import rc.a0;
import rc.b0;
import rc.x;
import se.p;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21205b;

    /* renamed from: c, reason: collision with root package name */
    public int f21206c;

    /* renamed from: d, reason: collision with root package name */
    public Object f21207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f21208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.sports.insider.ui.activities.a aVar, com.google.android.play.core.appupdate.a aVar2, int i5, Continuation continuation) {
        super(2, continuation);
        this.f21205b = 8;
        this.f21207d = aVar;
        this.f21208e = aVar2;
        this.f21206c = i5;
    }

    private final Object c(Object obj) {
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f21206c;
        if (i5 == 0) {
            h8.b.B(obj);
            t0 t0Var = x.f22455a;
            y yVar = (y) this.f21207d;
            androidx.lifecycle.x xVar = androidx.lifecycle.x.f2253a;
            u uVar = new u(d1.f(t0Var, yVar), new o(3, null, 21));
            c1.y yVar2 = new c1.y(8, (pd.o) this.f21208e);
            this.f21206c = 1;
            if (uVar.a(yVar2, this) == aVar) {
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

    private final Object e(Object obj) {
        ha.a aVar;
        sc.h hVar = (sc.h) this.f21208e;
        lf.a aVar2 = lf.a.f20034a;
        int i5 = this.f21206c;
        try {
            if (i5 == 0) {
                h8.b.B(obj);
                m a7 = sc.h.a();
                this.f21206c = 1;
                obj = a7.a(this);
                if (obj == aVar2) {
                    return aVar2;
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (ha.a) this.f21207d;
                    h8.b.B(obj);
                    return aVar.f10434d;
                }
                h8.b.B(obj);
            }
            ha.a aVar3 = (ha.a) obj;
            if (aVar3 == null) {
                return null;
            }
            this.f21207d = aVar3;
            this.f21206c = 2;
            if (hVar.c(aVar3, this) != aVar2) {
                aVar = aVar3;
                return aVar.f10434d;
            }
            return aVar2;
        } catch (Exception unused) {
            return null;
        }
    }

    private final Object g(Object obj) {
        ha.d dVar = (ha.d) this.f21207d;
        Object obj2 = lf.a.f20034a;
        int i5 = this.f21206c;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            if (dVar == null) {
                return Unit.f19194a;
            }
            int i10 = dVar.j;
            String str = dVar.f10451a;
            this.f21206c = 1;
            Object A = c0.A(m0.f9201a, new bd.i(i10, str, null), this);
            if (A != obj2) {
                A = Unit.f19194a;
            }
            if (A == obj2) {
                return obj2;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        String str2 = dVar.f10451a;
        if (str2 != null) {
            c0.t(MyApp.f6830c, new eg.y("AppsFlyerUseCase"), null, new cd.c(new io.sentry.hints.j(6), str2, continuation, 2), 2);
        }
        long epochSecond = Instant.now().getEpochSecond();
        Long l6 = dVar.q;
        boolean z5 = (l6 != null ? l6.longValue() : 0L) > epochSecond;
        Long l10 = dVar.f10465p;
        boolean z7 = (l10 != null ? l10.longValue() : 0L) > epochSecond;
        Long l11 = dVar.f10464o;
        boolean z10 = (l11 != null ? l11.longValue() : 0L) > epochSecond;
        Long l12 = dVar.f10463n;
        c0.t(MyApp.f6830c, b0.b(), null, new a0(new b0(), z5, z7, z10, (l12 != null ? l12.longValue() : 0L) > epochSecond, null), 2);
        return Unit.f19194a;
    }

    private final Object h(Object obj) {
        com.android.billingclient.api.i iVar = (com.android.billingclient.api.i) this.f21207d;
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) iVar.f4029c;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f21206c;
        if (i5 == 0) {
            h8.b.B(obj);
            lg.e eVar = m0.f9201a;
            lg.d dVar = lg.d.f20063c;
            r rVar = new r((p0) this.f21208e, null, 3);
            this.f21206c = 1;
            obj = c0.A(dVar, rVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        List items = (List) obj;
        ProgressBar progressBar = (ProgressBar) bottomSheetDialog.findViewById(R.id.bottom_gallery_progress);
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        Intrinsics.checkNotNullParameter(items, "items");
        sd.h hVar = new sd.h();
        hVar.f23481a = items;
        hVar.f23482b = iVar;
        iVar.f4030d = hVar;
        RecyclerView recyclerView = (RecyclerView) bottomSheetDialog.findViewById(R.id.gallery_recycler);
        if (recyclerView != null) {
            recyclerView.setAdapter((sd.h) iVar.f4030d);
        }
        return Unit.f19194a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(Object obj) {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        p pVar5;
        p pVar6 = (p) this.f21208e;
        wc.i iVar = pVar6.A;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f21206c;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (i5 == 0) {
            h8.b.B(obj);
            this.f21207d = pVar6;
            this.f21206c = 1;
            iVar.getClass();
            lg.e eVar = m0.f9201a;
            obj = c0.A(lg.d.f20063c, new wc.f(iVar, objArr == true ? 1 : 0, 10), this);
            if (obj != aVar) {
                pVar = pVar6;
            }
            return aVar;
        }
        if (i5 != 1) {
            if (i5 == 2) {
                pVar2 = (p) this.f21207d;
                h8.b.B(obj);
                nc.f fVar = (nc.f) obj;
                pVar6.f23578d = fVar == null ? fVar.productId() : null;
                pVar6.f23579e = fVar == null ? fVar.productIdStrike() : null;
                pVar2.f23595w = fVar;
                this.f21207d = pVar6;
                this.f21206c = 3;
                iVar.getClass();
                lg.e eVar2 = m0.f9201a;
                obj = c0.A(lg.d.f20063c, new wc.f(iVar, objArr3 == true ? 1 : 0, 11), this);
                if (obj != aVar) {
                    pVar3 = pVar6;
                    nc.f fVar2 = (nc.f) obj;
                    pVar6.f23580f = fVar2 == null ? fVar2.productId() : null;
                    pVar6.f23581g = fVar2 == null ? fVar2.productIdStrike() : null;
                    pVar3.f23596x = fVar2;
                    this.f21207d = pVar6;
                    this.f21206c = 4;
                    iVar.getClass();
                    lg.e eVar3 = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new wc.f(iVar, objArr4 == true ? 1 : 0, 8), this);
                    if (obj != aVar) {
                    }
                }
                return aVar;
            }
            if (i5 == 3) {
                pVar3 = (p) this.f21207d;
                h8.b.B(obj);
                nc.f fVar22 = (nc.f) obj;
                pVar6.f23580f = fVar22 == null ? fVar22.productId() : null;
                pVar6.f23581g = fVar22 == null ? fVar22.productIdStrike() : null;
                pVar3.f23596x = fVar22;
                this.f21207d = pVar6;
                this.f21206c = 4;
                iVar.getClass();
                lg.e eVar32 = m0.f9201a;
                obj = c0.A(lg.d.f20063c, new wc.f(iVar, objArr4 == true ? 1 : 0, 8), this);
                if (obj != aVar) {
                    pVar4 = pVar6;
                    nc.f fVar3 = (nc.f) obj;
                    pVar6.f23582h = fVar3 == null ? fVar3.productId() : null;
                    pVar6.f23583i = fVar3 == null ? fVar3.productIdStrike() : null;
                    pVar4.f23597y = fVar3;
                    this.f21207d = pVar6;
                    this.f21206c = 5;
                    iVar.getClass();
                    lg.e eVar4 = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new wc.f(iVar, objArr5 == true ? 1 : 0, 7), this);
                    if (obj != aVar) {
                    }
                }
                return aVar;
            }
            if (i5 != 4) {
                if (i5 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar5 = (p) this.f21207d;
                h8.b.B(obj);
                nc.f fVar4 = (nc.f) obj;
                pVar6.j = fVar4 == null ? fVar4.productId() : null;
                pVar6.f23584k = fVar4 != null ? fVar4.productIdStrike() : null;
                pVar5.f23598z = fVar4;
                return Unit.f19194a;
            }
            pVar4 = (p) this.f21207d;
            h8.b.B(obj);
            nc.f fVar32 = (nc.f) obj;
            pVar6.f23582h = fVar32 == null ? fVar32.productId() : null;
            pVar6.f23583i = fVar32 == null ? fVar32.productIdStrike() : null;
            pVar4.f23597y = fVar32;
            this.f21207d = pVar6;
            this.f21206c = 5;
            iVar.getClass();
            lg.e eVar42 = m0.f9201a;
            obj = c0.A(lg.d.f20063c, new wc.f(iVar, objArr5 == true ? 1 : 0, 7), this);
            if (obj != aVar) {
                pVar5 = pVar6;
                nc.f fVar42 = (nc.f) obj;
                pVar6.j = fVar42 == null ? fVar42.productId() : null;
                pVar6.f23584k = fVar42 != null ? fVar42.productIdStrike() : null;
                pVar5.f23598z = fVar42;
                return Unit.f19194a;
            }
            return aVar;
        }
        pVar = (p) this.f21207d;
        h8.b.B(obj);
        nc.f fVar5 = (nc.f) obj;
        pVar6.f23576b = fVar5 != null ? fVar5.productId() : null;
        pVar6.f23577c = fVar5 != null ? fVar5.productIdStrike() : null;
        pVar.f23594v = fVar5;
        this.f21207d = pVar6;
        this.f21206c = 2;
        iVar.getClass();
        lg.e eVar5 = m0.f9201a;
        obj = c0.A(lg.d.f20063c, new wc.f(iVar, objArr2 == true ? 1 : 0, 9), this);
        if (obj != aVar) {
            pVar2 = pVar6;
            nc.f fVar6 = (nc.f) obj;
            pVar6.f23578d = fVar6 == null ? fVar6.productId() : null;
            pVar6.f23579e = fVar6 == null ? fVar6.productIdStrike() : null;
            pVar2.f23595w = fVar6;
            this.f21207d = pVar6;
            this.f21206c = 3;
            iVar.getClass();
            lg.e eVar22 = m0.f9201a;
            obj = c0.A(lg.d.f20063c, new wc.f(iVar, objArr3 == true ? 1 : 0, 11), this);
            if (obj != aVar) {
            }
        }
        return aVar;
    }

    private final Object k(Object obj) {
        Object obj2 = lf.a.f20034a;
        int i5 = this.f21206c;
        if (i5 == 0) {
            h8.b.B(obj);
            p pVar = (p) this.f21207d;
            Activity activity = (Activity) this.f21208e;
            this.f21206c = 1;
            lg.e eVar = m0.f9201a;
            Object A = c0.A(lg.d.f20063c, new bd.i(pVar, activity, (Continuation) null, 22), this);
            if (A != obj2) {
                A = Unit.f19194a;
            }
            if (A == obj2) {
                return obj2;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }

    private final Object l(Object obj) {
        List list = (List) this.f21207d;
        Object obj2 = lf.a.f20034a;
        int i5 = this.f21206c;
        if (i5 == 0) {
            h8.b.B(obj);
            p pVar = (p) this.f21208e;
            this.f21207d = null;
            this.f21206c = 1;
            Object i10 = c0.i(new se.i(list, pVar, null), this);
            if (i10 != obj2) {
                i10 = Unit.f19194a;
            }
            if (i10 == obj2) {
                return obj2;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8.b.B(obj);
        }
        return Unit.f19194a;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21205b) {
            case 0:
                return new j((k) this.f21207d, (String) this.f21208e, continuation, 0);
            case 1:
                return new j((pc.u) this.f21207d, (w) this.f21208e, continuation, 1);
            case 2:
                return new j((pc.u) this.f21207d, (h0) this.f21208e, continuation, 2);
            case 3:
                return new j((pd.c) this.f21207d, (String) this.f21208e, continuation, 3);
            case 4:
                return new j((BroadcastReceiver) this.f21207d, (MainActivity) this.f21208e, continuation, 4);
            case 5:
                return new j((gf.u) this.f21207d, (MainActivity) this.f21208e, continuation, 5);
            case 6:
                return new j((t) this.f21207d, (Context) this.f21208e, continuation, 6);
            case 7:
                return new j((t) this.f21207d, (h1) this.f21208e, continuation, 7);
            case 8:
                return new j((com.sports.insider.ui.activities.a) this.f21207d, (com.google.android.play.core.appupdate.a) this.f21208e, this.f21206c, continuation);
            case 9:
                return new j((FollowPredictionsFragment) this.f21207d, (Parcelable) this.f21208e, continuation, 9);
            case 10:
                return new j((s) this.f21207d, (p0) this.f21208e, continuation, 10);
            case 11:
                return new j((s) this.f21207d, (Intent) this.f21208e, continuation, 11);
            case 12:
                j jVar = new j((s) this.f21208e, continuation, 12);
                jVar.f21207d = obj;
                return jVar;
            case 13:
                return new j((q8.b) this.f21207d, (Function1) this.f21208e, continuation, 13);
            case 14:
                return new j((q8.b) this.f21207d, (g1.c) this.f21208e, continuation, 14);
            case 15:
                return new j((fb.b) this.f21207d, this.f21206c, (ka.a) this.f21208e, continuation);
            case 16:
                return new j((PreviewLastDayService) this.f21207d, (JobParameters) this.f21208e, continuation, 16);
            case 17:
                j jVar2 = new j((qd.h) this.f21208e, continuation, 17);
                jVar2.f21207d = obj;
                return jVar2;
            case 18:
                return new j((qd.h) this.f21207d, (String) this.f21208e, continuation, 18);
            case 19:
                return new j((RecyclerView) this.f21207d, (qe.e) this.f21208e, continuation, 19);
            case 20:
                return new j((e0) this.f21207d, (v) this.f21208e, continuation, 20);
            case 21:
                return new j((rc.r) this.f21208e, continuation, 21);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new j((y) this.f21207d, (pd.o) this.f21208e, continuation, 22);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new j((sc.h) this.f21208e, continuation, 23);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return new j((ha.d) this.f21207d, (s7.u) this.f21208e, continuation, 24);
            case C0122e9.F /* 25 */:
                return new j((com.android.billingclient.api.i) this.f21207d, (p0) this.f21208e, continuation, 25);
            case C0122e9.G /* 26 */:
                return new j((p) this.f21208e, continuation, 26);
            case C0122e9.H /* 27 */:
                return new j((p) this.f21207d, (Activity) this.f21208e, continuation, 27);
            case 28:
                j jVar3 = new j((p) this.f21208e, continuation, 28);
                jVar3.f21207d = obj;
                return jVar3;
            default:
                return new j((s7.s) this.f21208e, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21205b) {
            case 0:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 1:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 2:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 3:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 4:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 5:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 6:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 7:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 8:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 9:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 10:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 11:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 12:
                return ((j) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 13:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 14:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 15:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 16:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 17:
                return ((j) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 18:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 19:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 20:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 21:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case C0122e9.F /* 25 */:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case C0122e9.G /* 26 */:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case C0122e9.H /* 27 */:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            case 28:
                return ((j) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
            default:
                return ((j) create((z) obj, (Continuation) obj2)).invokeSuspend(Unit.f19194a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:351|(1:(1:(3:355|356|357)(2:358|359))(1:360))(2:399|(1:401))|361|(1:363)|364|365|366|(1:368)|369|370|372|373|374|(9:380|(1:382)|(1:384)|385|(1:387)|388|(1:390)|391|(1:393))(1:377)|(1:379)|356|357) */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x071c, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d A[Catch: Exception -> 0x0075, TRY_LEAVE, TryCatch #7 {Exception -> 0x0075, blocks: (B:9:0x0021, B:12:0x006d, B:20:0x002d, B:22:0x0053, B:24:0x0057, B:26:0x005d, B:30:0x0036), top: B:4:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:504:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /* JADX WARN: Type inference failed for: r3v22, types: [hg.d1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [eg.t1, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object obj2;
        Object A;
        Object b10;
        Object d10;
        Object A2;
        Object h10;
        Object m6;
        Object c2;
        Object c8;
        int intValue;
        b6.p pVar;
        hg.c f6;
        c1.y yVar;
        Object A3;
        ha.a aVar;
        ha.a aVar2;
        int i5 = 4;
        long j = -1;
        int i10 = 6;
        int i11 = 2;
        int i12 = 0;
        ?? r82 = 0;
        String str3 = null;
        Integer num = null;
        g.f fVar = null;
        r82 = 0;
        switch (this.f21205b) {
            case 0:
                lf.a aVar3 = lf.a.f20034a;
                int i13 = this.f21206c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    m7.b bVar = new m7.b();
                    String str4 = (String) this.f21208e;
                    this.f21206c = 1;
                    if (bVar.f(str4, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar4 = lf.a.f20034a;
                int i14 = this.f21206c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    pc.u uVar = (pc.u) this.f21207d;
                    List list = ((w) this.f21208e).f4111b;
                    this.f21206c = 1;
                    if (pc.u.d(uVar, list, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar5 = lf.a.f20034a;
                int i15 = this.f21206c;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                wc.c cVar = (wc.c) ((pc.u) this.f21207d).f21702b.getValue();
                h0 h0Var = (h0) this.f21208e;
                String str5 = h0Var.f11122b;
                String str6 = h0Var.f11124d;
                this.f21206c = 1;
                Object b11 = cVar.b(str5, str6, this);
                return b11 == aVar5 ? aVar5 : b11;
            case 3:
                String str7 = (String) this.f21208e;
                pd.c cVar2 = (pd.c) this.f21207d;
                pd.b bVar2 = cVar2.f21736g;
                lf.a aVar6 = lf.a.f20034a;
                int i16 = this.f21206c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    List list2 = (List) cVar2.f21732c.getValue();
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (Intrinsics.areEqual(((kc.a) obj2).f18992c, str7)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        kc.a aVar7 = (kc.a) obj2;
                        if (aVar7 != null) {
                            str = aVar7.f18992c;
                            this.f21206c = 1;
                            if (str != null) {
                                if (str.length() == 0 || StringsKt.H(str) || Intrinsics.areEqual(str, "/storage/")) {
                                    str2 = null;
                                } else {
                                    str2 = StringsKt.N("https://sport-insider.club/", "/") + str;
                                }
                                if (str2 != null) {
                                    oc.a aVar8 = (oc.a) y3.m(oc.a.class, null, 6);
                                    aVar8.getClass();
                                    lg.e eVar = m0.f9201a;
                                    r82 = c0.A(lg.d.f20063c, new kd.e(aVar8, str2, (Continuation) r82, 29), this);
                                }
                            }
                            if (r82 == aVar6) {
                                return aVar6;
                            }
                        }
                    }
                    str = null;
                    this.f21206c = 1;
                    if (str != null) {
                    }
                    if (r82 == aVar6) {
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    r82 = obj;
                }
                Bitmap bitmap = (Bitmap) r82;
                if (bitmap != null) {
                    bVar2.put(str7, bitmap);
                    cVar2.f21733d.j(CollectionsKt.W(bVar2.snapshot().keySet()));
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar9 = lf.a.f20034a;
                int i17 = this.f21206c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    lg.e eVar2 = m0.f9201a;
                    lg.d dVar = lg.d.f20063c;
                    pd.h hVar = new pd.h((MainActivity) this.f21208e, r82, i5);
                    this.f21206c = 1;
                    A = c0.A(dVar, hVar, this);
                    if (A == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A = obj;
                }
                x1.b bVar3 = (x1.b) A;
                BroadcastReceiver broadcastReceiver = (BroadcastReceiver) this.f21207d;
                IntentFilter intentFilter = ((MainActivity) this.f21208e).j0;
                synchronized (bVar3.f25378b) {
                    try {
                        x1.a aVar10 = new x1.a(intentFilter, broadcastReceiver);
                        ArrayList arrayList = (ArrayList) bVar3.f25378b.get(broadcastReceiver);
                        if (arrayList == null) {
                            arrayList = new ArrayList(1);
                            bVar3.f25378b.put(broadcastReceiver, arrayList);
                        }
                        arrayList.add(aVar10);
                        while (i12 < intentFilter.countActions()) {
                            String action = intentFilter.getAction(i12);
                            ArrayList arrayList2 = (ArrayList) bVar3.f25379c.get(action);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList(1);
                                bVar3.f25379c.put(action, arrayList2);
                            }
                            arrayList2.add(aVar10);
                            i12++;
                        }
                    } finally {
                    }
                }
                return Unit.f19194a;
            case 5:
                gf.u uVar2 = (gf.u) this.f21207d;
                MainActivity mainActivity = (MainActivity) this.f21208e;
                lf.a aVar11 = lf.a.f20034a;
                int i18 = this.f21206c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    int intValue2 = ((Number) uVar2.f10040b).intValue();
                    int intValue3 = ((Number) uVar2.f10041c).intValue();
                    if (intValue2 < 1 || intValue3 > 3 || intValue3 < 1) {
                        Set set = MainActivity.J0;
                        mainActivity.H().f();
                    } else if (intValue3 == 1) {
                        Set set2 = MainActivity.J0;
                        mainActivity.H().h(intValue2, 1, false);
                    } else {
                        id.x xVar = new id.x();
                        this.f21206c = 1;
                        b10 = xVar.b(intValue2, this);
                        if (b10 == aVar11) {
                            return aVar11;
                        }
                    }
                    return Unit.f19194a;
                }
                if (i18 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                b10 = obj;
                ja.c cVar3 = (ja.c) b10;
                if (cVar3 == null) {
                    Set set3 = MainActivity.J0;
                    mainActivity.H().f();
                } else {
                    int i19 = cVar3.f18388a;
                    int i20 = cVar3.f18391d;
                    if (i20 == 1) {
                        Set set4 = MainActivity.J0;
                        mainActivity.H().h(i19, 1, false);
                    } else if (io.sentry.config.a.C(new Integer(cVar3.j))) {
                        Set set5 = MainActivity.J0;
                        mainActivity.H().h(i19, i20, false);
                    } else if (!cVar3.a()) {
                        Set set6 = MainActivity.J0;
                        t.i(mainActivity.H(), i19, i20);
                    } else if (cVar3.a()) {
                        x.a(R.string.match_has_already_begun, false);
                    }
                }
                return Unit.f19194a;
            case 6:
                Context context = (Context) this.f21208e;
                lf.a aVar12 = lf.a.f20034a;
                int i21 = this.f21206c;
                if (i21 == 0) {
                    h8.b.B(obj);
                    this.f21206c = 1;
                    if (c0.j(10000L, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                String c10 = ((ea.a) y3.m(ea.a.class, null, 6)).c();
                if (c10 == null) {
                    c10 = ((ea.a) y3.m(ea.a.class, null, 6)).d();
                }
                d4.j("DeviceId", c10);
                d4.j("AppStore", "google");
                d4.j("Flavor", "googleProduction");
                str3 = y4.a.v(context);
                if (str3 != null) {
                    d4.j("Signature", str3);
                }
                long j6 = h8.b.p(context);
                j = h8.b.t(context);
                b0 b0Var = new b0();
                this.f21206c = 2;
                if (str3 == null && c10 == null) {
                    d10 = Unit.f19194a;
                } else {
                    JSONObject jSONObject = new JSONObject();
                    if (c10 != null) {
                        jSONObject.put("DeviceId", c10);
                    }
                    if (str3 != null) {
                        jSONObject.put("sha1Hex", str3);
                    }
                    if (j6 > 0) {
                        jSONObject.put("InstallApp", j6);
                    }
                    if (j > 0) {
                        jSONObject.put("UpdateApp", j);
                    }
                    d10 = b0Var.d(jSONObject, this);
                    if (d10 != lf.a.f20034a) {
                        d10 = Unit.f19194a;
                    }
                }
                if (d10 == aVar12) {
                    return aVar12;
                }
                return Unit.f19194a;
            case 7:
                t tVar = (t) this.f21207d;
                ?? r32 = tVar.f21796f;
                lf.a aVar13 = lf.a.f20034a;
                int i22 = this.f21206c;
                try {
                    try {
                        if (i22 == 0) {
                            h8.b.B(obj);
                            Boolean bool = Boolean.TRUE;
                            r32.getClass();
                            r32.k(null, bool);
                            h1 h1Var = (h1) this.f21208e;
                            this.f21206c = 1;
                            if (h1Var.invoke(this) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                        }
                    } finally {
                        Boolean bool2 = Boolean.FALSE;
                        r32.getClass();
                        r32.k(null, bool2);
                        tVar.f21797g = null;
                    }
                } catch (Exception ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar2 = MyApp.f6830c;
                    lg.e eVar3 = m0.f9201a;
                    c0.t(dVar2, lg.d.f20063c, null, new r(ex, r82, 18), 2);
                }
                return Unit.f19194a;
            case 8:
                com.sports.insider.ui.activities.a aVar14 = (com.sports.insider.ui.activities.a) this.f21207d;
                lf.a aVar15 = lf.a.f20034a;
                h8.b.B(obj);
                try {
                    com.google.android.play.core.appupdate.e eVar4 = (com.google.android.play.core.appupdate.e) aVar14.B.getValue();
                    com.google.android.play.core.appupdate.a aVar16 = (com.google.android.play.core.appupdate.a) this.f21208e;
                    g.f fVar2 = aVar14.A;
                    if (fVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("activityResultLauncher");
                    } else {
                        fVar = fVar2;
                    }
                    n a7 = n.a(this.f21206c).a();
                    eVar4.getClass();
                    com.google.android.play.core.appupdate.e.c(aVar16, fVar, a7);
                } catch (Exception e7) {
                    zc.d.b(4, "checkUpdateAppWithGMS", e7);
                }
                return Unit.f19194a;
            case 9:
                lf.a aVar17 = lf.a.f20034a;
                int i23 = this.f21206c;
                if (i23 == 0) {
                    h8.b.B(obj);
                    this.f21206c = 1;
                    if (c0.j(50L, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar5 = m0.f9201a;
                fg.e eVar6 = q.f18523a;
                me.y yVar2 = new me.y((FollowPredictionsFragment) this.f21207d, (Parcelable) this.f21208e, r82, 10);
                this.f21206c = 2;
                if (c0.A(eVar6, yVar2, this) == aVar17) {
                    return aVar17;
                }
                return Unit.f19194a;
            case 10:
                s sVar = (s) this.f21207d;
                id.x xVar2 = sVar.f21863b;
                AtomicBoolean atomicBoolean = sVar.j;
                lf.a aVar18 = lf.a.f20034a;
                int i24 = this.f21206c;
                try {
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    throw th2;
                }
                if (i24 == 0) {
                    h8.b.B(obj);
                    this.f21206c = 1;
                    if (xVar2.e(this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i24 != 1) {
                        if (i24 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        atomicBoolean.set(false);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                p0 p0Var = (p0) this.f21208e;
                this.f21206c = 2;
                if (xVar2.c(p0Var, this) == aVar18) {
                    return aVar18;
                }
                atomicBoolean.set(false);
                return Unit.f19194a;
            case 11:
                lf.a aVar19 = lf.a.f20034a;
                int i25 = this.f21206c;
                if (i25 == 0) {
                    h8.b.B(obj);
                    lg.e eVar7 = m0.f9201a;
                    lg.d dVar3 = lg.d.f20063c;
                    ad.a aVar20 = new ad.a((Intent) this.f21208e, r82, 28);
                    this.f21206c = 1;
                    A2 = c0.A(dVar3, aVar20, this);
                    if (A2 == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A2 = obj;
                }
                Boolean bool3 = (Boolean) A2;
                bool3.booleanValue();
                hg.d1 d1Var = ((s) this.f21207d).D;
                d1Var.getClass();
                d1Var.k(null, bool3);
                return Unit.f19194a;
            case 12:
                List list3 = (List) this.f21207d;
                Object obj3 = lf.a.f20034a;
                int i26 = this.f21206c;
                if (i26 == 0) {
                    h8.b.B(obj);
                    s sVar2 = (s) this.f21208e;
                    this.f21207d = null;
                    this.f21206c = 1;
                    mc.a aVar21 = s.F;
                    lg.e eVar8 = m0.f9201a;
                    Object A4 = c0.A(lg.d.f20063c, new me.y(sVar2, list3, r82, 14), this);
                    Object obj4 = A4;
                    if (A4 != obj3) {
                        obj4 = Unit.f19194a;
                    }
                    if (obj4 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 13:
                q8.b bVar4 = (q8.b) this.f21207d;
                ThreadLocal threadLocal = bVar4.f22063b;
                Object obj5 = lf.a.f20034a;
                int i27 = this.f21206c;
                try {
                    if (i27 == 0) {
                        h8.b.B(obj);
                        Object obj6 = threadLocal.get();
                        Boolean bool4 = Boolean.TRUE;
                        if (Intrinsics.areEqual(obj6, bool4)) {
                            throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        }
                        threadLocal.set(bool4);
                        c1.i iVar = bVar4.f22064c;
                        p2.a aVar22 = new p2.a((Function1) this.f21208e, null);
                        this.f21206c = 1;
                        h10 = iVar.h(new g1.b(aVar22, null, 1), this);
                        if (h10 == obj5) {
                            return obj5;
                        }
                    } else {
                        if (i27 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        h10 = obj;
                    }
                    obj5 = (g1.a) h10;
                    return obj5;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
            case 14:
                lf.a aVar23 = lf.a.f20034a;
                int i28 = this.f21206c;
                if (i28 == 0) {
                    h8.b.B(obj);
                    hg.g data = ((q8.b) this.f21207d).f22064c.getData();
                    this.f21206c = 1;
                    m6 = u0.m(data, this);
                    if (m6 == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    m6 = obj;
                }
                g1.a aVar24 = (g1.a) m6;
                if (aVar24 == null || (c2 = aVar24.c((g1.c) this.f21208e)) == null) {
                    return -1L;
                }
                return c2;
            case 15:
                lf.a aVar25 = lf.a.f20034a;
                h8.b.B(obj);
                rb.g P0 = fb.b.P0();
                final int i29 = this.f21206c;
                ka.a aVar26 = (ka.a) this.f21208e;
                rb.e eVar9 = P0.f22382a;
                if (aVar26 != null) {
                    k2.w wVar = eVar9.f22378a;
                    k2.w wVar2 = eVar9.f22378a;
                    if (((Number) f3.x.n0(wVar, true, false, new eb.b(i29, 11))).intValue() > 0) {
                        final int i30 = aVar26.f18945a;
                        final String str8 = aVar26.f18951g;
                        final String str9 = aVar26.j;
                        final String str10 = aVar26.f18954k;
                        final int i31 = aVar26.f18946b;
                        final String str11 = aVar26.f18952h;
                        f3.x.n0(wVar2, false, true, new Function1() { // from class: rb.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                int i32 = i31;
                                int i33 = i30;
                                int i34 = i29;
                                s2.a _connection = (s2.a) obj7;
                                Intrinsics.checkNotNullParameter(_connection, "_connection");
                                s2.c r02 = _connection.r0("UPDATE support_table \n                    SET operatorName = ?, text = ?, content = ?, mime = ?, \n                        dateUpdate = ?, stateRead = 2, sendDate =?,\n                        remoteId = ?\n                    WHERE id == ? ");
                                String str12 = str8;
                                try {
                                    if (str12 == null) {
                                        r02.h(1);
                                    } else {
                                        r02.B(1, str12);
                                    }
                                    String str13 = str11;
                                    if (str13 == null) {
                                        r02.h(2);
                                    } else {
                                        r02.B(2, str13);
                                    }
                                    String str14 = str10;
                                    if (str14 == null) {
                                        r02.h(3);
                                    } else {
                                        r02.B(3, str14);
                                    }
                                    String str15 = str9;
                                    if (str15 == null) {
                                        r02.h(4);
                                    } else {
                                        r02.B(4, str15);
                                    }
                                    long j10 = i32;
                                    r02.f(5, j10);
                                    r02.f(6, j10);
                                    r02.f(7, i33);
                                    r02.f(8, i34);
                                    r02.n0();
                                    r02.close();
                                    return Unit.f19194a;
                                } catch (Throwable th3) {
                                    r02.close();
                                    throw th3;
                                }
                            }
                        });
                    } else {
                        f3.x.n0(wVar2, false, true, new rb.c(aVar26.f18945a, aVar26.f18951g, aVar26.f18946b, aVar26.f18952h, aVar26.j, aVar26.f18954k, 0));
                    }
                }
                return Unit.f19194a;
            case 16:
                PreviewLastDayService previewLastDayService = (PreviewLastDayService) this.f21207d;
                lf.a aVar27 = lf.a.f20034a;
                int i32 = this.f21206c;
                if (i32 == 0) {
                    h8.b.B(obj);
                    id.x xVar3 = new id.x();
                    this.f21206c = 1;
                    if (xVar3.e(this) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (Build.VERSION.SDK_INT < 34) {
                    WeakReference weakReference = new WeakReference(null);
                    int i33 = previewLastDayService.f6878b;
                    try {
                        if (((c0.h0) weakReference.get()) == null) {
                            weakReference = new WeakReference((c0.h0) y3.m(c0.h0.class, null, 6));
                        }
                        Object obj7 = weakReference.get();
                        Intrinsics.checkNotNull(obj7);
                        ((c0.h0) obj7).f3273b.cancel(null, i33);
                    } catch (Exception unused2) {
                    }
                }
                previewLastDayService.jobFinished((JobParameters) this.f21208e, false);
                return Unit.f19194a;
            case 17:
                qd.h hVar2 = (qd.h) this.f21208e;
                String str12 = (String) this.f21207d;
                Object obj8 = lf.a.f20034a;
                int i34 = this.f21206c;
                if (i34 == 0) {
                    h8.b.B(obj);
                    hVar2.f22115b = new AtomicBoolean(str12 != null);
                    androidx.lifecycle.p0 p0Var2 = hVar2.f22120g;
                    androidx.lifecycle.p0 p0Var3 = hVar2.f22119f;
                    androidx.lifecycle.p0 p0Var4 = hVar2.f22118e;
                    androidx.lifecycle.p0 p0Var5 = hVar2.f22117d;
                    hVar2.f22121h.h(str12);
                    if (str12 == null) {
                        id.c cVar4 = hVar2.j;
                        if (cVar4 != null) {
                            p0Var5.h(cVar4.a(R.string.cadastre));
                            p0Var4.h(cVar4.a(R.string.authText));
                            p0Var3.h(null);
                            StringBuilder b12 = v.f.b(cVar4.a(R.string.registerWith));
                            StringBuilder sb2 = new StringBuilder();
                            String valueOf = String.valueOf("google".charAt(0));
                            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                            String upperCase = valueOf.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            sb2.append((Object) upperCase);
                            Intrinsics.checkNotNullExpressionValue("oogle", "substring(...)");
                            sb2.append("oogle");
                            b12.append(sb2.toString());
                            p0Var2.h(b12.toString());
                        }
                    } else {
                        id.c cVar5 = hVar2.j;
                        if (cVar5 != null) {
                            p0Var5.h(null);
                            p0Var4.h(cVar5.a(R.string.afterRegister));
                            p0Var3.h(cVar5.a(R.string.checkSpam));
                            p0Var2.h(cVar5.a(R.string.goToApp));
                        }
                    }
                    this.f21207d = null;
                    this.f21206c = 1;
                    lg.e eVar10 = m0.f9201a;
                    Object A5 = c0.A(q.f18523a, new qd.g(hVar2, r82, i12), this);
                    Object obj9 = A5;
                    if (A5 != obj8) {
                        obj9 = Unit.f19194a;
                    }
                    if (obj9 == obj8) {
                        return obj8;
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 18:
                qd.h hVar3 = (qd.h) this.f21207d;
                lf.a aVar28 = lf.a.f20034a;
                int i35 = this.f21206c;
                if (i35 == 0) {
                    h8.b.B(obj);
                    id.c cVar6 = hVar3.j;
                    if (cVar6 != null) {
                        String str13 = (String) this.f21208e;
                        this.f21206c = 1;
                        c8 = cVar6.c(str13, this);
                        if (c8 == aVar28) {
                            return aVar28;
                        }
                    }
                    IntRange intRange = new IntRange(400, 499, 1);
                    if (num != null && 400 <= (intValue = num.intValue()) && intValue <= intRange.f19235b) {
                        hVar3.f22122i.h(Boolean.TRUE);
                    }
                    return Unit.f19194a;
                }
                if (i35 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                c8 = obj;
                num = (Integer) c8;
                IntRange intRange2 = new IntRange(400, 499, 1);
                if (num != null) {
                    hVar3.f22122i.h(Boolean.TRUE);
                }
                return Unit.f19194a;
            case 19:
                RecyclerView recyclerView = (RecyclerView) this.f21207d;
                qe.e eVar11 = (qe.e) this.f21208e;
                Rect rect = eVar11.f22141m;
                lf.a aVar29 = lf.a.f20034a;
                int i36 = this.f21206c;
                if (i36 == 0) {
                    h8.b.B(obj);
                    lg.e eVar12 = m0.f9201a;
                    lg.d dVar4 = lg.d.f20063c;
                    bd.b bVar5 = new bd.b(i11, r82, 22);
                    this.f21206c = 1;
                    if (c0.A(dVar4, bVar5, this) == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                k1 layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null) {
                    return Unit.f19194a;
                }
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                    while (true) {
                        if (!eVar11.f22140l) {
                            d2 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                            re.p pVar2 = findViewHolderForAdapterPosition instanceof re.p ? (re.p) findViewHolderForAdapterPosition : null;
                            if (pVar2 != null) {
                                View itemView = pVar2.itemView;
                                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                                itemView.getGlobalVisibleRect(rect);
                                if (!rect.isEmpty()) {
                                    int height = rect.height();
                                    int height2 = itemView.getHeight();
                                    if ((height2 > 0 ? height / height2 : 0.0f) >= 0.75f) {
                                        cd.g gVar = new cd.g(i10);
                                        gVar.f3769d = new WeakReference(new b0());
                                        sc.a[] aVarArr = sc.a.f23428a;
                                        Intrinsics.checkNotNullParameter("vip", "bannerType");
                                        gVar.g("showBanner", "vip");
                                        eVar11.f22140l = true;
                                    }
                                }
                            }
                        }
                        if (findFirstVisibleItemPosition != findLastVisibleItemPosition) {
                            findFirstVisibleItemPosition++;
                        }
                    }
                }
                return Unit.f19194a;
            case 20:
                lf.a aVar30 = lf.a.f20034a;
                int i37 = this.f21206c;
                if (i37 == 0) {
                    h8.b.B(obj);
                    int i38 = 7;
                    hg.g e9 = u0.e(new c1.u(i38, new o0(rc.i.f22414a)), 20, gg.a.f10049b);
                    jg.d dVar5 = MyApp.f6830c;
                    a1 a1Var = new a1();
                    l.e0.getClass();
                    int i39 = gg.k.f10092b;
                    if (1 >= i39) {
                        i39 = 1;
                    }
                    int i40 = i39 - 1;
                    if (e9 instanceof ig.e) {
                        ig.e eVar13 = (ig.e) e9;
                        gg.a aVar31 = eVar13.f11250c;
                        hg.g f10 = eVar13.f();
                        if (f10 != null) {
                            int i41 = eVar13.f11249b;
                            if (i41 != -3 && i41 != -2 && i41 != 0) {
                                i12 = i41;
                            } else if (aVar31 == gg.a.f10048a && i41 != 0) {
                                i12 = i40;
                            }
                            pVar = new b6.p(i12, aVar31, f10, eVar13.f11248a);
                            t0 a10 = u0.a(1, pVar.f3078a, (gg.a) pVar.f3080c);
                            c0.s(dVar5, (CoroutineContext) pVar.f3081d, !Intrinsics.areEqual(a1Var, x0.f10795a) ? eg.a0.f9136a : eg.a0.f9139d, new androidx.lifecycle.o(a1Var, (hg.g) pVar.f3079b, a10, (Continuation) null));
                            o0 o0Var = new o0(a10);
                            y lifecycle = ((e0) this.f21207d).getLifecycle();
                            androidx.lifecycle.x xVar4 = androidx.lifecycle.x.f2253a;
                            f6 = d1.f(o0Var, lifecycle);
                            yVar = new c1.y(i38, (v) this.f21208e);
                            this.f21206c = 1;
                            if (f6.a(yVar, this) == aVar30) {
                                return aVar30;
                            }
                        }
                    }
                    pVar = new b6.p(i40, gg.a.f10048a, e9, kotlin.coroutines.g.f19227a);
                    t0 a102 = u0.a(1, pVar.f3078a, (gg.a) pVar.f3080c);
                    c0.s(dVar5, (CoroutineContext) pVar.f3081d, !Intrinsics.areEqual(a1Var, x0.f10795a) ? eg.a0.f9136a : eg.a0.f9139d, new androidx.lifecycle.o(a1Var, (hg.g) pVar.f3079b, a102, (Continuation) null));
                    o0 o0Var2 = new o0(a102);
                    y lifecycle2 = ((e0) this.f21207d).getLifecycle();
                    androidx.lifecycle.x xVar42 = androidx.lifecycle.x.f2253a;
                    f6 = d1.f(o0Var2, lifecycle2);
                    yVar = new c1.y(i38, (v) this.f21208e);
                    this.f21206c = 1;
                    if (f6.a(yVar, this) == aVar30) {
                    }
                } else {
                    if (i37 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 21:
                rc.r rVar = (rc.r) this.f21208e;
                Object obj10 = lf.a.f20034a;
                int i42 = this.f21206c;
                if (i42 != 0) {
                    if (i42 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Boolean bool5 = (Boolean) this.f21207d;
                    h8.b.B(obj);
                    return bool5;
                }
                h8.b.B(obj);
                fa.a d11 = rc.r.d();
                d11.getClass();
                Intrinsics.checkNotNullParameter("firstStart", "key");
                boolean contains = d11.f9542b.contains("firstStart");
                Boolean valueOf2 = Boolean.valueOf(!contains);
                if (!contains) {
                    long epochMilli = Instant.now().toEpochMilli();
                    this.f21207d = valueOf2;
                    this.f21206c = 1;
                    lg.e eVar14 = m0.f9201a;
                    Object A6 = c0.A(lg.d.f20063c, new rc.n(rVar, epochMilli, null, 1), this);
                    Object obj11 = A6;
                    if (A6 != obj10) {
                        obj11 = Unit.f19194a;
                    }
                    if (obj11 == obj10) {
                        return obj10;
                    }
                }
                return valueOf2;
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return c(obj);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return e(obj);
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return g(obj);
            case C0122e9.F /* 25 */:
                return h(obj);
            case C0122e9.G /* 26 */:
                return j(obj);
            case C0122e9.H /* 27 */:
                return k(obj);
            case 28:
                return l(obj);
            default:
                s7.s sVar3 = (s7.s) this.f21208e;
                Object obj12 = lf.a.f20034a;
                int i43 = this.f21206c;
                try {
                    if (i43 == 0) {
                        h8.b.B(obj);
                        la.g gVar2 = (la.g) y3.m(la.g.class, null, 6);
                        this.f21206c = 1;
                        gVar2.getClass();
                        lg.e eVar15 = m0.f9201a;
                        A3 = c0.A(lg.d.f20063c, new la.f(gVar2, null), this);
                        if (A3 == obj12) {
                            return obj12;
                        }
                    } else {
                        if (i43 != 1) {
                            if (i43 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (ha.a) this.f21207d;
                            h8.b.B(obj);
                            aVar = aVar2;
                            if (aVar != null) {
                                return null;
                            }
                            obj12 = new Integer(aVar.f10431a);
                            return obj12;
                        }
                        h8.b.B(obj);
                        A3 = obj;
                    }
                    aVar = (ha.a) A3;
                    if (aVar != null && aVar.f10431a == 200) {
                        this.f21207d = aVar;
                        this.f21206c = 2;
                        if (s7.s.b(sVar3, aVar, this) != obj12) {
                            aVar2 = aVar;
                            aVar = aVar2;
                        }
                        return obj12;
                    }
                    if (aVar != null) {
                    }
                } catch (Exception unused3) {
                    return null;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fb.b bVar, int i5, ka.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f21205b = 15;
        this.f21207d = bVar;
        this.f21206c = i5;
        this.f21208e = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21205b = i5;
        this.f21207d = obj;
        this.f21208e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21205b = i5;
        this.f21208e = obj;
    }
}
