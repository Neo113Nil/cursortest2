package expo.modules.logbox;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ExpoLogBoxWebViewWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.logbox.ExpoLogBoxWebViewWrapper$processMessageFromWebView$1", f = "ExpoLogBoxWebViewWrapper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ExpoLogBoxWebViewWrapper$processMessageFromWebView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ JsonPrimitive $actionId;
    final /* synthetic */ JsonArray $args;
    final /* synthetic */ JsonPrimitive $uid;
    int label;
    final /* synthetic */ ExpoLogBoxWebViewWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpoLogBoxWebViewWrapper$processMessageFromWebView$1(JsonArray jsonArray, ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper, JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, Continuation<? super ExpoLogBoxWebViewWrapper$processMessageFromWebView$1> continuation) {
        super(2, continuation);
        this.$args = jsonArray;
        this.this$0 = expoLogBoxWebViewWrapper;
        this.$uid = jsonPrimitive;
        this.$actionId = jsonPrimitive2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ExpoLogBoxWebViewWrapper$processMessageFromWebView$1(this.$args, this.this$0, this.$uid, this.$actionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExpoLogBoxWebViewWrapper$processMessageFromWebView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = null;
        String asString = (this.$args.get(0).isJsonPrimitive() && this.$args.get(0).getAsJsonPrimitive().isString()) ? this.$args.get(0).getAsJsonPrimitive().getAsString() : null;
        JsonObject asJsonObject = this.$args.get(1).getAsJsonObject();
        String asString2 = (asJsonObject.has("method") && asJsonObject.get("method").isJsonPrimitive() && asJsonObject.getAsJsonPrimitive("method").isString()) ? asJsonObject.getAsJsonPrimitive("method").getAsString() : null;
        if (asJsonObject.has("body") && asJsonObject.get("body").isJsonPrimitive() && asJsonObject.getAsJsonPrimitive("body").isString()) {
            str = asJsonObject.getAsJsonPrimitive("body").getAsString();
        }
        if (asString != null) {
            Function5<String, String, String, Function1<? super String, Unit>, Function1<? super Exception, Unit>, Unit> action = this.this$0.getActions().getFetchTextAsync().getAction();
            if (asString2 == null) {
                asString2 = "GET";
            }
            String str2 = asString2;
            if (str == null) {
                str = "";
            }
            String str3 = str;
            final ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper = this.this$0;
            final JsonPrimitive jsonPrimitive = this.$uid;
            final JsonPrimitive jsonPrimitive2 = this.$actionId;
            Function1<? super String, Unit> function1 = new Function1() { // from class: expo.modules.logbox.ExpoLogBoxWebViewWrapper$processMessageFromWebView$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = ExpoLogBoxWebViewWrapper$processMessageFromWebView$1.invokeSuspend$lambda$0(ExpoLogBoxWebViewWrapper.this, jsonPrimitive, jsonPrimitive2, (String) obj2);
                    return invokeSuspend$lambda$0;
                }
            };
            final ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper2 = this.this$0;
            final JsonPrimitive jsonPrimitive3 = this.$uid;
            final JsonPrimitive jsonPrimitive4 = this.$actionId;
            action.invoke(asString, str2, str3, function1, new Function1() { // from class: expo.modules.logbox.ExpoLogBoxWebViewWrapper$processMessageFromWebView$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$1;
                    invokeSuspend$lambda$1 = ExpoLogBoxWebViewWrapper$processMessageFromWebView$1.invokeSuspend$lambda$1(ExpoLogBoxWebViewWrapper.this, jsonPrimitive3, jsonPrimitive4, (Exception) obj2);
                    return invokeSuspend$lambda$1;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper, JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, String str) {
        String asString = jsonPrimitive.getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        String asString2 = jsonPrimitive2.getAsString();
        Intrinsics.checkNotNullExpressionValue(asString2, "getAsString(...)");
        expoLogBoxWebViewWrapper.sendReturn(str, asString, asString2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(ExpoLogBoxWebViewWrapper expoLogBoxWebViewWrapper, JsonPrimitive jsonPrimitive, JsonPrimitive jsonPrimitive2, Exception exc) {
        String asString = jsonPrimitive.getAsString();
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        String asString2 = jsonPrimitive2.getAsString();
        Intrinsics.checkNotNullExpressionValue(asString2, "getAsString(...)");
        expoLogBoxWebViewWrapper.sendReturn(exc, asString, asString2);
        return Unit.INSTANCE;
    }
}
