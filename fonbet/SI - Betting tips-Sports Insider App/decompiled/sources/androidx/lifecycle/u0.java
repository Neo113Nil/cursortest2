package androidx.lifecycle;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.MyApp;
import com.sports.insider.ui.viewpage.ViewCloudFragment;
import com.sports.insider.ui.views.AnalyticsView;
import com.sports.insider.ui.views.ArchiveTargetView;
import com.sports.insider.ui.views.HowToGetABonusBtn;
import com.sports.insider.ui.views.LastGamesNameLabel;
import com.sports.insider.ui.views.LiveTargetRoiView;
import com.sports.insider.ui.views.ResponsibleGamingBtn;
import com.sports.insider.ui.views.TelegramBannerView;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import le.f2;
import le.y1;
import le.z1;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2233b;

    /* renamed from: c, reason: collision with root package name */
    public int f2234c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2235d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2236e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2238g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(y yVar, x xVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f2233b = 1;
        this.f2237f = yVar;
        this.f2238g = xVar;
        this.f2235d = (mf.i) function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r12 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object c(Object obj) {
        Typeface typeface;
        LiveTargetRoiView liveTargetRoiView;
        LiveTargetRoiView liveTargetRoiView2;
        Typeface typeface2;
        LiveTargetRoiView liveTargetRoiView3;
        Typeface typeface3;
        LiveTargetRoiView liveTargetRoiView4 = (LiveTargetRoiView) this.f2237f;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f2234c;
        int i10 = 2;
        int i11 = 1;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            lg.e eVar = eg.m0.f9201a;
            lg.d dVar = lg.d.f20063c;
            ve.p pVar = new ve.p((me.d) this.f2238g, continuation, 6);
            this.f2234c = 1;
            obj = eg.c0.A(dVar, pVar, this);
        } else {
            if (i5 != 1) {
                if (i5 == 2) {
                    liveTargetRoiView = (LiveTargetRoiView) this.f2235d;
                    typeface = (Typeface) this.f2236e;
                    h8.b.B(obj);
                    Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                    liveTargetRoiView.L = (String) obj;
                    lg.e eVar2 = eg.m0.f9201a;
                    lg.d dVar2 = lg.d.f20063c;
                    ve.z zVar = new ve.z(liveTargetRoiView4, continuation, i11);
                    this.f2236e = typeface;
                    this.f2235d = liveTargetRoiView4;
                    this.f2234c = 3;
                    obj = eg.c0.A(dVar2, zVar, this);
                    if (obj != aVar) {
                        liveTargetRoiView2 = liveTargetRoiView4;
                        typeface2 = typeface;
                        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                        liveTargetRoiView2.f7649g0 = (String) obj;
                        lg.e eVar3 = eg.m0.f9201a;
                        lg.d dVar3 = lg.d.f20063c;
                        ve.z zVar2 = new ve.z(liveTargetRoiView4, continuation, i10);
                        this.f2236e = typeface2;
                        this.f2235d = liveTargetRoiView4;
                        this.f2234c = 4;
                        obj = eg.c0.A(dVar3, zVar2, this);
                        if (obj != aVar) {
                        }
                    }
                    return aVar;
                }
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    liveTargetRoiView3 = (LiveTargetRoiView) this.f2235d;
                    typeface3 = (Typeface) this.f2236e;
                    h8.b.B(obj);
                    Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                    liveTargetRoiView3.f7653i0 = (String) obj;
                    liveTargetRoiView4.setButtonTypeface(typeface3);
                    liveTargetRoiView4.requestLayout();
                    liveTargetRoiView4.invalidate();
                    return Unit.f19194a;
                }
                liveTargetRoiView2 = (LiveTargetRoiView) this.f2235d;
                typeface2 = (Typeface) this.f2236e;
                h8.b.B(obj);
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                liveTargetRoiView2.f7649g0 = (String) obj;
                lg.e eVar32 = eg.m0.f9201a;
                lg.d dVar32 = lg.d.f20063c;
                ve.z zVar22 = new ve.z(liveTargetRoiView4, continuation, i10);
                this.f2236e = typeface2;
                this.f2235d = liveTargetRoiView4;
                this.f2234c = 4;
                obj = eg.c0.A(dVar32, zVar22, this);
                if (obj != aVar) {
                    liveTargetRoiView3 = liveTargetRoiView4;
                    typeface3 = typeface2;
                    Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                    liveTargetRoiView3.f7653i0 = (String) obj;
                    liveTargetRoiView4.setButtonTypeface(typeface3);
                    liveTargetRoiView4.requestLayout();
                    liveTargetRoiView4.invalidate();
                    return Unit.f19194a;
                }
                return aVar;
            }
            h8.b.B(obj);
        }
        typeface = (Typeface) obj;
        lg.e eVar4 = eg.m0.f9201a;
        lg.d dVar4 = lg.d.f20063c;
        ve.z zVar3 = new ve.z(liveTargetRoiView4, continuation, 0);
        this.f2236e = typeface;
        this.f2235d = liveTargetRoiView4;
        this.f2234c = 2;
        obj = eg.c0.A(dVar4, zVar3, this);
        if (obj != aVar) {
            liveTargetRoiView = liveTargetRoiView4;
            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
            liveTargetRoiView.L = (String) obj;
            lg.e eVar22 = eg.m0.f9201a;
            lg.d dVar22 = lg.d.f20063c;
            ve.z zVar4 = new ve.z(liveTargetRoiView4, continuation, i11);
            this.f2236e = typeface;
            this.f2235d = liveTargetRoiView4;
            this.f2234c = 3;
            obj = eg.c0.A(dVar22, zVar4, this);
            if (obj != aVar) {
            }
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r9 == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        Typeface typeface;
        ve.a0 a0Var;
        ve.a0 a0Var2 = (ve.a0) this.f2237f;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f2234c;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            lg.e eVar = eg.m0.f9201a;
            lg.d dVar = lg.d.f20063c;
            ve.p pVar = new ve.p((qe.a) this.f2238g, continuation, 7);
            this.f2234c = 1;
            obj = eg.c0.A(dVar, pVar, this);
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0Var = (ve.a0) this.f2235d;
                typeface = (Typeface) this.f2236e;
                h8.b.B(obj);
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                a0Var.f24565h = (String) obj;
                a0Var2.setButtonTypeface(typeface);
                a0Var2.requestLayout();
                a0Var2.invalidate();
                return Unit.f19194a;
            }
            h8.b.B(obj);
        }
        typeface = (Typeface) obj;
        lg.e eVar2 = eg.m0.f9201a;
        lg.d dVar2 = lg.d.f20063c;
        q4.r rVar = new q4.r(a0Var2, continuation, 11);
        this.f2236e = typeface;
        this.f2235d = a0Var2;
        this.f2234c = 2;
        obj = eg.c0.A(dVar2, rVar, this);
        if (obj != aVar) {
            a0Var = a0Var2;
            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
            a0Var.f24565h = (String) obj;
            a0Var2.setButtonTypeface(typeface);
            a0Var2.requestLayout();
            a0Var2.invalidate();
            return Unit.f19194a;
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if (r11 != r1) goto L25;
     */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(Object obj) {
        ResponsibleGamingBtn responsibleGamingBtn;
        ResponsibleGamingBtn responsibleGamingBtn2;
        Typeface typeface;
        ResponsibleGamingBtn responsibleGamingBtn3 = (ResponsibleGamingBtn) this.f2235d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f2234c;
        int i10 = 1;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            lg.e eVar = eg.m0.f9201a;
            lg.d dVar = lg.d.f20063c;
            ve.m0 m0Var = new ve.m0(responsibleGamingBtn3, continuation, 0);
            this.f2236e = responsibleGamingBtn3;
            this.f2234c = 1;
            obj = eg.c0.A(dVar, m0Var, this);
            if (obj != aVar) {
                responsibleGamingBtn = responsibleGamingBtn3;
            }
            return aVar;
        }
        if (i5 == 1) {
            responsibleGamingBtn = (ResponsibleGamingBtn) this.f2236e;
            h8.b.B(obj);
        } else {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    typeface = (Typeface) this.f2236e;
                    h8.b.B(obj);
                    responsibleGamingBtn3.setArimoBoldTypeface((Typeface) obj);
                    responsibleGamingBtn3.setArimoRegularTypeface(typeface);
                    responsibleGamingBtn3.requestLayout();
                    responsibleGamingBtn3.invalidate();
                    responsibleGamingBtn3.C = true;
                    return Unit.f19194a;
                }
                h8.b.B(obj);
                Typeface typeface2 = (Typeface) obj;
                lg.e eVar2 = eg.m0.f9201a;
                lg.d dVar2 = lg.d.f20063c;
                ve.a aVar2 = new ve.a(7, null, (AdaptedFunctionReference) this.f2238g);
                this.f2236e = typeface2;
                this.f2234c = 4;
                Object A = eg.c0.A(dVar2, aVar2, this);
                if (A != aVar) {
                    typeface = typeface2;
                    obj = A;
                    responsibleGamingBtn3.setArimoBoldTypeface((Typeface) obj);
                    responsibleGamingBtn3.setArimoRegularTypeface(typeface);
                    responsibleGamingBtn3.requestLayout();
                    responsibleGamingBtn3.invalidate();
                    responsibleGamingBtn3.C = true;
                    return Unit.f19194a;
                }
                return aVar;
            }
            responsibleGamingBtn2 = (ResponsibleGamingBtn) this.f2236e;
            h8.b.B(obj);
            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
            responsibleGamingBtn2.f7867i = (String) obj;
            lg.e eVar3 = eg.m0.f9201a;
            lg.d dVar3 = lg.d.f20063c;
            ve.a aVar3 = new ve.a(8, null, (AdaptedFunctionReference) this.f2237f);
            this.f2236e = null;
            this.f2234c = 3;
            obj = eg.c0.A(dVar3, aVar3, this);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
        responsibleGamingBtn.j = (String) obj;
        lg.e eVar4 = eg.m0.f9201a;
        lg.d dVar4 = lg.d.f20063c;
        ve.m0 m0Var2 = new ve.m0(responsibleGamingBtn3, continuation, i10);
        this.f2236e = responsibleGamingBtn3;
        this.f2234c = 2;
        obj = eg.c0.A(dVar4, m0Var2, this);
        if (obj != aVar) {
            responsibleGamingBtn2 = responsibleGamingBtn3;
            Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
            responsibleGamingBtn2.f7867i = (String) obj;
            lg.e eVar32 = eg.m0.f9201a;
            lg.d dVar32 = lg.d.f20063c;
            ve.a aVar32 = new ve.a(8, null, (AdaptedFunctionReference) this.f2237f);
            this.f2236e = null;
            this.f2234c = 3;
            obj = eg.c0.A(dVar32, aVar32, this);
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        if (r9 == r1) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(Object obj) {
        Typeface typeface;
        Typeface typeface2;
        TelegramBannerView telegramBannerView = (TelegramBannerView) this.f2235d;
        lf.a aVar = lf.a.f20034a;
        int i5 = this.f2234c;
        Continuation continuation = null;
        if (i5 == 0) {
            h8.b.B(obj);
            lg.e eVar = eg.m0.f9201a;
            lg.d dVar = lg.d.f20063c;
            ve.p pVar = new ve.p((qe.b) this.f2237f, continuation, 12);
            this.f2234c = 1;
            obj = eg.c0.A(dVar, pVar, this);
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                typeface = (Typeface) this.f2236e;
                h8.b.B(obj);
                typeface2 = (Typeface) obj;
                if (typeface != null || !Intrinsics.areEqual(telegramBannerView.f7989d, typeface)) {
                    telegramBannerView.f7989d = typeface;
                    TextPaint textPaint = telegramBannerView.I;
                    if (typeface == null) {
                        typeface = Typeface.DEFAULT_BOLD;
                    }
                    textPaint.setTypeface(typeface);
                }
                if (typeface2 != null || !Intrinsics.areEqual(telegramBannerView.f7990e, typeface2)) {
                    telegramBannerView.f7990e = typeface2;
                    TextPaint textPaint2 = telegramBannerView.J;
                    if (typeface2 == null) {
                        typeface2 = Typeface.DEFAULT;
                    }
                    textPaint2.setTypeface(typeface2);
                }
                telegramBannerView.requestLayout();
                telegramBannerView.invalidate();
                return Unit.f19194a;
            }
            h8.b.B(obj);
        }
        Typeface typeface3 = (Typeface) obj;
        lg.e eVar2 = eg.m0.f9201a;
        lg.d dVar2 = lg.d.f20063c;
        ve.p pVar2 = new ve.p((qe.c) this.f2238g, continuation, 13);
        this.f2236e = typeface3;
        this.f2234c = 2;
        Object A = eg.c0.A(dVar2, pVar2, this);
        if (A != aVar) {
            typeface = typeface3;
            obj = A;
            typeface2 = (Typeface) obj;
            if (typeface != null) {
            }
            telegramBannerView.f7989d = typeface;
            TextPaint textPaint3 = telegramBannerView.I;
            if (typeface == null) {
            }
            textPaint3.setTypeface(typeface);
            if (typeface2 != null) {
            }
            telegramBannerView.f7990e = typeface2;
            TextPaint textPaint22 = telegramBannerView.J;
            if (typeface2 == null) {
            }
            textPaint22.setTypeface(typeface2);
            telegramBannerView.requestLayout();
            telegramBannerView.invalidate();
            return Unit.f19194a;
        }
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v14, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function2, mf.i] */
    /* JADX WARN: Type inference failed for: r0v20, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f2233b) {
            case 0:
                return new u0((ng.c) this.f2238g, (Function2) this.f2237f, continuation);
            case 1:
                u0 u0Var = new u0((y) this.f2237f, (x) this.f2238g, (Function2) this.f2235d, continuation);
                u0Var.f2236e = obj;
                return u0Var;
            case 2:
                return new u0((String) this.f2236e, (cd.d) this.f2235d, (Integer) this.f2237f, (String) this.f2238g, continuation, 2);
            case 3:
                return new u0((ed.b) this.f2236e, (String) this.f2235d, (String) this.f2237f, (String) this.f2238g, continuation, 3);
            case 4:
                u0 u0Var2 = new u0((k2.w) this.f2235d, (eg.l) this.f2237f, (c) this.f2238g, continuation, 4);
                u0Var2.f2236e = obj;
                return u0Var2;
            case 5:
                return new u0((la.s0) this.f2238g, continuation, 5);
            case 6:
                u0 u0Var3 = new u0((le.d1) this.f2235d, (String) this.f2237f, (Activity) this.f2238g, continuation, 6);
                u0Var3.f2236e = obj;
                return u0Var3;
            case 7:
                u0 u0Var4 = new u0((f2) this.f2235d, (String) this.f2237f, (Activity) this.f2238g, continuation, 7);
                u0Var4.f2236e = obj;
                return u0Var4;
            case 8:
                return new u0((ec.x) this.f2237f, (Pair) this.f2238g, continuation, 8);
            case 9:
                return new u0((e3.w) this.f2236e, (m3.o) this.f2235d, (n3.r) this.f2237f, (Context) this.f2238g, continuation, 9);
            case 10:
                return new u0((fb.b) this.f2236e, this.f2234c, (String) this.f2235d, (String) this.f2237f, (String) this.f2238g, continuation);
            case 11:
                return new u0((com.android.billingclient.api.m) this.f2236e, (m3.o) this.f2235d, (AtomicInteger) this.f2237f, (g8.b) this.f2238g, continuation, 11);
            case 12:
                return new u0((ConstraintTrackingWorker) this.f2236e, (e3.w) this.f2235d, (com.android.billingclient.api.m) this.f2237f, (m3.o) this.f2238g, continuation, 12);
            case 13:
                return new u0((rc.g) this.f2236e, (String) this.f2235d, (String) this.f2237f, (String) this.f2238g, continuation, 13);
            case 14:
                return new u0((sc.h) this.f2236e, (String) this.f2235d, (String) this.f2237f, (ha.d) this.f2238g, continuation, 14);
            case 15:
                return new u0((ViewCloudFragment) this.f2238g, continuation, 15);
            case 16:
                return new u0((AnalyticsView) this.f2235d, (Function1) this.f2237f, (Function1) this.f2238g, continuation);
            case 17:
                return new u0((ArchiveTargetView) this.f2237f, (me.d) this.f2238g, continuation, 17);
            case 18:
                return new u0((HowToGetABonusBtn) this.f2235d, (me.d) this.f2237f, (me.d) this.f2238g, continuation, 18);
            case 19:
                return new u0((LastGamesNameLabel) this.f2235d, (Function1) this.f2237f, (Function1) this.f2238g, continuation);
            case 20:
                return new u0((LiveTargetRoiView) this.f2237f, (me.d) this.f2238g, continuation, 20);
            case 21:
                return new u0((ve.a0) this.f2237f, (qe.a) this.f2238g, continuation, 21);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return new u0((ResponsibleGamingBtn) this.f2235d, (Function1) this.f2237f, (Function1) this.f2238g, continuation);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return new u0((TelegramBannerView) this.f2235d, (qe.b) this.f2237f, (qe.c) this.f2238g, continuation, 23);
            default:
                return new u0((ve.x0) this.f2237f, (qe.a) this.f2238g, continuation, 24);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f2233b) {
        }
        return ((u0) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0616, code lost:
    
        if (r4 == r3) goto L264;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0443 A[Catch: Exception -> 0x03e9, TryCatch #0 {Exception -> 0x03e9, blocks: (B:161:0x03e5, B:162:0x043d, B:164:0x0443, B:166:0x0446, B:168:0x044c, B:170:0x0455, B:171:0x045d, B:173:0x0463, B:176:0x046e, B:180:0x0475, B:183:0x03f2, B:185:0x0415, B:187:0x041d, B:193:0x0438, B:195:0x03fb), top: B:157:0x03df }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0446 A[Catch: Exception -> 0x03e9, TryCatch #0 {Exception -> 0x03e9, blocks: (B:161:0x03e5, B:162:0x043d, B:164:0x0443, B:166:0x0446, B:168:0x044c, B:170:0x0455, B:171:0x045d, B:173:0x0463, B:176:0x046e, B:180:0x0475, B:183:0x03f2, B:185:0x0415, B:187:0x041d, B:193:0x0438, B:195:0x03fb), top: B:157:0x03df }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:365:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v43, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r5v59, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r6v27, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r6v32, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.AdaptedFunctionReference] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.jvm.functions.Function2, mf.i] */
    @Override // mf.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ng.a aVar;
        Object obj2;
        ng.a aVar2;
        Object A;
        Continuation continuation;
        String c2;
        Object a7;
        Object d10;
        Pair pair;
        String str;
        Object obj3;
        Object A2;
        int intValue;
        Pair pair2;
        Object d11;
        Object d12;
        Object A3;
        TextView textView;
        Pair pair3;
        Object a10;
        Object a11;
        Object A4;
        Object A5;
        String str2;
        Object A6;
        Object A7;
        String str3;
        Map map;
        Object A8;
        String str4;
        WebView webView;
        Object A9;
        AnalyticsView analyticsView;
        Object A10;
        Object A11;
        Typeface typeface;
        Object A12;
        Typeface typeface2;
        Object A13;
        ArchiveTargetView archiveTargetView;
        Object A14;
        HowToGetABonusBtn howToGetABonusBtn;
        Object A15;
        HowToGetABonusBtn howToGetABonusBtn2;
        Object A16;
        Object A17;
        Typeface typeface3;
        Object A18;
        LastGamesNameLabel lastGamesNameLabel;
        Object A19;
        Object A20;
        Typeface typeface4;
        Object A21;
        Typeface typeface5;
        Object A22;
        ve.x0 x0Var;
        int i5 = 8;
        int i10 = 5;
        int i11 = 6;
        int i12 = 4;
        int i13 = 3;
        Continuation continuation2 = null;
        int i14 = 2;
        int i15 = 1;
        switch (this.f2233b) {
            case 0:
                lf.a aVar3 = lf.a.f20034a;
                int i16 = this.f2234c;
                try {
                    if (i16 == 0) {
                        h8.b.B(obj);
                        ng.c cVar = (ng.c) this.f2238g;
                        mf.i iVar = (mf.i) this.f2237f;
                        this.f2236e = cVar;
                        this.f2235d = iVar;
                        this.f2234c = 1;
                        if (cVar.c(this) == aVar3) {
                            return aVar3;
                        }
                        aVar = cVar;
                        obj2 = iVar;
                    } else {
                        if (i16 != 1) {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (ng.a) this.f2236e;
                            try {
                                h8.b.B(obj);
                                Unit unit = Unit.f19194a;
                                aVar2.k(null);
                                return Unit.f19194a;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2.k(null);
                                throw th;
                            }
                        }
                        obj2 = (Function2) ((mf.i) this.f2235d);
                        aVar = (ng.a) this.f2236e;
                        h8.b.B(obj);
                    }
                    c cVar2 = new c(obj2, continuation2, i13);
                    this.f2236e = aVar;
                    this.f2235d = null;
                    this.f2234c = 2;
                    if (eg.c0.i(cVar2, this) == aVar3) {
                        return aVar3;
                    }
                    aVar2 = aVar;
                    Unit unit2 = Unit.f19194a;
                    aVar2.k(null);
                    return Unit.f19194a;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2 = aVar;
                    aVar2.k(null);
                    throw th;
                }
            case 1:
                lf.a aVar4 = lf.a.f20034a;
                int i17 = this.f2234c;
                if (i17 == 0) {
                    h8.b.B(obj);
                    eg.z zVar = (eg.z) this.f2236e;
                    lg.e eVar = eg.m0.f9201a;
                    fg.e eVar2 = jg.q.f18523a.f9624e;
                    w0 w0Var = new w0((y) this.f2237f, (x) this.f2238g, zVar, (mf.i) this.f2235d, null);
                    this.f2234c = 1;
                    if (eg.c0.A(eVar2, w0Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                cd.d dVar = (cd.d) this.f2235d;
                String str5 = (String) this.f2236e;
                lf.a aVar5 = lf.a.f20034a;
                int i18 = this.f2234c;
                if (i18 == 0) {
                    h8.b.B(obj);
                    if (str5 != null) {
                        zc.d.c(str5, "onClickOpenMail");
                    }
                    Instant now = Instant.now();
                    JSONObject jSONObject = new JSONObject();
                    Integer num = (Integer) this.f2237f;
                    String str6 = (String) this.f2238g;
                    jSONObject.put("APPSTORE", "google");
                    jSONObject.put("HARDWARE", Build.HARDWARE);
                    jSONObject.put("PRODUCT", Build.PRODUCT);
                    jSONObject.put("MODEL", Build.MODEL);
                    jSONObject.put("DISPLAY", Build.DISPLAY);
                    jSONObject.put("ANDROID", Build.VERSION.RELEASE);
                    jSONObject.put("VERSION_NAME", "1.2.44.123");
                    jSONObject.put("VERSION_CODE", 123);
                    jSONObject.put("ERROR_CODE", num);
                    String c8 = ((ea.a) y3.m(ea.a.class, null, 6)).c();
                    if (c8 == null) {
                        c8 = ((ea.a) y3.m(ea.a.class, null, 6)).d();
                    }
                    jSONObject.put("DEV_ID", c8);
                    jSONObject.put("TIME_ZONE", ZoneId.systemDefault());
                    long epochMilli = now.toEpochMilli();
                    Intrinsics.checkNotNullExpressionValue(DesugarTimeZone.getTimeZone(ZoneId.systemDefault().getId()), "getTimeZone(...)");
                    jSONObject.put("TIME_Offset", TimeUnit.MILLISECONDS.toHours(r4.getOffset(epochMilli)));
                    jSONObject.put("TIME_LOCAL", LocalDateTime.ofInstant(now, ZoneId.systemDefault()).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
                    jSONObject.put("TIME", LocalDateTime.ofInstant(now, ZoneOffset.ofHours(3)).format(DateTimeFormatter.ISO_DATE_TIME));
                    jSONObject.put("exception", str5);
                    jSONObject.put("state", str6);
                    JSONObject put = new JSONObject().put(String.valueOf(123), jSONObject);
                    this.f2234c = 1;
                    if (dVar.e("SUPPORT_SEND", put, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 3:
                lf.a aVar6 = lf.a.f20034a;
                int i19 = this.f2234c;
                if (i19 == 0) {
                    h8.b.B(obj);
                    ed.b bVar = (ed.b) this.f2236e;
                    JSONObject put2 = new JSONObject().put(AppsFlyerProperties.CHANNEL, (String) this.f2235d).put("TopicName", (String) this.f2237f).put("clickAction", (String) this.f2238g);
                    this.f2234c = 1;
                    if (bVar.e("PushMessaging", put2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 4:
                lf.a aVar7 = lf.a.f20034a;
                int i20 = this.f2234c;
                if (i20 == 0) {
                    h8.b.B(obj);
                    CoroutineContext.Element r5 = ((eg.z) this.f2236e).C().r(kotlin.coroutines.d.f19226f0);
                    Intrinsics.checkNotNull(r5);
                    kotlin.coroutines.d dVar2 = (kotlin.coroutines.d) r5;
                    k2.w wVar = (k2.w) this.f2235d;
                    CoroutineContext c10 = kotlin.coroutines.e.c((kotlin.coroutines.a) dVar2, new k2.z(dVar2));
                    CoroutineContext t3 = c10.t(new jg.z(c10, wVar.f18787i));
                    eg.l lVar = (eg.l) this.f2237f;
                    gf.o oVar = gf.q.f10031a;
                    c cVar3 = (c) this.f2238g;
                    this.f2236e = lVar;
                    this.f2234c = 1;
                    A = eg.c0.A(t3, cVar3, this);
                    if (A == aVar7) {
                        return aVar7;
                    }
                    continuation = lVar;
                } else {
                    if (i20 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    continuation = (Continuation) this.f2236e;
                    h8.b.B(obj);
                    A = obj;
                }
                gf.o oVar2 = gf.q.f10031a;
                continuation.resumeWith(A);
                return Unit.f19194a;
            case 5:
                la.s0 s0Var = (la.s0) this.f2238g;
                lf.a aVar8 = lf.a.f20034a;
                int i21 = this.f2234c;
                Continuation continuation3 = null;
                if (i21 == 0) {
                    h8.b.B(obj);
                    String str7 = gc.d.f9945a;
                    c2 = d2.i.c();
                    this.f2236e = c2;
                    this.f2234c = 1;
                    a7 = la.s0.a(s0Var, c2, this);
                    if (a7 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 == 2) {
                            c2 = (String) this.f2236e;
                            h8.b.B(obj);
                            d10 = obj;
                            String str8 = c2;
                            pair = (Pair) d10;
                            lg.e eVar3 = eg.m0.f9201a;
                            lg.d dVar3 = lg.d.f20063c;
                            o oVar3 = new o(s0Var, pair, str8, continuation3, 23);
                            str = str8;
                            obj3 = null;
                            this.f2236e = str;
                            this.f2235d = pair;
                            this.f2234c = 3;
                            A2 = eg.c0.A(dVar3, oVar3, this);
                            if (A2 == aVar8) {
                                return aVar8;
                            }
                            Pair pair4 = (Pair) A2;
                            intValue = ((Number) pair4.f19192a).intValue();
                            if (intValue != 200) {
                            }
                            pair2 = pair4;
                            pair4 = pair2;
                            return pair4.f19192a;
                        }
                        if (i21 != 3) {
                            if (i21 != 4 && i21 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            pair2 = (Pair) this.f2237f;
                            h8.b.B(obj);
                            pair4 = pair2;
                            return pair4.f19192a;
                        }
                        Pair pair5 = (Pair) this.f2235d;
                        str = (String) this.f2236e;
                        h8.b.B(obj);
                        pair = pair5;
                        obj3 = null;
                        A2 = obj;
                        Pair pair42 = (Pair) A2;
                        intValue = ((Number) pair42.f19192a).intValue();
                        if (intValue != 200) {
                            if (intValue == 204) {
                                this.f2236e = obj3;
                                this.f2235d = obj3;
                                this.f2237f = pair42;
                                this.f2234c = 4;
                                Object i22 = la.s0.i(-1L, str, this);
                                if (i22 != aVar8) {
                                    i22 = Unit.f19194a;
                                }
                                if (i22 == aVar8) {
                                    return aVar8;
                                }
                            }
                            return pair42.f19192a;
                        }
                        long longValue = ((Number) pair.f19192a).longValue();
                        this.f2236e = obj3;
                        this.f2235d = obj3;
                        this.f2237f = pair42;
                        this.f2234c = 5;
                        Object i23 = la.s0.i(longValue, str, this);
                        if (i23 != aVar8) {
                            i23 = Unit.f19194a;
                        }
                        if (i23 == aVar8) {
                            return aVar8;
                        }
                        pair2 = pair42;
                        pair42 = pair2;
                        return pair42.f19192a;
                    }
                    c2 = (String) this.f2236e;
                    h8.b.B(obj);
                    a7 = obj;
                }
                if (((Boolean) a7).booleanValue()) {
                    return new Integer(404);
                }
                this.f2236e = c2;
                this.f2234c = 2;
                d10 = la.s0.d(s0Var, c2, this);
                if (d10 == aVar8) {
                    return aVar8;
                }
                String str82 = c2;
                pair = (Pair) d10;
                lg.e eVar32 = eg.m0.f9201a;
                lg.d dVar32 = lg.d.f20063c;
                o oVar32 = new o(s0Var, pair, str82, continuation3, 23);
                str = str82;
                obj3 = null;
                this.f2236e = str;
                this.f2235d = pair;
                this.f2234c = 3;
                A2 = eg.c0.A(dVar32, oVar32, this);
                if (A2 == aVar8) {
                }
                Pair pair422 = (Pair) A2;
                intValue = ((Number) pair422.f19192a).intValue();
                if (intValue != 200) {
                }
                pair2 = pair422;
                pair422 = pair2;
                return pair422.f19192a;
            case 6:
                le.d1 d1Var = (le.d1) this.f2235d;
                eg.z zVar2 = (eg.z) this.f2236e;
                lf.a aVar9 = lf.a.f20034a;
                int i24 = this.f2234c;
                if (i24 == 0) {
                    h8.b.B(obj);
                    wc.v vVar = d1Var.f19730f;
                    this.f2236e = zVar2;
                    this.f2234c = 1;
                    d11 = vVar.d(this);
                    if (d11 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    d11 = obj;
                }
                if (((Boolean) d11).booleanValue()) {
                    le.d1.q(d1Var, (String) this.f2237f);
                } else {
                    String str9 = (String) this.f2237f;
                    d1Var.f19731g = str9;
                    wc.v vVar2 = d1Var.f19730f;
                    Activity activity = (Activity) this.f2238g;
                    int i25 = d1Var.f19765b;
                    nc.f fVar = d1Var.f19740r;
                    String planId = fVar != null ? fVar.planId() : null;
                    nc.f fVar2 = d1Var.f19740r;
                    vVar2.e(activity, str9, i25, true, planId, fVar2 != null ? fVar2.offerId() : null);
                    eg.c0.e(zVar2, lg.d.f20063c, new le.w0(d1Var, (Activity) this.f2238g, continuation2, i15), 2);
                }
                eg.c0.e(zVar2, null, new le.v0(d1Var, continuation2, i14), 3);
                return Unit.f19194a;
            case 7:
                f2 f2Var = (f2) this.f2235d;
                eg.z zVar3 = (eg.z) this.f2236e;
                lf.a aVar10 = lf.a.f20034a;
                int i26 = this.f2234c;
                if (i26 == 0) {
                    h8.b.B(obj);
                    wc.j0 j0Var = f2Var.f19769f;
                    this.f2236e = zVar3;
                    this.f2234c = 1;
                    d12 = j0Var.d(this);
                    if (d12 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    d12 = obj;
                }
                if (((Boolean) d12).booleanValue()) {
                    f2.q(f2Var, (String) this.f2237f);
                } else {
                    String str10 = (String) this.f2237f;
                    f2Var.f19770g = str10;
                    wc.j0 j0Var2 = f2Var.f19769f;
                    Activity activity2 = (Activity) this.f2238g;
                    int i27 = f2Var.f19765b;
                    nc.f fVar3 = f2Var.f19780s;
                    String planId2 = fVar3 != null ? fVar3.planId() : null;
                    nc.f fVar4 = f2Var.f19780s;
                    j0Var2.e(activity2, str10, i27, true, planId2, fVar4 != null ? fVar4.offerId() : null);
                    eg.c0.e(zVar3, lg.d.f20063c, new z1(f2Var, (Activity) this.f2238g, continuation2, i15), 2);
                }
                eg.c0.e(zVar3, null, new y1(f2Var, continuation2, i14), 3);
                return Unit.f19194a;
            case 8:
                lf.a aVar11 = lf.a.f20034a;
                int i28 = this.f2234c;
                if (i28 == 0) {
                    h8.b.B(obj);
                    TextView textView2 = ((ec.x) this.f2237f).I;
                    Pair pair6 = (Pair) this.f2238g;
                    Resources resources = textView2.getResources();
                    lg.e eVar4 = eg.m0.f9201a;
                    lg.d dVar4 = lg.d.f20063c;
                    ad.a aVar12 = new ad.a(resources, continuation2, 15);
                    this.f2236e = pair6;
                    this.f2235d = textView2;
                    this.f2234c = 1;
                    A3 = eg.c0.A(dVar4, aVar12, this);
                    if (A3 == aVar11) {
                        return aVar11;
                    }
                    textView = textView2;
                    pair3 = pair6;
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    textView = (TextView) this.f2235d;
                    pair3 = (Pair) this.f2236e;
                    h8.b.B(obj);
                    A3 = obj;
                }
                Intrinsics.checkNotNullExpressionValue(A3, "withContext(...)");
                StringBuilder c11 = v.f.c((String) A3, ": ");
                String str11 = (String) pair3.f19193b;
                if (str11 == null) {
                    str11 = "-";
                }
                c11.append(str11);
                textView.setText(c11.toString());
                return Unit.f19194a;
            case 9:
                String str12 = ((m3.o) this.f2235d).f20333c;
                e3.w wVar2 = (e3.w) this.f2236e;
                lf.a aVar13 = lf.a.f20034a;
                int i29 = this.f2234c;
                if (i29 == 0) {
                    h8.b.B(obj);
                    u.k a12 = wVar2.a();
                    Intrinsics.checkNotNullExpressionValue(a12, "getForegroundInfoAsync(...)");
                    this.f2234c = 1;
                    a10 = f3.l0.a(a12, wVar2, this);
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    h8.b.B(obj);
                    a10 = obj;
                }
                e3.p pVar = (e3.p) a10;
                if (pVar == null) {
                    throw new IllegalStateException(androidx.appcompat.widget.c1.n("Worker was marked important (", str12, ") but did not provide ForegroundInfo"));
                }
                String str13 = n3.p.f20846a;
                e3.x.e().a(str13, "Updating notification for " + str12);
                n3.r rVar = (n3.r) this.f2237f;
                Context context = (Context) this.f2238g;
                UUID uuid = wVar2.f8566b.f2917a;
                k2.a0 a0Var = (k2.a0) rVar.f20851a.f6182a;
                n3.q block = new n3.q(rVar, uuid, pVar, context);
                Intrinsics.checkNotNullParameter(a0Var, "<this>");
                Intrinsics.checkNotNullParameter("setForegroundAsync", "debugTag");
                Intrinsics.checkNotNullParameter(block, "block");
                u.k s8 = ci.c.s(new com.google.firebase.messaging.g(i13, a0Var, block));
                Intrinsics.checkNotNullExpressionValue(s8, "getFuture(...)");
                Intrinsics.checkNotNullExpressionValue(s8, "setForegroundAsync(...)");
                this.f2234c = 2;
                Object d13 = y3.d(s8, this);
                if (d13 != aVar13) {
                    return d13;
                }
                return aVar13;
            case 10:
                lf.a aVar14 = lf.a.f20034a;
                h8.b.B(obj);
                pb.e eVar5 = (pb.e) y3.m(pb.e.class, null, 6);
                int i30 = this.f2234c;
                String str14 = (String) this.f2235d;
                String str15 = (String) this.f2237f;
                String language = (String) this.f2238g;
                eVar5.getClass();
                Intrinsics.checkNotNullParameter(language, "language");
                pb.b bVar2 = eVar5.f21602a;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(language, "language");
                k2.w wVar3 = bVar2.f21595a;
                if (((Number) f3.x.n0(wVar3, true, false, new eb.b(i30, i5))).intValue() <= 0) {
                    ((Number) f3.x.n0(wVar3, false, true, new pb.a(i30, str14, str15, i15))).longValue();
                } else if (Intrinsics.areEqual(language, "ru")) {
                    ((Number) f3.x.n0(wVar3, false, true, new pb.a(str14, str15, i30, i14))).intValue();
                } else {
                    ((Number) f3.x.n0(wVar3, false, true, new pb.a(str14, str15, i30, r5))).intValue();
                }
                return Unit.f19194a;
            case 11:
                lf.a aVar15 = lf.a.f20034a;
                int i31 = this.f2234c;
                if (i31 == 0) {
                    h8.b.B(obj);
                    com.android.billingclient.api.m mVar = (com.android.billingclient.api.m) this.f2236e;
                    m3.o oVar4 = (m3.o) this.f2235d;
                    this.f2234c = 1;
                    a11 = p3.f.a(mVar, oVar4, this);
                    if (a11 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i31 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    a11 = obj;
                }
                ((AtomicInteger) this.f2237f).set(((Number) a11).intValue());
                ((g8.b) this.f2238g).cancel(true);
                return Unit.f19194a;
            case 12:
                lf.a aVar16 = lf.a.f20034a;
                int i32 = this.f2234c;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                h8.b.B(obj);
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f2236e;
                e3.w wVar4 = (e3.w) this.f2235d;
                com.android.billingclient.api.m mVar2 = (com.android.billingclient.api.m) this.f2237f;
                m3.o oVar5 = (m3.o) this.f2238g;
                this.f2234c = 1;
                Object d14 = ConstraintTrackingWorker.d(constraintTrackingWorker, wVar4, mVar2, oVar5, this);
                return d14 == aVar16 ? aVar16 : d14;
            case 13:
                lf.a aVar17 = lf.a.f20034a;
                int i33 = this.f2234c;
                if (i33 == 0) {
                    h8.b.B(obj);
                    rc.g gVar = (rc.g) this.f2236e;
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    String str16 = (String) this.f2235d;
                    String str17 = (String) this.f2237f;
                    String str18 = (String) this.f2238g;
                    jSONObject3.put(str16, str17);
                    if (str18 != null && str18.length() != 0 && !StringsKt.H(str18)) {
                        jSONObject3.put("debug", str18);
                    }
                    Unit unit3 = Unit.f19194a;
                    JSONObject put3 = jSONObject2.put("BillingClient", jSONObject3);
                    Intrinsics.checkNotNullExpressionValue(put3, "put(...)");
                    this.f2234c = 1;
                    if (gVar.d(put3, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 14:
                String str19 = (String) this.f2235d;
                sc.h hVar = (sc.h) this.f2236e;
                String str20 = (String) this.f2237f;
                lf.a aVar18 = lf.a.f20034a;
                int i34 = this.f2234c;
                try {
                } catch (Exception ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    jg.d dVar5 = MyApp.f6830c;
                    lg.e eVar6 = eg.m0.f9201a;
                    eg.c0.t(dVar5, lg.d.f20063c, null, new q4.r(ex, continuation2, 18), 2);
                }
                if (i34 == 0) {
                    h8.b.B(obj);
                    rc.r b10 = hVar.b();
                    this.f2234c = 1;
                    b10.getClass();
                    lg.e eVar7 = eg.m0.f9201a;
                    A4 = eg.c0.A(lg.d.f20063c, new rc.m(b10, continuation2, i14), this);
                    if (A4 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i34 != 1) {
                        if (i34 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        if (str20.length() != 0) {
                            return Unit.f19194a;
                        }
                        ha.d dVar6 = (ha.d) this.f2238g;
                        if (dVar6 != null) {
                            HashMap hashMap = new HashMap();
                            String str21 = dVar6.f10452b;
                            if (str21 != null) {
                            }
                            Integer num2 = dVar6.f10460k;
                            hashMap.put("payment", (num2 != null ? num2.intValue() : 0) > 0 ? "CPBilling" : "GBilling");
                            com.logrocket.core.e0.c(str20, hashMap);
                        } else {
                            ExecutorService executorService = com.logrocket.core.e0.f6424a;
                            com.logrocket.core.e0.c(str20, new HashMap());
                        }
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A4 = obj;
                }
                if (!Intrinsics.areEqual((String) A4, str19)) {
                    rc.r b11 = hVar.b();
                    this.f2234c = 2;
                    b11.getClass();
                    lg.e eVar8 = eg.m0.f9201a;
                    Object A23 = eg.c0.A(lg.d.f20063c, new me.y(b11, str19, continuation2, 19), this);
                    if (A23 != aVar18) {
                        A23 = Unit.f19194a;
                    }
                    if (A23 == aVar18) {
                        return aVar18;
                    }
                    if (str20.length() != 0) {
                    }
                }
                return Unit.f19194a;
            case 15:
                ViewCloudFragment viewCloudFragment = (ViewCloudFragment) this.f2238g;
                lf.a aVar19 = lf.a.f20034a;
                int i35 = this.f2234c;
                Continuation continuation4 = null;
                if (i35 == 0) {
                    h8.b.B(obj);
                    lg.e eVar9 = eg.m0.f9201a;
                    lg.d dVar7 = lg.d.f20063c;
                    ue.a aVar20 = new ue.a(viewCloudFragment, continuation4, i15);
                    this.f2234c = 1;
                    A5 = eg.c0.A(dVar7, aVar20, this);
                    if (A5 == aVar19) {
                        return aVar19;
                    }
                } else if (i35 == 1) {
                    h8.b.B(obj);
                    A5 = obj;
                } else {
                    if (i35 != 2) {
                        if (i35 != 3) {
                            if (i35 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str4 = (String) this.f2237f;
                            h8.b.B(obj);
                            A8 = obj;
                            Map<String, String> map2 = (Map) A8;
                            webView = viewCloudFragment.f7067e;
                            if (webView != null) {
                                webView.loadUrl(str4, map2);
                            }
                            return Unit.f19194a;
                        }
                        Map map3 = (Map) this.f2235d;
                        String str22 = (String) this.f2236e;
                        h8.b.B(obj);
                        map = map3;
                        str3 = str22;
                        A7 = obj;
                        String str23 = (String) A7;
                        lg.e eVar10 = eg.m0.f9201a;
                        lg.d dVar8 = lg.d.f20063c;
                        ge.f fVar5 = new ge.f(viewCloudFragment, str3, map, continuation4, 16);
                        this.f2236e = null;
                        this.f2235d = null;
                        this.f2237f = str23;
                        this.f2234c = 4;
                        A8 = eg.c0.A(dVar8, fVar5, this);
                        if (A8 != aVar19) {
                            return aVar19;
                        }
                        str4 = str23;
                        Map<String, String> map22 = (Map) A8;
                        webView = viewCloudFragment.f7067e;
                        if (webView != null) {
                        }
                        return Unit.f19194a;
                    }
                    str2 = (String) this.f2236e;
                    h8.b.B(obj);
                    A6 = obj;
                    Map map4 = (Map) A6;
                    lg.e eVar11 = eg.m0.f9201a;
                    lg.d dVar9 = lg.d.f20063c;
                    q4.r rVar2 = new q4.r(viewCloudFragment, continuation4, i11);
                    this.f2236e = str2;
                    this.f2235d = map4;
                    this.f2234c = 3;
                    A7 = eg.c0.A(dVar9, rVar2, this);
                    if (A7 != aVar19) {
                        return aVar19;
                    }
                    str3 = str2;
                    map = map4;
                    String str232 = (String) A7;
                    lg.e eVar102 = eg.m0.f9201a;
                    lg.d dVar82 = lg.d.f20063c;
                    ge.f fVar52 = new ge.f(viewCloudFragment, str3, map, continuation4, 16);
                    this.f2236e = null;
                    this.f2235d = null;
                    this.f2237f = str232;
                    this.f2234c = 4;
                    A8 = eg.c0.A(dVar82, fVar52, this);
                    if (A8 != aVar19) {
                    }
                }
                str2 = (String) A5;
                if (str2 == null) {
                    viewCloudFragment.f7071i.b();
                    return Unit.f19194a;
                }
                lg.e eVar12 = eg.m0.f9201a;
                lg.d dVar10 = lg.d.f20063c;
                ue.a aVar21 = new ue.a(viewCloudFragment, continuation4, r5);
                this.f2236e = str2;
                this.f2234c = 2;
                A6 = eg.c0.A(dVar10, aVar21, this);
                if (A6 == aVar19) {
                    return aVar19;
                }
                Map map42 = (Map) A6;
                lg.e eVar112 = eg.m0.f9201a;
                lg.d dVar92 = lg.d.f20063c;
                q4.r rVar22 = new q4.r(viewCloudFragment, continuation4, i11);
                this.f2236e = str2;
                this.f2235d = map42;
                this.f2234c = 3;
                A7 = eg.c0.A(dVar92, rVar22, this);
                if (A7 != aVar19) {
                }
            case 16:
                AnalyticsView analyticsView2 = (AnalyticsView) this.f2235d;
                lf.a aVar22 = lf.a.f20034a;
                int i36 = this.f2234c;
                if (i36 == 0) {
                    h8.b.B(obj);
                    lg.e eVar13 = eg.m0.f9201a;
                    lg.d dVar11 = lg.d.f20063c;
                    q4.r rVar3 = new q4.r(analyticsView2, continuation2, 7);
                    this.f2236e = analyticsView2;
                    this.f2234c = 1;
                    A9 = eg.c0.A(dVar11, rVar3, this);
                    if (A9 == aVar22) {
                        return aVar22;
                    }
                    analyticsView = analyticsView2;
                } else {
                    if (i36 != 1) {
                        if (i36 != 2) {
                            if (i36 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            typeface = (Typeface) this.f2236e;
                            h8.b.B(obj);
                            A11 = obj;
                            analyticsView2.setArimoBoldTypeface(typeface);
                            analyticsView2.setArimoRegularTypeface((Typeface) A11);
                            analyticsView2.requestLayout();
                            analyticsView2.invalidate();
                            analyticsView2.f7124v = true;
                            eg.c0.h(analyticsView2.f7123u.f18494a);
                            return Unit.f19194a;
                        }
                        h8.b.B(obj);
                        A10 = obj;
                        Typeface typeface6 = (Typeface) A10;
                        lg.e eVar14 = eg.m0.f9201a;
                        lg.d dVar12 = lg.d.f20063c;
                        ve.a aVar23 = new ve.a(2, null, (AdaptedFunctionReference) this.f2238g);
                        this.f2236e = typeface6;
                        this.f2234c = 3;
                        A11 = eg.c0.A(dVar12, aVar23, this);
                        if (A11 != aVar22) {
                            return aVar22;
                        }
                        typeface = typeface6;
                        analyticsView2.setArimoBoldTypeface(typeface);
                        analyticsView2.setArimoRegularTypeface((Typeface) A11);
                        analyticsView2.requestLayout();
                        analyticsView2.invalidate();
                        analyticsView2.f7124v = true;
                        eg.c0.h(analyticsView2.f7123u.f18494a);
                        return Unit.f19194a;
                    }
                    AnalyticsView analyticsView3 = (AnalyticsView) this.f2236e;
                    h8.b.B(obj);
                    analyticsView = analyticsView3;
                    A9 = obj;
                }
                Intrinsics.checkNotNullExpressionValue(A9, "withContext(...)");
                analyticsView.f7113i = (String) A9;
                lg.e eVar15 = eg.m0.f9201a;
                lg.d dVar13 = lg.d.f20063c;
                ve.a aVar24 = new ve.a(1, null, (AdaptedFunctionReference) this.f2237f);
                this.f2236e = null;
                this.f2234c = 2;
                A10 = eg.c0.A(dVar13, aVar24, this);
                if (A10 == aVar22) {
                    return aVar22;
                }
                Typeface typeface62 = (Typeface) A10;
                lg.e eVar142 = eg.m0.f9201a;
                lg.d dVar122 = lg.d.f20063c;
                ve.a aVar232 = new ve.a(2, null, (AdaptedFunctionReference) this.f2238g);
                this.f2236e = typeface62;
                this.f2234c = 3;
                A11 = eg.c0.A(dVar122, aVar232, this);
                if (A11 != aVar22) {
                }
            case 17:
                ArchiveTargetView archiveTargetView2 = (ArchiveTargetView) this.f2237f;
                lf.a aVar25 = lf.a.f20034a;
                int i37 = this.f2234c;
                if (i37 == 0) {
                    h8.b.B(obj);
                    lg.e eVar16 = eg.m0.f9201a;
                    lg.d dVar14 = lg.d.f20063c;
                    b bVar3 = new b((me.d) this.f2238g, continuation2, 26);
                    this.f2234c = 1;
                    A12 = eg.c0.A(dVar14, bVar3, this);
                    if (A12 == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i37 != 1) {
                        if (i37 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ArchiveTargetView archiveTargetView3 = (ArchiveTargetView) this.f2235d;
                        Typeface typeface7 = (Typeface) this.f2236e;
                        h8.b.B(obj);
                        typeface2 = typeface7;
                        archiveTargetView = archiveTargetView3;
                        A13 = obj;
                        Intrinsics.checkNotNullExpressionValue(A13, "withContext(...)");
                        archiveTargetView.f7135i = (String) A13;
                        archiveTargetView2.setButtonTypeface(typeface2);
                        archiveTargetView2.requestLayout();
                        archiveTargetView2.invalidate();
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A12 = obj;
                }
                typeface2 = (Typeface) A12;
                lg.e eVar17 = eg.m0.f9201a;
                lg.d dVar15 = lg.d.f20063c;
                q4.r rVar4 = new q4.r(archiveTargetView2, continuation2, i5);
                this.f2236e = typeface2;
                this.f2235d = archiveTargetView2;
                this.f2234c = 2;
                A13 = eg.c0.A(dVar15, rVar4, this);
                if (A13 == aVar25) {
                    return aVar25;
                }
                archiveTargetView = archiveTargetView2;
                Intrinsics.checkNotNullExpressionValue(A13, "withContext(...)");
                archiveTargetView.f7135i = (String) A13;
                archiveTargetView2.setButtonTypeface(typeface2);
                archiveTargetView2.requestLayout();
                archiveTargetView2.invalidate();
                return Unit.f19194a;
            case 18:
                HowToGetABonusBtn howToGetABonusBtn3 = (HowToGetABonusBtn) this.f2235d;
                lf.a aVar26 = lf.a.f20034a;
                int i38 = this.f2234c;
                if (i38 == 0) {
                    h8.b.B(obj);
                    lg.e eVar18 = eg.m0.f9201a;
                    lg.d dVar16 = lg.d.f20063c;
                    ve.w wVar5 = new ve.w(howToGetABonusBtn3, continuation2, r5);
                    this.f2236e = howToGetABonusBtn3;
                    this.f2234c = 1;
                    A14 = eg.c0.A(dVar16, wVar5, this);
                    if (A14 == aVar26) {
                        return aVar26;
                    }
                    howToGetABonusBtn = howToGetABonusBtn3;
                } else if (i38 == 1) {
                    HowToGetABonusBtn howToGetABonusBtn4 = (HowToGetABonusBtn) this.f2236e;
                    h8.b.B(obj);
                    howToGetABonusBtn = howToGetABonusBtn4;
                    A14 = obj;
                } else {
                    if (i38 != 2) {
                        if (i38 != 3) {
                            if (i38 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            typeface3 = (Typeface) this.f2236e;
                            h8.b.B(obj);
                            A17 = obj;
                            howToGetABonusBtn3.setArimoBoldTypeface((Typeface) A17);
                            howToGetABonusBtn3.setArimoRegularTypeface(typeface3);
                            howToGetABonusBtn3.requestLayout();
                            howToGetABonusBtn3.invalidate();
                            howToGetABonusBtn3.C = true;
                            return Unit.f19194a;
                        }
                        h8.b.B(obj);
                        A16 = obj;
                        Typeface typeface8 = (Typeface) A16;
                        lg.e eVar19 = eg.m0.f9201a;
                        lg.d dVar17 = lg.d.f20063c;
                        ve.p pVar2 = new ve.p((me.d) this.f2238g, continuation2, i12);
                        this.f2236e = typeface8;
                        this.f2234c = 4;
                        A17 = eg.c0.A(dVar17, pVar2, this);
                        if (A17 == aVar26) {
                            return aVar26;
                        }
                        typeface3 = typeface8;
                        howToGetABonusBtn3.setArimoBoldTypeface((Typeface) A17);
                        howToGetABonusBtn3.setArimoRegularTypeface(typeface3);
                        howToGetABonusBtn3.requestLayout();
                        howToGetABonusBtn3.invalidate();
                        howToGetABonusBtn3.C = true;
                        return Unit.f19194a;
                    }
                    HowToGetABonusBtn howToGetABonusBtn5 = (HowToGetABonusBtn) this.f2236e;
                    h8.b.B(obj);
                    howToGetABonusBtn2 = howToGetABonusBtn5;
                    A15 = obj;
                    Intrinsics.checkNotNullExpressionValue(A15, "withContext(...)");
                    howToGetABonusBtn2.f7539i = (String) A15;
                    lg.e eVar20 = eg.m0.f9201a;
                    lg.d dVar18 = lg.d.f20063c;
                    ve.p pVar3 = new ve.p((me.d) this.f2237f, continuation2, i10);
                    this.f2236e = null;
                    this.f2234c = 3;
                    A16 = eg.c0.A(dVar18, pVar3, this);
                    if (A16 == aVar26) {
                        return aVar26;
                    }
                    Typeface typeface82 = (Typeface) A16;
                    lg.e eVar192 = eg.m0.f9201a;
                    lg.d dVar172 = lg.d.f20063c;
                    ve.p pVar22 = new ve.p((me.d) this.f2238g, continuation2, i12);
                    this.f2236e = typeface82;
                    this.f2234c = 4;
                    A17 = eg.c0.A(dVar172, pVar22, this);
                    if (A17 == aVar26) {
                    }
                }
                Intrinsics.checkNotNullExpressionValue(A14, "withContext(...)");
                howToGetABonusBtn.j = (String) A14;
                lg.e eVar21 = eg.m0.f9201a;
                lg.d dVar19 = lg.d.f20063c;
                ve.w wVar6 = new ve.w(howToGetABonusBtn3, continuation2, i15);
                this.f2236e = howToGetABonusBtn3;
                this.f2234c = 2;
                A15 = eg.c0.A(dVar19, wVar6, this);
                if (A15 == aVar26) {
                    return aVar26;
                }
                howToGetABonusBtn2 = howToGetABonusBtn3;
                Intrinsics.checkNotNullExpressionValue(A15, "withContext(...)");
                howToGetABonusBtn2.f7539i = (String) A15;
                lg.e eVar202 = eg.m0.f9201a;
                lg.d dVar182 = lg.d.f20063c;
                ve.p pVar32 = new ve.p((me.d) this.f2237f, continuation2, i10);
                this.f2236e = null;
                this.f2234c = 3;
                A16 = eg.c0.A(dVar182, pVar32, this);
                if (A16 == aVar26) {
                }
                Typeface typeface822 = (Typeface) A16;
                lg.e eVar1922 = eg.m0.f9201a;
                lg.d dVar1722 = lg.d.f20063c;
                ve.p pVar222 = new ve.p((me.d) this.f2238g, continuation2, i12);
                this.f2236e = typeface822;
                this.f2234c = 4;
                A17 = eg.c0.A(dVar1722, pVar222, this);
                if (A17 == aVar26) {
                }
            case 19:
                LastGamesNameLabel lastGamesNameLabel2 = (LastGamesNameLabel) this.f2235d;
                lf.a aVar27 = lf.a.f20034a;
                int i39 = this.f2234c;
                if (i39 == 0) {
                    h8.b.B(obj);
                    lg.e eVar22 = eg.m0.f9201a;
                    lg.d dVar20 = lg.d.f20063c;
                    q4.r rVar5 = new q4.r(lastGamesNameLabel2, continuation2, 10);
                    this.f2236e = lastGamesNameLabel2;
                    this.f2234c = 1;
                    A18 = eg.c0.A(dVar20, rVar5, this);
                    if (A18 == aVar27) {
                        return aVar27;
                    }
                    lastGamesNameLabel = lastGamesNameLabel2;
                } else {
                    if (i39 != 1) {
                        if (i39 != 2) {
                            if (i39 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            typeface4 = (Typeface) this.f2236e;
                            h8.b.B(obj);
                            A20 = obj;
                            lastGamesNameLabel2.setArimoBoldTypeface((Typeface) A20);
                            lastGamesNameLabel2.setArimoRegularTypeface(typeface4);
                            lastGamesNameLabel2.requestLayout();
                            lastGamesNameLabel2.invalidate();
                            lastGamesNameLabel2.f7579s = true;
                            return Unit.f19194a;
                        }
                        h8.b.B(obj);
                        A19 = obj;
                        Typeface typeface9 = (Typeface) A19;
                        lg.e eVar23 = eg.m0.f9201a;
                        lg.d dVar21 = lg.d.f20063c;
                        ve.a aVar28 = new ve.a(3, null, (AdaptedFunctionReference) this.f2238g);
                        this.f2236e = typeface9;
                        this.f2234c = 3;
                        A20 = eg.c0.A(dVar21, aVar28, this);
                        if (A20 != aVar27) {
                            return aVar27;
                        }
                        typeface4 = typeface9;
                        lastGamesNameLabel2.setArimoBoldTypeface((Typeface) A20);
                        lastGamesNameLabel2.setArimoRegularTypeface(typeface4);
                        lastGamesNameLabel2.requestLayout();
                        lastGamesNameLabel2.invalidate();
                        lastGamesNameLabel2.f7579s = true;
                        return Unit.f19194a;
                    }
                    LastGamesNameLabel lastGamesNameLabel3 = (LastGamesNameLabel) this.f2236e;
                    h8.b.B(obj);
                    lastGamesNameLabel = lastGamesNameLabel3;
                    A18 = obj;
                }
                Intrinsics.checkNotNullExpressionValue(A18, "withContext(...)");
                lastGamesNameLabel.f7563a = (String) A18;
                lg.e eVar24 = eg.m0.f9201a;
                lg.d dVar22 = lg.d.f20063c;
                ve.a aVar29 = new ve.a(4, null, (AdaptedFunctionReference) this.f2237f);
                this.f2236e = null;
                this.f2234c = 2;
                A19 = eg.c0.A(dVar22, aVar29, this);
                if (A19 == aVar27) {
                    return aVar27;
                }
                Typeface typeface92 = (Typeface) A19;
                lg.e eVar232 = eg.m0.f9201a;
                lg.d dVar212 = lg.d.f20063c;
                ve.a aVar282 = new ve.a(3, null, (AdaptedFunctionReference) this.f2238g);
                this.f2236e = typeface92;
                this.f2234c = 3;
                A20 = eg.c0.A(dVar212, aVar282, this);
                if (A20 != aVar27) {
                }
            case 20:
                return c(obj);
            case 21:
                return e(obj);
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return g(obj);
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return h(obj);
            default:
                ve.x0 x0Var2 = (ve.x0) this.f2237f;
                lf.a aVar30 = lf.a.f20034a;
                int i40 = this.f2234c;
                int i41 = 14;
                if (i40 == 0) {
                    h8.b.B(obj);
                    lg.e eVar25 = eg.m0.f9201a;
                    lg.d dVar23 = lg.d.f20063c;
                    ve.p pVar4 = new ve.p((qe.a) this.f2238g, continuation2, i41);
                    this.f2234c = 1;
                    A21 = eg.c0.A(dVar23, pVar4, this);
                    if (A21 == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i40 != 1) {
                        if (i40 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        x0Var = (ve.x0) this.f2235d;
                        typeface5 = (Typeface) this.f2236e;
                        h8.b.B(obj);
                        A22 = obj;
                        Intrinsics.checkNotNullExpressionValue(A22, "withContext(...)");
                        x0Var.f24924h = (String) A22;
                        x0Var2.setButtonTypeface(typeface5);
                        x0Var2.requestLayout();
                        x0Var2.invalidate();
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                    A21 = obj;
                }
                typeface5 = (Typeface) A21;
                lg.e eVar26 = eg.m0.f9201a;
                lg.d dVar24 = lg.d.f20063c;
                q4.r rVar6 = new q4.r(x0Var2, continuation2, i41);
                this.f2236e = typeface5;
                this.f2235d = x0Var2;
                this.f2234c = 2;
                A22 = eg.c0.A(dVar24, rVar6, this);
                if (A22 == aVar30) {
                    return aVar30;
                }
                x0Var = x0Var2;
                Intrinsics.checkNotNullExpressionValue(A22, "withContext(...)");
                x0Var.f24924h = (String) A22;
                x0Var2.setButtonTypeface(typeface5);
                x0Var2.requestLayout();
                x0Var2.invalidate();
                return Unit.f19194a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(AnalyticsView analyticsView, Function1 function1, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.f2233b = 16;
        this.f2235d = analyticsView;
        this.f2237f = (AdaptedFunctionReference) function1;
        this.f2238g = (AdaptedFunctionReference) function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(LastGamesNameLabel lastGamesNameLabel, Function1 function1, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.f2233b = 19;
        this.f2235d = lastGamesNameLabel;
        this.f2237f = (AdaptedFunctionReference) function1;
        this.f2238g = (AdaptedFunctionReference) function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(ResponsibleGamingBtn responsibleGamingBtn, Function1 function1, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.f2233b = 22;
        this.f2235d = responsibleGamingBtn;
        this.f2237f = (AdaptedFunctionReference) function1;
        this.f2238g = (AdaptedFunctionReference) function12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(fb.b bVar, int i5, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f2233b = 10;
        this.f2236e = bVar;
        this.f2234c = i5;
        this.f2235d = str;
        this.f2237f = str2;
        this.f2238g = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, Serializable serializable, Continuation continuation, int i5) {
        super(2, continuation);
        this.f2233b = i5;
        this.f2237f = obj;
        this.f2238g = serializable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i5) {
        super(2, continuation);
        this.f2233b = i5;
        this.f2236e = obj;
        this.f2235d = obj2;
        this.f2237f = obj3;
        this.f2238g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, Object obj2, Object obj3, Continuation continuation, int i5) {
        super(2, continuation);
        this.f2233b = i5;
        this.f2235d = obj;
        this.f2237f = obj2;
        this.f2238g = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, Continuation continuation, int i5) {
        super(2, continuation);
        this.f2233b = i5;
        this.f2238g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u0(ng.c cVar, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f2233b = 0;
        this.f2238g = cVar;
        this.f2237f = (mf.i) function2;
    }
}
