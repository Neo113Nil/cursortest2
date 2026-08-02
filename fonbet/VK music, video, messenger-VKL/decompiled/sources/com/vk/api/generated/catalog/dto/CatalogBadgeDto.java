package com.vk.api.generated.catalog.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CatalogBadgeDto.kt */
/* loaded from: classes14.dex */
public final class CatalogBadgeDto implements Parcelable {
    public static final Parcelable.Creator<CatalogBadgeDto> CREATOR = new a();

    @pmi0("listen_events")
    private final List<String> listenEvents;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogBadgeDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("arrow_secondary")
        public static final TypeDto ARROW_SECONDARY;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("primary")
        public static final TypeDto PRIMARY;

        @pmi0("prominent")
        public static final TypeDto PROMINENT;

        @pmi0(X3.i.Y)
        public static final TypeDto SECONDARY;

        @pmi0(X3.i.T)
        public static final TypeDto TRANSPARENT;
        private final String value;

        /* compiled from: CatalogBadgeDto.kt */
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
            TypeDto typeDto = new TypeDto("PRIMARY", 0, "primary");
            PRIMARY = typeDto;
            TypeDto typeDto2 = new TypeDto("SECONDARY", 1, X3.i.Y);
            SECONDARY = typeDto2;
            TypeDto typeDto3 = new TypeDto("PROMINENT", 2, "prominent");
            PROMINENT = typeDto3;
            TypeDto typeDto4 = new TypeDto("TRANSPARENT", 3, X3.i.T);
            TRANSPARENT = typeDto4;
            TypeDto typeDto5 = new TypeDto("ARROW_SECONDARY", 4, "arrow_secondary");
            ARROW_SECONDARY = typeDto5;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5};
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

    /* compiled from: CatalogBadgeDto.kt */
    public static final class a implements Parcelable.Creator<CatalogBadgeDto> {
        @Override // android.os.Parcelable.Creator
        public final CatalogBadgeDto createFromParcel(Parcel parcel) {
            return new CatalogBadgeDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final CatalogBadgeDto[] newArray(int i) {
            return new CatalogBadgeDto[i];
        }
    }

    public CatalogBadgeDto(TypeDto typeDto, String str, List<String> list) {
        this.type = typeDto;
        this.text = str;
        this.listenEvents = list;
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final TypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBadgeDto)) {
            return false;
        }
        CatalogBadgeDto catalogBadgeDto = (CatalogBadgeDto) obj;
        return this.type == catalogBadgeDto.type && epx.f(this.text, catalogBadgeDto.text) && epx.f(this.listenEvents, catalogBadgeDto.listenEvents);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.listenEvents;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBadgeDto(type=");
        sb.append(this.type);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", listenEvents=");
        return ms9.a(')', sb, this.listenEvents);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        parcel.writeStringList(this.listenEvents);
    }

    public /* synthetic */ CatalogBadgeDto(TypeDto typeDto, String str, List list, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list);
    }
}
