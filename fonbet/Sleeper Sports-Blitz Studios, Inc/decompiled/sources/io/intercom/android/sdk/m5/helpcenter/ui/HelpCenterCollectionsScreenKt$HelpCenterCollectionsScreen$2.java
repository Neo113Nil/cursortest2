package io.intercom.android.sdk.m5.helpcenter.ui;

import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiEffects;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: HelpCenterCollectionsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2", f = "HelpCenterCollectionsScreen.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $onAutoNavigateToCollection;
    final /* synthetic */ HelpCenterViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2(HelpCenterViewModel helpCenterViewModel, Function1<? super String, Unit> function1, Continuation<? super HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2> continuation) {
        super(2, continuation);
        this.$viewModel = helpCenterViewModel;
        this.$onAutoNavigateToCollection = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2(this.$viewModel, this.$onAutoNavigateToCollection, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow<CollectionsUiEffects> effect = this.$viewModel.getEffect();
            final Function1<String, Unit> function1 = this.$onAutoNavigateToCollection;
            this.label = 1;
            if (effect.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$2.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((CollectionsUiEffects) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(CollectionsUiEffects collectionsUiEffects, Continuation<? super Unit> continuation) {
                    if (!(collectionsUiEffects instanceof CollectionsUiEffects.NavigateToCollectionContent)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    function1.invoke(((CollectionsUiEffects.NavigateToCollectionContent) collectionsUiEffects).getCollectionId());
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
