package com.plaid.internal;

import com.plaid.internal.D6;
import com.plaid.link.Plaid;
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

@DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$onActivityReady$1", f = "LinkActivityViewModel.kt", i = {}, l = {64, 65, 70}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3643h2 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f40645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D6 f40646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3661j2 f40647c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3643h2(D6 d62, C3661j2 c3661j2, Continuation<? super C3643h2> continuation) {
        super(2, continuation);
        this.f40646b = d62;
        this.f40647c = c3661j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3643h2(this.f40646b, this.f40647c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new C3643h2(this.f40646b, this.f40647c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r2.b(r7) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        if (r8.awaitPreload$link_sdk_release(r7) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r2.a(r8, r7) == r0) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f40645a;
        InterfaceC3759u2 interfaceC3759u2 = null;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            D6 d62 = this.f40646b;
            if (d62 == null) {
                Plaid plaid = Plaid.INSTANCE;
                this.f40645a = 1;
            } else {
                if (d62 instanceof D6.e) {
                    return Unit.INSTANCE;
                }
                InterfaceC3759u2 interfaceC3759u22 = this.f40647c.f40698c;
                if (interfaceC3759u22 != null) {
                    interfaceC3759u2 = interfaceC3759u22;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("controller");
                }
                D6 d63 = this.f40646b;
                this.f40645a = 3;
            }
            return coroutine_suspended;
        }
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC3759u2 interfaceC3759u23 = this.f40647c.f40698c;
        if (interfaceC3759u23 != null) {
            interfaceC3759u2 = interfaceC3759u23;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("controller");
        }
        this.f40645a = 2;
    }
}
