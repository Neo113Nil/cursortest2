package ru.ozon.app.android.widgets.commonTextWidget.separator.data;

import Cm.e;
import Lh.a;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;

@j(generateAdapter = false)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006*"}, d2 = {"Lru/ozon/app/android/widgets/commonTextWidget/separator/data/SeparatorDTO;", "", "height", "", "color", "", "leftMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "rightMargin", "leftPadding", "rightPadding", "topCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "bottomCornerRadius", "<init>", "(ILjava/lang/String;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getHeight", "()I", "getColor", "()Ljava/lang/String;", "getLeftMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRightMargin", "getLeftPadding", "getRightPadding", "getTopCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBottomCornerRadius", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SeparatorDTO {

    @NotNull
    private final CornerRadius bottomCornerRadius;
    private final String color;
    private final int height;

    @NotNull
    private final Paddings leftMargin;

    @NotNull
    private final Paddings leftPadding;

    @NotNull
    private final Paddings rightMargin;

    @NotNull
    private final Paddings rightPadding;

    @NotNull
    private final CornerRadius topCornerRadius;

    public SeparatorDTO() {
        this(0, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ SeparatorDTO copy$default(SeparatorDTO separatorDTO, int i11, String str, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, CornerRadius cornerRadius, CornerRadius cornerRadius2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = separatorDTO.height;
        }
        if ((i12 & 2) != 0) {
            str = separatorDTO.color;
        }
        if ((i12 & 4) != 0) {
            paddings = separatorDTO.leftMargin;
        }
        if ((i12 & 8) != 0) {
            paddings2 = separatorDTO.rightMargin;
        }
        if ((i12 & 16) != 0) {
            paddings3 = separatorDTO.leftPadding;
        }
        if ((i12 & 32) != 0) {
            paddings4 = separatorDTO.rightPadding;
        }
        if ((i12 & 64) != 0) {
            cornerRadius = separatorDTO.topCornerRadius;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            cornerRadius2 = separatorDTO.bottomCornerRadius;
        }
        CornerRadius cornerRadius3 = cornerRadius;
        CornerRadius cornerRadius4 = cornerRadius2;
        Paddings paddings5 = paddings3;
        Paddings paddings6 = paddings4;
        return separatorDTO.copy(i11, str, paddings, paddings2, paddings5, paddings6, cornerRadius3, cornerRadius4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final CornerRadius getBottomCornerRadius() {
        return this.bottomCornerRadius;
    }

    @NotNull
    public final SeparatorDTO copy(int height, String color, @NotNull Paddings leftMargin, @NotNull Paddings rightMargin, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding, @NotNull CornerRadius topCornerRadius, @NotNull CornerRadius bottomCornerRadius) {
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
        Intrinsics.checkNotNullParameter(bottomCornerRadius, "bottomCornerRadius");
        return new SeparatorDTO(height, color, leftMargin, rightMargin, leftPadding, rightPadding, topCornerRadius, bottomCornerRadius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeparatorDTO)) {
            return false;
        }
        SeparatorDTO separatorDTO = (SeparatorDTO) other;
        return this.height == separatorDTO.height && Intrinsics.d(this.color, separatorDTO.color) && this.leftMargin == separatorDTO.leftMargin && this.rightMargin == separatorDTO.rightMargin && this.leftPadding == separatorDTO.leftPadding && this.rightPadding == separatorDTO.rightPadding && this.topCornerRadius == separatorDTO.topCornerRadius && this.bottomCornerRadius == separatorDTO.bottomCornerRadius;
    }

    @NotNull
    public final CornerRadius getBottomCornerRadius() {
        return this.bottomCornerRadius;
    }

    public final String getColor() {
        return this.color;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    public final Paddings getLeftPadding() {
        return this.leftPadding;
    }

    @NotNull
    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    @NotNull
    public final Paddings getRightPadding() {
        return this.rightPadding;
    }

    @NotNull
    public final CornerRadius getTopCornerRadius() {
        return this.topCornerRadius;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.height) * 31;
        String str = this.color;
        return this.bottomCornerRadius.hashCode() + b.b(this.topCornerRadius, GR.b.b(this.rightPadding, GR.b.b(this.leftPadding, GR.b.b(this.rightMargin, GR.b.b(this.leftMargin, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.height;
        String str = this.color;
        Paddings paddings = this.leftMargin;
        Paddings paddings2 = this.rightMargin;
        Paddings paddings3 = this.leftPadding;
        Paddings paddings4 = this.rightPadding;
        CornerRadius cornerRadius = this.topCornerRadius;
        CornerRadius cornerRadius2 = this.bottomCornerRadius;
        StringBuilder g10 = e.g(i11, "SeparatorDTO(height=", ", color=", str, ", leftMargin=");
        a.e(g10, paddings, ", rightMargin=", paddings2, ", leftPadding=");
        a.e(g10, paddings3, ", rightPadding=", paddings4, ", topCornerRadius=");
        g10.append(cornerRadius);
        g10.append(", bottomCornerRadius=");
        g10.append(cornerRadius2);
        g10.append(")");
        return g10.toString();
    }

    public SeparatorDTO(int i11, String str, @NotNull Paddings leftMargin, @NotNull Paddings rightMargin, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding, @NotNull CornerRadius topCornerRadius, @NotNull CornerRadius bottomCornerRadius) {
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
        Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
        Intrinsics.checkNotNullParameter(topCornerRadius, "topCornerRadius");
        Intrinsics.checkNotNullParameter(bottomCornerRadius, "bottomCornerRadius");
        this.height = i11;
        this.color = str;
        this.leftMargin = leftMargin;
        this.rightMargin = rightMargin;
        this.leftPadding = leftPadding;
        this.rightPadding = rightPadding;
        this.topCornerRadius = topCornerRadius;
        this.bottomCornerRadius = bottomCornerRadius;
    }

    public /* synthetic */ SeparatorDTO(int i11, String str, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, CornerRadius cornerRadius, CornerRadius cornerRadius2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 8 : i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? Paddings.NONE : paddings, (i12 & 8) != 0 ? Paddings.NONE : paddings2, (i12 & 16) != 0 ? Paddings.NONE : paddings3, (i12 & 32) != 0 ? Paddings.NONE : paddings4, (i12 & 64) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? CornerRadius.NO_RADIUS : cornerRadius2);
    }
}
