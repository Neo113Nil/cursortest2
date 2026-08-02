package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTextBlockDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTextBlockDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTextBlockDto> CREATOR = new a();

    @pmi0(TtmlNode.TAG_STYLE)
    private final SuperAppUniversalWidgetTextStyleDto style;

    @pmi0("value")
    private final String value;

    /* compiled from: SuperAppUniversalWidgetTextBlockDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTextBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTextBlockDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTextBlockDto(parcel.readString(), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTextBlockDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTextBlockDto[i];
        }
    }

    public SuperAppUniversalWidgetTextBlockDto(String str, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto) {
        this.value = str;
        this.style = superAppUniversalWidgetTextStyleDto;
    }

    public final String d() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTextBlockDto)) {
            return false;
        }
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = (SuperAppUniversalWidgetTextBlockDto) obj;
        return epx.f(this.value, superAppUniversalWidgetTextBlockDto.value) && epx.f(this.style, superAppUniversalWidgetTextBlockDto.style);
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.style;
        return hashCode + (superAppUniversalWidgetTextStyleDto == null ? 0 : superAppUniversalWidgetTextStyleDto.hashCode());
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTextBlockDto(value=" + this.value + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.value);
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.style;
        if (superAppUniversalWidgetTextStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetTextBlockDto(String str, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : superAppUniversalWidgetTextStyleDto);
    }
}
