package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain;

import D3.g;
import GZ.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\bHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0002\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0006\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/B2bChangeEmailResponseDTO;", "", "isSuccess", "", "error", "", "isOtpExpired", DynamicElementDTO.TIMER, "", "notification", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/NotificationResponseDTO;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/NotificationResponseDTO;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getError", "()Ljava/lang/String;", "getTimer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNotification", "()Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/NotificationResponseDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/NotificationResponseDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/domain/B2bChangeEmailResponseDTO;", "equals", "other", "hashCode", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class B2bChangeEmailResponseDTO {
    public static final int $stable = NotificationDTO.$stable;
    private final String error;
    private final Boolean isOtpExpired;
    private final Boolean isSuccess;
    private final NotificationResponseDTO notification;
    private final Integer timer;

    public B2bChangeEmailResponseDTO(Boolean bool, String str, Boolean bool2, Integer num, NotificationResponseDTO notificationResponseDTO) {
        this.isSuccess = bool;
        this.error = str;
        this.isOtpExpired = bool2;
        this.timer = num;
        this.notification = notificationResponseDTO;
    }

    public static /* synthetic */ B2bChangeEmailResponseDTO copy$default(B2bChangeEmailResponseDTO b2bChangeEmailResponseDTO, Boolean bool, String str, Boolean bool2, Integer num, NotificationResponseDTO notificationResponseDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = b2bChangeEmailResponseDTO.isSuccess;
        }
        if ((i11 & 2) != 0) {
            str = b2bChangeEmailResponseDTO.error;
        }
        if ((i11 & 4) != 0) {
            bool2 = b2bChangeEmailResponseDTO.isOtpExpired;
        }
        if ((i11 & 8) != 0) {
            num = b2bChangeEmailResponseDTO.timer;
        }
        if ((i11 & 16) != 0) {
            notificationResponseDTO = b2bChangeEmailResponseDTO.notification;
        }
        NotificationResponseDTO notificationResponseDTO2 = notificationResponseDTO;
        Boolean bool3 = bool2;
        return b2bChangeEmailResponseDTO.copy(bool, str, bool3, num, notificationResponseDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getIsOtpExpired() {
        return this.isOtpExpired;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getTimer() {
        return this.timer;
    }

    /* renamed from: component5, reason: from getter */
    public final NotificationResponseDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final B2bChangeEmailResponseDTO copy(Boolean isSuccess, String error, Boolean isOtpExpired, Integer timer, NotificationResponseDTO notification) {
        return new B2bChangeEmailResponseDTO(isSuccess, error, isOtpExpired, timer, notification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof B2bChangeEmailResponseDTO)) {
            return false;
        }
        B2bChangeEmailResponseDTO b2bChangeEmailResponseDTO = (B2bChangeEmailResponseDTO) other;
        return Intrinsics.d(this.isSuccess, b2bChangeEmailResponseDTO.isSuccess) && Intrinsics.d(this.error, b2bChangeEmailResponseDTO.error) && Intrinsics.d(this.isOtpExpired, b2bChangeEmailResponseDTO.isOtpExpired) && Intrinsics.d(this.timer, b2bChangeEmailResponseDTO.timer) && Intrinsics.d(this.notification, b2bChangeEmailResponseDTO.notification);
    }

    public final String getError() {
        return this.error;
    }

    public final NotificationResponseDTO getNotification() {
        return this.notification;
    }

    public final Integer getTimer() {
        return this.timer;
    }

    public int hashCode() {
        Boolean bool = this.isSuccess;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.error;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.isOtpExpired;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.timer;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        NotificationResponseDTO notificationResponseDTO = this.notification;
        return hashCode4 + (notificationResponseDTO != null ? notificationResponseDTO.hashCode() : 0);
    }

    public final Boolean isOtpExpired() {
        return this.isOtpExpired;
    }

    public final Boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isSuccess;
        String str = this.error;
        Boolean bool2 = this.isOtpExpired;
        Integer num = this.timer;
        NotificationResponseDTO notificationResponseDTO = this.notification;
        StringBuilder e11 = g.e("B2bChangeEmailResponseDTO(isSuccess=", bool, ", error=", str, ", isOtpExpired=");
        e.d(bool2, num, ", timer=", ", notification=", e11);
        e11.append(notificationResponseDTO);
        e11.append(")");
        return e11.toString();
    }

    public /* synthetic */ B2bChangeEmailResponseDTO(Boolean bool, String str, Boolean bool2, Integer num, NotificationResponseDTO notificationResponseDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : notificationResponseDTO);
    }
}
