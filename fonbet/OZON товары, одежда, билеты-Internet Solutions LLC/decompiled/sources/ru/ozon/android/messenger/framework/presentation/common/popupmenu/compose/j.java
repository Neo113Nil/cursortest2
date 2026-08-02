package ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose;

import Sc.s;
import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.common.popupmenu.compose.MessageContextMenuPopupKt$MessageContextMenuPopup$2$1$1", f = "MessageContextMenuPopup.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Window f90859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(Window window, kotlin.coroutines.d<? super j> dVar) {
        super(2, dVar);
        this.f90859d = window;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f90859d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        Window window = this.f90859d;
        if (window != null) {
            window.setDimAmount(0.25f);
            window.addFlags(131072);
            window.setWindowAnimations(0);
        }
        return Unit.f71690a;
    }
}
