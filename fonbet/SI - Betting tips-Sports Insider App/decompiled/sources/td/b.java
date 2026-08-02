package td;

import android.graphics.Typeface;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.WebView;
import cd.k;
import com.android.billingclient.api.d;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.ui.faq.FaqFragment;
import com.sports.insider.ui.viewpage.ViewPageEventFragment;
import com.sports.insider.ui.viewpage.ViewPageFragment;
import com.sports.insider.ui.views.AnalyticsShortView;
import com.sports.insider.ui.views.MeetingGameView;
import eg.c0;
import eg.m0;
import eg.r;
import eg.z;
import j$.time.Instant;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import jg.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import me.y;
import mf.i;
import s7.s;
import s7.u;
import te.k0;
import ue.g;
import ue.h;
import wc.d0;
import yc.e;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23855b;

    /* renamed from: c, reason: collision with root package name */
    public int f23856c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23858e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(AnalyticsShortView analyticsShortView, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f23855b = 3;
        this.f23857d = analyticsShortView;
        this.f23858e = (AdaptedFunctionReference) function1;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r1v8, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f23855b) {
            case 0:
                return new b((FaqFragment) this.f23857d, (Parcelable) this.f23858e, continuation, 0);
            case 1:
                return new b((ViewPageEventFragment) this.f23858e, continuation, 1);
            case 2:
                return new b((ViewPageFragment) this.f23857d, (WebView) this.f23858e, continuation, 2);
            case 3:
                return new b((AnalyticsShortView) this.f23857d, (Function1) this.f23858e, continuation);
            case 4:
                return new b((MeetingGameView) this.f23857d, (Function1) this.f23858e, continuation);
            case 5:
                return new b((wc.i) this.f23857d, (String) this.f23858e, continuation, 5);
            case 6:
                return new b((d0) this.f23857d, (String) this.f23858e, continuation, 6);
            case 7:
                return new b((String) this.f23857d, (s) this.f23858e, continuation, 7);
            case 8:
                return new b((String) this.f23857d, (yb.i) this.f23858e, continuation, 8);
            default:
                return new b((e) this.f23858e, continuation, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f23855b) {
        }
        return ((b) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r8v8, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object A;
        ViewPageEventFragment viewPageEventFragment;
        Object A2;
        String str;
        WebView webView;
        Object A3;
        Object A4;
        Object A5;
        Object A6;
        Object m6;
        String c2;
        Object k6;
        int i5 = 0;
        int i10 = 2;
        d dVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        int i11 = 1;
        switch (this.f23855b) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i12 = this.f23856c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    this.f23856c = 1;
                    if (c0.j(50L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                lg.e eVar = m0.f9201a;
                fg.e eVar2 = q.f18523a;
                y yVar = new y((FaqFragment) this.f23857d, (Parcelable) this.f23858e, objArr == true ? 1 : 0, 26);
                this.f23856c = 2;
                if (c0.A(eVar2, yVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f19194a;
            case 1:
                ViewPageEventFragment viewPageEventFragment2 = (ViewPageEventFragment) this.f23858e;
                lf.a aVar2 = lf.a.f20034a;
                int i13 = this.f23856c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    h G = viewPageEventFragment2.G();
                    this.f23857d = viewPageEventFragment2;
                    this.f23856c = 1;
                    G.getClass();
                    lg.e eVar3 = m0.f9201a;
                    A = c0.A(lg.d.f20063c, new g(G, objArr2 == true ? 1 : 0, i11), this);
                    if (A == aVar2) {
                        return aVar2;
                    }
                    viewPageEventFragment = viewPageEventFragment2;
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            if (i13 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                            return Unit.f19194a;
                        }
                        h8.b.B(obj);
                        A2 = obj;
                        str = (String) A2;
                        webView = viewPageEventFragment2.f7077b;
                        if (webView != null && str != null) {
                            webView.loadDataWithBaseURL("https://insider.sports.com/", str, "text/html; charset=utf-8", "UTF-8", null);
                        }
                        h G2 = viewPageEventFragment2.G();
                        int i14 = viewPageEventFragment2.f7079d;
                        this.f23857d = null;
                        this.f23856c = 3;
                        G2.getClass();
                        lg.e eVar4 = m0.f9201a;
                        A3 = c0.A(lg.d.f20063c, new k(i14, 17, (Object) G2, (Continuation) (objArr4 == true ? 1 : 0)), this);
                        if (A3 != aVar2) {
                            A3 = Unit.f19194a;
                        }
                        if (A3 == aVar2) {
                            return aVar2;
                        }
                        return Unit.f19194a;
                    }
                    ViewPageEventFragment viewPageEventFragment3 = (ViewPageEventFragment) this.f23857d;
                    h8.b.B(obj);
                    viewPageEventFragment = viewPageEventFragment3;
                    A = obj;
                }
                viewPageEventFragment.f7079d = ((Number) A).intValue();
                h G3 = viewPageEventFragment2.G();
                this.f23857d = null;
                this.f23856c = 2;
                G3.getClass();
                lg.e eVar5 = m0.f9201a;
                A2 = c0.A(lg.d.f20063c, new g(G3, objArr3 == true ? 1 : 0, i5), this);
                if (A2 == aVar2) {
                    return aVar2;
                }
                str = (String) A2;
                webView = viewPageEventFragment2.f7077b;
                if (webView != null) {
                    webView.loadDataWithBaseURL("https://insider.sports.com/", str, "text/html; charset=utf-8", "UTF-8", null);
                }
                h G22 = viewPageEventFragment2.G();
                int i142 = viewPageEventFragment2.f7079d;
                this.f23857d = null;
                this.f23856c = 3;
                G22.getClass();
                lg.e eVar42 = m0.f9201a;
                A3 = c0.A(lg.d.f20063c, new k(i142, 17, (Object) G22, (Continuation) (objArr4 == true ? 1 : 0)), this);
                if (A3 != aVar2) {
                }
                if (A3 == aVar2) {
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i15 = this.f23856c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    h hVar = (h) ((ViewPageFragment) this.f23857d).f7086d.getValue();
                    this.f23856c = 1;
                    hVar.getClass();
                    lg.e eVar6 = m0.f9201a;
                    A4 = c0.A(lg.d.f20063c, new bd.b(i10, objArr5 == true ? 1 : 0, 25), this);
                    if (A4 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A4 = obj;
                }
                String str2 = (String) A4;
                if (str2 != null) {
                    ((WebView) this.f23858e).loadDataWithBaseURL("https://insider.sports.com/", str2, "text/html; charset=utf-8", "UTF-8", null);
                }
                return Unit.f19194a;
            case 3:
                AnalyticsShortView analyticsShortView = (AnalyticsShortView) this.f23857d;
                lf.a aVar4 = lf.a.f20034a;
                int i16 = this.f23856c;
                if (i16 == 0) {
                    h8.b.B(obj);
                    lg.e eVar7 = m0.f9201a;
                    lg.d dVar2 = lg.d.f20063c;
                    ve.a aVar5 = new ve.a(0, null, (AdaptedFunctionReference) this.f23858e);
                    this.f23856c = 1;
                    A5 = c0.A(dVar2, aVar5, this);
                    if (A5 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A5 = obj;
                }
                analyticsShortView.setArimoRegularTypeface((Typeface) A5);
                analyticsShortView.requestLayout();
                analyticsShortView.invalidate();
                analyticsShortView.f7104o = true;
                return Unit.f19194a;
            case 4:
                MeetingGameView meetingGameView = (MeetingGameView) this.f23857d;
                lf.a aVar6 = lf.a.f20034a;
                int i17 = this.f23856c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    lg.e eVar8 = m0.f9201a;
                    lg.d dVar3 = lg.d.f20063c;
                    ve.a aVar7 = new ve.a(5, null, (AdaptedFunctionReference) this.f23858e);
                    this.f23856c = 1;
                    A6 = c0.A(dVar3, aVar7, this);
                    if (A6 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    A6 = obj;
                }
                meetingGameView.setArimoBoldTypeface((Typeface) A6);
                meetingGameView.requestLayout();
                meetingGameView.invalidate();
                meetingGameView.f7697r = true;
                c0.h(meetingGameView.q.f18494a);
                return Unit.f19194a;
            case 5:
                lf.a aVar8 = lf.a.f20034a;
                int i18 = this.f23856c;
                if (i18 != 0) {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                u uVar = ((wc.i) this.f23857d).f25115f;
                String str3 = (String) this.f23858e;
                this.f23856c = 1;
                uVar.getClass();
                Object f6 = u.f(str3, this);
                return f6 == aVar8 ? aVar8 : f6;
            case 6:
                lf.a aVar9 = lf.a.f20034a;
                int i19 = this.f23856c;
                if (i19 != 0) {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                pc.u b10 = d0.b();
                String str4 = (String) this.f23858e;
                this.f23856c = 1;
                Object p10 = b10.p(str4, this);
                return p10 == aVar9 ? aVar9 : p10;
            case 7:
                String str5 = (String) this.f23857d;
                lf.a aVar10 = lf.a.f20034a;
                int i20 = this.f23856c;
                try {
                    if (i20 == 0) {
                        h8.b.B(obj);
                        Log.d("ConsumeUseCase", "consumePurchase:" + str5);
                        pc.u uVar2 = (pc.u) y3.m(pc.u.class, null, 6);
                        this.f23856c = 1;
                        if (uVar2.k(str5, this) == aVar10) {
                            return aVar10;
                        }
                    } else {
                        if (i20 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                    }
                } catch (Exception e7) {
                    if (!(e7 instanceof CancellationException)) {
                        zc.d.b(4, "consumePurchase", e7);
                    }
                    i5 = -1;
                }
                return new Integer(i5);
            case 8:
                lf.a aVar11 = lf.a.f20034a;
                int i21 = this.f23856c;
                if (i21 == 0) {
                    h8.b.B(obj);
                    d dVar4 = yb.i.f25817e;
                    if (dVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBillingClient");
                    } else {
                        dVar = dVar4;
                    }
                    String str6 = (String) this.f23857d;
                    if (str6 == null) {
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                    com.android.billingclient.api.a aVar12 = new com.android.billingclient.api.a(0);
                    aVar12.f3966b = str6;
                    Intrinsics.checkNotNullExpressionValue(aVar12, "build(...)");
                    this.f23856c = 1;
                    r a7 = c0.a();
                    com.android.billingclient.api.e eVar9 = new com.android.billingclient.api.e(5);
                    eVar9.f4011b = a7;
                    dVar.d(aVar12, eVar9);
                    m6 = a7.m(this);
                    if (m6 == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    m6 = obj;
                }
                com.android.billingclient.api.k kVar = (com.android.billingclient.api.k) m6;
                ((yb.i) this.f23858e).e(kVar.f4037a, "OnServiceAcknowledgePurchase", kVar.f4038b);
                return m6;
            default:
                lf.a aVar13 = lf.a.f20034a;
                int i22 = this.f23856c;
                if (i22 == 0) {
                    h8.b.B(obj);
                    String str7 = gc.d.f9945a;
                    c2 = d2.i.c();
                    u uVar3 = new u(23);
                    this.f23857d = c2;
                    this.f23856c = 1;
                    k6 = uVar3.k(c2, this);
                    if (k6 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i22 != 1) {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    c2 = (String) this.f23857d;
                    h8.b.B(obj);
                    k6 = obj;
                }
                if (Instant.now().getEpochSecond() >= ((Number) k6).intValue() + TimeUnit.DAYS.toSeconds(1L)) {
                    e eVar10 = (e) this.f23858e;
                    this.f23857d = null;
                    this.f23856c = 2;
                    lg.e eVar11 = m0.f9201a;
                    if (c0.A(lg.d.f20063c, new k0(c2, eVar10, objArr6 == true ? 1 : 0, i10), this) == aVar13) {
                        return aVar13;
                    }
                }
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(MeetingGameView meetingGameView, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f23855b = 4;
        this.f23857d = meetingGameView;
        this.f23858e = (AdaptedFunctionReference) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23855b = i5;
        this.f23857d = obj;
        this.f23858e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f23855b = i5;
        this.f23858e = obj;
    }
}
