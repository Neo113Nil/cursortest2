package ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.repository.UniTheme;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonimage/data/CommonImageDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "leftMargin", "Lru/ozon/uni/core/models/UniPaddingToken;", "topMargin", "rightMargin", "bottomMargin", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getLeftMargin", "()Lru/ozon/uni/core/models/UniPaddingToken;", "getTopMargin", "getRightMargin", "getBottomMargin", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CommonImageDTO {
    public static final int $stable = UniPaddingToken.$stable;
    private final UniPaddingToken bottomMargin;
    private final ImageDTO image;
    private final UniPaddingToken leftMargin;
    private final UniPaddingToken rightMargin;
    private final UniPaddingToken topMargin;

    public CommonImageDTO() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CommonImageDTO copy$default(CommonImageDTO commonImageDTO, ImageDTO imageDTO, UniPaddingToken uniPaddingToken, UniPaddingToken uniPaddingToken2, UniPaddingToken uniPaddingToken3, UniPaddingToken uniPaddingToken4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = commonImageDTO.image;
        }
        if ((i11 & 2) != 0) {
            uniPaddingToken = commonImageDTO.leftMargin;
        }
        if ((i11 & 4) != 0) {
            uniPaddingToken2 = commonImageDTO.topMargin;
        }
        if ((i11 & 8) != 0) {
            uniPaddingToken3 = commonImageDTO.rightMargin;
        }
        if ((i11 & 16) != 0) {
            uniPaddingToken4 = commonImageDTO.bottomMargin;
        }
        UniPaddingToken uniPaddingToken5 = uniPaddingToken4;
        UniPaddingToken uniPaddingToken6 = uniPaddingToken2;
        return commonImageDTO.copy(imageDTO, uniPaddingToken, uniPaddingToken6, uniPaddingToken3, uniPaddingToken5);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final UniPaddingToken getLeftMargin() {
        return this.leftMargin;
    }

    /* renamed from: component3, reason: from getter */
    public final UniPaddingToken getTopMargin() {
        return this.topMargin;
    }

    /* renamed from: component4, reason: from getter */
    public final UniPaddingToken getRightMargin() {
        return this.rightMargin;
    }

    /* renamed from: component5, reason: from getter */
    public final UniPaddingToken getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final CommonImageDTO copy(ImageDTO image, UniPaddingToken leftMargin, UniPaddingToken topMargin, UniPaddingToken rightMargin, UniPaddingToken bottomMargin) {
        return new CommonImageDTO(image, leftMargin, topMargin, rightMargin, bottomMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonImageDTO)) {
            return false;
        }
        CommonImageDTO commonImageDTO = (CommonImageDTO) other;
        return Intrinsics.d(this.image, commonImageDTO.image) && Intrinsics.d(this.leftMargin, commonImageDTO.leftMargin) && Intrinsics.d(this.topMargin, commonImageDTO.topMargin) && Intrinsics.d(this.rightMargin, commonImageDTO.rightMargin) && Intrinsics.d(this.bottomMargin, commonImageDTO.bottomMargin);
    }

    public final UniPaddingToken getBottomMargin() {
        return this.bottomMargin;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final UniPaddingToken getLeftMargin() {
        return this.leftMargin;
    }

    public final UniPaddingToken getRightMargin() {
        return this.rightMargin;
    }

    public final UniPaddingToken getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.image;
        int hashCode = (imageDTO == null ? 0 : imageDTO.hashCode()) * 31;
        UniPaddingToken uniPaddingToken = this.leftMargin;
        int hashCode2 = (hashCode + (uniPaddingToken == null ? 0 : uniPaddingToken.hashCode())) * 31;
        UniPaddingToken uniPaddingToken2 = this.topMargin;
        int hashCode3 = (hashCode2 + (uniPaddingToken2 == null ? 0 : uniPaddingToken2.hashCode())) * 31;
        UniPaddingToken uniPaddingToken3 = this.rightMargin;
        int hashCode4 = (hashCode3 + (uniPaddingToken3 == null ? 0 : uniPaddingToken3.hashCode())) * 31;
        UniPaddingToken uniPaddingToken4 = this.bottomMargin;
        return hashCode4 + (uniPaddingToken4 != null ? uniPaddingToken4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommonImageDTO(image=" + this.image + ", leftMargin=" + this.leftMargin + ", topMargin=" + this.topMargin + ", rightMargin=" + this.rightMargin + ", bottomMargin=" + this.bottomMargin + ")";
    }

    public CommonImageDTO(ImageDTO imageDTO, UniPaddingToken uniPaddingToken, UniPaddingToken uniPaddingToken2, UniPaddingToken uniPaddingToken3, UniPaddingToken uniPaddingToken4) {
        this.image = imageDTO;
        this.leftMargin = uniPaddingToken;
        this.topMargin = uniPaddingToken2;
        this.rightMargin = uniPaddingToken3;
        this.bottomMargin = uniPaddingToken4;
    }

    public /* synthetic */ CommonImageDTO(ImageDTO imageDTO, UniPaddingToken uniPaddingToken, UniPaddingToken uniPaddingToken2, UniPaddingToken uniPaddingToken3, UniPaddingToken uniPaddingToken4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : imageDTO, (i11 & 2) != 0 ? UniTheme.INSTANCE.getPaddingTokens().getPadding300() : uniPaddingToken, (i11 & 4) != 0 ? UniTheme.INSTANCE.getPaddingTokens().getPadding300() : uniPaddingToken2, (i11 & 8) != 0 ? UniTheme.INSTANCE.getPaddingTokens().getPadding300() : uniPaddingToken3, (i11 & 16) != 0 ? UniTheme.INSTANCE.getPaddingTokens().getNone() : uniPaddingToken4);
    }
}
