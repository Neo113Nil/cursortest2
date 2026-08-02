package com.plaid.link;

import Ph.P;
import com.plaid.internal.C3556a6;
import com.plaid.link.configuration.LinkTokenConfiguration;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.plaid.link.Plaid$createWithoutPreload$1", f = "Plaid.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class Plaid$createWithoutPreload$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ LinkTokenConfiguration $linkTokenConfiguration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$createWithoutPreload$1(LinkTokenConfiguration linkTokenConfiguration, Continuation<? super Plaid$createWithoutPreload$1> continuation) {
        super(2, continuation);
        this.$linkTokenConfiguration = linkTokenConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Plaid$createWithoutPreload$1(this.$linkTokenConfiguration, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object linkConfiguration;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Plaid plaid = Plaid.INSTANCE;
            LinkTokenConfiguration linkTokenConfiguration = this.$linkTokenConfiguration;
            this.label = 1;
            linkConfiguration = plaid.setLinkConfiguration(linkTokenConfiguration, this);
            if (linkConfiguration == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        C3556a6.f39823a.getClass();
        C3556a6.a.a("Link token configuration stored to disk", true);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((Plaid$createWithoutPreload$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
