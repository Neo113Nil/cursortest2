package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation;

import GR.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.v2.NavbarIconVO;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.IconTooltipDto;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.PaddingOption;
import ru.ozon.uni.atoms.data.common.TooltipDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J^\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b\u0011\u00101¨\u00062"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;", "Lru/ozon/app/android/storefront/navBar/v2/NavbarIconVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/PaddingOption;", "options", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "indicator", "", "indicatorKey", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;", "iconTooltip", "", "isTooltipClosed", "<init>", "(JLru/ozon/app/android/storefront/widgets/profileIconButton/data/PaddingOption;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;Z)V", "copy", "(JLru/ozon/app/android/storefront/widgets/profileIconButton/data/PaddingOption;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;Ljava/lang/String;Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;Z)Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/PaddingOption;", "getOptions", "()Lru/ozon/app/android/storefront/widgets/profileIconButton/data/PaddingOption;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "getIndicator", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "Ljava/lang/String;", "getIndicatorKey", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;", "getIconTooltip", "()Lru/ozon/app/android/storefront/widgets/profileIconButton/data/IconTooltipDto;", "Z", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProfileIconButtonVO implements NavbarIconVO, c {
    public static final int $stable = TooltipDTO.$stable | IconButtonV3DTO.$stable;

    @NotNull
    private final IconButtonV3DTO iconButton;
    private final IconTooltipDto iconTooltip;
    private final long id;
    private final IndicatorDTO indicator;
    private final String indicatorKey;
    private final boolean isTooltipClosed;
    private final PaddingOption options;

    public ProfileIconButtonVO(long j11, PaddingOption paddingOption, @NotNull IconButtonV3DTO iconButton, IndicatorDTO indicatorDTO, String str, IconTooltipDto iconTooltipDto, boolean z11) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        this.id = j11;
        this.options = paddingOption;
        this.iconButton = iconButton;
        this.indicator = indicatorDTO;
        this.indicatorKey = str;
        this.iconTooltip = iconTooltipDto;
        this.isTooltipClosed = z11;
    }

    public static /* synthetic */ ProfileIconButtonVO copy$default(ProfileIconButtonVO profileIconButtonVO, long j11, PaddingOption paddingOption, IconButtonV3DTO iconButtonV3DTO, IndicatorDTO indicatorDTO, String str, IconTooltipDto iconTooltipDto, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = profileIconButtonVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            paddingOption = profileIconButtonVO.options;
        }
        PaddingOption paddingOption2 = paddingOption;
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = profileIconButtonVO.iconButton;
        }
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        if ((i11 & 8) != 0) {
            indicatorDTO = profileIconButtonVO.indicator;
        }
        IndicatorDTO indicatorDTO2 = indicatorDTO;
        if ((i11 & 16) != 0) {
            str = profileIconButtonVO.indicatorKey;
        }
        return profileIconButtonVO.copy(j12, paddingOption2, iconButtonV3DTO2, indicatorDTO2, str, (i11 & 32) != 0 ? profileIconButtonVO.iconTooltip : iconTooltipDto, (i11 & 64) != 0 ? profileIconButtonVO.isTooltipClosed : z11);
    }

    @NotNull
    public final ProfileIconButtonVO copy(long id2, PaddingOption options, @NotNull IconButtonV3DTO iconButton, IndicatorDTO indicator, String indicatorKey, IconTooltipDto iconTooltip, boolean isTooltipClosed) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        return new ProfileIconButtonVO(id2, options, iconButton, indicator, indicatorKey, iconTooltip, isTooltipClosed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileIconButtonVO)) {
            return false;
        }
        ProfileIconButtonVO profileIconButtonVO = (ProfileIconButtonVO) other;
        return this.id == profileIconButtonVO.id && Intrinsics.d(this.options, profileIconButtonVO.options) && Intrinsics.d(this.iconButton, profileIconButtonVO.iconButton) && Intrinsics.d(this.indicator, profileIconButtonVO.indicator) && Intrinsics.d(this.indicatorKey, profileIconButtonVO.indicatorKey) && Intrinsics.d(this.iconTooltip, profileIconButtonVO.iconTooltip) && this.isTooltipClosed == profileIconButtonVO.isTooltipClosed;
    }

    @NotNull
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    public final IconTooltipDto getIconTooltip() {
        return this.iconTooltip;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        PaddingOption paddingOption = this.options;
        int c11 = b.c(this.iconButton, (hashCode + (paddingOption == null ? 0 : paddingOption.hashCode())) * 31, 31);
        IndicatorDTO indicatorDTO = this.indicator;
        int hashCode2 = (c11 + (indicatorDTO == null ? 0 : indicatorDTO.hashCode())) * 31;
        String str = this.indicatorKey;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        IconTooltipDto iconTooltipDto = this.iconTooltip;
        return Boolean.hashCode(this.isTooltipClosed) + ((hashCode3 + (iconTooltipDto != null ? iconTooltipDto.hashCode() : 0)) * 31);
    }

    /* renamed from: isTooltipClosed, reason: from getter */
    public final boolean getIsTooltipClosed() {
        return this.isTooltipClosed;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        PaddingOption paddingOption = this.options;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        IndicatorDTO indicatorDTO = this.indicator;
        String str = this.indicatorKey;
        IconTooltipDto iconTooltipDto = this.iconTooltip;
        boolean z11 = this.isTooltipClosed;
        StringBuilder sb2 = new StringBuilder("ProfileIconButtonVO(id=");
        sb2.append(j11);
        sb2.append(", options=");
        sb2.append(paddingOption);
        sb2.append(", iconButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", indicator=");
        sb2.append(indicatorDTO);
        sb2.append(", indicatorKey=");
        sb2.append(str);
        sb2.append(", iconTooltip=");
        sb2.append(iconTooltipDto);
        return Bi.b.f(sb2, ", isTooltipClosed=", z11, ")");
    }
}
