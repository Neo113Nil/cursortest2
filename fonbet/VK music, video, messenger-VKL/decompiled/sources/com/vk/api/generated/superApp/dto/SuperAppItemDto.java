package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import io.reactivex.rxjava3.subjects.b;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.so;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SuperAppItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppItemDto> CREATOR = new a();

    @pmi0("is_enabled")
    private final Boolean isEnabled;

    @pmi0("is_promo")
    private final Boolean isPromo;

    @pmi0("is_unremovable")
    private final Boolean isUnremovable;

    @pmi0("is_updated_by_queue")
    private final Boolean isUpdatedByQueue;

    @pmi0("payload")
    private final SuperAppWidgetPayloadDto payload;

    @pmi0("payload_hash")
    private final String payloadHash;

    @pmi0("size")
    private final SizeDto size;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("uid")
    private final String uid;

    @pmi0("update_options")
    private final SuperAppItemUpdateOptionsDto updateOptions;

    @pmi0("weight")
    private final Float weight;

    @pmi0("widget_id")
    private final String widgetId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperAppItemDto.kt */
    public static final class SizeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;

        @pmi0("compact")
        public static final SizeDto COMPACT;
        public static final Parcelable.Creator<SizeDto> CREATOR;

        @pmi0("regular")
        public static final SizeDto REGULAR;
        private final String value;

        /* compiled from: SuperAppItemDto.kt */
        public static final class a implements Parcelable.Creator<SizeDto> {
            @Override // android.os.Parcelable.Creator
            public final SizeDto createFromParcel(Parcel parcel) {
                return SizeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SizeDto[] newArray(int i) {
                return new SizeDto[i];
            }
        }

        static {
            SizeDto sizeDto = new SizeDto("REGULAR", 0, "regular");
            REGULAR = sizeDto;
            SizeDto sizeDto2 = new SizeDto("COMPACT", 1, "compact");
            COMPACT = sizeDto2;
            SizeDto[] sizeDtoArr = {sizeDto, sizeDto2};
            $VALUES = sizeDtoArr;
            $ENTRIES = new asp(sizeDtoArr);
            CREATOR = new a();
        }

        private SizeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SizeDto valueOf(String str) {
            return (SizeDto) Enum.valueOf(SizeDto.class, str);
        }

        public static SizeDto[] values() {
            return (SizeDto[]) $VALUES.clone();
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
    /* compiled from: SuperAppItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("ads_easy_promote")
        public static final TypeDto ADS_EASY_PROMOTE;

        @pmi0("afisha")
        public static final TypeDto AFISHA;

        @pmi0("assistant_v2")
        public static final TypeDto ASSISTANT_V2;

        @pmi0("birthdays")
        public static final TypeDto BIRTHDAYS;

        @pmi0("coupon")
        public static final TypeDto COUPON;

        @pmi0("covid_dynamic")
        public static final TypeDto COVID_DYNAMIC;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("delivery_club")
        public static final TypeDto DELIVERY_CLUB;

        @pmi0("dock_block")
        public static final TypeDto DOCK_BLOCK;

        @pmi0("exchange_rates")
        public static final TypeDto EXCHANGE_RATES;

        @pmi0("friends")
        public static final TypeDto FRIENDS;

        @pmi0("games")
        public static final TypeDto GAMES;

        @pmi0("greeting")
        public static final TypeDto GREETING;

        @pmi0("greeting_v2")
        public static final TypeDto GREETING_V2;

        @pmi0("holiday")
        public static final TypeDto HOLIDAY;

        @pmi0("horizontal_button_scroll")
        public static final TypeDto HORIZONTAL_BUTTON_SCROLL;

        @pmi0("informer")
        public static final TypeDto INFORMER;

        @pmi0("menu")
        public static final TypeDto MENU;

        @pmi0("miniapps")
        public static final TypeDto MINIAPPS;

        @pmi0("mini_widgets")
        public static final TypeDto MINI_WIDGETS;

        @pmi0("music")
        public static final TypeDto MUSIC;

        @pmi0("onboarding_panel")
        public static final TypeDto ONBOARDING_PANEL;

        @pmi0(NotificationCompat.CATEGORY_PROMO)
        public static final TypeDto PROMO;

        @pmi0("showcase_menu")
        public static final TypeDto SHOWCASE_MENU;

        @pmi0("sport")
        public static final TypeDto SPORT;

        @pmi0("universal_card")
        public static final TypeDto UNIVERSAL_CARD;

        @pmi0("universal_counter")
        public static final TypeDto UNIVERSAL_COUNTER;

        @pmi0("universal_grid")
        public static final TypeDto UNIVERSAL_GRID;

        @pmi0("universal_informer")
        public static final TypeDto UNIVERSAL_INFORMER;

        @pmi0("universal_internal")
        public static final TypeDto UNIVERSAL_INTERNAL;

        @pmi0("universal_placeholder")
        public static final TypeDto UNIVERSAL_PLACEHOLDER;

        @pmi0("universal_scroll")
        public static final TypeDto UNIVERSAL_SCROLL;

        @pmi0("universal_table")
        public static final TypeDto UNIVERSAL_TABLE;

        @pmi0("vkpay_slim")
        public static final TypeDto VKPAY_SLIM;

        @pmi0("vk_run")
        public static final TypeDto VK_RUN;

        @pmi0("vk_taxi")
        public static final TypeDto VK_TAXI;

        @pmi0("weather")
        public static final TypeDto WEATHER;

        @pmi0("widget_skeleton")
        public static final TypeDto WIDGET_SKELETON;
        private final String value;

        /* compiled from: SuperAppItemDto.kt */
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
            TypeDto typeDto = new TypeDto("MENU", 0, "menu");
            MENU = typeDto;
            TypeDto typeDto2 = new TypeDto("SHOWCASE_MENU", 1, "showcase_menu");
            SHOWCASE_MENU = typeDto2;
            TypeDto typeDto3 = new TypeDto("PROMO", 2, NotificationCompat.CATEGORY_PROMO);
            PROMO = typeDto3;
            TypeDto typeDto4 = new TypeDto("DOCK_BLOCK", 3, "dock_block");
            DOCK_BLOCK = typeDto4;
            TypeDto typeDto5 = new TypeDto("GREETING_V2", 4, "greeting_v2");
            GREETING_V2 = typeDto5;
            TypeDto typeDto6 = new TypeDto("GREETING", 5, "greeting");
            GREETING = typeDto6;
            TypeDto typeDto7 = new TypeDto("HORIZONTAL_BUTTON_SCROLL", 6, "horizontal_button_scroll");
            HORIZONTAL_BUTTON_SCROLL = typeDto7;
            TypeDto typeDto8 = new TypeDto("WEATHER", 7, "weather");
            WEATHER = typeDto8;
            TypeDto typeDto9 = new TypeDto(Privacy.FRIENDS, 8, "friends");
            FRIENDS = typeDto9;
            TypeDto typeDto10 = new TypeDto("MUSIC", 9, "music");
            MUSIC = typeDto10;
            TypeDto typeDto11 = new TypeDto("SPORT", 10, "sport");
            SPORT = typeDto11;
            TypeDto typeDto12 = new TypeDto("VKPAY_SLIM", 11, "vkpay_slim");
            VKPAY_SLIM = typeDto12;
            TypeDto typeDto13 = new TypeDto("HOLIDAY", 12, "holiday");
            HOLIDAY = typeDto13;
            TypeDto typeDto14 = new TypeDto("INFORMER", 13, "informer");
            INFORMER = typeDto14;
            TypeDto typeDto15 = new TypeDto("AFISHA", 14, "afisha");
            AFISHA = typeDto15;
            TypeDto typeDto16 = new TypeDto("MINIAPPS", 15, "miniapps");
            MINIAPPS = typeDto16;
            TypeDto typeDto17 = new TypeDto("GAMES", 16, "games");
            GAMES = typeDto17;
            TypeDto typeDto18 = new TypeDto("EXCHANGE_RATES", 17, "exchange_rates");
            EXCHANGE_RATES = typeDto18;
            TypeDto typeDto19 = new TypeDto("BIRTHDAYS", 18, "birthdays");
            BIRTHDAYS = typeDto19;
            TypeDto typeDto20 = new TypeDto("COVID_DYNAMIC", 19, "covid_dynamic");
            COVID_DYNAMIC = typeDto20;
            TypeDto typeDto21 = new TypeDto("DELIVERY_CLUB", 20, "delivery_club");
            DELIVERY_CLUB = typeDto21;
            TypeDto typeDto22 = new TypeDto("VK_TAXI", 21, "vk_taxi");
            VK_TAXI = typeDto22;
            TypeDto typeDto23 = new TypeDto("ADS_EASY_PROMOTE", 22, "ads_easy_promote");
            ADS_EASY_PROMOTE = typeDto23;
            TypeDto typeDto24 = new TypeDto("UNIVERSAL_CARD", 23, "universal_card");
            UNIVERSAL_CARD = typeDto24;
            TypeDto typeDto25 = new TypeDto("UNIVERSAL_COUNTER", 24, "universal_counter");
            UNIVERSAL_COUNTER = typeDto25;
            TypeDto typeDto26 = new TypeDto("UNIVERSAL_GRID", 25, "universal_grid");
            UNIVERSAL_GRID = typeDto26;
            TypeDto typeDto27 = new TypeDto("UNIVERSAL_INFORMER", 26, "universal_informer");
            UNIVERSAL_INFORMER = typeDto27;
            TypeDto typeDto28 = new TypeDto("UNIVERSAL_INTERNAL", 27, "universal_internal");
            UNIVERSAL_INTERNAL = typeDto28;
            TypeDto typeDto29 = new TypeDto("UNIVERSAL_PLACEHOLDER", 28, "universal_placeholder");
            UNIVERSAL_PLACEHOLDER = typeDto29;
            TypeDto typeDto30 = new TypeDto("UNIVERSAL_SCROLL", 29, "universal_scroll");
            UNIVERSAL_SCROLL = typeDto30;
            TypeDto typeDto31 = new TypeDto("UNIVERSAL_TABLE", 30, "universal_table");
            UNIVERSAL_TABLE = typeDto31;
            TypeDto typeDto32 = new TypeDto("COUPON", 31, "coupon");
            COUPON = typeDto32;
            TypeDto typeDto33 = new TypeDto("VK_RUN", 32, "vk_run");
            VK_RUN = typeDto33;
            TypeDto typeDto34 = new TypeDto("MINI_WIDGETS", 33, "mini_widgets");
            MINI_WIDGETS = typeDto34;
            TypeDto typeDto35 = new TypeDto("ONBOARDING_PANEL", 34, "onboarding_panel");
            ONBOARDING_PANEL = typeDto35;
            TypeDto typeDto36 = new TypeDto("ASSISTANT_V2", 35, "assistant_v2");
            ASSISTANT_V2 = typeDto36;
            TypeDto typeDto37 = new TypeDto("WIDGET_SKELETON", 36, "widget_skeleton");
            WIDGET_SKELETON = typeDto37;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14, typeDto15, typeDto16, typeDto17, typeDto18, typeDto19, typeDto20, typeDto21, typeDto22, typeDto23, typeDto24, typeDto25, typeDto26, typeDto27, typeDto28, typeDto29, typeDto30, typeDto31, typeDto32, typeDto33, typeDto34, typeDto35, typeDto36, typeDto37};
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: SuperAppItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            SizeDto createFromParcel2 = SizeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SuperAppItemDto(createFromParcel, createFromParcel2, readString, readString2, valueOf, valueOf2, valueOf3, valueOf4, (SuperAppWidgetPayloadDto) parcel.readParcelable(SuperAppItemDto.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : SuperAppItemUpdateOptionsDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppItemDto[] newArray(int i) {
            return new SuperAppItemDto[i];
        }
    }

    public SuperAppItemDto(TypeDto typeDto, SizeDto sizeDto, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, SuperAppWidgetPayloadDto superAppWidgetPayloadDto, String str3, SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto, Float f) {
        this.type = typeDto;
        this.size = sizeDto;
        this.widgetId = str;
        this.uid = str2;
        this.isEnabled = bool;
        this.isUnremovable = bool2;
        this.isUpdatedByQueue = bool3;
        this.isPromo = bool4;
        this.payload = superAppWidgetPayloadDto;
        this.payloadHash = str3;
        this.updateOptions = superAppItemUpdateOptionsDto;
        this.weight = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppItemDto)) {
            return false;
        }
        SuperAppItemDto superAppItemDto = (SuperAppItemDto) obj;
        return this.type == superAppItemDto.type && this.size == superAppItemDto.size && epx.f(this.widgetId, superAppItemDto.widgetId) && epx.f(this.uid, superAppItemDto.uid) && epx.f(this.isEnabled, superAppItemDto.isEnabled) && epx.f(this.isUnremovable, superAppItemDto.isUnremovable) && epx.f(this.isUpdatedByQueue, superAppItemDto.isUpdatedByQueue) && epx.f(this.isPromo, superAppItemDto.isPromo) && epx.f(this.payload, superAppItemDto.payload) && epx.f(this.payloadHash, superAppItemDto.payloadHash) && epx.f(this.updateOptions, superAppItemDto.updateOptions) && epx.f(this.weight, superAppItemDto.weight);
    }

    public final int hashCode() {
        int hashCode = (this.size.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.widgetId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uid;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isUnremovable;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isUpdatedByQueue;
        int hashCode6 = (hashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isPromo;
        int hashCode7 = (hashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        SuperAppWidgetPayloadDto superAppWidgetPayloadDto = this.payload;
        int hashCode8 = (hashCode7 + (superAppWidgetPayloadDto == null ? 0 : superAppWidgetPayloadDto.hashCode())) * 31;
        String str3 = this.payloadHash;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto = this.updateOptions;
        int hashCode10 = (hashCode9 + (superAppItemUpdateOptionsDto == null ? 0 : superAppItemUpdateOptionsDto.hashCode())) * 31;
        Float f = this.weight;
        return hashCode10 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppItemDto(type=");
        sb.append(this.type);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", widgetId=");
        sb.append(this.widgetId);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", isUnremovable=");
        sb.append(this.isUnremovable);
        sb.append(", isUpdatedByQueue=");
        sb.append(this.isUpdatedByQueue);
        sb.append(", isPromo=");
        sb.append(this.isPromo);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", payloadHash=");
        sb.append(this.payloadHash);
        sb.append(", updateOptions=");
        sb.append(this.updateOptions);
        sb.append(", weight=");
        return so.b(sb, this.weight, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        this.size.writeToParcel(parcel, i);
        parcel.writeString(this.widgetId);
        parcel.writeString(this.uid);
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isUnremovable;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Boolean bool3 = this.isUpdatedByQueue;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isPromo;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        parcel.writeParcelable(this.payload, i);
        parcel.writeString(this.payloadHash);
        SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto = this.updateOptions;
        if (superAppItemUpdateOptionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppItemUpdateOptionsDto.writeToParcel(parcel, i);
        }
        Float f = this.weight;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
    }

    public /* synthetic */ SuperAppItemDto(TypeDto typeDto, SizeDto sizeDto, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, SuperAppWidgetPayloadDto superAppWidgetPayloadDto, String str3, SuperAppItemUpdateOptionsDto superAppItemUpdateOptionsDto, Float f, int i, zcl zclVar) {
        this(typeDto, sizeDto, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : bool4, (i & 256) != 0 ? null : superAppWidgetPayloadDto, (i & 512) != 0 ? null : str3, (i & 1024) != 0 ? null : superAppItemUpdateOptionsDto, (i & 2048) != 0 ? null : f);
    }
}
