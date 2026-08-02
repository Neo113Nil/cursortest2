package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppUniversalWidgetTypeCounterRootStyleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeCounterRootStyleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeCounterRootStyleDto> CREATOR = new a();

    @pmi0("counter")
    private final SuperAppUniversalWidgetTextStyleDto counter;

    @pmi0(C4504q2.u)
    private final OrderDto order;

    @pmi0("subtitle")
    private final SuperAppUniversalWidgetTextStyleDto subtitle;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextStyleDto title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppUniversalWidgetTypeCounterRootStyleDto.kt */
    public static final class OrderDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OrderDto[] $VALUES;

        @pmi0("centered")
        public static final OrderDto CENTERED;

        @pmi0("classic")
        public static final OrderDto CLASSIC;
        public static final Parcelable.Creator<OrderDto> CREATOR;

        @pmi0("inverse")
        public static final OrderDto INVERSE;
        private final String value;

        /* compiled from: SuperAppUniversalWidgetTypeCounterRootStyleDto.kt */
        public static final class a implements Parcelable.Creator<OrderDto> {
            @Override // android.os.Parcelable.Creator
            public final OrderDto createFromParcel(Parcel parcel) {
                return OrderDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OrderDto[] newArray(int i) {
                return new OrderDto[i];
            }
        }

        static {
            OrderDto orderDto = new OrderDto("CLASSIC", 0, "classic");
            CLASSIC = orderDto;
            OrderDto orderDto2 = new OrderDto("CENTERED", 1, "centered");
            CENTERED = orderDto2;
            OrderDto orderDto3 = new OrderDto("INVERSE", 2, "inverse");
            INVERSE = orderDto3;
            OrderDto[] orderDtoArr = {orderDto, orderDto2, orderDto3};
            $VALUES = orderDtoArr;
            $ENTRIES = new asp(orderDtoArr);
            CREATOR = new a();
        }

        private OrderDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static OrderDto valueOf(String str) {
            return (OrderDto) Enum.valueOf(OrderDto.class, str);
        }

        public static OrderDto[] values() {
            return (OrderDto[]) $VALUES.clone();
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

    /* compiled from: SuperAppUniversalWidgetTypeCounterRootStyleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeCounterRootStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeCounterRootStyleDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetTypeCounterRootStyleDto(OrderDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperAppUniversalWidgetTextStyleDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeCounterRootStyleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeCounterRootStyleDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeCounterRootStyleDto(OrderDto orderDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto3) {
        this.order = orderDto;
        this.title = superAppUniversalWidgetTextStyleDto;
        this.counter = superAppUniversalWidgetTextStyleDto2;
        this.subtitle = superAppUniversalWidgetTextStyleDto3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeCounterRootStyleDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeCounterRootStyleDto superAppUniversalWidgetTypeCounterRootStyleDto = (SuperAppUniversalWidgetTypeCounterRootStyleDto) obj;
        return this.order == superAppUniversalWidgetTypeCounterRootStyleDto.order && epx.f(this.title, superAppUniversalWidgetTypeCounterRootStyleDto.title) && epx.f(this.counter, superAppUniversalWidgetTypeCounterRootStyleDto.counter) && epx.f(this.subtitle, superAppUniversalWidgetTypeCounterRootStyleDto.subtitle);
    }

    public final int hashCode() {
        int hashCode = this.order.hashCode() * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.title;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTextStyleDto == null ? 0 : superAppUniversalWidgetTextStyleDto.hashCode())) * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2 = this.counter;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetTextStyleDto2 == null ? 0 : superAppUniversalWidgetTextStyleDto2.hashCode())) * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto3 = this.subtitle;
        return hashCode3 + (superAppUniversalWidgetTextStyleDto3 != null ? superAppUniversalWidgetTextStyleDto3.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeCounterRootStyleDto(order=" + this.order + ", title=" + this.title + ", counter=" + this.counter + ", subtitle=" + this.subtitle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.order.writeToParcel(parcel, i);
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.title;
        if (superAppUniversalWidgetTextStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2 = this.counter;
        if (superAppUniversalWidgetTextStyleDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto2.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto3 = this.subtitle;
        if (superAppUniversalWidgetTextStyleDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto3.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeCounterRootStyleDto(OrderDto orderDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto3, int i, zcl zclVar) {
        this(orderDto, (i & 2) != 0 ? null : superAppUniversalWidgetTextStyleDto, (i & 4) != 0 ? null : superAppUniversalWidgetTextStyleDto2, (i & 8) != 0 ? null : superAppUniversalWidgetTextStyleDto3);
    }
}
