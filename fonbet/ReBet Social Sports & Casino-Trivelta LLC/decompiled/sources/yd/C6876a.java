package yd;

import Ph.AbstractC1455i;
import Ph.O0;
import Ph.P;
import android.app.Application;
import android.content.SharedPreferences;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.listeners.SalesIQListener;
import com.zoho.livechat.android.modules.authentication.data.local.entities.AnnonAuthResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import ie.b;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import me.C5582a;
import ne.l;
import we.d;
import zd.C6958a;

/* renamed from: yd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6876a implements Cd.a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0975a f68336f = new C0975a(null);

    /* renamed from: g, reason: collision with root package name */
    public static C6876a f68337g;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f68338a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f68339b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f68340c;

    /* renamed from: d, reason: collision with root package name */
    public Fd.a f68341d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f68342e;

    /* renamed from: yd.a$a, reason: collision with other inner class name */
    public static final class C0975a {
        public /* synthetic */ C0975a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6876a a() {
            C6876a c6876a;
            synchronized (this) {
                c6876a = C6876a.f68337g;
                if (c6876a == null) {
                    c6876a = new C6876a(null);
                    C6876a.f68337g = c6876a;
                }
            }
            return c6876a;
        }

        public final long b() {
            Long longOrNull;
            String property = System.getProperty("jwt_expiry_reduction_duration", null);
            if (property == null || (longOrNull = StringsKt.toLongOrNull(property)) == null) {
                return 120000L;
            }
            return longOrNull.longValue();
        }

        public C0975a() {
        }
    }

    /* renamed from: yd.a$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bd.a.values().length];
            try {
                iArr[Bd.a.Renewal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bd.a.ApiCallValidation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bd.a.Initialisation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: yd.a$c */
    public static final class c implements Fd.a {
        public c() {
        }
    }

    /* renamed from: yd.a$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f68344n;

        /* renamed from: o, reason: collision with root package name */
        public Object f68345o;

        /* renamed from: p, reason: collision with root package name */
        public Object f68346p;

        /* renamed from: q, reason: collision with root package name */
        public Object f68347q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f68348r;

        /* renamed from: t, reason: collision with root package name */
        public int f68350t;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68348r = obj;
            this.f68350t |= Integer.MIN_VALUE;
            return C6876a.this.c(null, null, this);
        }
    }

    /* renamed from: yd.a$e */
    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f68351n;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C6876a.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68351n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C6876a.this.f68342e = false;
            return Unit.INSTANCE;
        }
    }

    /* renamed from: yd.a$f */
    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f68353d = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C6958a invoke() {
            return new C6958a();
        }
    }

    /* renamed from: yd.a$g */
    public static final class g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final g f68354d = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ad.b invoke() {
            return new Ad.b();
        }
    }

    /* renamed from: yd.a$h */
    public static final class h extends Lambda implements Function0 {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Ae.a invoke() {
            return Ae.a.f447b.b(C6876a.this.p());
        }
    }

    /* renamed from: yd.a$i */
    public static final class i extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f68356n;

        /* renamed from: p, reason: collision with root package name */
        public int f68358p;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68356n = obj;
            this.f68358p |= Integer.MIN_VALUE;
            return C6876a.this.a(this);
        }
    }

    /* renamed from: yd.a$j */
    public static final class j extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f68359n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f68360o;

        /* renamed from: q, reason: collision with root package name */
        public int f68362q;

        public j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68360o = obj;
            this.f68362q |= Integer.MIN_VALUE;
            return C6876a.this.v(null, this);
        }
    }

    /* renamed from: yd.a$k */
    public static final class k extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f68363n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f68364o;

        /* renamed from: q, reason: collision with root package name */
        public int f68366q;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68364o = obj;
            this.f68366q |= Integer.MIN_VALUE;
            return C6876a.this.i(this);
        }
    }

    public /* synthetic */ C6876a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // Cd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Continuation continuation) {
        i iVar;
        int i10;
        String token;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f68358p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f68358p = i11 - Integer.MIN_VALUE;
                Object obj = iVar.f68356n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = iVar.f68358p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String I10 = t().I();
                    String V10 = t().V();
                    if (I10 == null || I10.length() == 0 || V10 == null || V10.length() == 0) {
                        l.f(new b.k("Screen name or Visitor WMS ID is null or empty. ScreenName: " + I10 + ", VisitorWmsId: " + V10));
                        return C5582a.C0817a.c(C5582a.f56502b, new Exception("Screen name or Visitor WMS ID is null or empty."), false, 2, null);
                    }
                    Ad.b s10 = s();
                    String T10 = t().T();
                    iVar.f68358p = 1;
                    obj = s10.c(I10, V10, T10, iVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SalesIQResponse salesIQResponse = (SalesIQResponse) obj;
                AnnonAuthResponse annonAuthResponse = (AnnonAuthResponse) salesIQResponse.getData();
                token = annonAuthResponse != null ? annonAuthResponse.getToken() : null;
                if (token == null) {
                    token = "";
                }
                return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse, token, null, 0, false, null, null, null, 126, null));
            }
        }
        iVar = new i(continuation);
        Object obj2 = iVar.f68356n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = iVar.f68358p;
        if (i10 != 0) {
        }
        SalesIQResponse salesIQResponse2 = (SalesIQResponse) obj2;
        AnnonAuthResponse annonAuthResponse2 = (AnnonAuthResponse) salesIQResponse2.getData();
        if (annonAuthResponse2 != null) {
        }
        if (token == null) {
        }
        return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, token, null, 0, false, null, null, null, 126, null));
    }

    @Override // Cd.a
    public C5582a b() {
        long f10 = rd.b.f();
        Long l10 = (Long) Ae.a.C(t(), De.a.JwtAccessTokenExpiryTime, 0L, 2, null).b();
        return C5582a.f56502b.d(Boolean.valueOf(l10 != null && f10 + f68336f.b() < l10.longValue()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x012e, code lost:
    
        if (v(r23, r3) == r4) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // Cd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Bd.b bVar, Bd.a aVar, Continuation continuation) {
        d dVar;
        int i10;
        C5582a c10;
        C6876a c6876a;
        C6876a c6876a2;
        Object obj;
        String str;
        Bd.b bVar2;
        C6876a c6876a3;
        C5582a b10;
        SalesIQResponse salesIQResponse;
        SalesIQResponse salesIQResponse2;
        C6876a c6876a4;
        SalesIQListener listener;
        Bd.a aVar2 = aVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f68350t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f68350t = i11 - Integer.MIN_VALUE;
                Object obj2 = dVar.f68348r;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f68350t;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (this.f68342e) {
                        return C5582a.f56502b.b(new C5582a.b("JWT Authentication is already in progress", Boxing.boxInt(6301), null, 4, null));
                    }
                    this.f68342e = true;
                    String I10 = t().I();
                    String h10 = t().h();
                    if (I10 == null || I10.length() == 0 || h10 == null || h10.length() == 0) {
                        c10 = C5582a.C0817a.c(C5582a.f56502b, new Exception("Screen name or app id is null or empty."), false, 2, null);
                    } else if (bVar.getToken().length() == 0) {
                        c10 = C5582a.f56502b.b(new C5582a.b("Token must not be empty.", Boxing.boxInt(6302), null, 4, null));
                    } else {
                        boolean x10 = x(bVar.getToken());
                        if (!x10 || !Intrinsics.areEqual(b().b(), Boxing.boxBoolean(true))) {
                            if (aVar2 != Bd.a.Initialisation && x10 && w()) {
                                this.f68342e = false;
                                if (aVar2 == Bd.a.Renewal) {
                                    SalesIQListener listener2 = ZohoLiveChat.getListener();
                                    if (listener2 != null) {
                                        listener2.onAuthTokenRenewalError(we.d.f67631M);
                                    }
                                } else {
                                    dVar.f68344n = this;
                                    dVar.f68350t = 1;
                                }
                                c6876a3 = this;
                                b10 = C5582a.f56502b.b(new C5582a.b("Provided JWT Token has been Expired.", Boxing.boxInt(6205), null, 4, null));
                                C5582a c5582a = b10;
                                c6876a = c6876a3;
                                c10 = c5582a;
                            } else {
                                String str2 = (String) t().M(De.a.JwtVisitorUniqueId, null).b();
                                Ad.b s10 = s();
                                String token = bVar.getToken();
                                dVar.f68344n = this;
                                dVar.f68345o = bVar;
                                dVar.f68346p = aVar2;
                                dVar.f68347q = str2;
                                dVar.f68350t = 2;
                                Object a10 = s10.a(I10, h10, token, dVar);
                                if (a10 != coroutine_suspended) {
                                    c6876a2 = this;
                                    obj = a10;
                                    str = str2;
                                    bVar2 = bVar;
                                    salesIQResponse = (SalesIQResponse) obj;
                                    if (salesIQResponse.getIsSuccess()) {
                                        android.support.v4.media.session.b.a(salesIQResponse.getData());
                                        if (!Intrinsics.areEqual(str, (Object) null)) {
                                        }
                                    }
                                    if (!salesIQResponse.getIsSuccess()) {
                                    }
                                }
                            }
                        }
                        c10 = C5582a.C0817a.e(C5582a.f56502b, null, 1, null);
                    }
                    c6876a = this;
                } else if (i10 == 1) {
                    c6876a3 = (C6876a) dVar.f68344n;
                    ResultKt.throwOnFailure(obj2);
                    b10 = C5582a.f56502b.b(new C5582a.b("Provided JWT Token has been Expired.", Boxing.boxInt(6205), null, 4, null));
                    C5582a c5582a2 = b10;
                    c6876a = c6876a3;
                    c10 = c5582a2;
                } else if (i10 == 2) {
                    String str3 = (String) dVar.f68347q;
                    Bd.a aVar3 = (Bd.a) dVar.f68346p;
                    bVar2 = (Bd.b) dVar.f68345o;
                    c6876a2 = (C6876a) dVar.f68344n;
                    ResultKt.throwOnFailure(obj2);
                    str = str3;
                    aVar2 = aVar3;
                    obj = obj2;
                    salesIQResponse = (SalesIQResponse) obj;
                    if (salesIQResponse.getIsSuccess() && str != null) {
                        android.support.v4.media.session.b.a(salesIQResponse.getData());
                        if (!Intrinsics.areEqual(str, (Object) null)) {
                            c6876a2.f68342e = false;
                            if (aVar2 == Bd.a.Renewal && (listener = ZohoLiveChat.getListener()) != null) {
                                listener.onAuthTokenRenewalError(we.d.f67633O);
                            }
                            return C5582a.f56502b.b(new C5582a.b("Provided token belongs to another visitor, Please deinit and retry or provide a valid token.", Boxing.boxInt(6300), null, 4, null));
                        }
                    }
                    if (!salesIQResponse.getIsSuccess()) {
                        android.support.v4.media.session.b.a(salesIQResponse.getData());
                        c6876a2.t().w().edit().putString(Ce.a.a(De.a.JwtRefreshToken), bVar2.getToken());
                        Ce.a.a(De.a.JwtAccessToken);
                        throw null;
                    }
                    if (!salesIQResponse.getIsSuccess()) {
                        SalesIQResponse.Error error = salesIQResponse.getError();
                        if (error == null) {
                            error = new SalesIQResponse.Error(null, new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(-1), "Error is null")), null, 5, null);
                        }
                        if (error.a() == null || !(error.a() instanceof CancellationException)) {
                            int i12 = b.$EnumSwitchMapping$0[aVar2.ordinal()];
                            if (i12 == 1) {
                                SalesIQListener listener3 = ZohoLiveChat.getListener();
                                if (listener3 != null) {
                                    Integer b11 = error.b();
                                    listener3.onAuthTokenRenewalError(new d.b(b11 != null ? b11.intValue() : -1, error.d()));
                                }
                            } else {
                                if (i12 == 2) {
                                    dVar.f68344n = c6876a2;
                                    dVar.f68345o = salesIQResponse;
                                    dVar.f68346p = salesIQResponse;
                                    dVar.f68347q = null;
                                    dVar.f68350t = 3;
                                    if (c6876a2.v(c6876a2, dVar) != coroutine_suspended) {
                                        salesIQResponse2 = salesIQResponse;
                                        c6876a4 = c6876a2;
                                        c6876a2 = c6876a4;
                                        salesIQResponse = salesIQResponse2;
                                    }
                                }
                                if (i12 == 3) {
                                    c6876a2.r().b(null);
                                }
                            }
                        }
                    }
                    c6876a3 = c6876a2;
                    b10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
                    C5582a c5582a22 = b10;
                    c6876a = c6876a3;
                    c10 = c5582a22;
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5582a c5582a3 = (C5582a) dVar.f68344n;
                        ResultKt.throwOnFailure(obj2);
                        return c5582a3;
                    }
                    salesIQResponse2 = (SalesIQResponse) dVar.f68345o;
                    c6876a4 = (C6876a) dVar.f68344n;
                    ResultKt.throwOnFailure(obj2);
                    c6876a2 = c6876a4;
                    salesIQResponse = salesIQResponse2;
                    c6876a3 = c6876a2;
                    b10 = com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
                    C5582a c5582a222 = b10;
                    c6876a = c6876a3;
                    c10 = c5582a222;
                }
                O0 o02 = O0.f9045a;
                e eVar = c6876a.new e(null);
                dVar.f68344n = c10;
                dVar.f68345o = null;
                dVar.f68346p = null;
                dVar.f68347q = null;
                dVar.f68350t = 4;
                return AbstractC1455i.g(o02, eVar, dVar) != coroutine_suspended ? coroutine_suspended : c10;
            }
        }
        dVar = new d(continuation);
        Object obj22 = dVar.f68348r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f68350t;
        if (i10 != 0) {
        }
        O0 o022 = O0.f9045a;
        e eVar2 = c6876a.new e(null);
        dVar.f68344n = c10;
        dVar.f68345o = null;
        dVar.f68346p = null;
        dVar.f68347q = null;
        dVar.f68350t = 4;
        if (AbstractC1455i.g(o022, eVar2, dVar) != coroutine_suspended2) {
        }
    }

    @Override // Cd.a
    public C5582a d(Bd.b salesIQAuth) {
        Intrinsics.checkNotNullParameter(salesIQAuth, "salesIQAuth");
        r().b(salesIQAuth);
        return C5582a.f56502b.d(Unit.INSTANCE);
    }

    @Override // Cd.a
    public C5582a e() {
        return C5582a.f56502b.d(r().a());
    }

    @Override // Cd.a
    public C5582a f() {
        boolean z10;
        C5582a.C0817a c0817a = C5582a.f56502b;
        if (r().a() != null) {
            Ae.a t10 = t();
            De.a aVar = De.a.JwtAccessToken;
            if (Intrinsics.areEqual(t10.e(Ce.a.a(aVar)).b(), Boolean.TRUE) && og.i.f((String) Ae.a.O(t(), Ce.a.a(aVar), null, 2, null).b())) {
                z10 = true;
                return c0817a.d(Boolean.valueOf(z10));
            }
        }
        z10 = false;
        return c0817a.d(Boolean.valueOf(z10));
    }

    @Override // Cd.a
    public C5582a g() {
        return C5582a.f56502b.d(Boolean.valueOf(og.i.f((String) Ae.a.O(t(), Ce.a.a(De.a.JwtRefreshToken), null, 2, null).b())));
    }

    @Override // Cd.a
    public C5582a h() {
        return C5582a.f56502b.d(Ae.a.O(t(), Ce.a.a(De.a.JwtRefreshToken), null, 2, null).b());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // Cd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(Continuation continuation) {
        k kVar;
        int i10;
        C6876a c6876a;
        SalesIQResponse salesIQResponse;
        SalesIQResponse salesIQResponse2;
        SalesIQResponse salesIQResponse3;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i11 = kVar.f68366q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f68366q = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f68364o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = kVar.f68366q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String I10 = t().I();
                    String h10 = t().h();
                    String str = (String) t().M(De.a.JwtRefreshToken, "").b();
                    if (I10 == null || I10.length() == 0 || h10 == null || h10.length() == 0) {
                        return C5582a.C0817a.c(C5582a.f56502b, new Exception("Unable to log out. Screen name or app id is null or empty"), false, 2, null);
                    }
                    if (str == null || str.length() == 0) {
                        return C5582a.C0817a.c(C5582a.f56502b, new Exception("Unable to log out. Refresh token is null or empty"), false, 2, null);
                    }
                    Ad.b s10 = s();
                    kVar.f68363n = this;
                    kVar.f68366q = 1;
                    obj = s10.e(I10, h10, str, kVar);
                    if (obj != coroutine_suspended) {
                        c6876a = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    salesIQResponse3 = (SalesIQResponse) kVar.f68363n;
                    ResultKt.throwOnFailure(obj);
                    salesIQResponse2 = salesIQResponse3;
                    return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
                }
                c6876a = (C6876a) kVar.f68363n;
                ResultKt.throwOnFailure(obj);
                salesIQResponse = (SalesIQResponse) obj;
                if (salesIQResponse.getIsSuccess()) {
                    salesIQResponse2 = salesIQResponse;
                    return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
                }
                android.support.v4.media.session.b.a(salesIQResponse.getData());
                kVar.f68363n = salesIQResponse;
                kVar.f68366q = 2;
                if (c6876a.o(kVar) != coroutine_suspended) {
                    salesIQResponse3 = salesIQResponse;
                    salesIQResponse2 = salesIQResponse3;
                    return com.zoho.livechat.android.modules.common.data.remote.responses.a.c(SalesIQResponse.copy$default(salesIQResponse2, Unit.INSTANCE, null, 0, false, null, null, null, 126, null));
                }
                return coroutine_suspended;
            }
        }
        kVar = new k(continuation);
        Object obj2 = kVar.f68364o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = kVar.f68366q;
        if (i10 != 0) {
        }
        salesIQResponse = (SalesIQResponse) obj2;
        if (salesIQResponse.getIsSuccess()) {
        }
    }

    public Object o(Continuation continuation) {
        r().b(null);
        SharedPreferences.Editor edit = t().w().edit();
        edit.remove(Ce.a.a(De.a.JwtAccessToken));
        edit.remove(Ce.a.a(De.a.JwtRefreshToken));
        edit.remove(Ce.a.a(De.a.JwtRefreshExpiryTime));
        edit.remove(Ce.a.a(De.a.JwtAccessTokenExpiryTime));
        edit.remove(Ce.a.a(De.a.JwtVisitorUniqueId));
        edit.commit();
        return C5582a.C0817a.e(C5582a.f56502b, null, 1, null);
    }

    public final Application p() {
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        return e10;
    }

    public final Fd.a q() {
        Fd.a aVar = this.f68341d;
        if (aVar != null) {
            return aVar;
        }
        c cVar = new c();
        this.f68341d = cVar;
        return cVar;
    }

    public final C6958a r() {
        return (C6958a) this.f68339b.getValue();
    }

    public final Ad.b s() {
        return (Ad.b) this.f68338a.getValue();
    }

    public final Ae.a t() {
        return (Ae.a) this.f68340c.getValue();
    }

    public final Bd.b u() {
        return r().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r7.c(r8, r2, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004e, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(C6876a c6876a, Continuation continuation) {
        j jVar;
        int i10;
        Bd.b bVar;
        SalesIQListener listener;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f68362q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f68362q = i11 - Integer.MIN_VALUE;
                Object obj = jVar.f68360o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = jVar.f68362q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    SalesIQListener listener2 = ZohoLiveChat.getListener();
                    if (listener2 != null) {
                        jVar.f68359n = c6876a;
                        jVar.f68362q = 1;
                        obj = listener2.onAuthTokenExpiredAsync(jVar);
                    } else {
                        bVar = null;
                        if (bVar != null || bVar.getToken().length() <= 0) {
                            listener = ZohoLiveChat.getListener();
                            if (listener != null) {
                                listener.onAuthTokenExpired(c6876a.q());
                            }
                            return Unit.INSTANCE;
                        }
                        c6876a.r().b(bVar);
                        Bd.a aVar = Bd.a.Renewal;
                        jVar.f68359n = null;
                        jVar.f68362q = 2;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    c6876a = (C6876a) jVar.f68359n;
                    ResultKt.throwOnFailure(obj);
                }
                bVar = (Bd.b) obj;
                if (bVar != null) {
                }
                listener = ZohoLiveChat.getListener();
                if (listener != null) {
                }
                return Unit.INSTANCE;
            }
        }
        jVar = new j(continuation);
        Object obj2 = jVar.f68360o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = jVar.f68362q;
        if (i10 != 0) {
        }
        bVar = (Bd.b) obj2;
        if (bVar != null) {
        }
        listener = ZohoLiveChat.getListener();
        if (listener != null) {
        }
        return Unit.INSTANCE;
    }

    public final boolean w() {
        long f10 = rd.b.f();
        Long l10 = (Long) Ae.a.C(t(), De.a.JwtRefreshExpiryTime, 0L, 2, null).b();
        return l10 != null && f10 + f68336f.b() > l10.longValue();
    }

    public final boolean x(String str) {
        String str2 = (String) t().M(De.a.JwtRefreshToken, null).b();
        return str2 != null && Intrinsics.areEqual(str2, str);
    }

    public C6876a() {
        this.f68338a = LazyKt.lazy(g.f68354d);
        this.f68339b = LazyKt.lazy(f.f68353d);
        this.f68340c = LazyKt.lazy(new h());
    }
}
