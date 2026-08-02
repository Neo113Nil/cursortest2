package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: BadgesCommentInfoDto.kt */
/* loaded from: classes14.dex */
public final class BadgesCommentInfoDto implements Parcelable {
    public static final Parcelable.Creator<BadgesCommentInfoDto> CREATOR = new a();

    @pmi0("is_disabled")
    private final Boolean isDisabled;

    /* compiled from: BadgesCommentInfoDto.kt */
    public static final class a implements Parcelable.Creator<BadgesCommentInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesCommentInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BadgesCommentInfoDto(valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesCommentInfoDto[] newArray(int i) {
            return new BadgesCommentInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BadgesCommentInfoDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BadgesCommentInfoDto) && epx.f(this.isDisabled, ((BadgesCommentInfoDto) obj).isDisabled);
    }

    public final int hashCode() {
        Boolean bool = this.isDisabled;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(new StringBuilder("BadgesCommentInfoDto(isDisabled="), this.isDisabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isDisabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public BadgesCommentInfoDto(Boolean bool) {
        this.isDisabled = bool;
    }

    public /* synthetic */ BadgesCommentInfoDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
