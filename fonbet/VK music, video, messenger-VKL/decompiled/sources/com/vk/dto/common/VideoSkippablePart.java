package com.vk.dto.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.iq;
import xsna.ms9;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoSkippablePart.kt */
/* loaded from: classes18.dex */
public final class VideoSkippablePart extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoSkippablePart> CREATOR = new a();
    public final boolean b;
    public final List<Part> c;

    /* compiled from: VideoSkippablePart.kt */
    public static final class Part implements Parcelable {
        public static final Parcelable.Creator<Part> CREATOR = new a();
        public final SkippableType b;
        public final long c;
        public final Long d;

        /* compiled from: VideoSkippablePart.kt */
        public static final class a implements Parcelable.Creator<Part> {
            @Override // android.os.Parcelable.Creator
            public final Part createFromParcel(Parcel parcel) {
                return new Part(SkippableType.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Part[] newArray(int i) {
                return new Part[i];
            }
        }

        public Part(SkippableType skippableType, long j, Long l) {
            this.b = skippableType;
            this.c = j;
            this.d = l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Part)) {
                return false;
            }
            Part part = (Part) obj;
            return this.b == part.b && this.c == part.c && epx.f(this.d, part.d);
        }

        public final int hashCode() {
            int a2 = bh10.a(this.b.hashCode() * 31, 31, this.c);
            Long l = this.d;
            return a2 + (l == null ? 0 : l.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Part(type=");
            sb.append(this.b);
            sb.append(", startAt=");
            sb.append(this.c);
            sb.append(", finishAt=");
            return iq.b(sb, this.d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            parcel.writeLong(this.c);
            Long l = this.d;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoSkippablePart.kt */
    public static final class SkippableType implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SkippableType[] $VALUES;
        public static final Parcelable.Creator<SkippableType> CREATOR;
        public static final SkippableType ENDING;
        public static final SkippableType OPENING;
        public static final SkippableType UNKNOWN;
        private final String value;

        /* compiled from: VideoSkippablePart.kt */
        public static final class a implements Parcelable.Creator<SkippableType> {
            @Override // android.os.Parcelable.Creator
            public final SkippableType createFromParcel(Parcel parcel) {
                return SkippableType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SkippableType[] newArray(int i) {
                return new SkippableType[i];
            }
        }

        static {
            SkippableType skippableType = new SkippableType("OPENING", 0, "opening");
            OPENING = skippableType;
            SkippableType skippableType2 = new SkippableType("ENDING", 1, "ending");
            ENDING = skippableType2;
            SkippableType skippableType3 = new SkippableType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, "unknown");
            UNKNOWN = skippableType3;
            SkippableType[] skippableTypeArr = {skippableType, skippableType2, skippableType3};
            $VALUES = skippableTypeArr;
            $ENTRIES = new asp(skippableTypeArr);
            CREATOR = new a();
        }

        public SkippableType(String str, int i, String str2) {
            this.value = str2;
        }

        public static SkippableType valueOf(String str) {
            return (SkippableType) Enum.valueOf(SkippableType.class, str);
        }

        public static SkippableType[] values() {
            return (SkippableType[]) $VALUES.clone();
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

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoSkippablePart> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoSkippablePart a(Serializer serializer) {
            return new VideoSkippablePart(serializer.m(), serializer.B(Part.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoSkippablePart[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSkippablePart() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.f0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSkippablePart)) {
            return false;
        }
        VideoSkippablePart videoSkippablePart = (VideoSkippablePart) obj;
        return this.b == videoSkippablePart.b && epx.f(this.c, videoSkippablePart.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        List<Part> list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoGetForPlay(is_serial=");
        sb.append(this.b);
        sb.append(", skippable_parts=");
        return ms9.a(')', sb, this.c);
    }

    public /* synthetic */ VideoSkippablePart(boolean z, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
    }

    public VideoSkippablePart(boolean z, List<Part> list) {
        this.b = z;
        this.c = list;
    }
}
