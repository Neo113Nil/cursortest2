package com.unity3d.ads.core.domain;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.vungle.ads.internal.protos.Sdk;
import java.io.InputStream;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.i7o0;
import xsna.rl3;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: AndroidExecuteAdViewerRequest.kt */
@b6l(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", l = {28, 29}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class AndroidExecuteAdViewerRequest$invoke$2 extends SuspendLambda implements wzs<yvj, spj<? super HttpResponse>, Object> {
    final /* synthetic */ Object[] $parameters;
    final /* synthetic */ RequestType $type;
    int label;
    final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidExecuteAdViewerRequest$invoke$2(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, spj<? super AndroidExecuteAdViewerRequest$invoke$2> spjVar) {
        super(2, spjVar);
        this.$parameters = objArr;
        this.this$0 = androidExecuteAdViewerRequest;
        this.$type = requestType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new AndroidExecuteAdViewerRequest$invoke$2(this.$parameters, this.this$0, this.$type, spjVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0093, code lost:
    
        if (r0 == r6) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        HttpClientProvider httpClientProvider;
        Object invoke;
        GetCachedAsset getCachedAsset;
        InputStream data;
        HttpRequest createRequest;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Object S = rl3.S(1, this.$parameters);
            byte[] bArr = null;
            String str = S instanceof String ? (String) S : null;
            if (str == null) {
                str = "";
            }
            if (str.length() <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            try {
                failure = Uri.parse(str);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            Uri uri = (Uri) failure;
            if (uri != null) {
                if (this.$type != RequestType.GET) {
                    uri = null;
                }
                if (uri != null) {
                    getCachedAsset = this.this$0.getCachedAsset;
                    WebResourceResponse invoke$default = GetCachedAsset.invoke$default(getCachedAsset, uri, null, 2, null);
                    if (invoke$default != null && (data = invoke$default.getData()) != null) {
                        bArr = i7o0.h(data);
                    }
                }
            }
            byte[] bArr2 = bArr;
            if (bArr2 != null) {
                return new HttpResponse(bArr2, 0, null, null, null, null, 0L, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
            }
            httpClientProvider = this.this$0.httpClientProvider;
            this.label = 1;
            invoke = httpClientProvider.invoke(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            invoke = obj;
        }
        createRequest = this.this$0.createRequest(this.$type, this.$parameters);
        this.label = 2;
        Object execute$default = HttpClient.DefaultImpls.execute$default((HttpClient) invoke, createRequest, false, this, 2, null);
        return execute$default == coroutineSingletons ? coroutineSingletons : execute$default;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super HttpResponse> spjVar) {
        return ((AndroidExecuteAdViewerRequest$invoke$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
