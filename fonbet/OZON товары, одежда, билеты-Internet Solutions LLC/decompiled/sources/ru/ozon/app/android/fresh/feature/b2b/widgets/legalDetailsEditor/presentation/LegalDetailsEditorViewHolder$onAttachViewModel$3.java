package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.utils.FlashBarErrorWrapper;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/utils/FlashBarErrorWrapper;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewHolder$onAttachViewModel$3", f = "LegalDetailsEditorViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LegalDetailsEditorViewHolder$onAttachViewModel$3 extends j implements Function2<FlashBarErrorWrapper, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegalDetailsEditorViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorViewHolder$onAttachViewModel$3(LegalDetailsEditorViewHolder legalDetailsEditorViewHolder, d<? super LegalDetailsEditorViewHolder$onAttachViewModel$3> dVar) {
        super(2, dVar);
        this.this$0 = legalDetailsEditorViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        LegalDetailsEditorViewHolder$onAttachViewModel$3 legalDetailsEditorViewHolder$onAttachViewModel$3 = new LegalDetailsEditorViewHolder$onAttachViewModel$3(this.this$0, dVar);
        legalDetailsEditorViewHolder$onAttachViewModel$3.L$0 = obj;
        return legalDetailsEditorViewHolder$onAttachViewModel$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LegalDetailsEditorViewModel legalDetailsEditorViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        FlashBarErrorWrapper flashBarErrorWrapper = (FlashBarErrorWrapper) this.L$0;
        if (flashBarErrorWrapper.getMessage().length() == 0) {
            return Unit.f71690a;
        }
        this.this$0.showErrorMessage(flashBarErrorWrapper.getMessage());
        legalDetailsEditorViewModel = this.this$0.viewModel;
        legalDetailsEditorViewModel.flashbarMessageShowed();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlashBarErrorWrapper flashBarErrorWrapper, d<? super Unit> dVar) {
        return ((LegalDetailsEditorViewHolder$onAttachViewModel$3) create(flashBarErrorWrapper, dVar)).invokeSuspend(Unit.f71690a);
    }
}
