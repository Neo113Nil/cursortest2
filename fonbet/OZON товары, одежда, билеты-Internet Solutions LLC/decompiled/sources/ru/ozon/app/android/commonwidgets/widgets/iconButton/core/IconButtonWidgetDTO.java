package ru.ozon.app.android.commonwidgets.widgets.iconButton.core;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/IconButtonWidgetDTO;", "", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "options", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/PaddingOption;", "dynamicOnScrollColors", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/DynamicOnScrollColors;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/PaddingOption;Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/DynamicOnScrollColors;)V", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getOptions", "()Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/PaddingOption;", "getDynamicOnScrollColors", "()Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/DynamicOnScrollColors;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IconButtonWidgetDTO {
    private final DynamicOnScrollColors dynamicOnScrollColors;

    @NotNull
    private final IconButtonV3DTO iconButton;
    private final PaddingOption options;

    public IconButtonWidgetDTO(@NotNull IconButtonV3DTO iconButton, PaddingOption paddingOption, DynamicOnScrollColors dynamicOnScrollColors) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        this.iconButton = iconButton;
        this.options = paddingOption;
        this.dynamicOnScrollColors = dynamicOnScrollColors;
    }

    public static /* synthetic */ IconButtonWidgetDTO copy$default(IconButtonWidgetDTO iconButtonWidgetDTO, IconButtonV3DTO iconButtonV3DTO, PaddingOption paddingOption, DynamicOnScrollColors dynamicOnScrollColors, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = iconButtonWidgetDTO.iconButton;
        }
        if ((i11 & 2) != 0) {
            paddingOption = iconButtonWidgetDTO.options;
        }
        if ((i11 & 4) != 0) {
            dynamicOnScrollColors = iconButtonWidgetDTO.dynamicOnScrollColors;
        }
        return iconButtonWidgetDTO.copy(iconButtonV3DTO, paddingOption, dynamicOnScrollColors);
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
    public final DynamicOnScrollColors getDynamicOnScrollColors() {
        return this.dynamicOnScrollColors;
    }

    @NotNull
    public final IconButtonWidgetDTO copy(@NotNull IconButtonV3DTO iconButton, PaddingOption options, DynamicOnScrollColors dynamicOnScrollColors) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        return new IconButtonWidgetDTO(iconButton, options, dynamicOnScrollColors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonWidgetDTO)) {
            return false;
        }
        IconButtonWidgetDTO iconButtonWidgetDTO = (IconButtonWidgetDTO) other;
        return Intrinsics.d(this.iconButton, iconButtonWidgetDTO.iconButton) && Intrinsics.d(this.options, iconButtonWidgetDTO.options) && Intrinsics.d(this.dynamicOnScrollColors, iconButtonWidgetDTO.dynamicOnScrollColors);
    }

    public final DynamicOnScrollColors getDynamicOnScrollColors() {
        return this.dynamicOnScrollColors;
    }

    @NotNull
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    public final PaddingOption getOptions() {
        return this.options;
    }

    public int hashCode() {
        int hashCode = this.iconButton.hashCode() * 31;
        PaddingOption paddingOption = this.options;
        int hashCode2 = (hashCode + (paddingOption == null ? 0 : paddingOption.hashCode())) * 31;
        DynamicOnScrollColors dynamicOnScrollColors = this.dynamicOnScrollColors;
        return hashCode2 + (dynamicOnScrollColors != null ? dynamicOnScrollColors.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IconButtonWidgetDTO(iconButton=" + this.iconButton + ", options=" + this.options + ", dynamicOnScrollColors=" + this.dynamicOnScrollColors + ")";
    }
}
