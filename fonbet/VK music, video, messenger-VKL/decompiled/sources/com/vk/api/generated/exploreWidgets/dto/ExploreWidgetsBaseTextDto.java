package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.exploreStyles.dto.ExploreStylesStyleBaseTextDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ExploreWidgetsBaseTextDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseTextDto implements Parcelable {
    public static final Parcelable.Creator<ExploreWidgetsBaseTextDto> CREATOR = new a();

    @pmi0(TtmlNode.TAG_STYLE)
    private final ExploreStylesStyleBaseTextDto style;

    @pmi0("value")
    private final String value;

    /* compiled from: ExploreWidgetsBaseTextDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseTextDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseTextDto createFromParcel(Parcel parcel) {
            return new ExploreWidgetsBaseTextDto(parcel.readString(), parcel.readInt() == 0 ? null : ExploreStylesStyleBaseTextDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseTextDto[] newArray(int i) {
            return new ExploreWidgetsBaseTextDto[i];
        }
    }

    public ExploreWidgetsBaseTextDto(String str, ExploreStylesStyleBaseTextDto exploreStylesStyleBaseTextDto) {
        this.value = str;
        this.style = exploreStylesStyleBaseTextDto;
    }

    public final ExploreStylesStyleBaseTextDto d() {
        return this.style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreWidgetsBaseTextDto)) {
            return false;
        }
        ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto = (ExploreWidgetsBaseTextDto) obj;
        return epx.f(this.value, exploreWidgetsBaseTextDto.value) && epx.f(this.style, exploreWidgetsBaseTextDto.style);
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        ExploreStylesStyleBaseTextDto exploreStylesStyleBaseTextDto = this.style;
        return hashCode + (exploreStylesStyleBaseTextDto == null ? 0 : exploreStylesStyleBaseTextDto.hashCode());
    }

    public final String toString() {
        return "ExploreWidgetsBaseTextDto(value=" + this.value + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.value);
        ExploreStylesStyleBaseTextDto exploreStylesStyleBaseTextDto = this.style;
        if (exploreStylesStyleBaseTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreStylesStyleBaseTextDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ExploreWidgetsBaseTextDto(String str, ExploreStylesStyleBaseTextDto exploreStylesStyleBaseTextDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : exploreStylesStyleBaseTextDto);
    }
}
