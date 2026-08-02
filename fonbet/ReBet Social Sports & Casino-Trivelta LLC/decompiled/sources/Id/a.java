package Id;

import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0123a f5751b = new C0123a(null);

    /* renamed from: c, reason: collision with root package name */
    public static Object f5752c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f5753a = LazyKt.lazy(b.f5754d);

    /* renamed from: Id.a$a, reason: collision with other inner class name */
    public static final class C0123a {
        public /* synthetic */ C0123a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0123a() {
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f5754d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Jd.a invoke() {
            return (Jd.a) Yd.a.n().create(Jd.a.class);
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f5755n;

        /* renamed from: p, reason: collision with root package name */
        public int f5757p;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5755n = obj;
            this.f5757p |= Integer.MIN_VALUE;
            return a.this.b(null, null, null, false, null, null, null, null, this);
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f5758n;

        /* renamed from: p, reason: collision with root package name */
        public int f5760p;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5758n = obj;
            this.f5760p |= Integer.MIN_VALUE;
            return a.this.c(null, null, null, this);
        }
    }

    public final Jd.a a() {
        return (Jd.a) this.f5753a.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|8|(1:(1:11)(2:56|57))(3:58|59|(1:61))|12|(4:14|(3:19|20|(2:22|23)(2:24|25))|16|17)(2:39|(4:41|(1:46)|47|48)(3:49|50|(2:52|53)(2:54|55)))))|64|6|7|8|(0)(0)|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0185, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0069, B:14:0x0072, B:16:0x012c, B:28:0x00f0, B:30:0x0100, B:32:0x010a, B:36:0x0118, B:38:0x0129, B:39:0x0151, B:41:0x0157, B:43:0x0161, B:47:0x016f, B:49:0x017f, B:59:0x003f, B:20:0x007b, B:22:0x0083, B:24:0x00cb), top: B:8:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0151 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x0069, B:14:0x0072, B:16:0x012c, B:28:0x00f0, B:30:0x0100, B:32:0x010a, B:36:0x0118, B:38:0x0129, B:39:0x0151, B:41:0x0157, B:43:0x0161, B:47:0x016f, B:49:0x017f, B:59:0x003f, B:20:0x007b, B:22:0x0083, B:24:0x00cb), top: B:8:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, boolean z10, String str4, String str5, Long l10, Boolean bool, Continuation continuation) {
        c cVar;
        a aVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f5757p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f5757p = i11 - Integer.MIN_VALUE;
                aVar = this;
                c cVar2 = cVar;
                Object obj = cVar2.f5755n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar2.f5757p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    Jd.a a12 = aVar.a();
                    Intrinsics.checkNotNullExpressionValue(a12, "<get-brandApiService>(...)");
                    cVar2.f5757p = 1;
                    obj = Jd.a.b(a12, str, str2, str3, z10, str4, str5, bool, null, null, l10, cVar2, 384, null);
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
                    SalesIQResponse.Error a13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                    if (a13 != null && (a10 = SalesIQResponse.INSTANCE.a(a13, response.code())) != null) {
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
                            SalesIQResponse.Error a14 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                            return (a14 == null || (a11 = SalesIQResponse.INSTANCE.a(a14, response.code())) == null) ? SalesIQResponse.INSTANCE.b(new Exception(salesIQRestResponse.toString())) : a11;
                        }
                        Result.m146boximpl(m147constructorimpl2);
                    }
                }
                return SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
            }
        }
        aVar = this;
        cVar = aVar.new c(continuation);
        c cVar22 = cVar;
        Object obj2 = cVar22.f5755n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar22.f5757p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(3:57|58|(1:60))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|63|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0148, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:10:0x0027, B:11:0x005c, B:13:0x0065, B:15:0x00ff, B:27:0x00c3, B:29:0x00d3, B:31:0x00dd, B:35:0x00eb, B:37:0x00fc, B:38:0x0113, B:40:0x011a, B:42:0x0124, B:46:0x0132, B:48:0x0142, B:58:0x0039, B:19:0x006e, B:21:0x0076, B:23:0x00b0), top: B:7:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:10:0x0027, B:11:0x005c, B:13:0x0065, B:15:0x00ff, B:27:0x00c3, B:29:0x00d3, B:31:0x00dd, B:35:0x00eb, B:37:0x00fc, B:38:0x0113, B:40:0x011a, B:42:0x0124, B:46:0x0132, B:48:0x0142, B:58:0x0039, B:19:0x006e, B:21:0x0076, B:23:0x00b0), top: B:7:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, List list, Continuation continuation) {
        d dVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f5760p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f5760p = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f5758n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f5760p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    Jd.a a12 = a();
                    String joinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
                    dVar.f5760p = 1;
                    obj = a12.a(str, str2, joinToString$default, dVar);
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
                    SalesIQResponse.Error a13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                    if (a13 != null && (a10 = SalesIQResponse.INSTANCE.a(a13, response.code())) != null) {
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
                            SalesIQResponse.Error a14 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                            return (a14 == null || (a11 = SalesIQResponse.INSTANCE.a(a14, response.code())) == null) ? SalesIQResponse.INSTANCE.b(new Exception(salesIQRestResponse.toString())) : a11;
                        }
                        Result.m146boximpl(m147constructorimpl2);
                    }
                }
                return SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f5758n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f5760p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }
}
