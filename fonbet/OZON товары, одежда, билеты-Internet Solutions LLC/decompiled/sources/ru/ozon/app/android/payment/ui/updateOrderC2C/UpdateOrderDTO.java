package ru.ozon.app.android.payment.ui.updateOrderC2C;

import C.o0;
import G.g;
import N3.C3660k;
import Ul.C4070a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDTO;", "", "redirectLink", "", "error", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDTO$ErrorDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDTO$ErrorDTO;)V", "getRedirectLink", "()Ljava/lang/String;", "getError", "()Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDTO$ErrorDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ErrorDTO", "ErrorActionDTO", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UpdateOrderDTO {
    private final ErrorDTO error;
    private final String redirectLink;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDTO$ErrorActionDTO;", "", "type", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getTitle", "getLink", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorActionDTO {
        private final String link;

        @NotNull
        private final String title;
        private final String type;

        public ErrorActionDTO(String str, @NotNull String title, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.type = str;
            this.title = title;
            this.link = str2;
        }

        public static /* synthetic */ ErrorActionDTO copy$default(ErrorActionDTO errorActionDTO, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = errorActionDTO.type;
            }
            if ((i11 & 2) != 0) {
                str2 = errorActionDTO.title;
            }
            if ((i11 & 4) != 0) {
                str3 = errorActionDTO.link;
            }
            return errorActionDTO.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final ErrorActionDTO copy(String type, @NotNull String title, String link) {
            Intrinsics.checkNotNullParameter(title, "title");
            return new ErrorActionDTO(type, title, link);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorActionDTO)) {
                return false;
            }
            ErrorActionDTO errorActionDTO = (ErrorActionDTO) other;
            return Intrinsics.d(this.type, errorActionDTO.type) && Intrinsics.d(this.title, errorActionDTO.title) && Intrinsics.d(this.link, errorActionDTO.link);
        }

        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int a11 = g.a((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
            String str2 = this.link;
            return a11 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.type;
            String str2 = this.title;
            return o0.c(C3660k.d("ErrorActionDTO(type=", str, ", title=", str2, ", link="), this.link, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J[\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDTO$ErrorDTO;", "", "message", "", "lifetime", "action", "Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDTO$ErrorActionDTO;", "image", "imageTintColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDTO$ErrorActionDTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getMessage", "()Ljava/lang/String;", "getLifetime", "getAction", "()Lru/ozon/app/android/payment/ui/updateOrderC2C/UpdateOrderDTO$ErrorActionDTO;", "getImage", "getImageTintColor", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "payment_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorDTO {
        private final ErrorActionDTO action;
        private final String image;
        private final String imageTintColor;
        private final String lifetime;

        @NotNull
        private final String message;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public ErrorDTO(@NotNull String message, String str, ErrorActionDTO errorActionDTO, String str2, String str3, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.lifetime = str;
            this.action = errorActionDTO;
            this.image = str2;
            this.imageTintColor = str3;
            this.trackingInfo = map;
        }

        public static /* synthetic */ ErrorDTO copy$default(ErrorDTO errorDTO, String str, String str2, ErrorActionDTO errorActionDTO, String str3, String str4, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = errorDTO.message;
            }
            if ((i11 & 2) != 0) {
                str2 = errorDTO.lifetime;
            }
            if ((i11 & 4) != 0) {
                errorActionDTO = errorDTO.action;
            }
            if ((i11 & 8) != 0) {
                str3 = errorDTO.image;
            }
            if ((i11 & 16) != 0) {
                str4 = errorDTO.imageTintColor;
            }
            if ((i11 & 32) != 0) {
                map = errorDTO.trackingInfo;
            }
            String str5 = str4;
            Map map2 = map;
            return errorDTO.copy(str, str2, errorActionDTO, str3, str5, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLifetime() {
            return this.lifetime;
        }

        /* renamed from: component3, reason: from getter */
        public final ErrorActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component5, reason: from getter */
        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final ErrorDTO copy(@NotNull String message, String lifetime, ErrorActionDTO action, String image, String imageTintColor, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ErrorDTO(message, lifetime, action, image, imageTintColor, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorDTO)) {
                return false;
            }
            ErrorDTO errorDTO = (ErrorDTO) other;
            return Intrinsics.d(this.message, errorDTO.message) && Intrinsics.d(this.lifetime, errorDTO.lifetime) && Intrinsics.d(this.action, errorDTO.action) && Intrinsics.d(this.image, errorDTO.image) && Intrinsics.d(this.imageTintColor, errorDTO.imageTintColor) && Intrinsics.d(this.trackingInfo, errorDTO.trackingInfo);
        }

        public final ErrorActionDTO getAction() {
            return this.action;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getImageTintColor() {
            return this.imageTintColor;
        }

        public final String getLifetime() {
            return this.lifetime;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            String str = this.lifetime;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ErrorActionDTO errorActionDTO = this.action;
            int hashCode3 = (hashCode2 + (errorActionDTO == null ? 0 : errorActionDTO.hashCode())) * 31;
            String str2 = this.image;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.imageTintColor;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode5 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.message;
            String str2 = this.lifetime;
            ErrorActionDTO errorActionDTO = this.action;
            String str3 = this.image;
            String str4 = this.imageTintColor;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("ErrorDTO(message=", str, ", lifetime=", str2, ", action=");
            d11.append(errorActionDTO);
            d11.append(", image=");
            d11.append(str3);
            d11.append(", imageTintColor=");
            return C4070a.a(d11, str4, ", trackingInfo=", map, ")");
        }
    }

    public UpdateOrderDTO(String str, ErrorDTO errorDTO) {
        this.redirectLink = str;
        this.error = errorDTO;
    }

    public static /* synthetic */ UpdateOrderDTO copy$default(UpdateOrderDTO updateOrderDTO, String str, ErrorDTO errorDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = updateOrderDTO.redirectLink;
        }
        if ((i11 & 2) != 0) {
            errorDTO = updateOrderDTO.error;
        }
        return updateOrderDTO.copy(str, errorDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRedirectLink() {
        return this.redirectLink;
    }

    /* renamed from: component2, reason: from getter */
    public final ErrorDTO getError() {
        return this.error;
    }

    @NotNull
    public final UpdateOrderDTO copy(String redirectLink, ErrorDTO error) {
        return new UpdateOrderDTO(redirectLink, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateOrderDTO)) {
            return false;
        }
        UpdateOrderDTO updateOrderDTO = (UpdateOrderDTO) other;
        return Intrinsics.d(this.redirectLink, updateOrderDTO.redirectLink) && Intrinsics.d(this.error, updateOrderDTO.error);
    }

    public final ErrorDTO getError() {
        return this.error;
    }

    public final String getRedirectLink() {
        return this.redirectLink;
    }

    public int hashCode() {
        String str = this.redirectLink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ErrorDTO errorDTO = this.error;
        return hashCode + (errorDTO != null ? errorDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UpdateOrderDTO(redirectLink=" + this.redirectLink + ", error=" + this.error + ")";
    }
}
