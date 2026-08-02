package ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation;

import Sc.o;
import Sc.s;
import WZ.t;
import android.animation.AnimatorSet;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.ButtonState;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "state", "Lru/ozon/app/android/fresh/unsorted/widgets/homeButton/presentation/ButtonState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewHolder$observeButtonState$1", f = "HomeButtonViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class HomeButtonViewHolder$observeButtonState$1 extends j implements Function2<ButtonState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeButtonViewHolder$observeButtonState$1(HomeButtonViewHolder homeButtonViewHolder, d<? super HomeButtonViewHolder$observeButtonState$1> dVar) {
        super(2, dVar);
        this.this$0 = homeButtonViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HomeButtonViewHolder$observeButtonState$1 homeButtonViewHolder$observeButtonState$1 = new HomeButtonViewHolder$observeButtonState$1(this.this$0, dVar);
        homeButtonViewHolder$observeButtonState$1.L$0 = obj;
        return homeButtonViewHolder$observeButtonState$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ImageView button;
        ImageView button2;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        t tokenizedEvent;
        i iVar;
        AnimatorSet animatorSet3;
        AnimatorSet animatorSet4;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ButtonState buttonState = (ButtonState) this.L$0;
        if (Intrinsics.d(buttonState, ButtonState.Hide.INSTANCE)) {
            animatorSet3 = this.this$0.fadeInAnimatorSet;
            animatorSet3.cancel();
            animatorSet4 = this.this$0.fadeOutAnimatorSet;
            animatorSet4.start();
        } else if (Intrinsics.d(buttonState, ButtonState.Show.INSTANCE)) {
            animatorSet = this.this$0.fadeOutAnimatorSet;
            animatorSet.cancel();
            animatorSet2 = this.this$0.fadeInAnimatorSet;
            animatorSet2.start();
            HomeButtonVO homeButtonVO = (HomeButtonVO) this.this$0.getBoundData();
            if (homeButtonVO != null && (tokenizedEvent = homeButtonVO.getTokenizedEvent()) != null) {
                iVar = this.this$0.uiContainer;
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(iVar.X(), tokenizedEvent, null, 2, null);
            }
        } else if (Intrinsics.d(buttonState, ButtonState.Hidden.INSTANCE)) {
            button2 = this.this$0.getButton();
            ViewExtKt.gone(button2);
        } else {
            if (!Intrinsics.d(buttonState, ButtonState.Showed.INSTANCE)) {
                throw new o();
            }
            button = this.this$0.getButton();
            ViewExtKt.show(button);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ButtonState buttonState, d<? super Unit> dVar) {
        return ((HomeButtonViewHolder$observeButtonState$1) create(buttonState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
