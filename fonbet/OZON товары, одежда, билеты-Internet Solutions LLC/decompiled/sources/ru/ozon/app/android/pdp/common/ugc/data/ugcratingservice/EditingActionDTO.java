package ru.ozon.app.android.pdp.common.ugc.data.ugcratingservice;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "editErrorNotification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getEditErrorNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EditingActionDTO {
    private final AtomActionDTO action;
    private final NotificationDTO editErrorNotification;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public EditingActionDTO(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, NotificationDTO notificationDTO) {
        this.action = atomActionDTO;
        this.trackingInfo = map;
        this.editErrorNotification = notificationDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditingActionDTO copy$default(EditingActionDTO editingActionDTO, AtomActionDTO atomActionDTO, Map map, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = editingActionDTO.action;
        }
        if ((i11 & 2) != 0) {
            map = editingActionDTO.trackingInfo;
        }
        if ((i11 & 4) != 0) {
            notificationDTO = editingActionDTO.editErrorNotification;
        }
        return editingActionDTO.copy(atomActionDTO, map, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, TokenizedTrackingInfo> component2() {
        return this.trackingInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationDTO getEditErrorNotification() {
        return this.editErrorNotification;
    }

    @NotNull
    public final EditingActionDTO copy(AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, NotificationDTO editErrorNotification) {
        return new EditingActionDTO(action, trackingInfo, editErrorNotification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditingActionDTO)) {
            return false;
        }
        EditingActionDTO editingActionDTO = (EditingActionDTO) other;
        return Intrinsics.d(this.action, editingActionDTO.action) && Intrinsics.d(this.trackingInfo, editingActionDTO.trackingInfo) && Intrinsics.d(this.editErrorNotification, editingActionDTO.editErrorNotification);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final NotificationDTO getEditErrorNotification() {
        return this.editErrorNotification;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        NotificationDTO notificationDTO = this.editErrorNotification;
        return hashCode2 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EditingActionDTO(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", editErrorNotification=" + this.editErrorNotification + ")";
    }
}
