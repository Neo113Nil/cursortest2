package com.vk.api.generated.donut.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DonutLevelDto.kt */
/* loaded from: classes14.dex */
public final class DonutLevelDto implements Parcelable {
    public static final Parcelable.Creator<DonutLevelDto> CREATOR = new a();

    @pmi0("cover")
    private final BaseImageDto cover;

    @pmi0("description")
    private final String description;

    @pmi0("end_date")
    private final Integer endDate;

    @pmi0("id")
    private final int id;

    @pmi0("is_deleted")
    private final Boolean isDeleted;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("is_inherited_subscriber")
    private final Boolean isInheritedSubscriber;

    @pmi0("is_most_expensive")
    private final boolean isMostExpensive;

    @pmi0("is_subscriber")
    private final Boolean isSubscriber;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("period")
    private final DonutAllowedSubscriptionPeriodEnumDto period;

    @pmi0("price")
    private final int price;

    @pmi0("promos")
    private final List<DonutLevelTrialDto> promos;

    @pmi0("start_amount")
    private final Integer startAmount;

    @pmi0("start_date")
    private final Integer startDate;

    @pmi0("start_period")
    private final DonutAllowedSubscriptionPeriodEnumDto startPeriod;

    @pmi0("statistics")
    private final List<DonutLevelStatisticDto> statistics;

    @pmi0("subscribe_info")
    private final DonutLevelSubscribeInfoDto subscribeInfo;

    @pmi0("subscribers_count")
    private final DonutLevelSubscribersCountDto subscribersCount;

    @pmi0("teaser_text")
    private final String teaserText;

    @pmi0("title")
    private final String title;

    @pmi0("trial")
    private final DonutLevelTrialDto trial;

    @pmi0("year_price")
    private final Integer yearPrice;

