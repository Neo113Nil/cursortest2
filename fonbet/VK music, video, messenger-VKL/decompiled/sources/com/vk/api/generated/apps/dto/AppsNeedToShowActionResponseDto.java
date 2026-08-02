package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.gp;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsNeedToShowActionResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsNeedToShowActionResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsNeedToShowActionResponseDto> CREATOR = new a();

    @pmi0("need_to_show_group_id")
    private final UserId needToShowGroupId;

    @pmi0("need_to_show_on_close_time")
    private final Integer needToShowOnCloseTime;

    @pmi0("need_to_show_on_start")
    private final Boolean needToShowOnStart;

    @pmi0(NotificationCompat.CATEGORY_RECOMMENDATION)
    private final List<AppsAppDto> recommendation;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("type_recommendation_info")
    private final String typeRecommendationInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsNeedToShowActionResponseDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("add_to_community")
        public static final TypeDto ADD_TO_COMMUNITY;

        @pmi0("add_to_main_screen")
        public static final TypeDto ADD_TO_MAIN_SCREEN;

        @pmi0("ad_on_close_confirmation")
        public static final TypeDto AD_ON_CLOSE_CONFIRMATION;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("none")
        public static final TypeDto NONE;

        @pmi0("notifications_auto_permission")
        public static final TypeDto NOTIFICATIONS_AUTO_PERMISSION;

        @pmi0("personal_discount")
        public static final TypeDto PERSONAL_DISCOUNT;

        @pmi0("personal_discount_cashback")
        public static final TypeDto PERSONAL_DISCOUNT_CASHBACK;

        @pmi0("recommend")
        public static final TypeDto RECOMMEND;

        @pmi0("recommendation_notification")
        public static final TypeDto RECOMMENDATION_NOTIFICATION;

        @pmi0("recommendation_on_close_confirmation")
        public static final TypeDto RECOMMENDATION_ON_CLOSE_CONFIRMATION;
        private final String value;

        /* compiled from: AppsNeedToShowActionResponseDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("RECOMMEND", 0, "recommend");
            RECOMMEND = typeDto;
            TypeDto typeDto2 = new TypeDto("ADD_TO_MAIN_SCREEN", 1, "add_to_main_screen");
            ADD_TO_MAIN_SCREEN = typeDto2;
            TypeDto typeDto3 = new TypeDto("ADD_TO_COMMUNITY", 2, "add_to_community");
            ADD_TO_COMMUNITY = typeDto3;
            TypeDto typeDto4 = new TypeDto("RECOMMENDATION_NOTIFICATION", 3, "recommendation_notification");
            RECOMMENDATION_NOTIFICATION = typeDto4;
            TypeDto typeDto5 = new TypeDto("NOTIFICATIONS_AUTO_PERMISSION", 4, "notifications_auto_permission");
            NOTIFICATIONS_AUTO_PERMISSION = typeDto5;
            TypeDto typeDto6 = new TypeDto("PERSONAL_DISCOUNT", 5, "personal_discount");
            PERSONAL_DISCOUNT = typeDto6;
            TypeDto typeDto7 = new TypeDto("PERSONAL_DISCOUNT_CASHBACK", 6, "personal_discount_cashback");
            PERSONAL_DISCOUNT_CASHBACK = typeDto7;
            TypeDto typeDto8 = new TypeDto("NONE", 7, "none");
            NONE = typeDto8;
            TypeDto typeDto9 = new TypeDto("AD_ON_CLOSE_CONFIRMATION", 8, "ad_on_close_confirmation");
            AD_ON_CLOSE_CONFIRMATION = typeDto9;
            TypeDto typeDto10 = new TypeDto("RECOMMENDATION_ON_CLOSE_CONFIRMATION", 9, "recommendation_on_close_confirmation");
            RECOMMENDATION_ON_CLOSE_CONFIRMATION = typeDto10;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AppsNeedToShowActionResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsNeedToShowActionResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsNeedToShowActionResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AppsNeedToShowActionResponseDto.class, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppsNeedToShowActionResponseDto(createFromParcel, arrayList, valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), (UserId) parcel.readParcelable(AppsNeedToShowActionResponseDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsNeedToShowActionResponseDto[] newArray(int i) {
            return new AppsNeedToShowActionResponseDto[i];
        }
    }

    public AppsNeedToShowActionResponseDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final UserId d() {
        return this.needToShowGroupId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.needToShowOnCloseTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsNeedToShowActionResponseDto)) {
            return false;
        }
        AppsNeedToShowActionResponseDto appsNeedToShowActionResponseDto = (AppsNeedToShowActionResponseDto) obj;
        return this.type == appsNeedToShowActionResponseDto.type && epx.f(this.recommendation, appsNeedToShowActionResponseDto.recommendation) && epx.f(this.needToShowOnStart, appsNeedToShowActionResponseDto.needToShowOnStart) && epx.f(this.needToShowOnCloseTime, appsNeedToShowActionResponseDto.needToShowOnCloseTime) && epx.f(this.typeRecommendationInfo, appsNeedToShowActionResponseDto.typeRecommendationInfo) && epx.f(this.needToShowGroupId, appsNeedToShowActionResponseDto.needToShowGroupId);
    }

    public final Boolean f() {
        return this.needToShowOnStart;
    }

    public final List<AppsAppDto> g() {
        return this.recommendation;
    }

    public final int hashCode() {
        TypeDto typeDto = this.type;
        int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
        List<AppsAppDto> list = this.recommendation;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.needToShowOnStart;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.needToShowOnCloseTime;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.typeRecommendationInfo;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.needToShowGroupId;
        return hashCode5 + (userId != null ? Long.hashCode(userId.b) : 0);
    }

    public final TypeDto i() {
        return this.type;
    }

    public final String j() {
        return this.typeRecommendationInfo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsNeedToShowActionResponseDto(type=");
        sb.append(this.type);
        sb.append(", recommendation=");
        sb.append(this.recommendation);
        sb.append(", needToShowOnStart=");
        sb.append(this.needToShowOnStart);
        sb.append(", needToShowOnCloseTime=");
        sb.append(this.needToShowOnCloseTime);
        sb.append(", typeRecommendationInfo=");
        sb.append(this.typeRecommendationInfo);
        sb.append(", needToShowGroupId=");
        return gp.b(sb, this.needToShowGroupId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        List<AppsAppDto> list = this.recommendation;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        Boolean bool = this.needToShowOnStart;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.needToShowOnCloseTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.typeRecommendationInfo);
        parcel.writeParcelable(this.needToShowGroupId, i);
    }

    public AppsNeedToShowActionResponseDto(TypeDto typeDto, List<AppsAppDto> list, Boolean bool, Integer num, String str, UserId userId) {
        this.type = typeDto;
        this.recommendation = list;
        this.needToShowOnStart = bool;
        this.needToShowOnCloseTime = num;
        this.typeRecommendationInfo = str;
        this.needToShowGroupId = userId;
    }

    public /* synthetic */ AppsNeedToShowActionResponseDto(TypeDto typeDto, List list, Boolean bool, Integer num, String str, UserId userId, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : userId);
    }
}
