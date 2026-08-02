package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddEdoV2ButtonBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoViewModelV2$SingleEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoButtonViewHolderV2$onAttachViewModel$1", f = "AddEdoButtonViewHolderV2.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddEdoButtonViewHolderV2$onAttachViewModel$1 extends j implements Function2<AddEdoViewModelV2.SingleEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddEdoButtonViewHolderV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEdoButtonViewHolderV2$onAttachViewModel$1(AddEdoButtonViewHolderV2 addEdoButtonViewHolderV2, d<? super AddEdoButtonViewHolderV2$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = addEdoButtonViewHolderV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddEdoButtonViewHolderV2$onAttachViewModel$1 addEdoButtonViewHolderV2$onAttachViewModel$1 = new AddEdoButtonViewHolderV2$onAttachViewModel$1(this.this$0, dVar);
        addEdoButtonViewHolderV2$onAttachViewModel$1.L$0 = obj;
        return addEdoButtonViewHolderV2$onAttachViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetAddEdoV2ButtonBinding widgetAddEdoV2ButtonBinding;
        WidgetAddEdoV2ButtonBinding widgetAddEdoV2ButtonBinding2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AddEdoViewModelV2.SingleEvent singleEvent = (AddEdoViewModelV2.SingleEvent) this.L$0;
        if ((singleEvent instanceof AddEdoViewModelV2.SingleEvent.SuccessRedirect) || (singleEvent instanceof AddEdoViewModelV2.SingleEvent.ShowError) || Intrinsics.d(singleEvent, AddEdoViewModelV2.SingleEvent.SuccessRefresh.INSTANCE)) {
            widgetAddEdoV2ButtonBinding = this.this$0.binding;
            widgetAddEdoV2ButtonBinding.addEdoBtn.hideLoader();
        } else if (singleEvent instanceof AddEdoViewModelV2.SingleEvent.ShowLoader) {
            widgetAddEdoV2ButtonBinding2 = this.this$0.binding;
            widgetAddEdoV2ButtonBinding2.addEdoBtn.showLoader();
        } else if (!(singleEvent instanceof AddEdoViewModelV2.SingleEvent.GetInputAfterButtonClick)) {
            throw new o();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AddEdoViewModelV2.SingleEvent singleEvent, d<? super Unit> dVar) {
        return ((AddEdoButtonViewHolderV2$onAttachViewModel$1) create(singleEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
