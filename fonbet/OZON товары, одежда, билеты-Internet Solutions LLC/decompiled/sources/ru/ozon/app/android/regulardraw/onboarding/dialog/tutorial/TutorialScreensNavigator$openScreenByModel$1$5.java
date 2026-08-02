package ru.ozon.app.android.regulardraw.onboarding.dialog.tutorial;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "forceDismiss", "", "<unused var>", "Lkotlin/Function0;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TutorialScreensNavigator$openScreenByModel$1$5 extends AbstractC7737t implements Function2<Boolean, Function0<? extends Unit>, Unit> {
    final /* synthetic */ TutorialScreensNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TutorialScreensNavigator$openScreenByModel$1$5(TutorialScreensNavigator tutorialScreensNavigator) {
        super(2);
        this.this$0 = tutorialScreensNavigator;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Function0<? extends Unit> function0) {
        invoke(bool.booleanValue(), (Function0<Unit>) function0);
        return Unit.f71690a;
    }

    public final void invoke(boolean z11, Function0<Unit> function0) {
        this.this$0.nextScreenOrFinish(z11, null);
    }
}
