package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v2.data;

import C.o0;
import Kk.C3532b;
import Lh.a;
import Tl.b;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jg\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v2/data/ButtonWidgetV2DTO;", "", "button", "Lru/ozon/uni/atoms/data/AtomDTO;", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "topCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "isSticky", "", "backgroundColor", "", "borderColor", "<init>", "(Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/CornerRadius;ZLjava/lang/String;Ljava/lang/String;)V", "getButton", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "getTopCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "()Z", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonWidgetV2DTO {
    public static final int $stable = AtomDTO.$stable;
    private final String backgroundColor;
    private final String borderColor;

    @EnumNullFallback
    @NotNull
    private final Paddings bottomPadding;

    @NotNull
    private final AtomDTO button;
    private final boolean isSticky;

    @EnumNullFallback
    @NotNull
    private final Paddings leftPadding;

    @EnumNullFallback
    @NotNull
    private final Paddings rightPadding;

    @EnumNullFallback
    @NotNull
    private final CornerRadius topCornerRadius;

    @EnumNullFallback
    @NotNull
    private final Paddings topPadding;

    public ButtonWidgetV2DTO(@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class) @NotNull @ProtoOneOf(label = "type") AtomDTO button, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding, @NotNull CornerRadius topCornerRadius, boolean z11, String str, String str2) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
        this.button = button;
        this.topPadding = topPadding;
        this.bottomPadding = bottomPadding;
        this.leftPadding = leftPadding;
        this.rightPadding = rightPadding;
        this.topCornerRadius = topCornerRadius;
        this.isSticky = z11;
        this.backgroundColor = str;
        this.borderColor = str2;
    }

    public static /* synthetic */ ButtonWidgetV2DTO copy$default(ButtonWidgetV2DTO buttonWidgetV2DTO, AtomDTO atomDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, CornerRadius cornerRadius, boolean z11, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomDTO = buttonWidgetV2DTO.button;
        }
        if ((i11 & 2) != 0) {
            paddings = buttonWidgetV2DTO.topPadding;
        }
        if ((i11 & 4) != 0) {
            paddings2 = buttonWidgetV2DTO.bottomPadding;
        }
        if ((i11 & 8) != 0) {
            paddings3 = buttonWidgetV2DTO.leftPadding;
        }
        if ((i11 & 16) != 0) {
            paddings4 = buttonWidgetV2DTO.rightPadding;
        }
        if ((i11 & 32) != 0) {
            cornerRadius = buttonWidgetV2DTO.topCornerRadius;
        }
        if ((i11 & 64) != 0) {
            z11 = buttonWidgetV2DTO.isSticky;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str = buttonWidgetV2DTO.backgroundColor;
        }
        if ((i11 & 256) != 0) {
            str2 = buttonWidgetV2DTO.borderColor;
        }
        String str3 = str;
        String str4 = str2;
        CornerRadius cornerRadius2 = cornerRadius;
        boolean z12 = z11;
        Paddings paddings5 = paddings4;
        Paddings paddings6 = paddings2;
        return buttonWidgetV2DTO.copy(atomDTO, paddings, paddings6, paddings3, paddings5, cornerRadius2, z12, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AtomDTO getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSticky() {
        return this.isSticky;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final ButtonWidgetV2DTO copy(@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class) @NotNull @ProtoOneOf(label = "type") AtomDTO button, @NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding, @NotNull CornerRadius topCornerRadius, boolean isSticky, String backgroundColor, String borderColor) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
        return new ButtonWidgetV2DTO(button, topPadding, bottomPadding, leftPadding, rightPadding, topCornerRadius, isSticky, backgroundColor, borderColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonWidgetV2DTO)) {
            return false;
        }
        ButtonWidgetV2DTO buttonWidgetV2DTO = (ButtonWidgetV2DTO) other;
        return Intrinsics.d(this.button, buttonWidgetV2DTO.button) && this.topPadding == buttonWidgetV2DTO.topPadding && this.bottomPadding == buttonWidgetV2DTO.bottomPadding && this.leftPadding == buttonWidgetV2DTO.leftPadding && this.rightPadding == buttonWidgetV2DTO.rightPadding && this.topCornerRadius == buttonWidgetV2DTO.topCornerRadius && this.isSticky == buttonWidgetV2DTO.isSticky && Intrinsics.d(this.backgroundColor, buttonWidgetV2DTO.backgroundColor) && Intrinsics.d(this.borderColor, buttonWidgetV2DTO.borderColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    @NotNull
    public final Paddings getBottomPadding() {
        return this.bottomPadding;
    }

    @NotNull
    public final AtomDTO getButton() {
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

    @NotNull
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    @NotNull
    public final Paddings getTopPadding() {
        return this.topPadding;
    }

    public int hashCode() {
        int a11 = C3532b.a(b.b(this.topCornerRadius, GR.b.b(this.rightPadding, GR.b.b(this.leftPadding, GR.b.b(this.bottomPadding, GR.b.b(this.topPadding, this.button.hashCode() * 31, 31), 31), 31), 31), 31), 31, this.isSticky);
        String str = this.backgroundColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.borderColor;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isSticky() {
        return this.isSticky;
    }

    @NotNull
    public String toString() {
        AtomDTO atomDTO = this.button;
        Paddings paddings = this.topPadding;
        Paddings paddings2 = this.bottomPadding;
        Paddings paddings3 = this.leftPadding;
        Paddings paddings4 = this.rightPadding;
        CornerRadius cornerRadius = this.topCornerRadius;
        boolean z11 = this.isSticky;
        String str = this.backgroundColor;
        String str2 = this.borderColor;
        StringBuilder sb2 = new StringBuilder("ButtonWidgetV2DTO(button=");
        sb2.append(atomDTO);
        sb2.append(", topPadding=");
        sb2.append(paddings);
        sb2.append(", bottomPadding=");
        a.e(sb2, paddings2, ", leftPadding=", paddings3, ", rightPadding=");
        sb2.append(paddings4);
        sb2.append(", topCornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", isSticky=");
        C5766e.a(", backgroundColor=", str, ", borderColor=", sb2, z11);
        return o0.c(sb2, str2, ")");
    }

    public /* synthetic */ ButtonWidgetV2DTO(AtomDTO atomDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, CornerRadius cornerRadius, boolean z11, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(atomDTO, (i11 & 2) != 0 ? Paddings.PADDING_500 : paddings, (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings2, (i11 & 8) != 0 ? Paddings.PADDING_500 : paddings3, (i11 & 16) != 0 ? Paddings.PADDING_500 : paddings4, (i11 & 32) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & 64) != 0 ? false : z11, str, str2);
    }
}
