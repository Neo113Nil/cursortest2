package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation;

import S0.A1;
import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.data.text.TextDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation.FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$1$1", f = "FloatCartButtonWidgetHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ FloatCartButtonVO $item;
    final /* synthetic */ A1<Integer> $state$delegate;
    final /* synthetic */ InterfaceC3978p0<TextDTO> $textAtom$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$1$1(FloatCartButtonVO floatCartButtonVO, A1<Integer> a12, InterfaceC3978p0<TextDTO> interfaceC3978p0, d<? super FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$1$1> dVar) {
        super(2, dVar);
        this.$item = floatCartButtonVO;
        this.$state$delegate = a12;
        this.$textAtom$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$1$1(this.$item, this.$state$delegate, this.$textAtom$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int FloatCartButtonWidgetHolder_FJfuzF0$lambda$0;
        int FloatCartButtonWidgetHolder_FJfuzF0$lambda$02;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        FloatCartButtonWidgetHolder_FJfuzF0$lambda$0 = FloatCartButtonWidgetHolderKt.FloatCartButtonWidgetHolder_FJfuzF0$lambda$0(this.$state$delegate);
        if (FloatCartButtonWidgetHolder_FJfuzF0$lambda$0 == 0) {
            return Unit.f71690a;
        }
        InterfaceC3978p0<TextDTO> interfaceC3978p0 = this.$textAtom$delegate;
        TextDTO text = this.$item.getText();
        FloatCartButtonWidgetHolder_FJfuzF0$lambda$02 = FloatCartButtonWidgetHolderKt.FloatCartButtonWidgetHolder_FJfuzF0$lambda$0(this.$state$delegate);
        interfaceC3978p0.setValue(FloatCartButtonWidgetHolderKt.copyWithNewProductCount(text, FloatCartButtonWidgetHolder_FJfuzF0$lambda$02));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
