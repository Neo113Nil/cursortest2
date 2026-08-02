package com.vk.api.generated.prettyCards.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.D1;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.k73;
import xsna.nr;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PrettyCardsPrettyCardDto.kt */
/* loaded from: classes15.dex */
public final class PrettyCardsPrettyCardDto implements Parcelable {
    public static final Parcelable.Creator<PrettyCardsPrettyCardDto> CREATOR = new a();

    @pmi0("away_params")
    private final Object awayParams;

    @pmi0("button")
    private final String button;

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("card_data")
    private final String cardData;

    @pmi0("card_id")
    private final String cardId;

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final String currency;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("inner_type")
    private final InnerTypeDto innerType;

    @pmi0("link_url")
    private final String linkUrl;

    @pmi0("link_url_target")
    private final LinkUrlTargetDto linkUrlTarget;

    @pmi0("photo")
    private final String photo;

    @pmi0("price")
    private final String price;

    @pmi0("price_old")
    private final String priceOld;

    @pmi0("price_type")
    private final Integer priceType;

    @pmi0("title")
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PrettyCardsPrettyCardDto.kt */
    public static final class InnerTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InnerTypeDto[] $VALUES;
        public static final Parcelable.Creator<InnerTypeDto> CREATOR;

        @pmi0("prettyCards_prettyCard")
        public static final InnerTypeDto PRETTYCARDS_PRETTYCARD;
        private final String value;

        /* compiled from: PrettyCardsPrettyCardDto.kt */
        public static final class a implements Parcelable.Creator<InnerTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto createFromParcel(Parcel parcel) {
                return InnerTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InnerTypeDto[] newArray(int i) {
                return new InnerTypeDto[i];
            }
        }

        static {
            InnerTypeDto innerTypeDto = new InnerTypeDto("PRETTYCARDS_PRETTYCARD", 0, "prettyCards_prettyCard");
            PRETTYCARDS_PRETTYCARD = innerTypeDto;
            InnerTypeDto[] innerTypeDtoArr = {innerTypeDto};
            $VALUES = innerTypeDtoArr;
            $ENTRIES = new asp(innerTypeDtoArr);
            CREATOR = new a();
        }

        private InnerTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InnerTypeDto valueOf(String str) {
            return (InnerTypeDto) Enum.valueOf(InnerTypeDto.class, str);
        }

