package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VideoSubtitlesDto.kt */
/* loaded from: classes15.dex */
public final class VideoSubtitlesDto implements Parcelable {
    public static final Parcelable.Creator<VideoSubtitlesDto> CREATOR = new a();

    @pmi0("is_auto")
    private final Boolean isAuto;

    @pmi0("lang")
    private final String lang;

    @pmi0("lang_id")
    private final Integer langId;

    @pmi0("manifest_name")
    private final String manifestName;

    @pmi0("storage_index")
    private final Integer storageIndex;

    @pmi0("title")
    private final String title;

    @pmi0("track_id")
    private final String trackId;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoSubtitlesDto.kt */
    public static final class a implements Parcelable.Creator<VideoSubtitlesDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSubtitlesDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            Integer num = valueOf2;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Integer num2 = null;
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                num2 = Integer.valueOf(parcel.readInt());
            }
            return new VideoSubtitlesDto(valueOf, num, readString, readString2, readString3, readString4, readString5, num2);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSubtitlesDto[] newArray(int i) {
            return new VideoSubtitlesDto[i];
        }
    }

    public VideoSubtitlesDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSubtitlesDto)) {
            return false;
        }
        VideoSubtitlesDto videoSubtitlesDto = (VideoSubtitlesDto) obj;
        return epx.f(this.isAuto, videoSubtitlesDto.isAuto) && epx.f(this.storageIndex, videoSubtitlesDto.storageIndex) && epx.f(this.lang, videoSubtitlesDto.lang) && epx.f(this.title, videoSubtitlesDto.title) && epx.f(this.url, videoSubtitlesDto.url) && epx.f(this.manifestName, videoSubtitlesDto.manifestName) && epx.f(this.trackId, videoSubtitlesDto.trackId) && epx.f(this.langId, videoSubtitlesDto.langId);
    }

    public final int hashCode() {
        Boolean bool = this.isAuto;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.storageIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.lang;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.manifestName;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trackId;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.langId;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSubtitlesDto(isAuto=");
        sb.append(this.isAuto);
        sb.append(", storageIndex=");
        sb.append(this.storageIndex);
        sb.append(", lang=");
        sb.append(this.lang);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", manifestName=");
        sb.append(this.manifestName);
        sb.append(", trackId=");
        sb.append(this.trackId);
        sb.append(", langId=");
        return uqi.b(sb, this.langId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isAuto;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.storageIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.lang);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.manifestName);
        parcel.writeString(this.trackId);
        Integer num2 = this.langId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public VideoSubtitlesDto(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, Integer num2) {
        this.isAuto = bool;
        this.storageIndex = num;
        this.lang = str;
        this.title = str2;
        this.url = str3;
        this.manifestName = str4;
        this.trackId = str5;
        this.langId = num2;
    }

    public /* synthetic */ VideoSubtitlesDto(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : num2);
    }
}
