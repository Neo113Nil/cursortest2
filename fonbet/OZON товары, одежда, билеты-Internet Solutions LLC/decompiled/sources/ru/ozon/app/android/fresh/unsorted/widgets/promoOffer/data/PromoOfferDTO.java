package ru.ozon.app.android.fresh.unsorted.widgets.promoOffer.data;

import G.g;
import Nh.a;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jk\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/promoOffer/data/PromoOfferDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "backgroundColor", "", "radius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/util/Map;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PromoOfferDTO {
    public static final int $stable = 8;

    @NotNull
    private final String backgroundColor;
    private final ButtonV3DTO button;

    @NotNull
    private final ImageDTO image;

    @NotNull
    private final NotificationDTO notification;

    @NotNull
    private final CornerRadius radius;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public PromoOfferDTO(@NotNull TextDTO title, TextDTO textDTO, ButtonV3DTO buttonV3DTO, @NotNull NotificationDTO notification, @NotNull ImageDTO image, @NotNull String backgroundColor, @NotNull CornerRadius radius, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.title = title;
        this.subtitle = textDTO;
        this.button = buttonV3DTO;
        this.notification = notification;
        this.image = image;
        this.backgroundColor = backgroundColor;
        this.radius = radius;
        this.trackingInfo = map;
    }

    public static /* synthetic */ PromoOfferDTO copy$default(PromoOfferDTO promoOfferDTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, NotificationDTO notificationDTO, ImageDTO imageDTO, String str, CornerRadius cornerRadius, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = promoOfferDTO.title;
        }
        if ((i11 & 2) != 0) {
            textDTO2 = promoOfferDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = promoOfferDTO.button;
        }
        if ((i11 & 8) != 0) {
            notificationDTO = promoOfferDTO.notification;
        }
        if ((i11 & 16) != 0) {
            imageDTO = promoOfferDTO.image;
        }
        if ((i11 & 32) != 0) {
            str = promoOfferDTO.backgroundColor;
        }
        if ((i11 & 64) != 0) {
            cornerRadius = promoOfferDTO.radius;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = promoOfferDTO.trackingInfo;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        Map map2 = map;
        ImageDTO imageDTO2 = imageDTO;
        String str2 = str;
        return promoOfferDTO.copy(textDTO, textDTO2, buttonV3DTO, notificationDTO, imageDTO2, str2, cornerRadius2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final CornerRadius getRadius() {
        return this.radius;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    @NotNull
    public final PromoOfferDTO copy(@NotNull TextDTO title, TextDTO subtitle, ButtonV3DTO button, @NotNull NotificationDTO notification, @NotNull ImageDTO image, @NotNull String backgroundColor, @NotNull CornerRadius radius, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(radius, "radius");
        return new PromoOfferDTO(title, subtitle, button, notification, image, backgroundColor, radius, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoOfferDTO)) {
            return false;
        }
        PromoOfferDTO promoOfferDTO = (PromoOfferDTO) other;
        return Intrinsics.d(this.title, promoOfferDTO.title) && Intrinsics.d(this.subtitle, promoOfferDTO.subtitle) && Intrinsics.d(this.button, promoOfferDTO.button) && Intrinsics.d(this.notification, promoOfferDTO.notification) && Intrinsics.d(this.image, promoOfferDTO.image) && Intrinsics.d(this.backgroundColor, promoOfferDTO.backgroundColor) && this.radius == promoOfferDTO.radius && Intrinsics.d(this.trackingInfo, promoOfferDTO.trackingInfo);
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final NotificationDTO getNotification() {
        return this.notification;
    }

    @NotNull
    public final CornerRadius getRadius() {
        return this.radius;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        TextDTO textDTO = this.subtitle;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.button;
        int b11 = b.b(this.radius, g.a(a.b(this.image, (this.notification.hashCode() + ((hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31)) * 31, 31), 31, this.backgroundColor), 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        ButtonV3DTO buttonV3DTO = this.button;
        NotificationDTO notificationDTO = this.notification;
        ImageDTO imageDTO = this.image;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.radius;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder g10 = D3.g.g("PromoOfferDTO(title=", textDTO, ", subtitle=", textDTO2, ", button=");
        g10.append(buttonV3DTO);
        g10.append(", notification=");
        g10.append(notificationDTO);
        g10.append(", image=");
        g10.append(imageDTO);
        g10.append(", backgroundColor=");
        g10.append(str);
        g10.append(", radius=");
        g10.append(cornerRadius);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(")");
        return g10.toString();
    }
}
