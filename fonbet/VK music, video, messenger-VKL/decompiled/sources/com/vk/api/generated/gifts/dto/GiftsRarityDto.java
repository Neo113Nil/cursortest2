package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: GiftsRarityDto.kt */
/* loaded from: classes14.dex */
public final class GiftsRarityDto implements Parcelable {
    public static final Parcelable.Creator<GiftsRarityDto> CREATOR = new a();

    @pmi0("badge_color")
    private final String badgeColor;

    @pmi0("left_count")
    private final Integer leftCount;

    @pmi0("main_loop_animation")
    private final GiftsAnimationDto mainLoopAnimation;

    @pmi0("main_start_animation")
    private final GiftsAnimationDto mainStartAnimation;

    @pmi0("modal_backgrounds")
    private final List<GiftsBackgroundDto> modalBackgrounds;

    @pmi0("release_year")
    private final Integer releaseYear;

    @pmi0("secondary_animation")
    private final GiftsAnimationDto secondaryAnimation;

    @pmi0("serial_number")
    private final Integer serialNumber;

    @pmi0("title")
    private final String title;

    @pmi0("total_count")
    private final Integer totalCount;

    @pmi0("type")
    private final TypeDto type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GiftsRarityDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("fallback")
        public static final TypeDto FALLBACK;

        @pmi0("legendary")
        public static final TypeDto LEGENDARY;

        @pmi0("rare")
        public static final TypeDto RARE;

        @pmi0("uncommon")
        public static final TypeDto UNCOMMON;
        private final String value;

