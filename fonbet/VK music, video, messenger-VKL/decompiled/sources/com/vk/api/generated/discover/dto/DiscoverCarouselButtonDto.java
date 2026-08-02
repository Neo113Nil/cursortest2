package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DiscoverCarouselButtonDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverCarouselButtonDto implements Parcelable {
    public static final Parcelable.Creator<DiscoverCarouselButtonDto> CREATOR = new a();

    @pmi0("action")
    private final DiscoverCarouselButtonActionDto action;

    @pmi0(TtmlNode.TAG_STYLE)
    private final DiscoverCarouselButtonTypeDto style;

    @pmi0("title")
    private final String title;

    /* compiled from: DiscoverCarouselButtonDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverCarouselButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonDto createFromParcel(Parcel parcel) {
            return new DiscoverCarouselButtonDto(DiscoverCarouselButtonActionDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : DiscoverCarouselButtonTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverCarouselButtonDto[] newArray(int i) {
            return new DiscoverCarouselButtonDto[i];
        }
    }

    public DiscoverCarouselButtonDto(DiscoverCarouselButtonActionDto discoverCarouselButtonActionDto, String str, DiscoverCarouselButtonTypeDto discoverCarouselButtonTypeDto) {
        this.action = discoverCarouselButtonActionDto;
        this.title = str;
        this.style = discoverCarouselButtonTypeDto;
    }

    public final DiscoverCarouselButtonActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DiscoverCarouselButtonTypeDto e() {
        return this.style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselButtonDto)) {
            return false;
        }
        DiscoverCarouselButtonDto discoverCarouselButtonDto = (DiscoverCarouselButtonDto) obj;
        return epx.f(this.action, discoverCarouselButtonDto.action) && epx.f(this.title, discoverCarouselButtonDto.title) && this.style == discoverCarouselButtonDto.style;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.action.hashCode() * 31, 31, this.title);
        DiscoverCarouselButtonTypeDto discoverCarouselButtonTypeDto = this.style;
        return a2 + (discoverCarouselButtonTypeDto == null ? 0 : discoverCarouselButtonTypeDto.hashCode());
    }

    public final String toString() {
        return "DiscoverCarouselButtonDto(action=" + this.action + ", title=" + this.title + ", style=" + this.style + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.action.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        DiscoverCarouselButtonTypeDto discoverCarouselButtonTypeDto = this.style;
        if (discoverCarouselButtonTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discoverCarouselButtonTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DiscoverCarouselButtonDto(DiscoverCarouselButtonActionDto discoverCarouselButtonActionDto, String str, DiscoverCarouselButtonTypeDto discoverCarouselButtonTypeDto, int i, zcl zclVar) {
        this(discoverCarouselButtonActionDto, str, (i & 4) != 0 ? null : discoverCarouselButtonTypeDto);
    }
}
