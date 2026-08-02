package ru.ozon.app.android.actionHandlers.ugc.submitSelectionFormMobile;

import Ql.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/actionHandlers/ugc/submitSelectionFormMobile/SubmitSelectionResponse;", "", "selectionUuid", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getSelectionUuid", "()Ljava/lang/String;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SubmitSelectionResponse {
    private final AtomActionDTO action;
    private final NotificationDTO notification;
    private final String selectionUuid;

    public SubmitSelectionResponse(String str, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO) {
        this.selectionUuid = str;
        this.action = atomActionDTO;
        this.notification = notificationDTO;
    }

    public static /* synthetic */ SubmitSelectionResponse copy$default(SubmitSelectionResponse submitSelectionResponse, String str, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = submitSelectionResponse.selectionUuid;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = submitSelectionResponse.action;
        }
        if ((i11 & 4) != 0) {
            notificationDTO = submitSelectionResponse.notification;
        }
        return submitSelectionResponse.copy(str, atomActionDTO, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSelectionUuid() {
        return this.selectionUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final SubmitSelectionResponse copy(String selectionUuid, AtomActionDTO action, NotificationDTO notification) {
        return new SubmitSelectionResponse(selectionUuid, action, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitSelectionResponse)) {
            return false;
        }
        SubmitSelectionResponse submitSelectionResponse = (SubmitSelectionResponse) other;
        return Intrinsics.d(this.selectionUuid, submitSelectionResponse.selectionUuid) && Intrinsics.d(this.action, submitSelectionResponse.action) && Intrinsics.d(this.notification, submitSelectionResponse.notification);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public final String getSelectionUuid() {
        return this.selectionUuid;
    }

    public int hashCode() {
        String str = this.selectionUuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notification;
        return hashCode2 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.selectionUuid;
        AtomActionDTO atomActionDTO = this.action;
        NotificationDTO notificationDTO = this.notification;
        StringBuilder c11 = c.c("SubmitSelectionResponse(selectionUuid=", str, ", action=", atomActionDTO, ", notification=");
        c11.append(notificationDTO);
        c11.append(")");
        return c11.toString();
    }
}
