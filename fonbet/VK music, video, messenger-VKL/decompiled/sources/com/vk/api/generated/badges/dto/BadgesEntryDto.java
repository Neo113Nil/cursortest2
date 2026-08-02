package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.zcl;

/* compiled from: BadgesEntryDto.kt */
/* loaded from: classes14.dex */
public final class BadgesEntryDto implements Parcelable {
    public static final Parcelable.Creator<BadgesEntryDto> CREATOR = new a();

    @pmi0("badge_id")
    private final int badgeId;

    @pmi0("donut_amount")
    private final String donutAmount;

    @pmi0("id")
    private final int id;

    @pmi0("is_anonymous")
    private final Boolean isAnonymous;

    @pmi0("is_private")
    private final Boolean isPrivate;

    @pmi0("object_description")
    private final String objectDescription;

    @pmi0("object_id")
    private final Integer objectId;

    @pmi0("object_owner_id")
    private final Integer objectOwnerId;

    @pmi0("object_type")
    private final Integer objectType;

    @pmi0("sender_id")
    private final UserId senderId;

    /* compiled from: BadgesEntryDto.kt */
    public static final class a implements Parcelable.Creator<BadgesEntryDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesEntryDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Boolean bool = null;
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(BadgesEntryDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BadgesEntryDto(readInt, readInt2, valueOf2, valueOf3, valueOf4, readString, userId, valueOf, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesEntryDto[] newArray(int i) {
            return new BadgesEntryDto[i];
        }
    }

    public BadgesEntryDto(int i, int i2, Integer num, Integer num2, Integer num3, String str, UserId userId, Boolean bool, Boolean bool2, String str2) {
        this.id = i;
        this.badgeId = i2;
        this.objectType = num;
        this.objectOwnerId = num2;
        this.objectId = num3;
        this.objectDescription = str;
        this.senderId = userId;
        this.isPrivate = bool;
        this.isAnonymous = bool2;
        this.donutAmount = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesEntryDto)) {
            return false;
        }
        BadgesEntryDto badgesEntryDto = (BadgesEntryDto) obj;
        return this.id == badgesEntryDto.id && this.badgeId == badgesEntryDto.badgeId && epx.f(this.objectType, badgesEntryDto.objectType) && epx.f(this.objectOwnerId, badgesEntryDto.objectOwnerId) && epx.f(this.objectId, badgesEntryDto.objectId) && epx.f(this.objectDescription, badgesEntryDto.objectDescription) && epx.f(this.senderId, badgesEntryDto.senderId) && epx.f(this.isPrivate, badgesEntryDto.isPrivate) && epx.f(this.isAnonymous, badgesEntryDto.isAnonymous) && epx.f(this.donutAmount, badgesEntryDto.donutAmount);
    }

    public final int hashCode() {
        int a2 = shy.a(this.badgeId, Integer.hashCode(this.id) * 31, 31);
        Integer num = this.objectType;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.objectOwnerId;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.objectId;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.objectDescription;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.senderId;
        int hashCode5 = (hashCode4 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool = this.isPrivate;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAnonymous;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.donutAmount;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesEntryDto(id=");
        sb.append(this.id);
        sb.append(", badgeId=");
        sb.append(this.badgeId);
        sb.append(", objectType=");
        sb.append(this.objectType);
        sb.append(", objectOwnerId=");
        sb.append(this.objectOwnerId);
        sb.append(", objectId=");
        sb.append(this.objectId);
        sb.append(", objectDescription=");
        sb.append(this.objectDescription);
        sb.append(", senderId=");
        sb.append(this.senderId);
        sb.append(", isPrivate=");
        sb.append(this.isPrivate);
        sb.append(", isAnonymous=");
        sb.append(this.isAnonymous);
        sb.append(", donutAmount=");
        return ho8.a(sb, this.donutAmount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.badgeId);
        Integer num = this.objectType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.objectOwnerId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.objectId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.objectDescription);
        parcel.writeParcelable(this.senderId, i);
        Boolean bool = this.isPrivate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isAnonymous;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.donutAmount);
    }

    public /* synthetic */ BadgesEntryDto(int i, int i2, Integer num, Integer num2, Integer num3, String str, UserId userId, Boolean bool, Boolean bool2, String str2, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2, (i3 & 16) != 0 ? null : num3, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : userId, (i3 & 128) != 0 ? null : bool, (i3 & 256) != 0 ? null : bool2, (i3 & 512) != 0 ? null : str2);
    }
}
