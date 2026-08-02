package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: MarketProfileInfoProfileDto.kt */
/* loaded from: classes15.dex */
public final class MarketProfileInfoProfileDto implements Parcelable {
    public static final Parcelable.Creator<MarketProfileInfoProfileDto> CREATOR = new a();

    @pmi0("miniapp_url")
    private final String miniappUrl;

    @pmi0("new_products_counter")
    private final int newProductsCounter;

    @pmi0(LoginApiConstants.PARAM_NAME_USERNAME)
    private final String userName;

    /* compiled from: MarketProfileInfoProfileDto.kt */
    public static final class a implements Parcelable.Creator<MarketProfileInfoProfileDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketProfileInfoProfileDto createFromParcel(Parcel parcel) {
            return new MarketProfileInfoProfileDto(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketProfileInfoProfileDto[] newArray(int i) {
            return new MarketProfileInfoProfileDto[i];
        }
    }

    public MarketProfileInfoProfileDto(String str, int i, String str2) {
        this.miniappUrl = str;
        this.newProductsCounter = i;
        this.userName = str2;
    }

    public final String d() {
        return this.userName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketProfileInfoProfileDto)) {
            return false;
        }
        MarketProfileInfoProfileDto marketProfileInfoProfileDto = (MarketProfileInfoProfileDto) obj;
        return epx.f(this.miniappUrl, marketProfileInfoProfileDto.miniappUrl) && this.newProductsCounter == marketProfileInfoProfileDto.newProductsCounter && epx.f(this.userName, marketProfileInfoProfileDto.userName);
    }

    public final int hashCode() {
        int a2 = shy.a(this.newProductsCounter, this.miniappUrl.hashCode() * 31, 31);
        String str = this.userName;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketProfileInfoProfileDto(miniappUrl=");
        sb.append(this.miniappUrl);
        sb.append(", newProductsCounter=");
        sb.append(this.newProductsCounter);
        sb.append(", userName=");
        return ho8.a(sb, this.userName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.miniappUrl);
        parcel.writeInt(this.newProductsCounter);
        parcel.writeString(this.userName);
    }

    public /* synthetic */ MarketProfileInfoProfileDto(String str, int i, String str2, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? null : str2);
    }
}
