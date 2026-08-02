package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$Navigation$Picker$OpenPrivacyDatePicker implements PostingAction.Navigation {
    public static final PostingAction$Navigation$Picker$OpenPrivacyDatePicker b = new PostingAction$Navigation$Picker$OpenPrivacyDatePicker();
    public static final Parcelable.Creator<PostingAction$Navigation$Picker$OpenPrivacyDatePicker> CREATOR = new a();

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$Navigation$Picker$OpenPrivacyDatePicker> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$Navigation$Picker$OpenPrivacyDatePicker createFromParcel(Parcel parcel) {
            parcel.readInt();
            return PostingAction$Navigation$Picker$OpenPrivacyDatePicker.b;
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$Navigation$Picker$OpenPrivacyDatePicker[] newArray(int i) {
            return new PostingAction$Navigation$Picker$OpenPrivacyDatePicker[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof PostingAction$Navigation$Picker$OpenPrivacyDatePicker);
    }

    public final int hashCode() {
        return -1951978400;
    }

    public final String toString() {
        return "OpenPrivacyDatePicker";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
