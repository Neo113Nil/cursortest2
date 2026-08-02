package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppWidgetExchangeRatesItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetExchangeRatesItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetExchangeRatesItemDto> CREATOR = new a();

    @pmi0("base_currency")
    private final String baseCurrency;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final String currency;

    @pmi0("currency_symbol")
    private final String currencySymbol;

    @pmi0("delta_absolute")
    private final Float deltaAbsolute;

    @pmi0("delta_percent")
    private final Float deltaPercent;

    @pmi0("id")
    private final String id;

    @pmi0("name")
    private final String name;

    @pmi0("value")
    private final Float value;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: SuperAppWidgetExchangeRatesItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetExchangeRatesItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetExchangeRatesItemDto createFromParcel(Parcel parcel) {
            return new SuperAppWidgetExchangeRatesItemDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetExchangeRatesItemDto[] newArray(int i) {
            return new SuperAppWidgetExchangeRatesItemDto[i];
        }
    }

    public SuperAppWidgetExchangeRatesItemDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetExchangeRatesItemDto)) {
            return false;
        }
        SuperAppWidgetExchangeRatesItemDto superAppWidgetExchangeRatesItemDto = (SuperAppWidgetExchangeRatesItemDto) obj;
        return epx.f(this.webviewUrl, superAppWidgetExchangeRatesItemDto.webviewUrl) && epx.f(this.id, superAppWidgetExchangeRatesItemDto.id) && epx.f(this.currency, superAppWidgetExchangeRatesItemDto.currency) && epx.f(this.baseCurrency, superAppWidgetExchangeRatesItemDto.baseCurrency) && epx.f(this.name, superAppWidgetExchangeRatesItemDto.name) && epx.f(this.value, superAppWidgetExchangeRatesItemDto.value) && epx.f(this.deltaAbsolute, superAppWidgetExchangeRatesItemDto.deltaAbsolute) && epx.f(this.deltaPercent, superAppWidgetExchangeRatesItemDto.deltaPercent) && epx.f(this.currencySymbol, superAppWidgetExchangeRatesItemDto.currencySymbol);
    }

    public final int hashCode() {
        String str = this.webviewUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.baseCurrency;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.value;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.deltaAbsolute;
        int hashCode7 = (hashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.deltaPercent;
        int hashCode8 = (hashCode7 + (f3 == null ? 0 : f3.hashCode())) * 31;
        String str6 = this.currencySymbol;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppWidgetExchangeRatesItemDto(webviewUrl=");
        sb.append(this.webviewUrl);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", baseCurrency=");
        sb.append(this.baseCurrency);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", deltaAbsolute=");
        sb.append(this.deltaAbsolute);
        sb.append(", deltaPercent=");
        sb.append(this.deltaPercent);
        sb.append(", currencySymbol=");
        return ho8.a(sb, this.currencySymbol, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.webviewUrl);
        parcel.writeString(this.id);
        parcel.writeString(this.currency);
        parcel.writeString(this.baseCurrency);
        parcel.writeString(this.name);
        Float f = this.value;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Float f2 = this.deltaAbsolute;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f2);
        }
        Float f3 = this.deltaPercent;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f3);
        }
        parcel.writeString(this.currencySymbol);
    }

    public SuperAppWidgetExchangeRatesItemDto(String str, String str2, String str3, String str4, String str5, Float f, Float f2, Float f3, String str6) {
        this.webviewUrl = str;
        this.id = str2;
        this.currency = str3;
        this.baseCurrency = str4;
        this.name = str5;
        this.value = f;
        this.deltaAbsolute = f2;
        this.deltaPercent = f3;
        this.currencySymbol = str6;
    }

    public /* synthetic */ SuperAppWidgetExchangeRatesItemDto(String str, String str2, String str3, String str4, String str5, Float f, Float f2, Float f3, String str6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : f2, (i & 128) != 0 ? null : f3, (i & 256) != 0 ? null : str6);
    }
}
