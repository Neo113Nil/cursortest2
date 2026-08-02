package com.vk.push.core.network.data.source;

import android.net.Uri;
import com.vk.push.common.AppInfo;
import com.vk.push.common.HostInfoProvider;
import com.vk.push.core.network.data.model.AppInfoRemote;
import com.vk.push.core.network.exception.VkpnsRequestException;
import com.vk.push.core.network.exception.VkpnsRequestWithErrorBodyException;
import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;
import com.vk.push.core.network.model.ResponseError;
import com.vk.push.core.network.utils.AppInfoJsonParser;
import com.vk.push.core.network.utils.ExtensionsKt;
import com.vk.push.core.network.utils.MapperKt;
import com.vk.push.core.network.utils.ResponseErrorKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.b6l;
import xsna.bdn;
import xsna.c5g;
import xsna.izs;
import xsna.myc0;
import xsna.ovj;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;
import xsna.zcl;

/* compiled from: MasterHostApi.kt */
/* loaded from: classes5.dex */
public final class MasterHostApi {
    public final HttpClient a;
    public final HostInfoProvider b;
    public final ovj c;

    /* compiled from: MasterHostApi.kt */
    @b6l(c = "com.vk.push.core.network.data.source.MasterHostApi", f = "MasterHostApi.kt", l = {72}, m = "getAllExistingHostList-IoAF18A")
    public static final class a extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object m104getAllExistingHostListIoAF18A = MasterHostApi.this.m104getAllExistingHostListIoAF18A(this);
            return m104getAllExistingHostListIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED ? m104getAllExistingHostListIoAF18A : new Result(m104getAllExistingHostListIoAF18A);
        }
    }

    /* compiled from: MasterHostApi.kt */
    @b6l(c = "com.vk.push.core.network.data.source.MasterHostApi$getAllExistingHostList$2", f = "MasterHostApi.kt", l = {82}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends List<? extends AppInfo>>>, Object> {
        int label;

        /* compiled from: MasterHostApi.kt */
        public static final class a extends Lambda implements izs<Result<? extends HttpResponse>, Result<? extends List<? extends AppInfo>>> {
            public static final a i = new a(1);

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.Result$Failure] */
            /* JADX WARN: Type inference failed for: r0v1 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
            @Override // xsna.izs
            public final Result<? extends List<? extends AppInfo>> invoke(Result<? extends HttpResponse> result) {
                ?? failure;
                Result.Failure failure2;
                HttpResponse httpResponse;
                Object d = result.d();
                try {
                    kotlin.a.a(d);
                    httpResponse = (HttpResponse) d;
                } catch (Exception e) {
                    failure = new Result.Failure(e);
                }
                if (ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                    ResponseError parseErrorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                    failure2 = new Result.Failure(new VkpnsRequestWithErrorBodyException(parseErrorResponse.toString(), parseErrorResponse.getCode()));
                } else if (httpResponse.isSuccessful()) {
                    List<AppInfoRemote> parseAppInfoList = AppInfoJsonParser.INSTANCE.parseAppInfoList(httpResponse.getBody());
                    failure = new ArrayList(c5g.u(parseAppInfoList, 10));
                    Iterator it = parseAppInfoList.iterator();
                    while (it.hasNext()) {
                        failure.add(MapperKt.toAppInfo((AppInfoRemote) it.next()));
                    }
                    failure2 = failure;
                } else {
                    String message = httpResponse.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    failure2 = new Result.Failure(new VkpnsRequestException(message, httpResponse.getCode()));
                }
                return new Result<>(failure2);
            }
        }

        public b(spj<? super b> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return MasterHostApi.this.new b(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Result<? extends List<? extends AppInfo>>> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m108executeRequest0E7RQCE;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                HttpRequest.Get get = new HttpRequest.Get(ExtensionsKt.hostInfo(new Uri.Builder(), MasterHostApi.this.b).encodedPath("v1/multihost/all").build().toString());
                HttpClient httpClient = MasterHostApi.this.a;
                this.label = 1;
                m108executeRequest0E7RQCE = httpClient.m108executeRequest0E7RQCE(get, a.i, this);
                if (m108executeRequest0E7RQCE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                m108executeRequest0E7RQCE = ((Result) obj).d();
            }
            return new Result(m108executeRequest0E7RQCE);
        }
    }

    /* compiled from: MasterHostApi.kt */
    @b6l(c = "com.vk.push.core.network.data.source.MasterHostApi", f = "MasterHostApi.kt", l = {49}, m = "getHostList-gIAlu-s")
    public static final class c extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public c(spj<? super c> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object m105getHostListgIAlus = MasterHostApi.this.m105getHostListgIAlus(null, this);
            return m105getHostListgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m105getHostListgIAlus : new Result(m105getHostListgIAlus);
        }
    }

    /* compiled from: MasterHostApi.kt */
    @b6l(c = "com.vk.push.core.network.data.source.MasterHostApi$getHostList$2", f = "MasterHostApi.kt", l = {62}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends List<? extends AppInfo>>>, Object> {
        final /* synthetic */ List<String> $installedHostList;
        int label;
        final /* synthetic */ MasterHostApi this$0;

        /* compiled from: MasterHostApi.kt */
        public static final class a extends Lambda implements izs<Result<? extends HttpResponse>, Result<? extends List<? extends AppInfo>>> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Result<? extends List<? extends AppInfo>> invoke(Result<? extends HttpResponse> result) {
                Object failure;
                Object d = result.d();
                try {
                    kotlin.a.a(d);
                    HttpResponse httpResponse = (HttpResponse) d;
                    if (ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                        ResponseError parseErrorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                        failure = new Result.Failure(new VkpnsRequestWithErrorBodyException(parseErrorResponse.toString(), parseErrorResponse.getCode()));
                    } else if (httpResponse.isSuccessful()) {
                        failure = MapperKt.getSortedAppInfoListByArbiter(AppInfoJsonParser.INSTANCE.parseAppInfoList(httpResponse.getBody()));
                    } else {
                        String message = httpResponse.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        failure = new Result.Failure(new VkpnsRequestException(message, httpResponse.getCode()));
                    }
                } catch (Exception e) {
                    failure = new Result.Failure(e);
                }
                return new Result<>(failure);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<String> list, MasterHostApi masterHostApi, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$installedHostList = list;
            this.this$0 = masterHostApi;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$installedHostList, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Result<? extends List<? extends AppInfo>>> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m108executeRequest0E7RQCE;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                HttpRequest.Post post = new HttpRequest.Post(ExtensionsKt.hostInfo(new Uri.Builder(), this.this$0.b).encodedPath("v1/multihost/list").build().toString(), new JSONObject().put("packages", new JSONArray((Collection) this.$installedHostList)).toString());
                HttpClient httpClient = this.this$0.a;
                this.label = 1;
                m108executeRequest0E7RQCE = httpClient.m108executeRequest0E7RQCE(post, a.i, this);
                if (m108executeRequest0E7RQCE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                m108executeRequest0E7RQCE = ((Result) obj).d();
            }
            return new Result(m108executeRequest0E7RQCE);
        }
    }

    /* compiled from: MasterHostApi.kt */
    @b6l(c = "com.vk.push.core.network.data.source.MasterHostApi", f = "MasterHostApi.kt", l = {26}, m = "getMaster-gIAlu-s")
    public static final class e extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public e(spj<? super e> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object m106getMastergIAlus = MasterHostApi.this.m106getMastergIAlus(null, this);
            return m106getMastergIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m106getMastergIAlus : new Result(m106getMastergIAlus);
        }
    }

    /* compiled from: MasterHostApi.kt */
    @b6l(c = "com.vk.push.core.network.data.source.MasterHostApi$getMaster$2", f = "MasterHostApi.kt", l = {39}, m = "invokeSuspend")
    public static final class f extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends AppInfo>>, Object> {
        final /* synthetic */ List<String> $hostAppInfoList;
        int label;
        final /* synthetic */ MasterHostApi this$0;

        /* compiled from: MasterHostApi.kt */
        public static final class a extends Lambda implements izs<Result<? extends HttpResponse>, Result<? extends AppInfo>> {
            public static final a i = new a(1);

            @Override // xsna.izs
            public final Result<? extends AppInfo> invoke(Result<? extends HttpResponse> result) {
                Object failure;
                Object d = result.d();
                try {
                    kotlin.a.a(d);
                    HttpResponse httpResponse = (HttpResponse) d;
                    if (ResponseErrorKt.hasErrorBody(httpResponse.getBody())) {
                        ResponseError parseErrorResponse = ResponseErrorKt.parseErrorResponse(httpResponse.getBody());
                        failure = new Result.Failure(new VkpnsRequestWithErrorBodyException(parseErrorResponse.toString(), parseErrorResponse.getCode()));
                    } else if (httpResponse.isSuccessful()) {
                        failure = MapperKt.toAppInfo(AppInfoJsonParser.INSTANCE.parseAppInfo(httpResponse.getBody()));
                    } else {
                        String message = httpResponse.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        failure = new Result.Failure(new VkpnsRequestException(message, httpResponse.getCode()));
                    }
                } catch (Exception e) {
                    failure = new Result.Failure(e);
                }
                return new Result<>(failure);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<String> list, MasterHostApi masterHostApi, spj<? super f> spjVar) {
            super(2, spjVar);
            this.$hostAppInfoList = list;
            this.this$0 = masterHostApi;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new f(this.$hostAppInfoList, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Result<? extends AppInfo>> spjVar) {
            return ((f) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m108executeRequest0E7RQCE;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                List<String> list = this.$hostAppInfoList;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new JSONObject((String) it.next()));
                }
                HttpRequest.Post post = new HttpRequest.Post(ExtensionsKt.hostInfo(new Uri.Builder(), this.this$0.b).encodedPath("v1/multihost/master").build().toString(), new JSONObject().put("host_app_info", new JSONArray((Collection) arrayList)).toString());
                HttpClient httpClient = this.this$0.a;
                this.label = 1;
                m108executeRequest0E7RQCE = httpClient.m108executeRequest0E7RQCE(post, a.i, this);
                if (m108executeRequest0E7RQCE == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                m108executeRequest0E7RQCE = ((Result) obj).d();
            }
            return new Result(m108executeRequest0E7RQCE);
        }
    }

    public MasterHostApi(HttpClient httpClient, HostInfoProvider hostInfoProvider, ovj ovjVar) {
        this.a = httpClient;
        this.b = hostInfoProvider;
        this.c = ovjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getAllExistingHostList-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m104getAllExistingHostListIoAF18A(spj<? super Result<? extends List<AppInfo>>> spjVar) {
        a aVar;
        int i;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b bVar = new b(null);
                    aVar.label = 1;
                    obj = myc0.k(this.c, bVar, aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        aVar = new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getHostList-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m105getHostListgIAlus(List<String> list, spj<? super Result<? extends List<AppInfo>>> spjVar) {
        c cVar;
        int i;
        if (spjVar instanceof c) {
            cVar = (c) spjVar;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    d dVar = new d(list, this, null);
                    cVar.label = 1;
                    obj = myc0.k(this.c, dVar, cVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        cVar = new c(spjVar);
        Object obj2 = cVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: getMaster-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m106getMastergIAlus(List<String> list, spj<? super Result<AppInfo>> spjVar) {
        e eVar;
        int i;
        if (spjVar instanceof e) {
            eVar = (e) spjVar;
            int i2 = eVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.label = i2 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    f fVar = new f(list, this, null);
                    eVar.label = 1;
                    obj = myc0.k(this.c, fVar, eVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        eVar = new e(spjVar);
        Object obj2 = eVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MasterHostApi(HttpClient httpClient, HostInfoProvider hostInfoProvider, ovj ovjVar, int i, zcl zclVar) {
        this(httpClient, hostInfoProvider, ovjVar);
        if ((i & 4) != 0) {
            bdn bdnVar = bdn.a;
            ovjVar = wgl.c;
        }
    }
}
