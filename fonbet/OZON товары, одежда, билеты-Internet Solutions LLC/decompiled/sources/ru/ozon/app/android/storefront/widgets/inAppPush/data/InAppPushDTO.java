package ru.ozon.app.android.storefront.widgets.inAppPush.data;

import C.o0;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/inAppPush/data/InAppPushDTO;", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "refreshInterval", "", "pixelUrl", "", "<init>", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/Integer;Ljava/lang/String;)V", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getRefreshInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPixelUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/app/android/storefront/widgets/inAppPush/data/InAppPushDTO;", "equals", "", "other", "hashCode", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InAppPushDTO {
    public static final int $stable = NotificationDTO.$stable;
    private final NotificationDTO notificationBar;
    private final String pixelUrl;
    private final Integer refreshInterval;

    public InAppPushDTO(NotificationDTO notificationDTO, Integer num, String str) {
        this.notificationBar = notificationDTO;
        this.refreshInterval = num;
        this.pixelUrl = str;
    }

    public static /* synthetic */ InAppPushDTO copy$default(InAppPushDTO inAppPushDTO, NotificationDTO notificationDTO, Integer num, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notificationDTO = inAppPushDTO.notificationBar;
        }
        if ((i11 & 2) != 0) {
            num = inAppPushDTO.refreshInterval;
        }
        if ((i11 & 4) != 0) {
            str = inAppPushDTO.pixelUrl;
        }
        return inAppPushDTO.copy(notificationDTO, num, str);
    }

    /* renamed from: component1, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getRefreshInterval() {
        return this.refreshInterval;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPixelUrl() {
        return this.pixelUrl;
    }

    @NotNull
    public final InAppPushDTO copy(NotificationDTO notificationBar, Integer refreshInterval, String pixelUrl) {
        return new InAppPushDTO(notificationBar, refreshInterval, pixelUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppPushDTO)) {
            return false;
        }
        InAppPushDTO inAppPushDTO = (InAppPushDTO) other;
        return Intrinsics.d(this.notificationBar, inAppPushDTO.notificationBar) && Intrinsics.d(this.refreshInterval, inAppPushDTO.refreshInterval) && Intrinsics.d(this.pixelUrl, inAppPushDTO.pixelUrl);
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final String getPixelUrl() {
        return this.pixelUrl;
    }

    public final Integer getRefreshInterval() {
        return this.refreshInterval;
    }

    public int hashCode() {
        NotificationDTO notificationDTO = this.notificationBar;
        int hashCode = (notificationDTO == null ? 0 : notificationDTO.hashCode()) * 31;
        Integer num = this.refreshInterval;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.pixelUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        NotificationDTO notificationDTO = this.notificationBar;
        Integer num = this.refreshInterval;
        String str = this.pixelUrl;
        StringBuilder sb2 = new StringBuilder("InAppPushDTO(notificationBar=");
        sb2.append(notificationDTO);
        sb2.append(", refreshInterval=");
        sb2.append(num);
        sb2.append(", pixelUrl=");
        return o0.c(sb2, str, ")");
    }
}
