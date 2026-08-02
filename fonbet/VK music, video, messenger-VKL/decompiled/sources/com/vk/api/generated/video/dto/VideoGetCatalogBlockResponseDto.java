package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoGetCatalogBlockResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetCatalogBlockResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetCatalogBlockResponseDto> CREATOR = new a();

    @pmi0("block")
    private final VideoCatalogBlockDto block;

    @pmi0("groups")
    private final List<GroupsGroupDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    /* compiled from: VideoGetCatalogBlockResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetCatalogBlockResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetCatalogBlockResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            VideoCatalogBlockDto createFromParcel = VideoCatalogBlockDto.CREATOR.createFromParcel(parcel);
            int i = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(VideoGetCatalogBlockResponseDto.class, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(VideoGetCatalogBlockResponseDto.class, parcel, arrayList2, i, 1);
                }
            }
            return new VideoGetCatalogBlockResponseDto(createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetCatalogBlockResponseDto[] newArray(int i) {
            return new VideoGetCatalogBlockResponseDto[i];
        }
    }

    public VideoGetCatalogBlockResponseDto(VideoCatalogBlockDto videoCatalogBlockDto, List<UsersUserFullDto> list, List<GroupsGroupDto> list2) {
        this.block = videoCatalogBlockDto;
        this.profiles = list;
        this.groups = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetCatalogBlockResponseDto)) {
            return false;
        }
        VideoGetCatalogBlockResponseDto videoGetCatalogBlockResponseDto = (VideoGetCatalogBlockResponseDto) obj;
        return epx.f(this.block, videoGetCatalogBlockResponseDto.block) && epx.f(this.profiles, videoGetCatalogBlockResponseDto.profiles) && epx.f(this.groups, videoGetCatalogBlockResponseDto.groups);
    }

    public final int hashCode() {
        int hashCode = this.block.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetCatalogBlockResponseDto(block=");
        sb.append(this.block);
        sb.append(", profiles=");
        sb.append(this.profiles);
        sb.append(", groups=");
        return ms9.a(')', sb, this.groups);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.block.writeToParcel(parcel, i);
        List<UsersUserFullDto> list = this.profiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<GroupsGroupDto> list2 = this.groups;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ VideoGetCatalogBlockResponseDto(VideoCatalogBlockDto videoCatalogBlockDto, List list, List list2, int i, zcl zclVar) {
        this(videoCatalogBlockDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
