package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsWhatInsideModalInfoGiftsDto.kt */
/* loaded from: classes14.dex */
public final class AppsWhatInsideModalInfoGiftsDto implements Parcelable {
    public static final Parcelable.Creator<AppsWhatInsideModalInfoGiftsDto> CREATOR = new a();

    @pmi0("background_image")
    private final List<BaseImageDto> backgroundImage;

    @pmi0("background_image_dark")
    private final List<BaseImageDto> backgroundImageDark;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsWhatInsideModalInfoGiftsDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("votes_coupon")
        public static final TypeDto VOTES_COUPON;

        @pmi0("wish")
        public static final TypeDto WISH;
        private final String value;

        /* compiled from: AppsWhatInsideModalInfoGiftsDto.kt */
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
            TypeDto typeDto = new TypeDto("VOTES_COUPON", 0, "votes_coupon");
            VOTES_COUPON = typeDto;
            TypeDto typeDto2 = new TypeDto("WISH", 1, "wish");
            WISH = typeDto2;
            TypeDto[] typeDtoArr = {typeDto, typeDto2};
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

    /* compiled from: AppsWhatInsideModalInfoGiftsDto.kt */
    public static final class a implements Parcelable.Creator<AppsWhatInsideModalInfoGiftsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsWhatInsideModalInfoGiftsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(AppsWhatInsideModalInfoGiftsDto.class, parcel, arrayList2, i2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = bo.b(AppsWhatInsideModalInfoGiftsDto.class, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = bo.b(AppsWhatInsideModalInfoGiftsDto.class, parcel, arrayList3, i, 1);
                }
            }
            return new AppsWhatInsideModalInfoGiftsDto(readString, createFromParcel, arrayList2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsWhatInsideModalInfoGiftsDto[] newArray(int i) {
            return new AppsWhatInsideModalInfoGiftsDto[i];
        }
    }

    public AppsWhatInsideModalInfoGiftsDto(String str, TypeDto typeDto, List<BaseImageDto> list, List<BaseImageDto> list2, List<BaseImageDto> list3) {
        this.text = str;
        this.type = typeDto;
        this.image = list;
        this.backgroundImage = list2;
        this.backgroundImageDark = list3;
    }

    public final List<BaseImageDto> d() {
        return this.image;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsWhatInsideModalInfoGiftsDto)) {
            return false;
        }
        AppsWhatInsideModalInfoGiftsDto appsWhatInsideModalInfoGiftsDto = (AppsWhatInsideModalInfoGiftsDto) obj;
        return epx.f(this.text, appsWhatInsideModalInfoGiftsDto.text) && this.type == appsWhatInsideModalInfoGiftsDto.type && epx.f(this.image, appsWhatInsideModalInfoGiftsDto.image) && epx.f(this.backgroundImage, appsWhatInsideModalInfoGiftsDto.backgroundImage) && epx.f(this.backgroundImageDark, appsWhatInsideModalInfoGiftsDto.backgroundImageDark);
    }

    public final TypeDto f() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = fw3.a((this.type.hashCode() + (this.text.hashCode() * 31)) * 31, 31, this.image);
        List<BaseImageDto> list = this.backgroundImage;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseImageDto> list2 = this.backgroundImageDark;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsWhatInsideModalInfoGiftsDto(text=");
        sb.append(this.text);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", backgroundImage=");
        sb.append(this.backgroundImage);
        sb.append(", backgroundImageDark=");
        return ms9.a(')', sb, this.backgroundImageDark);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        this.type.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<BaseImageDto> list = this.backgroundImage;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<BaseImageDto> list2 = this.backgroundImageDark;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            parcel.writeParcelable((Parcelable) f2.next(), i);
        }
    }

    public /* synthetic */ AppsWhatInsideModalInfoGiftsDto(String str, TypeDto typeDto, List list, List list2, List list3, int i, zcl zclVar) {
        this(str, typeDto, list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3);
    }
}
