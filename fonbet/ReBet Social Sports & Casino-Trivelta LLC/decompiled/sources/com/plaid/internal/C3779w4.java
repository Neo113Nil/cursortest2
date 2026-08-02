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

@DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$clearSessionState$1", f = "OutOfProcessWebviewViewModel.kt", i = {}, l = {EnumC3631g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.w4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3779w4 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f41168a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3806z4 f41169b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3779w4(C3806z4 c3806z4, Continuation<? super C3779w4> continuation) {
        super(2, continuation);
        this.f41169b = c3806z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3779w4(this.f41169b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new C3779w4(this.f41169b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r5.b(r6) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r7.a((kotlin.coroutines.jvm.internal.SuspendLambda) r6) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003c, code lost:
    
        if (r7.a(r6) == r0) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f41168a;
        InterfaceC3808z6 interfaceC3808z6 = null;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC3781w6 interfaceC3781w6 = this.f41169b.f41233c;
            if (interfaceC3781w6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
                interfaceC3781w6 = null;
            }
            this.f41168a = 1;
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
            InterfaceC3808z6 interfaceC3808z62 = this.f41169b.f41235e;
            if (interfaceC3808z62 != null) {
                interfaceC3808z6 = interfaceC3808z62;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("readPreCompletionResult");
            }
            this.f41168a = 3;
        }
        B6 b62 = this.f41169b.f41234d;
        if (b62 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackId");
            b62 = null;
        }
        this.f41168a = 2;
    }
}
