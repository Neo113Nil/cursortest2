package sf;

import com.google.gson.k;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import ee.C4202a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import pf.C6068a;
import retrofit2.Response;
import tf.InterfaceC6463a;

/* renamed from: sf.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6364a {

    /* renamed from: d, reason: collision with root package name */
    public static C6364a f64859d;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f64861a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaType f64862b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0903a f64858c = new C0903a(null);

    /* renamed from: e, reason: collision with root package name */
    public static Object f64860e = new Object();

    /* renamed from: sf.a$a, reason: collision with other inner class name */
    public static final class C0903a {
        public /* synthetic */ C0903a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6364a a() {
            C6364a c6364a;
            synchronized (C6364a.f64860e) {
                c6364a = C6364a.f64859d;
                if (c6364a == null) {
                    c6364a = new C6364a(null);
                    C6364a.f64859d = c6364a;
                }
            }
            return c6364a;
        }

        public C0903a() {
        }
    }

    /* renamed from: sf.a$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f64863n;

        /* renamed from: p, reason: collision with root package name */
        public int f64865p;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64863n = obj;
            this.f64865p |= Integer.MIN_VALUE;
            return C6364a.this.d(null, null, null, this);
        }
    }

    /* renamed from: sf.a$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f64866n;

        /* renamed from: p, reason: collision with root package name */
        public int f64868p;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64866n = obj;
            this.f64868p |= Integer.MIN_VALUE;
            return C6364a.this.g(null, null, 0, null, null, null, null, null, null, null, this);
        }
    }

    /* renamed from: sf.a$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f64869n;

        /* renamed from: p, reason: collision with root package name */
        public int f64871p;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64869n = obj;
            this.f64871p |= Integer.MIN_VALUE;
            return C6364a.this.i(null, null, this);
        }
    }

    /* renamed from: sf.a$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f64872d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6463a invoke() {
            return C6068a.f63188a.a();
        }
    }

    /* renamed from: sf.a$f */
    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f64873n;

        /* renamed from: p, reason: collision with root package name */
        public int f64875p;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64873n = obj;
            this.f64875p |= Integer.MIN_VALUE;
            return C6364a.this.j(null, null, null, this);
        }
    }

    /* renamed from: sf.a$g */
    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f64876n;

        /* renamed from: p, reason: collision with root package name */
        public int f64878p;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64876n = obj;
            this.f64878p |= Integer.MIN_VALUE;
            return C6364a.this.k(null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* renamed from: sf.a$h */
    public static final class h extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f64879n;

        /* renamed from: p, reason: collision with root package name */
        public int f64881p;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64879n = obj;
            this.f64881p |= Integer.MIN_VALUE;
            return C6364a.this.l(null, null, null, null, null, null, false, this);
        }
    }

    /* renamed from: sf.a$i */
    public static final class i extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f64882n;

        /* renamed from: p, reason: collision with root package name */
        public int f64884p;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64882n = obj;
            this.f64884p |= Integer.MIN_VALUE;
            return C6364a.this.m(null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, this);
        }
    }

    public /* synthetic */ C6364a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ Object h(C6364a c6364a, String str, String str2, int i10, Long l10, Long l11, String str3, String str4, Integer num, Integer num2, Long l12, Continuation continuation, int i11, Object obj) {
        Integer num3;
        Integer num4;
        Long l13;
        C6364a c6364a2;
        String str5;
        String str6;
        String str7;
        Continuation continuation2;
        int i12 = (i11 & 4) != 0 ? 50 : i10;
        Long l14 = (i11 & 8) != 0 ? null : l10;
        Long l15 = (i11 & 16) != 0 ? null : l11;
        String str8 = (i11 & 64) != 0 ? null : str4;
        if ((i11 & 128) != 0) {
            num3 = str8 != null ? r1 : null;
        } else {
            num3 = num;
        }
        if ((i11 & 256) != 0) {
            num4 = str8 == null ? null : 10;
        } else {
            num4 = num2;
        }
        if ((i11 & 512) != 0) {
            l13 = null;
            str5 = str;
            str6 = str2;
            str7 = str3;
            continuation2 = continuation;
            c6364a2 = c6364a;
        } else {
            l13 = l12;
            c6364a2 = c6364a;
            str5 = str;
            str6 = str2;
            str7 = str3;
            continuation2 = continuation;
        }
        return c6364a2.g(str5, str6, i12, l14, l15, str7, str8, num3, num4, l13, continuation2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(3:57|58|(1:60))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|64|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012f, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0047, B:13:0x004f, B:15:0x00e8, B:27:0x00ad, B:29:0x00bd, B:31:0x00c7, B:35:0x00d5, B:37:0x00e5, B:38:0x00fb, B:40:0x0101, B:42:0x010b, B:46:0x0119, B:48:0x0129, B:58:0x0038, B:19:0x0057, B:21:0x005f, B:23:0x009a), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0047, B:13:0x004f, B:15:0x00e8, B:27:0x00ad, B:29:0x00bd, B:31:0x00c7, B:35:0x00d5, B:37:0x00e5, B:38:0x00fb, B:40:0x0101, B:42:0x010b, B:46:0x0119, B:48:0x0129, B:58:0x0038, B:19:0x0057, B:21:0x005f, B:23:0x009a), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, String str3, Continuation continuation) {
        b bVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f64865p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f64865p = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f64863n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = bVar.f64865p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6463a f10 = f();
                    bVar.f64865p = 1;
                    obj = f10.i(str, str2, str3, bVar);
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
        bVar = new b(continuation);
        Object obj2 = bVar.f64863n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = bVar.f64865p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    public final RequestBody e(String str, String str2, String str3, k kVar, String str4, boolean z10, Boolean bool) {
        k kVar2 = new k();
        if (str != null) {
            kVar2.p("session_id", str);
        }
        if (str2 != null) {
            kVar2.p("uts_session_id", str2);
        }
        kVar2.o("timezone_offset", Integer.valueOf(TimeZone.getDefault().getRawOffset()));
        if (str3 != null) {
            if (z10) {
                kVar2.p("comment", str3);
            } else {
                kVar2.p("text", str3);
                kVar2.p("client_message_id", str4);
            }
        }
        if (kVar != null) {
            kVar2.m("meta", kVar);
        }
        if (bool != null) {
            kVar2.n("retry", Boolean.TRUE);
        }
        RequestBody.Companion companion = RequestBody.INSTANCE;
        String hVar = kVar2.toString();
        Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
        return companion.create(hVar, this.f64862b);
    }

    public final InterfaceC6463a f() {
        return (InterfaceC6463a) this.f64861a.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|8|(1:(1:11)(2:56|57))(6:58|59|(1:61)(1:68)|(1:63)(1:67)|64|(1:66))|12|(4:14|(3:19|20|(2:22|23)(2:24|25))|16|17)(2:39|(4:41|(1:46)|47|48)(3:49|50|(2:52|53)(2:54|55)))))|71|6|7|8|(0)(0)|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0189, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:11:0x002e, B:12:0x006e, B:14:0x0077, B:16:0x0131, B:28:0x00f5, B:30:0x0105, B:32:0x010f, B:36:0x011d, B:38:0x012e, B:39:0x0156, B:41:0x015c, B:43:0x0166, B:47:0x0174, B:49:0x0184, B:59:0x0040, B:63:0x004e, B:64:0x0055, B:20:0x0080, B:22:0x0088, B:24:0x00d0), top: B:8:0x002a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0156 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:11:0x002e, B:12:0x006e, B:14:0x0077, B:16:0x0131, B:28:0x00f5, B:30:0x0105, B:32:0x010f, B:36:0x011d, B:38:0x012e, B:39:0x0156, B:41:0x015c, B:43:0x0166, B:47:0x0174, B:49:0x0184, B:59:0x0040, B:63:0x004e, B:64:0x0055, B:20:0x0080, B:22:0x0088, B:24:0x00d0), top: B:8:0x002a, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, int i10, Long l10, Long l11, String str3, String str4, Integer num, Integer num2, Long l12, Continuation continuation) {
        c cVar;
        C6364a c6364a;
        int i11;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f64868p;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f64868p = i12 - Integer.MIN_VALUE;
                c6364a = this;
                c cVar2 = cVar;
                Object obj = cVar2.f64866n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = cVar2.f64868p;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6463a f10 = c6364a.f();
                    String str5 = str4 == null ? str3 : null;
                    Integer boxInt = str4 == null ? Boxing.boxInt(i10) : null;
                    cVar2.f64868p = 1;
                    obj = f10.h(str, str2, str4, str5, l10, l11, boxInt, num, num2, l12, cVar2);
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
        c6364a = this;
        cVar = c6364a.new c(continuation);
        c cVar22 = cVar;
        Object obj2 = cVar22.f64866n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = cVar22.f64868p;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|8|(1:(1:11)(2:56|57))(3:58|59|(1:61))|12|(4:14|(3:19|20|(2:22|23)(2:24|25))|16|17)(2:39|(4:41|(1:46)|47|48)(3:49|50|(2:52|53)(2:54|55)))))|65|6|7|8|(0)(0)|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
    
        r12 = kotlin.Result.INSTANCE;
        r11 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #1 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x0050, B:14:0x0058, B:16:0x00f1, B:28:0x00b6, B:30:0x00c6, B:32:0x00d0, B:36:0x00de, B:38:0x00ee, B:39:0x0104, B:41:0x010a, B:43:0x0114, B:47:0x0122, B:49:0x0132, B:59:0x003a, B:20:0x0060, B:22:0x0068, B:24:0x00a3), top: B:8:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x0050, B:14:0x0058, B:16:0x00f1, B:28:0x00b6, B:30:0x00c6, B:32:0x00d0, B:36:0x00de, B:38:0x00ee, B:39:0x0104, B:41:0x010a, B:43:0x0114, B:47:0x0122, B:49:0x0132, B:59:0x003a, B:20:0x0060, B:22:0x0068, B:24:0x00a3), top: B:8:0x0023, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, Continuation continuation) {
        d dVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f64871p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f64871p = i11 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.f64869n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar2.f64871p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6463a f10 = f();
                    dVar2.f64871p = 1;
                    obj = InterfaceC6463a.g(f10, str, str2, 0, null, dVar2, 12, null);
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
        dVar = new d(continuation);
        d dVar22 = dVar;
        Object obj2 = dVar22.f64869n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar22.f64871p;
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
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012f, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0047, B:13:0x004f, B:15:0x00e8, B:27:0x00ad, B:29:0x00bd, B:31:0x00c7, B:35:0x00d5, B:37:0x00e5, B:38:0x00fb, B:40:0x0101, B:42:0x010b, B:46:0x0119, B:48:0x0129, B:58:0x0038, B:19:0x0057, B:21:0x005f, B:23:0x009a), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fb A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0047, B:13:0x004f, B:15:0x00e8, B:27:0x00ad, B:29:0x00bd, B:31:0x00c7, B:35:0x00d5, B:37:0x00e5, B:38:0x00fb, B:40:0x0101, B:42:0x010b, B:46:0x0119, B:48:0x0129, B:58:0x0038, B:19:0x0057, B:21:0x005f, B:23:0x009a), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, String str3, Continuation continuation) {
        f fVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f64875p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f64875p = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f64873n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = fVar.f64875p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6463a f10 = f();
                    fVar.f64875p = 1;
                    obj = f10.f(str, str2, str3, fVar);
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
        fVar = new f(continuation);
        Object obj2 = fVar.f64873n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = fVar.f64875p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(2:57|(2:108|109)(11:63|(1:65)|(1:67)|68|(6:71|(1:73)|74|(4:(1:83)|79|80|81)(2:84|85)|82|69)|86|87|(6:90|(1:92)|93|(4:95|(1:102)|99|100)(1:103)|101|88)|104|105|(1:107)))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|112|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x003b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0284, code lost:
    
        r2 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0170 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:10:0x0036, B:11:0x0168, B:13:0x0170, B:15:0x022a, B:27:0x01ee, B:29:0x01fe, B:31:0x0208, B:35:0x0216, B:37:0x0227, B:38:0x024f, B:40:0x0255, B:42:0x025f, B:46:0x026d, B:48:0x027d, B:105:0x0150, B:19:0x0179, B:21:0x0181, B:23:0x01c9), top: B:7:0x0032, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x024f A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:10:0x0036, B:11:0x0168, B:13:0x0170, B:15:0x022a, B:27:0x01ee, B:29:0x01fe, B:31:0x0208, B:35:0x0216, B:37:0x0227, B:38:0x024f, B:40:0x0255, B:42:0x025f, B:46:0x026d, B:48:0x027d, B:105:0x0150, B:19:0x0179, B:21:0x0181, B:23:0x01c9), top: B:7:0x0032, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, List list, String str3, String str4, List list2, List list3, List list4, Function2 function2, Continuation continuation) {
        g gVar;
        int i10;
        String name;
        List list5;
        String name2;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f64878p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f64878p = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f64876n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar.f64878p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    List list6 = list2;
                    if (list6 == null || list6.isEmpty() || function2 == null || list4 == null) {
                        return SalesIQResponse.INSTANCE.b(new Throwable("No files found"));
                    }
                    MultipartBody.Builder builder = new MultipartBody.Builder(null, 1, null);
                    MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                    builder.addPart(companion.createFormData("att_type", wf.b.Attachment.getTypeValue()));
                    if (str3 != null) {
                        builder.addPart(companion.createFormData("session_id", str3));
                    }
                    if (str4 != null) {
                        companion.createFormData("uts_session_id", str4);
                    }
                    companion.createFormData("timezone_offset", String.valueOf(TimeZone.getDefault().getRawOffset()));
                    RequestBody.Companion companion2 = RequestBody.INSTANCE;
                    k kVar = new k();
                    List list7 = list2;
                    int i12 = 0;
                    for (Object obj2 : list7) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        File file = (File) obj2;
                        if (file != null) {
                            if (list3 == null || (name2 = (String) list3.get(i12)) == null) {
                                name2 = file.getName();
                            }
                            String str5 = name2;
                            k kVar2 = new k();
                            list5 = list7;
                            kVar2.p("client_message_id", (String) list.get(i12));
                            Unit unit = Unit.INSTANCE;
                            kVar.m(str5, kVar2);
                        } else {
                            list5 = list7;
                        }
                        list7 = list5;
                        i12 = i13;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    String hVar = kVar.toString();
                    Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
                    builder.addPart(companion.createFormData("comments", null, companion2.create(hVar, this.f64862b)));
                    int i14 = 0;
                    for (Object obj3 : list7) {
                        int i15 = i14 + 1;
                        if (i14 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        File file2 = (File) obj3;
                        if (file2 != null) {
                            C4202a c4202a = new C4202a(file2, (String) list.get(i14), (String) list4.get(i14), function2);
                            MultipartBody.Part.Companion companion3 = MultipartBody.Part.INSTANCE;
                            if (list3 == null || (name = (String) list3.get(i14)) == null) {
                                name = file2.getName();
                            }
                            builder.addPart(companion3.createFormData("file", name, c4202a));
                        }
                        i14 = i15;
                    }
                    Result.Companion companion4 = Result.INSTANCE;
                    InterfaceC6463a f10 = f();
                    MultipartBody build = builder.build();
                    gVar.f64878p = 1;
                    obj = f10.e(str, str2, build, gVar);
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
                        Result.Companion companion5 = Result.INSTANCE;
                        return salesIQRestResponse.getData() != null ? SalesIQResponse.INSTANCE.d(salesIQRestResponse.getData(), response.code(), salesIQRestResponse.getMoreDataAvailable(), salesIQRestResponse.getSyncTime(), MapsKt.toMap(response.raw().headers()), Boxing.boxLong(response.raw().receivedResponseAtMillis() - response.raw().sentRequestAtMillis())) : SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
                    } catch (Throwable th2) {
                        Result.Companion companion6 = Result.INSTANCE;
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
        gVar = new g(continuation);
        Object obj4 = gVar.f64876n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar.f64878p;
        if (i10 != 0) {
        }
        response = (Response) obj4;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(7:57|(1:59)|(1:61)|(1:63)|(1:65)|66|(1:68))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|72|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0174, code lost:
    
        r15 = kotlin.Result.INSTANCE;
        r14 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #0 {all -> 0x0031, blocks: (B:10:0x002d, B:11:0x008c, B:13:0x0094, B:15:0x012d, B:27:0x00f2, B:29:0x0102, B:31:0x010c, B:35:0x011a, B:37:0x012a, B:38:0x0140, B:40:0x0146, B:42:0x0150, B:46:0x015e, B:48:0x016e, B:66:0x006c, B:19:0x009c, B:21:0x00a4, B:23:0x00df), top: B:7:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0140 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:10:0x002d, B:11:0x008c, B:13:0x0094, B:15:0x012d, B:27:0x00f2, B:29:0x0102, B:31:0x010c, B:35:0x011a, B:37:0x012a, B:38:0x0140, B:40:0x0146, B:42:0x0150, B:46:0x015e, B:48:0x016e, B:66:0x006c, B:19:0x009c, B:21:0x00a4, B:23:0x00df), top: B:7:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, String str2, String str3, String str4, String str5, k kVar, boolean z10, Continuation continuation) {
        h hVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f64881p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f64881p = i11 - Integer.MIN_VALUE;
                Object obj = hVar.f64879n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = hVar.f64881p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    k kVar2 = new k();
                    kVar2.p("client_message_id", str3);
                    if (str4 != null) {
                        kVar2.p("text", str4);
                    }
                    if (z10) {
                        kVar2.n("ignore", Boxing.boxBoolean(true));
                    }
                    if (str5 != null) {
                        kVar2.p("session_id", str5);
                    }
                    if (kVar != null) {
                        kVar2.m("meta", kVar);
                    }
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC6463a f10 = f();
                    RequestBody.Companion companion2 = RequestBody.INSTANCE;
                    String hVar2 = kVar2.toString();
                    Intrinsics.checkNotNullExpressionValue(hVar2, "toString(...)");
                    RequestBody create = companion2.create(hVar2, this.f64862b);
                    hVar.f64881p = 1;
                    obj = f10.b(str, str2, create, hVar);
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
        hVar = new h(continuation);
        Object obj2 = hVar.f64879n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = hVar.f64881p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|8|(1:(1:(1:(2:13|14)(2:59|60))(2:61|62))(2:63|64))(5:65|(1:104)(9:71|(1:73)(2:99|(1:103))|(1:75)|(1:77)|(1:79)|80|(2:83|81)|84|85)|86|(3:88|(1:90)|64)(2:92|(3:94|(1:96)|62)(1:97))|91)|15|(4:17|(3:22|23|(2:25|26)(2:27|28))|19|20)(2:42|(4:44|(1:49)|50|51)(3:52|53|(2:55|56)(2:57|58)))))|107|6|7|8|(0)(0)|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0045, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026d, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0150, code lost:
    
        if (r5 == r10) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015b A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #1 {all -> 0x0045, blocks: (B:13:0x0040, B:14:0x0153, B:15:0x0155, B:17:0x015b, B:19:0x0215, B:31:0x01d9, B:33:0x01e9, B:35:0x01f3, B:39:0x0201, B:41:0x0212, B:42:0x023a, B:44:0x0240, B:46:0x024a, B:50:0x0258, B:52:0x0268, B:61:0x0050, B:62:0x013f, B:63:0x0055, B:64:0x011d, B:86:0x00fd, B:88:0x0101, B:94:0x0123, B:97:0x0142, B:23:0x0164, B:25:0x016c, B:27:0x01b4), top: B:8:0x0038, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x023a A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:13:0x0040, B:14:0x0153, B:15:0x0155, B:17:0x015b, B:19:0x0215, B:31:0x01d9, B:33:0x01e9, B:35:0x01f3, B:39:0x0201, B:41:0x0212, B:42:0x023a, B:44:0x0240, B:46:0x024a, B:50:0x0258, B:52:0x0268, B:61:0x0050, B:62:0x013f, B:63:0x0055, B:64:0x011d, B:86:0x00fd, B:88:0x0101, B:94:0x0123, B:97:0x0142, B:23:0x0164, B:25:0x016c, B:27:0x01b4), top: B:8:0x0038, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, String str3, String str4, String str5, String str6, String str7, k kVar, List list, String str8, wf.b bVar, String str9, Function2 function2, boolean z10, boolean z11, Boolean bool, Continuation continuation) {
        i iVar;
        C6364a c6364a;
        int i10;
        RequestBody e10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i11 = iVar.f64884p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f64884p = i11 - Integer.MIN_VALUE;
                c6364a = this;
                i iVar2 = iVar;
                Object obj = iVar2.f64882n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = iVar2.f64884p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    List list2 = list;
                    if (list2 == null || list2.isEmpty() || function2 == null || str9 == null) {
                        e10 = c6364a.e(str4, str5, str7, kVar, str3, false, bool);
                    } else {
                        MultipartBody.Builder builder = new MultipartBody.Builder(null, 1, null);
                        MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                        builder.addPart(companion.createFormData("client_message_id", str3));
                        if (bVar == wf.b.AppLogs) {
                            builder.addPart(companion.createFormData("filetype", bVar.getTypeValue()));
                        } else if (bVar == wf.b.Attachment || bVar == wf.b.VoiceNote) {
                            builder.addPart(companion.createFormData("att_type", bVar.getTypeValue()));
                        }
                        if (str4 != null) {
                            builder.addPart(companion.createFormData("session_id", str4));
                        }
                        if (str5 != null) {
                            companion.createFormData("uts_session_id", str5);
                        }
                        if (bool != null) {
                            builder.addPart(companion.createFormData("retry", "true"));
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            builder.addPart(MultipartBody.Part.INSTANCE.createFormData("file", str8, new C4202a((File) it.next(), str3, str9, function2)));
                        }
                        e10 = builder.build();
                    }
                    Result.Companion companion2 = Result.INSTANCE;
                    if (z10) {
                        InterfaceC6463a f10 = f();
                        Intrinsics.checkNotNull(str6);
                        iVar2.f64884p = 1;
                        obj = f10.d(str, str2, str6, e10, iVar2);
                        if (obj == coroutine_suspended) {
                        }
                        response = (Response) obj;
                    } else if (z11) {
                        InterfaceC6463a f11 = f();
                        Intrinsics.checkNotNull(str6);
                        iVar2.f64884p = 2;
                        obj = f11.c(str, str2, str6, e10, iVar2);
                        if (obj == coroutine_suspended) {
                        }
                        response = (Response) obj;
                    } else {
                        InterfaceC6463a f12 = f();
                        iVar2.f64884p = 3;
                        obj = f12.e(str, str2, e10, iVar2);
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    response = (Response) obj;
                } else if (i10 == 2) {
                    ResultKt.throwOnFailure(obj);
                    response = (Response) obj;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    response = (Response) obj;
                }
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
        c6364a = this;
        iVar = c6364a.new i(continuation);
        i iVar22 = iVar;
        Object obj2 = iVar22.f64882n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = iVar22.f64884p;
        if (i10 != 0) {
        }
        if (response.isSuccessful()) {
        }
    }

    public C6364a() {
        this.f64861a = LazyKt.lazy(e.f64872d);
        this.f64862b = MediaType.INSTANCE.parse("application/json; charset=utf-8");
    }
}
