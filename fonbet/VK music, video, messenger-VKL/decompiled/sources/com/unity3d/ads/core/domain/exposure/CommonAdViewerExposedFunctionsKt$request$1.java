package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.model.OnWebRequestComplete;
import com.unity3d.ads.adplayer.model.OnWebRequestFailed;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.e43;
import xsna.emb;
import xsna.rl3;
import xsna.spj;

/* compiled from: CommonAdViewerExposedFunctions.kt */
/* loaded from: classes14.dex */
public final class CommonAdViewerExposedFunctionsKt$request$1 implements ExposedFunction {
    final /* synthetic */ ExecuteAdViewerRequest $executeAdViewerRequest;
    final /* synthetic */ RequestType $type;

    public CommonAdViewerExposedFunctionsKt$request$1(ExecuteAdViewerRequest executeAdViewerRequest, RequestType requestType) {
        this.$executeAdViewerRequest = executeAdViewerRequest;
        this.$type = requestType;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x002b, B:12:0x005d, B:14:0x0067, B:15:0x007a, B:19:0x006a, B:21:0x006e), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x002b, B:12:0x005d, B:14:0x0067, B:15:0x007a, B:19:0x006a, B:21:0x006e), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke2(Object[] objArr, spj<Object> spjVar) {
        CommonAdViewerExposedFunctionsKt$request$1$invoke$1 commonAdViewerExposedFunctionsKt$request$1$invoke$1;
        int i;
        String str;
        Exception e;
        String str2;
        String message;
        if (spjVar instanceof CommonAdViewerExposedFunctionsKt$request$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$request$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$request$1$invoke$1) spjVar;
            int i2 = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$request$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$request$1$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
                if (i != 0) {
                    a.a(obj);
                    String str3 = (String) rl3.L(objArr);
                    String str4 = (String) rl3.S(1, objArr);
                    try {
                        ExecuteAdViewerRequest executeAdViewerRequest = this.$executeAdViewerRequest;
                        RequestType requestType = this.$type;
                        commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$0 = str3;
                        commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$1 = str4;
                        commonAdViewerExposedFunctionsKt$request$1$invoke$1.label = 1;
                        Object invoke = executeAdViewerRequest.invoke(requestType, objArr, commonAdViewerExposedFunctionsKt$request$1$invoke$1);
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = str3;
                        obj = invoke;
                        str2 = str4;
                    } catch (Exception e2) {
                        str = str3;
                        e = e2;
                        str2 = str4;
                        message = e.getMessage();
                        if (message == null) {
                        }
                        return new OnWebRequestFailed(e43.l(str, str2, message));
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$1;
                    str = (String) commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$0;
                    try {
                        a.a(obj);
                    } catch (Exception e3) {
                        e = e3;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        return new OnWebRequestFailed(e43.l(str, str2, message));
                    }
                }
                HttpResponse httpResponse = (HttpResponse) obj;
                Object body = httpResponse.getBody();
                return new OnWebRequestComplete(e43.l(str, httpResponse.getUrlString(), !(body instanceof String) ? (String) body : body instanceof byte[] ? new String((byte[]) body, emb.b) : null, new Integer(httpResponse.getStatusCode()), HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse.getHeaders())));
            }
        }
        commonAdViewerExposedFunctionsKt$request$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$request$1$invoke$1(this, spjVar);
        Object obj2 = commonAdViewerExposedFunctionsKt$request$1$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
        if (i != 0) {
        }
        HttpResponse httpResponse2 = (HttpResponse) obj2;
        Object body2 = httpResponse2.getBody();
        return new OnWebRequestComplete(e43.l(str, httpResponse2.getUrlString(), !(body2 instanceof String) ? (String) body2 : body2 instanceof byte[] ? new String((byte[]) body2, emb.b) : null, new Integer(httpResponse2.getStatusCode()), HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse2.getHeaders())));
    }

    @Override // com.unity3d.ads.adplayer.ExposedFunction, xsna.wzs
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, spj<? super Object> spjVar) {
        return invoke2(objArr, (spj<Object>) spjVar);
    }
}
