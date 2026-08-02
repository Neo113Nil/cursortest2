package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.reactivex.rxjava3.subjects.b;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.go9;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.so;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StickersStickerPopupLayerDto.kt */
/* loaded from: classes.dex */
public abstract class StickersStickerPopupLayerDto implements Parcelable {

    /* compiled from: StickersStickerPopupLayerDto.kt */
    public static final class Deserializer implements a9y<StickersStickerPopupLayerDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                int hashCode = f.hashCode();
                if (hashCode != -1924353287) {
                    if (hashCode != -269673642) {
                        if (hashCode == 89650992 && f.equals("gradient")) {
                            return (StickersStickerPopupLayerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, StickersStickerPopupGradientDto.class);
                        }
                    } else if (f.equals("animation_fullscreen")) {
                        return (StickersStickerPopupLayerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, StickersStickerPopupFullscreenAnimationDto.class);
                    }
                } else if (f.equals("animation_fixed")) {
                    return (StickersStickerPopupLayerDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, StickersStickerPopupFixedAnimationDto.class);
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: StickersStickerPopupLayerDto.kt */
    /* loaded from: classes15.dex */
    public static final class StickersStickerPopupFixedAnimationDto extends StickersStickerPopupLayerDto implements Parcelable {
        public static final Parcelable.Creator<StickersStickerPopupFixedAnimationDto> CREATOR = new a();

        @pmi0("height")
        private final int height;

        @pmi0("loops_limit")
        private final Integer loopsLimit;

        @pmi0("position_x")
        private final PositionXDto positionX;

        @pmi0("position_y")
        private final PositionYDto positionY;

        @pmi0("scale_ratio")
        private final Float scaleRatio;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        @pmi0("width")
        private final int width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class PositionXDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PositionXDto[] $VALUES;

            @pmi0(TtmlNode.CENTER)
            public static final PositionXDto CENTER;
            public static final Parcelable.Creator<PositionXDto> CREATOR;

            @pmi0(TtmlNode.LEFT)
            public static final PositionXDto LEFT;

            @pmi0(TtmlNode.RIGHT)
            public static final PositionXDto RIGHT;

            @pmi0("screen center")
            public static final PositionXDto SCREEN_CENTER;

            @pmi0("screen left")
            public static final PositionXDto SCREEN_LEFT;

            @pmi0("screen right")
            public static final PositionXDto SCREEN_RIGHT;
            private final String value;

            /* compiled from: StickersStickerPopupLayerDto.kt */
            public static final class a implements Parcelable.Creator<PositionXDto> {
                @Override // android.os.Parcelable.Creator
                public final PositionXDto createFromParcel(Parcel parcel) {
                    return PositionXDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final PositionXDto[] newArray(int i) {
                    return new PositionXDto[i];
                }
            }

            static {
                PositionXDto positionXDto = new PositionXDto("LEFT", 0, TtmlNode.LEFT);
                LEFT = positionXDto;
                PositionXDto positionXDto2 = new PositionXDto("SCREEN_LEFT", 1, "screen left");
                SCREEN_LEFT = positionXDto2;
                PositionXDto positionXDto3 = new PositionXDto("CENTER", 2, TtmlNode.CENTER);
                CENTER = positionXDto3;
                PositionXDto positionXDto4 = new PositionXDto("SCREEN_CENTER", 3, "screen center");
                SCREEN_CENTER = positionXDto4;
                PositionXDto positionXDto5 = new PositionXDto("RIGHT", 4, TtmlNode.RIGHT);
                RIGHT = positionXDto5;
                PositionXDto positionXDto6 = new PositionXDto("SCREEN_RIGHT", 5, "screen right");
                SCREEN_RIGHT = positionXDto6;
                PositionXDto[] positionXDtoArr = {positionXDto, positionXDto2, positionXDto3, positionXDto4, positionXDto5, positionXDto6};
                $VALUES = positionXDtoArr;
                $ENTRIES = new asp(positionXDtoArr);
                CREATOR = new a();
            }

            private PositionXDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static PositionXDto valueOf(String str) {
                return (PositionXDto) Enum.valueOf(PositionXDto.class, str);
            }

            public static PositionXDto[] values() {
                return (PositionXDto[]) $VALUES.clone();
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
        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class PositionYDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PositionYDto[] $VALUES;

            @pmi0("bottom")
            public static final PositionYDto BOTTOM;
            public static final Parcelable.Creator<PositionYDto> CREATOR;

            @pmi0("middle")
            public static final PositionYDto MIDDLE;

            @pmi0("screen bottom")
            public static final PositionYDto SCREEN_BOTTOM;

            @pmi0("screen middle")
            public static final PositionYDto SCREEN_MIDDLE;

            @pmi0("screen top")
            public static final PositionYDto SCREEN_TOP;

            @pmi0("top")
            public static final PositionYDto TOP;
            private final String value;

            /* compiled from: StickersStickerPopupLayerDto.kt */
            public static final class a implements Parcelable.Creator<PositionYDto> {
                @Override // android.os.Parcelable.Creator
                public final PositionYDto createFromParcel(Parcel parcel) {
                    return PositionYDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final PositionYDto[] newArray(int i) {
                    return new PositionYDto[i];
                }
            }

            static {
                PositionYDto positionYDto = new PositionYDto("TOP", 0, "top");
                TOP = positionYDto;
                PositionYDto positionYDto2 = new PositionYDto("SCREEN_TOP", 1, "screen top");
                SCREEN_TOP = positionYDto2;
                PositionYDto positionYDto3 = new PositionYDto("MIDDLE", 2, "middle");
                MIDDLE = positionYDto3;
                PositionYDto positionYDto4 = new PositionYDto("SCREEN_MIDDLE", 3, "screen middle");
                SCREEN_MIDDLE = positionYDto4;
                PositionYDto positionYDto5 = new PositionYDto("BOTTOM", 4, "bottom");
                BOTTOM = positionYDto5;
                PositionYDto positionYDto6 = new PositionYDto("SCREEN_BOTTOM", 5, "screen bottom");
                SCREEN_BOTTOM = positionYDto6;
                PositionYDto[] positionYDtoArr = {positionYDto, positionYDto2, positionYDto3, positionYDto4, positionYDto5, positionYDto6};
                $VALUES = positionYDtoArr;
                $ENTRIES = new asp(positionYDtoArr);
                CREATOR = new a();
            }

            private PositionYDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static PositionYDto valueOf(String str) {
                return (PositionYDto) Enum.valueOf(PositionYDto.class, str);
            }

            public static PositionYDto[] values() {
                return (PositionYDto[]) $VALUES.clone();
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
        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("animation_fixed")
            public static final TypeDto ANIMATION_FIXED;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: StickersStickerPopupLayerDto.kt */
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
                TypeDto typeDto = new TypeDto("ANIMATION_FIXED", 0, "animation_fixed");
                ANIMATION_FIXED = typeDto;
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

        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class a implements Parcelable.Creator<StickersStickerPopupFixedAnimationDto> {
            @Override // android.os.Parcelable.Creator
            public final StickersStickerPopupFixedAnimationDto createFromParcel(Parcel parcel) {
                return new StickersStickerPopupFixedAnimationDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : PositionXDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PositionYDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final StickersStickerPopupFixedAnimationDto[] newArray(int i) {
                return new StickersStickerPopupFixedAnimationDto[i];
            }
        }

        public /* synthetic */ StickersStickerPopupFixedAnimationDto(TypeDto typeDto, int i, int i2, String str, Integer num, PositionXDto positionXDto, PositionYDto positionYDto, Float f, int i3, zcl zclVar) {
            this(typeDto, i, i2, str, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : positionXDto, (i3 & 64) != 0 ? null : positionYDto, (i3 & 128) != 0 ? null : f);
        }

        public final Integer d() {
            return this.loopsLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final PositionXDto e() {
            return this.positionX;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StickersStickerPopupFixedAnimationDto)) {
                return false;
            }
            StickersStickerPopupFixedAnimationDto stickersStickerPopupFixedAnimationDto = (StickersStickerPopupFixedAnimationDto) obj;
            return this.type == stickersStickerPopupFixedAnimationDto.type && this.width == stickersStickerPopupFixedAnimationDto.width && this.height == stickersStickerPopupFixedAnimationDto.height && epx.f(this.url, stickersStickerPopupFixedAnimationDto.url) && epx.f(this.loopsLimit, stickersStickerPopupFixedAnimationDto.loopsLimit) && this.positionX == stickersStickerPopupFixedAnimationDto.positionX && this.positionY == stickersStickerPopupFixedAnimationDto.positionY && epx.f(this.scaleRatio, stickersStickerPopupFixedAnimationDto.scaleRatio);
        }

        public final PositionYDto f() {
            return this.positionY;
        }

        public final Float g() {
            return this.scaleRatio;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.height, shy.a(this.width, this.type.hashCode() * 31, 31), 31), 31, this.url);
            Integer num = this.loopsLimit;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            PositionXDto positionXDto = this.positionX;
            int hashCode2 = (hashCode + (positionXDto == null ? 0 : positionXDto.hashCode())) * 31;
            PositionYDto positionYDto = this.positionY;
            int hashCode3 = (hashCode2 + (positionYDto == null ? 0 : positionYDto.hashCode())) * 31;
            Float f = this.scaleRatio;
            return hashCode3 + (f != null ? f.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StickersStickerPopupFixedAnimationDto(type=");
            sb.append(this.type);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", url=");
            sb.append(this.url);
            sb.append(", loopsLimit=");
            sb.append(this.loopsLimit);
            sb.append(", positionX=");
            sb.append(this.positionX);
            sb.append(", positionY=");
            sb.append(this.positionY);
            sb.append(", scaleRatio=");
            return so.b(sb, this.scaleRatio, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeString(this.url);
            Integer num = this.loopsLimit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            PositionXDto positionXDto = this.positionX;
            if (positionXDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                positionXDto.writeToParcel(parcel, i);
            }
            PositionYDto positionYDto = this.positionY;
            if (positionYDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                positionYDto.writeToParcel(parcel, i);
            }
            Float f = this.scaleRatio;
            if (f == null) {
                parcel.writeInt(0);
            } else {
                b.d(parcel, 1, f);
            }
        }

        public StickersStickerPopupFixedAnimationDto(TypeDto typeDto, int i, int i2, String str, Integer num, PositionXDto positionXDto, PositionYDto positionYDto, Float f) {
            super(null);
            this.type = typeDto;
            this.width = i;
            this.height = i2;
            this.url = str;
            this.loopsLimit = num;
            this.positionX = positionXDto;
            this.positionY = positionYDto;
            this.scaleRatio = f;
        }
    }

    /* compiled from: StickersStickerPopupLayerDto.kt */
    /* loaded from: classes15.dex */
    public static final class StickersStickerPopupFullscreenAnimationDto extends StickersStickerPopupLayerDto implements Parcelable {
        public static final Parcelable.Creator<StickersStickerPopupFullscreenAnimationDto> CREATOR = new a();

        @pmi0("fit")
        private final FitDto fit;

        @pmi0("height")
        private final int height;

        @pmi0("loops_limit")
        private final Integer loopsLimit;

        @pmi0("position_x")
        private final PositionXDto positionX;

        @pmi0("position_y")
        private final PositionYDto positionY;

        @pmi0("repeat")
        private final RepeatDto repeat;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("url")
        private final String url;

        @pmi0("width")
        private final int width;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class FitDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ FitDto[] $VALUES;

            @pmi0("contain")
            public static final FitDto CONTAIN;

            @pmi0("cover")
            public static final FitDto COVER;
            public static final Parcelable.Creator<FitDto> CREATOR;
            private final String value;

            /* compiled from: StickersStickerPopupLayerDto.kt */
            public static final class a implements Parcelable.Creator<FitDto> {
                @Override // android.os.Parcelable.Creator
                public final FitDto createFromParcel(Parcel parcel) {
                    return FitDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final FitDto[] newArray(int i) {
                    return new FitDto[i];
                }
            }

            static {
                FitDto fitDto = new FitDto("COVER", 0, "cover");
                COVER = fitDto;
                FitDto fitDto2 = new FitDto("CONTAIN", 1, "contain");
                CONTAIN = fitDto2;
                FitDto[] fitDtoArr = {fitDto, fitDto2};
                $VALUES = fitDtoArr;
                $ENTRIES = new asp(fitDtoArr);
                CREATOR = new a();
            }

            private FitDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static FitDto valueOf(String str) {
                return (FitDto) Enum.valueOf(FitDto.class, str);
            }

            public static FitDto[] values() {
                return (FitDto[]) $VALUES.clone();
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
        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class PositionXDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PositionXDto[] $VALUES;

            @pmi0(TtmlNode.CENTER)
            public static final PositionXDto CENTER;
            public static final Parcelable.Creator<PositionXDto> CREATOR;

            @pmi0(TtmlNode.LEFT)
            public static final PositionXDto LEFT;

            @pmi0(TtmlNode.RIGHT)
            public static final PositionXDto RIGHT;
            private final String value;

            /* compiled from: StickersStickerPopupLayerDto.kt */
            public static final class a implements Parcelable.Creator<PositionXDto> {
                @Override // android.os.Parcelable.Creator
                public final PositionXDto createFromParcel(Parcel parcel) {
                    return PositionXDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final PositionXDto[] newArray(int i) {
                    return new PositionXDto[i];
                }
            }

            static {
                PositionXDto positionXDto = new PositionXDto("LEFT", 0, TtmlNode.LEFT);
                LEFT = positionXDto;
                PositionXDto positionXDto2 = new PositionXDto("CENTER", 1, TtmlNode.CENTER);
                CENTER = positionXDto2;
                PositionXDto positionXDto3 = new PositionXDto("RIGHT", 2, TtmlNode.RIGHT);
                RIGHT = positionXDto3;
                PositionXDto[] positionXDtoArr = {positionXDto, positionXDto2, positionXDto3};
                $VALUES = positionXDtoArr;
                $ENTRIES = new asp(positionXDtoArr);
                CREATOR = new a();
            }

            private PositionXDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static PositionXDto valueOf(String str) {
                return (PositionXDto) Enum.valueOf(PositionXDto.class, str);
            }

            public static PositionXDto[] values() {
                return (PositionXDto[]) $VALUES.clone();
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
        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class PositionYDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PositionYDto[] $VALUES;

            @pmi0("bottom")
            public static final PositionYDto BOTTOM;
            public static final Parcelable.Creator<PositionYDto> CREATOR;

            @pmi0("middle")
            public static final PositionYDto MIDDLE;

            @pmi0("top")
            public static final PositionYDto TOP;
            private final String value;

            /* compiled from: StickersStickerPopupLayerDto.kt */
            public static final class a implements Parcelable.Creator<PositionYDto> {
                @Override // android.os.Parcelable.Creator
                public final PositionYDto createFromParcel(Parcel parcel) {
                    return PositionYDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final PositionYDto[] newArray(int i) {
                    return new PositionYDto[i];
                }
            }

            static {
                PositionYDto positionYDto = new PositionYDto("TOP", 0, "top");
                TOP = positionYDto;
                PositionYDto positionYDto2 = new PositionYDto("MIDDLE", 1, "middle");
                MIDDLE = positionYDto2;
                PositionYDto positionYDto3 = new PositionYDto("BOTTOM", 2, "bottom");
                BOTTOM = positionYDto3;
                PositionYDto[] positionYDtoArr = {positionYDto, positionYDto2, positionYDto3};
                $VALUES = positionYDtoArr;
                $ENTRIES = new asp(positionYDtoArr);
                CREATOR = new a();
            }

            private PositionYDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static PositionYDto valueOf(String str) {
                return (PositionYDto) Enum.valueOf(PositionYDto.class, str);
            }

            public static PositionYDto[] values() {
                return (PositionYDto[]) $VALUES.clone();
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
        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class RepeatDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ RepeatDto[] $VALUES;
            public static final Parcelable.Creator<RepeatDto> CREATOR;

            @pmi0("repeat")
            public static final RepeatDto REPEAT;

            @pmi0("repeat-x")
            public static final RepeatDto REPEAT_X;

            @pmi0("repeat-y")
            public static final RepeatDto REPEAT_Y;
            private final String value;

            /* compiled from: StickersStickerPopupLayerDto.kt */
            public static final class a implements Parcelable.Creator<RepeatDto> {
                @Override // android.os.Parcelable.Creator
                public final RepeatDto createFromParcel(Parcel parcel) {
                    return RepeatDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final RepeatDto[] newArray(int i) {
                    return new RepeatDto[i];
                }
            }

            static {
                RepeatDto repeatDto = new RepeatDto("REPEAT_X", 0, "repeat-x");
                REPEAT_X = repeatDto;
                RepeatDto repeatDto2 = new RepeatDto("REPEAT_Y", 1, "repeat-y");
                REPEAT_Y = repeatDto2;
                RepeatDto repeatDto3 = new RepeatDto("REPEAT", 2, "repeat");
                REPEAT = repeatDto3;
                RepeatDto[] repeatDtoArr = {repeatDto, repeatDto2, repeatDto3};
                $VALUES = repeatDtoArr;
                $ENTRIES = new asp(repeatDtoArr);
                CREATOR = new a();
            }

            private RepeatDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static RepeatDto valueOf(String str) {
                return (RepeatDto) Enum.valueOf(RepeatDto.class, str);
            }

            public static RepeatDto[] values() {
                return (RepeatDto[]) $VALUES.clone();
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
        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;

            @pmi0("animation_fullscreen")
            public static final TypeDto ANIMATION_FULLSCREEN;
            public static final Parcelable.Creator<TypeDto> CREATOR;
            private final String value;

            /* compiled from: StickersStickerPopupLayerDto.kt */
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
                TypeDto typeDto = new TypeDto("ANIMATION_FULLSCREEN", 0, "animation_fullscreen");
                ANIMATION_FULLSCREEN = typeDto;
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

        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class a implements Parcelable.Creator<StickersStickerPopupFullscreenAnimationDto> {
            @Override // android.os.Parcelable.Creator
            public final StickersStickerPopupFullscreenAnimationDto createFromParcel(Parcel parcel) {
                return new StickersStickerPopupFullscreenAnimationDto(TypeDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : PositionXDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PositionYDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RepeatDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FitDto.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final StickersStickerPopupFullscreenAnimationDto[] newArray(int i) {
                return new StickersStickerPopupFullscreenAnimationDto[i];
            }
        }

        public /* synthetic */ StickersStickerPopupFullscreenAnimationDto(TypeDto typeDto, int i, int i2, String str, Integer num, PositionXDto positionXDto, PositionYDto positionYDto, RepeatDto repeatDto, FitDto fitDto, int i3, zcl zclVar) {
            this(typeDto, i, i2, str, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : positionXDto, (i3 & 64) != 0 ? null : positionYDto, (i3 & 128) != 0 ? null : repeatDto, (i3 & 256) != 0 ? null : fitDto);
        }

        public final FitDto d() {
            return this.fit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final Integer e() {
            return this.loopsLimit;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StickersStickerPopupFullscreenAnimationDto)) {
                return false;
            }
            StickersStickerPopupFullscreenAnimationDto stickersStickerPopupFullscreenAnimationDto = (StickersStickerPopupFullscreenAnimationDto) obj;
            return this.type == stickersStickerPopupFullscreenAnimationDto.type && this.width == stickersStickerPopupFullscreenAnimationDto.width && this.height == stickersStickerPopupFullscreenAnimationDto.height && epx.f(this.url, stickersStickerPopupFullscreenAnimationDto.url) && epx.f(this.loopsLimit, stickersStickerPopupFullscreenAnimationDto.loopsLimit) && this.positionX == stickersStickerPopupFullscreenAnimationDto.positionX && this.positionY == stickersStickerPopupFullscreenAnimationDto.positionY && this.repeat == stickersStickerPopupFullscreenAnimationDto.repeat && this.fit == stickersStickerPopupFullscreenAnimationDto.fit;
        }

        public final PositionXDto f() {
            return this.positionX;
        }

        public final PositionYDto g() {
            return this.positionY;
        }

        public final String getUrl() {
            return this.url;
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.height, shy.a(this.width, this.type.hashCode() * 31, 31), 31), 31, this.url);
            Integer num = this.loopsLimit;
            int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
            PositionXDto positionXDto = this.positionX;
            int hashCode2 = (hashCode + (positionXDto == null ? 0 : positionXDto.hashCode())) * 31;
            PositionYDto positionYDto = this.positionY;
            int hashCode3 = (hashCode2 + (positionYDto == null ? 0 : positionYDto.hashCode())) * 31;
            RepeatDto repeatDto = this.repeat;
            int hashCode4 = (hashCode3 + (repeatDto == null ? 0 : repeatDto.hashCode())) * 31;
            FitDto fitDto = this.fit;
            return hashCode4 + (fitDto != null ? fitDto.hashCode() : 0);
        }

        public final RepeatDto i() {
            return this.repeat;
        }

        public final String toString() {
            return "StickersStickerPopupFullscreenAnimationDto(type=" + this.type + ", width=" + this.width + ", height=" + this.height + ", url=" + this.url + ", loopsLimit=" + this.loopsLimit + ", positionX=" + this.positionX + ", positionY=" + this.positionY + ", repeat=" + this.repeat + ", fit=" + this.fit + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeString(this.url);
            Integer num = this.loopsLimit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                nr.a(parcel, 1, num);
            }
            PositionXDto positionXDto = this.positionX;
            if (positionXDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                positionXDto.writeToParcel(parcel, i);
            }
            PositionYDto positionYDto = this.positionY;
            if (positionYDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                positionYDto.writeToParcel(parcel, i);
            }
            RepeatDto repeatDto = this.repeat;
            if (repeatDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                repeatDto.writeToParcel(parcel, i);
            }
            FitDto fitDto = this.fit;
            if (fitDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                fitDto.writeToParcel(parcel, i);
            }
        }

        public StickersStickerPopupFullscreenAnimationDto(TypeDto typeDto, int i, int i2, String str, Integer num, PositionXDto positionXDto, PositionYDto positionYDto, RepeatDto repeatDto, FitDto fitDto) {
            super(null);
            this.type = typeDto;
            this.width = i;
            this.height = i2;
            this.url = str;
            this.loopsLimit = num;
            this.positionX = positionXDto;
            this.positionY = positionYDto;
            this.repeat = repeatDto;
            this.fit = fitDto;
        }
    }

    /* compiled from: StickersStickerPopupLayerDto.kt */
    /* loaded from: classes15.dex */
    public static final class StickersStickerPopupGradientDto extends StickersStickerPopupLayerDto implements Parcelable {
        public static final Parcelable.Creator<StickersStickerPopupGradientDto> CREATOR = new a();

        @pmi0(X3.i.L)
        private final PositionDto position;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class PositionDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ PositionDto[] $VALUES;

            @pmi0("bottom")
            public static final PositionDto BOTTOM;
            public static final Parcelable.Creator<PositionDto> CREATOR;

            @pmi0(TtmlNode.LEFT)
            public static final PositionDto LEFT;

            @pmi0("middle")
            public static final PositionDto MIDDLE;

            @pmi0(TtmlNode.RIGHT)
            public static final PositionDto RIGHT;

            @pmi0("screen bottom")
            public static final PositionDto SCREEN_BOTTOM;

            @pmi0("screen left")
            public static final PositionDto SCREEN_LEFT;

            @pmi0("screen middle")
            public static final PositionDto SCREEN_MIDDLE;

            @pmi0("screen right")
            public static final PositionDto SCREEN_RIGHT;

            @pmi0("screen top")
            public static final PositionDto SCREEN_TOP;

            @pmi0("top")
            public static final PositionDto TOP;
            private final String value;

            /* compiled from: StickersStickerPopupLayerDto.kt */
            public static final class a implements Parcelable.Creator<PositionDto> {
                @Override // android.os.Parcelable.Creator
                public final PositionDto createFromParcel(Parcel parcel) {
                    return PositionDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final PositionDto[] newArray(int i) {
                    return new PositionDto[i];
                }
            }

            static {
                PositionDto positionDto = new PositionDto("TOP", 0, "top");
                TOP = positionDto;
                PositionDto positionDto2 = new PositionDto("SCREEN_TOP", 1, "screen top");
                SCREEN_TOP = positionDto2;
                PositionDto positionDto3 = new PositionDto("LEFT", 2, TtmlNode.LEFT);
                LEFT = positionDto3;
                PositionDto positionDto4 = new PositionDto("SCREEN_LEFT", 3, "screen left");
                SCREEN_LEFT = positionDto4;
                PositionDto positionDto5 = new PositionDto("MIDDLE", 4, "middle");
                MIDDLE = positionDto5;
                PositionDto positionDto6 = new PositionDto("SCREEN_MIDDLE", 5, "screen middle");
                SCREEN_MIDDLE = positionDto6;
                PositionDto positionDto7 = new PositionDto("BOTTOM", 6, "bottom");
                BOTTOM = positionDto7;
                PositionDto positionDto8 = new PositionDto("SCREEN_BOTTOM", 7, "screen bottom");
                SCREEN_BOTTOM = positionDto8;
                PositionDto positionDto9 = new PositionDto("RIGHT", 8, TtmlNode.RIGHT);
                RIGHT = positionDto9;
                PositionDto positionDto10 = new PositionDto("SCREEN_RIGHT", 9, "screen right");
                SCREEN_RIGHT = positionDto10;
                PositionDto[] positionDtoArr = {positionDto, positionDto2, positionDto3, positionDto4, positionDto5, positionDto6, positionDto7, positionDto8, positionDto9, positionDto10};
                $VALUES = positionDtoArr;
                $ENTRIES = new asp(positionDtoArr);
                CREATOR = new a();
            }

            private PositionDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static PositionDto valueOf(String str) {
                return (PositionDto) Enum.valueOf(PositionDto.class, str);
            }

            public static PositionDto[] values() {
                return (PositionDto[]) $VALUES.clone();
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
        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("gradient")
            public static final TypeDto GRADIENT;
            private final String value;

            /* compiled from: StickersStickerPopupLayerDto.kt */
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

        /* compiled from: StickersStickerPopupLayerDto.kt */
        public static final class a implements Parcelable.Creator<StickersStickerPopupGradientDto> {
            @Override // android.os.Parcelable.Creator
            public final StickersStickerPopupGradientDto createFromParcel(Parcel parcel) {
                return new StickersStickerPopupGradientDto(TypeDto.CREATOR.createFromParcel(parcel), PositionDto.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final StickersStickerPopupGradientDto[] newArray(int i) {
                return new StickersStickerPopupGradientDto[i];
            }
        }

        public StickersStickerPopupGradientDto(TypeDto typeDto, PositionDto positionDto) {
            super(null);
            this.type = typeDto;
            this.position = positionDto;
        }

        public final PositionDto d() {
            return this.position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StickersStickerPopupGradientDto)) {
                return false;
            }
            StickersStickerPopupGradientDto stickersStickerPopupGradientDto = (StickersStickerPopupGradientDto) obj;
            return this.type == stickersStickerPopupGradientDto.type && this.position == stickersStickerPopupGradientDto.position;
        }

        public final int hashCode() {
            return this.position.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "StickersStickerPopupGradientDto(type=" + this.type + ", position=" + this.position + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            this.position.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ StickersStickerPopupLayerDto(zcl zclVar) {
        this();
    }

    private StickersStickerPopupLayerDto() {
    }
}
