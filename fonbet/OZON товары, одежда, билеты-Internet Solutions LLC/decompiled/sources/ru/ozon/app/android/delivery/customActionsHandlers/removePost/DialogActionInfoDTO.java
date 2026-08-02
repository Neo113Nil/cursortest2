package ru.ozon.app.android.delivery.customActionsHandlers.removePost;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/removePost/DialogActionInfoDTO;", "", "link", "", "notificationInfo", "Lru/ozon/app/android/delivery/customActionsHandlers/removePost/DialogActionInfoDTO$NotificationInfoDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/delivery/customActionsHandlers/removePost/DialogActionInfoDTO$NotificationInfoDTO;)V", "getLink", "()Ljava/lang/String;", "getNotificationInfo", "()Lru/ozon/app/android/delivery/customActionsHandlers/removePost/DialogActionInfoDTO$NotificationInfoDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "NotificationInfoDTO", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DialogActionInfoDTO {
    private final String link;

    @NotNull
    private final NotificationInfoDTO notificationInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/removePost/DialogActionInfoDTO$NotificationInfoDTO;", "", "text", "", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getImage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationInfoDTO {
        private final String image;

        @NotNull
        private final String text;

        public NotificationInfoDTO(@NotNull String text, String str) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.image = str;
        }

        public static /* synthetic */ NotificationInfoDTO copy$default(NotificationInfoDTO notificationInfoDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = notificationInfoDTO.text;
            }
            if ((i11 & 2) != 0) {
                str2 = notificationInfoDTO.image;
            }
            return notificationInfoDTO.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final NotificationInfoDTO copy(@NotNull String text, String image) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new NotificationInfoDTO(text, image);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationInfoDTO)) {
                return false;
            }
            NotificationInfoDTO notificationInfoDTO = (NotificationInfoDTO) other;
            return Intrinsics.d(this.text, notificationInfoDTO.text) && Intrinsics.d(this.image, notificationInfoDTO.image);
        }

        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.image;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("NotificationInfoDTO(text=", this.text, ", image=", this.image, ")");
        }
    }

    public DialogActionInfoDTO(String str, @NotNull NotificationInfoDTO notificationInfo) {
        Intrinsics.checkNotNullParameter(notificationInfo, "notificationInfo");
        this.link = str;
        this.notificationInfo = notificationInfo;
    }

    public static /* synthetic */ DialogActionInfoDTO copy$default(DialogActionInfoDTO dialogActionInfoDTO, String str, NotificationInfoDTO notificationInfoDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dialogActionInfoDTO.link;
        }
        if ((i11 & 2) != 0) {
            notificationInfoDTO = dialogActionInfoDTO.notificationInfo;
        }
        return dialogActionInfoDTO.copy(str, notificationInfoDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NotificationInfoDTO getNotificationInfo() {
        return this.notificationInfo;
    }

    @NotNull
    public final DialogActionInfoDTO copy(String link, @NotNull NotificationInfoDTO notificationInfo) {
        Intrinsics.checkNotNullParameter(notificationInfo, "notificationInfo");
        return new DialogActionInfoDTO(link, notificationInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogActionInfoDTO)) {
            return false;
        }
        DialogActionInfoDTO dialogActionInfoDTO = (DialogActionInfoDTO) other;
        return Intrinsics.d(this.link, dialogActionInfoDTO.link) && Intrinsics.d(this.notificationInfo, dialogActionInfoDTO.notificationInfo);
    }

    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final NotificationInfoDTO getNotificationInfo() {
        return this.notificationInfo;
    }

    public int hashCode() {
        String str = this.link;
        return this.notificationInfo.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "DialogActionInfoDTO(link=" + this.link + ", notificationInfo=" + this.notificationInfo + ")";
    }
}
