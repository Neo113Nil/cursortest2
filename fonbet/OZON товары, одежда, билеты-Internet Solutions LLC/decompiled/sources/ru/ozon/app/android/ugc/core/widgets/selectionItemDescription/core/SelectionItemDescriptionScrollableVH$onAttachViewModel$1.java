package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l20.c;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "position", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/data/SelectionItemDescriptionDTO$ScrollPosition;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.core.SelectionItemDescriptionScrollableVH$onAttachViewModel$1", f = "SelectionItemDescriptionScrollableVH.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectionItemDescriptionScrollableVH$onAttachViewModel$1 extends j implements Function2<SelectionItemDescriptionDTO.ScrollPosition, d<? super Unit>, Object> {
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectionItemDescriptionScrollableVH<VO> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionItemDescriptionScrollableVH$onAttachViewModel$1(SelectionItemDescriptionScrollableVH<VO> selectionItemDescriptionScrollableVH, d<? super SelectionItemDescriptionScrollableVH$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = selectionItemDescriptionScrollableVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SelectionItemDescriptionScrollableVH$onAttachViewModel$1 selectionItemDescriptionScrollableVH$onAttachViewModel$1 = new SelectionItemDescriptionScrollableVH$onAttachViewModel$1(this.this$0, dVar);
        selectionItemDescriptionScrollableVH$onAttachViewModel$1.L$0 = obj;
        return selectionItemDescriptionScrollableVH$onAttachViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SelectionItemDescriptionDTO.ScrollPosition scrollPosition;
        int i11;
        int i12;
        SelectionItemDescriptionScrollViewModel selectionItemDescriptionScrollViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i13 = this.label;
        if (i13 == 0) {
            s.b(obj);
            SelectionItemDescriptionDTO.ScrollPosition scrollPosition2 = (SelectionItemDescriptionDTO.ScrollPosition) this.L$0;
            c boundData = this.this$0.getBoundData();
            if (boundData != null) {
                if (((SubListPositioned) boundData).getSubListIndex() < 0) {
                    boundData = null;
                }
                if (boundData != null) {
                    SubListPositioned subListPositioned = (SubListPositioned) boundData;
                    int adapterPosition = this.this$0.getAdapterPosition() - subListPositioned.getSubListIndex();
                    int subListSize = ((subListPositioned.getSubListSize() - 1) - subListPositioned.getSubListIndex()) + this.this$0.getAdapterPosition();
                    this.L$0 = scrollPosition2;
                    this.I$0 = adapterPosition;
                    this.I$1 = subListSize;
                    this.label = 1;
                    if (Y.b(400L, this) == aVar) {
                        return aVar;
                    }
                    scrollPosition = scrollPosition2;
                    i11 = subListSize;
                    i12 = adapterPosition;
                }
            }
            return Unit.f71690a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = this.I$1;
        i12 = this.I$0;
        scrollPosition = (SelectionItemDescriptionDTO.ScrollPosition) this.L$0;
        s.b(obj);
        if (scrollPosition == SelectionItemDescriptionDTO.ScrollPosition.TOP) {
            this.this$0.scrollToTop(i12);
        } else if (scrollPosition == SelectionItemDescriptionDTO.ScrollPosition.BOTTOM) {
            this.this$0.scrollToBottom(i11);
        }
        selectionItemDescriptionScrollViewModel = ((SelectionItemDescriptionScrollableVH) this.this$0).scrollViewModel;
        selectionItemDescriptionScrollViewModel.markScrollConsumed();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SelectionItemDescriptionDTO.ScrollPosition scrollPosition, d<? super Unit> dVar) {
        return ((SelectionItemDescriptionScrollableVH$onAttachViewModel$1) create(scrollPosition, dVar)).invokeSuspend(Unit.f71690a);
    }
}
