package ru.ozon.app.android.fresh.chat.widgets.textInput.presentation;

import S0.InterfaceC3978p0;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.chat.widgets.textInput.presentation.TextInputWidgetHolderKt$TextInputWidgetHolder$2$1", f = "TextInputWidgetHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class TextInputWidgetHolderKt$TextInputWidgetHolder$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ InterfaceC3978p0<Boolean> $showLoader$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputWidgetHolderKt$TextInputWidgetHolder$2$1(boolean z11, InterfaceC3978p0<Boolean> interfaceC3978p0, d<? super TextInputWidgetHolderKt$TextInputWidgetHolder$2$1> dVar) {
        super(2, dVar);
        this.$isLoading = z11;
        this.$showLoader$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TextInputWidgetHolderKt$TextInputWidgetHolder$2$1(this.$isLoading, this.$showLoader$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (!this.$isLoading) {
            TextInputWidgetHolderKt.TextInputWidgetHolder_Ow1X5yo$lambda$6(this.$showLoader$delegate, false);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TextInputWidgetHolderKt$TextInputWidgetHolder$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
