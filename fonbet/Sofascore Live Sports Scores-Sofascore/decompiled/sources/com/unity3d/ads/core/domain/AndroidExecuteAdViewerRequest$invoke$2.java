package com.unity3d.ads.core.domain;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a70;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.m6k;
import defpackage.p2g;
import defpackage.ph0;
import defpackage.rq3;
import defpackage.u2g;
import defpackage.w2g;
import defpackage.y6a;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "Lcom/unity3d/services/core/network/model/HttpResponse;", "<anonymous>", "(Lku3;)Lcom/unity3d/services/core/network/model/HttpResponse;"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", l = {28, 29}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class AndroidExecuteAdViewerRequest$invoke$2 extends hoi implements Function2<ku3, rq3<? super HttpResponse>, Object> {
    final /* synthetic */ Object[] $parameters;
    final /* synthetic */ RequestType $type;
    int label;
    final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidExecuteAdViewerRequest$invoke$2(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, rq3<? super AndroidExecuteAdViewerRequest$invoke$2> rq3Var) {
        super(2, rq3Var);
        this.$parameters = objArr;
        this.this$0 = androidExecuteAdViewerRequest;
        this.$type = requestType;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new AndroidExecuteAdViewerRequest$invoke$2(this.$parameters, this.this$0, this.$type, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super HttpResponse> rq3Var) {
        return ((AndroidExecuteAdViewerRequest$invoke$2) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        if (r0 == r6) goto L47;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object u2gVar;
        HttpClientProvider httpClientProvider;
        Object invoke;
        GetCachedAsset getCachedAsset;
        InputStream data;
        HttpRequest createRequest;
        lu3 lu3Var = lu3.a;
        int i = this.label;
        byte[] bArr = null;
        if (i == 0) {
            y6a.M(obj);
            Object F = ph0.F(1, this.$parameters);
            String str = F instanceof String ? (String) F : null;
            if (str == null) {
                str = "";
            }
            if (str.length() <= 0) {
                a70.p("Failed requirement.");
                return null;
            }
            try {
                p2g p2gVar = w2g.b;
                u2gVar = Uri.parse(str);
                u2gVar.getClass();
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            if (u2gVar instanceof u2g) {
                u2gVar = null;
            }
            Uri uri = (Uri) u2gVar;
            if (uri != null) {
                if (this.$type != RequestType.GET) {
                    uri = null;
                }
                if (uri != null) {
                    getCachedAsset = this.this$0.getCachedAsset;
                    WebResourceResponse invoke$default = GetCachedAsset.invoke$default(getCachedAsset, uri, null, 2, null);
                    if (invoke$default != null && (data = invoke$default.getData()) != null) {
                        bArr = m6k.b0(data);
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
                if (i == 2) {
                    y6a.M(obj);
                    return obj;
                }
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            invoke = obj;
        }
        createRequest = this.this$0.createRequest(this.$type, this.$parameters);
        this.label = 2;
        Object execute$default = HttpClient.DefaultImpls.execute$default((HttpClient) invoke, createRequest, false, this, 2, null);
        return execute$default == lu3Var ? lu3Var : execute$default;
    }
}
