package ru.ozon.app.android.storefront.widgets.profileIconButton.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/data/ProfileIconButtonDTO;", "", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "options", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/PaddingOption;", "indicator", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicatorKey", "", "tooltip", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/storefront/widgets/profileIconButton/data/PaddingOption;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;)V", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getOptions", "()Lru/ozon/app/android/storefront/widgets/profileIconButton/data/PaddingOption;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIndicatorKey", "()Ljava/lang/String;", "getTooltip", "()Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProfileIconButtonDTO {
    public static final int $stable = TooltipDTO.$stable | IconButtonV3DTO.$stable;

    @NotNull
    private final IconButtonV3DTO iconButton;
    private final IndicatorDTO indicator;
    private final String indicatorKey;
    private final PaddingOption options;
    private final IconTooltipDto tooltip;

    public ProfileIconButtonDTO(@NotNull IconButtonV3DTO iconButton, PaddingOption paddingOption, IndicatorDTO indicatorDTO, String str, IconTooltipDto iconTooltipDto) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        this.iconButton = iconButton;
        this.options = paddingOption;
        this.indicator = indicatorDTO;
        this.indicatorKey = str;
        this.tooltip = iconTooltipDto;
    }

    public static /* synthetic */ ProfileIconButtonDTO copy$default(ProfileIconButtonDTO profileIconButtonDTO, IconButtonV3DTO iconButtonV3DTO, PaddingOption paddingOption, IndicatorDTO indicatorDTO, String str, IconTooltipDto iconTooltipDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = profileIconButtonDTO.iconButton;
        }
        if ((i11 & 2) != 0) {
            paddingOption = profileIconButtonDTO.options;
        }
        if ((i11 & 4) != 0) {
            indicatorDTO = profileIconButtonDTO.indicator;
        }
        if ((i11 & 8) != 0) {
            str = profileIconButtonDTO.indicatorKey;
        }
        if ((i11 & 16) != 0) {
            iconTooltipDto = profileIconButtonDTO.tooltip;
        }
        IconTooltipDto iconTooltipDto2 = iconTooltipDto;
        IndicatorDTO indicatorDTO2 = indicatorDTO;
        return profileIconButtonDTO.copy(iconButtonV3DTO, paddingOption, indicatorDTO2, str, iconTooltipDto2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    /* renamed from: component2, reason: from getter */
    public final PaddingOption getOptions() {
        return this.options;
    }

    /* renamed from: component3, reason: from getter */
    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIndicatorKey() {
        return this.indicatorKey;
    }

    /* renamed from: component5, reason: from getter */
    public final IconTooltipDto getTooltip() {
        return this.tooltip;
    }

    @NotNull
    public final ProfileIconButtonDTO copy(@NotNull IconButtonV3DTO iconButton, PaddingOption options, IndicatorDTO indicator, String indicatorKey, IconTooltipDto tooltip) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        return new ProfileIconButtonDTO(iconButton, options, indicator, indicatorKey, tooltip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileIconButtonDTO)) {
            return false;
        }
        ProfileIconButtonDTO profileIconButtonDTO = (ProfileIconButtonDTO) other;
        return Intrinsics.d(this.iconButton, profileIconButtonDTO.iconButton) && Intrinsics.d(this.options, profileIconButtonDTO.options) && Intrinsics.d(this.indicator, profileIconButtonDTO.indicator) && Intrinsics.d(this.indicatorKey, profileIconButtonDTO.indicatorKey) && Intrinsics.d(this.tooltip, profileIconButtonDTO.tooltip);
    }

    @NotNull
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    public final IndicatorDTO getIndicator() {
        return this.indicator;
    }

    public final String getIndicatorKey() {
        return this.indicatorKey;
    }

    public final PaddingOption getOptions() {
        return this.options;
    }

    public final IconTooltipDto getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int hashCode = this.iconButton.hashCode() * 31;
        PaddingOption paddingOption = this.options;
        int hashCode2 = (hashCode + (paddingOption == null ? 0 : paddingOption.hashCode())) * 31;
        IndicatorDTO indicatorDTO = this.indicator;
        int hashCode3 = (hashCode2 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
        String str = this.indicatorKey;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        IconTooltipDto iconTooltipDto = this.tooltip;
        return hashCode4 + (iconTooltipDto != null ? iconTooltipDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProfileIconButtonDTO(iconButton=" + this.iconButton + ", options=" + this.options + ", indicator=" + this.indicator + ", indicatorKey=" + this.indicatorKey + ", tooltip=" + this.tooltip + ")";
    }
}
