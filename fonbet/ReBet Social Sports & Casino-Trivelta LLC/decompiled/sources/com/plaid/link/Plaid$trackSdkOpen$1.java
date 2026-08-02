package com.plaid.link;

import Ph.AbstractC1459k;
import Ph.C1483w0;
import Ph.P;
import com.plaid.internal.C3713p0;
import com.plaid.internal.C3769v3;
import com.plaid.internal.C3787x3;
import com.plaid.internal.C3794y1;
import com.plaid.internal.EnumC3631g;
import com.plaid.internal.N2;
import com.plaid.internal.X4;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plaid.link.Plaid$trackSdkOpen$1", f = "Plaid.kt", i = {}, l = {EnumC3631g.SDK_ASSET_HEADER_SHIELD_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class Plaid$trackSdkOpen$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ C3787x3 $workflowAnalytics;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$trackSdkOpen$1(C3787x3 c3787x3, Continuation<? super Plaid$trackSdkOpen$1> continuation) {
        super(2, continuation);
        this.$workflowAnalytics = c3787x3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Plaid$trackSdkOpen$1(this.$workflowAnalytics, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        X4 x42;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            x42 = Plaid.component;
            if (x42 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("component");
                x42 = null;
            }
            C3794y1 c3794y1 = ((C3713p0) x42).f40937f.get();
            this.label = 1;
            obj = c3794y1.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        N2 n22 = (N2) obj;
        if (n22 instanceof N2.k) {
            C3787x3 c3787x3 = this.$workflowAnalytics;
            N2.k kVar = (N2.k) n22;
            String linkOpenId = kVar.f39429b;
            String webviewFallbackId = kVar.f39434g;
            c3787x3.getClass();
            Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
            Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
            ClientEventOuterClass$ClientEvent build = C3787x3.a().a(ClientEventOuterClass$ClientEvent.LinkSdkOpen.newBuilder().a(linkOpenId)).build();
            Intrinsics.checkNotNull(build);
            AbstractC1459k.d(C1483w0.f9135a, null, null, new C3769v3(c3787x3, webviewFallbackId, build, null), 3, null);
        } else {
            C3787x3 c3787x32 = this.$workflowAnalytics;
            String linkOpenId2 = n22.g();
            c3787x32.getClass();
            Intrinsics.checkNotNullParameter(linkOpenId2, "linkOpenId");
            Intrinsics.checkNotNullParameter("", "webviewFallbackId");
            ClientEventOuterClass$ClientEvent build2 = C3787x3.a().a(ClientEventOuterClass$ClientEvent.LinkSdkOpen.newBuilder().a(linkOpenId2)).build();
            Intrinsics.checkNotNull(build2);
            AbstractC1459k.d(C1483w0.f9135a, null, null, new C3769v3(c3787x32, "", build2, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((Plaid$trackSdkOpen$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
