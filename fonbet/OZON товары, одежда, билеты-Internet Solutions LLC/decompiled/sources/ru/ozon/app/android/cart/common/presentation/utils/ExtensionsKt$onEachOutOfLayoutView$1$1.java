package ru.ozon.app.android.cart.common.presentation.utils;

import Sc.s;
import Wc.a;
import android.view.View;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt$onEachOutOfLayoutView$1$1", f = "Extensions.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ExtensionsKt$onEachOutOfLayoutView$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC6511n<T, View, d<? super Unit>, Object> $action;
    final /* synthetic */ T $value;
    final /* synthetic */ View $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ExtensionsKt$onEachOutOfLayoutView$1$1(InterfaceC6511n<? super T, ? super View, ? super d<? super Unit>, ? extends Object> interfaceC6511n, T t2, View view, d<? super ExtensionsKt$onEachOutOfLayoutView$1$1> dVar) {
        super(2, dVar);
        this.$action = interfaceC6511n;
        this.$value = t2;
        this.$view = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ExtensionsKt$onEachOutOfLayoutView$1$1(this.$action, this.$value, this.$view, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC6511n<T, View, d<? super Unit>, Object> interfaceC6511n = this.$action;
            T t2 = this.$value;
            View view = this.$view;
            this.label = 1;
            if (interfaceC6511n.invoke(t2, view, this) == obj2) {
                return obj2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ExtensionsKt$onEachOutOfLayoutView$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
