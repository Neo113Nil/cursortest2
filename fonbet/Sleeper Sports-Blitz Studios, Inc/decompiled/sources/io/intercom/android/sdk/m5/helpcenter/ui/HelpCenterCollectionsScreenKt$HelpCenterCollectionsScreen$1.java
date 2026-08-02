package io.intercom.android.sdk.m5.helpcenter.ui;

import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HelpCenterCollectionsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1", f = "HelpCenterCollectionsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<String> $collectionIds;
    final /* synthetic */ HelpCenterViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1(HelpCenterViewModel helpCenterViewModel, List<String> list, Continuation<? super HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1> continuation) {
        super(2, continuation);
        this.$viewModel = helpCenterViewModel;
        this.$collectionIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1(this.$viewModel, this.$collectionIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HelpCenterCollectionsScreenKt$HelpCenterCollectionsScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$viewModel.fetchCollections(CollectionsKt.toSet(this.$collectionIds));
        return Unit.INSTANCE;
    }
}
