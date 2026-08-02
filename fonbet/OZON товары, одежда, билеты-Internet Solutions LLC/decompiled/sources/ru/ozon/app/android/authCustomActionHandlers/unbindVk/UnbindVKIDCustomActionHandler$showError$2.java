package ru.ozon.app.android.authCustomActionHandlers.unbindVk;

import Sc.s;
import Wc.a;
import a00.C4911f;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.authCustomActionHandlers.unbindVk.UnbindVKIDCustomActionHandler$showError$2", f = "UnbindVKIDCustomActionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class UnbindVKIDCustomActionHandler$showError$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C4911f $container;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnbindVKIDCustomActionHandler$showError$2(C4911f c4911f, d<? super UnbindVKIDCustomActionHandler$showError$2> dVar) {
        super(2, dVar);
        this.$container = c4911f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new UnbindVKIDCustomActionHandler$showError$2(this.$container, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ViewGroup rootView = ContextExtKt.getRootView(this.$container.a());
        if (rootView == null) {
            return Unit.f71690a;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this.$container.g(), 62, null).show();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((UnbindVKIDCustomActionHandler$showError$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
