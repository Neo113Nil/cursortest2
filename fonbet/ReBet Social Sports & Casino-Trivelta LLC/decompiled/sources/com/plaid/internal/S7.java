package com.plaid.internal;

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

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$clearStoredState$1", f = "WebviewViewModel.kt", i = {}, l = {EnumC3631g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class S7 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U7 f39627b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7(U7 u72, Continuation<? super S7> continuation) {
        super(2, continuation);
        this.f39627b = u72;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new S7(this.f39627b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new S7(this.f39627b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r5.a(r6) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r7.a(r6) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003c, code lost:
    
        if (r7.a((kotlin.coroutines.jvm.internal.SuspendLambda) r6) == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39626a;
        InterfaceC3781w6 interfaceC3781w6 = null;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            B6 b62 = this.f39627b.f39676e;
            if (b62 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackId");
                b62 = null;
            }
            this.f39626a = 1;
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
            ResultKt.throwOnFailure(obj);
            InterfaceC3781w6 interfaceC3781w62 = this.f39627b.f39680i;
            if (interfaceC3781w62 != null) {
                interfaceC3781w6 = interfaceC3781w62;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
            }
            this.f39626a = 3;
        }
        A6 a62 = this.f39627b.f39677f;
        if (a62 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readWebviewBackgroundTransparencyState");
            a62 = null;
        }
        this.f39626a = 2;
    }
}
