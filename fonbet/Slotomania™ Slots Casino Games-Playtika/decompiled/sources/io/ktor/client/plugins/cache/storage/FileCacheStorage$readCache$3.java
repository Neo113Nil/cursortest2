package io.ktor.client.plugins.cache.storage;

import com.appsflyer.AppsFlyerProperties;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FileCacheStorage.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", i = {0, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14}, l = {Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 211, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 230, 232}, m = "readCache", n = {AppsFlyerProperties.CHANNEL, AppsFlyerProperties.CHANNEL, "url", AppsFlyerProperties.CHANNEL, "url", AppsFlyerProperties.CHANNEL, "url", "status", AppsFlyerProperties.CHANNEL, "url", "status", "version", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "headersCount", "j", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "key", "headersCount", "j", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", "responseTime", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", "responseTime", SDKConstants.PARAM_EXPIRATION_TIME, AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", "responseTime", SDKConstants.PARAM_EXPIRATION_TIME, "$this$readCache_u24lambda_u2412", "varyKeysCount", "j", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", "responseTime", SDKConstants.PARAM_EXPIRATION_TIME, "$this$readCache_u24lambda_u2412", "key", "varyKeysCount", "j", AppsFlyerProperties.CHANNEL, "url", "status", "version", "headers", "requestTime", "responseTime", SDKConstants.PARAM_EXPIRATION_TIME, "varyKeys", "url", "status", "version", "headers", "requestTime", "responseTime", SDKConstants.PARAM_EXPIRATION_TIME, "varyKeys", "body"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$9", "L$10", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
/* loaded from: classes2.dex */
final class FileCacheStorage$readCache$3 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileCacheStorage$readCache$3(FileCacheStorage fileCacheStorage, Continuation<? super FileCacheStorage$readCache$3> continuation) {
        super(continuation);
        this.this$0 = fileCacheStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object readCache;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        readCache = this.this$0.readCache((ByteReadChannel) null, (Continuation<? super CachedResponseData>) this);
        return readCache;
    }
}
