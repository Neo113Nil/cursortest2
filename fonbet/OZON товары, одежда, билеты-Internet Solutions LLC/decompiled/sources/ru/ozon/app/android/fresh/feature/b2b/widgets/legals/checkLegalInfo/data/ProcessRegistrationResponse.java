package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data;

import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/ProcessRegistrationResponse;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "errors", "", "", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getErrors", "()Ljava/util/Map;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ProcessRegistrationResponse {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final Map<String, String> errors;
    private final NotificationDTO notificationBar;

    public ProcessRegistrationResponse(AtomActionDTO atomActionDTO, Map<String, String> map, NotificationDTO notificationDTO) {
        this.action = atomActionDTO;
        this.errors = map;
        this.notificationBar = notificationDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProcessRegistrationResponse copy$default(ProcessRegistrationResponse processRegistrationResponse, AtomActionDTO atomActionDTO, Map map, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = processRegistrationResponse.action;
        }
        if ((i11 & 2) != 0) {
            map = processRegistrationResponse.errors;
        }
        if ((i11 & 4) != 0) {
            notificationDTO = processRegistrationResponse.notificationBar;
        }
        return processRegistrationResponse.copy(atomActionDTO, map, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, String> component2() {
        return this.errors;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final ProcessRegistrationResponse copy(AtomActionDTO action, Map<String, String> errors, NotificationDTO notificationBar) {
        return new ProcessRegistrationResponse(action, errors, notificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessRegistrationResponse)) {
            return false;
        }
        ProcessRegistrationResponse processRegistrationResponse = (ProcessRegistrationResponse) other;
        return Intrinsics.d(this.action, processRegistrationResponse.action) && Intrinsics.d(this.errors, processRegistrationResponse.errors) && Intrinsics.d(this.notificationBar, processRegistrationResponse.notificationBar);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, String> getErrors() {
        return this.errors;
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        Map<String, String> map = this.errors;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        return hashCode2 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProcessRegistrationResponse(action=" + this.action + ", errors=" + this.errors + ", notificationBar=" + this.notificationBar + ")";
    }
}
