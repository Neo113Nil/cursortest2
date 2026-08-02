package ru.ozon.app.android.commonwidgets.widgets.iconButton.presentation;

import GR.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.core.DynamicOnScrollColors;
import ru.ozon.app.android.commonwidgets.widgets.iconButton.core.PaddingOption;
import ru.ozon.app.android.storefront.navBar.v2.NavbarIconVO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/iconButton/presentation/IconButtonWidgetVO;", "Lru/ozon/app/android/storefront/navBar/v2/NavbarIconVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/PaddingOption;", "options", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/DynamicOnScrollColors;", "dynamicOnScrollColors", "", "hasDynamicColors", "<init>", "(JLru/ozon/app/android/commonwidgets/widgets/iconButton/core/PaddingOption;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/DynamicOnScrollColors;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/PaddingOption;", "getOptions", "()Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/PaddingOption;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/DynamicOnScrollColors;", "getDynamicOnScrollColors", "()Lru/ozon/app/android/commonwidgets/widgets/iconButton/core/DynamicOnScrollColors;", "Z", "getHasDynamicColors", "()Z", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IconButtonWidgetVO implements NavbarIconVO, c {
    private final DynamicOnScrollColors dynamicOnScrollColors;
    private final boolean hasDynamicColors;

    @NotNull
    private final IconButtonV3DTO iconButton;
    private final long id;
    private final PaddingOption options;

    public IconButtonWidgetVO(long j11, PaddingOption paddingOption, @NotNull IconButtonV3DTO iconButton, DynamicOnScrollColors dynamicOnScrollColors, boolean z11) {
        Intrinsics.checkNotNullParameter(iconButton, "iconButton");
        this.id = j11;
        this.options = paddingOption;
        this.iconButton = iconButton;
        this.dynamicOnScrollColors = dynamicOnScrollColors;
        this.hasDynamicColors = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconButtonWidgetVO)) {
            return false;
        }
        IconButtonWidgetVO iconButtonWidgetVO = (IconButtonWidgetVO) other;
        return this.id == iconButtonWidgetVO.id && Intrinsics.d(this.options, iconButtonWidgetVO.options) && Intrinsics.d(this.iconButton, iconButtonWidgetVO.iconButton) && Intrinsics.d(this.dynamicOnScrollColors, iconButtonWidgetVO.dynamicOnScrollColors) && this.hasDynamicColors == iconButtonWidgetVO.hasDynamicColors;
    }

    public final DynamicOnScrollColors getDynamicOnScrollColors() {
        return this.dynamicOnScrollColors;
    }

    public final boolean getHasDynamicColors() {
        return this.hasDynamicColors;
    }

    @NotNull
    public final IconButtonV3DTO getIconButton() {
        return this.iconButton;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
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
        DynamicOnScrollColors dynamicOnScrollColors = this.dynamicOnScrollColors;
        return Boolean.hashCode(this.hasDynamicColors) + ((c11 + (dynamicOnScrollColors != null ? dynamicOnScrollColors.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        PaddingOption paddingOption = this.options;
        IconButtonV3DTO iconButtonV3DTO = this.iconButton;
        DynamicOnScrollColors dynamicOnScrollColors = this.dynamicOnScrollColors;
        boolean z11 = this.hasDynamicColors;
        StringBuilder sb2 = new StringBuilder("IconButtonWidgetVO(id=");
        sb2.append(j11);
        sb2.append(", options=");
        sb2.append(paddingOption);
        sb2.append(", iconButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", dynamicOnScrollColors=");
        sb2.append(dynamicOnScrollColors);
        return Bi.b.f(sb2, ", hasDynamicColors=", z11, ")");
    }
}
