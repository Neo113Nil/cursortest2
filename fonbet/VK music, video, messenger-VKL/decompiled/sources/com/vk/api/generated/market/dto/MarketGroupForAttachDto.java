package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarketGroupForAttachDto.kt */
/* loaded from: classes15.dex */
public final class MarketGroupForAttachDto implements Parcelable {
    public static final Parcelable.Creator<MarketGroupForAttachDto> CREATOR = new a();

    @pmi0("can_enable_market")
    private final Boolean canEnableMarket;

    @pmi0("edit_url")
    private final String editUrl;

    @pmi0("has_products")
    private final Boolean hasProducts;

    @pmi0("id")
    private final UserId id;

    @pmi0("is_market_enabled")
    private final Boolean isMarketEnabled;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0("title")
    private final String title;

    @pmi0("verified")
    private final Boolean verified;

    /* compiled from: MarketGroupForAttachDto.kt */
    public static final class a implements Parcelable.Creator<MarketGroupForAttachDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGroupForAttachDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            UserId userId = (UserId) parcel.readParcelable(MarketGroupForAttachDto.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MarketGroupForAttachDto.class, parcel, arrayList, i, 1);
            }
            String readString = parcel.readString();
            Boolean bool = null;
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
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketGroupForAttachDto(userId, arrayList, readString, valueOf, valueOf2, valueOf3, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGroupForAttachDto[] newArray(int i) {
            return new MarketGroupForAttachDto[i];
        }
    }

    public MarketGroupForAttachDto(UserId userId, List<BaseImageDto> list, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2) {
        this.id = userId;
        this.photo = list;
        this.title = str;
        this.verified = bool;
        this.isMarketEnabled = bool2;
        this.hasProducts = bool3;
        this.canEnableMarket = bool4;
        this.editUrl = str2;
    }

    public final Boolean d() {
        return this.canEnableMarket;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.editUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGroupForAttachDto)) {
            return false;
        }
        MarketGroupForAttachDto marketGroupForAttachDto = (MarketGroupForAttachDto) obj;
        return epx.f(this.id, marketGroupForAttachDto.id) && epx.f(this.photo, marketGroupForAttachDto.photo) && epx.f(this.title, marketGroupForAttachDto.title) && epx.f(this.verified, marketGroupForAttachDto.verified) && epx.f(this.isMarketEnabled, marketGroupForAttachDto.isMarketEnabled) && epx.f(this.hasProducts, marketGroupForAttachDto.hasProducts) && epx.f(this.canEnableMarket, marketGroupForAttachDto.canEnableMarket) && epx.f(this.editUrl, marketGroupForAttachDto.editUrl);
    }

    public final Boolean f() {
        return this.hasProducts;
    }

    public final UserId g() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(Long.hashCode(this.id.b) * 31, 31, this.photo), 31, this.title);
        Boolean bool = this.verified;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isMarketEnabled;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasProducts;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.canEnableMarket;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str = this.editUrl;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final List<BaseImageDto> i() {
        return this.photo;
    }

    public final Boolean j() {
        return this.verified;
    }

    public final Boolean k() {
        return this.isMarketEnabled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGroupForAttachDto(id=");
        sb.append(this.id);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", verified=");
        sb.append(this.verified);
        sb.append(", isMarketEnabled=");
        sb.append(this.isMarketEnabled);
        sb.append(", hasProducts=");
        sb.append(this.hasProducts);
        sb.append(", canEnableMarket=");
        sb.append(this.canEnableMarket);
        sb.append(", editUrl=");
        return ho8.a(sb, this.editUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        Iterator a2 = ao.a(parcel, this.photo);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.title);
        Boolean bool = this.verified;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isMarketEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.hasProducts;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.canEnableMarket;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeString(this.editUrl);
    }

    public /* synthetic */ MarketGroupForAttachDto(UserId userId, List list, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, int i, zcl zclVar) {
        this(userId, list, str, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : bool4, (i & 128) != 0 ? null : str2);
    }
}
