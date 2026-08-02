package ru.ozon.app.android.cml.delivery.molecules.button.data;

import GR.b;
import Lh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003Jg\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018¨\u0006+"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/button/data/CmlButtonDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "topBorderColor", "", "backgroundColor", "topCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightPadding", "bottomPadding", "leftPadding", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTopBorderColor", "()Ljava/lang/String;", "getBackgroundColor", "getTopCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightPadding", "getBottomPadding", "getLeftPadding", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CmlButtonDTO {
    private final String backgroundColor;

    @EnumNullFallback
    private final Paddings bottomPadding;

    @NotNull
    private final ButtonV3DTO button;

    @EnumNullFallback
    private final Paddings leftPadding;

    @EnumNullFallback
    private final Paddings rightPadding;
    private final String topBorderColor;
    private final CornerRadius topCornerRadius;

    @EnumNullFallback
    private final Paddings topPadding;

    public CmlButtonDTO(@NotNull ButtonV3DTO button, String str, String str2, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.topBorderColor = str;
        this.backgroundColor = str2;
        this.topCornerRadius = cornerRadius;
        this.topPadding = paddings;
        this.rightPadding = paddings2;
        this.bottomPadding = paddings3;
        this.leftPadding = paddings4;
    }

    public static /* synthetic */ CmlButtonDTO copy$default(CmlButtonDTO cmlButtonDTO, ButtonV3DTO buttonV3DTO, String str, String str2, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = cmlButtonDTO.button;
        }
        if ((i11 & 2) != 0) {
            str = cmlButtonDTO.topBorderColor;
        }
        if ((i11 & 4) != 0) {
            str2 = cmlButtonDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            cornerRadius = cmlButtonDTO.topCornerRadius;
        }
        if ((i11 & 16) != 0) {
            paddings = cmlButtonDTO.topPadding;
        }
        if ((i11 & 32) != 0) {
            paddings2 = cmlButtonDTO.rightPadding;
        }
        if ((i11 & 64) != 0) {
            paddings3 = cmlButtonDTO.bottomPadding;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            paddings4 = cmlButtonDTO.leftPadding;
        }
        Paddings paddings5 = paddings3;
        Paddings paddings6 = paddings4;
        Paddings paddings7 = paddings;
        Paddings paddings8 = paddings2;
        return cmlButtonDTO.copy(buttonV3DTO, str, str2, cornerRadius, paddings7, paddings8, paddings5, paddings6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTopBorderColor() {
        return this.topBorderColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    /* renamed from: component5, reason: from getter */
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    /* renamed from: component6, reason: from getter */
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    /* renamed from: component7, reason: from getter */
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    /* renamed from: component8, reason: from getter */
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final CmlButtonDTO copy(@NotNull ButtonV3DTO button, String topBorderColor, String backgroundColor, CornerRadius topCornerRadius, Paddings topPadding, Paddings rightPadding, Paddings bottomPadding, Paddings leftPadding) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new CmlButtonDTO(button, topBorderColor, backgroundColor, topCornerRadius, topPadding, rightPadding, bottomPadding, leftPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmlButtonDTO)) {
            return false;
        }
        CmlButtonDTO cmlButtonDTO = (CmlButtonDTO) other;
        return Intrinsics.d(this.button, cmlButtonDTO.button) && Intrinsics.d(this.topBorderColor, cmlButtonDTO.topBorderColor) && Intrinsics.d(this.backgroundColor, cmlButtonDTO.backgroundColor) && this.topCornerRadius == cmlButtonDTO.topCornerRadius && this.topPadding == cmlButtonDTO.topPadding && this.rightPadding == cmlButtonDTO.rightPadding && this.bottomPadding == cmlButtonDTO.bottomPadding && this.leftPadding == cmlButtonDTO.leftPadding;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    public final String getTopBorderColor() {
        return this.topBorderColor;
    }

    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        String str = this.topBorderColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CornerRadius cornerRadius = this.topCornerRadius;
        int hashCode4 = (hashCode3 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        Paddings paddings = this.topPadding;
        int hashCode5 = (hashCode4 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.rightPadding;
        int hashCode6 = (hashCode5 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.bottomPadding;
        int hashCode7 = (hashCode6 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.leftPadding;
        return hashCode7 + (paddings4 != null ? paddings4.hashCode() : 0);
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
        StringBuilder sb2 = new StringBuilder("CmlButtonDTO(button=");
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
