package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.hints.HintCategories;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VideoTvChannelProgrammeDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvChannelProgrammeDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvChannelProgrammeDto> CREATOR = new a();

    @pmi0("advs")
    private final List<VideoTvChannelAdvertisementDto> advs;

    @pmi0("age_rating")
    private final String ageRating;

    @pmi0(HintCategories.PARAM_NAME)
    private final List<String> categories;

    @pmi0("date")
    private final int date;

    @pmi0("description")
    private final String description;

    @pmi0("programme_id")
    private final int programmeId;

    @pmi0("start_at")
    private final String startAt;

    @pmi0("stop_at")
    private final String stopAt;

    @pmi0("title")
    private final String title;

    /* compiled from: VideoTvChannelProgrammeDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvChannelProgrammeDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelProgrammeDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt2 = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = en.a(VideoTvChannelAdvertisementDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new VideoTvChannelProgrammeDto(readInt, readString, readString2, createStringArrayList, readInt2, readString3, readString4, readString5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvChannelProgrammeDto[] newArray(int i) {
            return new VideoTvChannelProgrammeDto[i];
        }
    }

    public VideoTvChannelProgrammeDto(int i, String str, String str2, List<String> list, int i2, String str3, String str4, String str5, List<VideoTvChannelAdvertisementDto> list2) {
        this.programmeId = i;
        this.startAt = str;
        this.stopAt = str2;
        this.categories = list;
        this.date = i2;
        this.description = str3;
        this.ageRating = str4;
        this.title = str5;
        this.advs = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTvChannelProgrammeDto)) {
            return false;
        }
        VideoTvChannelProgrammeDto videoTvChannelProgrammeDto = (VideoTvChannelProgrammeDto) obj;
        return this.programmeId == videoTvChannelProgrammeDto.programmeId && epx.f(this.startAt, videoTvChannelProgrammeDto.startAt) && epx.f(this.stopAt, videoTvChannelProgrammeDto.stopAt) && epx.f(this.categories, videoTvChannelProgrammeDto.categories) && this.date == videoTvChannelProgrammeDto.date && epx.f(this.description, videoTvChannelProgrammeDto.description) && epx.f(this.ageRating, videoTvChannelProgrammeDto.ageRating) && epx.f(this.title, videoTvChannelProgrammeDto.title) && epx.f(this.advs, videoTvChannelProgrammeDto.advs);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(shy.a(this.date, fw3.a(urd0.a(urd0.a(Integer.hashCode(this.programmeId) * 31, 31, this.startAt), 31, this.stopAt), 31, this.categories), 31), 31, this.description), 31, this.ageRating), 31, this.title);
        List<VideoTvChannelAdvertisementDto> list = this.advs;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTvChannelProgrammeDto(programmeId=");
        sb.append(this.programmeId);
        sb.append(", startAt=");
        sb.append(this.startAt);
        sb.append(", stopAt=");
        sb.append(this.stopAt);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", ageRating=");
        sb.append(this.ageRating);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", advs=");
        return ms9.a(')', sb, this.advs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.programmeId);
        parcel.writeString(this.startAt);
        parcel.writeString(this.stopAt);
        parcel.writeStringList(this.categories);
        parcel.writeInt(this.date);
        parcel.writeString(this.description);
        parcel.writeString(this.ageRating);
        parcel.writeString(this.title);
        List<VideoTvChannelAdvertisementDto> list = this.advs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((VideoTvChannelAdvertisementDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoTvChannelProgrammeDto(int i, String str, String str2, List list, int i2, String str3, String str4, String str5, List list2, int i3, zcl zclVar) {
        this(i, str, str2, list, i2, str3, str4, str5, (i3 & 256) != 0 ? null : list2);
    }
}
