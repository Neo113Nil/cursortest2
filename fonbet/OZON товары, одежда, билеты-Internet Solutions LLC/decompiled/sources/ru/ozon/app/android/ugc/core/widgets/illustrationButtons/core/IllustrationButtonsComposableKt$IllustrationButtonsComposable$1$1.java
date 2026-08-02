package ru.ozon.app.android.ugc.core.widgets.illustrationButtons.core;

import Sc.s;
import WZ.t;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.core.widgets.illustrationButtons.presentation.IllustrationButtonsVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.core.widgets.illustrationButtons.core.IllustrationButtonsComposableKt$IllustrationButtonsComposable$1$1", f = "IllustrationButtonsComposable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class IllustrationButtonsComposableKt$IllustrationButtonsComposable$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<t, Unit> $onView;
    final /* synthetic */ IllustrationButtonsVO $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    IllustrationButtonsComposableKt$IllustrationButtonsComposable$1$1(IllustrationButtonsVO illustrationButtonsVO, Function1<? super t, Unit> function1, d<? super IllustrationButtonsComposableKt$IllustrationButtonsComposable$1$1> dVar) {
        super(2, dVar);
        this.$state = illustrationButtonsVO;
        this.$onView = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new IllustrationButtonsComposableKt$IllustrationButtonsComposable$1$1(this.$state, this.$onView, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        t tokenizedEvent = this.$state.getTokenizedEvent();
        if (tokenizedEvent != null) {
            this.$onView.invoke(tokenizedEvent);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((IllustrationButtonsComposableKt$IllustrationButtonsComposable$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
