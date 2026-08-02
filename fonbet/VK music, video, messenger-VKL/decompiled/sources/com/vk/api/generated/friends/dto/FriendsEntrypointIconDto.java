package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsEntrypointIconDto.kt */
/* loaded from: classes14.dex */
public final class FriendsEntrypointIconDto implements Parcelable {
    public static final Parcelable.Creator<FriendsEntrypointIconDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("photo_url")
    private final String photoUrl;

    @pmi0("sizes")
    private final List<BaseImageDto> sizes;

    /* compiled from: FriendsEntrypointIconDto.kt */
    public static final class a implements Parcelable.Creator<FriendsEntrypointIconDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsEntrypointIconDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(FriendsEntrypointIconDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new FriendsEntrypointIconDto(readString, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsEntrypointIconDto[] newArray(int i) {
            return new FriendsEntrypointIconDto[i];
        }
    }

    public FriendsEntrypointIconDto(String str, List<BaseImageDto> list, String str2) {
        this.name = str;
        this.sizes = list;
        this.photoUrl = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsEntrypointIconDto)) {
            return false;
        }
        FriendsEntrypointIconDto friendsEntrypointIconDto = (FriendsEntrypointIconDto) obj;
        return epx.f(this.name, friendsEntrypointIconDto.name) && epx.f(this.sizes, friendsEntrypointIconDto.sizes) && epx.f(this.photoUrl, friendsEntrypointIconDto.photoUrl);
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        List<BaseImageDto> list = this.sizes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.photoUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FriendsEntrypointIconDto(name=");
        sb.append(this.name);
        sb.append(", sizes=");
        sb.append(this.sizes);
        sb.append(", photoUrl=");
        return ho8.a(sb, this.photoUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        List<BaseImageDto> list = this.sizes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.photoUrl);
    }

    public /* synthetic */ FriendsEntrypointIconDto(String str, List list, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2);
    }
}
