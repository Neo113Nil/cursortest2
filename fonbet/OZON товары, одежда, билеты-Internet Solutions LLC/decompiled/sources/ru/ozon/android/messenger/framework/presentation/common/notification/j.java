package ru.ozon.android.messenger.framework.presentation.common.notification;

import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes10.dex */
public interface j {

    public static final class a implements j {
        @Override // ru.ozon.android.messenger.framework.presentation.common.notification.j
        public final void a(NotificationLayoutManager notificationLayoutManager, @NotNull J viewLifecycleOwner, @NotNull String notificationTitle, String str) {
            Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
            Intrinsics.checkNotNullParameter(notificationTitle, "notificationTitle");
            if (notificationLayoutManager != null) {
                NotificationBar.Companion.make$default(NotificationBar.INSTANCE, notificationLayoutManager, new NotificationDTO(notificationTitle, str, null, null, null, null, null, null, null, NotificationDTO.Preset.SUCCESS, 476, null), viewLifecycleOwner, null, 8, null).show();
            }
        }
    }

    void a(NotificationLayoutManager notificationLayoutManager, @NotNull J j11, @NotNull String str, String str2);
}
