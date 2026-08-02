package ru.ozon.android.composerCommonViewKit.plainText.data;

import D3.g;
import GR.b;
import Lh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018¨\u0006+"}, d2 = {"Lru/ozon/android/composerCommonViewKit/plainText/data/PlainTextDTO;", "", "textDTO", "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "topIslandCornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "bottomIslandCornerRadius", "leftMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "topMargin", "rightMargin", "bottomMargin", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTextDTO", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getTopIslandCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBottomIslandCornerRadius", "getLeftMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTopMargin", "getRightMargin", "getBottomMargin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PlainTextDTO {
    public static final int $stable = 0;
    private final String backgroundColor;

    @NotNull
    private final CornerRadius bottomIslandCornerRadius;

    @NotNull
    private final Paddings bottomMargin;

    @NotNull
    private final Paddings leftMargin;

    @NotNull
    private final Paddings rightMargin;

    @NotNull
    private final TextDTO textDTO;

    @NotNull
    private final CornerRadius topIslandCornerRadius;

    @NotNull
    private final Paddings topMargin;

    public PlainTextDTO(@i(name = "text") @NotNull TextDTO textDTO, String str, @NotNull CornerRadius topIslandCornerRadius, @NotNull CornerRadius bottomIslandCornerRadius, @NotNull Paddings leftMargin, @NotNull Paddings topMargin, @NotNull Paddings rightMargin, @NotNull Paddings bottomMargin) {
        Intrinsics.checkNotNullParameter(textDTO, "textDTO");
        Intrinsics.checkNotNullParameter(topIslandCornerRadius, "topIslandCornerRadius");
        Intrinsics.checkNotNullParameter(bottomIslandCornerRadius, "bottomIslandCornerRadius");
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(topMargin, "topMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
        this.textDTO = textDTO;
        this.backgroundColor = str;
        this.topIslandCornerRadius = topIslandCornerRadius;
        this.bottomIslandCornerRadius = bottomIslandCornerRadius;
        this.leftMargin = leftMargin;
        this.topMargin = topMargin;
        this.rightMargin = rightMargin;
        this.bottomMargin = bottomMargin;
    }

    public static /* synthetic */ PlainTextDTO copy$default(PlainTextDTO plainTextDTO, TextDTO textDTO, String str, CornerRadius cornerRadius, CornerRadius cornerRadius2, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = plainTextDTO.textDTO;
        }
        if ((i11 & 2) != 0) {
            str = plainTextDTO.backgroundColor;
        }
        if ((i11 & 4) != 0) {
            cornerRadius = plainTextDTO.topIslandCornerRadius;
        }
        if ((i11 & 8) != 0) {
            cornerRadius2 = plainTextDTO.bottomIslandCornerRadius;
        }
        if ((i11 & 16) != 0) {
            paddings = plainTextDTO.leftMargin;
        }
        if ((i11 & 32) != 0) {
            paddings2 = plainTextDTO.topMargin;
        }
        if ((i11 & 64) != 0) {
            paddings3 = plainTextDTO.rightMargin;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            paddings4 = plainTextDTO.bottomMargin;
        }
        Paddings paddings5 = paddings3;
        Paddings paddings6 = paddings4;
        Paddings paddings7 = paddings;
        Paddings paddings8 = paddings2;
        return plainTextDTO.copy(textDTO, str, cornerRadius, cornerRadius2, paddings7, paddings8, paddings5, paddings6);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTextDTO() {
        return this.textDTO;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CornerRadius getTopIslandCornerRadius() {
        return this.topIslandCornerRadius;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CornerRadius getBottomIslandCornerRadius() {
        return this.bottomIslandCornerRadius;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Paddings getTopMargin() {
        return this.topMargin;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final Paddings getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final PlainTextDTO copy(@i(name = "text") @NotNull TextDTO textDTO, String backgroundColor, @NotNull CornerRadius topIslandCornerRadius, @NotNull CornerRadius bottomIslandCornerRadius, @NotNull Paddings leftMargin, @NotNull Paddings topMargin, @NotNull Paddings rightMargin, @NotNull Paddings bottomMargin) {
        Intrinsics.checkNotNullParameter(textDTO, "textDTO");
        Intrinsics.checkNotNullParameter(topIslandCornerRadius, "topIslandCornerRadius");
        Intrinsics.checkNotNullParameter(bottomIslandCornerRadius, "bottomIslandCornerRadius");
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(topMargin, "topMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
        return new PlainTextDTO(textDTO, backgroundColor, topIslandCornerRadius, bottomIslandCornerRadius, leftMargin, topMargin, rightMargin, bottomMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlainTextDTO)) {
            return false;
        }
        PlainTextDTO plainTextDTO = (PlainTextDTO) other;
        return Intrinsics.d(this.textDTO, plainTextDTO.textDTO) && Intrinsics.d(this.backgroundColor, plainTextDTO.backgroundColor) && this.topIslandCornerRadius == plainTextDTO.topIslandCornerRadius && this.bottomIslandCornerRadius == plainTextDTO.bottomIslandCornerRadius && this.leftMargin == plainTextDTO.leftMargin && this.topMargin == plainTextDTO.topMargin && this.rightMargin == plainTextDTO.rightMargin && this.bottomMargin == plainTextDTO.bottomMargin;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornerRadius getBottomIslandCornerRadius() {
        return this.bottomIslandCornerRadius;
    }

    @NotNull
    public final Paddings getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    @NotNull
    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    @NotNull
    public final TextDTO getTextDTO() {
        return this.textDTO;
    }

    @NotNull
    public final CornerRadius getTopIslandCornerRadius() {
        return this.topIslandCornerRadius;
    }

    @NotNull
    public final Paddings getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        int hashCode = this.textDTO.hashCode() * 31;
        String str = this.backgroundColor;
        return this.bottomMargin.hashCode() + b.b(this.rightMargin, b.b(this.topMargin, b.b(this.leftMargin, Tl.b.b(this.bottomIslandCornerRadius, Tl.b.b(this.topIslandCornerRadius, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.textDTO;
        String str = this.backgroundColor;
        CornerRadius cornerRadius = this.topIslandCornerRadius;
        CornerRadius cornerRadius2 = this.bottomIslandCornerRadius;
        Paddings paddings = this.leftMargin;
        Paddings paddings2 = this.topMargin;
        Paddings paddings3 = this.rightMargin;
        Paddings paddings4 = this.bottomMargin;
        StringBuilder f7 = g.f("PlainTextDTO(textDTO=", textDTO, ", backgroundColor=", str, ", topIslandCornerRadius=");
        f7.append(cornerRadius);
        f7.append(", bottomIslandCornerRadius=");
        f7.append(cornerRadius2);
        f7.append(", leftMargin=");
        a.e(f7, paddings, ", topMargin=", paddings2, ", rightMargin=");
        return b.e(f7, paddings3, ", bottomMargin=", paddings4, ")");
    }

    public /* synthetic */ PlainTextDTO(TextDTO textDTO, String str, CornerRadius cornerRadius, CornerRadius cornerRadius2, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, str, (i11 & 4) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & 8) != 0 ? CornerRadius.NO_RADIUS : cornerRadius2, (i11 & 16) != 0 ? Paddings.NONE : paddings, (i11 & 32) != 0 ? Paddings.NONE : paddings2, (i11 & 64) != 0 ? Paddings.NONE : paddings3, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? Paddings.NONE : paddings4);
    }
}
