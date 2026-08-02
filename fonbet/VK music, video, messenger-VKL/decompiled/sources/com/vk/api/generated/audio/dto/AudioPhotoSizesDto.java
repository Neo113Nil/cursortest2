package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.task.g;
import ru.ok.android.utils.Logger;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.zrp;

/* compiled from: AudioPhotoSizesDto.kt */
/* loaded from: classes14.dex */
public final class AudioPhotoSizesDto implements Parcelable {
    public static final Parcelable.Creator<AudioPhotoSizesDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("src")
    private final String src;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("width")
    private final int width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioPhotoSizesDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("a")
        public static final TypeDto A;

        @pmi0("b")
        public static final TypeDto B;

        @pmi0("base")
        public static final TypeDto BASE;

        @pmi0("c")
        public static final TypeDto C;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("d")
        public static final TypeDto D;

        @pmi0(Logger.METHOD_E)
        public static final TypeDto E;

        @pmi0(InneractiveMediationDefs.GENDER_FEMALE)
        public static final TypeDto F;

        @pmi0(g.e)
        public static final TypeDto G;

        @pmi0("h")
        public static final TypeDto H;

        @pmi0(CampaignEx.JSON_KEY_AD_K)
        public static final TypeDto K;

        @pmi0("l")
        public static final TypeDto L;

        @pmi0(InneractiveMediationDefs.GENDER_MALE)
        public static final TypeDto M;

        @pmi0("o")
        public static final TypeDto O;

        @pmi0(TtmlNode.TAG_P)
        public static final TypeDto P;

        @pmi0(CampaignEx.JSON_KEY_AD_Q)
        public static final TypeDto Q;

        @pmi0("r")
        public static final TypeDto R;

        @pmi0(UcumUtils.UCUM_SECONDS)
        public static final TypeDto S;

        @pmi0("t")
        public static final TypeDto T;

        @pmi0(Logger.METHOD_W)
        public static final TypeDto W;

        @pmi0("x")
        public static final TypeDto X;

        @pmi0("y")
        public static final TypeDto Y;

        @pmi0("z")
        public static final TypeDto Z;
        private final String value;

        /* compiled from: AudioPhotoSizesDto.kt */
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
            TypeDto typeDto = new TypeDto("A", 0, "a");
            A = typeDto;
            TypeDto typeDto2 = new TypeDto("B", 1, "b");
            B = typeDto2;
            TypeDto typeDto3 = new TypeDto("C", 2, "c");
            C = typeDto3;
            TypeDto typeDto4 = new TypeDto("D", 3, "d");
            D = typeDto4;
            TypeDto typeDto5 = new TypeDto("E", 4, Logger.METHOD_E);
            E = typeDto5;
            TypeDto typeDto6 = new TypeDto("F", 5, InneractiveMediationDefs.GENDER_FEMALE);
            F = typeDto6;
            TypeDto typeDto7 = new TypeDto("S", 6, UcumUtils.UCUM_SECONDS);
            S = typeDto7;
            TypeDto typeDto8 = new TypeDto("M", 7, InneractiveMediationDefs.GENDER_MALE);
            M = typeDto8;
            TypeDto typeDto9 = new TypeDto("X", 8, "x");
            X = typeDto9;
            TypeDto typeDto10 = new TypeDto("Y", 9, "y");
            Y = typeDto10;
            TypeDto typeDto11 = new TypeDto("Z", 10, "z");
            Z = typeDto11;
            TypeDto typeDto12 = new TypeDto("W", 11, Logger.METHOD_W);
            W = typeDto12;
            TypeDto typeDto13 = new TypeDto("O", 12, "o");
            O = typeDto13;
            TypeDto typeDto14 = new TypeDto("P", 13, TtmlNode.TAG_P);
            P = typeDto14;
            TypeDto typeDto15 = new TypeDto("Q", 14, CampaignEx.JSON_KEY_AD_Q);
            Q = typeDto15;
            TypeDto typeDto16 = new TypeDto("R", 15, "r");
            R = typeDto16;
            TypeDto typeDto17 = new TypeDto("G", 16, g.e);
            G = typeDto17;
            TypeDto typeDto18 = new TypeDto("T", 17, "t");
            T = typeDto18;
            TypeDto typeDto19 = new TypeDto("H", 18, "h");
            H = typeDto19;
            TypeDto typeDto20 = new TypeDto("L", 19, "l");
            L = typeDto20;
            TypeDto typeDto21 = new TypeDto("K", 20, CampaignEx.JSON_KEY_AD_K);
            K = typeDto21;
            TypeDto typeDto22 = new TypeDto("BASE", 21, "base");
            BASE = typeDto22;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14, typeDto15, typeDto16, typeDto17, typeDto18, typeDto19, typeDto20, typeDto21, typeDto22};
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

    /* compiled from: AudioPhotoSizesDto.kt */
    public static final class a implements Parcelable.Creator<AudioPhotoSizesDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPhotoSizesDto createFromParcel(Parcel parcel) {
            return new AudioPhotoSizesDto(parcel.readString(), parcel.readInt(), parcel.readInt(), TypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPhotoSizesDto[] newArray(int i) {
            return new AudioPhotoSizesDto[i];
        }
    }

    public AudioPhotoSizesDto(String str, int i, int i2, TypeDto typeDto) {
        this.src = str;
        this.width = i;
        this.height = i2;
        this.type = typeDto;
    }

    public final String d() {
        return this.src;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioPhotoSizesDto)) {
            return false;
        }
        AudioPhotoSizesDto audioPhotoSizesDto = (AudioPhotoSizesDto) obj;
        return epx.f(this.src, audioPhotoSizesDto.src) && this.width == audioPhotoSizesDto.width && this.height == audioPhotoSizesDto.height && this.type == audioPhotoSizesDto.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return this.type.hashCode() + shy.a(this.height, shy.a(this.width, this.src.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AudioPhotoSizesDto(src=" + this.src + ", width=" + this.width + ", height=" + this.height + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.src);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        this.type.writeToParcel(parcel, i);
    }
}
