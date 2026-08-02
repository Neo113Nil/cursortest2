package ru.ozon.app.android.fresh.feature.b2b.widgets.roleInvitationCreator.domain.api;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0002\u0010\u000bR\u001b\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorData;", "", "isSuccess", "", "errors", "", "", "notification", "Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/NotificationResponseDTO;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/NotificationResponseDTO;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getErrors", "()Ljava/util/List;", "getNotification", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/NotificationResponseDTO;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/NotificationResponseDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/roleInvitationCreator/domain/api/RoleInvitationCreatorData;", "equals", "other", "hashCode", "", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RoleInvitationCreatorData {
    public static final int $stable = 8;
    private final List<String> errors;
    private final Boolean isSuccess;
    private final NotificationResponseDTO notification;

    public RoleInvitationCreatorData() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoleInvitationCreatorData copy$default(RoleInvitationCreatorData roleInvitationCreatorData, Boolean bool, List list, NotificationResponseDTO notificationResponseDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = roleInvitationCreatorData.isSuccess;
        }
        if ((i11 & 2) != 0) {
            list = roleInvitationCreatorData.errors;
        }
        if ((i11 & 4) != 0) {
            notificationResponseDTO = roleInvitationCreatorData.notification;
        }
        return roleInvitationCreatorData.copy(bool, list, notificationResponseDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final List<String> component2() {
        return this.errors;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationResponseDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final RoleInvitationCreatorData copy(Boolean isSuccess, List<String> errors, NotificationResponseDTO notification) {
        return new RoleInvitationCreatorData(isSuccess, errors, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoleInvitationCreatorData)) {
            return false;
        }
        RoleInvitationCreatorData roleInvitationCreatorData = (RoleInvitationCreatorData) other;
        return Intrinsics.d(this.isSuccess, roleInvitationCreatorData.isSuccess) && Intrinsics.d(this.errors, roleInvitationCreatorData.errors) && Intrinsics.d(this.notification, roleInvitationCreatorData.notification);
    }

    public final List<String> getErrors() {
        return this.errors;
    }

    public final NotificationResponseDTO getNotification() {
        return this.notification;
    }

    public int hashCode() {
        Boolean bool = this.isSuccess;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.errors;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        NotificationResponseDTO notificationResponseDTO = this.notification;
        return hashCode2 + (notificationResponseDTO != null ? notificationResponseDTO.hashCode() : 0);
    }

    public final Boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "RoleInvitationCreatorData(isSuccess=" + this.isSuccess + ", errors=" + this.errors + ", notification=" + this.notification + ")";
    }

    public RoleInvitationCreatorData(Boolean bool, List<String> list, NotificationResponseDTO notificationResponseDTO) {
        this.isSuccess = bool;
        this.errors = list;
        this.notification = notificationResponseDTO;
    }

    public /* synthetic */ RoleInvitationCreatorData(Boolean bool, List list, NotificationResponseDTO notificationResponseDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : notificationResponseDTO);
    }
}
