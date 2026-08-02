package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeInformerRootStyleRowDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRootStyleRowDto> CREATOR = new a();

    @pmi0(TtmlNode.LEFT)
    private final SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto left;

    @pmi0("middle")
    private final SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto middle;

    @pmi0(TtmlNode.RIGHT)
    private final SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto right;

    /* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRootStyleRowDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRootStyleRowDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeInformerRootStyleRowDto(parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRootStyleRowDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeInformerRootStyleRowDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeInformerRootStyleRowDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeInformerRootStyleRowDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeInformerRootStyleRowDto superAppUniversalWidgetTypeInformerRootStyleRowDto = (SuperAppUniversalWidgetTypeInformerRootStyleRowDto) obj;
        return epx.f(this.left, superAppUniversalWidgetTypeInformerRootStyleRowDto.left) && epx.f(this.middle, superAppUniversalWidgetTypeInformerRootStyleRowDto.middle) && epx.f(this.right, superAppUniversalWidgetTypeInformerRootStyleRowDto.right);
    }

    public final int hashCode() {
        SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto superAppUniversalWidgetTypeInformerRootStyleRowLeftDto = this.left;
        int hashCode = (superAppUniversalWidgetTypeInformerRootStyleRowLeftDto == null ? 0 : superAppUniversalWidgetTypeInformerRootStyleRowLeftDto.hashCode()) * 31;
        SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto = this.middle;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto == null ? 0 : superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto.hashCode())) * 31;
        SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto superAppUniversalWidgetTypeInformerRootStyleRowRightDto = this.right;
        return hashCode2 + (superAppUniversalWidgetTypeInformerRootStyleRowRightDto != null ? superAppUniversalWidgetTypeInformerRootStyleRowRightDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeInformerRootStyleRowDto(left=" + this.left + ", middle=" + this.middle + ", right=" + this.right + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto superAppUniversalWidgetTypeInformerRootStyleRowLeftDto = this.left;
        if (superAppUniversalWidgetTypeInformerRootStyleRowLeftDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTypeInformerRootStyleRowLeftDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto = this.middle;
        if (superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto superAppUniversalWidgetTypeInformerRootStyleRowRightDto = this.right;
        if (superAppUniversalWidgetTypeInformerRootStyleRowRightDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTypeInformerRootStyleRowRightDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppUniversalWidgetTypeInformerRootStyleRowDto(SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto superAppUniversalWidgetTypeInformerRootStyleRowLeftDto, SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto, SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto superAppUniversalWidgetTypeInformerRootStyleRowRightDto) {
        this.left = superAppUniversalWidgetTypeInformerRootStyleRowLeftDto;
        this.middle = superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto;
        this.right = superAppUniversalWidgetTypeInformerRootStyleRowRightDto;
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeInformerRootStyleRowDto(SuperAppUniversalWidgetTypeInformerRootStyleRowLeftDto superAppUniversalWidgetTypeInformerRootStyleRowLeftDto, SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto, SuperAppUniversalWidgetTypeInformerRootStyleRowRightDto superAppUniversalWidgetTypeInformerRootStyleRowRightDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppUniversalWidgetTypeInformerRootStyleRowLeftDto, (i & 2) != 0 ? null : superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto, (i & 4) != 0 ? null : superAppUniversalWidgetTypeInformerRootStyleRowRightDto);
    }
}
