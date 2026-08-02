package com.vk.api.generated.users.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;

/* compiled from: UsersPromotionAllowanceDto.kt */
/* loaded from: classes15.dex */
public final class UsersPromotionAllowanceDto implements Parcelable {
    public static final Parcelable.Creator<UsersPromotionAllowanceDto> CREATOR = new a();

    @pmi0("has_two_factor_authentication")
    private final Boolean hasTwoFactorAuthentication;

    @pmi0("is_allowed")
    private final boolean isAllowed;

    @pmi0("is_joined_allowable")
    private final Boolean isJoinedAllowable;

    @pmi0("is_opened")
    private final Boolean isOpened;

    @pmi0("is_verified")
    private final Boolean isVerified;

    @pmi0("promotion_disabled_days_left")
    private final Integer promotionDisabledDaysLeft;

    @pmi0("reason")
    private final String reason;

    /* compiled from: UsersPromotionAllowanceDto.kt */
    public static final class a implements Parcelable.Creator<UsersPromotionAllowanceDto> {
        @Override // android.os.Parcelable.Creator
        public final UsersPromotionAllowanceDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UsersPromotionAllowanceDto(z, valueOf, valueOf2, valueOf3, valueOf4, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsersPromotionAllowanceDto[] newArray(int i) {
            return new UsersPromotionAllowanceDto[i];
        }
    }

    public UsersPromotionAllowanceDto(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, String str) {
        this.isAllowed = z;
        this.isVerified = bool;
        this.hasTwoFactorAuthentication = bool2;
        this.isOpened = bool3;
        this.isJoinedAllowable = bool4;
        this.promotionDisabledDaysLeft = num;
        this.reason = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersPromotionAllowanceDto)) {
            return false;
        }
        UsersPromotionAllowanceDto usersPromotionAllowanceDto = (UsersPromotionAllowanceDto) obj;
        return this.isAllowed == usersPromotionAllowanceDto.isAllowed && epx.f(this.isVerified, usersPromotionAllowanceDto.isVerified) && epx.f(this.hasTwoFactorAuthentication, usersPromotionAllowanceDto.hasTwoFactorAuthentication) && epx.f(this.isOpened, usersPromotionAllowanceDto.isOpened) && epx.f(this.isJoinedAllowable, usersPromotionAllowanceDto.isJoinedAllowable) && epx.f(this.promotionDisabledDaysLeft, usersPromotionAllowanceDto.promotionDisabledDaysLeft) && epx.f(this.reason, usersPromotionAllowanceDto.reason);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isAllowed) * 31;
        Boolean bool = this.isVerified;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasTwoFactorAuthentication;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isOpened;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isJoinedAllowable;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.promotionDisabledDaysLeft;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.reason;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsersPromotionAllowanceDto(isAllowed=");
        sb.append(this.isAllowed);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(", hasTwoFactorAuthentication=");
        sb.append(this.hasTwoFactorAuthentication);
        sb.append(", isOpened=");
        sb.append(this.isOpened);
        sb.append(", isJoinedAllowable=");
        sb.append(this.isJoinedAllowable);
        sb.append(", promotionDisabledDaysLeft=");
        sb.append(this.promotionDisabledDaysLeft);
        sb.append(", reason=");
        return ho8.a(sb, this.reason, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isAllowed ? 1 : 0);
        Boolean bool = this.isVerified;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.hasTwoFactorAuthentication;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isOpened;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isJoinedAllowable;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Integer num = this.promotionDisabledDaysLeft;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.reason);
    }

    public /* synthetic */ UsersPromotionAllowanceDto(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, String str, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str);
    }
}
