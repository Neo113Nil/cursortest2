package com.vk.api.generated.polls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseGradientPointDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: PollsBackgroundDto.kt */
/* loaded from: classes15.dex */
public final class PollsBackgroundDto implements Parcelable {
    public static final Parcelable.Creator<PollsBackgroundDto> CREATOR = new a();

    @pmi0("angle")
    private final Integer angle;

    @pmi0("color")
    private final String color;

    @pmi0("height")
    private final Integer height;

    @pmi0("id")
    private final Integer id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("name")
    private final String name;

    @pmi0("points")
    private final List<BaseGradientPointDto> points;

    @pmi0(TtmlNode.TAG_STYLE)
    private final StyleDto style;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("width")
    private final Integer width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PollsBackgroundDto.kt */
    public static final class StyleDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StyleDto[] $VALUES;

        @pmi0("accent")
        public static final StyleDto ACCENT;
        public static final Parcelable.Creator<StyleDto> CREATOR;

        @pmi0("dark")
        public static final StyleDto DARK;

        @pmi0("light")
        public static final StyleDto LIGHT;
        private final String value;

        /* compiled from: PollsBackgroundDto.kt */
        public static final class a implements Parcelable.Creator<StyleDto> {
            @Override // android.os.Parcelable.Creator
            public final StyleDto createFromParcel(Parcel parcel) {
                return StyleDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StyleDto[] newArray(int i) {
                return new StyleDto[i];
            }
        }

        static {
            StyleDto styleDto = new StyleDto("DARK", 0, "dark");
            DARK = styleDto;
            StyleDto styleDto2 = new StyleDto("LIGHT", 1, "light");
            LIGHT = styleDto2;
            StyleDto styleDto3 = new StyleDto("ACCENT", 2, "accent");
            ACCENT = styleDto3;
            StyleDto[] styleDtoArr = {styleDto, styleDto2, styleDto3};
            $VALUES = styleDtoArr;
            $ENTRIES = new asp(styleDtoArr);
            CREATOR = new a();
        }

        private StyleDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StyleDto valueOf(String str) {
            return (StyleDto) Enum.valueOf(StyleDto.class, str);
        }

        public static StyleDto[] values() {
            return (StyleDto[]) $VALUES.clone();
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
    /* compiled from: PollsBackgroundDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("color")
        public static final TypeDto COLOR;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("gradient")
        public static final TypeDto GRADIENT;

        @pmi0("tile")
        public static final TypeDto TILE;
        private final String value;

        /* compiled from: PollsBackgroundDto.kt */
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
            TypeDto typeDto = new TypeDto("GRADIENT", 0, "gradient");
            GRADIENT = typeDto;
            TypeDto typeDto2 = new TypeDto("TILE", 1, "tile");
            TILE = typeDto2;
            TypeDto typeDto3 = new TypeDto("COLOR", 2, "color");
            COLOR = typeDto3;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3};
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

    /* compiled from: PollsBackgroundDto.kt */
    public static final class a implements Parcelable.Creator<PollsBackgroundDto> {
        @Override // android.os.Parcelable.Creator
        public final PollsBackgroundDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(BaseImageDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(BaseGradientPointDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new PollsBackgroundDto(valueOf, readString, valueOf2, valueOf3, readString2, arrayList, arrayList2, parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PollsBackgroundDto[] newArray(int i) {
            return new PollsBackgroundDto[i];
        }
    }

    public PollsBackgroundDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final Integer d() {
        return this.angle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.color;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsBackgroundDto)) {
            return false;
        }
        PollsBackgroundDto pollsBackgroundDto = (PollsBackgroundDto) obj;
        return epx.f(this.angle, pollsBackgroundDto.angle) && epx.f(this.color, pollsBackgroundDto.color) && epx.f(this.height, pollsBackgroundDto.height) && epx.f(this.id, pollsBackgroundDto.id) && epx.f(this.name, pollsBackgroundDto.name) && epx.f(this.images, pollsBackgroundDto.images) && epx.f(this.points, pollsBackgroundDto.points) && this.type == pollsBackgroundDto.type && this.style == pollsBackgroundDto.style && epx.f(this.width, pollsBackgroundDto.width);
    }

    public final Integer f() {
        return this.height;
    }

    public final Integer g() {
        return this.id;
    }

    public final int hashCode() {
        Integer num = this.angle;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.height;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.id;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.name;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<BaseGradientPointDto> list2 = this.points;
        int hashCode7 = (hashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TypeDto typeDto = this.type;
        int hashCode8 = (hashCode7 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        StyleDto styleDto = this.style;
        int hashCode9 = (hashCode8 + (styleDto == null ? 0 : styleDto.hashCode())) * 31;
        Integer num4 = this.width;
        return hashCode9 + (num4 != null ? num4.hashCode() : 0);
    }

    public final List<BaseImageDto> i() {
        return this.images;
    }

    public final String j() {
        return this.name;
    }

    public final List<BaseGradientPointDto> k() {
        return this.points;
    }

    public final StyleDto l() {
        return this.style;
    }

    public final TypeDto n() {
        return this.type;
    }

    public final Integer o() {
        return this.width;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollsBackgroundDto(angle=");
        sb.append(this.angle);
        sb.append(", color=");
        sb.append(this.color);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", points=");
        sb.append(this.points);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", width=");
        return uqi.b(sb, this.width, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.angle;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.color);
        Integer num2 = this.height;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.id;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.name);
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BaseImageDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<BaseGradientPointDto> list2 = this.points;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((BaseGradientPointDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        StyleDto styleDto = this.style;
        if (styleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleDto.writeToParcel(parcel, i);
        }
        Integer num4 = this.width;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public PollsBackgroundDto(Integer num, String str, Integer num2, Integer num3, String str2, List<BaseImageDto> list, List<BaseGradientPointDto> list2, TypeDto typeDto, StyleDto styleDto, Integer num4) {
        this.angle = num;
        this.color = str;
        this.height = num2;
        this.id = num3;
        this.name = str2;
        this.images = list;
        this.points = list2;
        this.type = typeDto;
        this.style = styleDto;
        this.width = num4;
    }

    public /* synthetic */ PollsBackgroundDto(Integer num, String str, Integer num2, Integer num3, String str2, List list, List list2, TypeDto typeDto, StyleDto styleDto, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : typeDto, (i & 256) != 0 ? null : styleDto, (i & 512) != 0 ? null : num4);
    }
}
