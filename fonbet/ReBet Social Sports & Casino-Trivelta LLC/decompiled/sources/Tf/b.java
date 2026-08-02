package Tf;

import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.P;
import Sf.c;
import a1.C1908a;
import android.app.Application;
import android.content.Intent;
import com.zoho.livechat.android.modules.conversations.data.local.entities.WaitingChatDetails;
import com.zoho.livechat.android.modules.triggers.data.TriggersRepository;
import com.zoho.livechat.android.modules.triggers.domain.entities.Trigger;
import com.zoho.livechat.android.modules.triggers.domain.entities.TriggerAlarm;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import com.zoho.salesiqembed.android.tracking.UTSUtil;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import me.C5582a;
import rd.C6218a;
import td.C6461a;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f11754a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f11755b = LazyKt.lazy(k.f11794d);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f11756c = LazyKt.lazy(l.f11795d);

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f11757d = LazyKt.lazy(g.f11790d);

    /* renamed from: e, reason: collision with root package name */
    public static final Lazy f11758e = LazyKt.lazy(c.f11768d);

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f11759f = LazyKt.lazy(d.f11769d);

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f11760g = LazyKt.lazy(C0231b.f11767d);

    /* renamed from: h, reason: collision with root package name */
    public static final Lazy f11761h = LazyKt.lazy(h.f11791d);

    /* renamed from: i, reason: collision with root package name */
    public static final Lazy f11762i = LazyKt.lazy(i.f11792d);

    /* renamed from: j, reason: collision with root package name */
    public static final Lazy f11763j = LazyKt.lazy(a.f11766d);

    /* renamed from: k, reason: collision with root package name */
    public static String f11764k;

    /* renamed from: l, reason: collision with root package name */
    public static Boolean f11765l;

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f11766d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sf.a invoke() {
            return new Sf.a(b.f11754a.C());
        }
    }

    /* renamed from: Tf.b$b, reason: collision with other inner class name */
    public static final class C0231b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0231b f11767d = new C0231b();

        public C0231b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sf.b invoke() {
            return new Sf.b(b.f11754a.C());
        }
    }

    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f11768d = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sf.c invoke() {
            return new Sf.c(b.f11754a.C());
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f11769d = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sf.d invoke() {
            return new Sf.d(b.f11754a.C());
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11770n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Rf.a f11771o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f11772p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f11773q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f11774r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f11775s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f11776t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f11777u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f11778v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f11779w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Rf.a aVar, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, Continuation continuation) {
            super(2, continuation);
            this.f11771o = aVar;
            this.f11772p = str;
            this.f11773q = str2;
            this.f11774r = str3;
            this.f11775s = str4;
            this.f11776t = str5;
            this.f11777u = z10;
            this.f11778v = z11;
            this.f11779w = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new e(this.f11771o, this.f11772p, this.f11773q, this.f11774r, this.f11775s, this.f11776t, this.f11777u, this.f11778v, this.f11779w, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11770n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar = b.f11754a;
                Rf.a aVar = this.f11771o;
                String str = this.f11772p;
                String str2 = this.f11773q;
                String str3 = this.f11774r;
                String str4 = this.f11775s;
                String str5 = this.f11776t;
                boolean z10 = this.f11777u;
                boolean z11 = this.f11778v;
                boolean z12 = this.f11779w;
                this.f11770n = 1;
                if (b.F(bVar, aVar, str, str2, str3, str4, str5, z10, z11, z12, false, false, this, 1536, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11780n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Rf.a f11781o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f11782p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f11783q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f11784r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f11785s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f11786t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ boolean f11787u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f11788v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f11789w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Rf.a aVar, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, Continuation continuation) {
            super(2, continuation);
            this.f11781o = aVar;
            this.f11782p = str;
            this.f11783q = str2;
            this.f11784r = str3;
            this.f11785s = str4;
            this.f11786t = str5;
            this.f11787u = z10;
            this.f11788v = z11;
            this.f11789w = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f11781o, this.f11782p, this.f11783q, this.f11784r, this.f11785s, this.f11786t, this.f11787u, this.f11788v, this.f11789w, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11780n;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            b bVar = b.f11754a;
            Rf.a aVar = this.f11781o;
            String str = this.f11782p;
            String str2 = this.f11783q;
            String str3 = this.f11784r;
            String str4 = this.f11785s;
            String str5 = this.f11786t;
            boolean z10 = this.f11787u;
            boolean z11 = this.f11788v;
            boolean z12 = this.f11789w;
            this.f11780n = 1;
            Object F10 = b.F(bVar, aVar, str, str2, str3, str4, str5, z10, z11, false, false, z12, this, 768, null);
            return F10 == coroutine_suspended ? coroutine_suspended : F10;
        }
    }

    public static final class g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f11790d = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sf.e invoke() {
            return new Sf.e(b.f11754a.C());
        }
    }

    public static final class h extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final h f11791d = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sf.g invoke() {
            return new Sf.g(b.f11754a.C());
        }
    }

    public static final class i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final i f11792d = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Sf.h invoke() {
            return new Sf.h(b.f11754a.C());
        }
    }

    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11793n;

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((j) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f11793n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar = b.f11754a;
                Rf.a aVar = Rf.a.Clicked;
                Trigger A10 = b.A(bVar, aVar, null, null, 4, null);
                if (A10 != null) {
                    if (A10.getParams() == null) {
                        A10.getAction();
                    }
                    return Unit.INSTANCE;
                }
                String a10 = ZohoSalesIQ.m.a(Uf.j.n());
                String language = LiveChatUtil.getLanguage();
                this.f11793n = 1;
                if (b.F(bVar, aVar, null, null, null, a10, language, false, true, false, false, false, this, 1536, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class k extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final k f11794d = new k();

        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ConcurrentHashMap invoke() {
            return new ConcurrentHashMap();
        }
    }

    public static final class l extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final l f11795d = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TriggersRepository invoke() {
            return TriggersRepository.f44142g.a(b.f11754a.k());
        }
    }

    public static /* synthetic */ Trigger A(b bVar, Rf.a aVar, String str, c.a aVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            aVar2 = c.a.CacheAndPreferences;
        }
        return bVar.z(aVar, str, aVar2);
    }

    public static final WaitingChatDetails D(String str) {
        b bVar = f11754a;
        return (WaitingChatDetails) bVar.B().get(bVar.M(str));
    }

    public static /* synthetic */ Object F(b bVar, Rf.a aVar, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 128) != 0) {
            z11 = false;
        }
        if ((i10 & 256) != 0) {
            z12 = false;
        }
        if ((i10 & 512) != 0) {
            z13 = false;
        }
        if ((i10 & 1024) != 0) {
            z14 = false;
        }
        return bVar.E(aVar, str, str2, str3, str4, str5, z10, z11, z12, z13, z14, continuation);
    }

    public static final void G(Rf.a actionType, String str, boolean z10, String str2, String str3, String str4, String str5, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        AbstractC1459k.d(f11754a.j(), null, null, new e(actionType, str2, str3, str4, str5, str, z10, z11, z12, null), 3, null);
    }

    public static /* synthetic */ void H(Rf.a aVar, String str, boolean z10, String str2, String str3, String str4, String str5, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        if ((i10 & 64) != 0) {
            str5 = null;
        }
        if ((i10 & 128) != 0) {
            z11 = false;
        }
        if ((i10 & 256) != 0) {
            z12 = false;
        }
        G(aVar, str, z10, str2, str3, str4, str5, z11, z12);
    }

    public static final C5582a I(Rf.a actionType, String str, boolean z10, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return K(actionType, str, z10, str2, str3, str4, str5, false, false, 384, null);
    }

    public static final C5582a J(Rf.a actionType, String str, boolean z10, String str2, String str3, String str4, String str5, boolean z11, boolean z12) {
        Object b10;
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        b10 = AbstractC1457j.b(null, new f(actionType, str2, str3, str4, str5, str, z10, z11, z12, null), 1, null);
        return (C5582a) b10;
    }

    public static /* synthetic */ C5582a K(Rf.a aVar, String str, boolean z10, String str2, String str3, String str4, String str5, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if ((i10 & 16) != 0) {
            str3 = null;
        }
        if ((i10 & 32) != 0) {
            str4 = null;
        }
        if ((i10 & 64) != 0) {
            str5 = null;
        }
        if ((i10 & 128) != 0) {
            z11 = false;
        }
        if ((i10 & 256) != 0) {
            z12 = false;
        }
        return J(aVar, str, z10, str2, str3, str4, str5, z11, z12);
    }

    public static final C5582a N(Rf.a actionType) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return f11754a.u().a(actionType);
    }

    public static final void O(String str) {
        b bVar = f11754a;
        bVar.B().remove(bVar.M(str));
    }

    public static final void P(String str) {
        f11764k = str;
    }

    public static final C5582a Q(Rf.a actionType, String encryptedVisitorInfo) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(encryptedVisitorInfo, "encryptedVisitorInfo");
        return f11754a.y().a(actionType, encryptedVisitorInfo);
    }

    public static final void R(Boolean bool) {
        f11765l = bool;
    }

    public static final void S() {
        if (UTSUtil.isTrackingEnabled()) {
            return;
        }
        AbstractC1459k.d(f11754a.j(), null, null, new j(null), 3, null);
    }

    public static final void d(String str, WaitingChatDetails waitingChatDetails) {
        Intrinsics.checkNotNullParameter(waitingChatDetails, "waitingChatDetails");
        b bVar = f11754a;
        bVar.B().put(bVar.M(str), waitingChatDetails);
    }

    public static final void f(WaitingChatDetails waitingChatDetails, boolean z10) {
        Intrinsics.checkNotNullParameter(waitingChatDetails, "$waitingChatDetails");
        Intent intent = new Intent("receivelivechat");
        intent.putExtra("message", "triggered_chat");
        intent.putExtra("has_to_wait", true);
        if (waitingChatDetails.getAttenderId() != null) {
            intent.putExtra("bot_id", waitingChatDetails.getAttenderId());
        }
        if (waitingChatDetails.getAttenderName() != null) {
            intent.putExtra("bot_name", waitingChatDetails.getAttenderName());
        }
        intent.putExtra("is_intelligent_trigger", waitingChatDetails.isIntelligentTrigger());
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        C1908a.b(e10).d(intent);
        C6218a.g0(null);
    }

    public static final boolean g(Rf.a actionType, String str) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        C5582a b10 = Sf.c.b(f11754a.q(), actionType, str, null, 4, null);
        return b10.d() ? b10.b() != null : !UTSUtil.isTrackingEnabled();
    }

    public static /* synthetic */ boolean h(Rf.a aVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return g(aVar, str);
    }

    public static final C5582a i() {
        return f11754a.m().a();
    }

    public static final String n() {
        return f11764k;
    }

    public static final String o(Rf.a actionType) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Rf.b bVar = (Rf.b) f11754a.r().a(actionType).b();
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public static final Boolean s() {
        return f11765l;
    }

    public static final TriggerAlarm v(Rf.a actionType, String str) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return x(actionType, str, null, 4, null);
    }

    public static final TriggerAlarm w(Rf.a actionType, String str, Long l10) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        return (TriggerAlarm) f11754a.p().a(actionType, str, l10).b();
    }

    public static /* synthetic */ TriggerAlarm x(Rf.a aVar, String str, Long l10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            l10 = null;
        }
        return w(aVar, str, l10);
    }

    public final ConcurrentHashMap B() {
        return (ConcurrentHashMap) f11755b.getValue();
    }

    public final TriggersRepository C() {
        return (TriggersRepository) f11756c.getValue();
    }

    public final Object E(Rf.a aVar, String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, Continuation continuation) {
        return t().a(aVar, str, str2, str3, str4, str5, z10, z11, z12, z13, z14, continuation);
    }

    public final boolean L() {
        return og.i.i((Boolean) q().c().b());
    }

    public final String M(String str) {
        return str == null ? "default_trigger_waiting_chat_details" : str;
    }

    public final void e(final WaitingChatDetails waitingChatDetails) {
        Intrinsics.checkNotNullParameter(waitingChatDetails, "waitingChatDetails");
        C6218a.g0(new C6218a.InterfaceC0890a() { // from class: Tf.a
            @Override // rd.C6218a.InterfaceC0890a
            public final void a(boolean z10) {
                b.f(WaitingChatDetails.this, z10);
            }
        });
    }

    public final P j() {
        return C6461a.f65810a.e();
    }

    public final Application k() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final long l() {
        Long longOrNull;
        String property = System.getProperty("default_trigger_waiting_duration", "5000");
        if (property == null || (longOrNull = StringsKt.toLongOrNull(property)) == null) {
            return 5000L;
        }
        return longOrNull.longValue();
    }

    public final Sf.a m() {
        return (Sf.a) f11763j.getValue();
    }

    public final Sf.b p() {
        return (Sf.b) f11760g.getValue();
    }

    public final Sf.c q() {
        return (Sf.c) f11758e.getValue();
    }

    public final Sf.d r() {
        return (Sf.d) f11759f.getValue();
    }

    public final Sf.e t() {
        return (Sf.e) f11757d.getValue();
    }

    public final Sf.g u() {
        return (Sf.g) f11761h.getValue();
    }

    public final Sf.h y() {
        return (Sf.h) f11762i.getValue();
    }

    public final Trigger z(Rf.a actionType, String str, c.a dataSource) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        return (Trigger) q().a(actionType, str, dataSource).b();
    }
}
