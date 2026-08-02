package ru.ozon.app.android.ugc.widgets.selectionItemForm.header;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SingleEvent;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.selectionItemForm.header.SelectionFormHeaderVH$observeSingleEvent$1", f = "SelectionFormHeaderVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectionFormHeaderVH$observeSingleEvent$1 extends j implements Function2<SingleEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectionFormHeaderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormHeaderVH$observeSingleEvent$1(SelectionFormHeaderVH selectionFormHeaderVH, d<? super SelectionFormHeaderVH$observeSingleEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = selectionFormHeaderVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SelectionFormHeaderVH$observeSingleEvent$1 selectionFormHeaderVH$observeSingleEvent$1 = new SelectionFormHeaderVH$observeSingleEvent$1(this.this$0, dVar);
        selectionFormHeaderVH$observeSingleEvent$1.L$0 = obj;
        return selectionFormHeaderVH$observeSingleEvent$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        SingleEvent singleEvent = (SingleEvent) this.L$0;
        if (singleEvent instanceof SingleEvent.ShowCancelSheet) {
            this.this$0.showCancelSheet(((SingleEvent.ShowCancelSheet) singleEvent).getCustomTrackingInfo());
        } else if (singleEvent instanceof SingleEvent.HandleSheetAction) {
            this.this$0.handleBottomSheetAction((SingleEvent.HandleSheetAction) singleEvent);
        } else if (singleEvent instanceof SingleEvent.CloseForm) {
            this.this$0.closeForm();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SingleEvent singleEvent, d<? super Unit> dVar) {
        return ((SelectionFormHeaderVH$observeSingleEvent$1) create(singleEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
