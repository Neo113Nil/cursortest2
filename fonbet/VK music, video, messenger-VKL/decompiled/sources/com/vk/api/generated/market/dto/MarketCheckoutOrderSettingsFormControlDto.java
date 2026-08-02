package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketCheckoutOrderSettingsFormControlDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutOrderSettingsFormControlDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutOrderSettingsFormControlDto> CREATOR = new a();

    @pmi0("action")
    private final MarketOrderSettingsActionDto action;

    @pmi0("affects_price")
    private final Boolean affectsPrice;

    @pmi0("allowed_value_ids")
    private final List<Integer> allowedValueIds;

    @pmi0("available_services")
    private final List<MarketDeliveryServiceDto> availableServices;

    @pmi0("button_caption")
    private final String buttonCaption;

    @pmi0("city")
    private final BaseCityDto city;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("delivery_options")
    private final List<MarketFormDeliveryOptionsDto> deliveryOptions;

    @pmi0("delivery_point")
    private final MarketDeliveryPointDto deliveryPoint;

    @pmi0(SharedKt.PARAM_ERROR_MSG)
    private final String errorMsg;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("info")
    private final String info;

    @pmi0("is_required")
    private final Boolean isRequired;

    @pmi0("label")
    private final String label;

    @pmi0("name")
    private final String name;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<MarketFormDropdownOptionDto> options;

    @pmi0("placeholder")
    private final String placeholder;

    @pmi0("prices")
    private final List<MarketCheckoutOrderDetailsPriceDto> prices;

    @pmi0("required_error_msg")
    private final String requiredErrorMsg;

    @pmi0("selected_option")
    private final String selectedOption;

    @pmi0("success_msg")
    private final String successMsg;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("validation_error_msg")
    private final String validationErrorMsg;

    @pmi0("validation_regex")
    private final String validationRegex;

    @pmi0("value")
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketCheckoutOrderSettingsFormControlDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("action")
        public static final TypeDto ACTION;

        @pmi0("checkbox")
        public static final TypeDto CHECKBOX;

        @pmi0("city")
        public static final TypeDto CITY;

        @pmi0("country")
        public static final TypeDto COUNTRY;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("delivery_options")
        public static final TypeDto DELIVERY_OPTIONS;

        @pmi0("delivery_point")
        public static final TypeDto DELIVERY_POINT;

        @pmi0("dropdown")
        public static final TypeDto DROPDOWN;

        @pmi0("group_info")
        public static final TypeDto GROUP_INFO;

        @pmi0("header")
        public static final TypeDto HEADER;

        @pmi0("image")
        public static final TypeDto IMAGE;

        @pmi0("info")
        public static final TypeDto INFO;

        @pmi0("number")
        public static final TypeDto NUMBER;

        @pmi0("phone")
        public static final TypeDto PHONE;

        @pmi0("placeholder")
        public static final TypeDto PLACEHOLDER;

        @pmi0("price_list")
        public static final TypeDto PRICE_LIST;

        @pmi0("prompt")
        public static final TypeDto PROMPT;

        @pmi0("text")
        public static final TypeDto TEXT;

        @pmi0("textarea")
        public static final TypeDto TEXTAREA;

        @pmi0("text_info")
        public static final TypeDto TEXT_INFO;
        private final String value;

        /* compiled from: MarketCheckoutOrderSettingsFormControlDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto("NUMBER", 0, "number");
            NUMBER = typeDto;
            TypeDto typeDto2 = new TypeDto("COUNTRY", 1, "country");
            COUNTRY = typeDto2;
            TypeDto typeDto3 = new TypeDto("CITY", 2, "city");
            CITY = typeDto3;
            TypeDto typeDto4 = new TypeDto("TEXT", 3, "text");
            TEXT = typeDto4;
            TypeDto typeDto5 = new TypeDto("TEXTAREA", 4, "textarea");
            TEXTAREA = typeDto5;
            TypeDto typeDto6 = new TypeDto("PHONE", 5, "phone");
            PHONE = typeDto6;
            TypeDto typeDto7 = new TypeDto("PROMPT", 6, "prompt");
            PROMPT = typeDto7;
            TypeDto typeDto8 = new TypeDto("HEADER", 7, "header");
            HEADER = typeDto8;
            TypeDto typeDto9 = new TypeDto("PLACEHOLDER", 8, "placeholder");
            PLACEHOLDER = typeDto9;
            TypeDto typeDto10 = new TypeDto("IMAGE", 9, "image");
            IMAGE = typeDto10;
            TypeDto typeDto11 = new TypeDto("DROPDOWN", 10, "dropdown");
            DROPDOWN = typeDto11;
            TypeDto typeDto12 = new TypeDto("DELIVERY_OPTIONS", 11, "delivery_options");
            DELIVERY_OPTIONS = typeDto12;
            TypeDto typeDto13 = new TypeDto("CHECKBOX", 12, "checkbox");
            CHECKBOX = typeDto13;
            TypeDto typeDto14 = new TypeDto("PRICE_LIST", 13, "price_list");
            PRICE_LIST = typeDto14;
            TypeDto typeDto15 = new TypeDto("INFO", 14, "info");
            INFO = typeDto15;
            TypeDto typeDto16 = new TypeDto("ACTION", 15, "action");
            ACTION = typeDto16;
            TypeDto typeDto17 = new TypeDto("TEXT_INFO", 16, "text_info");
            TEXT_INFO = typeDto17;
            TypeDto typeDto18 = new TypeDto("GROUP_INFO", 17, "group_info");
            GROUP_INFO = typeDto18;
            TypeDto typeDto19 = new TypeDto("DELIVERY_POINT", 18, "delivery_point");
            DELIVERY_POINT = typeDto19;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14, typeDto15, typeDto16, typeDto17, typeDto18, typeDto19};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: MarketCheckoutOrderSettingsFormControlDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutOrderSettingsFormControlDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutOrderSettingsFormControlDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            BaseCountryDto baseCountryDto;
            MarketOrderSettingsActionDto marketOrderSettingsActionDto;
            ArrayList arrayList2;
            TypeDto typeDto;
            ArrayList arrayList3;
            MarketDeliveryPointDto marketDeliveryPointDto;
            ArrayList arrayList4;
            ArrayList arrayList5;
            String str;
            Object obj;
            ArrayList arrayList6;
            Object obj2;
            ArrayList arrayList7;
            ArrayList arrayList8;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
                arrayList = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
                arrayList = null;
            }
            String readString7 = parcel.readString();
            ArrayList arrayList9 = arrayList;
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            ArrayList arrayList10 = arrayList9;
            String readString12 = parcel.readString();
            MarketOrderSettingsActionDto marketOrderSettingsActionDto2 = (MarketOrderSettingsActionDto) (parcel.readInt() == 0 ? arrayList10 : MarketOrderSettingsActionDto.CREATOR.createFromParcel(parcel));
            Boolean bool = valueOf;
            BaseCityDto baseCityDto = (BaseCityDto) parcel.readParcelable(MarketCheckoutOrderSettingsFormControlDto.class.getClassLoader());
            BaseCountryDto baseCountryDto2 = (BaseCountryDto) parcel.readParcelable(MarketCheckoutOrderSettingsFormControlDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                baseCountryDto = baseCountryDto2;
                marketOrderSettingsActionDto = marketOrderSettingsActionDto2;
                typeDto = createFromParcel;
                arrayList2 = arrayList10;
            } else {
                baseCountryDto = baseCountryDto2;
                int readInt = parcel.readInt();
                marketOrderSettingsActionDto = marketOrderSettingsActionDto2;
                arrayList2 = new ArrayList(readInt);
                typeDto = createFromParcel;
                int i = 0;
                while (i != readInt) {
                    i = bo.b(MarketCheckoutOrderSettingsFormControlDto.class, parcel, arrayList2, i, 1);
                    readInt = readInt;
                }
            }
            MarketDeliveryPointDto marketDeliveryPointDto2 = (MarketDeliveryPointDto) (parcel.readInt() == 0 ? arrayList10 : MarketDeliveryPointDto.CREATOR.createFromParcel(parcel));
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList3 = new ArrayList(readInt2);
                marketDeliveryPointDto = marketDeliveryPointDto2;
                int i2 = 0;
                ArrayList arrayList11 = arrayList2;
                while (true) {
                    arrayList4 = arrayList11;
                    if (i2 == readInt2) {
                        break;
                    }
                    i2 = en.a(MarketDeliveryServiceDto.CREATOR, parcel, arrayList3, i2, 1);
                    arrayList11 = arrayList4;
                    readInt2 = readInt2;
                }
            } else {
                marketDeliveryPointDto = marketDeliveryPointDto2;
                arrayList3 = arrayList10;
                arrayList4 = arrayList2;
            }
            if (parcel.readInt() == 0) {
                str = readString;
                arrayList5 = arrayList10;
            } else {
                int readInt3 = parcel.readInt();
                arrayList5 = new ArrayList(readInt3);
                str = readString;
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = pm0.b(parcel, arrayList5, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                obj = arrayList10;
            } else {
                obj = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                arrayList6 = new ArrayList(readInt4);
                obj2 = obj;
                int i4 = 0;
                ArrayList arrayList12 = arrayList5;
                while (true) {
                    arrayList7 = arrayList12;
                    if (i4 == readInt4) {
                        break;
                    }
                    i4 = en.a(MarketCheckoutOrderDetailsPriceDto.CREATOR, parcel, arrayList6, i4, 1);
                    arrayList12 = arrayList7;
                    readInt4 = readInt4;
                }
            } else {
                obj2 = obj;
                arrayList6 = arrayList10;
                arrayList7 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList8 = arrayList10;
            } else {
                int readInt5 = parcel.readInt();
                arrayList8 = new ArrayList(readInt5);
                int i5 = 0;
                arrayList6 = arrayList6;
                while (i5 != readInt5) {
                    i5 = en.a(MarketFormDropdownOptionDto.CREATOR, parcel, arrayList8, i5, 1);
                    readInt5 = readInt5;
                    arrayList6 = arrayList6;
                }
            }
            ArrayList arrayList13 = arrayList6;
            ArrayList arrayList14 = arrayList8;
            if (parcel.readInt() != 0) {
                int readInt6 = parcel.readInt();
                ArrayList arrayList15 = new ArrayList(readInt6);
                int i6 = 0;
                ArrayList arrayList16 = arrayList8;
                while (i6 != readInt6) {
                    i6 = en.a(MarketFormDeliveryOptionsDto.CREATOR, parcel, arrayList15, i6, 1);
                    readInt6 = readInt6;
                    arrayList16 = arrayList16;
                }
                arrayList10 = arrayList15;
                arrayList14 = arrayList16;
            }
            return new MarketCheckoutOrderSettingsFormControlDto(typeDto, str, readString2, readString3, readString4, readString5, readString6, bool, readString7, readString8, readString9, readString10, readString11, readString12, marketOrderSettingsActionDto, baseCityDto, baseCountryDto, arrayList4, marketDeliveryPointDto, arrayList3, arrayList7, obj2, arrayList13, arrayList14, arrayList10, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutOrderSettingsFormControlDto[] newArray(int i) {
            return new MarketCheckoutOrderSettingsFormControlDto[i];
        }
    }

    public MarketCheckoutOrderSettingsFormControlDto(TypeDto typeDto, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, MarketOrderSettingsActionDto marketOrderSettingsActionDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, List<BaseImageDto> list, MarketDeliveryPointDto marketDeliveryPointDto, List<MarketDeliveryServiceDto> list2, List<Integer> list3, Boolean bool2, List<MarketCheckoutOrderDetailsPriceDto> list4, List<MarketFormDropdownOptionDto> list5, List<MarketFormDeliveryOptionsDto> list6, String str13) {
        this.type = typeDto;
        this.label = str;
        this.name = str2;
        this.value = str3;
        this.info = str4;
        this.text = str5;
        this.placeholder = str6;
        this.isRequired = bool;
        this.errorMsg = str7;
        this.successMsg = str8;
        this.validationRegex = str9;
        this.validationErrorMsg = str10;
        this.requiredErrorMsg = str11;
        this.buttonCaption = str12;
        this.action = marketOrderSettingsActionDto;
        this.city = baseCityDto;
        this.country = baseCountryDto;
        this.images = list;
        this.deliveryPoint = marketDeliveryPointDto;
        this.availableServices = list2;
        this.allowedValueIds = list3;
        this.affectsPrice = bool2;
        this.prices = list4;
        this.options = list5;
        this.deliveryOptions = list6;
        this.selectedOption = str13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCheckoutOrderSettingsFormControlDto)) {
            return false;
        }
        MarketCheckoutOrderSettingsFormControlDto marketCheckoutOrderSettingsFormControlDto = (MarketCheckoutOrderSettingsFormControlDto) obj;
        return this.type == marketCheckoutOrderSettingsFormControlDto.type && epx.f(this.label, marketCheckoutOrderSettingsFormControlDto.label) && epx.f(this.name, marketCheckoutOrderSettingsFormControlDto.name) && epx.f(this.value, marketCheckoutOrderSettingsFormControlDto.value) && epx.f(this.info, marketCheckoutOrderSettingsFormControlDto.info) && epx.f(this.text, marketCheckoutOrderSettingsFormControlDto.text) && epx.f(this.placeholder, marketCheckoutOrderSettingsFormControlDto.placeholder) && epx.f(this.isRequired, marketCheckoutOrderSettingsFormControlDto.isRequired) && epx.f(this.errorMsg, marketCheckoutOrderSettingsFormControlDto.errorMsg) && epx.f(this.successMsg, marketCheckoutOrderSettingsFormControlDto.successMsg) && epx.f(this.validationRegex, marketCheckoutOrderSettingsFormControlDto.validationRegex) && epx.f(this.validationErrorMsg, marketCheckoutOrderSettingsFormControlDto.validationErrorMsg) && epx.f(this.requiredErrorMsg, marketCheckoutOrderSettingsFormControlDto.requiredErrorMsg) && epx.f(this.buttonCaption, marketCheckoutOrderSettingsFormControlDto.buttonCaption) && epx.f(this.action, marketCheckoutOrderSettingsFormControlDto.action) && epx.f(this.city, marketCheckoutOrderSettingsFormControlDto.city) && epx.f(this.country, marketCheckoutOrderSettingsFormControlDto.country) && epx.f(this.images, marketCheckoutOrderSettingsFormControlDto.images) && epx.f(this.deliveryPoint, marketCheckoutOrderSettingsFormControlDto.deliveryPoint) && epx.f(this.availableServices, marketCheckoutOrderSettingsFormControlDto.availableServices) && epx.f(this.allowedValueIds, marketCheckoutOrderSettingsFormControlDto.allowedValueIds) && epx.f(this.affectsPrice, marketCheckoutOrderSettingsFormControlDto.affectsPrice) && epx.f(this.prices, marketCheckoutOrderSettingsFormControlDto.prices) && epx.f(this.options, marketCheckoutOrderSettingsFormControlDto.options) && epx.f(this.deliveryOptions, marketCheckoutOrderSettingsFormControlDto.deliveryOptions) && epx.f(this.selectedOption, marketCheckoutOrderSettingsFormControlDto.selectedOption);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.label;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.info;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.text;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.placeholder;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.isRequired;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.errorMsg;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.successMsg;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.validationRegex;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.validationErrorMsg;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.requiredErrorMsg;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.buttonCaption;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        MarketOrderSettingsActionDto marketOrderSettingsActionDto = this.action;
        int hashCode15 = (hashCode14 + (marketOrderSettingsActionDto == null ? 0 : marketOrderSettingsActionDto.hashCode())) * 31;
        BaseCityDto baseCityDto = this.city;
        int hashCode16 = (hashCode15 + (baseCityDto == null ? 0 : baseCityDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode17 = (hashCode16 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode18 = (hashCode17 + (list == null ? 0 : list.hashCode())) * 31;
        MarketDeliveryPointDto marketDeliveryPointDto = this.deliveryPoint;
        int hashCode19 = (hashCode18 + (marketDeliveryPointDto == null ? 0 : marketDeliveryPointDto.hashCode())) * 31;
        List<MarketDeliveryServiceDto> list2 = this.availableServices;
        int hashCode20 = (hashCode19 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.allowedValueIds;
        int hashCode21 = (hashCode20 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool2 = this.affectsPrice;
        int hashCode22 = (hashCode21 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<MarketCheckoutOrderDetailsPriceDto> list4 = this.prices;
        int hashCode23 = (hashCode22 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<MarketFormDropdownOptionDto> list5 = this.options;
        int hashCode24 = (hashCode23 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<MarketFormDeliveryOptionsDto> list6 = this.deliveryOptions;
        int hashCode25 = (hashCode24 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str13 = this.selectedOption;
        return hashCode25 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCheckoutOrderSettingsFormControlDto(type=");
        sb.append(this.type);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", placeholder=");
        sb.append(this.placeholder);
        sb.append(", isRequired=");
        sb.append(this.isRequired);
        sb.append(", errorMsg=");
        sb.append(this.errorMsg);
        sb.append(", successMsg=");
        sb.append(this.successMsg);
        sb.append(", validationRegex=");
        sb.append(this.validationRegex);
        sb.append(", validationErrorMsg=");
        sb.append(this.validationErrorMsg);
        sb.append(", requiredErrorMsg=");
        sb.append(this.requiredErrorMsg);
        sb.append(", buttonCaption=");
        sb.append(this.buttonCaption);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", deliveryPoint=");
        sb.append(this.deliveryPoint);
        sb.append(", availableServices=");
        sb.append(this.availableServices);
        sb.append(", allowedValueIds=");
        sb.append(this.allowedValueIds);
        sb.append(", affectsPrice=");
        sb.append(this.affectsPrice);
        sb.append(", prices=");
        sb.append(this.prices);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", deliveryOptions=");
        sb.append(this.deliveryOptions);
        sb.append(", selectedOption=");
        return ho8.a(sb, this.selectedOption, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.label);
        parcel.writeString(this.name);
        parcel.writeString(this.value);
        parcel.writeString(this.info);
        parcel.writeString(this.text);
        parcel.writeString(this.placeholder);
        Boolean bool = this.isRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.successMsg);
        parcel.writeString(this.validationRegex);
        parcel.writeString(this.validationErrorMsg);
        parcel.writeString(this.requiredErrorMsg);
        parcel.writeString(this.buttonCaption);
        MarketOrderSettingsActionDto marketOrderSettingsActionDto = this.action;
        if (marketOrderSettingsActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketOrderSettingsActionDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.city, i);
        parcel.writeParcelable(this.country, i);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        MarketDeliveryPointDto marketDeliveryPointDto = this.deliveryPoint;
        if (marketDeliveryPointDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketDeliveryPointDto.writeToParcel(parcel, i);
        }
        List<MarketDeliveryServiceDto> list2 = this.availableServices;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketDeliveryServiceDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<Integer> list3 = this.allowedValueIds;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeInt(((Number) f3.next()).intValue());
            }
        }
        Boolean bool2 = this.affectsPrice;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        List<MarketCheckoutOrderDetailsPriceDto> list4 = this.prices;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((MarketCheckoutOrderDetailsPriceDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketFormDropdownOptionDto> list5 = this.options;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((MarketFormDropdownOptionDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketFormDeliveryOptionsDto> list6 = this.deliveryOptions;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                ((MarketFormDeliveryOptionsDto) f6.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.selectedOption);
    }

    public /* synthetic */ MarketCheckoutOrderSettingsFormControlDto(TypeDto typeDto, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, String str9, String str10, String str11, String str12, MarketOrderSettingsActionDto marketOrderSettingsActionDto, BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, List list, MarketDeliveryPointDto marketDeliveryPointDto, List list2, List list3, Boolean bool2, List list4, List list5, List list6, String str13, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : marketOrderSettingsActionDto, (i & 32768) != 0 ? null : baseCityDto, (i & 65536) != 0 ? null : baseCountryDto, (i & 131072) != 0 ? null : list, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : marketDeliveryPointDto, (i & 524288) != 0 ? null : list2, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : list3, (i & 2097152) != 0 ? null : bool2, (i & 4194304) != 0 ? null : list4, (i & 8388608) != 0 ? null : list5, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : list6, (i & 33554432) != 0 ? null : str13);
    }
}
