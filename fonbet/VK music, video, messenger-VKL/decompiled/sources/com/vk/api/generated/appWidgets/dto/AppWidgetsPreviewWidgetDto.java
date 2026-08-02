package com.vk.api.generated.appWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppWidgetsPreviewWidgetDto.kt */
/* loaded from: classes14.dex */
public final class AppWidgetsPreviewWidgetDto implements Parcelable {
    public static final Parcelable.Creator<AppWidgetsPreviewWidgetDto> CREATOR = new a();

    @pmi0("data")
    private final AppWidgetsSomeWidgetDto data;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppWidgetsPreviewWidgetDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0(CampaignEx.CLICKMODE_ON)
        public static final TypeDto COMPACT_LIST;

        @pmi0("6")
        public static final TypeDto COVER_LIST;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("9")
        public static final TypeDto DONATION;

        @pmi0("2")
        public static final TypeDto LIST;

        @pmi0(Gc.e)
        public static final TypeDto MATCH;

        @pmi0("8")
        public static final TypeDto MATCHES;

        @pmi0("3")
        public static final TypeDto TABLE;

        @pmi0("1")
        public static final TypeDto TEXT;

        @pmi0("4")
        public static final TypeDto TILES;
        private final int value;

        /* compiled from: AppWidgetsPreviewWidgetDto.kt */
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
            TypeDto typeDto = new TypeDto("TEXT", 0, 1);
            TEXT = typeDto;
            TypeDto typeDto2 = new TypeDto("LIST", 1, 2);
            LIST = typeDto2;
            TypeDto typeDto3 = new TypeDto("TABLE", 2, 3);
            TABLE = typeDto3;
            TypeDto typeDto4 = new TypeDto("TILES", 3, 4);
            TILES = typeDto4;
            TypeDto typeDto5 = new TypeDto("COMPACT_LIST", 4, 5);
            COMPACT_LIST = typeDto5;
            TypeDto typeDto6 = new TypeDto("COVER_LIST", 5, 6);
            COVER_LIST = typeDto6;
            TypeDto typeDto7 = new TypeDto("MATCH", 6, 7);
            MATCH = typeDto7;
            TypeDto typeDto8 = new TypeDto("MATCHES", 7, 8);
            MATCHES = typeDto8;
            TypeDto typeDto9 = new TypeDto("DONATION", 8, 9);
            DONATION = typeDto9;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, int i2) {
            this.value = i2;
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

    /* compiled from: AppWidgetsPreviewWidgetDto.kt */
    public static final class a implements Parcelable.Creator<AppWidgetsPreviewWidgetDto> {
        @Override // android.os.Parcelable.Creator
        public final AppWidgetsPreviewWidgetDto createFromParcel(Parcel parcel) {
            return new AppWidgetsPreviewWidgetDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AppWidgetsSomeWidgetDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppWidgetsPreviewWidgetDto[] newArray(int i) {
            return new AppWidgetsPreviewWidgetDto[i];
        }
    }

    public AppWidgetsPreviewWidgetDto(TypeDto typeDto, AppWidgetsSomeWidgetDto appWidgetsSomeWidgetDto) {
        this.type = typeDto;
        this.data = appWidgetsSomeWidgetDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppWidgetsPreviewWidgetDto)) {
            return false;
        }
        AppWidgetsPreviewWidgetDto appWidgetsPreviewWidgetDto = (AppWidgetsPreviewWidgetDto) obj;
        return this.type == appWidgetsPreviewWidgetDto.type && epx.f(this.data, appWidgetsPreviewWidgetDto.data);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        AppWidgetsSomeWidgetDto appWidgetsSomeWidgetDto = this.data;
        return hashCode + (appWidgetsSomeWidgetDto == null ? 0 : appWidgetsSomeWidgetDto.hashCode());
    }

    public final String toString() {
        return "AppWidgetsPreviewWidgetDto(type=" + this.type + ", data=" + this.data + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        AppWidgetsSomeWidgetDto appWidgetsSomeWidgetDto = this.data;
        if (appWidgetsSomeWidgetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appWidgetsSomeWidgetDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppWidgetsPreviewWidgetDto(TypeDto typeDto, AppWidgetsSomeWidgetDto appWidgetsSomeWidgetDto, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : appWidgetsSomeWidgetDto);
    }
}
