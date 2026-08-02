package ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.data;

import Ef0.c;
import N3.C3660k;
import Ns.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0090\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0006HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/StatusBannerDTO;", "", "backgroundColor", "", "rootBackgroundColor", "containerVerticalPadding", "", "verticalPadding", "hasRoundCorners", "", "containerBackgroundColor", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "getBackgroundColor", "()Ljava/lang/String;", "getRootBackgroundColor", "getContainerVerticalPadding", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVerticalPadding", "getHasRoundCorners", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContainerBackgroundColor", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/data/StatusBannerDTO;", "equals", "other", "hashCode", "toString", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StatusBannerDTO {
    public static final int $stable = IconButtonV3DTO.$stable;
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final IconButtonV3DTO closeButton;
    private final String containerBackgroundColor;
    private final Integer containerVerticalPadding;
    private final TextDTO description;
    private final Boolean hasRoundCorners;
    private final ImageDTO image;
    private final String rootBackgroundColor;

    @NotNull
    private final TextDTO title;
    private final Integer verticalPadding;

    public StatusBannerDTO(String str, String str2, Integer num, Integer num2, Boolean bool, String str3, ImageDTO imageDTO, @NotNull TextDTO title, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.backgroundColor = str;
        this.rootBackgroundColor = str2;
        this.containerVerticalPadding = num;
        this.verticalPadding = num2;
        this.hasRoundCorners = bool;
        this.containerBackgroundColor = str3;
        this.image = imageDTO;
        this.title = title;
        this.description = textDTO;
        this.closeButton = iconButtonV3DTO;
        this.badge = badgeDTO;
    }

    public static /* synthetic */ StatusBannerDTO copy$default(StatusBannerDTO statusBannerDTO, String str, String str2, Integer num, Integer num2, Boolean bool, String str3, ImageDTO imageDTO, TextDTO textDTO, TextDTO textDTO2, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = statusBannerDTO.backgroundColor;
        }
        if ((i11 & 2) != 0) {
            str2 = statusBannerDTO.rootBackgroundColor;
        }
        if ((i11 & 4) != 0) {
            num = statusBannerDTO.containerVerticalPadding;
        }
        if ((i11 & 8) != 0) {
            num2 = statusBannerDTO.verticalPadding;
        }
        if ((i11 & 16) != 0) {
            bool = statusBannerDTO.hasRoundCorners;
        }
        if ((i11 & 32) != 0) {
            str3 = statusBannerDTO.containerBackgroundColor;
        }
        if ((i11 & 64) != 0) {
            imageDTO = statusBannerDTO.image;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            textDTO = statusBannerDTO.title;
        }
        if ((i11 & 256) != 0) {
            textDTO2 = statusBannerDTO.description;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            iconButtonV3DTO = statusBannerDTO.closeButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            badgeDTO = statusBannerDTO.badge;
        }
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        BadgeDTO badgeDTO2 = badgeDTO;
        TextDTO textDTO3 = textDTO;
        TextDTO textDTO4 = textDTO2;
        String str4 = str3;
        ImageDTO imageDTO2 = imageDTO;
        Boolean bool2 = bool;
        Integer num3 = num;
        return statusBannerDTO.copy(str, str2, num3, num2, bool2, str4, imageDTO2, textDTO3, textDTO4, iconButtonV3DTO2, badgeDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component10, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component11, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRootBackgroundColor() {
        return this.rootBackgroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getContainerVerticalPadding() {
        return this.containerVerticalPadding;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getVerticalPadding() {
        return this.verticalPadding;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getHasRoundCorners() {
        return this.hasRoundCorners;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContainerBackgroundColor() {
        return this.containerBackgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component9, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final StatusBannerDTO copy(String backgroundColor, String rootBackgroundColor, Integer containerVerticalPadding, Integer verticalPadding, Boolean hasRoundCorners, String containerBackgroundColor, ImageDTO image, @NotNull TextDTO title, TextDTO description, IconButtonV3DTO closeButton, BadgeDTO badge) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new StatusBannerDTO(backgroundColor, rootBackgroundColor, containerVerticalPadding, verticalPadding, hasRoundCorners, containerBackgroundColor, image, title, description, closeButton, badge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusBannerDTO)) {
            return false;
        }
        StatusBannerDTO statusBannerDTO = (StatusBannerDTO) other;
        return Intrinsics.d(this.backgroundColor, statusBannerDTO.backgroundColor) && Intrinsics.d(this.rootBackgroundColor, statusBannerDTO.rootBackgroundColor) && Intrinsics.d(this.containerVerticalPadding, statusBannerDTO.containerVerticalPadding) && Intrinsics.d(this.verticalPadding, statusBannerDTO.verticalPadding) && Intrinsics.d(this.hasRoundCorners, statusBannerDTO.hasRoundCorners) && Intrinsics.d(this.containerBackgroundColor, statusBannerDTO.containerBackgroundColor) && Intrinsics.d(this.image, statusBannerDTO.image) && Intrinsics.d(this.title, statusBannerDTO.title) && Intrinsics.d(this.description, statusBannerDTO.description) && Intrinsics.d(this.closeButton, statusBannerDTO.closeButton) && Intrinsics.d(this.badge, statusBannerDTO.badge);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final String getContainerBackgroundColor() {
        return this.containerBackgroundColor;
    }

    public final Integer getContainerVerticalPadding() {
        return this.containerVerticalPadding;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    public final Boolean getHasRoundCorners() {
        return this.hasRoundCorners;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final String getRootBackgroundColor() {
        return this.rootBackgroundColor;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Integer getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rootBackgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.containerVerticalPadding;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.verticalPadding;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.hasRoundCorners;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.containerBackgroundColor;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ImageDTO imageDTO = this.image;
        int a11 = b.a(this.title, (hashCode6 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31);
        TextDTO textDTO = this.description;
        int hashCode7 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode8 = (hashCode7 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode8 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.backgroundColor;
        String str2 = this.rootBackgroundColor;
        Integer num = this.containerVerticalPadding;
        Integer num2 = this.verticalPadding;
        Boolean bool = this.hasRoundCorners;
        String str3 = this.containerBackgroundColor;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.description;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        BadgeDTO badgeDTO = this.badge;
        StringBuilder d11 = C3660k.d("StatusBannerDTO(backgroundColor=", str, ", rootBackgroundColor=", str2, ", containerVerticalPadding=");
        c.e(d11, num, ", verticalPadding=", num2, ", hasRoundCorners=");
        HY.b.c(bool, ", containerBackgroundColor=", str3, ", image=", d11);
        d11.append(imageDTO);
        d11.append(", title=");
        d11.append(textDTO);
        d11.append(", description=");
        d11.append(textDTO2);
        d11.append(", closeButton=");
        d11.append(iconButtonV3DTO);
        d11.append(", badge=");
        return AZ.c.b(d11, badgeDTO, ")");
    }
}
