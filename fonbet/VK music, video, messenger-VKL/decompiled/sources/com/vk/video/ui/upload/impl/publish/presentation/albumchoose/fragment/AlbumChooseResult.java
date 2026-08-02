package com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;

/* compiled from: AlbumChooseArguments.kt */
/* loaded from: classes7.dex */
public final class AlbumChooseResult implements Parcelable {
    public static final Parcelable.Creator<AlbumChooseResult> CREATOR = new a();
    public final List<VideoAlbumResultData> b;

    /* compiled from: AlbumChooseArguments.kt */
    public static final class a implements Parcelable.Creator<AlbumChooseResult> {
        @Override // android.os.Parcelable.Creator
        public final AlbumChooseResult createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoAlbumResultData.CREATOR, parcel, arrayList, i, 1);
            }
            return new AlbumChooseResult(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumChooseResult[] newArray(int i) {
            return new AlbumChooseResult[i];
        }
    }

    public AlbumChooseResult(List<VideoAlbumResultData> list) {
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AlbumChooseResult) && epx.f(this.b, ((AlbumChooseResult) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AlbumChooseResult(selectedAlbumList="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((VideoAlbumResultData) a2.next()).writeToParcel(parcel, i);
        }
    }
}
