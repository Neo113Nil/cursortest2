package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ShortVideoPlaylistFullDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoPlaylistFullDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoPlaylistFullDto> CREATOR = new a();

    @pmi0("alias")
    private final String alias;

    @pmi0("count")
    private final int count;

    @pmi0("id")
    private final int id;

    @pmi0("images")
    private final List<List<BaseImageDto>> images;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final ShortVideoPlaylistTypeEnumDto type;

    /* compiled from: ShortVideoPlaylistFullDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoPlaylistFullDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoPlaylistFullDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ShortVideoPlaylistTypeEnumDto createFromParcel = ShortVideoPlaylistTypeEnumDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(ShortVideoPlaylistFullDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                for (int i = 0; i != readInt3; i++) {
                    int readInt4 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt4);
                    int i2 = 0;
                    while (i2 != readInt4) {
                        i2 = bo.b(ShortVideoPlaylistFullDto.class, parcel, arrayList2, i2, 1);
                    }
                    arrayList.add(arrayList2);
                }
            }
            return new ShortVideoPlaylistFullDto(createFromParcel, readInt, readInt2, userId, readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoPlaylistFullDto[] newArray(int i) {
            return new ShortVideoPlaylistFullDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideoPlaylistFullDto(ShortVideoPlaylistTypeEnumDto shortVideoPlaylistTypeEnumDto, int i, int i2, UserId userId, String str, String str2, List<? extends List<BaseImageDto>> list) {
        this.type = shortVideoPlaylistTypeEnumDto;
        this.count = i;
        this.id = i2;
        this.ownerId = userId;
        this.title = str;
        this.alias = str2;
        this.images = list;
    }

    public final String d() {
        return this.alias;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<List<BaseImageDto>> e() {
        return this.images;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoPlaylistFullDto)) {
            return false;
        }
        ShortVideoPlaylistFullDto shortVideoPlaylistFullDto = (ShortVideoPlaylistFullDto) obj;
        return this.type == shortVideoPlaylistFullDto.type && this.count == shortVideoPlaylistFullDto.count && this.id == shortVideoPlaylistFullDto.id && epx.f(this.ownerId, shortVideoPlaylistFullDto.ownerId) && epx.f(this.title, shortVideoPlaylistFullDto.title) && epx.f(this.alias, shortVideoPlaylistFullDto.alias) && epx.f(this.images, shortVideoPlaylistFullDto.images);
    }

    public final int getCount() {
        return this.count;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(shy.a(this.id, shy.a(this.count, this.type.hashCode() * 31, 31), 31), 31, this.ownerId.b), 31, this.title);
        String str = this.alias;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<List<BaseImageDto>> list = this.images;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoPlaylistFullDto(type=");
        sb.append(this.type);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", alias=");
        sb.append(this.alias);
        sb.append(", images=");
        return ms9.a(')', sb, this.images);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.count);
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeString(this.alias);
        List<List<BaseImageDto>> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            Iterator a2 = ao.a(parcel, (List) f.next());
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
        }
    }

    public /* synthetic */ ShortVideoPlaylistFullDto(ShortVideoPlaylistTypeEnumDto shortVideoPlaylistTypeEnumDto, int i, int i2, UserId userId, String str, String str2, List list, int i3, zcl zclVar) {
        this(shortVideoPlaylistTypeEnumDto, i, i2, userId, str, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : list);
    }
}
