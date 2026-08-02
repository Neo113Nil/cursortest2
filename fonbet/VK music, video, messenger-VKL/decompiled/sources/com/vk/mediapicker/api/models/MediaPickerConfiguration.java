package com.vk.mediapicker.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.vu5;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MediaPickerConfiguration.kt */
/* loaded from: classes3.dex */
public final class MediaPickerConfiguration implements Parcelable {
    public static final Parcelable.Creator<MediaPickerConfiguration> CREATOR = new a();
    public final boolean b;
    public final MultiSelectMode c;
    public final MediaType d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaPickerConfiguration.kt */
    public static final class MediaType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MediaType[] $VALUES;
        public static final MediaType All;
        public static final MediaType Image;
        public static final MediaType Video;

        static {
            MediaType mediaType = new MediaType("Image", 0);
            Image = mediaType;
            MediaType mediaType2 = new MediaType("Video", 1);
            Video = mediaType2;
            MediaType mediaType3 = new MediaType("All", 2);
            All = mediaType3;
            MediaType[] mediaTypeArr = {mediaType, mediaType2, mediaType3};
            $VALUES = mediaTypeArr;
            $ENTRIES = new asp(mediaTypeArr);
        }

        public MediaType() {
            throw null;
        }

        public static zrp<MediaType> h() {
            return $ENTRIES;
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) $VALUES.clone();
        }
    }

    /* compiled from: MediaPickerConfiguration.kt */
    public static abstract class MultiSelectMode implements Parcelable {
        public final int b;

        /* compiled from: MediaPickerConfiguration.kt */
        public static final class Check extends MultiSelectMode {
            public static final Parcelable.Creator<Check> CREATOR = new a();
            public final int c;

            /* compiled from: MediaPickerConfiguration.kt */
            public static final class a implements Parcelable.Creator<Check> {
                @Override // android.os.Parcelable.Creator
                public final Check createFromParcel(Parcel parcel) {
                    return new Check(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Check[] newArray(int i) {
                    return new Check[i];
                }
            }

            public Check() {
                this(0, 1, null);
            }

            @Override // com.vk.mediapicker.api.models.MediaPickerConfiguration.MultiSelectMode
            public final int d() {
                return this.c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Check) && this.c == ((Check) obj).c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Check(maxSelectionCount="), this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.c);
            }

            public Check(int i) {
                super(i, null);
                this.c = i;
            }

            public /* synthetic */ Check(int i, int i2, zcl zclVar) {
                this((i2 & 1) != 0 ? -1 : i);
            }
        }

        /* compiled from: MediaPickerConfiguration.kt */
        public static final class Counter extends MultiSelectMode {
            public static final Parcelable.Creator<Counter> CREATOR = new a();
            public final int c;

            /* compiled from: MediaPickerConfiguration.kt */
            public static final class a implements Parcelable.Creator<Counter> {
                @Override // android.os.Parcelable.Creator
                public final Counter createFromParcel(Parcel parcel) {
                    return new Counter(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Counter[] newArray(int i) {
                    return new Counter[i];
                }
            }

            public Counter() {
                this(0, 1, null);
            }

            @Override // com.vk.mediapicker.api.models.MediaPickerConfiguration.MultiSelectMode
            public final int d() {
                return this.c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Counter) && this.c == ((Counter) obj).c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Counter(maxSelectionCount="), this.c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.c);
            }

            public Counter(int i) {
                super(i, null);
                this.c = i;
            }

            public /* synthetic */ Counter(int i, int i2, zcl zclVar) {
                this((i2 & 1) != 0 ? -1 : i);
            }
        }

        /* compiled from: MediaPickerConfiguration.kt */
        public static final class Single extends MultiSelectMode {
            public static final Single c = new Single(1, null);
            public static final Parcelable.Creator<Single> CREATOR = new a();

            /* compiled from: MediaPickerConfiguration.kt */
            public static final class a implements Parcelable.Creator<Single> {
                @Override // android.os.Parcelable.Creator
                public final Single createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Single.c;
                }

                @Override // android.os.Parcelable.Creator
                public final Single[] newArray(int i) {
                    return new Single[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Single);
            }

            public final int hashCode() {
                return -425685280;
            }

            public final String toString() {
                return "Single";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        public MultiSelectMode(int i, zcl zclVar) {
            this.b = i;
        }

        public int d() {
            return this.b;
        }
    }

    /* compiled from: MediaPickerConfiguration.kt */
    public static final class a implements Parcelable.Creator<MediaPickerConfiguration> {
        @Override // android.os.Parcelable.Creator
        public final MediaPickerConfiguration createFromParcel(Parcel parcel) {
            return new MediaPickerConfiguration(parcel.readInt() != 0, (MultiSelectMode) parcel.readParcelable(MediaPickerConfiguration.class.getClassLoader()), MediaType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaPickerConfiguration[] newArray(int i) {
            return new MediaPickerConfiguration[i];
        }
    }

    public MediaPickerConfiguration() {
        this(false, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPickerConfiguration)) {
            return false;
        }
        MediaPickerConfiguration mediaPickerConfiguration = (MediaPickerConfiguration) obj;
        return this.b == mediaPickerConfiguration.b && epx.f(this.c, mediaPickerConfiguration.c) && this.d == mediaPickerConfiguration.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        return "MediaPickerConfiguration(isShowCamera=" + this.b + ", multiSelectMode=" + this.c + ", mediaType=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d.name());
    }

    public MediaPickerConfiguration(boolean z, MultiSelectMode multiSelectMode, MediaType mediaType) {
        this.b = z;
        this.c = multiSelectMode;
        this.d = mediaType;
    }

    public /* synthetic */ MediaPickerConfiguration(boolean z, MultiSelectMode multiSelectMode, MediaType mediaType, int i, zcl zclVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? MultiSelectMode.Single.c : multiSelectMode, (i & 4) != 0 ? MediaType.All : mediaType);
    }
}
