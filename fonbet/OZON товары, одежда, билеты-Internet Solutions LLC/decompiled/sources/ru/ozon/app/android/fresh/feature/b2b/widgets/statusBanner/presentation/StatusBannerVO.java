package ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.presentation;

import Ak.C2436a;
import D3.g;
import Nh.a;
import Ns.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B{\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b&\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b'\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b+\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b5\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "backgroundColor", "containerBackgroundColor", "rootBackgroundColor", "", "containerVerticalPadding", "verticalPadding", "", "hasRoundCorners", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "closeButton", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getBackgroundColor", "getContainerBackgroundColor", "getRootBackgroundColor", "Ljava/lang/Integer;", "getContainerVerticalPadding", "()Ljava/lang/Integer;", "getVerticalPadding", "Ljava/lang/Boolean;", "getHasRoundCorners", "()Ljava/lang/Boolean;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class StatusBannerVO implements c {
    public static final int $stable = IconButtonV3DTO.$stable;
    private final String backgroundColor;
    private final BadgeDTO badge;
    private final IconButtonV3DTO closeButton;
    private final String containerBackgroundColor;
    private final Integer containerVerticalPadding;
    private final TextDTO description;
    private final Boolean hasRoundCorners;
    private final long id;
    private final ImageDTO image;
    private final String rootBackgroundColor;

    @NotNull
    private final TextDTO title;
    private final Integer verticalPadding;

    public StatusBannerVO(long j11, String str, String str2, String str3, Integer num, Integer num2, Boolean bool, ImageDTO imageDTO, @NotNull TextDTO title, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = j11;
        this.backgroundColor = str;
        this.containerBackgroundColor = str2;
        this.rootBackgroundColor = str3;
        this.containerVerticalPadding = num;
        this.verticalPadding = num2;
        this.hasRoundCorners = bool;
        this.image = imageDTO;
        this.title = title;
        this.description = textDTO;
        this.closeButton = iconButtonV3DTO;
        this.badge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusBannerVO)) {
            return false;
        }
        StatusBannerVO statusBannerVO = (StatusBannerVO) other;
        return this.id == statusBannerVO.id && Intrinsics.d(this.backgroundColor, statusBannerVO.backgroundColor) && Intrinsics.d(this.containerBackgroundColor, statusBannerVO.containerBackgroundColor) && Intrinsics.d(this.rootBackgroundColor, statusBannerVO.rootBackgroundColor) && Intrinsics.d(this.containerVerticalPadding, statusBannerVO.containerVerticalPadding) && Intrinsics.d(this.verticalPadding, statusBannerVO.verticalPadding) && Intrinsics.d(this.hasRoundCorners, statusBannerVO.hasRoundCorners) && Intrinsics.d(this.image, statusBannerVO.image) && Intrinsics.d(this.title, statusBannerVO.title) && Intrinsics.d(this.description, statusBannerVO.description) && Intrinsics.d(this.closeButton, statusBannerVO.closeButton) && Intrinsics.d(this.badge, statusBannerVO.badge);
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

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final String getRootBackgroundColor() {
        return this.rootBackgroundColor;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Integer getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.containerBackgroundColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rootBackgroundColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.containerVerticalPadding;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.verticalPadding;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.hasRoundCorners;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        ImageDTO imageDTO = this.image;
        int a11 = b.a(this.title, (hashCode7 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31, 31);
        TextDTO textDTO = this.description;
        int hashCode8 = (a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode9 = (hashCode8 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        return hashCode9 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.backgroundColor;
        String str2 = this.containerBackgroundColor;
        String str3 = this.rootBackgroundColor;
        Integer num = this.containerVerticalPadding;
        Integer num2 = this.verticalPadding;
        Boolean bool = this.hasRoundCorners;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.description;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        BadgeDTO badgeDTO = this.badge;
        StringBuilder c11 = C2436a.c(j11, "StatusBannerVO(id=", ", backgroundColor=", str);
        a.h(c11, ", containerBackgroundColor=", str2, ", rootBackgroundColor=", str3);
        c11.append(", containerVerticalPadding=");
        c11.append(num);
        c11.append(", verticalPadding=");
        c11.append(num2);
        c11.append(", hasRoundCorners=");
        c11.append(bool);
        c11.append(", image=");
        c11.append(imageDTO);
        g.i(", title=", ", description=", c11, textDTO, textDTO2);
        c11.append(", closeButton=");
        c11.append(iconButtonV3DTO);
        c11.append(", badge=");
        c11.append(badgeDTO);
        c11.append(")");
        return c11.toString();
    }
}
