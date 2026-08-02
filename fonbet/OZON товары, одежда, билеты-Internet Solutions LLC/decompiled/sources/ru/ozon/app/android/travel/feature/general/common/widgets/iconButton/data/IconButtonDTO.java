package ru.ozon.app.android.travel.feature.general.common.widgets.iconButton.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/iconButton/data/IconButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "onboarding", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getOnboarding", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class IconButtonDTO {
    public static final int $stable = IconButtonV3DTO.$stable;

    @NotNull
    private final IconButtonV3DTO button;
    private final OnBoardingDTO onboarding;

    public IconButtonDTO(@NotNull IconButtonV3DTO button, OnBoardingDTO onBoardingDTO) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.onboarding = onBoardingDTO;
    }

    public static /* synthetic */ IconButtonDTO copy$default(IconButtonDTO iconButtonDTO, IconButtonV3DTO iconButtonV3DTO, OnBoardingDTO onBoardingDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = iconButtonDTO.button;
        }
        if ((i11 & 2) != 0) {
            onBoardingDTO = iconButtonDTO.onboarding;
        }
        return iconButtonDTO.copy(iconButtonV3DTO, onBoardingDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IconButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final IconButtonDTO copy(@NotNull IconButtonV3DTO button, OnBoardingDTO onboarding) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new IconButtonDTO(button, onboarding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonDTO)) {
            return false;
        }
        IconButtonDTO iconButtonDTO = (IconButtonDTO) other;
        return Intrinsics.d(this.button, iconButtonDTO.button) && Intrinsics.d(this.onboarding, iconButtonDTO.onboarding);
    }

    @NotNull
    public final IconButtonV3DTO getButton() {
        return this.button;
    }

    public final OnBoardingDTO getOnboarding() {
        return this.onboarding;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        OnBoardingDTO onBoardingDTO = this.onboarding;
        return hashCode + (onBoardingDTO == null ? 0 : onBoardingDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "IconButtonDTO(button=" + this.button + ", onboarding=" + this.onboarding + ")";
    }
}