        public static InnerTypeDto[] values() {
            return (InnerTypeDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PrettyCardsPrettyCardDto.kt */
    public static final class LinkUrlTargetDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LinkUrlTargetDto[] $VALUES;
        public static final Parcelable.Creator<LinkUrlTargetDto> CREATOR;

        @pmi0(D1.e)
        public static final LinkUrlTargetDto EXTERNAL;

        @pmi0("internal")
        public static final LinkUrlTargetDto INTERNAL;
        private final String value;

        /* compiled from: PrettyCardsPrettyCardDto.kt */
        public static final class a implements Parcelable.Creator<LinkUrlTargetDto> {
            @Override // android.os.Parcelable.Creator
            public final LinkUrlTargetDto createFromParcel(Parcel parcel) {
                return LinkUrlTargetDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LinkUrlTargetDto[] newArray(int i) {
                return new LinkUrlTargetDto[i];
            }
        }

        static {
            LinkUrlTargetDto linkUrlTargetDto = new LinkUrlTargetDto("INTERNAL", 0, "internal");
            INTERNAL = linkUrlTargetDto;
            LinkUrlTargetDto linkUrlTargetDto2 = new LinkUrlTargetDto("EXTERNAL", 1, D1.e);
            EXTERNAL = linkUrlTargetDto2;
            LinkUrlTargetDto[] linkUrlTargetDtoArr = {linkUrlTargetDto, linkUrlTargetDto2};
            $VALUES = linkUrlTargetDtoArr;
            $ENTRIES = new asp(linkUrlTargetDtoArr);
            CREATOR = new a();
        }

        private LinkUrlTargetDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static LinkUrlTargetDto valueOf(String str) {
            return (LinkUrlTargetDto) Enum.valueOf(LinkUrlTargetDto.class, str);
        }

        public static LinkUrlTargetDto[] values() {
            return (LinkUrlTargetDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: PrettyCardsPrettyCardDto.kt */
    public static final class a implements Parcelable.Creator<PrettyCardsPrettyCardDto> {
        @Override // android.os.Parcelable.Creator
        public final PrettyCardsPrettyCardDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            InnerTypeDto createFromParcel = InnerTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(PrettyCardsPrettyCardDto.class, parcel, arrayList, i, 1);
                }
            }
            return new PrettyCardsPrettyCardDto(createFromParcel, readString, readString2, readString3, readString4, readString5, readString6, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LinkUrlTargetDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readValue(PrettyCardsPrettyCardDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PrettyCardsPrettyCardDto[] newArray(int i) {
            return new PrettyCardsPrettyCardDto[i];
        }
    }

    public PrettyCardsPrettyCardDto(InnerTypeDto innerTypeDto, String str, String str2, String str3, String str4, String str5, String str6, List<BaseImageDto> list, String str7, String str8, LinkUrlTargetDto linkUrlTargetDto, String str9, Integer num, String str10, Object obj) {
        this.innerType = innerTypeDto;
        this.cardId = str;
        this.linkUrl = str2;
        this.photo = str3;
        this.title = str4;
        this.button = str5;
        this.buttonText = str6;
        this.images = list;
        this.price = str7;
        this.priceOld = str8;
        this.linkUrlTarget = linkUrlTargetDto;
        this.currency = str9;
        this.priceType = num;
        this.cardData = str10;
        this.awayParams = obj;
    }

    public final String d() {
        return this.cardData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.cardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrettyCardsPrettyCardDto)) {
            return false;
        }
        PrettyCardsPrettyCardDto prettyCardsPrettyCardDto = (PrettyCardsPrettyCardDto) obj;
        return this.innerType == prettyCardsPrettyCardDto.innerType && epx.f(this.cardId, prettyCardsPrettyCardDto.cardId) && epx.f(this.linkUrl, prettyCardsPrettyCardDto.linkUrl) && epx.f(this.photo, prettyCardsPrettyCardDto.photo) && epx.f(this.title, prettyCardsPrettyCardDto.title) && epx.f(this.button, prettyCardsPrettyCardDto.button) && epx.f(this.buttonText, prettyCardsPrettyCardDto.buttonText) && epx.f(this.images, prettyCardsPrettyCardDto.images) && epx.f(this.price, prettyCardsPrettyCardDto.price) && epx.f(this.priceOld, prettyCardsPrettyCardDto.priceOld) && this.linkUrlTarget == prettyCardsPrettyCardDto.linkUrlTarget && epx.f(this.currency, prettyCardsPrettyCardDto.currency) && epx.f(this.priceType, prettyCardsPrettyCardDto.priceType) && epx.f(this.cardData, prettyCardsPrettyCardDto.cardData) && epx.f(this.awayParams, prettyCardsPrettyCardDto.awayParams);
    }

    public final List<BaseImageDto> f() {
        return this.images;
    }

    public final String g() {
        return this.linkUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(this.innerType.hashCode() * 31, 31, this.cardId), 31, this.linkUrl), 31, this.photo), 31, this.title);
        String str = this.button;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.buttonText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.price;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceOld;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        int hashCode6 = (hashCode5 + (linkUrlTargetDto == null ? 0 : linkUrlTargetDto.hashCode())) * 31;
        String str5 = this.currency;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.priceType;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.cardData;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Object obj = this.awayParams;
        return hashCode9 + (obj != null ? obj.hashCode() : 0);
    }

    public final LinkUrlTargetDto i() {
        return this.linkUrlTarget;
    }

    public final String j() {
        return this.price;
    }

    public final String k() {
        return this.priceOld;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrettyCardsPrettyCardDto(innerType=");
        sb.append(this.innerType);
        sb.append(", cardId=");
        sb.append(this.cardId);
        sb.append(", linkUrl=");
        sb.append(this.linkUrl);
        sb.append(", photo=");
        sb.append(this.photo);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", priceOld=");
        sb.append(this.priceOld);
        sb.append(", linkUrlTarget=");
        sb.append(this.linkUrlTarget);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", priceType=");
        sb.append(this.priceType);
        sb.append(", cardData=");
        sb.append(this.cardData);
        sb.append(", awayParams=");
        return k73.c(sb, this.awayParams, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.innerType.writeToParcel(parcel, i);
        parcel.writeString(this.cardId);
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.photo);
        parcel.writeString(this.title);
        parcel.writeString(this.button);
        parcel.writeString(this.buttonText);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.price);
        parcel.writeString(this.priceOld);
        LinkUrlTargetDto linkUrlTargetDto = this.linkUrlTarget;
        if (linkUrlTargetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkUrlTargetDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.currency);
        Integer num = this.priceType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.cardData);
        parcel.writeValue(this.awayParams);
    }

    public /* synthetic */ PrettyCardsPrettyCardDto(InnerTypeDto innerTypeDto, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, LinkUrlTargetDto linkUrlTargetDto, String str9, Integer num, String str10, Object obj, int i, zcl zclVar) {
        this(innerTypeDto, str, str2, str3, str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : linkUrlTargetDto, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : num, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : obj);
    }
}
