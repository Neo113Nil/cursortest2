package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "<anonymous>", "(Lku3;)Lcom/unity3d/services/core/network/model/HttpResponse;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LegacyHttpClient$execute$2 extends hoi implements Function2<ku3, rq3<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    final /* synthetic */ boolean $withInputStream;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyHttpClient$execute$2(HttpRequest httpRequest, boolean z, rq3<? super LegacyHttpClient$execute$2> rq3Var) {
        super(2, rq3Var);
        this.$request = httpRequest;
        this.$withInputStream = z;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new LegacyHttpClient$execute$2(this.$request, this.$withInputStream, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super HttpResponse> rq3Var) {
        return ((LegacyHttpClient$execute$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        WebRequest webRequest = HttpRequestToWebRequestKt.toWebRequest(this.$request);
        String makeRequest = webRequest.makeRequest();
        if (makeRequest == null) {
            makeRequest = "";
        }
        if (this.$withInputStream) {
            byte[] bytes = makeRequest.getBytes(Charsets.UTF_8);
            bytes.getClass();
            obj2 = new ByteArrayInputStream(bytes);
        } else {
            obj2 = makeRequest;
        }
        int responseCode = webRequest.getResponseCode();
        Map<String, List<String>> headers = webRequest.getHeaders();
        headers.getClass();
        String url = webRequest.getUrl().toString();
        url.getClass();
        return new HttpResponse(obj2, responseCode, headers, url, null, "legacy", 0L, 80, null);
    }
}
