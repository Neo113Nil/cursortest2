package ru.ozon.app.android.cart.installment.presentation;

import Sc.s;
import Wc.a;
import android.view.View;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "gone", "", "view", "Landroid/view/View;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.cart.installment.presentation.InstallmentViewHolder$onWidgetCreated$1", f = "InstallmentViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class InstallmentViewHolder$onWidgetCreated$1 extends j implements InterfaceC6511n<Boolean, View, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    InstallmentViewHolder$onWidgetCreated$1(d<? super InstallmentViewHolder$onWidgetCreated$1> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, View view, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), view, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ((View) this.L$0).setVisibility(this.Z$0 ? 8 : 0);
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, View view, d<? super Unit> dVar) {
        InstallmentViewHolder$onWidgetCreated$1 installmentViewHolder$onWidgetCreated$1 = new InstallmentViewHolder$onWidgetCreated$1(dVar);
        installmentViewHolder$onWidgetCreated$1.Z$0 = z11;
        installmentViewHolder$onWidgetCreated$1.L$0 = view;
        return installmentViewHolder$onWidgetCreated$1.invokeSuspend(Unit.f71690a);
    }
}
