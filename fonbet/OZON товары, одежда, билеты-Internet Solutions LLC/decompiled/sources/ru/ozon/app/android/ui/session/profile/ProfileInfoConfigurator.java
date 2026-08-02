package ru.ozon.app.android.ui.session.profile;

import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ui/session/profile/ProfileInfoConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileInfoConfigurator extends ComposerScreenConfig.PageConfigurator {
    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        ViewGroup rootView;
        InterfaceC7851b controller;
        if (resultCode != -1) {
            return;
        }
        if (requestCode == 1970 || requestCode == 9001 || requestCode == 42032) {
            ConfiguratorReferences references = getReferences();
            if (references != null && (controller = references.getController()) != null) {
                InterfaceC7851b.a.a(controller, null, null, null, null, 15);
            }
            String stringExtra = data != null ? data.getStringExtra("DATA") : null;
            if (stringExtra == null || (rootView = ContextExtKt.getRootView(getContainer().i())) == null) {
                return;
            }
            NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(ComposerViewExtensionKt.composerContainer(rootView), null, 1, null);
            r a11 = getContainer().a();
            if (asNotificationLayoutManager$default == null || a11 == null) {
                FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(stringExtra), null, null, Integer.valueOf(R$drawable.ic_check_green), null, null, null, null, null, null, null, 3000L, null, null, getContainer().g(), 57306, null).show();
            } else {
                NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, new NotificationDTO(stringExtra, null, null, null, null, null, 3, null, null, NotificationDTO.Preset.SUCCESS, 414, null), a11, null, 8, null).show();
            }
        }
    }
}
