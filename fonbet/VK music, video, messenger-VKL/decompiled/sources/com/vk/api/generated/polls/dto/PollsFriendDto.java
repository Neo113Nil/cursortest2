package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;

/* compiled from: PollsFriendDto.kt */
/* loaded from: classes15.dex */
public final class PollsFriendDto implements Parcelable {
    public static final Parcelable.Creator<PollsFriendDto> CREATOR = new a();

    @pmi0("id")
    private final UserId id;

    /* compiled from: PollsFriendDto.kt */
    public static final class a implements Parcelable.Creator<PollsFriendDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsFriendDto createFromParcel(Parcel parcel) {
            return new PollsFriendDto((UserId) parcel.readParcelable(PollsFriendDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PollsFriendDto[] newArray(int i) {
            return new PollsFriendDto[i];
        }
    }

    public PollsFriendDto(UserId userId) {
        this.id = userId;
    }

    public final UserId d() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PollsFriendDto) && epx.f(this.id, ((PollsFriendDto) obj).id);
    }

    public final int hashCode() {
        return Long.hashCode(this.id.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("PollsFriendDto(id="), this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
    }
}
