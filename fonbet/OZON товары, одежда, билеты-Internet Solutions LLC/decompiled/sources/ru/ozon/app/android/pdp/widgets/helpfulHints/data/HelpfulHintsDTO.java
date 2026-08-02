package ru.ozon.app.android.pdp.widgets.helpfulHints.data;

import B0.C2454a;
import N3.C3660k;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationAtom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/widgets/helpfulHints/data/HelpfulHintsDTO;", "", "sku", "", "seconds", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "notificationBehaviour", "<init>", "(Ljava/lang/String;ILru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;Ljava/lang/String;)V", "getSku", "()Ljava/lang/String;", "getSeconds", "()I", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationAtom$NotificationWithIcon;", "getNotificationBehaviour", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HelpfulHintsDTO {
    public static final int $stable = NotificationAtom.NotificationWithIcon.$stable;

    @NotNull
    private final NotificationAtom.NotificationWithIcon notification;

    @NotNull
    private final String notificationBehaviour;
    private final int seconds;

    @NotNull
    private final String sku;

    public HelpfulHintsDTO(@NotNull String sku, int i11, @NotNull NotificationAtom.NotificationWithIcon notification, @NotNull String notificationBehaviour) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(notificationBehaviour, "notificationBehaviour");
        this.sku = sku;
        this.seconds = i11;
        this.notification = notification;
        this.notificationBehaviour = notificationBehaviour;
    }

    public static /* synthetic */ HelpfulHintsDTO copy$default(HelpfulHintsDTO helpfulHintsDTO, String str, int i11, NotificationAtom.NotificationWithIcon notificationWithIcon, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = helpfulHintsDTO.sku;
        }
        if ((i12 & 2) != 0) {
            i11 = helpfulHintsDTO.seconds;
        }
        if ((i12 & 4) != 0) {
            notificationWithIcon = helpfulHintsDTO.notification;
        }
        if ((i12 & 8) != 0) {
            str2 = helpfulHintsDTO.notificationBehaviour;
        }
        return helpfulHintsDTO.copy(str, i11, notificationWithIcon, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSku() {
        return this.sku;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSeconds() {
        return this.seconds;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final NotificationAtom.NotificationWithIcon getNotification() {
        return this.notification;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getNotificationBehaviour() {
        return this.notificationBehaviour;
    }

    @NotNull
    public final HelpfulHintsDTO copy(@NotNull String sku, int seconds, @NotNull NotificationAtom.NotificationWithIcon notification, @NotNull String notificationBehaviour) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(notificationBehaviour, "notificationBehaviour");
        return new HelpfulHintsDTO(sku, seconds, notification, notificationBehaviour);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpfulHintsDTO)) {
            return false;
        }
        HelpfulHintsDTO helpfulHintsDTO = (HelpfulHintsDTO) other;
        return Intrinsics.d(this.sku, helpfulHintsDTO.sku) && this.seconds == helpfulHintsDTO.seconds && Intrinsics.d(this.notification, helpfulHintsDTO.notification) && Intrinsics.d(this.notificationBehaviour, helpfulHintsDTO.notificationBehaviour);
    }

    @NotNull
    public final NotificationAtom.NotificationWithIcon getNotification() {
        return this.notification;
    }

    @NotNull
    public final String getNotificationBehaviour() {
        return this.notificationBehaviour;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    @NotNull
    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        return this.notificationBehaviour.hashCode() + ((this.notification.hashCode() + C2454a.a(this.seconds, this.sku.hashCode() * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.sku;
        int i11 = this.seconds;
        NotificationAtom.NotificationWithIcon notificationWithIcon = this.notification;
        String str2 = this.notificationBehaviour;
        StringBuilder c11 = C3660k.c(i11, "HelpfulHintsDTO(sku=", str, ", seconds=", ", notification=");
        c11.append(notificationWithIcon);
        c11.append(", notificationBehaviour=");
        c11.append(str2);
        c11.append(")");
        return c11.toString();
    }
}
