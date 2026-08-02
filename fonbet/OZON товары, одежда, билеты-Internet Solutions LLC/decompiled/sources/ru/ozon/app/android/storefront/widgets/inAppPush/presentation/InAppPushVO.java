package ru.ozon.app.android.storefront.widgets.inAppPush.presentation;

import B0.C2454a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0010¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationBar", "", "refreshInterval", "", "pixelUrl", "<init>", "(JLru/ozon/uni/atoms/data/notification/NotificationDTO;ILjava/lang/String;)V", "copy", "(JLru/ozon/uni/atoms/data/notification/NotificationDTO;ILjava/lang/String;)Lru/ozon/app/android/storefront/widgets/inAppPush/presentation/InAppPushVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "I", "getRefreshInterval", "Ljava/lang/String;", "getPixelUrl", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InAppPushVO implements c {
    public static final int $stable = NotificationDTO.$stable;
    private final long id;
    private final NotificationDTO notificationBar;
    private final String pixelUrl;
    private final int refreshInterval;

    public InAppPushVO(long j11, NotificationDTO notificationDTO, int i11, String str) {
        this.id = j11;
        this.notificationBar = notificationDTO;
        this.refreshInterval = i11;
        this.pixelUrl = str;
    }

    public static /* synthetic */ InAppPushVO copy$default(InAppPushVO inAppPushVO, long j11, NotificationDTO notificationDTO, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = inAppPushVO.id;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            notificationDTO = inAppPushVO.notificationBar;
        }
        NotificationDTO notificationDTO2 = notificationDTO;
        if ((i12 & 4) != 0) {
            i11 = inAppPushVO.refreshInterval;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str = inAppPushVO.pixelUrl;
        }
        return inAppPushVO.copy(j12, notificationDTO2, i13, str);
    }

    @NotNull
    public final InAppPushVO copy(long id2, NotificationDTO notificationBar, int refreshInterval, String pixelUrl) {
        return new InAppPushVO(id2, notificationBar, refreshInterval, pixelUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppPushVO)) {
            return false;
        }
        InAppPushVO inAppPushVO = (InAppPushVO) other;
        return this.id == inAppPushVO.id && Intrinsics.d(this.notificationBar, inAppPushVO.notificationBar) && this.refreshInterval == inAppPushVO.refreshInterval && Intrinsics.d(this.pixelUrl, inAppPushVO.pixelUrl);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final String getPixelUrl() {
        return this.pixelUrl;
    }

    public final int getRefreshInterval() {
        return this.refreshInterval;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        int a11 = C2454a.a(this.refreshInterval, (hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31, 31);
        String str = this.pixelUrl;
        return a11 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InAppPushVO(id=" + this.id + ", notificationBar=" + this.notificationBar + ", refreshInterval=" + this.refreshInterval + ", pixelUrl=" + this.pixelUrl + ")";
    }
}
