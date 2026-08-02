package com.vk.api.generated.wishlists.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WishlistsParticipatingUserDto.kt */
/* loaded from: classes15.dex */
public final class WishlistsParticipatingUserDto implements Parcelable {
    public static final Parcelable.Creator<WishlistsParticipatingUserDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    @pmi0("thumb_url")
    private final String thumbUrl;

    /* compiled from: WishlistsParticipatingUserDto.kt */
    public static final class a implements Parcelable.Creator<WishlistsParticipatingUserDto> {
        @Override // android.os.Parcelable.Creator
        public final WishlistsParticipatingUserDto createFromParcel(Parcel parcel) {
            return new WishlistsParticipatingUserDto((UserId) parcel.readParcelable(WishlistsParticipatingUserDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WishlistsParticipatingUserDto[] newArray(int i) {
            return new WishlistsParticipatingUserDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WishlistsParticipatingUserDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WishlistsParticipatingUserDto)) {
            return false;
        }
        WishlistsParticipatingUserDto wishlistsParticipatingUserDto = (WishlistsParticipatingUserDto) obj;
        return epx.f(this.id, wishlistsParticipatingUserDto.id) && epx.f(this.thumbUrl, wishlistsParticipatingUserDto.thumbUrl);
    }

    public final int hashCode() {
        UserId userId = this.id;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.thumbUrl;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WishlistsParticipatingUserDto(id=");
        sb.append(this.id);
        sb.append(", thumbUrl=");
        return ho8.a(sb, this.thumbUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.thumbUrl);
    }

    public WishlistsParticipatingUserDto(UserId userId, String str) {
        this.id = userId;
        this.thumbUrl = str;
    }

    public /* synthetic */ WishlistsParticipatingUserDto(UserId userId, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str);
    }
}
