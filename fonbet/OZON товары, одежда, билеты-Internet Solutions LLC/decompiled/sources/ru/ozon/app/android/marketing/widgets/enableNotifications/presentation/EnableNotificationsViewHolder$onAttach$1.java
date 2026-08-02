package ru.ozon.app.android.marketing.widgets.enableNotifications.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.enableNotifications.core.EnableNotificationsViewMapper;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsVO;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsViewModel;
import ru.ozon.app.android.uikit.R$drawable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/marketing/widgets/enableNotifications/presentation/EnableNotificationsViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class EnableNotificationsViewHolder$onAttach$1 extends AbstractC7737t implements Function1<EnableNotificationsViewModel.Action, Unit> {
    final /* synthetic */ EnableNotificationsViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnableNotificationsViewHolder$onAttach$1(EnableNotificationsViewHolder enableNotificationsViewHolder) {
        super(1);
        this.this$0 = enableNotificationsViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EnableNotificationsViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EnableNotificationsViewModel.Action action) {
        EnableNotificationsVO enableNotificationsVO;
        EnableNotificationsVO enableNotificationsVO2;
        ComposerReferences composerReferences;
        EnableNotificationsVO enableNotificationsVO3;
        ComposerReferences composerReferences2;
        EnableNotificationsVO enableNotificationsVO4;
        if (Intrinsics.d(action, EnableNotificationsViewModel.Action.Success.INSTANCE)) {
            composerReferences2 = this.this$0.references;
            InterfaceC7851b controller = composerReferences2.getController();
            enableNotificationsVO4 = this.this$0.item;
            if (enableNotificationsVO4 != null) {
                controller.update(new EnableNotificationsViewMapper.UpdateAllowPushState(enableNotificationsVO4.getId(), EnableNotificationsVO.StateToShow.ApiSuccessState.INSTANCE));
                return;
            } else {
                Intrinsics.n("item");
                throw null;
            }
        }
        if (!Intrinsics.d(action, EnableNotificationsViewModel.Action.Error.INSTANCE)) {
            throw new o();
        }
        enableNotificationsVO = this.this$0.item;
        if (enableNotificationsVO == null) {
            Intrinsics.n("item");
            throw null;
        }
        if (Intrinsics.d(enableNotificationsVO.getStateToShow(), new EnableNotificationsVO.StateToShow.ApiState(true))) {
            composerReferences = this.this$0.references;
            InterfaceC7851b controller2 = composerReferences.getController();
            enableNotificationsVO3 = this.this$0.item;
            if (enableNotificationsVO3 == null) {
                Intrinsics.n("item");
                throw null;
            }
            controller2.update(new EnableNotificationsViewMapper.UpdateAllowPushState(enableNotificationsVO3.getId(), new EnableNotificationsVO.StateToShow.ApiState(false)));
        }
        enableNotificationsVO2 = this.this$0.item;
        if (enableNotificationsVO2 == null) {
            Intrinsics.n("item");
            throw null;
        }
        EnableNotificationsVO.State apiSettingsState = enableNotificationsVO2.getApiSettingsState();
        if (apiSettingsState != null) {
            this.this$0.showMessage(apiSettingsState.getErrorMessage(), R$drawable.ic_warning);
        }
    }
}
