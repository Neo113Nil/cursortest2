package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;

/* compiled from: NavigationState.kt */
/* loaded from: classes4.dex */
public final class PostingNavigationState implements Parcelable {
    public static final Parcelable.Creator<PostingNavigationState> CREATOR = new a();
    public final List<PostingStep> b;

    /* compiled from: NavigationState.kt */
    public static final class a implements Parcelable.Creator<PostingNavigationState> {
        @Override // android.os.Parcelable.Creator
        public final PostingNavigationState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(PostingStep.CREATOR, parcel, arrayList, i, 1);
            }
            return new PostingNavigationState(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingNavigationState[] newArray(int i) {
            return new PostingNavigationState[i];
        }
    }

    public PostingNavigationState(List<PostingStep> list) {
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
        return (obj instanceof PostingNavigationState) && epx.f(this.b, ((PostingNavigationState) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("PostingNavigationState(backStack="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((PostingStep) a2.next()).writeToParcel(parcel, i);
        }
    }
}
