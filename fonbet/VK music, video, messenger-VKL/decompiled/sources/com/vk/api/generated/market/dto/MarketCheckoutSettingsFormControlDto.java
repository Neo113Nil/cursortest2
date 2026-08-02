package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseCountryDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MarketCheckoutSettingsFormControlDto.kt */
/* loaded from: classes15.dex */
public final class MarketCheckoutSettingsFormControlDto implements Parcelable {
    public static final Parcelable.Creator<MarketCheckoutSettingsFormControlDto> CREATOR = new a();

    @pmi0("action")
    private final MarketCheckoutSettingsActionDto action;

    @pmi0(RTCStatsConstants.KEY_ADDRESS)
    private final MarketCheckoutSettingsAddressDto address;

    @pmi0("affects_price")
    private final Boolean affectsPrice;

    @pmi0("allowed_value_ids")
    private final List<Integer> allowedValueIds;

    @pmi0("available_services")
    private final List<MarketDeliveryServiceDto> availableServices;

    @pmi0("button_caption")
    private final String buttonCaption;

    @pmi0("city")
    private final MarketCityWithCoordinatesDto city;

    @pmi0("country")
    private final BaseCountryDto country;

    @pmi0("delivery_options")
    private final List<MarketCheckoutDeliveryOptionDto> deliveryOptions;

    @pmi0("delivery_point")
    private final MarketDeliveryPointWithGroupDto deliveryPoint;

    @pmi0(SharedKt.PARAM_ERROR_MSG)
    private final String errorMsg;

    @pmi0("hint")
    private final String hint;

    @pmi0("info")
    private final String info;

    @pmi0("input_type")
    private final InputTypeDto inputType;

    @pmi0("is_required")
    private final Boolean isRequired;

    @pmi0("label")
    private final String label;

    @pmi0("name")
    private final String name;

    @pmi0(SignalingProtocol.KEY_OPTIONS)
    private final List<MarketFormDropdownOptionDto> options;

    @pmi0("payment_info")
    private final MarketCheckoutSettingsPaymentInfoDto paymentInfo;

    @pmi0("payment_options")
    private final List<MarketCheckoutSettingsPriceOptionDto> paymentOptions;

    @pmi0("placeholder")
    private final String placeholder;

    @pmi0("prices")
    private final List<MarketCheckoutOrderDetailsPriceDto> prices;

    @pmi0("required_error_msg")
    private final String requiredErrorMsg;

    @pmi0("selected_option")
    private final String selectedOption;

    @pmi0("selected_payment_option")
    private final String selectedPaymentOption;

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
    /* compiled from: MarketCheckoutSettingsFormControlDto.kt */
    public static final class InputTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InputTypeDto[] $VALUES;
        public static final Parcelable.Creator<InputTypeDto> CREATOR;

        @pmi0("email")
        public static final InputTypeDto EMAIL;

        @pmi0("number")
        public static final InputTypeDto NUMBER;

        @pmi0("phone")
        public static final InputTypeDto PHONE;

        @pmi0("text")
        public static final InputTypeDto TEXT;

        @pmi0("textarea")
        public static final InputTypeDto TEXTAREA;
        private final String value;

        /* compiled from: MarketCheckoutSettingsFormControlDto.kt */
        public static final class a implements Parcelable.Creator<InputTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final InputTypeDto createFromParcel(Parcel parcel) {
                return InputTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InputTypeDto[] newArray(int i) {
                return new InputTypeDto[i];
            }
        }

