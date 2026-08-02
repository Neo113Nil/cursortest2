package com.vk.catalog2.common.dto.ui.market;

import com.vk.catalog2.common.dto.api.market.MarketInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.epx;
import xsna.ho8;

/* compiled from: UIBlockMarketInfo.kt */
/* loaded from: classes16.dex */
public final class UIBlockMarketInfo extends UIBlock {
    public static final Serializer.c<UIBlockMarketInfo> CREATOR = new a();
    public final MarketInfo y;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UIBlockMarketInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UIBlockMarketInfo a(Serializer serializer) {
            return new UIBlockMarketInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UIBlockMarketInfo[i];
        }
    }

    public UIBlockMarketInfo(com.vk.catalog2.common.dto.api.ui.a aVar, MarketInfo marketInfo) {
        super(aVar);
        this.y = marketInfo;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String Fb() {
        return String.valueOf(this.y.e);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.e0(this.y);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof UIBlockMarketInfo) && UIBlock.a.b(this, (UIBlock) obj)) {
            return epx.f(this.y, ((UIBlockMarketInfo) obj).y);
        }
        return false;
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Objects.hash(this.b, this.c, this.e, this.d, this.f, this.g, this.h, Db(), this.j, this.l, this.m, this.n, this.p)), this.y);
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final String toString() {
        return ho8.a(new StringBuilder("MARKET_INFO["), this.b, ']');
    }

    @Override // com.vk.catalog2.common.dto.api.ui.UIBlock
    public final UIBlock zb() {
        com.vk.catalog2.common.dto.api.ui.a Ab = Ab();
        MarketInfo marketInfo = this.y;
        return new UIBlockMarketInfo(Ab, new MarketInfo(marketInfo.b, marketInfo.c, marketInfo.d, marketInfo.e, marketInfo.f, marketInfo.g, marketInfo.h));
    }

    public UIBlockMarketInfo(Serializer serializer) {
        super(serializer);
        this.y = (MarketInfo) serializer.A(MarketInfo.class.getClassLoader());
    }
}
