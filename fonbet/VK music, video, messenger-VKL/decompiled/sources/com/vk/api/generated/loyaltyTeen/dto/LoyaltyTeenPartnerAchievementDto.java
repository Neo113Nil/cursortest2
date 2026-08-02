package com.vk.api.generated.loyaltyTeen.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: LoyaltyTeenPartnerAchievementDto.kt */
/* loaded from: classes14.dex */
public final class LoyaltyTeenPartnerAchievementDto implements Parcelable {
    public static final Parcelable.Creator<LoyaltyTeenPartnerAchievementDto> CREATOR = new a();

    @pmi0("achieved_at")
    private final Integer achievedAt;

    @pmi0("achievement_description")
    private final String achievementDescription;

    @pmi0("achievement_id")
    private final int achievementId;

    @pmi0("achievement_title")
    private final String achievementTitle;

    @pmi0("category_id")
    private final Integer categoryId;

    @pmi0("category_name")
    private final String categoryName;

    @pmi0("is_can_reward")
    private final Boolean isCanReward;

    @pmi0("is_complete")
    private final Boolean isComplete;

    @pmi0("logo")
    private final List<BaseImageDto> logo;

    @pmi0("logo_3d")
    private final List<BaseImageDto> logo3d;

    @pmi0("quantity")
    private final Integer quantity;

    @pmi0("repeatable")
    private final Integer repeatable;

    /* compiled from: LoyaltyTeenPartnerAchievementDto.kt */
    public static final class a implements Parcelable.Creator<LoyaltyTeenPartnerAchievementDto> {
        @Override // android.os.Parcelable.Creator
        public final LoyaltyTeenPartnerAchievementDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean valueOf;
            Boolean valueOf2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = bo.b(LoyaltyTeenPartnerAchievementDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = bo.b(LoyaltyTeenPartnerAchievementDto.class, parcel, arrayList2, i2, 1);
                }
            }
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            return new LoyaltyTeenPartnerAchievementDto(readInt, readString, readString2, arrayList, arrayList2, valueOf3, valueOf, valueOf2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final LoyaltyTeenPartnerAchievementDto[] newArray(int i) {
            return new LoyaltyTeenPartnerAchievementDto[i];
        }
    }

    public LoyaltyTeenPartnerAchievementDto(int i, String str, String str2, List<BaseImageDto> list, List<BaseImageDto> list2, Integer num, Boolean bool, Boolean bool2, Integer num2, String str3, Integer num3, Integer num4) {
        this.achievementId = i;
        this.achievementTitle = str;
        this.achievementDescription = str2;
        this.logo = list;
        this.logo3d = list2;
        this.achievedAt = num;
        this.isCanReward = bool;
        this.isComplete = bool2;
        this.categoryId = num2;
        this.categoryName = str3;
        this.repeatable = num3;
        this.quantity = num4;
    }

    public final String d() {
        return this.achievementDescription;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.achievementId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltyTeenPartnerAchievementDto)) {
            return false;
        }
        LoyaltyTeenPartnerAchievementDto loyaltyTeenPartnerAchievementDto = (LoyaltyTeenPartnerAchievementDto) obj;
        return this.achievementId == loyaltyTeenPartnerAchievementDto.achievementId && epx.f(this.achievementTitle, loyaltyTeenPartnerAchievementDto.achievementTitle) && epx.f(this.achievementDescription, loyaltyTeenPartnerAchievementDto.achievementDescription) && epx.f(this.logo, loyaltyTeenPartnerAchievementDto.logo) && epx.f(this.logo3d, loyaltyTeenPartnerAchievementDto.logo3d) && epx.f(this.achievedAt, loyaltyTeenPartnerAchievementDto.achievedAt) && epx.f(this.isCanReward, loyaltyTeenPartnerAchievementDto.isCanReward) && epx.f(this.isComplete, loyaltyTeenPartnerAchievementDto.isComplete) && epx.f(this.categoryId, loyaltyTeenPartnerAchievementDto.categoryId) && epx.f(this.categoryName, loyaltyTeenPartnerAchievementDto.categoryName) && epx.f(this.repeatable, loyaltyTeenPartnerAchievementDto.repeatable) && epx.f(this.quantity, loyaltyTeenPartnerAchievementDto.quantity);
    }

    public final String f() {
        return this.achievementTitle;
    }

    public final List<BaseImageDto> g() {
        return this.logo;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.achievementId) * 31, 31, this.achievementTitle);
        String str = this.achievementDescription;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.logo;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.logo3d;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.achievedAt;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isCanReward;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isComplete;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.categoryId;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.categoryName;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.repeatable;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.quantity;
        return hashCode9 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoyaltyTeenPartnerAchievementDto(achievementId=");
        sb.append(this.achievementId);
        sb.append(", achievementTitle=");
        sb.append(this.achievementTitle);
        sb.append(", achievementDescription=");
        sb.append(this.achievementDescription);
        sb.append(", logo=");
        sb.append(this.logo);
        sb.append(", logo3d=");
        sb.append(this.logo3d);
        sb.append(", achievedAt=");
        sb.append(this.achievedAt);
        sb.append(", isCanReward=");
        sb.append(this.isCanReward);
        sb.append(", isComplete=");
        sb.append(this.isComplete);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", categoryName=");
        sb.append(this.categoryName);
        sb.append(", repeatable=");
        sb.append(this.repeatable);
        sb.append(", quantity=");
        return uqi.b(sb, this.quantity, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.achievementId);
        parcel.writeString(this.achievementTitle);
        parcel.writeString(this.achievementDescription);
        List<BaseImageDto> list = this.logo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseImageDto> list2 = this.logo3d;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                parcel.writeParcelable((Parcelable) f2.next(), i);
            }
        }
        Integer num = this.achievedAt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isCanReward;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isComplete;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num2 = this.categoryId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.categoryName);
        Integer num3 = this.repeatable;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.quantity;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public /* synthetic */ LoyaltyTeenPartnerAchievementDto(int i, String str, String str2, List list, List list2, Integer num, Boolean bool, Boolean bool2, Integer num2, String str3, Integer num3, Integer num4, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : bool2, (i2 & 256) != 0 ? null : num2, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? null : num3, (i2 & 2048) != 0 ? null : num4);
    }
}
