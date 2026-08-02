package com.appsonairreactnativeapplink;

import Ph.P;
import com.appsonair.applink.services.AppLinkService;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.plaid.internal.EnumC3631g;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "com.appsonairreactnativeapplink.AppsonairReactNativeApplinkModule$getReferralInfo$1", f = "AppsonairReactNativeApplinkModule.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nAppsonairReactNativeApplinkModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppsonairReactNativeApplinkModule.kt\ncom/appsonairreactnativeapplink/AppsonairReactNativeApplinkModule$getReferralInfo$1\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,229:1\n32#2,2:230\n*S KotlinDebug\n*F\n+ 1 AppsonairReactNativeApplinkModule.kt\ncom/appsonairreactnativeapplink/AppsonairReactNativeApplinkModule$getReferralInfo$1\n*L\n172#1:230,2\n*E\n"})
/* loaded from: classes.dex */
public final class AppsonairReactNativeApplinkModule$getReferralInfo$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ Promise $promise;
    int label;
    final /* synthetic */ AppsonairReactNativeApplinkModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppsonairReactNativeApplinkModule$getReferralInfo$1(AppsonairReactNativeApplinkModule appsonairReactNativeApplinkModule, Promise promise, Continuation<? super AppsonairReactNativeApplinkModule$getReferralInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = appsonairReactNativeApplinkModule;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppsonairReactNativeApplinkModule$getReferralInfo$1(this.this$0, this.$promise, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(P p10, Continuation<? super Unit> continuation) {
        return ((AppsonairReactNativeApplinkModule$getReferralInfo$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[Catch: Exception -> 0x000f, TRY_LEAVE, TryCatch #0 {Exception -> 0x000f, blocks: (B:5:0x000b, B:6:0x002e, B:8:0x0034, B:9:0x0041, B:11:0x0047, B:41:0x0055, B:14:0x005e, B:38:0x0062, B:17:0x006f, B:35:0x0073, B:20:0x0080, B:32:0x0084, B:23:0x0091, B:25:0x0096, B:27:0x009e, B:44:0x00a2, B:48:0x00a8, B:52:0x001d, B:54:0x0025), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:5:0x000b, B:6:0x002e, B:8:0x0034, B:9:0x0041, B:11:0x0047, B:41:0x0055, B:14:0x005e, B:38:0x0062, B:17:0x006f, B:35:0x0073, B:20:0x0080, B:32:0x0084, B:23:0x0091, B:25:0x0096, B:27:0x009e, B:44:0x00a2, B:48:0x00a8, B:52:0x001d, B:54:0x0025), top: B:2:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AppLinkService appLinkService;
        JSONObject jSONObject;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
        } catch (Exception e10) {
            this.$promise.reject("REFERRAL_ERROR", e10.getMessage(), e10);
        }
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            appLinkService = this.this$0.appLinkService;
            if (appLinkService == null) {
                jSONObject = null;
                if (jSONObject == null) {
                    WritableMap createMap = Arguments.createMap();
                    Iterator<String> keys = jSONObject.keys();
                    Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof String) {
                            Intrinsics.checkNotNull(next);
                            createMap.putString(next, (String) opt);
                        } else if (opt instanceof Integer) {
                            Intrinsics.checkNotNull(next);
                            createMap.putInt(next, ((Number) opt).intValue());
                        } else if (opt instanceof Double) {
                            Intrinsics.checkNotNull(next);
                            createMap.putDouble(next, ((Number) opt).doubleValue());
                        } else if (opt instanceof Boolean) {
                            Intrinsics.checkNotNull(next);
                            createMap.putBoolean(next, ((Boolean) opt).booleanValue());
                        } else {
                            Intrinsics.checkNotNull(next);
                            if (opt == null || (str = opt.toString()) == null) {
                                str = "";
                            }
                            createMap.putString(next, str);
                        }
                    }
                    this.$promise.resolve(createMap);
                } else {
                    this.$promise.reject("NO_REFERRAL", "No referral details available");
                }
                return Unit.INSTANCE;
            }
            this.label = 1;
            obj = appLinkService.getReferralInfo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
        }
        return Unit.INSTANCE;
    }
}
