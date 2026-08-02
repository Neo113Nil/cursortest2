package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.pmi0;
import xsna.up;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoRecomFeedItemDto.kt */
/* loaded from: classes15.dex */
public abstract class ShortVideoRecomFeedItemDto implements Parcelable {

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class Deserializer implements a9y<ShortVideoRecomFeedItemDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -2085324305:
                        if (f.equals("short_video_mytarget_sdk_promo")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemShortVideoMytargetSdkPromoDto.class);
                        }
                        break;
                    case -2080062117:
                        if (f.equals("short_video_mytarget_sdk_video")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemShortVideoMytargetSdkVideoDto.class);
                        }
                        break;
                    case -1946941629:
                        if (f.equals("short_video_mytarget_sdk_ad")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemShortVideoMytargetSdkAdDto.class);
                        }
                        break;
                    case -1586366286:
                        if (f.equals("short_video_full_legacy")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemVideoFullDto.class);
                        }
                        break;
                    case -1556054987:
                        if (f.equals("short_video_floating_ad")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemShortVideoFloatingAdDto.class);
                        }
                        break;
                    case -1206175987:
                        if (f.equals("short_video_static_ad")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemShortVideoStaticAdDto.class);
                        }
                        break;
                    case -490765184:
                        if (f.equals("short_video_mytarget_sdk_carousel")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemShortVideoMytargetSdkCarouselDto.class);
                        }
                        break;
                    case -136774500:
                        if (f.equals("short_video_questionnaire")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemShortVideoQuestionnaireDto.class);
                        }
                        break;
                    case -133219954:
                        if (f.equals("short_video_mytarget_sdk_static")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemShortVideoMytargetSdkStaticDto.class);
                        }
                        break;
                    case -58198401:
                        if (f.equals("short_video_market_ad")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemShortVideoMarketAdDto.class);
                        }
                        break;
                    case 1135212975:
                        if (f.equals("short_video_shops_grid")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemShopsGridDto.class);
                        }
                        break;
                    case 1477822326:
                        if (f.equals("short_video_full")) {
                            return (ShortVideoRecomFeedItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, ShortVideoFeedItemShortVideoFullDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemShopsGridDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemShopsGridDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final ShortVideoShopsGridDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_shops_grid")
            public static final TypeDto SHORT_VIDEO_SHOPS_GRID;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_SHOPS_GRID", 0, "short_video_shops_grid");
                SHORT_VIDEO_SHOPS_GRID = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemShopsGridDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShopsGridDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemShopsGridDto(ShortVideoShopsGridDto.CREATOR.createFromParcel(parcel), TypeDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShopsGridDto[] newArray(int i) {
                return new ShortVideoFeedItemShopsGridDto[i];
            }
        }

        public ShortVideoFeedItemShopsGridDto(ShortVideoShopsGridDto shortVideoShopsGridDto, TypeDto typeDto) {
            super(null);
            this.item = shortVideoShopsGridDto;
            this.type = typeDto;
        }

        public final ShortVideoShopsGridDto d() {
            return this.item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemShopsGridDto)) {
                return false;
            }
            ShortVideoFeedItemShopsGridDto shortVideoFeedItemShopsGridDto = (ShortVideoFeedItemShopsGridDto) obj;
            return epx.f(this.item, shortVideoFeedItemShopsGridDto.item) && this.type == shortVideoFeedItemShopsGridDto.type;
        }

        public final int hashCode() {
            return this.type.hashCode() + (this.item.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemShopsGridDto(item=" + this.item + ", type=" + this.type + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.item.writeToParcel(parcel, i);
            this.type.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemShortVideoFloatingAdDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemShortVideoFloatingAdDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final ShortVideoFloatingAdDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_floating_ad")
            public static final TypeDto SHORT_VIDEO_FLOATING_AD;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_FLOATING_AD", 0, "short_video_floating_ad");
                SHORT_VIDEO_FLOATING_AD = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemShortVideoFloatingAdDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoFloatingAdDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemShortVideoFloatingAdDto(TypeDto.CREATOR.createFromParcel(parcel), ShortVideoFloatingAdDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoFloatingAdDto[] newArray(int i) {
                return new ShortVideoFeedItemShortVideoFloatingAdDto[i];
            }
        }

        public ShortVideoFeedItemShortVideoFloatingAdDto(TypeDto typeDto, ShortVideoFloatingAdDto shortVideoFloatingAdDto) {
            super(null);
            this.type = typeDto;
            this.item = shortVideoFloatingAdDto;
        }

        public final ShortVideoFloatingAdDto d() {
            return this.item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemShortVideoFloatingAdDto)) {
                return false;
            }
            ShortVideoFeedItemShortVideoFloatingAdDto shortVideoFeedItemShortVideoFloatingAdDto = (ShortVideoFeedItemShortVideoFloatingAdDto) obj;
            return this.type == shortVideoFeedItemShortVideoFloatingAdDto.type && epx.f(this.item, shortVideoFeedItemShortVideoFloatingAdDto.item);
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemShortVideoFloatingAdDto(type=" + this.type + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.item.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemShortVideoFullDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemShortVideoFullDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final ShortVideoShortVideoFullDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_full")
            public static final TypeDto SHORT_VIDEO_FULL;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_FULL", 0, "short_video_full");
                SHORT_VIDEO_FULL = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemShortVideoFullDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoFullDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemShortVideoFullDto(TypeDto.CREATOR.createFromParcel(parcel), ShortVideoShortVideoFullDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoFullDto[] newArray(int i) {
                return new ShortVideoFeedItemShortVideoFullDto[i];
            }
        }

        public ShortVideoFeedItemShortVideoFullDto(TypeDto typeDto, ShortVideoShortVideoFullDto shortVideoShortVideoFullDto) {
            super(null);
            this.type = typeDto;
            this.item = shortVideoShortVideoFullDto;
        }

        public final ShortVideoShortVideoFullDto d() {
            return this.item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemShortVideoFullDto)) {
                return false;
            }
            ShortVideoFeedItemShortVideoFullDto shortVideoFeedItemShortVideoFullDto = (ShortVideoFeedItemShortVideoFullDto) obj;
            return this.type == shortVideoFeedItemShortVideoFullDto.type && epx.f(this.item, shortVideoFeedItemShortVideoFullDto.item);
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemShortVideoFullDto(type=" + this.type + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.item.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemShortVideoMarketAdDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemShortVideoMarketAdDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final ShortVideoMarketAdDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_market_ad")
            public static final TypeDto SHORT_VIDEO_MARKET_AD;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_MARKET_AD", 0, "short_video_market_ad");
                SHORT_VIDEO_MARKET_AD = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemShortVideoMarketAdDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMarketAdDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemShortVideoMarketAdDto(TypeDto.CREATOR.createFromParcel(parcel), ShortVideoMarketAdDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMarketAdDto[] newArray(int i) {
                return new ShortVideoFeedItemShortVideoMarketAdDto[i];
            }
        }

        public ShortVideoFeedItemShortVideoMarketAdDto(TypeDto typeDto, ShortVideoMarketAdDto shortVideoMarketAdDto) {
            super(null);
            this.type = typeDto;
            this.item = shortVideoMarketAdDto;
        }

        public final ShortVideoMarketAdDto d() {
            return this.item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemShortVideoMarketAdDto)) {
                return false;
            }
            ShortVideoFeedItemShortVideoMarketAdDto shortVideoFeedItemShortVideoMarketAdDto = (ShortVideoFeedItemShortVideoMarketAdDto) obj;
            return this.type == shortVideoFeedItemShortVideoMarketAdDto.type && epx.f(this.item, shortVideoFeedItemShortVideoMarketAdDto.item);
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemShortVideoMarketAdDto(type=" + this.type + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.item.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemShortVideoMytargetSdkAdDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemShortVideoMytargetSdkAdDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final ShortVideoMytargetSdkAdDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_mytarget_sdk_ad")
            public static final TypeDto SHORT_VIDEO_MYTARGET_SDK_AD;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_MYTARGET_SDK_AD", 0, "short_video_mytarget_sdk_ad");
                SHORT_VIDEO_MYTARGET_SDK_AD = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemShortVideoMytargetSdkAdDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMytargetSdkAdDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemShortVideoMytargetSdkAdDto(TypeDto.CREATOR.createFromParcel(parcel), ShortVideoMytargetSdkAdDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMytargetSdkAdDto[] newArray(int i) {
                return new ShortVideoFeedItemShortVideoMytargetSdkAdDto[i];
            }
        }

        public ShortVideoFeedItemShortVideoMytargetSdkAdDto(TypeDto typeDto, ShortVideoMytargetSdkAdDto shortVideoMytargetSdkAdDto) {
            super(null);
            this.type = typeDto;
            this.item = shortVideoMytargetSdkAdDto;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemShortVideoMytargetSdkAdDto)) {
                return false;
            }
            ShortVideoFeedItemShortVideoMytargetSdkAdDto shortVideoFeedItemShortVideoMytargetSdkAdDto = (ShortVideoFeedItemShortVideoMytargetSdkAdDto) obj;
            return this.type == shortVideoFeedItemShortVideoMytargetSdkAdDto.type && epx.f(this.item, shortVideoFeedItemShortVideoMytargetSdkAdDto.item);
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemShortVideoMytargetSdkAdDto(type=" + this.type + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.item.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemShortVideoMytargetSdkCarouselDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemShortVideoMytargetSdkCarouselDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final ShortVideoMytargetSdkCarouselDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_mytarget_sdk_carousel")
            public static final TypeDto SHORT_VIDEO_MYTARGET_SDK_CAROUSEL;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_MYTARGET_SDK_CAROUSEL", 0, "short_video_mytarget_sdk_carousel");
                SHORT_VIDEO_MYTARGET_SDK_CAROUSEL = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemShortVideoMytargetSdkCarouselDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMytargetSdkCarouselDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemShortVideoMytargetSdkCarouselDto(TypeDto.CREATOR.createFromParcel(parcel), ShortVideoMytargetSdkCarouselDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMytargetSdkCarouselDto[] newArray(int i) {
                return new ShortVideoFeedItemShortVideoMytargetSdkCarouselDto[i];
            }
        }

        public ShortVideoFeedItemShortVideoMytargetSdkCarouselDto(TypeDto typeDto, ShortVideoMytargetSdkCarouselDto shortVideoMytargetSdkCarouselDto) {
            super(null);
            this.type = typeDto;
            this.item = shortVideoMytargetSdkCarouselDto;
        }

        public final ShortVideoMytargetSdkCarouselDto d() {
            return this.item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemShortVideoMytargetSdkCarouselDto)) {
                return false;
            }
            ShortVideoFeedItemShortVideoMytargetSdkCarouselDto shortVideoFeedItemShortVideoMytargetSdkCarouselDto = (ShortVideoFeedItemShortVideoMytargetSdkCarouselDto) obj;
            return this.type == shortVideoFeedItemShortVideoMytargetSdkCarouselDto.type && epx.f(this.item, shortVideoFeedItemShortVideoMytargetSdkCarouselDto.item);
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemShortVideoMytargetSdkCarouselDto(type=" + this.type + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.item.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemShortVideoMytargetSdkPromoDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemShortVideoMytargetSdkPromoDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final ShortVideoMytargetSdkPromoDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_mytarget_sdk_promo")
            public static final TypeDto SHORT_VIDEO_MYTARGET_SDK_PROMO;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_MYTARGET_SDK_PROMO", 0, "short_video_mytarget_sdk_promo");
                SHORT_VIDEO_MYTARGET_SDK_PROMO = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemShortVideoMytargetSdkPromoDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMytargetSdkPromoDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemShortVideoMytargetSdkPromoDto(TypeDto.CREATOR.createFromParcel(parcel), ShortVideoMytargetSdkPromoDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMytargetSdkPromoDto[] newArray(int i) {
                return new ShortVideoFeedItemShortVideoMytargetSdkPromoDto[i];
            }
        }

        public ShortVideoFeedItemShortVideoMytargetSdkPromoDto(TypeDto typeDto, ShortVideoMytargetSdkPromoDto shortVideoMytargetSdkPromoDto) {
            super(null);
            this.type = typeDto;
            this.item = shortVideoMytargetSdkPromoDto;
        }

        public final ShortVideoMytargetSdkPromoDto d() {
            return this.item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemShortVideoMytargetSdkPromoDto)) {
                return false;
            }
            ShortVideoFeedItemShortVideoMytargetSdkPromoDto shortVideoFeedItemShortVideoMytargetSdkPromoDto = (ShortVideoFeedItemShortVideoMytargetSdkPromoDto) obj;
            return this.type == shortVideoFeedItemShortVideoMytargetSdkPromoDto.type && epx.f(this.item, shortVideoFeedItemShortVideoMytargetSdkPromoDto.item);
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemShortVideoMytargetSdkPromoDto(type=" + this.type + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.item.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemShortVideoMytargetSdkStaticDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemShortVideoMytargetSdkStaticDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final ShortVideoMytargetSdkStaticDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_mytarget_sdk_static")
            public static final TypeDto SHORT_VIDEO_MYTARGET_SDK_STATIC;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_MYTARGET_SDK_STATIC", 0, "short_video_mytarget_sdk_static");
                SHORT_VIDEO_MYTARGET_SDK_STATIC = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemShortVideoMytargetSdkStaticDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMytargetSdkStaticDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemShortVideoMytargetSdkStaticDto(TypeDto.CREATOR.createFromParcel(parcel), ShortVideoMytargetSdkStaticDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMytargetSdkStaticDto[] newArray(int i) {
                return new ShortVideoFeedItemShortVideoMytargetSdkStaticDto[i];
            }
        }

        public ShortVideoFeedItemShortVideoMytargetSdkStaticDto(TypeDto typeDto, ShortVideoMytargetSdkStaticDto shortVideoMytargetSdkStaticDto) {
            super(null);
            this.type = typeDto;
            this.item = shortVideoMytargetSdkStaticDto;
        }

        public final ShortVideoMytargetSdkStaticDto d() {
            return this.item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemShortVideoMytargetSdkStaticDto)) {
                return false;
            }
            ShortVideoFeedItemShortVideoMytargetSdkStaticDto shortVideoFeedItemShortVideoMytargetSdkStaticDto = (ShortVideoFeedItemShortVideoMytargetSdkStaticDto) obj;
            return this.type == shortVideoFeedItemShortVideoMytargetSdkStaticDto.type && epx.f(this.item, shortVideoFeedItemShortVideoMytargetSdkStaticDto.item);
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemShortVideoMytargetSdkStaticDto(type=" + this.type + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.item.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemShortVideoMytargetSdkVideoDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemShortVideoMytargetSdkVideoDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final ShortVideoMytargetSdkVideoDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_mytarget_sdk_video")
            public static final TypeDto SHORT_VIDEO_MYTARGET_SDK_VIDEO;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_MYTARGET_SDK_VIDEO", 0, "short_video_mytarget_sdk_video");
                SHORT_VIDEO_MYTARGET_SDK_VIDEO = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemShortVideoMytargetSdkVideoDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMytargetSdkVideoDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemShortVideoMytargetSdkVideoDto(TypeDto.CREATOR.createFromParcel(parcel), ShortVideoMytargetSdkVideoDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoMytargetSdkVideoDto[] newArray(int i) {
                return new ShortVideoFeedItemShortVideoMytargetSdkVideoDto[i];
            }
        }

        public ShortVideoFeedItemShortVideoMytargetSdkVideoDto(TypeDto typeDto, ShortVideoMytargetSdkVideoDto shortVideoMytargetSdkVideoDto) {
            super(null);
            this.type = typeDto;
            this.item = shortVideoMytargetSdkVideoDto;
        }

        public final ShortVideoMytargetSdkVideoDto d() {
            return this.item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemShortVideoMytargetSdkVideoDto)) {
                return false;
            }
            ShortVideoFeedItemShortVideoMytargetSdkVideoDto shortVideoFeedItemShortVideoMytargetSdkVideoDto = (ShortVideoFeedItemShortVideoMytargetSdkVideoDto) obj;
            return this.type == shortVideoFeedItemShortVideoMytargetSdkVideoDto.type && epx.f(this.item, shortVideoFeedItemShortVideoMytargetSdkVideoDto.item);
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemShortVideoMytargetSdkVideoDto(type=" + this.type + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.item.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemShortVideoQuestionnaireDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemShortVideoQuestionnaireDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final ShortVideoFeedQuestionnaireDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_questionnaire")
            public static final TypeDto SHORT_VIDEO_QUESTIONNAIRE;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_QUESTIONNAIRE", 0, "short_video_questionnaire");
                SHORT_VIDEO_QUESTIONNAIRE = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemShortVideoQuestionnaireDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoQuestionnaireDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemShortVideoQuestionnaireDto(TypeDto.CREATOR.createFromParcel(parcel), ShortVideoFeedQuestionnaireDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoQuestionnaireDto[] newArray(int i) {
                return new ShortVideoFeedItemShortVideoQuestionnaireDto[i];
            }
        }

        public ShortVideoFeedItemShortVideoQuestionnaireDto(TypeDto typeDto, ShortVideoFeedQuestionnaireDto shortVideoFeedQuestionnaireDto) {
            super(null);
            this.type = typeDto;
            this.item = shortVideoFeedQuestionnaireDto;
        }

        public final ShortVideoFeedQuestionnaireDto d() {
            return this.item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemShortVideoQuestionnaireDto)) {
                return false;
            }
            ShortVideoFeedItemShortVideoQuestionnaireDto shortVideoFeedItemShortVideoQuestionnaireDto = (ShortVideoFeedItemShortVideoQuestionnaireDto) obj;
            return this.type == shortVideoFeedItemShortVideoQuestionnaireDto.type && epx.f(this.item, shortVideoFeedItemShortVideoQuestionnaireDto.item);
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemShortVideoQuestionnaireDto(type=" + this.type + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.item.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemShortVideoStaticAdDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemShortVideoStaticAdDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final ShortVideoStaticAdDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_static_ad")
            public static final TypeDto SHORT_VIDEO_STATIC_AD;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_STATIC_AD", 0, "short_video_static_ad");
                SHORT_VIDEO_STATIC_AD = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemShortVideoStaticAdDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoStaticAdDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemShortVideoStaticAdDto(TypeDto.CREATOR.createFromParcel(parcel), ShortVideoStaticAdDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemShortVideoStaticAdDto[] newArray(int i) {
                return new ShortVideoFeedItemShortVideoStaticAdDto[i];
            }
        }

        public ShortVideoFeedItemShortVideoStaticAdDto(TypeDto typeDto, ShortVideoStaticAdDto shortVideoStaticAdDto) {
            super(null);
            this.type = typeDto;
            this.item = shortVideoStaticAdDto;
        }

        public final ShortVideoStaticAdDto d() {
            return this.item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemShortVideoStaticAdDto)) {
                return false;
            }
            ShortVideoFeedItemShortVideoStaticAdDto shortVideoFeedItemShortVideoStaticAdDto = (ShortVideoFeedItemShortVideoStaticAdDto) obj;
            return this.type == shortVideoFeedItemShortVideoStaticAdDto.type && epx.f(this.item, shortVideoFeedItemShortVideoStaticAdDto.item);
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemShortVideoStaticAdDto(type=" + this.type + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.item.writeToParcel(parcel, i);
        }
    }

    /* compiled from: ShortVideoRecomFeedItemDto.kt */
    public static final class ShortVideoFeedItemVideoFullDto extends ShortVideoRecomFeedItemDto implements Parcelable {
        public static final Parcelable.Creator<ShortVideoFeedItemVideoFullDto> CREATOR = new a();

        @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
        private final VideoVideoFullDto item;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("short_video_full_legacy")
            public static final TypeDto SHORT_VIDEO_FULL_LEGACY;
            private final String value;

            /* compiled from: ShortVideoRecomFeedItemDto.kt */
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
                TypeDto typeDto = new TypeDto("SHORT_VIDEO_FULL_LEGACY", 0, "short_video_full_legacy");
                SHORT_VIDEO_FULL_LEGACY = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
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

        /* compiled from: ShortVideoRecomFeedItemDto.kt */
        public static final class a implements Parcelable.Creator<ShortVideoFeedItemVideoFullDto> {
            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemVideoFullDto createFromParcel(Parcel parcel) {
                return new ShortVideoFeedItemVideoFullDto(TypeDto.CREATOR.createFromParcel(parcel), (VideoVideoFullDto) parcel.readParcelable(ShortVideoFeedItemVideoFullDto.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ShortVideoFeedItemVideoFullDto[] newArray(int i) {
                return new ShortVideoFeedItemVideoFullDto[i];
            }
        }

        public ShortVideoFeedItemVideoFullDto(TypeDto typeDto, VideoVideoFullDto videoVideoFullDto) {
            super(null);
            this.type = typeDto;
            this.item = videoVideoFullDto;
        }

        public final VideoVideoFullDto d() {
            return this.item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShortVideoFeedItemVideoFullDto)) {
                return false;
            }
            ShortVideoFeedItemVideoFullDto shortVideoFeedItemVideoFullDto = (ShortVideoFeedItemVideoFullDto) obj;
            return this.type == shortVideoFeedItemVideoFullDto.type && epx.f(this.item, shortVideoFeedItemVideoFullDto.item);
        }

        public final int hashCode() {
            return this.item.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "ShortVideoFeedItemVideoFullDto(type=" + this.type + ", item=" + this.item + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.item, i);
        }
    }

    public /* synthetic */ ShortVideoRecomFeedItemDto(zcl zclVar) {
        this();
    }

    private ShortVideoRecomFeedItemDto() {
    }
}
