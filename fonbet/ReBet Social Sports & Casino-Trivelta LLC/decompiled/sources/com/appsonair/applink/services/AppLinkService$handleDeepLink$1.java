package com.appsonair.applink.services;

import Ph.AbstractC1440a0;
import Ph.P;
import android.net.Uri;
import com.plaid.internal.EnumC3631g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.appsonair.applink.services.AppLinkService$handleDeepLink$1", f = "AppLinkService.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AppLinkService$handleDeepLink$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fallbackPackageName;
    final /* synthetic */ String $fallbackUrl;
    final /* synthetic */ String $source;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ AppLinkService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinkService$handleDeepLink$1(AppLinkService appLinkService, Uri uri, String str, String str2, String str3, Continuation<? super AppLinkService$handleDeepLink$1> continuation) {
        super(2, continuation);
        this.this$0 = appLinkService;
        this.$uri = uri;
        this.$fallbackPackageName = str;
        this.$fallbackUrl = str2;
        this.$source = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AppLinkService$handleDeepLink$1(this.this$0, this.$uri, this.$fallbackPackageName, this.$fallbackUrl, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((AppLinkService$handleDeepLink$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (AbstractC1440a0.a(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.onDeepLinkProcessed(this.$uri);
        } catch (Exception e10) {
            this.this$0.onDeepLinkError(this.$uri, "Error processing deep link: " + e10.getMessage());
            this.this$0.handleFallback(this.$fallbackPackageName, this.$fallbackUrl, this.$source);
        }
        return Unit.INSTANCE;
    }
}
