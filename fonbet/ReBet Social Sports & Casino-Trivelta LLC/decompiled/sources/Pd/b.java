package Pd;

import com.google.gson.k;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static b f8965c;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f8967a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f8964b = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final Object f8966d = new Object();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            b bVar;
            synchronized (b.f8966d) {
                bVar = b.f8965c;
                if (bVar == null) {
                    bVar = new b(null);
                    b.f8965c = bVar;
                }
            }
            return bVar;
        }

        public a() {
        }
    }

    /* renamed from: Pd.b$b, reason: collision with other inner class name */
    public static final class C0177b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0177b f8968d = new C0177b();

        public C0177b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Pd.a invoke() {
            return (Pd.a) Yd.a.n().create(Pd.a.class);
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f8969n;

        /* renamed from: p, reason: collision with root package name */
        public int f8971p;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8969n = obj;
            this.f8971p |= Integer.MIN_VALUE;
            return b.this.d(null, null, this);
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f8972n;

        /* renamed from: p, reason: collision with root package name */
        public int f8974p;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8972n = obj;
            this.f8974p |= Integer.MIN_VALUE;
            return b.this.f(null, null, this);
        }
    }

    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f8975n;

        /* renamed from: p, reason: collision with root package name */
        public int f8977p;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8975n = obj;
            this.f8977p |= Integer.MIN_VALUE;
            return b.this.g(null, null, null, this);
        }
    }

    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f8978n;

        /* renamed from: p, reason: collision with root package name */
        public int f8980p;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8978n = obj;
            this.f8980p |= Integer.MIN_VALUE;
            return b.this.h(null, null, 0, null, this);
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(3:57|58|(1:60))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|64|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012f, code lost:
    
        r12 = kotlin.Result.INSTANCE;
        r11 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0047, B:13:0x004f, B:15:0x00e8, B:27:0x00ad, B:29:0x00bd, B:31:0x00c7, B:35:0x00d5, B:37:0x00e5, B:38:0x00fb, B:40:0x0101, B:42:0x010b, B:46:0x0119, B:48:0x0129, B:58:0x0038, B:19:0x0057, B:21:0x005f, B:23:0x009a), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0047, B:13:0x004f, B:15:0x00e8, B:27:0x00ad, B:29:0x00bd, B:31:0x00c7, B:35:0x00d5, B:37:0x00e5, B:38:0x00fb, B:40:0x0101, B:42:0x010b, B:46:0x0119, B:48:0x0129, B:58:0x0038, B:19:0x0057, B:21:0x005f, B:23:0x009a), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, Continuation continuation) {
        c cVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f8971p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f8971p = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f8969n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f8971p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    Pd.a e10 = e();
                    cVar.f8971p = 1;
                    obj = e10.c(str, str2, cVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    if (errorBody == null) {
                        Object m147constructorimpl = Result.m147constructorimpl(null);
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        return m150exceptionOrNullimpl != null ? SalesIQResponse.INSTANCE.b(m150exceptionOrNullimpl) : SalesIQResponse.INSTANCE.b(new Exception());
                    }
                    SalesIQResponse.Error a12 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                    if (a12 != null && (a10 = SalesIQResponse.INSTANCE.a(a12, response.code())) != null) {
                        return a10;
                    }
                    return SalesIQResponse.INSTANCE.b(new Exception(errorBody.toString()));
                }
                SalesIQRestResponse salesIQRestResponse = (SalesIQRestResponse) response.body();
                if (salesIQRestResponse != null) {
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        return salesIQRestResponse.getData() != null ? SalesIQResponse.INSTANCE.d(salesIQRestResponse.getData(), response.code(), salesIQRestResponse.getMoreDataAvailable(), salesIQRestResponse.getSyncTime(), MapsKt.toMap(response.raw().headers()), Boxing.boxLong(response.raw().receivedResponseAtMillis() - response.raw().sentRequestAtMillis())) : SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
                    } catch (Throwable th2) {
                        Result.Companion companion3 = Result.INSTANCE;
                        Object m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th2));
                        if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                            SalesIQResponse.Error a13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                            return (a13 == null || (a11 = SalesIQResponse.INSTANCE.a(a13, response.code())) == null) ? SalesIQResponse.INSTANCE.b(new Exception(salesIQRestResponse.toString())) : a11;
                        }
                        Result.m146boximpl(m147constructorimpl2);
                    }
                }
                return SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f8969n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f8971p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    public final Pd.a e() {
        return (Pd.a) this.f8967a.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(3:57|58|(1:60))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|64|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015e, code lost:
    
        r12 = kotlin.Result.INSTANCE;
        r11 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0076, B:13:0x007e, B:15:0x0117, B:27:0x00dc, B:29:0x00ec, B:31:0x00f6, B:35:0x0104, B:37:0x0114, B:38:0x012a, B:40:0x0130, B:42:0x013a, B:46:0x0148, B:48:0x0158, B:58:0x0067, B:19:0x0086, B:21:0x008e, B:23:0x00c9), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0076, B:13:0x007e, B:15:0x0117, B:27:0x00dc, B:29:0x00ec, B:31:0x00f6, B:35:0x0104, B:37:0x0114, B:38:0x012a, B:40:0x0130, B:42:0x013a, B:46:0x0148, B:48:0x0158, B:58:0x0067, B:19:0x0086, B:21:0x008e, B:23:0x00c9), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, Continuation continuation) {
        d dVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f8974p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f8974p = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f8972n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f8974p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    k kVar = new k();
                    kVar.p("type", "audio");
                    kVar.p("conversation_id", str2);
                    kVar.p("mode", "visitor");
                    String hVar = kVar.toString();
                    Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
                    RequestBody create = companion.create(hVar, MediaType.INSTANCE.parse("application/json; charset=utf-8"));
                    Result.Companion companion2 = Result.INSTANCE;
                    Pd.a e10 = e();
                    dVar.f8974p = 1;
                    obj = e10.d(str, create, dVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    if (errorBody == null) {
                        Object m147constructorimpl = Result.m147constructorimpl(null);
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        return m150exceptionOrNullimpl != null ? SalesIQResponse.INSTANCE.b(m150exceptionOrNullimpl) : SalesIQResponse.INSTANCE.b(new Exception());
                    }
                    SalesIQResponse.Error a12 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                    if (a12 != null && (a10 = SalesIQResponse.INSTANCE.a(a12, response.code())) != null) {
                        return a10;
                    }
                    return SalesIQResponse.INSTANCE.b(new Exception(errorBody.toString()));
                }
                SalesIQRestResponse salesIQRestResponse = (SalesIQRestResponse) response.body();
                if (salesIQRestResponse != null) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        return salesIQRestResponse.getData() != null ? SalesIQResponse.INSTANCE.d(salesIQRestResponse.getData(), response.code(), salesIQRestResponse.getMoreDataAvailable(), salesIQRestResponse.getSyncTime(), MapsKt.toMap(response.raw().headers()), Boxing.boxLong(response.raw().receivedResponseAtMillis() - response.raw().sentRequestAtMillis())) : SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        Object m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th2));
                        if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                            SalesIQResponse.Error a13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                            return (a13 == null || (a11 = SalesIQResponse.INSTANCE.a(a13, response.code())) == null) ? SalesIQResponse.INSTANCE.b(new Exception(salesIQRestResponse.toString())) : a11;
                        }
                        Result.m146boximpl(m147constructorimpl2);
                    }
                }
                return SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f8972n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f8974p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(3:57|58|(1:60))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|64|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0150, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0068, B:13:0x0070, B:15:0x0109, B:27:0x00ce, B:29:0x00de, B:31:0x00e8, B:35:0x00f6, B:37:0x0106, B:38:0x011c, B:40:0x0122, B:42:0x012c, B:46:0x013a, B:48:0x014a, B:58:0x0059, B:19:0x0078, B:21:0x0080, B:23:0x00bb), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011c A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0068, B:13:0x0070, B:15:0x0109, B:27:0x00ce, B:29:0x00de, B:31:0x00e8, B:35:0x00f6, B:37:0x0106, B:38:0x011c, B:40:0x0122, B:42:0x012c, B:46:0x013a, B:48:0x014a, B:58:0x0059, B:19:0x0078, B:21:0x0080, B:23:0x00bb), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, String str3, Continuation continuation) {
        e eVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f8977p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f8977p = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f8975n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar.f8977p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    k kVar = new k();
                    kVar.p("action", str3);
                    String hVar = kVar.toString();
                    Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
                    RequestBody create = companion.create(hVar, MediaType.INSTANCE.parse("application/json; charset=utf-8"));
                    Result.Companion companion2 = Result.INSTANCE;
                    Pd.a e10 = e();
                    eVar.f8977p = 1;
                    obj = e10.b(str, str2, create, eVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    if (errorBody == null) {
                        Object m147constructorimpl = Result.m147constructorimpl(null);
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        return m150exceptionOrNullimpl != null ? SalesIQResponse.INSTANCE.b(m150exceptionOrNullimpl) : SalesIQResponse.INSTANCE.b(new Exception());
                    }
                    SalesIQResponse.Error a12 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                    if (a12 != null && (a10 = SalesIQResponse.INSTANCE.a(a12, response.code())) != null) {
                        return a10;
                    }
                    return SalesIQResponse.INSTANCE.b(new Exception(errorBody.toString()));
                }
                SalesIQRestResponse salesIQRestResponse = (SalesIQRestResponse) response.body();
                if (salesIQRestResponse != null) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        return salesIQRestResponse.getData() != null ? SalesIQResponse.INSTANCE.d(salesIQRestResponse.getData(), response.code(), salesIQRestResponse.getMoreDataAvailable(), salesIQRestResponse.getSyncTime(), MapsKt.toMap(response.raw().headers()), Boxing.boxLong(response.raw().receivedResponseAtMillis() - response.raw().sentRequestAtMillis())) : SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        Object m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th2));
                        if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                            SalesIQResponse.Error a13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                            return (a13 == null || (a11 = SalesIQResponse.INSTANCE.a(a13, response.code())) == null) ? SalesIQResponse.INSTANCE.b(new Exception(salesIQRestResponse.toString())) : a11;
                        }
                        Result.m146boximpl(m147constructorimpl2);
                    }
                }
                return SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f8975n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar.f8977p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(5:57|(1:59)|60|61|(1:63))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|67|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015b, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007b A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0073, B:13:0x007b, B:15:0x0114, B:27:0x00d9, B:29:0x00e9, B:31:0x00f3, B:35:0x0101, B:37:0x0111, B:38:0x0127, B:40:0x012d, B:42:0x0137, B:46:0x0145, B:48:0x0155, B:61:0x0064, B:19:0x0083, B:21:0x008b, B:23:0x00c6), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127 A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0073, B:13:0x007b, B:15:0x0114, B:27:0x00d9, B:29:0x00e9, B:31:0x00f3, B:35:0x0101, B:37:0x0111, B:38:0x0127, B:40:0x012d, B:42:0x0137, B:46:0x0145, B:48:0x0155, B:61:0x0064, B:19:0x0083, B:21:0x008b, B:23:0x00c6), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, int i10, k kVar, Continuation continuation) {
        f fVar;
        int i11;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f8980p;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f8980p = i12 - Integer.MIN_VALUE;
                Object obj = fVar.f8978n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = fVar.f8980p;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj);
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    k kVar2 = new k();
                    if (kVar != null) {
                        kVar2.m("add_info", kVar);
                    }
                    kVar2.o("action_type", Boxing.boxInt(i10));
                    String hVar = kVar2.toString();
                    Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
                    RequestBody create = companion.create(hVar, MediaType.INSTANCE.parse("application/json; charset=utf-8"));
                    Result.Companion companion2 = Result.INSTANCE;
                    Pd.a e10 = e();
                    fVar.f8980p = 1;
                    obj = e10.a(str, str2, create, fVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    if (errorBody == null) {
                        Object m147constructorimpl = Result.m147constructorimpl(null);
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                        return m150exceptionOrNullimpl != null ? SalesIQResponse.INSTANCE.b(m150exceptionOrNullimpl) : SalesIQResponse.INSTANCE.b(new Exception());
                    }
                    SalesIQResponse.Error a12 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                    if (a12 != null && (a10 = SalesIQResponse.INSTANCE.a(a12, response.code())) != null) {
                        return a10;
                    }
                    return SalesIQResponse.INSTANCE.b(new Exception(errorBody.toString()));
                }
                SalesIQRestResponse salesIQRestResponse = (SalesIQRestResponse) response.body();
                if (salesIQRestResponse != null) {
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        return salesIQRestResponse.getData() != null ? SalesIQResponse.INSTANCE.d(salesIQRestResponse.getData(), response.code(), salesIQRestResponse.getMoreDataAvailable(), salesIQRestResponse.getSyncTime(), MapsKt.toMap(response.raw().headers()), Boxing.boxLong(response.raw().receivedResponseAtMillis() - response.raw().sentRequestAtMillis())) : SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        Object m147constructorimpl2 = Result.m147constructorimpl(ResultKt.createFailure(th2));
                        if (Result.m150exceptionOrNullimpl(m147constructorimpl2) != null) {
                            SalesIQResponse.Error a13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                            return (a13 == null || (a11 = SalesIQResponse.INSTANCE.a(a13, response.code())) == null) ? SalesIQResponse.INSTANCE.b(new Exception(salesIQRestResponse.toString())) : a11;
                        }
                        Result.m146boximpl(m147constructorimpl2);
                    }
                }
                return SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f8978n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = fVar.f8980p;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    public b() {
        this.f8967a = LazyKt.lazy(C0177b.f8968d);
    }
}
