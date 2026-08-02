package ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.WholeSaleModalViewModel;
import ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.presentation.wholeSaleModal.WholeSaleModalVI;
import ru.ozon.composer.compose.widget.i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.pdp.widgets.wholeSaleModal3P.core.WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2$1$1$1", f = "WholeSaleModalComposeWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ i<WholeSaleModalVI> $this_content;
    final /* synthetic */ WholeSaleModalViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2$1$1$1(WholeSaleModalViewModel wholeSaleModalViewModel, i<WholeSaleModalVI> iVar, d<? super WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2$1$1$1> dVar) {
        super(2, dVar);
        this.$viewModel = wholeSaleModalViewModel;
        this.$this_content = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2$1$1$1(this.$viewModel, this.$this_content, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$viewModel.setModalVI(this.$this_content.b());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((WholeSaleModalComposeWidgetKt$wholeSaleModal$1$3$2$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
