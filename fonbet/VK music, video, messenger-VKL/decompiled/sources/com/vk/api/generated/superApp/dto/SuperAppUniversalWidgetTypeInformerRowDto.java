package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypeInformerRowDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeInformerRowDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0(TtmlNode.LEFT)
    private final SuperAppUniversalWidgetTypeInformerRowLeftDto left;

    @pmi0("middle")
    private final SuperAppUniversalWidgetTypeInformerRowMiddleDto middle;

    @pmi0(TtmlNode.RIGHT)
    private final SuperAppUniversalWidgetTypeInformerRowRightDto right;

    /* compiled from: SuperAppUniversalWidgetTypeInformerRowDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRowDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeInformerRowDto((SuperAppUniversalWidgetTypeInformerRowLeftDto) parcel.readParcelable(SuperAppUniversalWidgetTypeInformerRowDto.class.getClassLoader()), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTypeInformerRowMiddleDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetTypeInformerRowRightDto) parcel.readParcelable(SuperAppUniversalWidgetTypeInformerRowDto.class.getClassLoader()), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetTypeInformerRowDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRowDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeInformerRowDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeInformerRowDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeInformerRowDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeInformerRowDto superAppUniversalWidgetTypeInformerRowDto = (SuperAppUniversalWidgetTypeInformerRowDto) obj;
        return epx.f(this.left, superAppUniversalWidgetTypeInformerRowDto.left) && epx.f(this.middle, superAppUniversalWidgetTypeInformerRowDto.middle) && epx.f(this.right, superAppUniversalWidgetTypeInformerRowDto.right) && epx.f(this.action, superAppUniversalWidgetTypeInformerRowDto.action);
    }

    public final int hashCode() {
        SuperAppUniversalWidgetTypeInformerRowLeftDto superAppUniversalWidgetTypeInformerRowLeftDto = this.left;
        int hashCode = (superAppUniversalWidgetTypeInformerRowLeftDto == null ? 0 : superAppUniversalWidgetTypeInformerRowLeftDto.hashCode()) * 31;
        SuperAppUniversalWidgetTypeInformerRowMiddleDto superAppUniversalWidgetTypeInformerRowMiddleDto = this.middle;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTypeInformerRowMiddleDto == null ? 0 : superAppUniversalWidgetTypeInformerRowMiddleDto.hashCode())) * 31;
        SuperAppUniversalWidgetTypeInformerRowRightDto superAppUniversalWidgetTypeInformerRowRightDto = this.right;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetTypeInformerRowRightDto == null ? 0 : superAppUniversalWidgetTypeInformerRowRightDto.hashCode())) * 31;
        SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
        return hashCode3 + (superAppUniversalWidgetActionDto != null ? superAppUniversalWidgetActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeInformerRowDto(left=" + this.left + ", middle=" + this.middle + ", right=" + this.right + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.left, i);
        SuperAppUniversalWidgetTypeInformerRowMiddleDto superAppUniversalWidgetTypeInformerRowMiddleDto = this.middle;
        if (superAppUniversalWidgetTypeInformerRowMiddleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTypeInformerRowMiddleDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.right, i);
        parcel.writeParcelable(this.action, i);
    }

    public SuperAppUniversalWidgetTypeInformerRowDto(SuperAppUniversalWidgetTypeInformerRowLeftDto superAppUniversalWidgetTypeInformerRowLeftDto, SuperAppUniversalWidgetTypeInformerRowMiddleDto superAppUniversalWidgetTypeInformerRowMiddleDto, SuperAppUniversalWidgetTypeInformerRowRightDto superAppUniversalWidgetTypeInformerRowRightDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto) {
        this.left = superAppUniversalWidgetTypeInformerRowLeftDto;
        this.middle = superAppUniversalWidgetTypeInformerRowMiddleDto;
        this.right = superAppUniversalWidgetTypeInformerRowRightDto;
        this.action = superAppUniversalWidgetActionDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeInformerRowDto(SuperAppUniversalWidgetTypeInformerRowLeftDto superAppUniversalWidgetTypeInformerRowLeftDto, SuperAppUniversalWidgetTypeInformerRowMiddleDto superAppUniversalWidgetTypeInformerRowMiddleDto, SuperAppUniversalWidgetTypeInformerRowRightDto superAppUniversalWidgetTypeInformerRowRightDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetTypeInformerRowLeftDto, (i & 2) != 0 ? null : superAppUniversalWidgetTypeInformerRowMiddleDto, (i & 4) != 0 ? null : superAppUniversalWidgetTypeInformerRowRightDto, (i & 8) != 0 ? null : superAppUniversalWidgetActionDto);
    }
}
