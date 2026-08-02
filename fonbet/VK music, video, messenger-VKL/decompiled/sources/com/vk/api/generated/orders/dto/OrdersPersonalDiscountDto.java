package com.vk.api.generated.orders.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.apps.dto.AppsActionBannerDto;
import com.vk.api.generated.apps.dto.AppsPersonalDiscountButtonDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: OrdersPersonalDiscountDto.kt */
/* loaded from: classes15.dex */
public final class OrdersPersonalDiscountDto implements Parcelable {
    public static final Parcelable.Creator<OrdersPersonalDiscountDto> CREATOR = new a();

    @pmi0("banner")
    private final AppsActionBannerDto banner;

    @pmi0("buttons")
    private final List<AppsPersonalDiscountButtonDto> buttons;

    @pmi0("discount_id")
    private final int discountId;

    @pmi0("discount_type")
    private final DiscountTypeDto discountType;

    @pmi0("end_time")
    private final Integer endTime;

    @pmi0("title")
    private final String title;

    @pmi0("user")
    private final UsersUserFullDto user;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OrdersPersonalDiscountDto.kt */
    public static final class DiscountTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DiscountTypeDto[] $VALUES;

        @pmi0("bonus_votes")
        public static final DiscountTypeDto BONUS_VOTES;

        @pmi0("cashback")
        public static final DiscountTypeDto CASHBACK;
        public static final Parcelable.Creator<DiscountTypeDto> CREATOR;

        @pmi0("free_votes")
        public static final DiscountTypeDto FREE_VOTES;

        @pmi0("percent_discount")
        public static final DiscountTypeDto PERCENT_DISCOUNT;
        private final String value;

        /* compiled from: OrdersPersonalDiscountDto.kt */
        public static final class a implements Parcelable.Creator<DiscountTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final DiscountTypeDto createFromParcel(Parcel parcel) {
                return DiscountTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DiscountTypeDto[] newArray(int i) {
                return new DiscountTypeDto[i];
            }
        }

        static {
            DiscountTypeDto discountTypeDto = new DiscountTypeDto("BONUS_VOTES", 0, "bonus_votes");
            BONUS_VOTES = discountTypeDto;
            DiscountTypeDto discountTypeDto2 = new DiscountTypeDto("FREE_VOTES", 1, "free_votes");
            FREE_VOTES = discountTypeDto2;
            DiscountTypeDto discountTypeDto3 = new DiscountTypeDto("PERCENT_DISCOUNT", 2, "percent_discount");
            PERCENT_DISCOUNT = discountTypeDto3;
            DiscountTypeDto discountTypeDto4 = new DiscountTypeDto("CASHBACK", 3, "cashback");
            CASHBACK = discountTypeDto4;
            DiscountTypeDto[] discountTypeDtoArr = {discountTypeDto, discountTypeDto2, discountTypeDto3, discountTypeDto4};
            $VALUES = discountTypeDtoArr;
            $ENTRIES = new asp(discountTypeDtoArr);
            CREATOR = new a();
        }

        private DiscountTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static DiscountTypeDto valueOf(String str) {
            return (DiscountTypeDto) Enum.valueOf(DiscountTypeDto.class, str);
        }

        public static DiscountTypeDto[] values() {
            return (DiscountTypeDto[]) $VALUES.clone();
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

    /* compiled from: OrdersPersonalDiscountDto.kt */
    public static final class a implements Parcelable.Creator<OrdersPersonalDiscountDto> {
        @Override // android.os.Parcelable.Creator
        public final OrdersPersonalDiscountDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            DiscountTypeDto createFromParcel = parcel.readInt() == 0 ? null : DiscountTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            AppsActionBannerDto createFromParcel2 = parcel.readInt() == 0 ? null : AppsActionBannerDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(AppsPersonalDiscountButtonDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new OrdersPersonalDiscountDto(readInt, createFromParcel, readString, createFromParcel2, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (UsersUserFullDto) parcel.readParcelable(OrdersPersonalDiscountDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OrdersPersonalDiscountDto[] newArray(int i) {
            return new OrdersPersonalDiscountDto[i];
        }
    }

    public OrdersPersonalDiscountDto(int i, DiscountTypeDto discountTypeDto, String str, AppsActionBannerDto appsActionBannerDto, List<AppsPersonalDiscountButtonDto> list, Integer num, UsersUserFullDto usersUserFullDto) {
        this.discountId = i;
        this.discountType = discountTypeDto;
        this.title = str;
        this.banner = appsActionBannerDto;
        this.buttons = list;
        this.endTime = num;
        this.user = usersUserFullDto;
    }

    public final AppsActionBannerDto d() {
        return this.banner;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.discountId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrdersPersonalDiscountDto)) {
            return false;
        }
        OrdersPersonalDiscountDto ordersPersonalDiscountDto = (OrdersPersonalDiscountDto) obj;
        return this.discountId == ordersPersonalDiscountDto.discountId && this.discountType == ordersPersonalDiscountDto.discountType && epx.f(this.title, ordersPersonalDiscountDto.title) && epx.f(this.banner, ordersPersonalDiscountDto.banner) && epx.f(this.buttons, ordersPersonalDiscountDto.buttons) && epx.f(this.endTime, ordersPersonalDiscountDto.endTime) && epx.f(this.user, ordersPersonalDiscountDto.user);
    }

    public final Integer f() {
        return this.endTime;
    }

    public final UsersUserFullDto g() {
        return this.user;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.discountId) * 31;
        DiscountTypeDto discountTypeDto = this.discountType;
        int hashCode2 = (hashCode + (discountTypeDto == null ? 0 : discountTypeDto.hashCode())) * 31;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AppsActionBannerDto appsActionBannerDto = this.banner;
        int hashCode4 = (hashCode3 + (appsActionBannerDto == null ? 0 : appsActionBannerDto.hashCode())) * 31;
        List<AppsPersonalDiscountButtonDto> list = this.buttons;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.endTime;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        UsersUserFullDto usersUserFullDto = this.user;
        return hashCode6 + (usersUserFullDto != null ? usersUserFullDto.hashCode() : 0);
    }

    public final String toString() {
        return "OrdersPersonalDiscountDto(discountId=" + this.discountId + ", discountType=" + this.discountType + ", title=" + this.title + ", banner=" + this.banner + ", buttons=" + this.buttons + ", endTime=" + this.endTime + ", user=" + this.user + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.discountId);
        DiscountTypeDto discountTypeDto = this.discountType;
        if (discountTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            discountTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        AppsActionBannerDto appsActionBannerDto = this.banner;
        if (appsActionBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsActionBannerDto.writeToParcel(parcel, i);
        }
        List<AppsPersonalDiscountButtonDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((AppsPersonalDiscountButtonDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.endTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.user, i);
    }

    public /* synthetic */ OrdersPersonalDiscountDto(int i, DiscountTypeDto discountTypeDto, String str, AppsActionBannerDto appsActionBannerDto, List list, Integer num, UsersUserFullDto usersUserFullDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : discountTypeDto, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : appsActionBannerDto, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : usersUserFullDto);
    }
}
