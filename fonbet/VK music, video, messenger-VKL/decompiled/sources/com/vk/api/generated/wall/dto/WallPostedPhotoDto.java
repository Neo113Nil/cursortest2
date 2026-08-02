package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallPostedPhotoDto.kt */
/* loaded from: classes15.dex */
public final class WallPostedPhotoDto implements Parcelable {
    public static final Parcelable.Creator<WallPostedPhotoDto> CREATOR = new a();

    @pmi0("id")
    private final Integer id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("photo_130")
    private final String photo130;

    @pmi0("photo_604")
    private final String photo604;

    /* compiled from: WallPostedPhotoDto.kt */
    public static final class a implements Parcelable.Creator<WallPostedPhotoDto> {
        @Override // android.os.Parcelable.Creator
        public final WallPostedPhotoDto createFromParcel(Parcel parcel) {
            return new WallPostedPhotoDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(WallPostedPhotoDto.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallPostedPhotoDto[] newArray(int i) {
            return new WallPostedPhotoDto[i];
        }
    }

    public WallPostedPhotoDto() {
        this(null, null, null, null, 15, null);
    }

    public final Integer d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.photo130;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallPostedPhotoDto)) {
            return false;
        }
        WallPostedPhotoDto wallPostedPhotoDto = (WallPostedPhotoDto) obj;
        return epx.f(this.id, wallPostedPhotoDto.id) && epx.f(this.ownerId, wallPostedPhotoDto.ownerId) && epx.f(this.photo130, wallPostedPhotoDto.photo130) && epx.f(this.photo604, wallPostedPhotoDto.photo604);
    }

    public final String f() {
        return this.photo604;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.ownerId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.photo130;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo604;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallPostedPhotoDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", photo130=");
        sb.append(this.photo130);
        sb.append(", photo604=");
        return ho8.a(sb, this.photo604, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.photo130);
        parcel.writeString(this.photo604);
    }

    public WallPostedPhotoDto(Integer num, UserId userId, String str, String str2) {
        this.id = num;
        this.ownerId = userId;
        this.photo130 = str;
        this.photo604 = str2;
    }

    public /* synthetic */ WallPostedPhotoDto(Integer num, UserId userId, String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
