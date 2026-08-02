package com.vk.superapp.ui.uniwidgets.blocks;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import xsna.asp;
import xsna.zrp;

/* compiled from: CounterBlock.kt */
/* loaded from: classes6.dex */
public final class CounterBlock implements BaseBlock {
    public static final a CREATOR = new a();
    public final Order b;
    public final TextBlock c;
    public final TextBlock d;
    public final TextBlock e;
    public final WebAction f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CounterBlock.kt */
    public static final class Order {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Order[] $VALUES;
        public static final Order CENTERED;
        public static final Order CLASSIC;
        public static final a Companion;
        public static final Order INVERSE;
        private final String str;

        /* compiled from: CounterBlock.kt */
        public static final class a {
        }

        static {
            Order order = new Order("CLASSIC", 0, "classic");
            CLASSIC = order;
            Order order2 = new Order("CENTERED", 1, "centered");
            CENTERED = order2;
            Order order3 = new Order("INVERSE", 2, "inverse");
            INVERSE = order3;
            Order[] orderArr = {order, order2, order3};
            $VALUES = orderArr;
            $ENTRIES = new asp(orderArr);
            Companion = new a();
        }

        public Order(String str, int i, String str2) {
            this.str = str2;
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) $VALUES.clone();
        }
    }

    /* compiled from: CounterBlock.kt */
    public static final class a implements Parcelable.Creator<CounterBlock> {
        @Override // android.os.Parcelable.Creator
        public final CounterBlock createFromParcel(Parcel parcel) {
            return new CounterBlock(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CounterBlock[] newArray(int i) {
            return new CounterBlock[i];
        }
    }

    public CounterBlock(Order order, TextBlock textBlock, TextBlock textBlock2, TextBlock textBlock3, WebAction webAction) {
        this.b = order;
        this.c = textBlock;
        this.d = textBlock2;
        this.e = textBlock3;
        this.f = webAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
    }

    public CounterBlock(Parcel parcel) {
        this(Order.valueOf(parcel.readString()), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (TextBlock) parcel.readParcelable(TextBlock.class.getClassLoader()), (WebAction) parcel.readParcelable(WebAction.class.getClassLoader()));
    }
}
