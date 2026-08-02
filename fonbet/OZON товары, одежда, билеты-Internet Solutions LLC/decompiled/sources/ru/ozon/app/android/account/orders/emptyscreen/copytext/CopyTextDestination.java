package ru.ozon.app.android.account.orders.emptyscreen.copytext;

import EZ.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/copytext/CopyTextDestination;", "LpZ/f;", "", "clipboardText", "restrictionMessage", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;", "notificationPreset", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;)V", "Ljava/lang/String;", "getClipboardText", "()Ljava/lang/String;", "getRestrictionMessage", "Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;", "getNotificationPreset", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO$Preset;", "Lkotlin/reflect/d;", "LEZ/a;", "navigator", "Lkotlin/reflect/d;", "getNavigator", "()Lkotlin/reflect/d;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CopyTextDestination extends f {

    @NotNull
    private final String clipboardText;

    @NotNull
    private final d<? extends a<?>> navigator;

    @NotNull
    private final NotificationDTO.Preset notificationPreset;

    @NotNull
    private final String restrictionMessage;

    public /* synthetic */ CopyTextDestination(String str, String str2, NotificationDTO.Preset preset, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? NotificationDTO.Preset.SUCCESS : preset);
    }

    @NotNull
    public final String getClipboardText() {
        return this.clipboardText;
    }

    @Override // pZ.f
    @NotNull
    public d<? extends a<?>> getNavigator() {
        return this.navigator;
    }

    @NotNull
    public final NotificationDTO.Preset getNotificationPreset() {
        return this.notificationPreset;
    }

    @NotNull
    public final String getRestrictionMessage() {
        return this.restrictionMessage;
    }

    public CopyTextDestination(@NotNull String clipboardText, @NotNull String restrictionMessage, @NotNull NotificationDTO.Preset notificationPreset) {
        Intrinsics.checkNotNullParameter(clipboardText, "clipboardText");
        Intrinsics.checkNotNullParameter(restrictionMessage, "restrictionMessage");
        Intrinsics.checkNotNullParameter(notificationPreset, "notificationPreset");
        this.clipboardText = clipboardText;
        this.restrictionMessage = restrictionMessage;
        this.notificationPreset = notificationPreset;
        this.navigator = N.b(CopyTextNavigationHandler.class);
    }
}
