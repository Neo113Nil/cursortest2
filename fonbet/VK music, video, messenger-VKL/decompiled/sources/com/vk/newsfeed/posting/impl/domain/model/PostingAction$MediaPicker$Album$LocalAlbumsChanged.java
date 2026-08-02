package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$MediaPicker$Album$LocalAlbumsChanged implements PostingAction.MediaPicker {
    public static final Parcelable.Creator<PostingAction$MediaPicker$Album$LocalAlbumsChanged> CREATOR = new a();
    public final List<LocalAlbum> b;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$MediaPicker$Album$LocalAlbumsChanged> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$MediaPicker$Album$LocalAlbumsChanged createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(LocalAlbum.CREATOR, parcel, arrayList, i, 1);
            }
            return new PostingAction$MediaPicker$Album$LocalAlbumsChanged(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$MediaPicker$Album$LocalAlbumsChanged[] newArray(int i) {
            return new PostingAction$MediaPicker$Album$LocalAlbumsChanged[i];
        }
    }

    public PostingAction$MediaPicker$Album$LocalAlbumsChanged(List<LocalAlbum> list) {
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
        return (obj instanceof PostingAction$MediaPicker$Album$LocalAlbumsChanged) && epx.f(this.b, ((PostingAction$MediaPicker$Album$LocalAlbumsChanged) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("LocalAlbumsChanged(albums="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((LocalAlbum) a2.next()).writeToParcel(parcel, i);
        }
    }
}
