package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.model.OnWebRequestComplete;
import com.unity3d.ads.adplayer.model.OnWebRequestFailed;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import defpackage.a70;
import defpackage.lu3;
import defpackage.ph0;
import defpackage.rq3;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonAdViewerExposedFunctionsKt$request$1 implements ExposedFunction {
    final /* synthetic */ ExecuteAdViewerRequest $executeAdViewerRequest;
    final /* synthetic */ RequestType $type;

    public CommonAdViewerExposedFunctionsKt$request$1(ExecuteAdViewerRequest executeAdViewerRequest, RequestType requestType) {
        this.$executeAdViewerRequest = executeAdViewerRequest;
        this.$type = requestType;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:12:0x005f, B:14:0x0069, B:15:0x007a, B:19:0x006d, B:21:0x0071), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[Catch: Exception -> 0x0030, TryCatch #0 {Exception -> 0x0030, blocks: (B:11:0x002c, B:12:0x005f, B:14:0x0069, B:15:0x007a, B:19:0x006d, B:21:0x0071), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, rq3<Object> rq3Var) {
        CommonAdViewerExposedFunctionsKt$request$1$invoke$1 commonAdViewerExposedFunctionsKt$request$1$invoke$1;
        int i;
        String str;
        Exception e;
        String str2;
        String message;
        Object body;
        if (rq3Var instanceof CommonAdViewerExposedFunctionsKt$request$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$request$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$request$1$invoke$1) rq3Var;
            int i2 = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$request$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$request$1$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
                String str3 = null;
                if (i != 0) {
                    y6a.M(obj);
                    Object z = ph0.z(objArr);
                    z.getClass();
                    String str4 = (String) z;
                    String str5 = (String) ph0.F(1, objArr);
                    try {
                        ExecuteAdViewerRequest executeAdViewerRequest = this.$executeAdViewerRequest;
                        RequestType requestType = this.$type;
                        commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$0 = str4;
                        commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$1 = str5;
                        commonAdViewerExposedFunctionsKt$request$1$invoke$1.label = 1;
                        Object invoke = executeAdViewerRequest.invoke(requestType, objArr, commonAdViewerExposedFunctionsKt$request$1$invoke$1);
                        if (invoke == lu3Var) {
                            return lu3Var;
                        }
                        str = str4;
                        obj = invoke;
                        str2 = str5;
                    } catch (Exception e2) {
                        str = str4;
                        e = e2;
                        str2 = str5;
                        message = e.getMessage();
                        if (message == null) {
                        }
                        return new OnWebRequestFailed(b.j(str, str2, message));
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$1;
                    str = (String) commonAdViewerExposedFunctionsKt$request$1$invoke$1.L$0;
                    try {
                        y6a.M(obj);
                    } catch (Exception e3) {
                        e = e3;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        return new OnWebRequestFailed(b.j(str, str2, message));
                    }
                }
                HttpResponse httpResponse = (HttpResponse) obj;
                body = httpResponse.getBody();
                if (!(body instanceof String)) {
                    str3 = (String) body;
                } else if (body instanceof byte[]) {
                    str3 = new String((byte[]) body, Charsets.UTF_8);
                }
                return new OnWebRequestComplete(b.j(str, httpResponse.getUrlString(), str3, new Integer(httpResponse.getStatusCode()), HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse.getHeaders())));
            }
        }
        commonAdViewerExposedFunctionsKt$request$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$request$1$invoke$1(this, rq3Var);
        Object obj2 = commonAdViewerExposedFunctionsKt$request$1$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i = commonAdViewerExposedFunctionsKt$request$1$invoke$1.label;
        String str32 = null;
        if (i != 0) {
        }
        HttpResponse httpResponse2 = (HttpResponse) obj2;
        body = httpResponse2.getBody();
        if (!(body instanceof String)) {
        }
        return new OnWebRequestComplete(b.j(str, httpResponse2.getUrlString(), str32, new Integer(httpResponse2.getStatusCode()), HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse2.getHeaders())));
    }
}
