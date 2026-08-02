package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetButtonDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetButtonDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetButtonDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("icon")
    private final SuperAppUniversalWidgetIconDto icon;

    @pmi0(TtmlNode.TAG_STYLE)
    private final SuperAppUniversalWidgetButtonStyleDto style;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextBlockDto title;

    /* compiled from: SuperAppUniversalWidgetButtonDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetButtonDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetButtonDto((SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetButtonDto.class.getClassLoader()), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextBlockDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetButtonStyleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetButtonDto[] newArray(int i) {
            return new SuperAppUniversalWidgetButtonDto[i];
        }
    }

    public SuperAppUniversalWidgetButtonDto(SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetIconDto superAppUniversalWidgetIconDto, SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto) {
        this.action = superAppUniversalWidgetActionDto;
        this.title = superAppUniversalWidgetTextBlockDto;
        this.icon = superAppUniversalWidgetIconDto;
        this.style = superAppUniversalWidgetButtonStyleDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetButtonDto)) {
            return false;
        }
        SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto = (SuperAppUniversalWidgetButtonDto) obj;
        return epx.f(this.action, superAppUniversalWidgetButtonDto.action) && epx.f(this.title, superAppUniversalWidgetButtonDto.title) && epx.f(this.icon, superAppUniversalWidgetButtonDto.icon) && epx.f(this.style, superAppUniversalWidgetButtonDto.style);
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTextBlockDto == null ? 0 : superAppUniversalWidgetTextBlockDto.hashCode())) * 31;
        SuperAppUniversalWidgetIconDto superAppUniversalWidgetIconDto = this.icon;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetIconDto == null ? 0 : superAppUniversalWidgetIconDto.hashCode())) * 31;
        SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto = this.style;
        return hashCode3 + (superAppUniversalWidgetButtonStyleDto != null ? superAppUniversalWidgetButtonStyleDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetButtonDto(action=" + this.action + ", title=" + this.title + ", icon=" + this.icon + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.action, i);
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.title;
        if (superAppUniversalWidgetTextBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextBlockDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetIconDto superAppUniversalWidgetIconDto = this.icon;
        if (superAppUniversalWidgetIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetIconDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto = this.style;
        if (superAppUniversalWidgetButtonStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetButtonStyleDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetButtonDto(SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetIconDto superAppUniversalWidgetIconDto, SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto, int i, zcl zclVar) {
        this(superAppUniversalWidgetActionDto, (i & 2) != 0 ? null : superAppUniversalWidgetTextBlockDto, (i & 4) != 0 ? null : superAppUniversalWidgetIconDto, (i & 8) != 0 ? null : superAppUniversalWidgetButtonStyleDto);
    }
}
