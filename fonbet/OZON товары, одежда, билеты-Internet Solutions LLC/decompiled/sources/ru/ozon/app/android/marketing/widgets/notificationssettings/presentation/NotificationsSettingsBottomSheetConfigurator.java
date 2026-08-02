package ru.ozon.app.android.marketing.widgets.notificationssettings.presentation;

import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.marketing.widgets.notificationssettings.presentation.selector.NotificationsSettingsSelectorRepo;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/marketing/widgets/notificationssettings/presentation/NotificationsSettingsBottomSheetConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "Landroidx/lifecycle/J;", "owner", "", "onDestroy", "(Landroidx/lifecycle/J;)V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationsSettingsBottomSheetConfigurator extends ComposerScreenConfig.PageConfigurator {
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        NotificationsSettingsSelectorRepo notificationsSettingsSelectorRepo = NotificationsSettingsSelectorRepo.INSTANCE;
        notificationsSettingsSelectorRepo.getRefreshSubject().onNext(Boolean.valueOf(notificationsSettingsSelectorRepo.getShouldRefresh()));
    }
}
