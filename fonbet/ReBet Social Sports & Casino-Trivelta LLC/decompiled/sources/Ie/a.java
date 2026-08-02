package Ie;

import com.appsflyer.AdRevenueScheme;
import com.google.gson.h;
import com.google.gson.k;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQResponse;
import com.zoho.livechat.android.modules.common.data.remote.responses.SalesIQRestResponse;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.HashMap;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import od.y;
import og.AbstractC5896h;
import og.i;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static a f5762c;

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f5764a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0124a f5761b = new C0124a(null);

    /* renamed from: d, reason: collision with root package name */
    public static Object f5763d = new Object();

    /* renamed from: Ie.a$a, reason: collision with other inner class name */
    public static final class C0124a {
        public /* synthetic */ C0124a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            a aVar;
            synchronized (a.f5763d) {
                aVar = a.f5762c;
                if (aVar == null) {
                    aVar = new a(null);
                    a.f5762c = aVar;
                }
            }
            return aVar;
        }

        public C0124a() {
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f5765d = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Je.a invoke() {
            return (Je.a) Yd.a.n().create(Je.a.class);
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f5766n;

        /* renamed from: p, reason: collision with root package name */
        public int f5768p;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5766n = obj;
            this.f5768p |= Integer.MIN_VALUE;
            return a.this.f(null, null, null, null, this);
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f5769n;

        /* renamed from: p, reason: collision with root package name */
        public int f5771p;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5769n = obj;
            this.f5771p |= Integer.MIN_VALUE;
            return a.this.g(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    public static final class e extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f5772n;

        /* renamed from: p, reason: collision with root package name */
        public int f5774p;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5772n = obj;
            this.f5774p |= Integer.MIN_VALUE;
            return a.this.h(null, null, null, this);
        }
    }

    public static final class f extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f5775n;

        /* renamed from: p, reason: collision with root package name */
        public int f5777p;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5775n = obj;
            this.f5777p |= Integer.MIN_VALUE;
            return a.this.i(null, null, false, this);
        }
    }

    public static final class g extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f5778n;

        /* renamed from: p, reason: collision with root package name */
        public int f5780p;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5778n = obj;
            this.f5780p |= Integer.MIN_VALUE;
            return a.this.j(null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, this);
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Je.a d() {
        return (Je.a) this.f5764a.getValue();
    }

    public final MediaType e() {
        return MediaType.INSTANCE.parse("application/json");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(3:57|58|(1:60))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|64|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0151, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0069, B:13:0x0071, B:15:0x010a, B:27:0x00cf, B:29:0x00df, B:31:0x00e9, B:35:0x00f7, B:37:0x0107, B:38:0x011d, B:40:0x0123, B:42:0x012d, B:46:0x013b, B:48:0x014b, B:58:0x0047, B:19:0x0079, B:21:0x0081, B:23:0x00bc), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x0069, B:13:0x0071, B:15:0x010a, B:27:0x00cf, B:29:0x00df, B:31:0x00e9, B:35:0x00f7, B:37:0x0107, B:38:0x011d, B:40:0x0123, B:42:0x012d, B:46:0x013b, B:48:0x014b, B:58:0x0047, B:19:0x0079, B:21:0x0081, B:23:0x00bc), top: B:7:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, String str3, String str4, Continuation continuation) {
        c cVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f5768p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f5768p = i11 - Integer.MIN_VALUE;
                Object obj = cVar.f5766n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = cVar.f5768p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    k kVar = new k();
                    kVar.p("session_id", str3);
                    kVar.p("user_id", str4);
                    Result.Companion companion = Result.INSTANCE;
                    Je.a d10 = d();
                    RequestBody.Companion companion2 = RequestBody.INSTANCE;
                    String hVar = kVar.toString();
                    Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
                    RequestBody create = companion2.create(hVar, e());
                    cVar.f5768p = 1;
                    obj = d10.d(str, str2, create, cVar);
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
        cVar = new c(continuation);
        Object obj2 = cVar.f5766n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f5768p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:56|57))(20:58|(1:62)|(1:64)|(1:66)|(1:68)|(1:70)|(1:72)|73|(1:75)|(1:77)|78|(1:80)(1:101)|81|(3:83|(1:85)(1:88)|(1:87))|89|(1:91)|92|(1:94)(2:98|(1:100))|95|(1:97))|12|(4:14|(3:19|20|(2:22|23)(2:24|25))|16|17)(2:39|(4:41|(1:46)|47|48)(3:49|50|(2:52|53)(2:54|55)))))|104|6|7|(0)(0)|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0044, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0254, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0142 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:10:0x003d, B:12:0x013a, B:14:0x0142, B:16:0x01fc, B:28:0x01c0, B:30:0x01d0, B:32:0x01da, B:36:0x01e8, B:38:0x01f9, B:39:0x0221, B:41:0x0227, B:43:0x0231, B:47:0x023f, B:49:0x024f, B:95:0x0116, B:20:0x014b, B:22:0x0153, B:24:0x019b), top: B:7:0x0039, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0221 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:10:0x003d, B:12:0x013a, B:14:0x0142, B:16:0x01fc, B:28:0x01c0, B:30:0x01d0, B:32:0x01da, B:36:0x01e8, B:38:0x01f9, B:39:0x0221, B:41:0x0227, B:43:0x0231, B:47:0x023f, B:49:0x024f, B:95:0x0116, B:20:0x014b, B:22:0x0153, B:24:0x019b), top: B:7:0x0039, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, k kVar, String str11, String str12, String str13, Pe.a aVar, Boolean bool, Continuation continuation) {
        d dVar;
        a aVar2;
        int i10;
        Object obj;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f5771p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f5771p = i11 - Integer.MIN_VALUE;
                aVar2 = this;
                Object obj2 = dVar.f5769n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f5771p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    k kVar2 = new k();
                    obj = null;
                    kVar2.p("user_id", str3);
                    kVar2.p(EventKeys.PLATFORM, "Android");
                    if (str4 != null && !LiveChatUtil.isAnnonVisitorbyName(str4)) {
                        kVar2.p("name", str4);
                    }
                    if (str7 != null) {
                        kVar2.p("avuid", str7);
                    }
                    if (str8 != null) {
                        kVar2.p("cvuid", str8);
                    }
                    if (str10 != null) {
                        kVar2.p("page_title", str10);
                    }
                    if (str5 != null) {
                        kVar2.p("email", str5);
                    }
                    if (str6 != null) {
                        kVar2.p("phone", str6);
                    }
                    k kVar3 = new k();
                    kVar3.m("visitor", kVar2);
                    kVar3.p(PublisherMetadata.APP_ID, LiveChatUtil.getAppID());
                    kVar3.p("message", str11);
                    kVar3.p("department_id", str12);
                    kVar3.p("ack_key", str13);
                    if (str9 != null) {
                        kVar3.p("uvid", str9);
                    }
                    if (bool != null) {
                        kVar3.n("subscribe", bool);
                    }
                    Pe.a aVar3 = Pe.a.Audio;
                    kVar3.n("isdirectcall", Boxing.boxBoolean(aVar == aVar3));
                    if (kVar != null) {
                        k kVar4 = !kVar.isEmpty() ? kVar : null;
                        if (kVar4 != null) {
                            kVar3.m("customer_info", kVar4);
                        }
                    }
                    if (i.f(str2)) {
                        kVar3.p("client_message_id", str2);
                    }
                    HashMap hashMap = new HashMap();
                    if (aVar == aVar3) {
                        hashMap.put("X-Mobilisten-Call", "true");
                    } else if (aVar == Pe.a.Chat) {
                        hashMap.put("X-Mobilisten-Chat", "true");
                    }
                    Result.Companion companion = Result.INSTANCE;
                    Je.a d10 = aVar2.d();
                    RequestBody.Companion companion2 = RequestBody.INSTANCE;
                    String hVar = kVar3.toString();
                    Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
                    RequestBody create = companion2.create(hVar, aVar2.e());
                    dVar.f5771p = 1;
                    obj2 = d10.c(str, hashMap, create, dVar);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                    obj = null;
                }
                response = (Response) obj2;
                if (response.isSuccessful()) {
                    ResponseBody errorBody = response.errorBody();
                    if (errorBody == null) {
                        Object m147constructorimpl = Result.m147constructorimpl(obj);
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
        aVar2 = this;
        dVar = aVar2.new d(continuation);
        Object obj22 = dVar.f5769n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f5771p;
        if (i10 != 0) {
        }
        response = (Response) obj22;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:55|56))(3:57|58|(1:60))|11|(4:13|(3:18|19|(2:21|22)(2:23|24))|15|16)(2:38|(4:40|(1:45)|46|47)(3:48|49|(2:51|52)(2:53|54)))))|64|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0153, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x006b, B:13:0x0073, B:15:0x010c, B:27:0x00d1, B:29:0x00e1, B:31:0x00eb, B:35:0x00f9, B:37:0x0109, B:38:0x011f, B:40:0x0125, B:42:0x012f, B:46:0x013d, B:48:0x014d, B:58:0x0049, B:19:0x007b, B:21:0x0083, B:23:0x00be), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011f A[Catch: all -> 0x0029, TryCatch #0 {all -> 0x0029, blocks: (B:10:0x0025, B:11:0x006b, B:13:0x0073, B:15:0x010c, B:27:0x00d1, B:29:0x00e1, B:31:0x00eb, B:35:0x00f9, B:37:0x0109, B:38:0x011f, B:40:0x0125, B:42:0x012f, B:46:0x013d, B:48:0x014d, B:58:0x0049, B:19:0x007b, B:21:0x0083, B:23:0x00be), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, String str2, com.google.gson.e eVar, Continuation continuation) {
        e eVar2;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof e) {
            eVar2 = (e) continuation;
            int i11 = eVar2.f5774p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar2.f5774p = i11 - Integer.MIN_VALUE;
                Object obj = eVar2.f5772n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = eVar2.f5774p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    k kVar = new k();
                    kVar.p(EventKeys.DATA, "messages");
                    kVar.m("to_address", eVar);
                    Result.Companion companion = Result.INSTANCE;
                    Je.a d10 = d();
                    RequestBody.Companion companion2 = RequestBody.INSTANCE;
                    String hVar = kVar.toString();
                    Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
                    RequestBody create = companion2.create(hVar, e());
                    eVar2.f5774p = 1;
                    obj = d10.a(str, str2, create, eVar2);
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
        eVar2 = new e(continuation);
        Object obj2 = eVar2.f5772n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = eVar2.f5774p;
        if (i10 != 0) {
        }
        response = (Response) obj2;
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(2:11|12)(2:57|58))(2:59|60))(4:61|62|(3:64|(1:66)|60)(1:68)|67)|13|(4:15|(3:20|21|(2:23|24)(2:25|26))|17|18)(2:40|(4:42|(1:47)|48|49)(3:50|51|(2:53|54)(2:55|56)))))|73|6|7|(0)(0)|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0080, code lost:
    
        if (r13 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016b, code lost:
    
        r11 = kotlin.Result.INSTANCE;
        r10 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #1 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0083, B:13:0x0085, B:15:0x008b, B:17:0x0124, B:29:0x00e9, B:31:0x00f9, B:33:0x0103, B:37:0x0111, B:39:0x0121, B:40:0x0137, B:42:0x013d, B:44:0x0147, B:48:0x0155, B:50:0x0165, B:59:0x0038, B:60:0x0073, B:62:0x003f, B:64:0x0043, B:68:0x0076, B:21:0x0093, B:23:0x009b, B:25:0x00d6), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0137 A[Catch: all -> 0x002c, TryCatch #1 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0083, B:13:0x0085, B:15:0x008b, B:17:0x0124, B:29:0x00e9, B:31:0x00f9, B:33:0x0103, B:37:0x0111, B:39:0x0121, B:40:0x0137, B:42:0x013d, B:44:0x0147, B:48:0x0155, B:50:0x0165, B:59:0x0038, B:60:0x0073, B:62:0x003f, B:64:0x0043, B:68:0x0076, B:21:0x0093, B:23:0x009b, B:25:0x00d6), top: B:7:0x0022, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, boolean z10, Continuation continuation) {
        f fVar;
        int i10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f5777p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f5777p = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f5775n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = fVar.f5777p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.INSTANCE;
                    if (z10) {
                        Je.a d10 = d();
                        RequestBody.Companion companion2 = RequestBody.INSTANCE;
                        k kVar = new k();
                        kVar.p("call_status", "cancel");
                        String hVar = kVar.toString();
                        Intrinsics.checkNotNullExpressionValue(hVar, "toString(...)");
                        RequestBody create = companion2.create(hVar, MediaType.INSTANCE.parse("application/json; charset=utf-8"));
                        fVar.f5777p = 1;
                        obj = d10.b(str, str2, create, fVar);
                        if (obj == coroutine_suspended) {
                        }
                        response = (Response) obj;
                    } else {
                        Je.a d11 = d();
                        fVar.f5777p = 2;
                        obj = d11.f(str, str2, fVar);
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    response = (Response) obj;
                } else {
                    if (i10 != 2) {
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
        fVar = new f(continuation);
        Object obj2 = fVar.f5775n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = fVar.f5777p;
        if (i10 != 0) {
        }
        if (response.isSuccessful()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:56|57))(30:58|(1:60)|(1:62)|(1:64)|(1:66)|(1:68)|(1:70)|(1:72)|(11:74|(1:76)|77|(1:79)|80|(1:82)|83|(1:85)|86|(1:88)|89)|90|(1:92)|93|(1:95)|(1:97)|(3:99|(1:101)(1:104)|(1:103))|105|(1:107)|(1:109)|(1:111)|(1:113)|(1:115)|116|(1:118)|(1:120)|(1:122)|(1:126)|127|(1:129)(2:133|(1:135))|130|(1:132))|12|(4:14|(3:19|20|(2:22|23)(2:24|25))|16|17)(2:39|(4:41|(1:46)|47|48)(3:49|50|(2:52|53)(2:54|55)))))|138|6|7|(0)(0)|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x004f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0377, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m147constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0265 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #1 {all -> 0x004f, blocks: (B:10:0x0048, B:12:0x025c, B:14:0x0265, B:16:0x031f, B:28:0x02e3, B:30:0x02f3, B:32:0x02fd, B:36:0x030b, B:38:0x031c, B:39:0x0344, B:41:0x034a, B:43:0x0354, B:47:0x0362, B:49:0x0372, B:130:0x0243, B:20:0x026e, B:22:0x0276, B:24:0x02be), top: B:7:0x0044, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0344 A[Catch: all -> 0x004f, TryCatch #1 {all -> 0x004f, blocks: (B:10:0x0048, B:12:0x025c, B:14:0x0265, B:16:0x031f, B:28:0x02e3, B:30:0x02f3, B:32:0x02fd, B:36:0x030b, B:38:0x031c, B:39:0x0344, B:41:0x034a, B:43:0x0354, B:47:0x0362, B:49:0x0372, B:130:0x0243, B:20:0x026e, B:22:0x0276, B:24:0x02be), top: B:7:0x0044, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, String str3, String str4, String str5, String str6, String str7, Pe.a aVar, boolean z10, boolean z11, boolean z12, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, k kVar, h hVar, Long l10, y yVar, Boolean bool, String str19, h hVar2, h hVar3, boolean z13, Continuation continuation) {
        g gVar;
        int i10;
        Object e10;
        Response response;
        SalesIQResponse a10;
        SalesIQResponse a11;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f5780p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f5780p = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f5778n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = gVar.f5780p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    k kVar2 = new k();
                    kVar2.p("user_id", str3);
                    if (str9 != null) {
                        kVar2.p("avuid", str9);
                        Unit unit = Unit.INSTANCE;
                    }
                    if (str10 != null) {
                        kVar2.p("cvuid", str10);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    if (str11 != null) {
                        kVar2.p("name", str11);
                        Unit unit3 = Unit.INSTANCE;
                    }
                    if (str12 != null) {
                        kVar2.p("email", str12);
                        Unit unit4 = Unit.INSTANCE;
                    }
                    if (str13 != null) {
                        kVar2.p("phone", str13);
                        Unit unit5 = Unit.INSTANCE;
                    }
                    if (str16 != null) {
                        kVar2.p("zldp", str16);
                        Unit unit6 = Unit.INSTANCE;
                    }
                    if (str18 != null) {
                        kVar2.p("page_title", str18);
                        kVar2.p("current_page", str18);
                        Unit unit7 = Unit.INSTANCE;
                    }
                    if (yVar != null) {
                        k kVar3 = new k();
                        kVar3.o("latitude", Boxing.boxDouble(yVar.d()));
                        kVar3.o("longitude", Boxing.boxDouble(yVar.e()));
                        String b10 = yVar.b();
                        if (b10 != null) {
                            Intrinsics.checkNotNull(b10);
                            kVar3.p(AdRevenueScheme.COUNTRY, yVar.b());
                            Unit unit8 = Unit.INSTANCE;
                        }
                        String a12 = yVar.a();
                        if (a12 != null) {
                            Intrinsics.checkNotNull(a12);
                            kVar3.p("city", yVar.a());
                            Unit unit9 = Unit.INSTANCE;
                        }
                        String f10 = yVar.f();
                        if (f10 != null) {
                            Intrinsics.checkNotNull(f10);
                            kVar3.p("state", yVar.f());
                            Unit unit10 = Unit.INSTANCE;
                        }
                        String c10 = yVar.c();
                        if (c10 != null) {
                            Intrinsics.checkNotNull(c10);
                            kVar3.p("country_code", yVar.c());
                            Unit unit11 = Unit.INSTANCE;
                        }
                        String g10 = yVar.g();
                        if (g10 != null) {
                            Intrinsics.checkNotNull(g10);
                            kVar3.p("zip_code", yVar.g());
                            Unit unit12 = Unit.INSTANCE;
                        }
                        kVar2.m("address", kVar3);
                        Unit unit13 = Unit.INSTANCE;
                    }
                    k kVar4 = new k();
                    kVar4.m("visitor", kVar2);
                    kVar4.p(PublisherMetadata.APP_ID, str2);
                    if (str9 != null) {
                        kVar4.p("avuid", str9);
                        Unit unit14 = Unit.INSTANCE;
                    }
                    kVar4.p("question", str4);
                    kVar4.p("client_message_id", str6);
                    kVar4.p("department_id", str7);
                    if (bool != null) {
                        kVar4.n("subscribe", bool);
                        Unit unit15 = Unit.INSTANCE;
                    }
                    if (str17 != null) {
                        kVar4.p("uvid", str17);
                        Unit unit16 = Unit.INSTANCE;
                    }
                    if (kVar != null) {
                        k kVar5 = !kVar.isEmpty() ? kVar : null;
                        if (kVar5 != null) {
                            kVar4.m("customer_info", kVar5);
                            Unit unit17 = Unit.INSTANCE;
                        }
                    }
                    kVar4.n("autotrigger", Boxing.boxBoolean(z11));
                    kVar4.p("type", "chat");
                    kVar4.p("ack_key", str5);
                    kVar4.n("app_logs", Boxing.boxBoolean(z10));
                    kVar4.n("include_bots", Boxing.boxBoolean(true));
                    kVar4.n("is_call_allowed", Boxing.boxBoolean(z13));
                    if (hVar3 != null) {
                        kVar4.m("secret_fields", hVar3);
                        Unit unit18 = Unit.INSTANCE;
                    }
                    if (str19 != null) {
                        kVar4.p("encrypted_visitor_info", str19);
                        Unit unit19 = Unit.INSTANCE;
                    }
                    if (hVar2 != null) {
                        kVar4.m("trigger_data", hVar2);
                        Unit unit20 = Unit.INSTANCE;
                    }
                    if (l10 != null) {
                        kVar4.o("custom_wait_time", Boxing.boxLong(l10.longValue()));
                        Unit unit21 = Unit.INSTANCE;
                    }
                    if (hVar != null) {
                        kVar4.m("meta", hVar);
                        Unit unit22 = Unit.INSTANCE;
                    }
                    Pe.a aVar2 = Pe.a.Audio;
                    if (aVar == aVar2) {
                        kVar4.p("type", "audio");
                    }
                    if (str8 != null) {
                        kVar4.p("session_id", str8);
                        Unit unit23 = Unit.INSTANCE;
                    }
                    if (str14 != null) {
                        kVar4.p("attender_email", str14);
                        Unit unit24 = Unit.INSTANCE;
                    }
                    if (z11 && z12 && str15 != null) {
                        kVar4.p("attender_id", str15);
                        Unit unit25 = Unit.INSTANCE;
                    }
                    HashMap hashMap = new HashMap();
                    if (aVar == aVar2) {
                        hashMap.put("X-Mobilisten-Call", "true");
                    } else if (aVar == Pe.a.Chat) {
                        hashMap.put("X-Mobilisten-Chat", "true");
                    }
                    Result.Companion companion = Result.INSTANCE;
                    Je.a d10 = d();
                    RequestBody g11 = AbstractC5896h.g(kVar4);
                    gVar.f5780p = 1;
                    e10 = d10.e(str, hashMap, g11, gVar);
                    if (e10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    e10 = obj;
                }
                response = (Response) e10;
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
        gVar = new g(continuation);
        Object obj2 = gVar.f5778n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = gVar.f5780p;
        if (i10 != 0) {
        }
        response = (Response) e10;
        if (response.isSuccessful()) {
        }
    }

    public a() {
        this.f5764a = LazyKt.lazy(b.f5765d);
    }
}
