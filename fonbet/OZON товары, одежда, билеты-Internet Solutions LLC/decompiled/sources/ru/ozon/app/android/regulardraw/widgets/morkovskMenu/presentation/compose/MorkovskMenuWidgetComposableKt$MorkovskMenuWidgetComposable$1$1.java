package ru.ozon.app.android.regulardraw.widgets.morkovskMenu.presentation.compose;

import S0.InterfaceC3972m0;
import Sc.s;
import Wc.a;
import android.view.View;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.regulardraw.widgets.morkovskMenu.presentation.compose.MorkovskMenuWidgetComposableKt$MorkovskMenuWidgetComposable$1$1", f = "MorkovskMenuWidgetComposable.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MorkovskMenuWidgetComposableKt$MorkovskMenuWidgetComposable$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ ComponentCallbacksC5392m $fragment;
    final /* synthetic */ InterfaceC3972m0 $navigationBarPadding$delegate;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MorkovskMenuWidgetComposableKt$MorkovskMenuWidgetComposable$1$1(ComponentCallbacksC5392m componentCallbacksC5392m, InterfaceC3972m0 interfaceC3972m0, d<? super MorkovskMenuWidgetComposableKt$MorkovskMenuWidgetComposable$1$1> dVar) {
        super(2, dVar);
        this.$fragment = componentCallbacksC5392m;
        this.$navigationBarPadding$delegate = interfaceC3972m0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MorkovskMenuWidgetComposableKt$MorkovskMenuWidgetComposable$1$1(this.$fragment, this.$navigationBarPadding$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        View view;
        InterfaceC3972m0 interfaceC3972m0;
        int i11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        if (i12 == 0) {
            s.b(obj);
            ComponentCallbacksC5392m componentCallbacksC5392m = this.$fragment;
            if (componentCallbacksC5392m != null && (view = componentCallbacksC5392m.getView()) != null) {
                interfaceC3972m0 = this.$navigationBarPadding$delegate;
                C5353y0 n11 = Y.n(view);
                androidx.core.graphics.d f7 = n11 != null ? n11.f(2) : null;
                int i13 = f7 != null ? f7.f42129d : 0;
                this.L$0 = interfaceC3972m0;
                this.I$0 = i13;
                this.label = 1;
                if (xe.Y.b(1L, this) == aVar) {
                    return aVar;
                }
                i11 = i13;
            }
            return Unit.f71690a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i11 = this.I$0;
        interfaceC3972m0 = (InterfaceC3972m0) this.L$0;
        s.b(obj);
        interfaceC3972m0.d(i11);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((MorkovskMenuWidgetComposableKt$MorkovskMenuWidgetComposable$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
