package com.vk.mediapicker.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MediaPickerFragmentArguments.kt */
/* loaded from: classes3.dex */
public final class MediaPickerFragmentArguments implements Parcelable {
    public static final Parcelable.Creator<MediaPickerFragmentArguments> CREATOR = new a();
    public final boolean b;
    public final boolean c;
    public final CellAspectRation d;
    public final MediaFilterPresets e;
    public final MediaPickerConfiguration f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaPickerFragmentArguments.kt */
    public static final class CellAspectRation {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CellAspectRation[] $VALUES;
        public static final CellAspectRation Square;
        public static final CellAspectRation Vertical;

        static {
            CellAspectRation cellAspectRation = new CellAspectRation("Square", 0);
            Square = cellAspectRation;
            CellAspectRation cellAspectRation2 = new CellAspectRation("Vertical", 1);
            Vertical = cellAspectRation2;
            CellAspectRation[] cellAspectRationArr = {cellAspectRation, cellAspectRation2};
            $VALUES = cellAspectRationArr;
            $ENTRIES = new asp(cellAspectRationArr);
        }

        public CellAspectRation() {
            throw null;
        }

        public static CellAspectRation valueOf(String str) {
            return (CellAspectRation) Enum.valueOf(CellAspectRation.class, str);
        }

        public static CellAspectRation[] values() {
            return (CellAspectRation[]) $VALUES.clone();
        }
    }

    /* compiled from: MediaPickerFragmentArguments.kt */
    public static final class MediaFilterPresets implements Parcelable {
        public static final Parcelable.Creator<MediaFilterPresets> CREATOR = new a();
        public final Long b;
        public final Long c;
        public final Long d;
        public final List<String> e;

        /* compiled from: MediaPickerFragmentArguments.kt */
        public static final class a implements Parcelable.Creator<MediaFilterPresets> {
            @Override // android.os.Parcelable.Creator
            public final MediaFilterPresets createFromParcel(Parcel parcel) {
                return new MediaFilterPresets(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final MediaFilterPresets[] newArray(int i) {
                return new MediaFilterPresets[i];
            }
        }

        public MediaFilterPresets() {
            this(null, null, null, null, 15, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaFilterPresets)) {
                return false;
            }
            MediaFilterPresets mediaFilterPresets = (MediaFilterPresets) obj;
            return epx.f(this.b, mediaFilterPresets.b) && epx.f(this.c, mediaFilterPresets.c) && epx.f(this.d, mediaFilterPresets.d) && epx.f(this.e, mediaFilterPresets.e);
        }

        public final int hashCode() {
            Long l = this.b;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.c;
            int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.d;
            int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
            List<String> list = this.e;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaFilterPresets(minVideoDurationMs=");
            sb.append(this.b);
            sb.append(", maxVideoDurationMs=");
            sb.append(this.c);
            sb.append(", maxFileSize=");
            sb.append(this.d);
            sb.append(", allowedMimeTypes=");
            return ms9.a(')', sb, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Long l = this.b;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                b.f(parcel, 1, l);
            }
            Long l2 = this.c;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                b.f(parcel, 1, l2);
            }
            Long l3 = this.d;
            if (l3 == null) {
                parcel.writeInt(0);
            } else {
                b.f(parcel, 1, l3);
            }
            parcel.writeStringList(this.e);
        }

        public MediaFilterPresets(Long l, Long l2, Long l3, List<String> list) {
            this.b = l;
            this.c = l2;
            this.d = l3;
            this.e = list;
        }

        public /* synthetic */ MediaFilterPresets(Long l, Long l2, Long l3, List list, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : list);
        }
    }

    /* compiled from: MediaPickerFragmentArguments.kt */
    public static final class a implements Parcelable.Creator<MediaPickerFragmentArguments> {
        @Override // android.os.Parcelable.Creator
        public final MediaPickerFragmentArguments createFromParcel(Parcel parcel) {
            return new MediaPickerFragmentArguments(parcel.readInt() != 0, parcel.readInt() != 0, CellAspectRation.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : MediaFilterPresets.CREATOR.createFromParcel(parcel), MediaPickerConfiguration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaPickerFragmentArguments[] newArray(int i) {
            return new MediaPickerFragmentArguments[i];
        }
    }

    public MediaPickerFragmentArguments() {
        this(false, false, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPickerFragmentArguments)) {
            return false;
        }
        MediaPickerFragmentArguments mediaPickerFragmentArguments = (MediaPickerFragmentArguments) obj;
        return this.b == mediaPickerFragmentArguments.b && this.c == mediaPickerFragmentArguments.c && this.d == mediaPickerFragmentArguments.d && epx.f(this.e, mediaPickerFragmentArguments.e) && epx.f(this.f, mediaPickerFragmentArguments.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c)) * 31;
        MediaFilterPresets mediaFilterPresets = this.e;
        return this.f.hashCode() + ((hashCode + (mediaFilterPresets == null ? 0 : mediaFilterPresets.hashCode())) * 31);
    }

    public final String toString() {
        return "MediaPickerFragmentArguments(isShowScrollbarWithDates=" + this.b + ", isPinchToZoomEnabled=" + this.c + ", aspectRatio=" + this.d + ", mediaFilterParams=" + this.e + ", configuration=" + this.f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d.name());
        MediaFilterPresets mediaFilterPresets = this.e;
        if (mediaFilterPresets == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaFilterPresets.writeToParcel(parcel, i);
        }
        this.f.writeToParcel(parcel, i);
    }

    public MediaPickerFragmentArguments(boolean z, boolean z2, CellAspectRation cellAspectRation, MediaFilterPresets mediaFilterPresets, MediaPickerConfiguration mediaPickerConfiguration) {
        this.b = z;
        this.c = z2;
        this.d = cellAspectRation;
        this.e = mediaFilterPresets;
        this.f = mediaPickerConfiguration;
    }

    public /* synthetic */ MediaPickerFragmentArguments(boolean z, boolean z2, CellAspectRation cellAspectRation, MediaFilterPresets mediaFilterPresets, MediaPickerConfiguration mediaPickerConfiguration, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? CellAspectRation.Square : cellAspectRation, (i & 8) != 0 ? null : mediaFilterPresets, (i & 16) != 0 ? new MediaPickerConfiguration(false, null, null, 7, null) : mediaPickerConfiguration);
    }
}
