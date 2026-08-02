package com.vk.catalog2.common.dto.ui.market;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItemStyle;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import java.util.Objects;
import xsna.dfp0;
import xsna.epx;
import xsna.gmq;
import xsna.ho8;

/* compiled from: UIBlockMarketItem.kt */
/* loaded from: classes16.dex */
public final class UIBlockMarketItem extends UIBlock implements dfp0 {
    public static final Serializer.c<UIBlockMarketItem> CREATOR = new c();
    public final UIBlockMarketItemStyle A;
    public final Good y;
    public final String z;

    /* compiled from: UIBlockMarketItem.kt */
    public static final class a {
        public final Good a;
        public final String b;
        public final Integer c;

        public a(Good good, String str, Integer num) {
            this.a = good;
            this.b = str;
            this.c = num;
        }
    }

    /* compiled from: UIBlockMarketItem.kt */
    public static final class b {
        public final gmq a;
        public final Integer b;
        public final String c;

        public b(gmq gmqVar, Integer num, String str) {
            this.a = gmqVar;
            this.b = num;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.c;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnalyticsFaveInfo(favable=");
            sb.append(this.a);
            sb.append(", position=");
            sb.append(this.b);
            sb.append(", trackCode=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<UIBlockMarketItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMarketItem a(Serializer serializer) {
            return new UIBlockMarketItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMarketItem[i];
        }
    }

    public UIBlockMarketItem(com.vk.catalog2.common.dto.api.ui.a aVar, Good good, String str, UIBlockMarketItemStyle uIBlockMarketItemStyle) {
        super(aVar);
        this.y = good;
        this.z = str;
        this.A = uIBlockMarketItemStyle;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return this.y.Ab();
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.i0(this.y);
        serializer.j0(this.z);
        serializer.j0(this.A.j());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UIBlockMarketItem) || !UIBlock.a.b(this, (UIBlock) obj)) {
            return false;
        }
        UIBlockMarketItem uIBlockMarketItem = (UIBlockMarketItem) obj;
        Good good = uIBlockMarketItem.y;
        Good good2 = this.y;
        return epx.f(good2, good) && epx.f(good2.n0, good.n0) && good2.J == good.J && epx.f(this.z, uIBlockMarketItem.z) && this.A == uIBlockMarketItem.A;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y, this.z, this.A.j());
    }

    @Override // xsna.dfp0
    public final String r() {
        return this.z;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("MARKET_ITEM["), this.b, ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        return new UIBlockMarketItem(Ab(), new Good(this.y), this.z, this.A);
    }

    public UIBlockMarketItem(Serializer serializer) {
        super(serializer);
        this.y = (Good) serializer.G(Good.class.getClassLoader());
        this.z = serializer.H();
        UIBlockMarketItemStyle.a aVar = UIBlockMarketItemStyle.Companion;
        String H = serializer.H();
        aVar.getClass();
        this.A = UIBlockMarketItemStyle.a.a(H);
    }
}
