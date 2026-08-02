package com.appsonairreactnativeapplink;

import Ph.P;
import com.appsonair.applink.services.AppLinkService;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.twilio.voice.EventKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.appsonairreactnativeapplink.AppsonairReactNativeApplinkModule$createAppLink$1", f = "AppsonairReactNativeApplinkModule.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AppsonairReactNativeApplinkModule$createAppLink$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReadableMap $params;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Map<String, Object> $socialMeta;
    int label;
    final /* synthetic */ AppsonairReactNativeApplinkModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsonairReactNativeApplinkModule$createAppLink$1(AppsonairReactNativeApplinkModule appsonairReactNativeApplinkModule, ReadableMap readableMap, Map<String, ? extends Object> map, Promise promise, Continuation<? super AppsonairReactNativeApplinkModule$createAppLink$1> continuation) {
        super(2, continuation);
        this.this$0 = appsonairReactNativeApplinkModule;
        this.$params = readableMap;
        this.$socialMeta = map;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppsonairReactNativeApplinkModule$createAppLink$1(this.this$0, this.$params, this.$socialMeta, this.$promise, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(P p10, Continuation<? super Unit> continuation) {
        return ((AppsonairReactNativeApplinkModule$createAppLink$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d0 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:5:0x000f, B:7:0x00c8, B:8:0x00cc, B:10:0x00d0, B:11:0x00d6, B:20:0x0024, B:22:0x002c, B:26:0x0039, B:29:0x0044, B:32:0x004f, B:34:0x0057, B:36:0x005f, B:38:0x0069, B:41:0x008e, B:44:0x00b4), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AppLinkService appLinkService;
        JSONObject jSONObject;
        Object createAppLink;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
        } catch (Exception e10) {
            this.$promise.reject("CREATE_FAILED", e10.getMessage(), e10);
        }
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            appLinkService = this.this$0.appLinkService;
            if (appLinkService == null) {
                jSONObject = null;
                this.$promise.resolve(jSONObject == null ? jSONObject.toString() : null);
                return Unit.INSTANCE;
            }
            String string = this.$params.getString(EventKeys.URL);
            if (string == null) {
                string = "";
            }
            String string2 = this.$params.getString("name");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = this.$params.getString("urlPrefix");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = (!this.$params.hasKey("shortId") || this.$params.isNull("shortId")) ? null : this.$params.getString("shortId");
            String str = string2;
            Map<String, ? extends Object> map = this.$socialMeta;
            Boolean boxBoolean = Boxing.boxBoolean(this.$params.getBoolean("isOpenInBrowserAndroid"));
            Boolean boxBoolean2 = Boxing.boxBoolean(this.$params.getBoolean("isOpenInAndroidApp"));
            String string5 = this.$params.getString("androidFallbackUrl");
            if (string5 == null) {
                string5 = "";
            }
            Boolean boxBoolean3 = Boxing.boxBoolean(this.$params.getBoolean("isOpenInBrowserApple"));
            Boolean boxBoolean4 = Boxing.boxBoolean(this.$params.getBoolean("isOpenInIosApp"));
            String string6 = this.$params.getString("iosFallbackUrl");
            String str2 = string6 != null ? string6 : "";
            this.label = 1;
            createAppLink = appLinkService.createAppLink(string, str, string3, string4, map, boxBoolean, boxBoolean2, string5, boxBoolean3, boxBoolean4, str2, this);
            if (createAppLink == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            createAppLink = obj;
        }
        jSONObject = (JSONObject) createAppLink;
        this.$promise.resolve(jSONObject == null ? jSONObject.toString() : null);
        return Unit.INSTANCE;
    }
}