        static {
            InputTypeDto inputTypeDto = new InputTypeDto("TEXT", 0, "text");
            TEXT = inputTypeDto;
            InputTypeDto inputTypeDto2 = new InputTypeDto("TEXTAREA", 1, "textarea");
            TEXTAREA = inputTypeDto2;
            InputTypeDto inputTypeDto3 = new InputTypeDto("NUMBER", 2, "number");
            NUMBER = inputTypeDto3;
            InputTypeDto inputTypeDto4 = new InputTypeDto("PHONE", 3, "phone");
            PHONE = inputTypeDto4;
            InputTypeDto inputTypeDto5 = new InputTypeDto(CommonConstant.RETKEY.EMAIL, 4, "email");
            EMAIL = inputTypeDto5;
            InputTypeDto[] inputTypeDtoArr = {inputTypeDto, inputTypeDto2, inputTypeDto3, inputTypeDto4, inputTypeDto5};
            $VALUES = inputTypeDtoArr;
            $ENTRIES = new asp(inputTypeDtoArr);
            CREATOR = new a();
        }

        private InputTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static InputTypeDto valueOf(String str) {
            return (InputTypeDto) Enum.valueOf(InputTypeDto.class, str);
        }

        public static InputTypeDto[] values() {
            return (InputTypeDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketCheckoutSettingsFormControlDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("action")
        public static final TypeDto ACTION;

        @pmi0("address_input_courier")
        public static final TypeDto ADDRESS_INPUT_COURIER;

        @pmi0("address_input_self")
        public static final TypeDto ADDRESS_INPUT_SELF;

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

        @pmi0("payment_info")
        public static final TypeDto PAYMENT_INFO;

        @pmi0("payment_options")
        public static final TypeDto PAYMENT_OPTIONS;

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

        /* compiled from: MarketCheckoutSettingsFormControlDto.kt */
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
            TypeDto typeDto20 = new TypeDto("ADDRESS_INPUT_COURIER", 19, "address_input_courier");
            ADDRESS_INPUT_COURIER = typeDto20;
            TypeDto typeDto21 = new TypeDto("ADDRESS_INPUT_SELF", 20, "address_input_self");
            ADDRESS_INPUT_SELF = typeDto21;
            TypeDto typeDto22 = new TypeDto("PAYMENT_OPTIONS", 21, "payment_options");
            PAYMENT_OPTIONS = typeDto22;
            TypeDto typeDto23 = new TypeDto("PAYMENT_INFO", 22, "payment_info");
            PAYMENT_INFO = typeDto23;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14, typeDto15, typeDto16, typeDto17, typeDto18, typeDto19, typeDto20, typeDto21, typeDto22, typeDto23};
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

    /* compiled from: MarketCheckoutSettingsFormControlDto.kt */
    public static final class a implements Parcelable.Creator<MarketCheckoutSettingsFormControlDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsFormControlDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf2;
            Boolean bool;
            ArrayList arrayList4;
            ArrayList arrayList5;
            TypeDto typeDto;
            ArrayList arrayList6;
            MarketCheckoutSettingsPaymentInfoDto marketCheckoutSettingsPaymentInfoDto;
            ArrayList arrayList7;
            ArrayList arrayList8;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            MarketCheckoutSettingsActionDto createFromParcel2 = parcel.readInt() == 0 ? null : MarketCheckoutSettingsActionDto.CREATOR.createFromParcel(parcel);
            MarketCheckoutSettingsAddressDto createFromParcel3 = parcel.readInt() == 0 ? null : MarketCheckoutSettingsAddressDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(MarketDeliveryServiceDto.CREATOR, parcel, arrayList9, i2, 1);
                }
                arrayList2 = arrayList9;
            }
            ArrayList arrayList10 = arrayList;
            String readString = parcel.readString();
            MarketCityWithCoordinatesDto createFromParcel4 = parcel.readInt() == 0 ? null : MarketCityWithCoordinatesDto.CREATOR.createFromParcel(parcel);
            BaseCountryDto baseCountryDto = (BaseCountryDto) parcel.readParcelable(MarketCheckoutSettingsFormControlDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(MarketCheckoutDeliveryOptionDto.CREATOR, parcel, arrayList3, i3, 1);
                }
            }
            MarketDeliveryPointWithGroupDto createFromParcel5 = parcel.readInt() == 0 ? null : MarketDeliveryPointWithGroupDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList11 = arrayList3;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            InputTypeDto createFromParcel6 = parcel.readInt() == 0 ? null : InputTypeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            Boolean bool2 = valueOf2;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt4 = parcel.readInt();
                bool = valueOf;
                arrayList4 = new ArrayList(readInt4);
                arrayList5 = arrayList10;
                int i4 = 0;
                while (true) {
                    typeDto = createFromParcel;
                    if (i4 == readInt4) {
                        break;
                    }
                    i4 = en.a(MarketFormDropdownOptionDto.CREATOR, parcel, arrayList4, i4, 1);
                    createFromParcel = typeDto;
                    createFromParcel2 = createFromParcel2;
                }
            } else {
                bool = valueOf;
                arrayList5 = arrayList10;
                arrayList4 = null;
                typeDto = createFromParcel;
            }
            MarketCheckoutSettingsActionDto marketCheckoutSettingsActionDto = createFromParcel2;
            if (parcel.readInt() == 0) {
                arrayList6 = null;
            } else {
                int readInt5 = parcel.readInt();
                arrayList6 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = en.a(MarketCheckoutSettingsPriceOptionDto.CREATOR, parcel, arrayList6, i5, 1);
                    arrayList4 = arrayList4;
                }
            }
            ArrayList arrayList12 = arrayList4;
            MarketCheckoutSettingsPaymentInfoDto createFromParcel7 = parcel.readInt() == 0 ? null : MarketCheckoutSettingsPaymentInfoDto.CREATOR.createFromParcel(parcel);
            ArrayList arrayList13 = arrayList5;
            String readString7 = parcel.readString();
            if (parcel.readInt() == 0) {
                marketCheckoutSettingsPaymentInfoDto = createFromParcel7;
                arrayList7 = arrayList13;
                arrayList8 = null;
            } else {
                int readInt6 = parcel.readInt();
                ArrayList arrayList14 = new ArrayList(readInt6);
                marketCheckoutSettingsPaymentInfoDto = createFromParcel7;
                int i6 = 0;
                while (true) {
                    arrayList7 = arrayList13;
                    if (i6 == readInt6) {
                        break;
                    }
                    i6 = en.a(MarketCheckoutOrderDetailsPriceDto.CREATOR, parcel, arrayList14, i6, 1);
                    arrayList13 = arrayList7;
                    arrayList6 = arrayList6;
                }
                arrayList8 = arrayList14;
            }
            return new MarketCheckoutSettingsFormControlDto(typeDto, marketCheckoutSettingsActionDto, createFromParcel3, bool, arrayList7, arrayList2, readString, createFromParcel4, baseCountryDto, arrayList11, createFromParcel5, readString2, readString3, createFromParcel6, bool2, readString4, readString5, readString6, arrayList12, arrayList6, marketCheckoutSettingsPaymentInfoDto, readString7, arrayList8, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketCheckoutSettingsFormControlDto[] newArray(int i) {
            return new MarketCheckoutSettingsFormControlDto[i];
        }
    }

    public MarketCheckoutSettingsFormControlDto(TypeDto typeDto, MarketCheckoutSettingsActionDto marketCheckoutSettingsActionDto, MarketCheckoutSettingsAddressDto marketCheckoutSettingsAddressDto, Boolean bool, List<Integer> list, List<MarketDeliveryServiceDto> list2, String str, MarketCityWithCoordinatesDto marketCityWithCoordinatesDto, BaseCountryDto baseCountryDto, List<MarketCheckoutDeliveryOptionDto> list3, MarketDeliveryPointWithGroupDto marketDeliveryPointWithGroupDto, String str2, String str3, InputTypeDto inputTypeDto, Boolean bool2, String str4, String str5, String str6, List<MarketFormDropdownOptionDto> list4, List<MarketCheckoutSettingsPriceOptionDto> list5, MarketCheckoutSettingsPaymentInfoDto marketCheckoutSettingsPaymentInfoDto, String str7, List<MarketCheckoutOrderDetailsPriceDto> list6, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.type = typeDto;
        this.action = marketCheckoutSettingsActionDto;
        this.address = marketCheckoutSettingsAddressDto;
        this.affectsPrice = bool;
        this.allowedValueIds = list;
        this.availableServices = list2;
        this.buttonCaption = str;
        this.city = marketCityWithCoordinatesDto;
        this.country = baseCountryDto;
        this.deliveryOptions = list3;
        this.deliveryPoint = marketDeliveryPointWithGroupDto;
        this.errorMsg = str2;
        this.info = str3;
        this.inputType = inputTypeDto;
        this.isRequired = bool2;
        this.hint = str4;
        this.label = str5;
        this.name = str6;
        this.options = list4;
        this.paymentOptions = list5;
        this.paymentInfo = marketCheckoutSettingsPaymentInfoDto;
        this.placeholder = str7;
        this.prices = list6;
        this.requiredErrorMsg = str8;
        this.selectedOption = str9;
        this.selectedPaymentOption = str10;
        this.successMsg = str11;
        this.text = str12;
        this.validationRegex = str13;
        this.validationErrorMsg = str14;
        this.value = str15;
    }

    public final String B() {
        return this.name;
    }

    public final List<MarketFormDropdownOptionDto> C() {
        return this.options;
    }

    public final MarketCheckoutSettingsPaymentInfoDto D() {
        return this.paymentInfo;
    }

    public final List<MarketCheckoutSettingsPriceOptionDto> F() {
        return this.paymentOptions;
    }

    public final String G() {
        return this.placeholder;
    }

    public final List<MarketCheckoutOrderDetailsPriceDto> K() {
        return this.prices;
    }

    public final String M() {
        return this.requiredErrorMsg;
    }

    public final String R() {
        return this.selectedOption;
    }

    public final String T() {
        return this.selectedPaymentOption;
    }

    public final String W() {
        return this.successMsg;
    }

    public final String Z() {
        return this.text;
    }

    public final TypeDto a0() {
        return this.type;
    }

    public final MarketCheckoutSettingsActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MarketCheckoutSettingsAddressDto e() {
        return this.address;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketCheckoutSettingsFormControlDto)) {
            return false;
        }
        MarketCheckoutSettingsFormControlDto marketCheckoutSettingsFormControlDto = (MarketCheckoutSettingsFormControlDto) obj;
        return this.type == marketCheckoutSettingsFormControlDto.type && epx.f(this.action, marketCheckoutSettingsFormControlDto.action) && epx.f(this.address, marketCheckoutSettingsFormControlDto.address) && epx.f(this.affectsPrice, marketCheckoutSettingsFormControlDto.affectsPrice) && epx.f(this.allowedValueIds, marketCheckoutSettingsFormControlDto.allowedValueIds) && epx.f(this.availableServices, marketCheckoutSettingsFormControlDto.availableServices) && epx.f(this.buttonCaption, marketCheckoutSettingsFormControlDto.buttonCaption) && epx.f(this.city, marketCheckoutSettingsFormControlDto.city) && epx.f(this.country, marketCheckoutSettingsFormControlDto.country) && epx.f(this.deliveryOptions, marketCheckoutSettingsFormControlDto.deliveryOptions) && epx.f(this.deliveryPoint, marketCheckoutSettingsFormControlDto.deliveryPoint) && epx.f(this.errorMsg, marketCheckoutSettingsFormControlDto.errorMsg) && epx.f(this.info, marketCheckoutSettingsFormControlDto.info) && this.inputType == marketCheckoutSettingsFormControlDto.inputType && epx.f(this.isRequired, marketCheckoutSettingsFormControlDto.isRequired) && epx.f(this.hint, marketCheckoutSettingsFormControlDto.hint) && epx.f(this.label, marketCheckoutSettingsFormControlDto.label) && epx.f(this.name, marketCheckoutSettingsFormControlDto.name) && epx.f(this.options, marketCheckoutSettingsFormControlDto.options) && epx.f(this.paymentOptions, marketCheckoutSettingsFormControlDto.paymentOptions) && epx.f(this.paymentInfo, marketCheckoutSettingsFormControlDto.paymentInfo) && epx.f(this.placeholder, marketCheckoutSettingsFormControlDto.placeholder) && epx.f(this.prices, marketCheckoutSettingsFormControlDto.prices) && epx.f(this.requiredErrorMsg, marketCheckoutSettingsFormControlDto.requiredErrorMsg) && epx.f(this.selectedOption, marketCheckoutSettingsFormControlDto.selectedOption) && epx.f(this.selectedPaymentOption, marketCheckoutSettingsFormControlDto.selectedPaymentOption) && epx.f(this.successMsg, marketCheckoutSettingsFormControlDto.successMsg) && epx.f(this.text, marketCheckoutSettingsFormControlDto.text) && epx.f(this.validationRegex, marketCheckoutSettingsFormControlDto.validationRegex) && epx.f(this.validationErrorMsg, marketCheckoutSettingsFormControlDto.validationErrorMsg) && epx.f(this.value, marketCheckoutSettingsFormControlDto.value);
    }

    public final Boolean f() {
        return this.affectsPrice;
    }

    public final List<MarketDeliveryServiceDto> g() {
        return this.availableServices;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        MarketCheckoutSettingsActionDto marketCheckoutSettingsActionDto = this.action;
        int hashCode2 = (hashCode + (marketCheckoutSettingsActionDto == null ? 0 : marketCheckoutSettingsActionDto.hashCode())) * 31;
        MarketCheckoutSettingsAddressDto marketCheckoutSettingsAddressDto = this.address;
        int hashCode3 = (hashCode2 + (marketCheckoutSettingsAddressDto == null ? 0 : marketCheckoutSettingsAddressDto.hashCode())) * 31;
        Boolean bool = this.affectsPrice;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Integer> list = this.allowedValueIds;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<MarketDeliveryServiceDto> list2 = this.availableServices;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.buttonCaption;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        MarketCityWithCoordinatesDto marketCityWithCoordinatesDto = this.city;
        int hashCode8 = (hashCode7 + (marketCityWithCoordinatesDto == null ? 0 : marketCityWithCoordinatesDto.hashCode())) * 31;
        BaseCountryDto baseCountryDto = this.country;
        int hashCode9 = (hashCode8 + (baseCountryDto == null ? 0 : baseCountryDto.hashCode())) * 31;
        List<MarketCheckoutDeliveryOptionDto> list3 = this.deliveryOptions;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        MarketDeliveryPointWithGroupDto marketDeliveryPointWithGroupDto = this.deliveryPoint;
        int hashCode11 = (hashCode10 + (marketDeliveryPointWithGroupDto == null ? 0 : marketDeliveryPointWithGroupDto.hashCode())) * 31;
        String str2 = this.errorMsg;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.info;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        InputTypeDto inputTypeDto = this.inputType;
        int hashCode14 = (hashCode13 + (inputTypeDto == null ? 0 : inputTypeDto.hashCode())) * 31;
        Boolean bool2 = this.isRequired;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.hint;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.label;
        int hashCode17 = (hashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.name;
        int hashCode18 = (hashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<MarketFormDropdownOptionDto> list4 = this.options;
        int hashCode19 = (hashCode18 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<MarketCheckoutSettingsPriceOptionDto> list5 = this.paymentOptions;
        int hashCode20 = (hashCode19 + (list5 == null ? 0 : list5.hashCode())) * 31;
        MarketCheckoutSettingsPaymentInfoDto marketCheckoutSettingsPaymentInfoDto = this.paymentInfo;
        int hashCode21 = (hashCode20 + (marketCheckoutSettingsPaymentInfoDto == null ? 0 : marketCheckoutSettingsPaymentInfoDto.hashCode())) * 31;
        String str7 = this.placeholder;
        int hashCode22 = (hashCode21 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<MarketCheckoutOrderDetailsPriceDto> list6 = this.prices;
        int hashCode23 = (hashCode22 + (list6 == null ? 0 : list6.hashCode())) * 31;
        String str8 = this.requiredErrorMsg;
        int hashCode24 = (hashCode23 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.selectedOption;
        int hashCode25 = (hashCode24 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.selectedPaymentOption;
        int hashCode26 = (hashCode25 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.successMsg;
        int hashCode27 = (hashCode26 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.text;
        int hashCode28 = (hashCode27 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.validationRegex;
        int hashCode29 = (hashCode28 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.validationErrorMsg;
        int hashCode30 = (hashCode29 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.value;
        return hashCode30 + (str15 != null ? str15.hashCode() : 0);
    }

    public final String i() {
        return this.buttonCaption;
    }

    public final MarketCityWithCoordinatesDto j() {
        return this.city;
    }

    public final List<MarketCheckoutDeliveryOptionDto> k() {
        return this.deliveryOptions;
    }

    public final MarketDeliveryPointWithGroupDto l() {
        return this.deliveryPoint;
    }

    public final String l0() {
        return this.validationErrorMsg;
    }

    public final String n() {
        return this.errorMsg;
    }

    public final String o() {
        return this.info;
    }

    public final InputTypeDto p() {
        return this.inputType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketCheckoutSettingsFormControlDto(type=");
        sb.append(this.type);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", affectsPrice=");
        sb.append(this.affectsPrice);
        sb.append(", allowedValueIds=");
        sb.append(this.allowedValueIds);
        sb.append(", availableServices=");
        sb.append(this.availableServices);
        sb.append(", buttonCaption=");
        sb.append(this.buttonCaption);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", deliveryOptions=");
        sb.append(this.deliveryOptions);
        sb.append(", deliveryPoint=");
        sb.append(this.deliveryPoint);
        sb.append(", errorMsg=");
        sb.append(this.errorMsg);
        sb.append(", info=");
        sb.append(this.info);
        sb.append(", inputType=");
        sb.append(this.inputType);
        sb.append(", isRequired=");
        sb.append(this.isRequired);
        sb.append(", hint=");
        sb.append(this.hint);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", options=");
        sb.append(this.options);
        sb.append(", paymentOptions=");
        sb.append(this.paymentOptions);
        sb.append(", paymentInfo=");
        sb.append(this.paymentInfo);
        sb.append(", placeholder=");
        sb.append(this.placeholder);
        sb.append(", prices=");
        sb.append(this.prices);
        sb.append(", requiredErrorMsg=");
        sb.append(this.requiredErrorMsg);
        sb.append(", selectedOption=");
        sb.append(this.selectedOption);
        sb.append(", selectedPaymentOption=");
        sb.append(this.selectedPaymentOption);
        sb.append(", successMsg=");
        sb.append(this.successMsg);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", validationRegex=");
        sb.append(this.validationRegex);
        sb.append(", validationErrorMsg=");
        sb.append(this.validationErrorMsg);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    public final String u() {
        return this.label;
    }

    public final String v0() {
        return this.validationRegex;
    }

    public final String w0() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        MarketCheckoutSettingsActionDto marketCheckoutSettingsActionDto = this.action;
        if (marketCheckoutSettingsActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCheckoutSettingsActionDto.writeToParcel(parcel, i);
        }
        MarketCheckoutSettingsAddressDto marketCheckoutSettingsAddressDto = this.address;
        if (marketCheckoutSettingsAddressDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCheckoutSettingsAddressDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.affectsPrice;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<Integer> list = this.allowedValueIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
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
        parcel.writeString(this.buttonCaption);
        MarketCityWithCoordinatesDto marketCityWithCoordinatesDto = this.city;
        if (marketCityWithCoordinatesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCityWithCoordinatesDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.country, i);
        List<MarketCheckoutDeliveryOptionDto> list3 = this.deliveryOptions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((MarketCheckoutDeliveryOptionDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        MarketDeliveryPointWithGroupDto marketDeliveryPointWithGroupDto = this.deliveryPoint;
        if (marketDeliveryPointWithGroupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketDeliveryPointWithGroupDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.info);
        InputTypeDto inputTypeDto = this.inputType;
        if (inputTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputTypeDto.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.isRequired;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeString(this.hint);
        parcel.writeString(this.label);
        parcel.writeString(this.name);
        List<MarketFormDropdownOptionDto> list4 = this.options;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((MarketFormDropdownOptionDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketCheckoutSettingsPriceOptionDto> list5 = this.paymentOptions;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                ((MarketCheckoutSettingsPriceOptionDto) f5.next()).writeToParcel(parcel, i);
            }
        }
        MarketCheckoutSettingsPaymentInfoDto marketCheckoutSettingsPaymentInfoDto = this.paymentInfo;
        if (marketCheckoutSettingsPaymentInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketCheckoutSettingsPaymentInfoDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.placeholder);
        List<MarketCheckoutOrderDetailsPriceDto> list6 = this.prices;
        if (list6 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f6 = dn.f(parcel, list6, 1);
            while (f6.hasNext()) {
                ((MarketCheckoutOrderDetailsPriceDto) f6.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.requiredErrorMsg);
        parcel.writeString(this.selectedOption);
        parcel.writeString(this.selectedPaymentOption);
        parcel.writeString(this.successMsg);
        parcel.writeString(this.text);
        parcel.writeString(this.validationRegex);
        parcel.writeString(this.validationErrorMsg);
        parcel.writeString(this.value);
    }

    public final Boolean y0() {
        return this.isRequired;
    }

    public /* synthetic */ MarketCheckoutSettingsFormControlDto(TypeDto typeDto, MarketCheckoutSettingsActionDto marketCheckoutSettingsActionDto, MarketCheckoutSettingsAddressDto marketCheckoutSettingsAddressDto, Boolean bool, List list, List list2, String str, MarketCityWithCoordinatesDto marketCityWithCoordinatesDto, BaseCountryDto baseCountryDto, List list3, MarketDeliveryPointWithGroupDto marketDeliveryPointWithGroupDto, String str2, String str3, InputTypeDto inputTypeDto, Boolean bool2, String str4, String str5, String str6, List list4, List list5, MarketCheckoutSettingsPaymentInfoDto marketCheckoutSettingsPaymentInfoDto, String str7, List list6, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : marketCheckoutSettingsActionDto, (i & 4) != 0 ? null : marketCheckoutSettingsAddressDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : marketCityWithCoordinatesDto, (i & 256) != 0 ? null : baseCountryDto, (i & 512) != 0 ? null : list3, (i & 1024) != 0 ? null : marketDeliveryPointWithGroupDto, (i & 2048) != 0 ? null : str2, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? null : inputTypeDto, (i & 16384) != 0 ? null : bool2, (i & 32768) != 0 ? null : str4, (i & 65536) != 0 ? null : str5, (i & 131072) != 0 ? null : str6, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list4, (i & 524288) != 0 ? null : list5, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : marketCheckoutSettingsPaymentInfoDto, (i & 2097152) != 0 ? null : str7, (i & 4194304) != 0 ? null : list6, (i & 8388608) != 0 ? null : str8, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : str9, (i & 33554432) != 0 ? null : str10, (i & 67108864) != 0 ? null : str11, (i & 134217728) != 0 ? null : str12, (i & 268435456) != 0 ? null : str13, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : str14, (i & 1073741824) != 0 ? null : str15);
    }
}
