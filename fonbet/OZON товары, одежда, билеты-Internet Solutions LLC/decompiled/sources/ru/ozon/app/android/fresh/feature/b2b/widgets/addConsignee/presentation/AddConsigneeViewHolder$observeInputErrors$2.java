package ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddConsigneeBinding;
import ru.ozon.uni.android.cell.text.TextFieldCellView;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.addConsignee.presentation.AddConsigneeViewHolder$observeInputErrors$2", f = "AddConsigneeViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddConsigneeViewHolder$observeInputErrors$2 extends j implements Function2<String, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddConsigneeViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddConsigneeViewHolder$observeInputErrors$2(AddConsigneeViewHolder addConsigneeViewHolder, d<? super AddConsigneeViewHolder$observeInputErrors$2> dVar) {
        super(2, dVar);
        this.this$0 = addConsigneeViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddConsigneeViewHolder$observeInputErrors$2 addConsigneeViewHolder$observeInputErrors$2 = new AddConsigneeViewHolder$observeInputErrors$2(this.this$0, dVar);
        addConsigneeViewHolder$observeInputErrors$2.L$0 = obj;
        return addConsigneeViewHolder$observeInputErrors$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetAddConsigneeBinding widgetAddConsigneeBinding;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String str = (String) this.L$0;
        if (str != null) {
            AddConsigneeViewHolder addConsigneeViewHolder = this.this$0;
            widgetAddConsigneeBinding = addConsigneeViewHolder.binding;
            TextFieldCellView addressInput = widgetAddConsigneeBinding.addressInput;
            Intrinsics.checkNotNullExpressionValue(addressInput, "addressInput");
            addConsigneeViewHolder.showError(addressInput, str);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((AddConsigneeViewHolder$observeInputErrors$2) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
