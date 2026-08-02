package ru.ozon.app.android.cabinet.profileAvatar.presentation.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cabinet.profileAvatar.data.repository.UploadAvatarResponse;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.viewmodel.AvatarViewModel;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/cabinet/profileAvatar/data/repository/UploadAvatarResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/cabinet/profileAvatar/data/repository/UploadAvatarResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AvatarViewModel$uploadAvatar$4 extends AbstractC7737t implements Function1<UploadAvatarResponse, Unit> {
    final /* synthetic */ AvatarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AvatarViewModel$uploadAvatar$4(AvatarViewModel avatarViewModel) {
        super(1);
        this.this$0 = avatarViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UploadAvatarResponse uploadAvatarResponse) {
        invoke2(uploadAvatarResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UploadAvatarResponse uploadAvatarResponse) {
        NotificationDTO errorNotificationBar = uploadAvatarResponse.getErrorNotificationBar();
        this.this$0.getSingleAction().setValue(errorNotificationBar != null ? new AvatarViewModel.Action.Notification(errorNotificationBar) : AvatarViewModel.Action.Success.INSTANCE);
    }
}
