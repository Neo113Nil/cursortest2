package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

import N3.C3660k;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdp.common.ugc.data.ugcratingservice.EditingActionDTO;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J]\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse;", "", "reviewUuid", "", "status", "link", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "editingAction", "Lru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;", "validationAction", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse$ValidationActionDTO;", "notificationHaptic", "Lru/ozon/uni/android/haptic/HapticToken;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse$ValidationActionDTO;Lru/ozon/uni/android/haptic/HapticToken;)V", "getReviewUuid", "()Ljava/lang/String;", "getStatus", "getLink", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getEditingAction", "()Lru/ozon/app/android/pdp/common/ugc/data/ugcratingservice/EditingActionDTO;", "getValidationAction", "()Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse$ValidationActionDTO;", "getNotificationHaptic", "()Lru/ozon/uni/android/haptic/HapticToken;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ValidationActionDTO", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CreateReviewResponse {
    public static final int $stable = 8;
    private final EditingActionDTO editingAction;
    private final String link;
    private final NotificationDTO notification;
    private final HapticToken notificationHaptic;
    private final String reviewUuid;
    private final String status;
    private final ValidationActionDTO validationAction;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/CreateReviewResponse$ValidationActionDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidationActionDTO {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final Map<String, TokenizedTrackingInfo> tracking;

        public ValidationActionDTO(AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            this.action = atomActionDTO;
            this.tracking = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidationActionDTO copy$default(ValidationActionDTO validationActionDTO, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                atomActionDTO = validationActionDTO.action;
            }
            if ((i11 & 2) != 0) {
                map = validationActionDTO.tracking;
            }
            return validationActionDTO.copy(atomActionDTO, map);
        }

        /* renamed from: component1, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.tracking;
        }

        @NotNull
        public final ValidationActionDTO copy(AtomActionDTO action, Map<String, TokenizedTrackingInfo> tracking) {
            return new ValidationActionDTO(action, tracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationActionDTO)) {
                return false;
            }
            ValidationActionDTO validationActionDTO = (ValidationActionDTO) other;
            return Intrinsics.d(this.action, validationActionDTO.action) && Intrinsics.d(this.tracking, validationActionDTO.tracking);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            AtomActionDTO atomActionDTO = this.action;
            int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ValidationActionDTO(action=" + this.action + ", tracking=" + this.tracking + ")";
        }
    }

    public CreateReviewResponse(String str, String str2, String str3, NotificationDTO notificationDTO, EditingActionDTO editingActionDTO, ValidationActionDTO validationActionDTO, HapticToken hapticToken) {
        this.reviewUuid = str;
        this.status = str2;
        this.link = str3;
        this.notification = notificationDTO;
        this.editingAction = editingActionDTO;
        this.validationAction = validationActionDTO;
        this.notificationHaptic = hapticToken;
    }

    public static /* synthetic */ CreateReviewResponse copy$default(CreateReviewResponse createReviewResponse, String str, String str2, String str3, NotificationDTO notificationDTO, EditingActionDTO editingActionDTO, ValidationActionDTO validationActionDTO, HapticToken hapticToken, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = createReviewResponse.reviewUuid;
        }
        if ((i11 & 2) != 0) {
            str2 = createReviewResponse.status;
        }
        if ((i11 & 4) != 0) {
            str3 = createReviewResponse.link;
        }
        if ((i11 & 8) != 0) {
            notificationDTO = createReviewResponse.notification;
        }
        if ((i11 & 16) != 0) {
            editingActionDTO = createReviewResponse.editingAction;
        }
        if ((i11 & 32) != 0) {
            validationActionDTO = createReviewResponse.validationAction;
        }
        if ((i11 & 64) != 0) {
            hapticToken = createReviewResponse.notificationHaptic;
        }
        ValidationActionDTO validationActionDTO2 = validationActionDTO;
        HapticToken hapticToken2 = hapticToken;
        EditingActionDTO editingActionDTO2 = editingActionDTO;
        String str4 = str3;
        return createReviewResponse.copy(str, str2, str4, notificationDTO, editingActionDTO2, validationActionDTO2, hapticToken2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component4, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    /* renamed from: component5, reason: from getter */
    public final EditingActionDTO getEditingAction() {
        return this.editingAction;
    }

    /* renamed from: component6, reason: from getter */
    public final ValidationActionDTO getValidationAction() {
        return this.validationAction;
    }

    /* renamed from: component7, reason: from getter */
    public final HapticToken getNotificationHaptic() {
        return this.notificationHaptic;
    }

    @NotNull
    public final CreateReviewResponse copy(String reviewUuid, String status, String link, NotificationDTO notification, EditingActionDTO editingAction, ValidationActionDTO validationAction, HapticToken notificationHaptic) {
        return new CreateReviewResponse(reviewUuid, status, link, notification, editingAction, validationAction, notificationHaptic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateReviewResponse)) {
            return false;
        }
        CreateReviewResponse createReviewResponse = (CreateReviewResponse) other;
        return Intrinsics.d(this.reviewUuid, createReviewResponse.reviewUuid) && Intrinsics.d(this.status, createReviewResponse.status) && Intrinsics.d(this.link, createReviewResponse.link) && Intrinsics.d(this.notification, createReviewResponse.notification) && Intrinsics.d(this.editingAction, createReviewResponse.editingAction) && Intrinsics.d(this.validationAction, createReviewResponse.validationAction) && this.notificationHaptic == createReviewResponse.notificationHaptic;
    }

    public final EditingActionDTO getEditingAction() {
        return this.editingAction;
    }

    public final String getLink() {
        return this.link;
    }

    public final NotificationDTO getNotification() {
        return this.notification;
    }

    public final HapticToken getNotificationHaptic() {
        return this.notificationHaptic;
    }

    public final String getReviewUuid() {
        return this.reviewUuid;
    }

    public final String getStatus() {
        return this.status;
    }

    public final ValidationActionDTO getValidationAction() {
        return this.validationAction;
    }

    public int hashCode() {
        String str = this.reviewUuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notification;
        int hashCode4 = (hashCode3 + (notificationDTO == null ? 0 : notificationDTO.hashCode())) * 31;
        EditingActionDTO editingActionDTO = this.editingAction;
        int hashCode5 = (hashCode4 + (editingActionDTO == null ? 0 : editingActionDTO.hashCode())) * 31;
        ValidationActionDTO validationActionDTO = this.validationAction;
        int hashCode6 = (hashCode5 + (validationActionDTO == null ? 0 : validationActionDTO.hashCode())) * 31;
        HapticToken hapticToken = this.notificationHaptic;
        return hashCode6 + (hapticToken != null ? hapticToken.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.reviewUuid;
        String str2 = this.status;
        String str3 = this.link;
        NotificationDTO notificationDTO = this.notification;
        EditingActionDTO editingActionDTO = this.editingAction;
        ValidationActionDTO validationActionDTO = this.validationAction;
        HapticToken hapticToken = this.notificationHaptic;
        StringBuilder d11 = C3660k.d("CreateReviewResponse(reviewUuid=", str, ", status=", str2, ", link=");
        d11.append(str3);
        d11.append(", notification=");
        d11.append(notificationDTO);
        d11.append(", editingAction=");
        d11.append(editingActionDTO);
        d11.append(", validationAction=");
        d11.append(validationActionDTO);
        d11.append(", notificationHaptic=");
        d11.append(hapticToken);
        d11.append(")");
        return d11.toString();
    }
}
