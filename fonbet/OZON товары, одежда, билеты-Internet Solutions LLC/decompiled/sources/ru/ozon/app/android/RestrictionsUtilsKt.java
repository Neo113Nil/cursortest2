package ru.ozon.app.android;

import Sc.InterfaceC3999a;
import a00.C4911f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.utils.ClipboardWrapperKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a/\u0010\u0012\u001a\u00020\u0004*\u00060\rj\u0002`\u000e2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u0016\u001a\u00020\u0004*\u00060\rj\u0002`\u000e2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/composer/ComposerReferences;", "", "clipboardText", "restrictionMessage", "", "showRestrictionAndCopy", "(Lru/ozon/app/android/composer/ComposerReferences;Ljava/lang/String;Ljava/lang/String;)V", "message", "", "icon", "imageTintColor", "showRestriction", "(Lru/ozon/app/android/composer/ComposerReferences;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "notificationMessage", "", "hasCloseButton", "showNotificationAndCopy", "(La00/f;Ljava/lang/String;Ljava/lang/String;Z)V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;", "preset", "showNotification", "(La00/f;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;Z)V", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RestrictionsUtilsKt {
    public static final void showNotification(@NotNull C4911f c4911f, @NotNull String message, @NotNull NotificationDTO.Preset preset, boolean z11) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(preset, "preset");
        ComponentCallbacksC5392m c11 = c4911f.c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, z11 ? new NotificationDTO(message, null, null, null, null, null, 3, null, null, preset, 446, null) : new NotificationDTO(message, null, null, null, null, null, 3, null, null, preset, 414, null), c4911f.g(), null, 8, null).show();
    }

    public static /* synthetic */ void showNotification$default(C4911f c4911f, String str, NotificationDTO.Preset preset, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        showNotification(c4911f, str, preset, z11);
    }

    public static final void showNotificationAndCopy(@NotNull C4911f c4911f, @NotNull String clipboardText, @NotNull String notificationMessage, boolean z11) {
        Intrinsics.checkNotNullParameter(c4911f, "<this>");
        Intrinsics.checkNotNullParameter(clipboardText, "clipboardText");
        Intrinsics.checkNotNullParameter(notificationMessage, "notificationMessage");
        Context applicationContext = c4911f.i().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ClipboardWrapperKt.toClipboard$default(applicationContext, null, clipboardText, 1, null);
        showNotification(c4911f, notificationMessage, NotificationDTO.Preset.SUCCESS, z11);
    }

    public static /* synthetic */ void showNotificationAndCopy$default(C4911f c4911f, String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        showNotificationAndCopy(c4911f, str, str2, z11);
    }

    @InterfaceC3999a
    public static final void showRestriction(@NotNull ComposerReferences composerReferences, @NotNull String message, Integer num, String str) {
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(composerReferences, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            return;
        }
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message), null, null, num, null, str, null, null, null, null, null, 3000L, null, null, composerReferences.getContainer().g(), 57178, null).show();
    }

    public static /* synthetic */ void showRestriction$default(ComposerReferences composerReferences, String str, Integer num, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        showRestriction(composerReferences, str, num, str2);
    }

    @InterfaceC3999a
    public static final void showRestrictionAndCopy(@NotNull ComposerReferences composerReferences, @NotNull String clipboardText, @NotNull String restrictionMessage) {
        Intrinsics.checkNotNullParameter(composerReferences, "<this>");
        Intrinsics.checkNotNullParameter(clipboardText, "clipboardText");
        Intrinsics.checkNotNullParameter(restrictionMessage, "restrictionMessage");
        Context applicationContext = composerReferences.getContainer().i().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ClipboardWrapperKt.toClipboard$default(applicationContext, null, clipboardText, 1, null);
        showRestriction(composerReferences, restrictionMessage, Integer.valueOf(R$drawable.ic_m_check), StyleParser.OzColor.OZ_SEMANTIC_COLOR_ACCENT_SECONDARY.getValue());
    }
}