    /* compiled from: DonutLevelDto.kt */
    public static final class a implements Parcelable.Creator<DonutLevelDto> {
        @Override // android.os.Parcelable.Creator
        public final DonutLevelDto createFromParcel(Parcel parcel) {
            Class cls;
            DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto;
            boolean z;
            Boolean valueOf;
            Boolean valueOf2;
            ArrayList arrayList;
            Boolean valueOf3;
            Boolean valueOf4;
            int i;
            DonutLevelSubscribersCountDto createFromParcel;
            DonutLevelSubscribersCountDto donutLevelSubscribersCountDto;
            DonutLevelTrialDto createFromParcel2;
            DonutLevelTrialDto donutLevelTrialDto;
            DonutAllowedSubscriptionPeriodEnumDto createFromParcel3;
            UserId userId;
            ArrayList arrayList2;
            String str;
            int readInt = parcel.readInt();
            UserId userId2 = (UserId) parcel.readParcelable(DonutLevelDto.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt2 = parcel.readInt();
            DonutAllowedSubscriptionPeriodEnumDto createFromParcel4 = DonutAllowedSubscriptionPeriodEnumDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                cls = DonutLevelDto.class;
                donutAllowedSubscriptionPeriodEnumDto = createFromParcel4;
                z = true;
            } else {
                cls = DonutLevelDto.class;
                donutAllowedSubscriptionPeriodEnumDto = createFromParcel4;
                z = false;
            }
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
                arrayList = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = en.a(DonutLevelStatisticDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            BaseImageDto baseImageDto = (BaseImageDto) parcel.readParcelable(cls.getClassLoader());
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
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            DonutLevelSubscribeInfoDto createFromParcel5 = parcel.readInt() == 0 ? null : DonutLevelSubscribeInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                i = readInt;
                createFromParcel = null;
            } else {
                i = readInt;
                createFromParcel = DonutLevelSubscribersCountDto.CREATOR.createFromParcel(parcel);
            }
            DonutLevelSubscribersCountDto donutLevelSubscribersCountDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                donutLevelSubscribersCountDto = donutLevelSubscribersCountDto2;
                createFromParcel2 = null;
            } else {
                donutLevelSubscribersCountDto = donutLevelSubscribersCountDto2;
                createFromParcel2 = DonutLevelTrialDto.CREATOR.createFromParcel(parcel);
            }
            DonutLevelTrialDto donutLevelTrialDto2 = createFromParcel2;
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                donutLevelTrialDto = donutLevelTrialDto2;
                createFromParcel3 = null;
            } else {
                donutLevelTrialDto = donutLevelTrialDto2;
                createFromParcel3 = DonutAllowedSubscriptionPeriodEnumDto.CREATOR.createFromParcel(parcel);
            }
            DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto2 = createFromParcel3;
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            DonutLevelSubscribersCountDto donutLevelSubscribersCountDto3 = donutLevelSubscribersCountDto;
            int i3 = i;
            Integer num = valueOf7;
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                userId = userId2;
                str = readString;
                arrayList2 = null;
            } else {
                int readInt4 = parcel.readInt();
                userId = userId2;
                arrayList2 = new ArrayList(readInt4);
                str = readString;
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = en.a(DonutLevelTrialDto.CREATOR, parcel, arrayList2, i4, 1);
                    readInt4 = readInt4;
                    readString2 = readString2;
                }
            }
            return new DonutLevelDto(i3, userId, str, readString2, readInt2, donutAllowedSubscriptionPeriodEnumDto, z, valueOf, valueOf2, arrayList, baseImageDto, valueOf3, valueOf4, valueOf5, createFromParcel5, donutLevelSubscribersCountDto3, donutLevelTrialDto, valueOf6, num, donutAllowedSubscriptionPeriodEnumDto2, valueOf8, readString3, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final DonutLevelDto[] newArray(int i) {
            return new DonutLevelDto[i];
        }
    }

    public DonutLevelDto(int i, UserId userId, String str, String str2, int i2, DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto, boolean z, Boolean bool, Boolean bool2, List<DonutLevelStatisticDto> list, BaseImageDto baseImageDto, Boolean bool3, Boolean bool4, Integer num, DonutLevelSubscribeInfoDto donutLevelSubscribeInfoDto, DonutLevelSubscribersCountDto donutLevelSubscribersCountDto, DonutLevelTrialDto donutLevelTrialDto, Integer num2, Integer num3, DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto2, Integer num4, String str3, List<DonutLevelTrialDto> list2) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
        this.description = str2;
        this.price = i2;
        this.period = donutAllowedSubscriptionPeriodEnumDto;
        this.isMostExpensive = z;
        this.isHidden = bool;
        this.isDeleted = bool2;
        this.statistics = list;
        this.cover = baseImageDto;
        this.isSubscriber = bool3;
        this.isInheritedSubscriber = bool4;
        this.yearPrice = num;
        this.subscribeInfo = donutLevelSubscribeInfoDto;
        this.subscribersCount = donutLevelSubscribersCountDto;
        this.trial = donutLevelTrialDto;
        this.startDate = num2;
        this.startAmount = num3;
        this.startPeriod = donutAllowedSubscriptionPeriodEnumDto2;
        this.endDate = num4;
        this.teaserText = str3;
        this.promos = list2;
    }

    public final int d() {
        return this.price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.teaserText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DonutLevelDto)) {
            return false;
        }
        DonutLevelDto donutLevelDto = (DonutLevelDto) obj;
        return this.id == donutLevelDto.id && epx.f(this.ownerId, donutLevelDto.ownerId) && epx.f(this.title, donutLevelDto.title) && epx.f(this.description, donutLevelDto.description) && this.price == donutLevelDto.price && this.period == donutLevelDto.period && this.isMostExpensive == donutLevelDto.isMostExpensive && epx.f(this.isHidden, donutLevelDto.isHidden) && epx.f(this.isDeleted, donutLevelDto.isDeleted) && epx.f(this.statistics, donutLevelDto.statistics) && epx.f(this.cover, donutLevelDto.cover) && epx.f(this.isSubscriber, donutLevelDto.isSubscriber) && epx.f(this.isInheritedSubscriber, donutLevelDto.isInheritedSubscriber) && epx.f(this.yearPrice, donutLevelDto.yearPrice) && epx.f(this.subscribeInfo, donutLevelDto.subscribeInfo) && epx.f(this.subscribersCount, donutLevelDto.subscribersCount) && epx.f(this.trial, donutLevelDto.trial) && epx.f(this.startDate, donutLevelDto.startDate) && epx.f(this.startAmount, donutLevelDto.startAmount) && this.startPeriod == donutLevelDto.startPeriod && epx.f(this.endDate, donutLevelDto.endDate) && epx.f(this.teaserText, donutLevelDto.teaserText) && epx.f(this.promos, donutLevelDto.promos);
    }

    public final boolean f() {
        return this.isMostExpensive;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int b = qoy.b((this.period.hashCode() + shy.a(this.price, urd0.a(urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.title), 31, this.description), 31)) * 31, 31, this.isMostExpensive);
        Boolean bool = this.isHidden;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDeleted;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<DonutLevelStatisticDto> list = this.statistics;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BaseImageDto baseImageDto = this.cover;
        int hashCode4 = (hashCode3 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        Boolean bool3 = this.isSubscriber;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isInheritedSubscriber;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.yearPrice;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        DonutLevelSubscribeInfoDto donutLevelSubscribeInfoDto = this.subscribeInfo;
        int hashCode8 = (hashCode7 + (donutLevelSubscribeInfoDto == null ? 0 : donutLevelSubscribeInfoDto.hashCode())) * 31;
        DonutLevelSubscribersCountDto donutLevelSubscribersCountDto = this.subscribersCount;
        int hashCode9 = (hashCode8 + (donutLevelSubscribersCountDto == null ? 0 : donutLevelSubscribersCountDto.hashCode())) * 31;
        DonutLevelTrialDto donutLevelTrialDto = this.trial;
        int hashCode10 = (hashCode9 + (donutLevelTrialDto == null ? 0 : donutLevelTrialDto.hashCode())) * 31;
        Integer num2 = this.startDate;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.startAmount;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto = this.startPeriod;
        int hashCode13 = (hashCode12 + (donutAllowedSubscriptionPeriodEnumDto == null ? 0 : donutAllowedSubscriptionPeriodEnumDto.hashCode())) * 31;
        Integer num4 = this.endDate;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.teaserText;
        int hashCode15 = (hashCode14 + (str == null ? 0 : str.hashCode())) * 31;
        List<DonutLevelTrialDto> list2 = this.promos;
        return hashCode15 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutLevelDto(id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", period=");
        sb.append(this.period);
        sb.append(", isMostExpensive=");
        sb.append(this.isMostExpensive);
        sb.append(", isHidden=");
        sb.append(this.isHidden);
        sb.append(", isDeleted=");
        sb.append(this.isDeleted);
        sb.append(", statistics=");
        sb.append(this.statistics);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", isSubscriber=");
        sb.append(this.isSubscriber);
        sb.append(", isInheritedSubscriber=");
        sb.append(this.isInheritedSubscriber);
        sb.append(", yearPrice=");
        sb.append(this.yearPrice);
        sb.append(", subscribeInfo=");
        sb.append(this.subscribeInfo);
        sb.append(", subscribersCount=");
        sb.append(this.subscribersCount);
        sb.append(", trial=");
        sb.append(this.trial);
        sb.append(", startDate=");
        sb.append(this.startDate);
        sb.append(", startAmount=");
        sb.append(this.startAmount);
        sb.append(", startPeriod=");
        sb.append(this.startPeriod);
        sb.append(", endDate=");
        sb.append(this.endDate);
        sb.append(", teaserText=");
        sb.append(this.teaserText);
        sb.append(", promos=");
        return ms9.a(')', sb, this.promos);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.price);
        this.period.writeToParcel(parcel, i);
        parcel.writeInt(this.isMostExpensive ? 1 : 0);
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isDeleted;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<DonutLevelStatisticDto> list = this.statistics;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((DonutLevelStatisticDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.cover, i);
        Boolean bool3 = this.isSubscriber;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isInheritedSubscriber;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Integer num = this.yearPrice;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        DonutLevelSubscribeInfoDto donutLevelSubscribeInfoDto = this.subscribeInfo;
        if (donutLevelSubscribeInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutLevelSubscribeInfoDto.writeToParcel(parcel, i);
        }
        DonutLevelSubscribersCountDto donutLevelSubscribersCountDto = this.subscribersCount;
        if (donutLevelSubscribersCountDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutLevelSubscribersCountDto.writeToParcel(parcel, i);
        }
        DonutLevelTrialDto donutLevelTrialDto = this.trial;
        if (donutLevelTrialDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutLevelTrialDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.startDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.startAmount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto = this.startPeriod;
        if (donutAllowedSubscriptionPeriodEnumDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            donutAllowedSubscriptionPeriodEnumDto.writeToParcel(parcel, i);
        }
        Integer num4 = this.endDate;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.teaserText);
        List<DonutLevelTrialDto> list2 = this.promos;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((DonutLevelTrialDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ DonutLevelDto(int i, UserId userId, String str, String str2, int i2, DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto, boolean z, Boolean bool, Boolean bool2, List list, BaseImageDto baseImageDto, Boolean bool3, Boolean bool4, Integer num, DonutLevelSubscribeInfoDto donutLevelSubscribeInfoDto, DonutLevelSubscribersCountDto donutLevelSubscribersCountDto, DonutLevelTrialDto donutLevelTrialDto, Integer num2, Integer num3, DonutAllowedSubscriptionPeriodEnumDto donutAllowedSubscriptionPeriodEnumDto2, Integer num4, String str3, List list2, int i3, zcl zclVar) {
        this(i, userId, str, str2, i2, donutAllowedSubscriptionPeriodEnumDto, z, (i3 & 128) != 0 ? null : bool, (i3 & 256) != 0 ? null : bool2, (i3 & 512) != 0 ? null : list, (i3 & 1024) != 0 ? null : baseImageDto, (i3 & 2048) != 0 ? null : bool3, (i3 & 4096) != 0 ? null : bool4, (i3 & 8192) != 0 ? null : num, (i3 & 16384) != 0 ? null : donutLevelSubscribeInfoDto, (32768 & i3) != 0 ? null : donutLevelSubscribersCountDto, (65536 & i3) != 0 ? null : donutLevelTrialDto, (131072 & i3) != 0 ? null : num2, (262144 & i3) != 0 ? null : num3, (524288 & i3) != 0 ? null : donutAllowedSubscriptionPeriodEnumDto2, (1048576 & i3) != 0 ? null : num4, (2097152 & i3) != 0 ? null : str3, (i3 & 4194304) != 0 ? null : list2);
    }
}
