package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import java.io.ByteArrayInputStream;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.emb;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: LegacyHttpClient.kt */
@b6l(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class LegacyHttpClient$execute$2 extends SuspendLambda implements wzs<yvj, spj<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    final /* synthetic */ boolean $withInputStream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyHttpClient$execute$2(HttpRequest httpRequest, boolean z, spj<? super LegacyHttpClient$execute$2> spjVar) {
        super(2, spjVar);
        this.$request = httpRequest;
        this.$withInputStream = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new LegacyHttpClient$execute$2(this.$request, this.$withInputStream, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a.a(obj);
        WebRequest webRequest = HttpRequestToWebRequestKt.toWebRequest(this.$request);
        String makeRequest = webRequest.makeRequest();
        if (makeRequest == null) {
            makeRequest = "";
        }
        return new HttpResponse(this.$withInputStream ? new ByteArrayInputStream(makeRequest.getBytes(emb.b)) : makeRequest, webRequest.getResponseCode(), webRequest.getHeaders(), webRequest.getUrl().toString(), null, "legacy", 0L, 80, null);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super HttpResponse> spjVar) {
        return ((LegacyHttpClient$execute$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
