package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.graphics.Bitmap;
import com.socure.docv.capturesdk.databinding.FragmentUnstructuredDocPreviewSocureBinding;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UnstructuredDocPreviewFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.feature.orchestrator.presentation.ui.UnstructuredDocPreviewFragment$bindModel$1", f = "UnstructuredDocPreviewFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class UnstructuredDocPreviewFragment$bindModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UnstructuredDocPreviewModel $model;
    final /* synthetic */ FragmentUnstructuredDocPreviewSocureBinding $this_bindModel;
    int label;
    final /* synthetic */ UnstructuredDocPreviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnstructuredDocPreviewFragment$bindModel$1(UnstructuredDocPreviewFragment unstructuredDocPreviewFragment, UnstructuredDocPreviewModel unstructuredDocPreviewModel, FragmentUnstructuredDocPreviewSocureBinding fragmentUnstructuredDocPreviewSocureBinding, Continuation<? super UnstructuredDocPreviewFragment$bindModel$1> continuation) {
        super(2, continuation);
        this.this$0 = unstructuredDocPreviewFragment;
        this.$model = unstructuredDocPreviewModel;
        this.$this_bindModel = fragmentUnstructuredDocPreviewSocureBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnstructuredDocPreviewFragment$bindModel$1(this.this$0, this.$model, this.$this_bindModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnstructuredDocPreviewFragment$bindModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap loadScaledBitmap;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            loadScaledBitmap = this.this$0.loadScaledBitmap(this.$model.getFileThumbnail(), 2048);
            if (loadScaledBitmap != null) {
                this.$this_bindModel.fileItem.ivPhotoPreview.setImageBitmap(loadScaledBitmap);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
