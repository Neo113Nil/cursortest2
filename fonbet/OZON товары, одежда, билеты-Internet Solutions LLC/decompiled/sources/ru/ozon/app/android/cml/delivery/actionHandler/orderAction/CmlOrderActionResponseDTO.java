package ru.ozon.app.android.cml.delivery.actionHandler.orderAction;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/orderAction/CmlOrderActionResponseDTO;", "", "successAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "params", "", "", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Ljava/util/Map;)V", "getSuccessAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getParams", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CmlOrderActionResponseDTO {
    private final NotificationDTO notificationBar;
    private final Map<String, String> params;
    private final AtomActionDTO successAction;

    public CmlOrderActionResponseDTO(AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, Map<String, String> map) {
        this.successAction = atomActionDTO;
        this.notificationBar = notificationDTO;
        this.params = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CmlOrderActionResponseDTO copy$default(CmlOrderActionResponseDTO cmlOrderActionResponseDTO, AtomActionDTO atomActionDTO, NotificationDTO notificationDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = cmlOrderActionResponseDTO.successAction;
        }
        if ((i11 & 2) != 0) {
            notificationDTO = cmlOrderActionResponseDTO.notificationBar;
        }
        if ((i11 & 4) != 0) {
            map = cmlOrderActionResponseDTO.params;
        }
        return cmlOrderActionResponseDTO.copy(atomActionDTO, notificationDTO, map);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getSuccessAction() {
        return this.successAction;
    }

    /* renamed from: component2, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final Map<String, String> component3() {
        return this.params;
    }

    @NotNull
    public final CmlOrderActionResponseDTO copy(AtomActionDTO successAction, NotificationDTO notificationBar, Map<String, String> params) {
        return new CmlOrderActionResponseDTO(successAction, notificationBar, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmlOrderActionResponseDTO)) {
            return false;
        }
        CmlOrderActionResponseDTO cmlOrderActionResponseDTO = (CmlOrderActionResponseDTO) other;
        return Intrinsics.d(this.successAction, cmlOrderActionResponseDTO.successAction) && Intrinsics.d(this.notificationBar, cmlOrderActionResponseDTO.notificationBar) && Intrinsics.d(this.params, cmlOrderActionResponseDTO.params);
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final AtomActionDTO getSuccessAction() {
        return this.successAction;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.successAction;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        int hashCode2 = (hashCode + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        Map<String, String> map = this.params;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AtomActionDTO atomActionDTO = this.successAction;
        NotificationDTO notificationDTO = this.notificationBar;
        Map<String, String> map = this.params;
        StringBuilder sb2 = new StringBuilder("CmlOrderActionResponseDTO(successAction=");
        sb2.append(atomActionDTO);
        sb2.append(", notificationBar=");
        sb2.append(notificationDTO);
        sb2.append(", params=");
        return P.f(sb2, map, ")");
    }
}
