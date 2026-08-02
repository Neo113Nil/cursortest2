package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ClassifiedsYoulaItemActionButtonDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaItemActionButtonDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaItemActionButtonDto> CREATOR = new a();

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClassifiedsYoulaItemActionButtonDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("btn_create")
        public static final TypeDto BTN_CREATE;

        @pmi0("btn_crossposting")
        public static final TypeDto BTN_CROSSPOSTING;

        @pmi0("btn_delete")
        public static final TypeDto BTN_DELETE;

        @pmi0("btn_edit")
        public static final TypeDto BTN_EDIT;

        @pmi0("btn_main")
        public static final TypeDto BTN_MAIN;

        @pmi0("btn_promotion")
        public static final TypeDto BTN_PROMOTION;

        @pmi0("btn_republish")
        public static final TypeDto BTN_REPUBLISH;

        @pmi0("btn_stop_publish")
        public static final TypeDto BTN_STOP_PUBLISH;

        @pmi0("btn_support")
        public static final TypeDto BTN_SUPPORT;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("menu_delete")
        public static final TypeDto MENU_DELETE;

        @pmi0("menu_edit")
        public static final TypeDto MENU_EDIT;

        @pmi0("menu_share")
        public static final TypeDto MENU_SHARE;

        @pmi0("menu_support")
        public static final TypeDto MENU_SUPPORT;
        private final String value;

        /* compiled from: ClassifiedsYoulaItemActionButtonDto.kt */
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
            TypeDto typeDto = new TypeDto("MENU_EDIT", 0, "menu_edit");
            MENU_EDIT = typeDto;
            TypeDto typeDto2 = new TypeDto("MENU_SUPPORT", 1, "menu_support");
            MENU_SUPPORT = typeDto2;
            TypeDto typeDto3 = new TypeDto("MENU_DELETE", 2, "menu_delete");
            MENU_DELETE = typeDto3;
            TypeDto typeDto4 = new TypeDto("MENU_SHARE", 3, "menu_share");
            MENU_SHARE = typeDto4;
            TypeDto typeDto5 = new TypeDto("BTN_MAIN", 4, "btn_main");
            BTN_MAIN = typeDto5;
            TypeDto typeDto6 = new TypeDto("BTN_CREATE", 5, "btn_create");
            BTN_CREATE = typeDto6;
            TypeDto typeDto7 = new TypeDto("BTN_DELETE", 6, "btn_delete");
            BTN_DELETE = typeDto7;
            TypeDto typeDto8 = new TypeDto("BTN_SUPPORT", 7, "btn_support");
            BTN_SUPPORT = typeDto8;
            TypeDto typeDto9 = new TypeDto("BTN_EDIT", 8, "btn_edit");
            BTN_EDIT = typeDto9;
            TypeDto typeDto10 = new TypeDto("BTN_REPUBLISH", 9, "btn_republish");
            BTN_REPUBLISH = typeDto10;
            TypeDto typeDto11 = new TypeDto("BTN_PROMOTION", 10, "btn_promotion");
            BTN_PROMOTION = typeDto11;
            TypeDto typeDto12 = new TypeDto("BTN_CROSSPOSTING", 11, "btn_crossposting");
            BTN_CROSSPOSTING = typeDto12;
            TypeDto typeDto13 = new TypeDto("BTN_STOP_PUBLISH", 12, "btn_stop_publish");
            BTN_STOP_PUBLISH = typeDto13;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13};
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

    /* compiled from: ClassifiedsYoulaItemActionButtonDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaItemActionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemActionButtonDto createFromParcel(Parcel parcel) {
            return new ClassifiedsYoulaItemActionButtonDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemActionButtonDto[] newArray(int i) {
            return new ClassifiedsYoulaItemActionButtonDto[i];
        }
    }

    public ClassifiedsYoulaItemActionButtonDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.url = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemActionButtonDto)) {
            return false;
        }
        ClassifiedsYoulaItemActionButtonDto classifiedsYoulaItemActionButtonDto = (ClassifiedsYoulaItemActionButtonDto) obj;
        return this.type == classifiedsYoulaItemActionButtonDto.type && epx.f(this.url, classifiedsYoulaItemActionButtonDto.url);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.url;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaItemActionButtonDto(type=");
        sb.append(this.type);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeString(this.url);
    }

    public /* synthetic */ ClassifiedsYoulaItemActionButtonDto(TypeDto typeDto, String str, int i, zcl zclVar) {
        this(typeDto, (i & 2) != 0 ? null : str);
    }
}
