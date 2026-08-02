package m5;

import I5.CoralogixLog;
import Ph.AbstractC1455i;
import Ph.P;
import android.net.TrafficStats;
import android.net.Uri;
import ei.AbstractC4212b;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m5.InterfaceC5561c;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import s5.C6339a;
import zendesk.core.Constants;

/* renamed from: m5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5559a implements InterfaceC5560b {

    /* renamed from: a, reason: collision with root package name */
    public final P f56366a;

    /* renamed from: b, reason: collision with root package name */
    public final OkHttpClient f56367b;

    /* renamed from: c, reason: collision with root package name */
    public final N5.a f56368c;

    /* renamed from: m5.a$a, reason: collision with other inner class name */
    public static final class C0813a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f56369n;

        /* renamed from: p, reason: collision with root package name */
        public int f56371p;

        public C0813a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f56369n = obj;
            this.f56371p |= Integer.MIN_VALUE;
            return C5559a.this.a(null, this);
        }
    }

    /* renamed from: m5.a$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f56372n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Request f56374p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Request request, Continuation continuation) {
            super(2, continuation);
            this.f56374p = request;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C5559a.this.new b(this.f56374p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56372n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int threadStatsTag = TrafficStats.getThreadStatsTag();
            TrafficStats.setThreadStatsTag(1000);
            try {
                return C5559a.this.c().newCall(this.f56374p).execute();
            } finally {
                TrafficStats.setThreadStatsTag(threadStatsTag);
            }
        }
    }

    public C5559a(P scope, OkHttpClient httpClient, N5.a configurationsManager) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(configurationsManager, "configurationsManager");
        this.f56366a = scope;
        this.f56367b = httpClient;
        this.f56368c = configurationsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0130 A[Catch: IOException -> 0x002b, TryCatch #0 {IOException -> 0x002b, blocks: (B:10:0x0026, B:11:0x0122, B:13:0x0130, B:14:0x0134, B:16:0x0156, B:19:0x0159, B:41:0x010c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0156 A[Catch: IOException -> 0x002b, TryCatch #0 {IOException -> 0x002b, blocks: (B:10:0x0026, B:11:0x0122, B:13:0x0130, B:14:0x0134, B:16:0x0156, B:19:0x0159, B:41:0x010c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0159 A[Catch: IOException -> 0x002b, TRY_LEAVE, TryCatch #0 {IOException -> 0x002b, blocks: (B:10:0x0026, B:11:0x0122, B:13:0x0130, B:14:0x0134, B:16:0x0156, B:19:0x0159, B:41:0x010c), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // m5.InterfaceC5560b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(CoralogixLog coralogixLog, Continuation continuation) {
        C0813a c0813a;
        int i10;
        Uri parse;
        Uri.Builder buildUpon;
        Uri.Builder appendQueryParameter;
        Uri build;
        String uri;
        try {
            if (continuation instanceof C0813a) {
                c0813a = (C0813a) continuation;
                int i11 = c0813a.f56371p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c0813a.f56371p = i11 - Integer.MIN_VALUE;
                    Object obj = c0813a.f56369n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = c0813a.f56371p;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        E5.b bVar = E5.b.f3006a;
                        bVar.a("sending log to server: " + coralogixLog);
                        AbstractC4212b b10 = F5.b.b();
                        b10.a();
                        String b11 = b10.b(CoralogixLog.INSTANCE.serializer(), coralogixLog);
                        bVar.a("log json: " + b11);
                        RequestBody create = RequestBody.INSTANCE.create(b11, MediaType.INSTANCE.get("application/json; charset=utf-8"));
                        Q5.c c10 = b().k().c();
                        String str = c10.g().a() + "/browser/v1beta/logs";
                        String p10 = c10.p();
                        if (p10 != null) {
                            if (StringsKt.isBlank(p10)) {
                                p10 = null;
                            }
                            if (p10 != null && (parse = Uri.parse(p10)) != null && (buildUpon = parse.buildUpon()) != null && (appendQueryParameter = buildUpon.appendQueryParameter("cxforward", str)) != null && (build = appendQueryParameter.build()) != null && (uri = build.toString()) != null) {
                                str = uri;
                            }
                        }
                        Request build2 = new Request.Builder().url(str).addHeader(Constants.AUTHORIZATION_HEADER, "Bearer " + c10.q()).addHeader("X-Coralogix-Internal", "1").post(create).build();
                        CoroutineContext coroutineContext = d().getCoroutineContext();
                        b bVar2 = new b(build2, null);
                        c0813a.f56371p = 1;
                        obj = AbstractC1455i.g(coroutineContext, bVar2, c0813a);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Response response = (Response) obj;
                    E5.b bVar3 = E5.b.f3006a;
                    boolean isSuccessful = response.isSuccessful();
                    ResponseBody body = response.body();
                    bVar3.a("send log response is successful: " + isSuccessful + ", response body: " + (body != null ? body.string() : null));
                    return !response.isSuccessful() ? InterfaceC5561c.b.f56376a : InterfaceC5561c.a.f56375a;
                }
            }
            if (i10 != 0) {
            }
            Response response2 = (Response) obj;
            E5.b bVar32 = E5.b.f3006a;
            boolean isSuccessful2 = response2.isSuccessful();
            ResponseBody body2 = response2.body();
            if (body2 != null) {
            }
            bVar32.a("send log response is successful: " + isSuccessful2 + ", response body: " + (body2 != null ? body2.string() : null));
            if (!response2.isSuccessful()) {
            }
        } catch (IOException e10) {
            E5.b.f3006a.c("send log error", e10);
            return InterfaceC5561c.a.f56375a;
        }
        c0813a = new C0813a(continuation);
        Object obj2 = c0813a.f56369n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c0813a.f56371p;
    }

    public N5.a b() {
        return this.f56368c;
    }

    public OkHttpClient c() {
        return this.f56367b;
    }

    public P d() {
        return this.f56366a;
    }

    public /* synthetic */ C5559a(P p10, OkHttpClient okHttpClient, N5.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C6339a.f64787a.a() : p10, (i10 & 2) != 0 ? new OkHttpClient.Builder().build() : okHttpClient, aVar);
    }
}
