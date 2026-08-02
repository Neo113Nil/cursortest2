package com.vk.vmoji.character.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import xsna.vu5;
import xsna.zcl;

/* compiled from: VmojiPrice.kt */
/* loaded from: classes7.dex */
public abstract class VmojiPrice extends Serializer.StreamParcelableAdapter {
    public static final a CREATOR = new a();
    public final int b;
    public final int c;

    /* compiled from: VmojiPrice.kt */
    public static final class Added extends VmojiPrice {
        public final int d;

        public Added(int i) {
            super(i, 1, null);
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Added) && this.d == ((Added) obj).d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Added(current="), this.d, ')');
        }

        @Override // com.vk.vmoji.character.model.VmojiPrice
        public final int zb() {
            return this.d;
        }
    }

    /* compiled from: VmojiPrice.kt */
    public static final class Free extends VmojiPrice {
        public final int d;

        public Free(int i) {
            super(i, 2, null);
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Free) && this.d == ((Free) obj).d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Free(current="), this.d, ')');
        }

        @Override // com.vk.vmoji.character.model.VmojiPrice
        public final int zb() {
            return this.d;
        }
    }

    /* compiled from: VmojiPrice.kt */
    public static final class Price extends VmojiPrice {
        public final int d;

        public Price(int i) {
            super(i, 3, null);
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Price) && this.d == ((Price) obj).d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Price(current="), this.d, ')');
        }

        @Override // com.vk.vmoji.character.model.VmojiPrice
        public final int zb() {
            return this.d;
        }
    }

    /* compiled from: VmojiPrice.kt */
    public static final class PriceWithDiscount extends VmojiPrice {
        public final int d;
        public final int e;

        public PriceWithDiscount(int i, int i2) {
            super(i, 4, null);
            this.d = i;
            this.e = i2;
        }

        @Override // com.vk.vmoji.character.model.VmojiPrice, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.S(this.e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceWithDiscount)) {
                return false;
            }
            PriceWithDiscount priceWithDiscount = (PriceWithDiscount) obj;
            return this.d == priceWithDiscount.d && this.e == priceWithDiscount.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PriceWithDiscount(current=");
            sb.append(this.d);
            sb.append(", regular=");
            return vu5.b(sb, this.e, ')');
        }

        @Override // com.vk.vmoji.character.model.VmojiPrice
        public final int zb() {
            return this.d;
        }
    }

    /* compiled from: VmojiPrice.kt */
    public static final class Unavailable extends VmojiPrice {
        public final int d;

        public Unavailable(int i) {
            super(i, 0, null);
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unavailable) && this.d == ((Unavailable) obj).d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Unavailable(current="), this.d, ')');
        }

        @Override // com.vk.vmoji.character.model.VmojiPrice
        public final int zb() {
            return this.d;
        }
    }

    /* compiled from: VmojiPrice.kt */
    public static final class a implements Parcelable.Creator<VmojiPrice> {
        @Override // android.os.Parcelable.Creator
        public final VmojiPrice createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            return readInt2 != 1 ? readInt2 != 2 ? readInt2 != 3 ? readInt2 != 4 ? new Unavailable(readInt) : new PriceWithDiscount(readInt, parcel.readInt()) : new Price(readInt) : new Free(readInt) : new Added(readInt);
        }

        @Override // android.os.Parcelable.Creator
        public final VmojiPrice[] newArray(int i) {
            return new VmojiPrice[i];
        }
    }

    public VmojiPrice(int i, int i2, zcl zclVar) {
        this.b = i;
        this.c = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.S(zb());
        serializer.S(this.c);
    }

    public int zb() {
        return this.b;
    }
}
