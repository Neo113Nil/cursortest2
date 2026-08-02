package ru.ozon.app.android.cml.delivery.actionHandler.validateDeclaredPrice;

import G.g;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.input.data.InputMoleculeDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/validateDeclaredPrice/ValidateDeclaredPriceResponseDTO;", "", "status", "Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;", "message", "", "price", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getStatus", "()Lru/ozon/app/android/cml/delivery/molecules/input/data/InputMoleculeDTO$InputStatus;", "getMessage", "()Ljava/lang/String;", "getPrice", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ValidateDeclaredPriceResponseDTO {

    @NotNull
    private final String message;
    private final NotificationDTO notificationBar;

    @NotNull
    private final String price;

    @NotNull
    private final InputMoleculeDTO.InputStatus status;

    public ValidateDeclaredPriceResponseDTO(@NotNull InputMoleculeDTO.InputStatus status, @NotNull String message, @NotNull String price, NotificationDTO notificationDTO) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(price, "price");
        this.status = status;
        this.message = message;
        this.price = price;
        this.notificationBar = notificationDTO;
    }

    public static /* synthetic */ ValidateDeclaredPriceResponseDTO copy$default(ValidateDeclaredPriceResponseDTO validateDeclaredPriceResponseDTO, InputMoleculeDTO.InputStatus inputStatus, String str, String str2, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            inputStatus = validateDeclaredPriceResponseDTO.status;
        }
        if ((i11 & 2) != 0) {
            str = validateDeclaredPriceResponseDTO.message;
        }
        if ((i11 & 4) != 0) {
            str2 = validateDeclaredPriceResponseDTO.price;
        }
        if ((i11 & 8) != 0) {
            notificationDTO = validateDeclaredPriceResponseDTO.notificationBar;
        }
        return validateDeclaredPriceResponseDTO.copy(inputStatus, str, str2, notificationDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final InputMoleculeDTO.InputStatus getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: component4, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final ValidateDeclaredPriceResponseDTO copy(@NotNull InputMoleculeDTO.InputStatus status, @NotNull String message, @NotNull String price, NotificationDTO notificationBar) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(price, "price");
        return new ValidateDeclaredPriceResponseDTO(status, message, price, notificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateDeclaredPriceResponseDTO)) {
            return false;
        }
        ValidateDeclaredPriceResponseDTO validateDeclaredPriceResponseDTO = (ValidateDeclaredPriceResponseDTO) other;
        return this.status == validateDeclaredPriceResponseDTO.status && Intrinsics.d(this.message, validateDeclaredPriceResponseDTO.message) && Intrinsics.d(this.price, validateDeclaredPriceResponseDTO.price) && Intrinsics.d(this.notificationBar, validateDeclaredPriceResponseDTO.notificationBar);
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    @NotNull
    public final InputMoleculeDTO.InputStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.status.hashCode() * 31, 31, this.message), 31, this.price);
        NotificationDTO notificationDTO = this.notificationBar;
        return a11 + (notificationDTO == null ? 0 : notificationDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "ValidateDeclaredPriceResponseDTO(status=" + this.status + ", message=" + this.message + ", price=" + this.price + ", notificationBar=" + this.notificationBar + ")";
    }
}
