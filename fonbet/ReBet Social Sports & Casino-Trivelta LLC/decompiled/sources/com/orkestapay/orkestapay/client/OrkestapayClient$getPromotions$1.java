package com.orkestapay.orkestapay.client;

import Ph.P;
import com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI;
import com.orkestapay.orkestapay.client.apirequest.PromotionsListener;
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
@DebugMetadata(c = "com.orkestapay.orkestapay.client.OrkestapayClient$getPromotions$1", f = "OrkestapayClient.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class OrkestapayClient$getPromotions$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $binNumber;
    final /* synthetic */ String $currency;
    final /* synthetic */ PromotionsListener $listener;
    final /* synthetic */ String $totalAmount;
    int label;
    final /* synthetic */ OrkestapayClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrkestapayClient$getPromotions$1(OrkestapayClient orkestapayClient, String str, String str2, String str3, PromotionsListener promotionsListener, Continuation<? super OrkestapayClient$getPromotions$1> continuation) {
        super(2, continuation);
        this.this$0 = orkestapayClient;
        this.$binNumber = str;
        this.$currency = str2;
        this.$totalAmount = str3;
        this.$listener = promotionsListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OrkestapayClient$getPromotions$1(this.this$0, this.$binNumber, this.$currency, this.$totalAmount, this.$listener, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((OrkestapayClient$getPromotions$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OrkestapayAPI orkestapayAPI;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            orkestapayAPI = this.this$0.orkestapayAPI;
            String str = this.$binNumber;
            String str2 = this.$currency;
            String str3 = this.$totalAmount;
            PromotionsListener promotionsListener = this.$listener;
            this.label = 1;
            if (orkestapayAPI.getPromotions(str, str2, str3, promotionsListener, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
