package ru.ozon.app.android.monetization.widgets.inputSubmit.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/data/AddLinkToPostResponse;", "", "type", "Lru/ozon/app/android/monetization/widgets/inputSubmit/data/AddLinkToPostResponse$ResponseType;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "error", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/app/android/monetization/widgets/inputSubmit/data/AddLinkToPostResponse$ResponseType;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getType", "()Lru/ozon/app/android/monetization/widgets/inputSubmit/data/AddLinkToPostResponse$ResponseType;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getError", "()Ljava/lang/String;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ResponseType", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddLinkToPostResponse {
    public static final int $stable = NotificationDTO.$stable;
    private final AtomActionDTO action;
    private final String error;
    private final NotificationDTO notificationBar;

    @NotNull
    private final ResponseType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/monetization/widgets/inputSubmit/data/AddLinkToPostResponse$ResponseType;", "", "<init>", "(Ljava/lang/String;I)V", "RESPONSE_TYPE_SUCCESS", "RESPONSE_TYPE_ERROR", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ResponseType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ResponseType[] $VALUES;
        public static final ResponseType RESPONSE_TYPE_SUCCESS = new ResponseType("RESPONSE_TYPE_SUCCESS", 0);
        public static final ResponseType RESPONSE_TYPE_ERROR = new ResponseType("RESPONSE_TYPE_ERROR", 1);

        private static final /* synthetic */ ResponseType[] $values() {
            return new ResponseType[]{RESPONSE_TYPE_SUCCESS, RESPONSE_TYPE_ERROR};
        }

        static {
            ResponseType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ResponseType(String str, int i11) {
        }

        public static ResponseType valueOf(String str) {
            return (ResponseType) Enum.valueOf(ResponseType.class, str);
        }

        public static ResponseType[] values() {
            return (ResponseType[]) $VALUES.clone();
        }
    }

    public AddLinkToPostResponse(@NotNull ResponseType type, AtomActionDTO atomActionDTO, String str, NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.action = atomActionDTO;
        this.error = str;
        this.notificationBar = notificationDTO;
    }

    public static /* synthetic */ AddLinkToPostResponse copy$default(AddLinkToPostResponse addLinkToPostResponse, ResponseType responseType, AtomActionDTO atomActionDTO, String str, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            responseType = addLinkToPostResponse.type;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = addLinkToPostResponse.action;
        }
        if ((i11 & 4) != 0) {
            str = addLinkToPostResponse.error;
        }
        if ((i11 & 8) != 0) {
            notificationDTO = addLinkToPostResponse.notificationBar;
        }
        return addLinkToPostResponse.copy(responseType, atomActionDTO, str, notificationDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ResponseType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final AddLinkToPostResponse copy(@NotNull ResponseType type, AtomActionDTO action, String error, NotificationDTO notificationBar) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new AddLinkToPostResponse(type, action, error, notificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddLinkToPostResponse)) {
            return false;
        }
        AddLinkToPostResponse addLinkToPostResponse = (AddLinkToPostResponse) other;
        return this.type == addLinkToPostResponse.type && Intrinsics.d(this.action, addLinkToPostResponse.action) && Intrinsics.d(this.error, addLinkToPostResponse.error) && Intrinsics.d(this.notificationBar, addLinkToPostResponse.notificationBar);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final String getError() {
        return this.error;
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final ResponseType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.error;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        return hashCode3 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AddLinkToPostResponse(type=" + this.type + ", action=" + this.action + ", error=" + this.error + ", notificationBar=" + this.notificationBar + ")";
    }
}
