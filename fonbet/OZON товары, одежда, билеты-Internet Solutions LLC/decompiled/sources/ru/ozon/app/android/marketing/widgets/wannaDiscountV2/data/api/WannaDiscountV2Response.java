package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Response;", "", "message", "", "notificationButton", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Response$NotificationButton;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Response$NotificationButton;)V", "getMessage", "()Ljava/lang/String;", "getNotificationButton", "()Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Response$NotificationButton;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "NotificationButton", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WannaDiscountV2Response {
    public static final int $stable = 0;
    private final String message;
    private final NotificationButton notificationButton;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Response$NotificationButton;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationButton {
        public static final int $stable = 0;

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final String title;

        public NotificationButton(@NotNull String title, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.action = action;
        }

        public static /* synthetic */ NotificationButton copy$default(NotificationButton notificationButton, String str, AtomActionDTO atomActionDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = notificationButton.title;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = notificationButton.action;
            }
            return notificationButton.copy(str, atomActionDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final NotificationButton copy(@NotNull String title, @NotNull AtomActionDTO action) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            return new NotificationButton(title, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationButton)) {
                return false;
            }
            NotificationButton notificationButton = (NotificationButton) other;
            return Intrinsics.d(this.title, notificationButton.title) && Intrinsics.d(this.action, notificationButton.action);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.title.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "NotificationButton(title=" + this.title + ", action=" + this.action + ")";
        }
    }

    public WannaDiscountV2Response(String str, NotificationButton notificationButton) {
        this.message = str;
        this.notificationButton = notificationButton;
    }

    public static /* synthetic */ WannaDiscountV2Response copy$default(WannaDiscountV2Response wannaDiscountV2Response, String str, NotificationButton notificationButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wannaDiscountV2Response.message;
        }
        if ((i11 & 2) != 0) {
            notificationButton = wannaDiscountV2Response.notificationButton;
        }
        return wannaDiscountV2Response.copy(str, notificationButton);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationButton getNotificationButton() {
        return this.notificationButton;
    }

    @NotNull
    public final WannaDiscountV2Response copy(String message, NotificationButton notificationButton) {
        return new WannaDiscountV2Response(message, notificationButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WannaDiscountV2Response)) {
            return false;
        }
        WannaDiscountV2Response wannaDiscountV2Response = (WannaDiscountV2Response) other;
        return Intrinsics.d(this.message, wannaDiscountV2Response.message) && Intrinsics.d(this.notificationButton, wannaDiscountV2Response.notificationButton);
    }

    public final String getMessage() {
        return this.message;
    }

    public final NotificationButton getNotificationButton() {
        return this.notificationButton;
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        NotificationButton notificationButton = this.notificationButton;
        return hashCode + (notificationButton != null ? notificationButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WannaDiscountV2Response(message=" + this.message + ", notificationButton=" + this.notificationButton + ")";
    }
}
