package ru.ozon.app.android.ugc.widgets.profileInputs.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/data/ChangePublicNameResponse;", "", "errorInputMessage", "", "errorNotificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getErrorInputMessage", "()Ljava/lang/String;", "getErrorNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ChangePublicNameResponse {
    public static final int $stable = NotificationDTO.$stable;
    private final String errorInputMessage;
    private final NotificationDTO errorNotificationBar;

    public ChangePublicNameResponse(String str, NotificationDTO notificationDTO) {
        this.errorInputMessage = str;
        this.errorNotificationBar = notificationDTO;
    }

    public static /* synthetic */ ChangePublicNameResponse copy$default(ChangePublicNameResponse changePublicNameResponse, String str, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = changePublicNameResponse.errorInputMessage;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = changePublicNameResponse.errorNotificationBar;
        }
        return changePublicNameResponse.copy(str, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getErrorInputMessage() {
        return this.errorInputMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getErrorNotificationBar() {
        return this.errorNotificationBar;
    }

    @NotNull
    public final ChangePublicNameResponse copy(String errorInputMessage, NotificationDTO errorNotificationBar) {
        return new ChangePublicNameResponse(errorInputMessage, errorNotificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePublicNameResponse)) {
            return false;
        }
        ChangePublicNameResponse changePublicNameResponse = (ChangePublicNameResponse) other;
        return Intrinsics.d(this.errorInputMessage, changePublicNameResponse.errorInputMessage) && Intrinsics.d(this.errorNotificationBar, changePublicNameResponse.errorNotificationBar);
    }

    public final String getErrorInputMessage() {
        return this.errorInputMessage;
    }

    public final NotificationDTO getErrorNotificationBar() {
        return this.errorNotificationBar;
    }

    public int hashCode() {
        String str = this.errorInputMessage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        NotificationDTO notificationDTO = this.errorNotificationBar;
        return hashCode + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChangePublicNameResponse(errorInputMessage=" + this.errorInputMessage + ", errorNotificationBar=" + this.errorNotificationBar + ")";
    }
}
