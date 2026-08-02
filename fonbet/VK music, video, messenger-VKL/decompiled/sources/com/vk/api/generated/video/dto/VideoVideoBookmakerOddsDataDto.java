package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoVideoBookmakerOddsDataDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoBookmakerOddsDataDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoBookmakerOddsDataDto> CREATOR = new a();

    @pmi0("bookmaker_event_id")
    private final String bookmakerEventId;

    @pmi0("coef_1")
    private final String coef1;

    @pmi0("coef_2")
    private final String coef2;

    @pmi0("coef_x")
    private final String coefX;

    @pmi0("lines")
    private final List<VideoVideoBookmakerBetLineDto> lines;

    @pmi0("match_date")
    private final String matchDate;

    @pmi0("team1")
    private final String team1;

    @pmi0("team2")
    private final String team2;

    @pmi0("updated_at")
    private final String updatedAt;

    /* compiled from: VideoVideoBookmakerOddsDataDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoBookmakerOddsDataDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoBookmakerOddsDataDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoVideoBookmakerBetLineDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VideoVideoBookmakerOddsDataDto(arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoBookmakerOddsDataDto[] newArray(int i) {
            return new VideoVideoBookmakerOddsDataDto[i];
        }
    }

    public VideoVideoBookmakerOddsDataDto(List<VideoVideoBookmakerBetLineDto> list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.lines = list;
        this.bookmakerEventId = str;
        this.team1 = str2;
        this.team2 = str3;
        this.matchDate = str4;
        this.coef1 = str5;
        this.coefX = str6;
        this.coef2 = str7;
        this.updatedAt = str8;
    }

    public final List<VideoVideoBookmakerBetLineDto> d() {
        return this.lines;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoBookmakerOddsDataDto)) {
            return false;
        }
        VideoVideoBookmakerOddsDataDto videoVideoBookmakerOddsDataDto = (VideoVideoBookmakerOddsDataDto) obj;
        return epx.f(this.lines, videoVideoBookmakerOddsDataDto.lines) && epx.f(this.bookmakerEventId, videoVideoBookmakerOddsDataDto.bookmakerEventId) && epx.f(this.team1, videoVideoBookmakerOddsDataDto.team1) && epx.f(this.team2, videoVideoBookmakerOddsDataDto.team2) && epx.f(this.matchDate, videoVideoBookmakerOddsDataDto.matchDate) && epx.f(this.coef1, videoVideoBookmakerOddsDataDto.coef1) && epx.f(this.coefX, videoVideoBookmakerOddsDataDto.coefX) && epx.f(this.coef2, videoVideoBookmakerOddsDataDto.coef2) && epx.f(this.updatedAt, videoVideoBookmakerOddsDataDto.updatedAt);
    }

    public final int hashCode() {
        int hashCode = this.lines.hashCode() * 31;
        String str = this.bookmakerEventId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.team1;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.team2;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.matchDate;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.coef1;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.coefX;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.coef2;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.updatedAt;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoBookmakerOddsDataDto(lines=");
        sb.append(this.lines);
        sb.append(", bookmakerEventId=");
        sb.append(this.bookmakerEventId);
        sb.append(", team1=");
        sb.append(this.team1);
        sb.append(", team2=");
        sb.append(this.team2);
        sb.append(", matchDate=");
        sb.append(this.matchDate);
        sb.append(", coef1=");
        sb.append(this.coef1);
        sb.append(", coefX=");
        sb.append(this.coefX);
        sb.append(", coef2=");
        sb.append(this.coef2);
        sb.append(", updatedAt=");
        return ho8.a(sb, this.updatedAt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.lines);
        while (a2.hasNext()) {
            ((VideoVideoBookmakerBetLineDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.bookmakerEventId);
        parcel.writeString(this.team1);
        parcel.writeString(this.team2);
        parcel.writeString(this.matchDate);
        parcel.writeString(this.coef1);
        parcel.writeString(this.coefX);
        parcel.writeString(this.coef2);
        parcel.writeString(this.updatedAt);
    }

    public /* synthetic */ VideoVideoBookmakerOddsDataDto(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8);
    }
}
