package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsUserStackDto;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: AppsMiniappsCatalogItemPayloadGamesUserStackDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsCatalogItemPayloadGamesUserStackDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesUserStackDto> CREATOR = new a();

    @pmi0("payload")
    private final ExploreWidgetsUserStackDto payload;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsMiniappsCatalogItemPayloadGamesUserStackDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("games_user_stack")
        public static final TypeDto GAMES_USER_STACK;
        private final String value;

        /* compiled from: AppsMiniappsCatalogItemPayloadGamesUserStackDto.kt */
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
            TypeDto typeDto = new TypeDto("GAMES_USER_STACK", 0, "games_user_stack");
            GAMES_USER_STACK = typeDto;
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

    /* compiled from: AppsMiniappsCatalogItemPayloadGamesUserStackDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsCatalogItemPayloadGamesUserStackDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesUserStackDto createFromParcel(Parcel parcel) {
            return new AppsMiniappsCatalogItemPayloadGamesUserStackDto(TypeDto.CREATOR.createFromParcel(parcel), (ExploreWidgetsUserStackDto) parcel.readParcelable(AppsMiniappsCatalogItemPayloadGamesUserStackDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsCatalogItemPayloadGamesUserStackDto[] newArray(int i) {
            return new AppsMiniappsCatalogItemPayloadGamesUserStackDto[i];
        }
    }

    public AppsMiniappsCatalogItemPayloadGamesUserStackDto(TypeDto typeDto, ExploreWidgetsUserStackDto exploreWidgetsUserStackDto) {
        this.type = typeDto;
        this.payload = exploreWidgetsUserStackDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsCatalogItemPayloadGamesUserStackDto)) {
            return false;
        }
        AppsMiniappsCatalogItemPayloadGamesUserStackDto appsMiniappsCatalogItemPayloadGamesUserStackDto = (AppsMiniappsCatalogItemPayloadGamesUserStackDto) obj;
        return this.type == appsMiniappsCatalogItemPayloadGamesUserStackDto.type && epx.f(this.payload, appsMiniappsCatalogItemPayloadGamesUserStackDto.payload);
    }

    public final int hashCode() {
        return this.payload.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "AppsMiniappsCatalogItemPayloadGamesUserStackDto(type=" + this.type + ", payload=" + this.payload + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeParcelable(this.payload, i);
    }
}
