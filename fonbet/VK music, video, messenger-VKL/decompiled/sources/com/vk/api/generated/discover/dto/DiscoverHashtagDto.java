package com.vk.api.generated.discover.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DiscoverHashtagDto.kt */
/* loaded from: classes14.dex */
public final class DiscoverHashtagDto implements Parcelable {
    public static final Parcelable.Creator<DiscoverHashtagDto> CREATOR = new a();

    @pmi0("action")
    private final DiscoverActionDto action;

    @pmi0("caption")
    private final String caption;

    @pmi0("images")
    private final List<PhotosPhotoSizesDto> images;

    @pmi0("name")
    private final String name;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: DiscoverHashtagDto.kt */
    public static final class a implements Parcelable.Creator<DiscoverHashtagDto> {
        @Override // android.os.Parcelable.Creator
        public final DiscoverHashtagDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(DiscoverHashtagDto.class, parcel, arrayList, i, 1);
                }
            }
            return new DiscoverHashtagDto(readString, arrayList, parcel.readInt() != 0 ? DiscoverActionDto.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DiscoverHashtagDto[] newArray(int i) {
            return new DiscoverHashtagDto[i];
        }
    }

    public DiscoverHashtagDto(String str, List<PhotosPhotoSizesDto> list, DiscoverActionDto discoverActionDto, String str2, String str3) {
        this.name = str;
        this.images = list;
        this.action = discoverActionDto;
        this.caption = str2;
        this.trackCode = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverHashtagDto)) {
            return false;
        }
        DiscoverHashtagDto discoverHashtagDto = (DiscoverHashtagDto) obj;
        return epx.f(this.name, discoverHashtagDto.name) && epx.f(this.images, discoverHashtagDto.images) && epx.f(this.action, discoverHashtagDto.action) && epx.f(this.caption, discoverHashtagDto.caption) && epx.f(this.trackCode, discoverHashtagDto.trackCode);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        List<PhotosPhotoSizesDto> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        DiscoverActionDto discoverActionDto = this.action;
        int hashCode3 = (hashCode2 + (discoverActionDto == null ? 0 : discoverActionDto.hashCode())) * 31;
        String str = this.caption;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverHashtagDto(name=");
        sb.append(this.name);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", caption=");
        sb.append(this.caption);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        List<PhotosPhotoSizesDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        DiscoverActionDto discoverActionDto = this.action;
        if (discoverActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discoverActionDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.caption);
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ DiscoverHashtagDto(String str, List list, DiscoverActionDto discoverActionDto, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : discoverActionDto, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
