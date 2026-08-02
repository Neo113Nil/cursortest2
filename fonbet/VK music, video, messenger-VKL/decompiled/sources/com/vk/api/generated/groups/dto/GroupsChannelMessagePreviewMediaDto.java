package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: GroupsChannelMessagePreviewMediaDto.kt */
/* loaded from: classes14.dex */
public final class GroupsChannelMessagePreviewMediaDto implements Parcelable {
    public static final Parcelable.Creator<GroupsChannelMessagePreviewMediaDto> CREATOR = new a();

    @pmi0("frame_aspect_ratio")
    private final Float frameAspectRatio;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("media_type")
    private final String mediaType;

    /* compiled from: GroupsChannelMessagePreviewMediaDto.kt */
    public static final class a implements Parcelable.Creator<GroupsChannelMessagePreviewMediaDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsChannelMessagePreviewMediaDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new GroupsChannelMessagePreviewMediaDto(readString, arrayList, parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsChannelMessagePreviewMediaDto[] newArray(int i) {
            return new GroupsChannelMessagePreviewMediaDto[i];
        }
    }

    public GroupsChannelMessagePreviewMediaDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsChannelMessagePreviewMediaDto)) {
            return false;
        }
        GroupsChannelMessagePreviewMediaDto groupsChannelMessagePreviewMediaDto = (GroupsChannelMessagePreviewMediaDto) obj;
        return epx.f(this.mediaType, groupsChannelMessagePreviewMediaDto.mediaType) && epx.f(this.images, groupsChannelMessagePreviewMediaDto.images) && epx.f(this.frameAspectRatio, groupsChannelMessagePreviewMediaDto.frameAspectRatio);
    }

    public final int hashCode() {
        String str = this.mediaType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Float f = this.frameAspectRatio;
        return hashCode2 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsChannelMessagePreviewMediaDto(mediaType=");
        sb.append(this.mediaType);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", frameAspectRatio=");
        return so.b(sb, this.frameAspectRatio, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mediaType);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Float f2 = this.frameAspectRatio;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
    }

    public GroupsChannelMessagePreviewMediaDto(String str, List<BaseImageDto> list, Float f) {
        this.mediaType = str;
        this.images = list;
        this.frameAspectRatio = f;
    }

    public /* synthetic */ GroupsChannelMessagePreviewMediaDto(String str, List list, Float f, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : f);
    }
}