        /* compiled from: GiftsRarityDto.kt */
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
            TypeDto typeDto = new TypeDto("UNCOMMON", 0, "uncommon");
            UNCOMMON = typeDto;
            TypeDto typeDto2 = new TypeDto("RARE", 1, "rare");
            RARE = typeDto2;
            TypeDto typeDto3 = new TypeDto("LEGENDARY", 2, "legendary");
            LEGENDARY = typeDto3;
            TypeDto typeDto4 = new TypeDto("FALLBACK", 3, "fallback");
            FALLBACK = typeDto4;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4};
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

    /* compiled from: GiftsRarityDto.kt */
    public static final class a implements Parcelable.Creator<GiftsRarityDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsRarityDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(GiftsBackgroundDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new GiftsRarityDto(readString, createFromParcel, valueOf, valueOf2, valueOf3, valueOf4, arrayList, parcel.readInt() == 0 ? null : GiftsAnimationDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GiftsAnimationDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GiftsAnimationDto.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsRarityDto[] newArray(int i) {
            return new GiftsRarityDto[i];
        }
    }

    public GiftsRarityDto(String str, TypeDto typeDto, Integer num, Integer num2, Integer num3, Integer num4, List<GiftsBackgroundDto> list, GiftsAnimationDto giftsAnimationDto, GiftsAnimationDto giftsAnimationDto2, GiftsAnimationDto giftsAnimationDto3, String str2) {
        this.title = str;
        this.type = typeDto;
        this.totalCount = num;
        this.leftCount = num2;
        this.serialNumber = num3;
        this.releaseYear = num4;
        this.modalBackgrounds = list;
        this.mainStartAnimation = giftsAnimationDto;
        this.mainLoopAnimation = giftsAnimationDto2;
        this.secondaryAnimation = giftsAnimationDto3;
        this.badgeColor = str2;
    }

    public final String d() {
        return this.badgeColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.leftCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsRarityDto)) {
            return false;
        }
        GiftsRarityDto giftsRarityDto = (GiftsRarityDto) obj;
        return epx.f(this.title, giftsRarityDto.title) && this.type == giftsRarityDto.type && epx.f(this.totalCount, giftsRarityDto.totalCount) && epx.f(this.leftCount, giftsRarityDto.leftCount) && epx.f(this.serialNumber, giftsRarityDto.serialNumber) && epx.f(this.releaseYear, giftsRarityDto.releaseYear) && epx.f(this.modalBackgrounds, giftsRarityDto.modalBackgrounds) && epx.f(this.mainStartAnimation, giftsRarityDto.mainStartAnimation) && epx.f(this.mainLoopAnimation, giftsRarityDto.mainLoopAnimation) && epx.f(this.secondaryAnimation, giftsRarityDto.secondaryAnimation) && epx.f(this.badgeColor, giftsRarityDto.badgeColor);
    }

    public final List<GiftsBackgroundDto> f() {
        return this.modalBackgrounds;
    }

    public final Integer g() {
        return this.releaseYear;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (this.title.hashCode() * 31)) * 31;
        Integer num = this.totalCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.leftCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.serialNumber;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.releaseYear;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<GiftsBackgroundDto> list = this.modalBackgrounds;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        GiftsAnimationDto giftsAnimationDto = this.mainStartAnimation;
        int hashCode7 = (hashCode6 + (giftsAnimationDto == null ? 0 : giftsAnimationDto.hashCode())) * 31;
        GiftsAnimationDto giftsAnimationDto2 = this.mainLoopAnimation;
        int hashCode8 = (hashCode7 + (giftsAnimationDto2 == null ? 0 : giftsAnimationDto2.hashCode())) * 31;
        GiftsAnimationDto giftsAnimationDto3 = this.secondaryAnimation;
        int hashCode9 = (hashCode8 + (giftsAnimationDto3 == null ? 0 : giftsAnimationDto3.hashCode())) * 31;
        String str = this.badgeColor;
        return hashCode9 + (str != null ? str.hashCode() : 0);
    }

    public final GiftsAnimationDto i() {
        return this.secondaryAnimation;
    }

    public final Integer j() {
        return this.serialNumber;
    }

    public final Integer k() {
        return this.totalCount;
    }

    public final TypeDto l() {
        return this.type;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsRarityDto(title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", totalCount=");
        sb.append(this.totalCount);
        sb.append(", leftCount=");
        sb.append(this.leftCount);
        sb.append(", serialNumber=");
        sb.append(this.serialNumber);
        sb.append(", releaseYear=");
        sb.append(this.releaseYear);
        sb.append(", modalBackgrounds=");
        sb.append(this.modalBackgrounds);
        sb.append(", mainStartAnimation=");
        sb.append(this.mainStartAnimation);
        sb.append(", mainLoopAnimation=");
        sb.append(this.mainLoopAnimation);
        sb.append(", secondaryAnimation=");
        sb.append(this.secondaryAnimation);
        sb.append(", badgeColor=");
        return ho8.a(sb, this.badgeColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        this.type.writeToParcel(parcel, i);
        Integer num = this.totalCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.leftCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.serialNumber;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.releaseYear;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        List<GiftsBackgroundDto> list = this.modalBackgrounds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((GiftsBackgroundDto) f.next()).writeToParcel(parcel, i);
            }
        }
        GiftsAnimationDto giftsAnimationDto = this.mainStartAnimation;
        if (giftsAnimationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsAnimationDto.writeToParcel(parcel, i);
        }
        GiftsAnimationDto giftsAnimationDto2 = this.mainLoopAnimation;
        if (giftsAnimationDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsAnimationDto2.writeToParcel(parcel, i);
        }
        GiftsAnimationDto giftsAnimationDto3 = this.secondaryAnimation;
        if (giftsAnimationDto3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsAnimationDto3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.badgeColor);
    }

    public /* synthetic */ GiftsRarityDto(String str, TypeDto typeDto, Integer num, Integer num2, Integer num3, Integer num4, List list, GiftsAnimationDto giftsAnimationDto, GiftsAnimationDto giftsAnimationDto2, GiftsAnimationDto giftsAnimationDto3, String str2, int i, zcl zclVar) {
        this(str, typeDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : num4, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : giftsAnimationDto, (i & 256) != 0 ? null : giftsAnimationDto2, (i & 512) != 0 ? null : giftsAnimationDto3, (i & 1024) != 0 ? null : str2);
    }
}
