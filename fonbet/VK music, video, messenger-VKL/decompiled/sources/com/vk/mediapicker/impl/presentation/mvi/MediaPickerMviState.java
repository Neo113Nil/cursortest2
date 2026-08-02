package com.vk.mediapicker.impl.presentation.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.lm50;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MediaPickerMviState.kt */
/* loaded from: classes3.dex */
public final class MediaPickerMviState implements lm50, Parcelable {
    public static final Parcelable.Creator<MediaPickerMviState> CREATOR = new a();
    public final MediaPickerConfiguration.MultiSelectMode b;
    public final int c;
    public final List<AlbumEntry> d;
    public final boolean e;
    public final List<MediaStoreEntry> f;
    public final Medias g;

    /* compiled from: MediaPickerMviState.kt */
    public interface Medias extends Parcelable {

        /* compiled from: MediaPickerMviState.kt */
        public static final class Error implements Medias {
            public static final Error b = new Error();
            public static final Parcelable.Creator<Error> CREATOR = new a();

            /* compiled from: MediaPickerMviState.kt */
            public static final class a implements Parcelable.Creator<Error> {
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Error.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i) {
                    return new Error[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public final int hashCode() {
                return 395275728;
            }

            public final String toString() {
                return "Error";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: MediaPickerMviState.kt */
        public static final class Loaded implements Medias {
            public static final Parcelable.Creator<Loaded> CREATOR = new a();
            public final boolean b;
            public final List<MediaStoreEntry> c;
            public final List<MediaStoreEntry> d;
            public final Pagination e;

            /* compiled from: MediaPickerMviState.kt */
            public static final class a implements Parcelable.Creator<Loaded> {
                @Override // android.os.Parcelable.Creator
                public final Loaded createFromParcel(Parcel parcel) {
                    int i = 0;
                    boolean z = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i2 = 0;
                    while (i2 != readInt) {
                        i2 = bo.b(Loaded.class, parcel, arrayList, i2, 1);
                    }
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt2);
                    while (i != readInt2) {
                        i = bo.b(Loaded.class, parcel, arrayList2, i, 1);
                    }
                    return new Loaded(z, arrayList, arrayList2, Pagination.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Loaded[] newArray(int i) {
                    return new Loaded[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Loaded(boolean z, List<? extends MediaStoreEntry> list, List<? extends MediaStoreEntry> list2, Pagination pagination) {
                this.b = z;
                this.c = list;
                this.d = list2;
                this.e = pagination;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static Loaded a(Loaded loaded, ArrayList arrayList, ArrayList arrayList2, Pagination pagination, int i) {
                boolean z = loaded.b;
                List list = arrayList;
                if ((i & 2) != 0) {
                    list = loaded.c;
                }
                List list2 = arrayList2;
                if ((i & 4) != 0) {
                    list2 = loaded.d;
                }
                loaded.getClass();
                return new Loaded(z, list, list2, pagination);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) obj;
                return this.b == loaded.b && epx.f(this.c, loaded.c) && epx.f(this.d, loaded.d) && this.e == loaded.e;
            }

            public final int hashCode() {
                return this.e.hashCode() + fw3.a(fw3.a(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
            }

            public final String toString() {
                return "Loaded(isShowCamera=" + this.b + ", medias=" + this.c + ", filteredMedias=" + this.d + ", paginationState=" + this.e + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b ? 1 : 0);
                Iterator a2 = ao.a(parcel, this.c);
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
                Iterator a3 = ao.a(parcel, this.d);
                while (a3.hasNext()) {
                    parcel.writeParcelable((Parcelable) a3.next(), i);
                }
                parcel.writeString(this.e.name());
            }
        }

        /* compiled from: MediaPickerMviState.kt */
        public static final class Loading implements Medias {
            public static final Loading b = new Loading();
            public static final Parcelable.Creator<Loading> CREATOR = new a();

            /* compiled from: MediaPickerMviState.kt */
            public static final class a implements Parcelable.Creator<Loading> {
                @Override // android.os.Parcelable.Creator
                public final Loading createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Loading.b;
                }

                @Override // android.os.Parcelable.Creator
                public final Loading[] newArray(int i) {
                    return new Loading[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -576476412;
            }

            public final String toString() {
                return "Loading";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(1);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MediaPickerMviState.kt */
    public static final class Pagination {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Pagination[] $VALUES;
        public static final Pagination Error;
        public static final Pagination Loaded;
        public static final Pagination Loading;
        public static final Pagination NoMoreData;

        static {
            Pagination pagination = new Pagination("Loading", 0);
            Loading = pagination;
            Pagination pagination2 = new Pagination("Error", 1);
            Error = pagination2;
            Pagination pagination3 = new Pagination("Loaded", 2);
            Loaded = pagination3;
            Pagination pagination4 = new Pagination("NoMoreData", 3);
            NoMoreData = pagination4;
            Pagination[] paginationArr = {pagination, pagination2, pagination3, pagination4};
            $VALUES = paginationArr;
            $ENTRIES = new asp(paginationArr);
        }

        public Pagination() {
            throw null;
        }

        public static Pagination valueOf(String str) {
            return (Pagination) Enum.valueOf(Pagination.class, str);
        }

        public static Pagination[] values() {
            return (Pagination[]) $VALUES.clone();
        }
    }

    /* compiled from: MediaPickerMviState.kt */
    public static final class a implements Parcelable.Creator<MediaPickerMviState> {
        @Override // android.os.Parcelable.Creator
        public final MediaPickerMviState createFromParcel(Parcel parcel) {
            MediaPickerConfiguration.MultiSelectMode multiSelectMode = (MediaPickerConfiguration.MultiSelectMode) parcel.readParcelable(MediaPickerMviState.class.getClassLoader());
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = bo.b(MediaPickerMviState.class, parcel, arrayList, i2, 1);
            }
            boolean z = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            while (i != readInt3) {
                i = bo.b(MediaPickerMviState.class, parcel, arrayList2, i, 1);
            }
            return new MediaPickerMviState(multiSelectMode, readInt, arrayList, z, arrayList2, (Medias) parcel.readParcelable(MediaPickerMviState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaPickerMviState[] newArray(int i) {
            return new MediaPickerMviState[i];
        }
    }

    public MediaPickerMviState() {
        this(null, 0, null, false, null, null, 63, null);
    }

    public static MediaPickerMviState a(MediaPickerMviState mediaPickerMviState, int i, List list, boolean z, List list2, Medias medias, int i2) {
        int i3 = i;
        MediaPickerConfiguration.MultiSelectMode multiSelectMode = mediaPickerMviState.b;
        if ((i2 & 2) != 0) {
            i3 = mediaPickerMviState.c;
        }
        if ((i2 & 4) != 0) {
            list = mediaPickerMviState.d;
        }
        if ((i2 & 8) != 0) {
            z = mediaPickerMviState.e;
        }
        if ((i2 & 16) != 0) {
            list2 = mediaPickerMviState.f;
        }
        if ((i2 & 32) != 0) {
            medias = mediaPickerMviState.g;
        }
        Medias medias2 = medias;
        mediaPickerMviState.getClass();
        List list3 = list2;
        boolean z2 = z;
        return new MediaPickerMviState(multiSelectMode, i3, list, z2, list3, medias2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPickerMviState)) {
            return false;
        }
        MediaPickerMviState mediaPickerMviState = (MediaPickerMviState) obj;
        return epx.f(this.b, mediaPickerMviState.b) && this.c == mediaPickerMviState.c && epx.f(this.d, mediaPickerMviState.d) && this.e == mediaPickerMviState.e && epx.f(this.f, mediaPickerMviState.f) && epx.f(this.g, mediaPickerMviState.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + fw3.a(qoy.b(fw3.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "MediaPickerMviState(multiSelectMode=" + this.b + ", selectedAlbumBucketId=" + this.c + ", albums=" + this.d + ", isShowPartPermissionWarning=" + this.e + ", selectedMedias=" + this.f + ", mediasState=" + this.g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        Iterator a2 = ao.a(parcel, this.d);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.e ? 1 : 0);
        Iterator a3 = ao.a(parcel, this.f);
        while (a3.hasNext()) {
            parcel.writeParcelable((Parcelable) a3.next(), i);
        }
        parcel.writeParcelable(this.g, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaPickerMviState(MediaPickerConfiguration.MultiSelectMode multiSelectMode, int i, List<AlbumEntry> list, boolean z, List<? extends MediaStoreEntry> list2, Medias medias) {
        this.b = multiSelectMode;
        this.c = i;
        this.d = list;
        this.e = z;
        this.f = list2;
        this.g = medias;
    }

    public MediaPickerMviState(MediaPickerConfiguration.MultiSelectMode multiSelectMode, int i, List list, boolean z, List list2, Medias medias, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? MediaPickerConfiguration.MultiSelectMode.Single.c : multiSelectMode, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? EmptyList.b : list, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? EmptyList.b : list2, (i2 & 32) != 0 ? Medias.Loading.b : medias);
    }
}
