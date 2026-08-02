package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: ShortVideoGetTopVideosResponseDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoGetTopVideosResponseDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoGetTopVideosResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("external_owners")
    private final List<ShortVideoExternalOwnerDto> externalOwners;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("inter_clip_blocks")
    private final List<ShortVideoInterClipBlockDto> interClipBlocks;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("questionnaires")
    private final List<ShortVideoQuestionnaireDto> questionnaires;

    @pmi0("recom_feed_id")
    private final String recomFeedId;

    @pmi0("show_saa_float_btn")
    private final Boolean showSaaFloatBtn;

    @pmi0("video_replaces")
    private final List<ShortVideoRecomRebuildReplaceDto> videoReplaces;

    /* compiled from: ShortVideoGetTopVideosResponseDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoGetTopVideosResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetTopVideosResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(ShortVideoGetTopVideosResponseDto.class, parcel, arrayList7, i, 1);
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = bo.b(ShortVideoGetTopVideosResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt4);
                int i3 = 0;
                while (i3 != readInt4) {
                    i3 = bo.b(ShortVideoGetTopVideosResponseDto.class, parcel, arrayList8, i3, 1);
                }
                arrayList2 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList3 = new ArrayList(readInt5);
                int i4 = 0;
                while (i4 != readInt5) {
                    i4 = en.a(ShortVideoQuestionnaireDto.CREATOR, parcel, arrayList3, i4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt6 = parcel.readInt();
                arrayList4 = new ArrayList(readInt6);
                int i5 = 0;
                while (i5 != readInt6) {
                    i5 = en.a(ShortVideoInterClipBlockDto.CREATOR, parcel, arrayList4, i5, 1);
                }
            }
            int i6 = 0;
            ArrayList arrayList9 = arrayList;
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt7 = parcel.readInt();
                arrayList5 = new ArrayList(readInt7);
                int i7 = 0;
                while (i7 != readInt7) {
                    i7 = en.a(ShortVideoRecomRebuildReplaceDto.CREATOR, parcel, arrayList5, i7, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt8 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(readInt8);
                while (i6 != readInt8) {
                    i6 = en.a(ShortVideoExternalOwnerDto.CREATOR, parcel, arrayList10, i6, 1);
                }
                arrayList6 = arrayList10;
            }
            return new ShortVideoGetTopVideosResponseDto(readInt, arrayList7, readString, arrayList9, arrayList2, valueOf, arrayList3, arrayList4, readString2, arrayList5, arrayList6);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoGetTopVideosResponseDto[] newArray(int i) {
            return new ShortVideoGetTopVideosResponseDto[i];
        }
    }

    public ShortVideoGetTopVideosResponseDto(int i, List<VideoVideoFullDto> list, String str, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, Boolean bool, List<ShortVideoQuestionnaireDto> list4, List<ShortVideoInterClipBlockDto> list5, String str2, List<ShortVideoRecomRebuildReplaceDto> list6, List<ShortVideoExternalOwnerDto> list7) {
        this.count = i;
        this.items = list;
        this.nextFrom = str;
        this.profiles = list2;
        this.groups = list3;
        this.showSaaFloatBtn = bool;
        this.questionnaires = list4;
        this.interClipBlocks = list5;
        this.recomFeedId = str2;
        this.videoReplaces = list6;
        this.externalOwners = list7;
    }

    public final List<GroupsGroupFullDto> d() {
        return this.groups;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<VideoVideoFullDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoGetTopVideosResponseDto)) {
            return false;
        }
        ShortVideoGetTopVideosResponseDto shortVideoGetTopVideosResponseDto = (ShortVideoGetTopVideosResponseDto) obj;
        return this.count == shortVideoGetTopVideosResponseDto.count && epx.f(this.items, shortVideoGetTopVideosResponseDto.items) && epx.f(this.nextFrom, shortVideoGetTopVideosResponseDto.nextFrom) && epx.f(this.profiles, shortVideoGetTopVideosResponseDto.profiles) && epx.f(this.groups, shortVideoGetTopVideosResponseDto.groups) && epx.f(this.showSaaFloatBtn, shortVideoGetTopVideosResponseDto.showSaaFloatBtn) && epx.f(this.questionnaires, shortVideoGetTopVideosResponseDto.questionnaires) && epx.f(this.interClipBlocks, shortVideoGetTopVideosResponseDto.interClipBlocks) && epx.f(this.recomFeedId, shortVideoGetTopVideosResponseDto.recomFeedId) && epx.f(this.videoReplaces, shortVideoGetTopVideosResponseDto.videoReplaces) && epx.f(this.externalOwners, shortVideoGetTopVideosResponseDto.externalOwners);
    }

    public final String f() {
        return this.nextFrom;
    }

    public final List<UsersUserFullDto> g() {
        return this.profiles;
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        String str = this.nextFrom;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.showSaaFloatBtn;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<ShortVideoQuestionnaireDto> list3 = this.questionnaires;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<ShortVideoInterClipBlockDto> list4 = this.interClipBlocks;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str2 = this.recomFeedId;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ShortVideoRecomRebuildReplaceDto> list5 = this.videoReplaces;
        int hashCode8 = (hashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<ShortVideoExternalOwnerDto> list6 = this.externalOwners;
        return hashCode8 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoGetTopVideosResponseDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        sb.append(this.nextFrom);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        sb.append(this.groups);
        sb.append(", showSaaFloatBtn=");
        sb.append(this.showSaaFloatBtn);
        sb.append(", questionnaires=");
        sb.append(this.questionnaires);
        sb.append(", interClipBlocks=");
        sb.append(this.interClipBlocks);
        sb.append(", recomFeedId=");
        sb.append(this.recomFeedId);
        sb.append(", videoReplaces=");
        sb.append(this.videoReplaces);
        sb.append(", externalOwners=");
        return ms9.a(')', sb, this.externalOwners);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.nextFrom);
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
        Boolean bool = this.showSaaFloatBtn;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<ShortVideoQuestionnaireDto> list3 = this.questionnaires;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((ShortVideoQuestionnaireDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        List<ShortVideoInterClipBlockDto> list4 = this.interClipBlocks;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((ShortVideoInterClipBlockDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.recomFeedId);
        List<ShortVideoRecomRebuildReplaceDto> list5 = this.videoReplaces;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((ShortVideoRecomRebuildReplaceDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        List<ShortVideoExternalOwnerDto> list6 = this.externalOwners;
        if (list6 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f6 = dn.f(parcel, list6, 1);
        while (f6.hasNext()) {
            ((ShortVideoExternalOwnerDto) f6.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ ShortVideoGetTopVideosResponseDto(int i, List list, String str, List list2, List list3, Boolean bool, List list4, List list5, String str2, List list6, List list7, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : list4, (i2 & 128) != 0 ? null : list5, (i2 & 256) != 0 ? null : str2, (i2 & 512) != 0 ? null : list6, (i2 & 1024) != 0 ? null : list7);
    }
}
