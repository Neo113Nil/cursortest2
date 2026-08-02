package ru.ozon.app.android.messenger.initializer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.navigation.newrouter.ui.BottomNavigationStateController;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isKeyboardVisible", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MessengerConfigImpl$messengerLifecycleCallback$1$onCreate$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ BottomNavigationStateController $controller;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessengerConfigImpl$messengerLifecycleCallback$1$onCreate$1(BottomNavigationStateController bottomNavigationStateController) {
        super(1);
        this.$controller = bottomNavigationStateController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        if (z11) {
            this.$controller.hideBottomNavigation();
        } else {
            this.$controller.showBottomNavigation();
        }
    }
}
