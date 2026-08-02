package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: StickersOrderRecipientDto.kt */
/* loaded from: classes15.dex */
public final class StickersOrderRecipientDto implements Parcelable {
    public static final Parcelable.Creator<StickersOrderRecipientDto> CREATOR = new a();

    @pmi0("can_access_closed")
    private final Boolean canAccessClosed;

    @pmi0("deactivated")
    private final String deactivated;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("hidden")
    private final Integer hidden;

    @pmi0("id")
    private final UserId id;

    @pmi0("is_cached")
    private final Boolean isCached;

    @pmi0("is_closed")
    private final Boolean isClosed;

    @pmi0("last_name")
    private final String lastName;

    /* compiled from: StickersOrderRecipientDto.kt */
    public static final class a implements Parcelable.Creator<StickersOrderRecipientDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersOrderRecipientDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Boolean bool;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            UserId userId = (UserId) parcel.readParcelable(StickersOrderRecipientDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                bool = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                bool = null;
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = bool;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = bool;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = bool;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StickersOrderRecipientDto(userId, readString, readString2, valueOf, readString3, valueOf2, valueOf3, valueOf4);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersOrderRecipientDto[] newArray(int i) {
            return new StickersOrderRecipientDto[i];
        }
    }

    public StickersOrderRecipientDto(UserId userId, String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.id = userId;
        this.deactivated = str;
        this.firstName = str2;
        this.hidden = num;
        this.lastName = str3;
        this.canAccessClosed = bool;
        this.isClosed = bool2;
        this.isCached = bool3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersOrderRecipientDto)) {
            return false;
        }
        StickersOrderRecipientDto stickersOrderRecipientDto = (StickersOrderRecipientDto) obj;
        return epx.f(this.id, stickersOrderRecipientDto.id) && epx.f(this.deactivated, stickersOrderRecipientDto.deactivated) && epx.f(this.firstName, stickersOrderRecipientDto.firstName) && epx.f(this.hidden, stickersOrderRecipientDto.hidden) && epx.f(this.lastName, stickersOrderRecipientDto.lastName) && epx.f(this.canAccessClosed, stickersOrderRecipientDto.canAccessClosed) && epx.f(this.isClosed, stickersOrderRecipientDto.isClosed) && epx.f(this.isCached, stickersOrderRecipientDto.isCached);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        String str = this.deactivated;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.hidden;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.lastName;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.canAccessClosed;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClosed;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCached;
        return hashCode7 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersOrderRecipientDto(id=");
        sb.append(this.id);
        sb.append(", deactivated=");
        sb.append(this.deactivated);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", hidden=");
        sb.append(this.hidden);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", canAccessClosed=");
        sb.append(this.canAccessClosed);
        sb.append(", isClosed=");
        sb.append(this.isClosed);
        sb.append(", isCached=");
        return tn.a(sb, this.isCached, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.deactivated);
        parcel.writeString(this.firstName);
        Integer num = this.hidden;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.lastName);
        Boolean bool = this.canAccessClosed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isClosed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isCached;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
    }

    public /* synthetic */ StickersOrderRecipientDto(UserId userId, String str, String str2, Integer num, String str3, Boolean bool, Boolean bool2, Boolean bool3, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : bool3);
    }
}
