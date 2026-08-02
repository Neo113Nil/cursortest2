package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: GiftsGiftCardDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftCardDto implements Parcelable {
    public static final Parcelable.Creator<GiftsGiftCardDto> CREATOR = new a();

    @pmi0("backgrounds")
    private final List<GiftsBackgroundDto> backgrounds;

    @pmi0("instruction")
    private final String instruction;

    @pmi0("is_nominal_private")
    private final Boolean isNominalPrivate;

    @pmi0("nominal")
    private final int nominal;

    @pmi0("offer_url")
    private final String offerUrl;

    @pmi0("partner")
    private final GiftsGiftCardPartnerDto partner;

    @pmi0("promo_code")
    private final GiftsGiftCardPromoCodeDto promoCode;

    /* compiled from: GiftsGiftCardDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftCardDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftCardDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            GiftsGiftCardPartnerDto createFromParcel = GiftsGiftCardPartnerDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(GiftsBackgroundDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            GiftsGiftCardPromoCodeDto giftsGiftCardPromoCodeDto = (GiftsGiftCardPromoCodeDto) parcel.readParcelable(GiftsGiftCardDto.class.getClassLoader());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GiftsGiftCardDto(readInt, readString, createFromParcel, arrayList, giftsGiftCardPromoCodeDto, readString2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftCardDto[] newArray(int i) {
            return new GiftsGiftCardDto[i];
        }
    }

    public GiftsGiftCardDto(int i, String str, GiftsGiftCardPartnerDto giftsGiftCardPartnerDto, List<GiftsBackgroundDto> list, GiftsGiftCardPromoCodeDto giftsGiftCardPromoCodeDto, String str2, Boolean bool) {
        this.nominal = i;
        this.instruction = str;
        this.partner = giftsGiftCardPartnerDto;
        this.backgrounds = list;
        this.promoCode = giftsGiftCardPromoCodeDto;
        this.offerUrl = str2;
        this.isNominalPrivate = bool;
    }

    public final int d() {
        return this.nominal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.isNominalPrivate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsGiftCardDto)) {
            return false;
        }
        GiftsGiftCardDto giftsGiftCardDto = (GiftsGiftCardDto) obj;
        return this.nominal == giftsGiftCardDto.nominal && epx.f(this.instruction, giftsGiftCardDto.instruction) && epx.f(this.partner, giftsGiftCardDto.partner) && epx.f(this.backgrounds, giftsGiftCardDto.backgrounds) && epx.f(this.promoCode, giftsGiftCardDto.promoCode) && epx.f(this.offerUrl, giftsGiftCardDto.offerUrl) && epx.f(this.isNominalPrivate, giftsGiftCardDto.isNominalPrivate);
    }

    public final int hashCode() {
        int hashCode = (this.partner.hashCode() + urd0.a(Integer.hashCode(this.nominal) * 31, 31, this.instruction)) * 31;
        List<GiftsBackgroundDto> list = this.backgrounds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        GiftsGiftCardPromoCodeDto giftsGiftCardPromoCodeDto = this.promoCode;
        int hashCode3 = (hashCode2 + (giftsGiftCardPromoCodeDto == null ? 0 : giftsGiftCardPromoCodeDto.hashCode())) * 31;
        String str = this.offerUrl;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isNominalPrivate;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsGiftCardDto(nominal=");
        sb.append(this.nominal);
        sb.append(", instruction=");
        sb.append(this.instruction);
        sb.append(", partner=");
        sb.append(this.partner);
        sb.append(", backgrounds=");
        sb.append(this.backgrounds);
        sb.append(", promoCode=");
        sb.append(this.promoCode);
        sb.append(", offerUrl=");
        sb.append(this.offerUrl);
        sb.append(", isNominalPrivate=");
        return tn.a(sb, this.isNominalPrivate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.nominal);
        parcel.writeString(this.instruction);
        this.partner.writeToParcel(parcel, i);
        List<GiftsBackgroundDto> list = this.backgrounds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GiftsBackgroundDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeParcelable(this.promoCode, i);
        parcel.writeString(this.offerUrl);
        Boolean bool = this.isNominalPrivate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ GiftsGiftCardDto(int i, String str, GiftsGiftCardPartnerDto giftsGiftCardPartnerDto, List list, GiftsGiftCardPromoCodeDto giftsGiftCardPromoCodeDto, String str2, Boolean bool, int i2, zcl zclVar) {
        this(i, str, giftsGiftCardPartnerDto, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : giftsGiftCardPromoCodeDto, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : bool);
    }
}
