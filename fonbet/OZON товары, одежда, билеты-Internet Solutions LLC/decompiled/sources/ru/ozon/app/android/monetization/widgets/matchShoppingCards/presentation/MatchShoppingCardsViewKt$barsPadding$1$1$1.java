package ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation;

import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import android.view.View;
import androidx.compose.foundation.layout.T;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationConfig;
import u0.InterfaceC9914x;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.monetization.widgets.matchShoppingCards.presentation.MatchShoppingCardsViewKt$barsPadding$1$1$1", f = "MatchShoppingCardsView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class MatchShoppingCardsViewKt$barsPadding$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Z1.d $density;
    final /* synthetic */ ComponentCallbacksC5392m $fragment;
    final /* synthetic */ boolean $isTeensModeEnabled;
    final /* synthetic */ InterfaceC3978p0<InterfaceC9914x> $systemBarPadding$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchShoppingCardsViewKt$barsPadding$1$1$1(ComponentCallbacksC5392m componentCallbacksC5392m, Z1.d dVar, boolean z11, InterfaceC3978p0<InterfaceC9914x> interfaceC3978p0, d<? super MatchShoppingCardsViewKt$barsPadding$1$1$1> dVar2) {
        super(2, dVar2);
        this.$fragment = componentCallbacksC5392m;
        this.$density = dVar;
        this.$isTeensModeEnabled = z11;
        this.$systemBarPadding$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MatchShoppingCardsViewKt$barsPadding$1$1$1(this.$fragment, this.$density, this.$isTeensModeEnabled, this.$systemBarPadding$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        View view;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ComponentCallbacksC5392m componentCallbacksC5392m = this.$fragment;
        if (componentCallbacksC5392m != null && (view = componentCallbacksC5392m.getView()) != null) {
            Z1.d dVar = this.$density;
            boolean z11 = this.$isTeensModeEnabled;
            InterfaceC3978p0<InterfaceC9914x> interfaceC3978p0 = this.$systemBarPadding$delegate;
            C5353y0 n11 = Y.n(view);
            androidx.core.graphics.d f7 = n11 != null ? n11.f(7) : null;
            if (f7 != null) {
                interfaceC3978p0.setValue(T.b(0.0f, dVar.B(f7.f42127b), 0.0f, z11 ? dVar.B(BottomNavigationConfig.DEFAULT.getHeight()) + 24 : dVar.B(f7.f42129d), 5));
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MatchShoppingCardsViewKt$barsPadding$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
