package Ad;

import com.google.gson.k;
import com.twilio.voice.PublisherMetadata;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import og.AbstractC5896h;
import og.m;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Ad.a f437a;

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f438n;

        /* renamed from: p, reason: collision with root package name */
        public int f440p;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f438n = obj;
            this.f440p |= Integer.MIN_VALUE;
            return b.this.a(null, null, null, this);
        }
    }

    /* renamed from: Ad.b$b, reason: collision with other inner class name */
    public static final class C0009b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f441n;

        /* renamed from: p, reason: collision with root package name */
        public int f443p;

        public C0009b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f441n = obj;
            this.f443p |= Integer.MIN_VALUE;
            return b.this.c(null, null, null, this);
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f444n;

        /* renamed from: p, reason: collision with root package name */
        public int f446p;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f444n = obj;
            this.f446p |= Integer.MIN_VALUE;
            return b.this.e(null, null, null, this);
        }
    }

    public b() {
        Object create = Yd.a.n().create(Ad.a.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        this.f437a = (Ad.a) create;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(3:57|58|(1:60))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|64|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0131, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0049, B:13:0x0051, B:15:0x00ea, B:27:0x00af, B:29:0x00bf, B:31:0x00c9, B:35:0x00d7, B:37:0x00e7, B:38:0x00fd, B:40:0x0103, B:42:0x010d, B:46:0x011b, B:48:0x012b, B:58:0x0038, B:19:0x0059, B:21:0x0061, B:23:0x009c), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0049, B:13:0x0051, B:15:0x00ea, B:27:0x00af, B:29:0x00bf, B:31:0x00c9, B:35:0x00d7, B:37:0x00e7, B:38:0x00fd, B:40:0x0103, B:42:0x010d, B:46:0x011b, B:48:0x012b, B:58:0x0038, B:19:0x0059, B:21:0x0061, B:23:0x009c), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, Continuation continuation) {
        a aVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f440p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f440p = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f438n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f440p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    Ad.a aVar2 = this.f437a;
                    RequestBody b10 = b(str3, str2);
                    aVar.f440p = 1;
                    obj = aVar2.b(str, b10, aVar);
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
        aVar = new a(continuation);
        Object obj2 = aVar.f438n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f440p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    public final RequestBody b(String str, String str2) {
        RequestBody.Companion companion = RequestBody.INSTANCE;
        k kVar = new k();
        kVar.p("token", str);
        kVar.p(PublisherMetadata.APP_ID, str2);
        String hVar = kVar.toString();
        Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
        return companion.create(hVar, d());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(5:57|58|(1:62)|63|(1:65))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|69|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014a, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0062, B:13:0x006a, B:15:0x0103, B:27:0x00c8, B:29:0x00d8, B:31:0x00e2, B:35:0x00f0, B:37:0x0100, B:38:0x0116, B:40:0x011c, B:42:0x0126, B:46:0x0134, B:48:0x0144, B:58:0x0038, B:60:0x0048, B:62:0x004e, B:63:0x0053, B:19:0x0072, B:21:0x007a, B:23:0x00b5), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116 A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0062, B:13:0x006a, B:15:0x0103, B:27:0x00c8, B:29:0x00d8, B:31:0x00e2, B:35:0x00f0, B:37:0x0100, B:38:0x0116, B:40:0x011c, B:42:0x0126, B:46:0x0134, B:48:0x0144, B:58:0x0038, B:60:0x0048, B:62:0x004e, B:63:0x0053, B:19:0x0072, B:21:0x007a, B:23:0x00b5), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, Continuation continuation) {
        C0009b c0009b;
        int i10;
        String d10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof C0009b) {
            c0009b = (C0009b) continuation;
            int i11 = c0009b.f443p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0009b.f443p = i11 - Integer.MIN_VALUE;
                Object obj = c0009b.f441n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c0009b.f443p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    Ad.a aVar = this.f437a;
                    k kVar = new k();
                    kVar.p("vwmsid", str2);
                    if (str3 != null && (d10 = m.d(str3)) != null) {
                        kVar.p("name", d10);
                    }
                    Unit unit = Unit.INSTANCE;
                    RequestBody g10 = AbstractC5896h.g(kVar);
                    c0009b.f443p = 1;
                    obj = aVar.a(str, g10, c0009b);
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
        c0009b = new C0009b(continuation);
        Object obj2 = c0009b.f441n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0009b.f443p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    public final MediaType d() {
        return MediaType.INSTANCE.parse("application/json");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(3:57|58|(1:60))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|64|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0131, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0049, B:13:0x0051, B:15:0x00ea, B:27:0x00af, B:29:0x00bf, B:31:0x00c9, B:35:0x00d7, B:37:0x00e7, B:38:0x00fd, B:40:0x0103, B:42:0x010d, B:46:0x011b, B:48:0x012b, B:58:0x0038, B:19:0x0059, B:21:0x0061, B:23:0x009c), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0049, B:13:0x0051, B:15:0x00ea, B:27:0x00af, B:29:0x00bf, B:31:0x00c9, B:35:0x00d7, B:37:0x00e7, B:38:0x00fd, B:40:0x0103, B:42:0x010d, B:46:0x011b, B:48:0x012b, B:58:0x0038, B:19:0x0059, B:21:0x0061, B:23:0x009c), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, Continuation continuation) {
        c cVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f446p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f446p = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f444n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f446p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    Ad.a aVar = this.f437a;
                    RequestBody b10 = b(str3, str2);
                    cVar.f446p = 1;
                    obj = aVar.c(str, b10, cVar);
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
        Object obj2 = cVar.f444n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f446p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }
}
