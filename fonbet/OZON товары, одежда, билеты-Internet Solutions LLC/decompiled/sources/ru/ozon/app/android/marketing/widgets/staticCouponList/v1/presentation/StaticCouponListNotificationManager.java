package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import Sc.o;
import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.R$string;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u00020\n2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J-\u0010\u000b\u001a\u00020\n2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListNotificationManager;", "", "<init>", "()V", "Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;", "layoutManager", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationDTO", "", "showNotification", "(Lru/ozon/uni/android/notificationbar/NotificationLayoutManager;Landroidx/lifecycle/J;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "notification", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "message", "getNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNetworkErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "", "getErrorNotification", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;", "getNotificationPreset", "(Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "", "isNetworkRelatedError", "showDefaultError", "(La00/f;Ljava/lang/String;Z)V", "(La00/f;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListNotificationManager {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.values().length];
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final NotificationDTO getErrorNotification(String message) {
        return new NotificationDTO(message == null ? StringProvider.getString(R$string.error_occurred) : message, message != null ? null : StringProvider.getString(R$string.try_activation_again), null, null, null, null, 3, null, null, NotificationDTO.Preset.NEGATIVE, WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION, null);
    }

    private final NotificationDTO getNetworkErrorNotification() {
        return new NotificationDTO(StringProvider.getString(ru.ozon.app.android.platform.R$string.common_universal_network_error), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null);
    }

    private final NotificationDTO getNotification(NotificationDTO notification, ComposerActionWithActionDTO.MessageDTO message) {
        if (notification != null) {
            return notification;
        }
        if (message != null) {
            return new NotificationDTO(message.getMessage(), null, null, null, null, null, null, null, null, getNotificationPreset(message), 510, null);
        }
        return null;
    }

    private final NotificationDTO.Preset getNotificationPreset(ComposerActionWithActionDTO.MessageDTO message) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[message.getType().ordinal()];
        if (i11 == 1) {
            return NotificationDTO.Preset.CUSTOM;
        }
        if (i11 == 2) {
            return NotificationDTO.Preset.SUCCESS;
        }
        if (i11 == 3) {
            return NotificationDTO.Preset.WARNING;
        }
        throw new o();
    }

    public final void showDefaultError(@NotNull C4911f ownerContainer, String message, boolean isNetworkRelatedError) {
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        NotificationDTO networkErrorNotification = isNetworkRelatedError ? getNetworkErrorNotification() : getErrorNotification(message);
        ComponentCallbacksC5392m c11 = ownerContainer.c();
        NotificationLayoutManager notificationLayoutManager = null;
        if (c11 != null && (rootView = ContextExtKt.getRootView(c11)) != null) {
            notificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null);
        }
        showNotification(notificationLayoutManager, ownerContainer.g(), networkErrorNotification);
    }

    public final void showNotification(@NotNull C4911f ownerContainer, NotificationDTO notification, ComposerActionWithActionDTO.MessageDTO message) {
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        NotificationDTO notification2 = getNotification(notification, message);
        if (notification2 != null) {
            ComponentCallbacksC5392m c11 = ownerContainer.c();
            NotificationLayoutManager notificationLayoutManager = null;
            if (c11 != null && (rootView = ContextExtKt.getRootView(c11)) != null) {
                notificationLayoutManager = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null);
            }
            showNotification(notificationLayoutManager, ownerContainer.g(), notification2);
        }
    }

    private final void showNotification(NotificationLayoutManager layoutManager, J lifecycleOwner, NotificationDTO notificationDTO) {
        if (layoutManager == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, layoutManager, notificationDTO, lifecycleOwner, null, 8, null).show();
    }
}
