package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: VideoSubscribeGetRelevantAuthorsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoSubscribeGetRelevantAuthorsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoSubscribeGetRelevantAuthorsResponseDto> CREATOR = new a();

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("has_configured_list")
    private final boolean hasConfiguredList;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("total_selected")
    private final int totalSelected;

    @pmi0("youtube_import_subscriptions_app_url")
    private final String youtubeImportSubscriptionsAppUrl;

    /* compiled from: VideoSubscribeGetRelevantAuthorsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoSubscribeGetRelevantAuthorsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoSubscribeGetRelevantAuthorsResponseDto createFromParcel(Parcel parcel) {
            int i = 0;
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (i != readInt2) {
                i = bo.b(VideoSubscribeGetRelevantAuthorsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new VideoSubscribeGetRelevantAuthorsResponseDto(z, readInt, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoSubscribeGetRelevantAuthorsResponseDto[] newArray(int i) {
            return new VideoSubscribeGetRelevantAuthorsResponseDto[i];
        }
    }

    public VideoSubscribeGetRelevantAuthorsResponseDto(boolean z, int i, List<GroupsGroupFullDto> list, String str, String str2) {
        this.hasConfiguredList = z;
        this.totalSelected = i;
        this.groups = list;
        this.nextFrom = str;
        this.youtubeImportSubscriptionsAppUrl = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSubscribeGetRelevantAuthorsResponseDto)) {
            return false;
        }
        VideoSubscribeGetRelevantAuthorsResponseDto videoSubscribeGetRelevantAuthorsResponseDto = (VideoSubscribeGetRelevantAuthorsResponseDto) obj;
        return this.hasConfiguredList == videoSubscribeGetRelevantAuthorsResponseDto.hasConfiguredList && this.totalSelected == videoSubscribeGetRelevantAuthorsResponseDto.totalSelected && epx.f(this.groups, videoSubscribeGetRelevantAuthorsResponseDto.groups) && epx.f(this.nextFrom, videoSubscribeGetRelevantAuthorsResponseDto.nextFrom) && epx.f(this.youtubeImportSubscriptionsAppUrl, videoSubscribeGetRelevantAuthorsResponseDto.youtubeImportSubscriptionsAppUrl);
    }

    public final int hashCode() {
        int a2 = fw3.a(shy.a(this.totalSelected, Boolean.hashCode(this.hasConfiguredList) * 31, 31), 31, this.groups);
        String str = this.nextFrom;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.youtubeImportSubscriptionsAppUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSubscribeGetRelevantAuthorsResponseDto(hasConfiguredList=");
        sb.append(this.hasConfiguredList);
        sb.append(", totalSelected=");
        sb.append(this.totalSelected);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", youtubeImportSubscriptionsAppUrl=");
        return ho8.a(sb, this.youtubeImportSubscriptionsAppUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.hasConfiguredList ? 1 : 0);
        parcel.writeInt(this.totalSelected);
        Iterator a2 = ao.a(parcel, this.groups);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.nextFrom);
        parcel.writeString(this.youtubeImportSubscriptionsAppUrl);
    }

    public /* synthetic */ VideoSubscribeGetRelevantAuthorsResponseDto(boolean z, int i, List list, String str, String str2, int i2, zcl zclVar) {
        this(z, i, list, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2);
    }
}
