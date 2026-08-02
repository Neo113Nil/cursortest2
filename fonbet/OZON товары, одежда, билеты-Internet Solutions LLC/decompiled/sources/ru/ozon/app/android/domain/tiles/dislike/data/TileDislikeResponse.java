package ru.ozon.app.android.domain.tiles.dislike.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/domain/tiles/dislike/data/TileDislikeResponse;", "", "success", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(ZLru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getSuccess", "()Z", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class TileDislikeResponse {
    private final NotificationDTO notificationBar;
    private final boolean success;

    public TileDislikeResponse(boolean z11, NotificationDTO notificationDTO) {
        this.success = z11;
        this.notificationBar = notificationDTO;
    }

    public static /* synthetic */ TileDislikeResponse copy$default(TileDislikeResponse tileDislikeResponse, boolean z11, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = tileDislikeResponse.success;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = tileDislikeResponse.notificationBar;
        }
        return tileDislikeResponse.copy(z11, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final TileDislikeResponse copy(boolean success, NotificationDTO notificationBar) {
        return new TileDislikeResponse(success, notificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileDislikeResponse)) {
            return false;
        }
        TileDislikeResponse tileDislikeResponse = (TileDislikeResponse) other;
        return this.success == tileDislikeResponse.success && Intrinsics.d(this.notificationBar, tileDislikeResponse.notificationBar);
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.success) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        return hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "TileDislikeResponse(success=" + this.success + ", notificationBar=" + this.notificationBar + ")";
    }
}
