package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UsersSubscriptionItemTrackCodeDto.kt */
/* loaded from: classes15.dex */
public final class UsersSubscriptionItemTrackCodeDto implements Parcelable {
    public static final Parcelable.Creator<UsersSubscriptionItemTrackCodeDto> CREATOR = new a();

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: UsersSubscriptionItemTrackCodeDto.kt */
    public static final class a implements Parcelable.Creator<UsersSubscriptionItemTrackCodeDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersSubscriptionItemTrackCodeDto createFromParcel(Parcel parcel) {
            return new UsersSubscriptionItemTrackCodeDto((UserId) parcel.readParcelable(UsersSubscriptionItemTrackCodeDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersSubscriptionItemTrackCodeDto[] newArray(int i) {
            return new UsersSubscriptionItemTrackCodeDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UsersSubscriptionItemTrackCodeDto() {
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
        if (!(obj instanceof UsersSubscriptionItemTrackCodeDto)) {
            return false;
        }
        UsersSubscriptionItemTrackCodeDto usersSubscriptionItemTrackCodeDto = (UsersSubscriptionItemTrackCodeDto) obj;
        return epx.f(this.ownerId, usersSubscriptionItemTrackCodeDto.ownerId) && epx.f(this.trackCode, usersSubscriptionItemTrackCodeDto.trackCode);
    }

    public final int hashCode() {
        UserId userId = this.ownerId;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.trackCode;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersSubscriptionItemTrackCodeDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.trackCode);
    }

    public UsersSubscriptionItemTrackCodeDto(UserId userId, String str) {
        this.ownerId = userId;
        this.trackCode = str;
    }

    public /* synthetic */ UsersSubscriptionItemTrackCodeDto(UserId userId, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId, (i & 2) != 0 ? null : str);
    }
}
