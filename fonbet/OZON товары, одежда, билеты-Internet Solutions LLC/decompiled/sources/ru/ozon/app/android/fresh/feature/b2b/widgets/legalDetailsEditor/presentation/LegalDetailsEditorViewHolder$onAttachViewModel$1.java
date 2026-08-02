package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorVO;
import ru.ozon.uni.android.cell.text.TextFieldCellView;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$TextFieldVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewHolder$onAttachViewModel$1", f = "LegalDetailsEditorViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LegalDetailsEditorViewHolder$onAttachViewModel$1 extends j implements Function2<LegalDetailsEditorVO.TextFieldVO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegalDetailsEditorViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorViewHolder$onAttachViewModel$1(LegalDetailsEditorViewHolder legalDetailsEditorViewHolder, d<? super LegalDetailsEditorViewHolder$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = legalDetailsEditorViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        LegalDetailsEditorViewHolder$onAttachViewModel$1 legalDetailsEditorViewHolder$onAttachViewModel$1 = new LegalDetailsEditorViewHolder$onAttachViewModel$1(this.this$0, dVar);
        legalDetailsEditorViewHolder$onAttachViewModel$1.L$0 = obj;
        return legalDetailsEditorViewHolder$onAttachViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        LegalDetailsEditorVO.TextFieldVO textFieldVO = (LegalDetailsEditorVO.TextFieldVO) this.L$0;
        if (textFieldVO == null) {
            return Unit.f71690a;
        }
        TextFieldCellView textFieldCellView = this.this$0.binding.addressInputLayout;
        LegalDetailsEditorViewHolder legalDetailsEditorViewHolder = this.this$0;
        if (textFieldVO.getIsShowErrorMessage()) {
            Intrinsics.f(textFieldCellView);
            legalDetailsEditorViewHolder.showError(textFieldCellView, textFieldVO.getErrorRequiredText());
        } else {
            Intrinsics.f(textFieldCellView);
            legalDetailsEditorViewHolder.hideError(textFieldCellView);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LegalDetailsEditorVO.TextFieldVO textFieldVO, d<? super Unit> dVar) {
        return ((LegalDetailsEditorViewHolder$onAttachViewModel$1) create(textFieldVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
