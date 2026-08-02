package ru.ozon.app.android.actionHandlers.monetization.shareLinkBlogger;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/actionHandlers/monetization/shareLinkBlogger/ShareLinkBloggerResponse;", "", "shortURL", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getShortURL", "()Ljava/lang/String;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ShareLinkBloggerResponse {
    private final NotificationDTO notificationBar;

    @NotNull
    private final String shortURL;

    public ShareLinkBloggerResponse(@NotNull String shortURL, NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(shortURL, "shortURL");
        this.shortURL = shortURL;
        this.notificationBar = notificationDTO;
    }

    public static /* synthetic */ ShareLinkBloggerResponse copy$default(ShareLinkBloggerResponse shareLinkBloggerResponse, String str, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shareLinkBloggerResponse.shortURL;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = shareLinkBloggerResponse.notificationBar;
        }
        return shareLinkBloggerResponse.copy(str, notificationDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getShortURL() {
        return this.shortURL;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final ShareLinkBloggerResponse copy(@NotNull String shortURL, NotificationDTO notificationBar) {
        Intrinsics.checkNotNullParameter(shortURL, "shortURL");
        return new ShareLinkBloggerResponse(shortURL, notificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareLinkBloggerResponse)) {
            return false;
        }
        ShareLinkBloggerResponse shareLinkBloggerResponse = (ShareLinkBloggerResponse) other;
        return Intrinsics.d(this.shortURL, shareLinkBloggerResponse.shortURL) && Intrinsics.d(this.notificationBar, shareLinkBloggerResponse.notificationBar);
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final String getShortURL() {
        return this.shortURL;
    }

    public int hashCode() {
        int hashCode = this.shortURL.hashCode() * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        return hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "ShareLinkBloggerResponse(shortURL=" + this.shortURL + ", notificationBar=" + this.notificationBar + ")";
    }
}
