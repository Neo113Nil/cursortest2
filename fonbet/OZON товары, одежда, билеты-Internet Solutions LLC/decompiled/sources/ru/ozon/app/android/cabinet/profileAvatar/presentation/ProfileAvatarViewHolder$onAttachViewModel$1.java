package ru.ozon.app.android.cabinet.profileAvatar.presentation;

import Sc.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.account.orders.OrderChangePreferences;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewItem.ProfileAvatarVO;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewmodel.AvatarViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cabinet/profileAvatar/presentation/viewmodel/AvatarViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ProfileAvatarViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<AvatarViewModel.Action, Unit> {
    final /* synthetic */ ProfileAvatarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileAvatarViewHolder$onAttachViewModel$1(ProfileAvatarViewHolder profileAvatarViewHolder) {
        super(1);
        this.this$0 = profileAvatarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AvatarViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AvatarViewModel.Action action) {
        ComposerReferences composerReferences;
        NotificationDTO defaultNotification;
        ComposerReferences composerReferences2;
        OrderChangePreferences orderChangePreferences;
        ComposerReferences composerReferences3;
        if (action instanceof AvatarViewModel.Action.Notification) {
            this.this$0.showOverlayProgress(false);
            this.this$0.setOriginalAvatar();
            this.this$0.showErrorNotification(((AvatarViewModel.Action.Notification) action).getNotification());
            return;
        }
        if (Intrinsics.d(action, AvatarViewModel.Action.Success.INSTANCE)) {
            this.this$0.showOverlayProgress(false);
            composerReferences2 = this.this$0.refs;
            InterfaceC7851b.a.a(composerReferences2.getController(), null, null, null, null, 15);
            orderChangePreferences = this.this$0.orderChangePreferences;
            orderChangePreferences.markAsUpdated();
            composerReferences3 = this.this$0.refs;
            composerReferences3.getContainer().i().setResult(-1);
            return;
        }
        if (Intrinsics.d(action, AvatarViewModel.Action.Loading.INSTANCE)) {
            this.this$0.setLoadingAvatar();
            this.this$0.showOverlayProgress(true);
        } else {
            if (!Intrinsics.d(action, AvatarViewModel.Action.Error.INSTANCE)) {
                throw new o();
            }
            this.this$0.showOverlayProgress(false);
            ProfileAvatarVO boundedData = this.this$0.getBoundedData();
            if (boundedData != null && (defaultNotification = boundedData.getDefaultNotification()) != null) {
                this.this$0.showErrorNotification(defaultNotification);
            }
            this.this$0.setOriginalAvatar();
            composerReferences = this.this$0.refs;
            composerReferences.getContainer().i().setResult(0);
        }
    }
}
