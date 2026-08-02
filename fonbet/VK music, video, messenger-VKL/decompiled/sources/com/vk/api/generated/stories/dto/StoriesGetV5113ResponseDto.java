package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.b;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.storiesIdeas.dto.StoriesIdeasIdeasBlockDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: StoriesGetV5113ResponseDto.kt */
/* loaded from: classes15.dex */
public final class StoriesGetV5113ResponseDto implements Parcelable {
    public static final Parcelable.Creator<StoriesGetV5113ResponseDto> CREATOR = new a();

    @pmi0(b.JSON_KEY_ADS)
    private final StoriesAdsDataV5113Dto ads;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("ideas")
    private final StoriesIdeasIdeasBlockDto ideas;

    @pmi0("items")
    private final List<StoriesFeedItemDto> items;

    @pmi0("need_upload_screen")
    private final Boolean needUploadScreen;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: StoriesGetV5113ResponseDto.kt */
    public static final class a implements Parcelable.Creator<StoriesGetV5113ResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesGetV5113ResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(StoriesFeedItemDto.CREATOR, parcel, arrayList3, i, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = bo.b(StoriesGetV5113ResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = bo.b(StoriesGetV5113ResponseDto.class, parcel, arrayList4, i3, 1);
                }
                arrayList2 = arrayList4;
            }
            StoriesIdeasIdeasBlockDto createFromParcel = parcel.readInt() == 0 ? null : StoriesIdeasIdeasBlockDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoriesGetV5113ResponseDto(readInt, arrayList3, arrayList, arrayList2, createFromParcel, valueOf, parcel.readInt() != 0 ? StoriesAdsDataV5113Dto.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesGetV5113ResponseDto[] newArray(int i) {
            return new StoriesGetV5113ResponseDto[i];
        }
    }

    public StoriesGetV5113ResponseDto(int i, List<StoriesFeedItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, StoriesIdeasIdeasBlockDto storiesIdeasIdeasBlockDto, Boolean bool, StoriesAdsDataV5113Dto storiesAdsDataV5113Dto, String str, String str2) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.ideas = storiesIdeasIdeasBlockDto;
        this.needUploadScreen = bool;
        this.ads = storiesAdsDataV5113Dto;
        this.trackCode = str;
        this.nextFrom = str2;
    }

    public final StoriesAdsDataV5113Dto d() {
        return this.ads;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<GroupsGroupFullDto> e() {
        return this.groups;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetV5113ResponseDto)) {
            return false;
        }
        StoriesGetV5113ResponseDto storiesGetV5113ResponseDto = (StoriesGetV5113ResponseDto) obj;
        return this.count == storiesGetV5113ResponseDto.count && epx.f(this.items, storiesGetV5113ResponseDto.items) && epx.f(this.profiles, storiesGetV5113ResponseDto.profiles) && epx.f(this.groups, storiesGetV5113ResponseDto.groups) && epx.f(this.ideas, storiesGetV5113ResponseDto.ideas) && epx.f(this.needUploadScreen, storiesGetV5113ResponseDto.needUploadScreen) && epx.f(this.ads, storiesGetV5113ResponseDto.ads) && epx.f(this.trackCode, storiesGetV5113ResponseDto.trackCode) && epx.f(this.nextFrom, storiesGetV5113ResponseDto.nextFrom);
    }

    public final StoriesIdeasIdeasBlockDto f() {
        return this.ideas;
    }

    public final List<StoriesFeedItemDto> g() {
        return this.items;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        StoriesIdeasIdeasBlockDto storiesIdeasIdeasBlockDto = this.ideas;
        int hashCode3 = (hashCode2 + (storiesIdeasIdeasBlockDto == null ? 0 : storiesIdeasIdeasBlockDto.hashCode())) * 31;
        Boolean bool = this.needUploadScreen;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        StoriesAdsDataV5113Dto storiesAdsDataV5113Dto = this.ads;
        int hashCode5 = (hashCode4 + (storiesAdsDataV5113Dto == null ? 0 : storiesAdsDataV5113Dto.hashCode())) * 31;
        String str = this.trackCode;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextFrom;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.nextFrom;
    }

    public final List<UsersUserFullDto> j() {
        return this.profiles;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesGetV5113ResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", ideas=");
        sb.append(this.ideas);
        sb.append(", needUploadScreen=");
        sb.append(this.needUploadScreen);
        sb.append(", ads=");
        sb.append(this.ads);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StoriesFeedItemDto) a2.next()).writeToParcel(parcel, i);
        }
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupFullDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        StoriesIdeasIdeasBlockDto storiesIdeasIdeasBlockDto = this.ideas;
        if (storiesIdeasIdeasBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesIdeasIdeasBlockDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.needUploadScreen;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        StoriesAdsDataV5113Dto storiesAdsDataV5113Dto = this.ads;
        if (storiesAdsDataV5113Dto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storiesAdsDataV5113Dto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.trackCode);
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ StoriesGetV5113ResponseDto(int i, List list, List list2, List list3, StoriesIdeasIdeasBlockDto storiesIdeasIdeasBlockDto, Boolean bool, StoriesAdsDataV5113Dto storiesAdsDataV5113Dto, String str, String str2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : storiesIdeasIdeasBlockDto, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : storiesAdsDataV5113Dto, (i2 & 128) != 0 ? null : str, (i2 & 256) != 0 ? null : str2);
    }
}
