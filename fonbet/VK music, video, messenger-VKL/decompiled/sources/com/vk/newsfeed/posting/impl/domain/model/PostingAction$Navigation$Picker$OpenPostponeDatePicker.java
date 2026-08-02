package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$Navigation$Picker$OpenPostponeDatePicker implements PostingAction.Navigation {
    public static final PostingAction$Navigation$Picker$OpenPostponeDatePicker b = new PostingAction$Navigation$Picker$OpenPostponeDatePicker();
    public static final Parcelable.Creator<PostingAction$Navigation$Picker$OpenPostponeDatePicker> CREATOR = new a();

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$Navigation$Picker$OpenPostponeDatePicker> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$Navigation$Picker$OpenPostponeDatePicker createFromParcel(Parcel parcel) {
            parcel.readInt();
            return PostingAction$Navigation$Picker$OpenPostponeDatePicker.b;
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$Navigation$Picker$OpenPostponeDatePicker[] newArray(int i) {
            return new PostingAction$Navigation$Picker$OpenPostponeDatePicker[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PostingAction$Navigation$Picker$OpenPostponeDatePicker);
    }

    public final int hashCode() {
        return -275844682;
    }

    public final String toString() {
        return "OpenPostponeDatePicker";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
