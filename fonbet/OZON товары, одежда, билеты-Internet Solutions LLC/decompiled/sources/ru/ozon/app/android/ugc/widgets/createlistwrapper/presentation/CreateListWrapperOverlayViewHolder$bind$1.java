package ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "count", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.widgets.createlistwrapper.presentation.CreateListWrapperOverlayViewHolder$bind$1", f = "CreateListWrapperOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CreateListWrapperOverlayViewHolder$bind$1 extends j implements Function2<Integer, d<? super Unit>, Object> {
    final /* synthetic */ CreateListWrapperVI $item;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ CreateListWrapperOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateListWrapperOverlayViewHolder$bind$1(CreateListWrapperOverlayViewHolder createListWrapperOverlayViewHolder, CreateListWrapperVI createListWrapperVI, d<? super CreateListWrapperOverlayViewHolder$bind$1> dVar) {
        super(2, dVar);
        this.this$0 = createListWrapperOverlayViewHolder;
        this.$item = createListWrapperVI;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CreateListWrapperOverlayViewHolder$bind$1 createListWrapperOverlayViewHolder$bind$1 = new CreateListWrapperOverlayViewHolder$bind$1(this.this$0, this.$item, dVar);
        createListWrapperOverlayViewHolder$bind$1.I$0 = ((Number) obj).intValue();
        return createListWrapperOverlayViewHolder$bind$1;
    }

    public final Object invoke(int i11, d<? super Unit> dVar) {
        return ((CreateListWrapperOverlayViewHolder$bind$1) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.this$0.bindButton(this.$item.getButton(), this.I$0, this.$item.getLimit());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
        return invoke(num.intValue(), dVar);
    }
}
