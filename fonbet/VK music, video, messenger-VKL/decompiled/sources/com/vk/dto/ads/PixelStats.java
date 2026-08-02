package com.vk.dto.ads;

import android.os.Parcel;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.core.serialize.Serializer;
import kotlin.LazyThreadSafetyMode;
import xsna.epx;
import xsna.ho8;
import xsna.i440;
import xsna.msy;
import xsna.zcl;

/* compiled from: PixelStats.kt */
/* loaded from: classes18.dex */
public final class PixelStats implements Serializer.StreamParcelable {
    public static final Serializer.c<PixelStats> CREATOR = new c();
    public final String b;
    public final AdsItemBlockAdStatPixelDto.TypeDto c;
    public final String d;
    public final Object e;

    /* compiled from: PixelStats.kt */
    public static final class a {
        public static String a(AdsItemBlockAdStatPixelDto.TypeDto typeDto, int i, int i2, int i3, int i4) {
            Serializer.c<PixelStats> cVar = PixelStats.CREATOR;
            if ((i4 & 8) != 0) {
                i3 = -1;
            }
            if (i == 0 || i2 == 0) {
                return null;
            }
            return typeDto.i() + '_' + i + '_' + i2 + '_' + i3 + "_0";
        }
    }

    /* compiled from: PixelStats.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdsItemBlockAdStatPixelDto.TypeDto.values().length];
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.LOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIDEO_PLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIDEO_PLAY_3S.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIDEO_PLAY_10S.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIDEO_PLAY_25.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIDEO_PLAY_50.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIDEO_PLAY_75.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIDEO_PLAY_95.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.VIDEO_PLAY_100.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.IMPRESSION_PRETTY_CARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AdsItemBlockAdStatPixelDto.TypeDto.AUDIO_CLICK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<PixelStats> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PixelStats a(Serializer serializer) {
            return new PixelStats(serializer.H(), (AdsItemBlockAdStatPixelDto.TypeDto) serializer.C(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixelStats[i];
        }
    }

    public PixelStats(String str, AdsItemBlockAdStatPixelDto.TypeDto typeDto, String str2) {
        this.b = str;
        this.c = typeDto;
        this.d = str2;
        this.e = msy.a(LazyThreadSafetyMode.PUBLICATION, new i440(this, 12));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.g0(this.c);
        serializer.j0(this.d);
    }

    public final String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PixelStats)) {
            return false;
        }
        PixelStats pixelStats = (PixelStats) obj;
        return epx.f(this.b, pixelStats.b) && this.c == pixelStats.c && epx.f(this.d, pixelStats.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        AdsItemBlockAdStatPixelDto.TypeDto typeDto = this.c;
        int hashCode2 = (hashCode + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PixelStats(data=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", key=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public /* synthetic */ PixelStats(String str, AdsItemBlockAdStatPixelDto.TypeDto typeDto, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : typeDto, (i & 4) != 0 ? null : str2);
    }
}
