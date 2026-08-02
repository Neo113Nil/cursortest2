package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.image;

import D40.b;
import Lh.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewStatusInfo/image/CommonImageDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "leftMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "topMargin", "rightMargin", "bottomMargin", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getLeftMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getTopMargin", "getRightMargin", "getBottomMargin", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CommonImageDTO {
    public static final int $stable = 0;
    private final Paddings bottomMargin;
    private final ImageDTO image;
    private final Paddings leftMargin;
    private final Paddings rightMargin;
    private final Paddings topMargin;

    public CommonImageDTO() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CommonImageDTO copy$default(CommonImageDTO commonImageDTO, ImageDTO imageDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = commonImageDTO.image;
        }
        if ((i11 & 2) != 0) {
            paddings = commonImageDTO.leftMargin;
        }
        if ((i11 & 4) != 0) {
            paddings2 = commonImageDTO.topMargin;
        }
        if ((i11 & 8) != 0) {
            paddings3 = commonImageDTO.rightMargin;
        }
        if ((i11 & 16) != 0) {
            paddings4 = commonImageDTO.bottomMargin;
        }
        Paddings paddings5 = paddings4;
        Paddings paddings6 = paddings2;
        return commonImageDTO.copy(imageDTO, paddings, paddings6, paddings3, paddings5);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    /* renamed from: component3, reason: from getter */
    public final Paddings getTopMargin() {
        return this.topMargin;
    }

    /* renamed from: component4, reason: from getter */
    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    /* renamed from: component5, reason: from getter */
    public final Paddings getBottomMargin() {
        return this.bottomMargin;
    }

    @NotNull
    public final CommonImageDTO copy(ImageDTO image, Paddings leftMargin, Paddings topMargin, Paddings rightMargin, Paddings bottomMargin) {
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
        return Intrinsics.d(this.image, commonImageDTO.image) && this.leftMargin == commonImageDTO.leftMargin && this.topMargin == commonImageDTO.topMargin && this.rightMargin == commonImageDTO.rightMargin && this.bottomMargin == commonImageDTO.bottomMargin;
    }

    public final Paddings getBottomMargin() {
        return this.bottomMargin;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    public final Paddings getLeftMargin() {
        return this.leftMargin;
    }

    public final Paddings getRightMargin() {
        return this.rightMargin;
    }

    public final Paddings getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        ImageDTO imageDTO = this.image;
        int hashCode = (imageDTO == null ? 0 : imageDTO.hashCode()) * 31;
        Paddings paddings = this.leftMargin;
        int hashCode2 = (hashCode + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.topMargin;
        int hashCode3 = (hashCode2 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        Paddings paddings3 = this.rightMargin;
        int hashCode4 = (hashCode3 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
        Paddings paddings4 = this.bottomMargin;
        return hashCode4 + (paddings4 != null ? paddings4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageDTO imageDTO = this.image;
        Paddings paddings = this.leftMargin;
        Paddings paddings2 = this.topMargin;
        Paddings paddings3 = this.rightMargin;
        Paddings paddings4 = this.bottomMargin;
        StringBuilder sb2 = new StringBuilder("CommonImageDTO(image=");
        sb2.append(imageDTO);
        sb2.append(", leftMargin=");
        sb2.append(paddings);
        sb2.append(", topMargin=");
        a.e(sb2, paddings2, ", rightMargin=", paddings3, ", bottomMargin=");
        return b.b(sb2, paddings4, ")");
    }

    public CommonImageDTO(ImageDTO imageDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4) {
        this.image = imageDTO;
        this.leftMargin = paddings;
        this.topMargin = paddings2;
        this.rightMargin = paddings3;
        this.bottomMargin = paddings4;
    }

    public /* synthetic */ CommonImageDTO(ImageDTO imageDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : imageDTO, (i11 & 2) != 0 ? Paddings.PADDING_300 : paddings, (i11 & 4) != 0 ? Paddings.PADDING_300 : paddings2, (i11 & 8) != 0 ? Paddings.PADDING_300 : paddings3, (i11 & 16) != 0 ? Paddings.NONE : paddings4);
    }
}
