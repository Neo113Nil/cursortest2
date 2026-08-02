package ru.ozon.app.android.ugc.widgets.selectionItemForm.input;

import Sc.s;
import WZ.l;
import WZ.m;
import WZ.t;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SingleEvent;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/presentation/SingleEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.selectionItemForm.input.SelectionFormInputVH$observeSingleEvent$1", f = "SelectionFormInputVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectionFormInputVH$observeSingleEvent$1 extends j implements Function2<SingleEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectionFormInputVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionFormInputVH$observeSingleEvent$1(SelectionFormInputVH selectionFormInputVH, d<? super SelectionFormInputVH$observeSingleEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = selectionFormInputVH;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SelectionFormInputVH$observeSingleEvent$1 selectionFormInputVH$observeSingleEvent$1 = new SelectionFormInputVH$observeSingleEvent$1(this.this$0, dVar);
        selectionFormInputVH$observeSingleEvent$1.L$0 = obj;
        return selectionFormInputVH$observeSingleEvent$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SelectionFormInput selectionFormInput;
        l lVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        SingleEvent singleEvent = (SingleEvent) this.L$0;
        SelectionFormInputVO boundData = this.this$0.getBoundData();
        if (boundData != null) {
            SelectionFormInputVH selectionFormInputVH = this.this$0;
            if ((singleEvent instanceof SingleEvent.ShowRequiredTextError) && Intrinsics.d(((SingleEvent.ShowRequiredTextError) singleEvent).getUploadKey(), boundData.getUploadKey())) {
                t errorViewTokenizedEvent = boundData.getErrorViewTokenizedEvent();
                if (errorViewTokenizedEvent != null) {
                    lVar = selectionFormInputVH.tokenizedAnalytics;
                    m.c(lVar, errorViewTokenizedEvent, null);
                }
                selectionFormInput = selectionFormInputVH.selectionFormInput;
                String errorRequiredText = boundData.getErrorRequiredText();
                if (errorRequiredText == null) {
                    errorRequiredText = "";
                }
                selectionFormInput.showError(errorRequiredText);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SingleEvent singleEvent, d<? super Unit> dVar) {
        return ((SelectionFormInputVH$observeSingleEvent$1) create(singleEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
