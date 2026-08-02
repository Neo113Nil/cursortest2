package com.appsonair.applink.services;

import Ph.P;
import android.net.Uri;
import com.appsonair.applink.interfaces.AppLinkListener;
import com.appsonair.applink.services.AppLinkHandler;
import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.appsonair.applink.services.AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$1", f = "AppLinkService.kt", i = {1}, l = {EnumC3631g.SDK_ASSET_ICON_EXTERNAL_VALUE, 200, 205}, m = "invokeSuspend", n = {"result"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $domain;
    final /* synthetic */ String $linkId;
    final /* synthetic */ Uri $schemeUri;
    Object L$0;
    int label;
    final /* synthetic */ AppLinkService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$1(AppLinkService appLinkService, String str, String str2, Uri uri, Continuation<? super AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$1> continuation) {
        super(2, continuation);
        this.this$0 = appLinkService;
        this.$domain = str;
        this.$linkId = str2;
        this.$schemeUri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$1(this.this$0, this.$domain, this.$linkId, this.$schemeUri, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((AppLinkService$fetchInstallReferrer$1$onInstallReferrerSetupFinished$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if (r1.getReferralLinkByIP(r9, r8) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (Ph.AbstractC1440a0.a(750, r8) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r9 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        JSONObject jSONObject;
        AppLinkListener appLinkListener;
        String userAgent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            AppLinkService appLinkService = this.this$0;
            String str = this.$domain;
            String str2 = this.$linkId;
            String uri = this.$schemeUri.toString();
            Intrinsics.checkNotNullExpressionValue(uri, "schemeUri.toString()");
            this.label = 1;
            obj = appLinkService.getFullReferralDetails(str, str2, uri, this);
        } else if (i10 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            jSONObject = (JSONObject) this.L$0;
            ResultKt.throwOnFailure(obj);
            appLinkListener = this.this$0.listener;
            if (appLinkListener == null) {
                Intrinsics.throwUninitializedPropertyAccessException("listener");
                appLinkListener = null;
            }
            appLinkListener.onReferralLinkDetected(jSONObject);
            userAgent = this.this$0.getUserAgent();
            AppLinkHandler.Companion companion = AppLinkHandler.INSTANCE;
            this.L$0 = null;
            this.label = 3;
        }
        jSONObject = (JSONObject) obj;
        this.L$0 = jSONObject;
        this.label = 2;
    }
}
