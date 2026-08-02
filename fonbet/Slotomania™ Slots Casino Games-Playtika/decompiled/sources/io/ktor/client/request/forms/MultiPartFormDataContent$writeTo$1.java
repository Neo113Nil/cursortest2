package io.ktor.client.request.forms;

import com.appsflyer.AppsFlyerProperties;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FormDataContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5, 6}, l = {Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, 126, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 135, 139, 142, 146, 146, 146}, m = "writeTo", n = {AppsFlyerProperties.CHANNEL, "part", AppsFlyerProperties.CHANNEL, "part", AppsFlyerProperties.CHANNEL, "part", AppsFlyerProperties.CHANNEL, AppsFlyerProperties.CHANNEL, AppsFlyerProperties.CHANNEL, AppsFlyerProperties.CHANNEL}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes4.dex */
final class MultiPartFormDataContent$writeTo$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MultiPartFormDataContent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiPartFormDataContent$writeTo$1(MultiPartFormDataContent multiPartFormDataContent, Continuation<? super MultiPartFormDataContent$writeTo$1> continuation) {
        super(continuation);
        this.this$0 = multiPartFormDataContent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeTo(null, this);
    }
}
