package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.exploreStyles.dto.ExploreStylesStyleBaseButtonDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ExploreWidgetsBaseButtonDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseButtonDto implements Parcelable {
    public static final Parcelable.Creator<ExploreWidgetsBaseButtonDto> CREATOR = new a();

    @pmi0("action")
    private final ExploreWidgetsBaseActionDto action;

    @pmi0("icon")
    private final ExploreWidgetsBaseIconDto icon;

    @pmi0(TtmlNode.TAG_STYLE)
    private final ExploreStylesStyleBaseButtonDto style;

    @pmi0("title")
    private final ExploreWidgetsBaseTextDto title;

    /* compiled from: ExploreWidgetsBaseButtonDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseButtonDto createFromParcel(Parcel parcel) {
            return new ExploreWidgetsBaseButtonDto((ExploreWidgetsBaseActionDto) parcel.readParcelable(ExploreWidgetsBaseButtonDto.class.getClassLoader()), parcel.readInt() == 0 ? null : ExploreWidgetsBaseTextDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ExploreWidgetsBaseIconDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ExploreStylesStyleBaseButtonDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseButtonDto[] newArray(int i) {
            return new ExploreWidgetsBaseButtonDto[i];
        }
    }

    public ExploreWidgetsBaseButtonDto(ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto, ExploreWidgetsBaseIconDto exploreWidgetsBaseIconDto, ExploreStylesStyleBaseButtonDto exploreStylesStyleBaseButtonDto) {
        this.action = exploreWidgetsBaseActionDto;
        this.title = exploreWidgetsBaseTextDto;
        this.icon = exploreWidgetsBaseIconDto;
        this.style = exploreStylesStyleBaseButtonDto;
    }

    public final ExploreWidgetsBaseActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ExploreWidgetsBaseTextDto e() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExploreWidgetsBaseButtonDto)) {
            return false;
        }
        ExploreWidgetsBaseButtonDto exploreWidgetsBaseButtonDto = (ExploreWidgetsBaseButtonDto) obj;
        return epx.f(this.action, exploreWidgetsBaseButtonDto.action) && epx.f(this.title, exploreWidgetsBaseButtonDto.title) && epx.f(this.icon, exploreWidgetsBaseButtonDto.icon) && epx.f(this.style, exploreWidgetsBaseButtonDto.style);
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto = this.title;
        int hashCode2 = (hashCode + (exploreWidgetsBaseTextDto == null ? 0 : exploreWidgetsBaseTextDto.hashCode())) * 31;
        ExploreWidgetsBaseIconDto exploreWidgetsBaseIconDto = this.icon;
        int hashCode3 = (hashCode2 + (exploreWidgetsBaseIconDto == null ? 0 : exploreWidgetsBaseIconDto.hashCode())) * 31;
        ExploreStylesStyleBaseButtonDto exploreStylesStyleBaseButtonDto = this.style;
        return hashCode3 + (exploreStylesStyleBaseButtonDto != null ? exploreStylesStyleBaseButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "ExploreWidgetsBaseButtonDto(action=" + this.action + ", title=" + this.title + ", icon=" + this.icon + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.action, i);
        ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto = this.title;
        if (exploreWidgetsBaseTextDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseTextDto.writeToParcel(parcel, i);
        }
        ExploreWidgetsBaseIconDto exploreWidgetsBaseIconDto = this.icon;
        if (exploreWidgetsBaseIconDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreWidgetsBaseIconDto.writeToParcel(parcel, i);
        }
        ExploreStylesStyleBaseButtonDto exploreStylesStyleBaseButtonDto = this.style;
        if (exploreStylesStyleBaseButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exploreStylesStyleBaseButtonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ExploreWidgetsBaseButtonDto(ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, ExploreWidgetsBaseTextDto exploreWidgetsBaseTextDto, ExploreWidgetsBaseIconDto exploreWidgetsBaseIconDto, ExploreStylesStyleBaseButtonDto exploreStylesStyleBaseButtonDto, int i, zcl zclVar) {
        this(exploreWidgetsBaseActionDto, (i & 2) != 0 ? null : exploreWidgetsBaseTextDto, (i & 4) != 0 ? null : exploreWidgetsBaseIconDto, (i & 8) != 0 ? null : exploreStylesStyleBaseButtonDto);
    }
}
