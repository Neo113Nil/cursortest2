package com.plaid.link;

import Ph.P;
import com.plaid.internal.C3674k6;
import com.plaid.internal.C3704o0;
import com.plaid.internal.InterfaceC3553a3;
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
@DebugMetadata(c = "com.plaid.link.Plaid$preloadLink$2", f = "Plaid.kt", i = {0}, l = {118, 119}, m = "invokeSuspend", n = {"preloadLinkController"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class Plaid$preloadLink$2 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ OnLoadCallback $onLoad;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$preloadLink$2(OnLoadCallback onLoadCallback, Continuation<? super Plaid$preloadLink$2> continuation) {
        super(2, continuation);
        this.$onLoad = onLoadCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Plaid$preloadLink$2(this.$onLoad, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r1.a(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r1.b(r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        InterfaceC3553a3 orCreateTokenComponent;
        C3674k6 c3674k6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            orCreateTokenComponent = Plaid.INSTANCE.getOrCreateTokenComponent();
            c3674k6 = ((C3704o0) orCreateTokenComponent).f40898q.get();
            this.L$0 = c3674k6;
            this.label = 1;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            c3674k6 = (C3674k6) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        OnLoadCallback onLoadCallback = this.$onLoad;
        this.L$0 = null;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((Plaid$preloadLink$2) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
