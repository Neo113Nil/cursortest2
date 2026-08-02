package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import Sc.s;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorVO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.filesList.FileFieldAdapter;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorVO$FileFieldVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewHolder$onAttachViewModel$2", f = "LegalDetailsEditorViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class LegalDetailsEditorViewHolder$onAttachViewModel$2 extends j implements Function2<List<? extends LegalDetailsEditorVO.FileFieldVO>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegalDetailsEditorViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorViewHolder$onAttachViewModel$2(LegalDetailsEditorViewHolder legalDetailsEditorViewHolder, d<? super LegalDetailsEditorViewHolder$onAttachViewModel$2> dVar) {
        super(2, dVar);
        this.this$0 = legalDetailsEditorViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        LegalDetailsEditorViewHolder$onAttachViewModel$2 legalDetailsEditorViewHolder$onAttachViewModel$2 = new LegalDetailsEditorViewHolder$onAttachViewModel$2(this.this$0, dVar);
        legalDetailsEditorViewHolder$onAttachViewModel$2.L$0 = obj;
        return legalDetailsEditorViewHolder$onAttachViewModel$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends LegalDetailsEditorVO.FileFieldVO> list, d<? super Unit> dVar) {
        return invoke2((List<LegalDetailsEditorVO.FileFieldVO>) list, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FileFieldAdapter fileFieldAdapter;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List list = (List) this.L$0;
        if (list == null) {
            return Unit.f71690a;
        }
        fileFieldAdapter = this.this$0.getFileFieldAdapter();
        fileFieldAdapter.submitList(list);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<LegalDetailsEditorVO.FileFieldVO> list, d<? super Unit> dVar) {
        return ((LegalDetailsEditorViewHolder$onAttachViewModel$2) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }
}
