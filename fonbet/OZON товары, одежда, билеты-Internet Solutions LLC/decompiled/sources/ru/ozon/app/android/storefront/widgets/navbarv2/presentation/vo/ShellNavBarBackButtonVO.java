package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo;

import G.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navbarv2.data.DynamicOnScrollColors;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "backButtonDTO", "", "", "floorsOrder", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;", "dynamicOnScrollColors", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;)V", "copy", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/util/List;Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;)Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/ShellNavBarBackButtonVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBackButtonDTO", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Ljava/util/List;", "getFloorsOrder", "()Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;", "getDynamicOnScrollColors", "()Lru/ozon/app/android/storefront/widgets/navbarv2/data/DynamicOnScrollColors;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ShellNavBarBackButtonVO {

    @NotNull
    private final IconButtonV3DTO backButtonDTO;
    private final DynamicOnScrollColors dynamicOnScrollColors;

    @NotNull
    private final List<String> floorsOrder;

    public ShellNavBarBackButtonVO(@NotNull IconButtonV3DTO backButtonDTO, @NotNull List<String> floorsOrder, DynamicOnScrollColors dynamicOnScrollColors) {
        Intrinsics.checkNotNullParameter(backButtonDTO, "backButtonDTO");
        Intrinsics.checkNotNullParameter(floorsOrder, "floorsOrder");
        this.backButtonDTO = backButtonDTO;
        this.floorsOrder = floorsOrder;
        this.dynamicOnScrollColors = dynamicOnScrollColors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShellNavBarBackButtonVO copy$default(ShellNavBarBackButtonVO shellNavBarBackButtonVO, IconButtonV3DTO iconButtonV3DTO, List list, DynamicOnScrollColors dynamicOnScrollColors, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iconButtonV3DTO = shellNavBarBackButtonVO.backButtonDTO;
        }
        if ((i11 & 2) != 0) {
            list = shellNavBarBackButtonVO.floorsOrder;
        }
        if ((i11 & 4) != 0) {
            dynamicOnScrollColors = shellNavBarBackButtonVO.dynamicOnScrollColors;
        }
        return shellNavBarBackButtonVO.copy(iconButtonV3DTO, list, dynamicOnScrollColors);
    }

    @NotNull
    public final ShellNavBarBackButtonVO copy(@NotNull IconButtonV3DTO backButtonDTO, @NotNull List<String> floorsOrder, DynamicOnScrollColors dynamicOnScrollColors) {
        Intrinsics.checkNotNullParameter(backButtonDTO, "backButtonDTO");
        Intrinsics.checkNotNullParameter(floorsOrder, "floorsOrder");
        return new ShellNavBarBackButtonVO(backButtonDTO, floorsOrder, dynamicOnScrollColors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShellNavBarBackButtonVO)) {
            return false;
        }
        ShellNavBarBackButtonVO shellNavBarBackButtonVO = (ShellNavBarBackButtonVO) other;
        return Intrinsics.d(this.backButtonDTO, shellNavBarBackButtonVO.backButtonDTO) && Intrinsics.d(this.floorsOrder, shellNavBarBackButtonVO.floorsOrder) && Intrinsics.d(this.dynamicOnScrollColors, shellNavBarBackButtonVO.dynamicOnScrollColors);
    }

    @NotNull
    public final IconButtonV3DTO getBackButtonDTO() {
        return this.backButtonDTO;
    }

    public final DynamicOnScrollColors getDynamicOnScrollColors() {
        return this.dynamicOnScrollColors;
    }

    @NotNull
    public final List<String> getFloorsOrder() {
        return this.floorsOrder;
    }

    public int hashCode() {
        int b11 = g.b(this.backButtonDTO.hashCode() * 31, 31, this.floorsOrder);
        DynamicOnScrollColors dynamicOnScrollColors = this.dynamicOnScrollColors;
        return b11 + (dynamicOnScrollColors == null ? 0 : dynamicOnScrollColors.hashCode());
    }

    @NotNull
    public String toString() {
        return "ShellNavBarBackButtonVO(backButtonDTO=" + this.backButtonDTO + ", floorsOrder=" + this.floorsOrder + ", dynamicOnScrollColors=" + this.dynamicOnScrollColors + ")";
    }
}
