package com.unity3d.ads.core.domain;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidExecuteAdViewerRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", i = {}, l = {28, 29}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidExecuteAdViewerRequest$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpResponse>, Object> {
    final /* synthetic */ Object[] $parameters;
    final /* synthetic */ RequestType $type;
    int label;
    final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidExecuteAdViewerRequest$invoke$2(Object[] objArr, AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, Continuation<? super AndroidExecuteAdViewerRequest$invoke$2> continuation) {
        super(2, continuation);
        this.$parameters = objArr;
        this.this$0 = androidExecuteAdViewerRequest;
        this.$type = requestType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidExecuteAdViewerRequest$invoke$2(this.$parameters, this.this$0, this.$type, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpResponse> continuation) {
        return ((AndroidExecuteAdViewerRequest$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        if (r0 == r2) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m11180constructorimpl;
        HttpClientProvider httpClientProvider;
        Object invoke;
        GetCachedAsset getCachedAsset;
        InputStream data;
        HttpRequest createRequest;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object orNull = ArraysKt.getOrNull(this.$parameters, 1);
            byte[] bArr = null;
            String str = orNull instanceof String ? (String) orNull : null;
            if (str == null) {
                str = "";
            }
            if (str.length() <= 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                Uri parse = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                m11180constructorimpl = Result.m11180constructorimpl(parse);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                m11180constructorimpl = null;
            }
            Uri uri = (Uri) m11180constructorimpl;
            if (uri != null) {
                if (this.$type != RequestType.GET) {
                    uri = null;
                }
                if (uri != null) {
                    getCachedAsset = this.this$0.getCachedAsset;
                    WebResourceResponse invoke$default = GetCachedAsset.invoke$default(getCachedAsset, uri, null, 2, null);
                    if (invoke$default != null && (data = invoke$default.getData()) != null) {
                        Intrinsics.checkNotNullExpressionValue(data, "data");
                        bArr = ByteStreamsKt.readBytes(data);
                    }
                }
            }
            byte[] bArr2 = bArr;
            if (bArr2 == null) {
                httpClientProvider = this.this$0.httpClientProvider;
                this.label = 1;
                invoke = httpClientProvider.invoke(this);
            } else {
                return new HttpResponse(bArr2, 0, null, null, null, null, 0L, 126, null);
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            invoke = obj;
        }
        createRequest = this.this$0.createRequest(this.$type, this.$parameters);
        this.label = 2;
        Object execute$default = HttpClient.DefaultImpls.execute$default((HttpClient) invoke, createRequest, false, this, 2, null);
        return execute$default == coroutine_suspended ? coroutine_suspended : execute$default;
    }
}
