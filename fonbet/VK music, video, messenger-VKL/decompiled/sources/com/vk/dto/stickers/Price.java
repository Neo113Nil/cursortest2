package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: Price.kt */
/* loaded from: classes18.dex */
public final class Price extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Price> CREATOR = new a();

    @pmi0("buyDiscount")
    private final String buyDiscount;

    @pmi0("giftDiscount")
    private final String giftDiscount;

    @pmi0("oldPriceBuy")
    private final PriceInfo oldPriceBuy;

    @pmi0("oldPriceGift")
    private final PriceInfo oldPriceGift;

    @pmi0("priceBuy")
    private final PriceInfo priceBuy;

    @pmi0("priceGift")
    private final PriceInfo priceGift;

    @pmi0("priceInfoStr")
    private final String priceInfoStr;

    /* compiled from: Price.kt */
    public static final class PriceInfo extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<PriceInfo> CREATOR = new a();

        @pmi0("price")
        private final int price;

        @pmi0("priceStr")
        private String priceStr;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PriceInfo> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PriceInfo a(Serializer serializer) {
                return new PriceInfo(serializer.u(), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PriceInfo[i];
            }
        }

        public PriceInfo(int i, String str) {
            this.price = i;
            this.priceStr = str;
        }

        public final String Ab() {
            return this.priceStr;
        }

        public final void Bb(String str) {
            this.priceStr = str;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.S(this.price);
            serializer.j0(this.priceStr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!PriceInfo.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            PriceInfo priceInfo = (PriceInfo) obj;
            return this.price == priceInfo.price && epx.f(this.priceStr, priceInfo.priceStr);
        }

        public final int hashCode() {
            return this.priceStr.hashCode() + (this.price * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PriceInfo(price=");
            sb.append(this.price);
            sb.append(", priceStr=");
            return ho8.a(sb, this.priceStr, ')');
        }

        public final int zb() {
            return this.price;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Price> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Price a(Serializer serializer) {
            return new Price((PriceInfo) serializer.G(PriceInfo.class.getClassLoader()), (PriceInfo) serializer.G(PriceInfo.class.getClassLoader()), (PriceInfo) serializer.G(PriceInfo.class.getClassLoader()), (PriceInfo) serializer.G(PriceInfo.class.getClassLoader()), serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Price[i];
        }
    }

    public Price(PriceInfo priceInfo, PriceInfo priceInfo2, PriceInfo priceInfo3, PriceInfo priceInfo4, String str, String str2, String str3) {
        this.priceBuy = priceInfo;
        this.oldPriceBuy = priceInfo2;
        this.priceGift = priceInfo3;
        this.oldPriceGift = priceInfo4;
        this.buyDiscount = str;
        this.giftDiscount = str2;
        this.priceInfoStr = str3;
    }

    public final String Ab() {
        return this.giftDiscount;
    }

    public final PriceInfo Bb() {
        return this.oldPriceBuy;
    }

    public final PriceInfo Cb() {
        return this.oldPriceGift;
    }

    public final int Db() {
        PriceInfo priceInfo = this.priceBuy;
        if (priceInfo != null) {
            return priceInfo.zb();
        }
        return 0;
    }

    public final PriceInfo Eb() {
        return this.priceBuy;
    }

    public final PriceInfo Fb() {
        return this.priceGift;
    }

    public final String Gb() {
        return this.priceInfoStr;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.priceBuy);
        serializer.i0(this.oldPriceBuy);
        serializer.i0(this.priceGift);
        serializer.i0(this.oldPriceGift);
        serializer.j0(this.buyDiscount);
        serializer.j0(this.giftDiscount);
        serializer.j0(this.priceInfoStr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Price.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Price price = (Price) obj;
        return epx.f(this.priceBuy, price.priceBuy) && epx.f(this.oldPriceBuy, price.oldPriceBuy) && epx.f(this.priceGift, price.priceGift) && epx.f(this.oldPriceGift, price.oldPriceGift) && epx.f(this.buyDiscount, price.buyDiscount) && epx.f(this.giftDiscount, price.giftDiscount) && epx.f(this.priceInfoStr, price.priceInfoStr);
    }

    public final int hashCode() {
        PriceInfo priceInfo = this.priceBuy;
        int hashCode = (priceInfo != null ? priceInfo.hashCode() : 0) * 31;
        PriceInfo priceInfo2 = this.oldPriceBuy;
        int hashCode2 = (hashCode + (priceInfo2 != null ? priceInfo2.hashCode() : 0)) * 31;
        PriceInfo priceInfo3 = this.priceGift;
        int hashCode3 = (hashCode2 + (priceInfo3 != null ? priceInfo3.hashCode() : 0)) * 31;
        PriceInfo priceInfo4 = this.oldPriceGift;
        int hashCode4 = (hashCode3 + (priceInfo4 != null ? priceInfo4.hashCode() : 0)) * 31;
        String str = this.buyDiscount;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.giftDiscount;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.priceInfoStr;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String zb() {
        return this.buyDiscount;
    }
}
