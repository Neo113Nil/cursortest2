package ae;

import ce.AbstractC2916a;
import com.google.gson.k;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import com.zoho.livechat.android.utils.LiveChatUtil;
import fe.InterfaceC4280a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import rd.C6218a;
import retrofit2.Response;

/* renamed from: ae.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1934a {

    /* renamed from: c, reason: collision with root package name */
    public static C1934a f15124c;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f15126a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0321a f15123b = new C0321a(null);

    /* renamed from: d, reason: collision with root package name */
    public static Object f15125d = new Object();

    /* renamed from: ae.a$a, reason: collision with other inner class name */
    public static final class C0321a {
        public /* synthetic */ C0321a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1934a a() {
            C1934a c1934a;
            synchronized (C1934a.f15125d) {
                c1934a = C1934a.f15124c;
                if (c1934a == null) {
                    c1934a = new C1934a(null);
                    C1934a.f15124c = c1934a;
                }
            }
            return c1934a;
        }

        public C0321a() {
        }
    }

    /* renamed from: ae.a$b */
    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f15127d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4280a invoke() {
            return (InterfaceC4280a) Yd.a.n().create(InterfaceC4280a.class);
        }
    }

    /* renamed from: ae.a$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f15128n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f15129o;

        /* renamed from: q, reason: collision with root package name */
        public int f15131q;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15129o = obj;
            this.f15131q |= Integer.MIN_VALUE;
            return C1934a.this.e(null, null, this);
        }
    }

    /* renamed from: ae.a$d */
    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f15132n;

        /* renamed from: p, reason: collision with root package name */
        public int f15134p;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f15132n = obj;
            this.f15134p |= Integer.MIN_VALUE;
            return C1934a.this.f(null, null, this);
        }
    }

    public /* synthetic */ C1934a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final InterfaceC4280a d() {
        return (InterfaceC4280a) this.f15126a.getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:122|123))(3:124|125|(1:127))|12|13|(4:15|(11:20|21|22|23|24|(1:26)|27|28|(1:30)|31|(3:33|34|(16:46|47|(1:49)(1:82)|50|51|52|53|(2:54|(1:56)(1:57))|58|59|60|(1:62)|63|(1:65)(1:72)|66|(2:68|69)(2:70|71))(4:(2:44|45)|37|38|39))(2:86|87))|17|18)(2:105|(4:107|(1:112)|113|114)(3:115|116|(2:118|119)(2:120|121)))))|131|6|7|(0)(0)|12|13|(0)(0)|(2:(1:78)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0232, code lost:
    
        r13 = kotlin.Result.INSTANCE;
        r12 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ff A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002c, B:13:0x0051, B:15:0x005a, B:17:0x01ec, B:94:0x01b0, B:96:0x01c0, B:98:0x01ca, B:102:0x01d9, B:104:0x01e9, B:105:0x01ff, B:107:0x0205, B:109:0x020f, B:113:0x021d, B:115:0x022d, B:125:0x0040, B:21:0x0062, B:28:0x00a6, B:31:0x00ad, B:33:0x00b5, B:60:0x0109, B:62:0x010f, B:63:0x0117, B:66:0x011f, B:68:0x0124, B:70:0x0137, B:38:0x0161, B:43:0x0158, B:85:0x00ff, B:86:0x017e, B:91:0x009c), top: B:7:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002c, B:13:0x0051, B:15:0x005a, B:17:0x01ec, B:94:0x01b0, B:96:0x01c0, B:98:0x01ca, B:102:0x01d9, B:104:0x01e9, B:105:0x01ff, B:107:0x0205, B:109:0x020f, B:113:0x021d, B:115:0x022d, B:125:0x0040, B:21:0x0062, B:28:0x00a6, B:31:0x00ad, B:33:0x00b5, B:60:0x0109, B:62:0x010f, B:63:0x0117, B:66:0x011f, B:68:0x0124, B:70:0x0137, B:38:0x0161, B:43:0x0158, B:85:0x00ff, B:86:0x017e, B:91:0x009c), top: B:7:0x0023, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, Continuation continuation) {
        c cVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        Object m147constructorimpl;
        Object obj;
        InputStream byteStream;
        FileOutputStream fileOutputStream;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f15131q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f15131q = i11 - Integer.MIN_VALUE;
                Object obj2 = cVar.f15129o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f15131q;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC4280a d10 = d();
                    cVar.f15128n = str2;
                    cVar.f15131q = 1;
                    obj2 = d10.a(str, cVar);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) cVar.f15128n;
                    ResultKt.throwOnFailure(obj2);
                }
                String str3 = str2;
                response = (Response) obj2;
                Object obj3 = null;
                if (response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    if (errorBody == null) {
                        Object m147constructorimpl2 = Result.m147constructorimpl(null);
                        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl2);
                        return m150exceptionOrNullimpl != null ? SalesIQResponse.INSTANCE.b(m150exceptionOrNullimpl) : SalesIQResponse.INSTANCE.b(new Exception());
                    }
                    SalesIQResponse.Error a12 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                    if (a12 != null && (a10 = SalesIQResponse.INSTANCE.a(a12, response.code())) != null) {
                        return a10;
                    }
                    return SalesIQResponse.INSTANCE.b(new Exception(errorBody.toString()));
                }
                ResponseBody responseBody = (ResponseBody) response.body();
                if (responseBody != null) {
                    try {
                        Result.Companion companion2 = Result.INSTANCE;
                        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str3, "/", 0, false, 6, (Object) null);
                        try {
                            String substring = str3.substring(0, lastIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                            File file = new File(substring);
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            String substring2 = str3.substring(lastIndexOf$default + 1);
                            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                            File file2 = new File(file, substring2);
                            file2.createNewFile();
                            m147constructorimpl = Result.m147constructorimpl(file2);
                        } catch (Throwable th2) {
                            Result.Companion companion3 = Result.INSTANCE;
                            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                        }
                        if (Result.m153isFailureimpl(m147constructorimpl)) {
                            m147constructorimpl = null;
                        }
                        File file3 = (File) m147constructorimpl;
                        if (!response.isSuccessful()) {
                            return SalesIQResponse.INSTANCE.a(new SalesIQResponse.Error(Boxing.boxInt(response.code()), new SalesIQResponse.Error.ErrorResponse(new SalesIQResponse.Error.ErrorResponse.Error(Boxing.boxInt(response.code()), response.message())), null, 4, null), response.code());
                        }
                        if (response.code() != 200) {
                            if (file3 != null) {
                                try {
                                    obj3 = Boxing.boxBoolean(file3.delete());
                                } catch (Throwable th3) {
                                    Result.Companion companion4 = Result.INSTANCE;
                                    Result.m147constructorimpl(ResultKt.createFailure(th3));
                                }
                            }
                            Result.m147constructorimpl(obj3);
                            return SalesIQResponse.INSTANCE.a(new SalesIQResponse.Error(Boxing.boxInt(response.code()), null, null, 4, null), response.code());
                        }
                        try {
                            ResponseBody responseBody2 = (ResponseBody) response.body();
                            byteStream = responseBody2 != null ? responseBody2.byteStream() : null;
                            fileOutputStream = new FileOutputStream(str3);
                        } catch (Throwable th4) {
                            Result.Companion companion5 = Result.INSTANCE;
                            obj = Result.m147constructorimpl(ResultKt.createFailure(th4));
                        }
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                Intrinsics.checkNotNull(byteStream);
                                int read = byteStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileOutputStream, null);
                            obj = Result.m147constructorimpl(new File(str3));
                            Throwable m150exceptionOrNullimpl2 = Result.m150exceptionOrNullimpl(obj);
                            if (m150exceptionOrNullimpl2 != null) {
                                LiveChatUtil.log(m150exceptionOrNullimpl2);
                            }
                            if (!Result.m153isFailureimpl(obj)) {
                                obj3 = obj;
                            }
                            File file4 = (File) obj3;
                            return file4 != null ? SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, file4, response.code(), false, null, null, null, 60, null) : SalesIQResponse.INSTANCE.b(new Throwable("Error in fetching file"));
                        } finally {
                        }
                    } catch (Throwable th5) {
                        Result.Companion companion6 = Result.INSTANCE;
                        Object m147constructorimpl3 = Result.m147constructorimpl(ResultKt.createFailure(th5));
                        if (Result.m150exceptionOrNullimpl(m147constructorimpl3) != null) {
                            SalesIQResponse.Error a13 = com.zoho.livechat.android.modules.common.data.remote.responses.a.a(response, Yd.a.j());
                            return (a13 == null || (a11 = SalesIQResponse.INSTANCE.a(a13, response.code())) == null) ? SalesIQResponse.INSTANCE.b(new Exception(responseBody.toString())) : a11;
                        }
                        Result.m146boximpl(m147constructorimpl3);
                    }
                }
                return SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
            }
        }
        cVar = new c(continuation);
        Object obj22 = cVar.f15129o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f15131q;
        if (i10 != 0) {
        }
        String str32 = str2;
        response = (Response) obj22;
        Object obj32 = null;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(7:57|58|(1:60)|61|(1:63)|64|(1:66))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|70|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b2, code lost:
    
        r12 = kotlin.Result.INSTANCE;
        r11 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d3 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #1 {all -> 0x002b, blocks: (B:10:0x0026, B:11:0x00cb, B:13:0x00d3, B:15:0x016c, B:27:0x0131, B:29:0x0141, B:31:0x014b, B:35:0x0159, B:37:0x0169, B:38:0x017f, B:40:0x0185, B:42:0x018f, B:46:0x019d, B:48:0x01ad, B:58:0x003a, B:60:0x005d, B:61:0x0062, B:63:0x0068, B:64:0x006d, B:19:0x00db, B:21:0x00e3, B:23:0x011e), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:10:0x0026, B:11:0x00cb, B:13:0x00d3, B:15:0x016c, B:27:0x0131, B:29:0x0141, B:31:0x014b, B:35:0x0159, B:37:0x0169, B:38:0x017f, B:40:0x0185, B:42:0x018f, B:46:0x019d, B:48:0x01ad, B:58:0x003a, B:60:0x005d, B:61:0x0062, B:63:0x0068, B:64:0x006d, B:19:0x00db, B:21:0x00e3, B:23:0x011e), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, AbstractC2916a abstractC2916a, Continuation continuation) {
        d dVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f15134p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f15134p = i11 - Integer.MIN_VALUE;
                Object obj = dVar.f15132n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f15134p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    InterfaceC4280a d10 = d();
                    MultipartBody.Builder builder = new MultipartBody.Builder(null, 1, null);
                    MultipartBody.Part.Companion companion2 = MultipartBody.Part.INSTANCE;
                    k kVar = new k();
                    kVar.p("type", abstractC2916a.c());
                    String a12 = abstractC2916a.a();
                    if (a12 != null) {
                        kVar.p("message", a12);
                    }
                    String b10 = abstractC2916a.b();
                    if (b10 != null) {
                        kVar.p("stack_trace", b10);
                    }
                    Unit unit = Unit.INSTANCE;
                    String hVar = kVar.toString();
                    Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
                    builder.addPart(companion2.createFormData("subject", hVar));
                    builder.addPart(companion2.createFormData("logonly", "true"));
                    builder.addPart(companion2.createFormData("log", "[{\"info\":" + C6218a.Y(true) + "}]"));
                    builder.addPart(companion2.createFormData("nocache", String.valueOf(rd.b.f())));
                    MultipartBody build = builder.build();
                    dVar.f15134p = 1;
                    obj = d10.b(str, build, dVar);
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
                        Result.Companion companion3 = Result.INSTANCE;
                        return salesIQRestResponse.getData() != null ? SalesIQResponse.INSTANCE.d(salesIQRestResponse.getData(), response.code(), salesIQRestResponse.getMoreDataAvailable(), salesIQRestResponse.getSyncTime(), MapsKt.toMap(response.raw().headers()), Boxing.boxLong(response.raw().receivedResponseAtMillis() - response.raw().sentRequestAtMillis())) : SalesIQResponse.Companion.e(SalesIQResponse.INSTANCE, null, response.code(), false, null, null, null, 60, null);
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
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
        Object obj2 = dVar.f15132n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f15134p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    public C1934a() {
        this.f15126a = LazyKt.lazy(b.f15127d);
    }
}
