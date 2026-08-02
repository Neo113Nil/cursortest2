package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoVkliveCategoryDto.kt */
/* loaded from: classes15.dex */
public final class VideoVkliveCategoryDto implements Parcelable {
    public static final Parcelable.Creator<VideoVkliveCategoryDto> CREATOR = new a();

    @pmi0("cover_url")
    private final String coverUrl;

    @pmi0("id")
    private final String id;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    @pmi0("viewers")
    private final Integer viewers;

    /* compiled from: VideoVkliveCategoryDto.kt */
    public static final class a implements Parcelable.Creator<VideoVkliveCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVkliveCategoryDto createFromParcel(Parcel parcel) {
            return new VideoVkliveCategoryDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVkliveCategoryDto[] newArray(int i) {
            return new VideoVkliveCategoryDto[i];
        }
    }

    public VideoVkliveCategoryDto(String str, String str2, String str3, String str4, Integer num) {
        this.id = str;
        this.title = str2;
        this.coverUrl = str3;
        this.type = str4;
        this.viewers = num;
    }

    public final String d() {
        return this.coverUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.viewers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVkliveCategoryDto)) {
            return false;
        }
        VideoVkliveCategoryDto videoVkliveCategoryDto = (VideoVkliveCategoryDto) obj;
        return epx.f(this.id, videoVkliveCategoryDto.id) && epx.f(this.title, videoVkliveCategoryDto.title) && epx.f(this.coverUrl, videoVkliveCategoryDto.coverUrl) && epx.f(this.type, videoVkliveCategoryDto.type) && epx.f(this.viewers, videoVkliveCategoryDto.viewers);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.title), 31, this.coverUrl), 31, this.type);
        Integer num = this.viewers;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVkliveCategoryDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", coverUrl=");
        sb.append(this.coverUrl);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", viewers=");
        return uqi.b(sb, this.viewers, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.type);
        Integer num = this.viewers;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ VideoVkliveCategoryDto(String str, String str2, String str3, String str4, Integer num, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : num);
    }
}
