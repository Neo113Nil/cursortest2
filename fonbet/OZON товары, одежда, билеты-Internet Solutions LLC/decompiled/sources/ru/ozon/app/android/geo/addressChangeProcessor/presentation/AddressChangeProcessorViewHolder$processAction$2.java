package ru.ozon.app.android.geo.addressChangeProcessor.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.presentation.addToCart.AddToCartViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geo.addressChangeProcessor.presentation.AddressChangeProcessorViewHolder$processAction$2", f = "AddressChangeProcessorViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddressChangeProcessorViewHolder$processAction$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $actionJson;
    final /* synthetic */ long $widgetId;
    int label;
    final /* synthetic */ AddressChangeProcessorViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressChangeProcessorViewHolder$processAction$2(AddressChangeProcessorViewHolder addressChangeProcessorViewHolder, String str, long j11, d<? super AddressChangeProcessorViewHolder$processAction$2> dVar) {
        super(2, dVar);
        this.this$0 = addressChangeProcessorViewHolder;
        this.$actionJson = str;
        this.$widgetId = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddressChangeProcessorViewHolder$processAction$2(this.this$0, this.$actionJson, this.$widgetId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        JsonParser jsonParser;
        Function1 function1;
        AddToCartViewModel addToCartViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        jsonParser = this.this$0.jsonDeserializer;
        AtomAction atomAction = AtomActionMapperKt.toAtomAction((AtomActionDTO) jsonParser.fromJson(this.$actionJson, AtomActionDTO.class), null);
        if (Intrinsics.d(atomAction.getId(), "addToCart") && (atomAction instanceof AtomAction.ComposerAction)) {
            addToCartViewModel = this.this$0.viewModel;
            addToCartViewModel.addToCart(((AtomAction.ComposerAction) atomAction).getParams(), new Long(this.$widgetId));
        } else {
            function1 = this.this$0.actionHandler;
            if (function1 != null) {
                function1.invoke(atomAction);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddressChangeProcessorViewHolder$processAction$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
