package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class FirstGreetingScreen$show$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ConstraintLayout $constraintLayout;
    final /* synthetic */ Function2<Boolean, Function0<Unit>, Unit> $onNext;
    final /* synthetic */ FrameLayout $rootView;
    final /* synthetic */ FirstGreetingScreen this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FirstGreetingScreen$show$1(ConstraintLayout constraintLayout, FirstGreetingScreen firstGreetingScreen, FrameLayout frameLayout, Function2<? super Boolean, ? super Function0<Unit>, Unit> function2) {
        super(0);
        this.$constraintLayout = constraintLayout;
        this.this$0 = firstGreetingScreen;
        this.$rootView = frameLayout;
        this.$onNext = function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(FirstGreetingScreen firstGreetingScreen, ConstraintLayout constraintLayout, FrameLayout frameLayout, Function2 function2, View view) {
        firstGreetingScreen.doOnClick(new FirstGreetingScreen$show$1$1$1(constraintLayout, frameLayout, function2));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        final ConstraintLayout constraintLayout = this.$constraintLayout;
        final FirstGreetingScreen firstGreetingScreen = this.this$0;
        final FrameLayout frameLayout = this.$rootView;
        final Function2<Boolean, Function0<Unit>, Unit> function2 = this.$onNext;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial.screens.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FirstGreetingScreen$show$1.invoke$lambda$0(firstGreetingScreen, constraintLayout, frameLayout, function2, view);
            }
        });
    }
}
