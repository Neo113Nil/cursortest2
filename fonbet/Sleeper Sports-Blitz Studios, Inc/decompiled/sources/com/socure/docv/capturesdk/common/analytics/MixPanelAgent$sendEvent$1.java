package com.socure.docv.capturesdk.common.analytics;

import android.util.Base64;
import com.google.gson.Gson;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.repository.MixPanelRepository;
import com.socure.docv.capturesdk.common.utils.Utils;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: MixPanelAgent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.analytics.MixPanelAgent$sendEvent$1", f = "MixPanelAgent.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class MixPanelAgent$sendEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Pair<String, String>[] $args;
    final /* synthetic */ String $eventName;
    int label;
    final /* synthetic */ MixPanelAgent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MixPanelAgent$sendEvent$1(String str, MixPanelAgent mixPanelAgent, Pair<String, String>[] pairArr, Continuation<? super MixPanelAgent$sendEvent$1> continuation) {
        super(2, continuation);
        this.$eventName = str;
        this.this$0 = mixPanelAgent;
        this.$args = pairArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MixPanelAgent$sendEvent$1(this.$eventName, this.this$0, this.$args, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MixPanelAgent$sendEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map<String, String> map;
        MixPanelRepository mixPanelRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("event", this.$eventName);
                Utils utils = Utils.INSTANCE;
                map = this.this$0.attrs;
                Pair<String, String>[] pairArr = this.$args;
                linkedHashMap.put("properties", utils.argsIntoAttrs(map, (Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
                String json = new Gson().toJson(linkedHashMap);
                LoggerKt.logD("SDLT_MPA", "sendEvent - json: " + json);
                mixPanelRepository = this.this$0.repository;
                Intrinsics.checkNotNullExpressionValue(json, "json");
                byte[] bytes = json.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                String encodeToString = Base64.encodeToString(bytes, 2);
                Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(\n        …                        )");
                this.label = 1;
                obj = mixPanelRepository.sendEvent(encodeToString, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            String str = response.isSuccessful() ? "succeeded" : MetricTracker.Action.FAILED;
            LoggerKt.logDetailed("SDLT_MPA", "Event sending " + str + ": " + this.$eventName + " | response: [" + response.code() + ", " + response.message() + "]");
        } catch (Throwable th) {
            LoggerKt.logE$default("SDLT_MPA", "ex in sendEvent: " + th.getLocalizedMessage(), null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
