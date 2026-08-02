package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.coremedia.iso.boxes.MetaBox;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarusiaTtsDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaTtsDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaTtsDto> CREATOR = new a();

    @pmi0("graphemes")
    private final MarusiaTtsGraphemesDto graphemes;

    @pmi0(MetaBox.TYPE)
    private final MarusiaTtsMetaDto meta;

    @pmi0("stream_id")
    private final String streamId;

    @pmi0("support_streaming")
    private final boolean supportStreaming;

    @pmi0("url")
    private final String url;

    /* compiled from: MarusiaTtsDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaTtsDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaTtsDto createFromParcel(Parcel parcel) {
            return new MarusiaTtsDto(parcel.readString(), MarusiaTtsMetaDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : MarusiaTtsGraphemesDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaTtsDto[] newArray(int i) {
            return new MarusiaTtsDto[i];
        }
    }

    public MarusiaTtsDto(String str, MarusiaTtsMetaDto marusiaTtsMetaDto, String str2, boolean z, MarusiaTtsGraphemesDto marusiaTtsGraphemesDto) {
        this.url = str;
        this.meta = marusiaTtsMetaDto;
        this.streamId = str2;
        this.supportStreaming = z;
        this.graphemes = marusiaTtsGraphemesDto;
    }

    public final MarusiaTtsMetaDto d() {
        return this.meta;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.streamId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaTtsDto)) {
            return false;
        }
        MarusiaTtsDto marusiaTtsDto = (MarusiaTtsDto) obj;
        return epx.f(this.url, marusiaTtsDto.url) && epx.f(this.meta, marusiaTtsDto.meta) && epx.f(this.streamId, marusiaTtsDto.streamId) && this.supportStreaming == marusiaTtsDto.supportStreaming && epx.f(this.graphemes, marusiaTtsDto.graphemes);
    }

    public final boolean f() {
        return this.supportStreaming;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a((this.meta.hashCode() + (this.url.hashCode() * 31)) * 31, 31, this.streamId), 31, this.supportStreaming);
        MarusiaTtsGraphemesDto marusiaTtsGraphemesDto = this.graphemes;
        return b + (marusiaTtsGraphemesDto == null ? 0 : marusiaTtsGraphemesDto.hashCode());
    }

    public final String toString() {
        return "MarusiaTtsDto(url=" + this.url + ", meta=" + this.meta + ", streamId=" + this.streamId + ", supportStreaming=" + this.supportStreaming + ", graphemes=" + this.graphemes + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        this.meta.writeToParcel(parcel, i);
        parcel.writeString(this.streamId);
        parcel.writeInt(this.supportStreaming ? 1 : 0);
        MarusiaTtsGraphemesDto marusiaTtsGraphemesDto = this.graphemes;
        if (marusiaTtsGraphemesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marusiaTtsGraphemesDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarusiaTtsDto(String str, MarusiaTtsMetaDto marusiaTtsMetaDto, String str2, boolean z, MarusiaTtsGraphemesDto marusiaTtsGraphemesDto, int i, zcl zclVar) {
        this(str, marusiaTtsMetaDto, str2, z, (i & 16) != 0 ? null : marusiaTtsGraphemesDto);
    }
}
