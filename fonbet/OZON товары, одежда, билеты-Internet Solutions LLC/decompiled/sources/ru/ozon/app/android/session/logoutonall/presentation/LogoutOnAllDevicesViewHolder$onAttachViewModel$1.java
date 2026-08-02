package ru.ozon.app.android.session.logoutonall.presentation;

import GZ.g;
import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.navigation.newrouter.RouterExtKt;
import ru.ozon.app.android.session.logoutonall.presentation.LogoutOnAllDevicesViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class LogoutOnAllDevicesViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<LogoutOnAllDevicesViewModel.Action, Unit> {
    final /* synthetic */ LogoutOnAllDevicesViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogoutOnAllDevicesViewHolder$onAttachViewModel$1(LogoutOnAllDevicesViewHolder logoutOnAllDevicesViewHolder) {
        super(1);
        this.this$0 = logoutOnAllDevicesViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LogoutOnAllDevicesViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LogoutOnAllDevicesViewModel.Action action) {
        g gVar;
        if (action instanceof LogoutOnAllDevicesViewModel.Action.Loading) {
            this.this$0.onLoadingAction((LogoutOnAllDevicesViewModel.Action.Loading) action);
            return;
        }
        if (action instanceof LogoutOnAllDevicesViewModel.Action.Error) {
            this.this$0.onErrorAction();
        } else {
            if (!(action instanceof LogoutOnAllDevicesViewModel.Action.ToHome)) {
                throw new o();
            }
            gVar = this.this$0.screenRouter;
            RouterExtKt.clearBackStack(gVar);
        }
    }
}
