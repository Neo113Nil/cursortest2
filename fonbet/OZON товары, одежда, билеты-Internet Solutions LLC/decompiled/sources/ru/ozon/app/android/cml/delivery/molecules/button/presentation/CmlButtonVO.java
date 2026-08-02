package ru.ozon.app.android.cml.delivery.molecules.button.presentation;

import GR.b;
import Lh.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b'\u0010$¨\u0006("}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/button/presentation/CmlButtonVO;", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "", "topBorderColor", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "topCornerRadius", "Lru/ozon/uni/atoms/data/common/Paddings;", "topPadding", "rightPadding", "bottomPadding", "leftPadding", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/lang/String;", "getTopBorderColor", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTopCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Lru/ozon/uni/atoms/data/common/Paddings;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "getBottomPadding", "getLeftPadding", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CmlButtonVO {
    private final String backgroundColor;

    @NotNull
    private final Paddings bottomPadding;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final Paddings leftPadding;

    @NotNull
    private final Paddings rightPadding;
    private final String topBorderColor;

    @NotNull
    private final CornerRadius topCornerRadius;

    @NotNull
    private final Paddings topPadding;

    public CmlButtonVO(@NotNull ButtonV3DTO button, String str, String str2, @NotNull CornerRadius topCornerRadius, @NotNull Paddings topPadding, @NotNull Paddings rightPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        this.button = button;
        this.topBorderColor = str;
        this.backgroundColor = str2;
        this.topCornerRadius = topCornerRadius;
        this.topPadding = topPadding;
        this.rightPadding = rightPadding;
        this.bottomPadding = bottomPadding;
        this.leftPadding = leftPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmlButtonVO)) {
            return false;
        }
        CmlButtonVO cmlButtonVO = (CmlButtonVO) other;
        return Intrinsics.d(this.button, cmlButtonVO.button) && Intrinsics.d(this.topBorderColor, cmlButtonVO.topBorderColor) && Intrinsics.d(this.backgroundColor, cmlButtonVO.backgroundColor) && this.topCornerRadius == cmlButtonVO.topCornerRadius && this.topPadding == cmlButtonVO.topPadding && this.rightPadding == cmlButtonVO.rightPadding && this.bottomPadding == cmlButtonVO.bottomPadding && this.leftPadding == cmlButtonVO.leftPadding;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    public final String getTopBorderColor() {
        return this.topBorderColor;
    }

    @NotNull
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        String str = this.topBorderColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return this.leftPadding.hashCode() + b.b(this.bottomPadding, b.b(this.rightPadding, b.b(this.topPadding, Tl.b.b(this.topCornerRadius, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        ButtonV3DTO buttonV3DTO = this.button;
        String str = this.topBorderColor;
        String str2 = this.backgroundColor;
        CornerRadius cornerRadius = this.topCornerRadius;
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.rightPadding;
        Paddings paddings3 = this.bottomPadding;
        Paddings paddings4 = this.leftPadding;
        StringBuilder sb2 = new StringBuilder("CmlButtonVO(button=");
        sb2.append(buttonV3DTO);
        sb2.append(", topBorderColor=");
        sb2.append(str);
        sb2.append(", backgroundColor=");
        sb2.append(str2);
        sb2.append(", topCornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", topPadding=");
        a.e(sb2, paddings, ", rightPadding=", paddings2, ", bottomPadding=");
        return b.e(sb2, paddings3, ", leftPadding=", paddings4, ")");
    }
}
