package ru.ozon.android.messenger.framework.presentation.common.notification;

import android.content.Context;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

/* loaded from: classes10.dex */
public interface g {

    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final NotificationDTO f90790a;

        static {
            int i11 = NotificationDTO.$stable;
        }

        public a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.f90790a = new NotificationDTO(ru.ozon.android.messenger.utils.c.d(R$string.messenger_no_internet_connection, context), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null);
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.notification.g
        public final void a(NotificationLayoutManager notificationLayoutManager, @NotNull J viewLifecycleOwner) {
            Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
            if (notificationLayoutManager != null) {
                NotificationBar.Companion.make$default(NotificationBar.INSTANCE, notificationLayoutManager, this.f90790a, viewLifecycleOwner, null, 8, null).show();
            }
        }

        @Override // ru.ozon.android.messenger.framework.presentation.common.notification.g
        @NotNull
        public final NotificationDTO b() {
            return this.f90790a;
        }
    }

    void a(NotificationLayoutManager notificationLayoutManager, @NotNull J j11);

    @NotNull
    NotificationDTO b();
}
