package com.socure.docv.capturesdk.feature.selection.persentation.ui;

import com.socure.docv.capturesdk.common.analytics.DocSelection;
import com.socure.docv.capturesdk.di.docselection.DocSelectionFragmentComponent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DocSelectionFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.selection.persentation.ui.DocSelectionFragment$setLicPassportClickAction$1$1", f = "DocSelectionFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class DocSelectionFragment$setLicPassportClickAction$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DocSelectionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DocSelectionFragment$setLicPassportClickAction$1$1(DocSelectionFragment docSelectionFragment, Continuation<? super DocSelectionFragment$setLicPassportClickAction$1$1> continuation) {
        super(2, continuation);
        this.this$0 = docSelectionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DocSelectionFragment$setLicPassportClickAction$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DocSelectionFragment$setLicPassportClickAction$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DocSelectionFragmentComponent graph;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            graph = this.this$0.getGraph();
            graph.getShim().onDocSelected(DocSelection.ID);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
