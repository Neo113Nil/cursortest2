package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$ValidationOldPostData$CheckRules implements PostingAction {
    public static final Parcelable.Creator<PostingAction$ValidationOldPostData$CheckRules> CREATOR = new a();
    public final List<PostingRule> b;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$ValidationOldPostData$CheckRules> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$ValidationOldPostData$CheckRules createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(PostingAction$ValidationOldPostData$CheckRules.class, parcel, arrayList, i, 1);
            }
            return new PostingAction$ValidationOldPostData$CheckRules(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$ValidationOldPostData$CheckRules[] newArray(int i) {
            return new PostingAction$ValidationOldPostData$CheckRules[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostingAction$ValidationOldPostData$CheckRules(List<? extends PostingRule> list) {
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
        return (obj instanceof PostingAction$ValidationOldPostData$CheckRules) && epx.f(this.b, ((PostingAction$ValidationOldPostData$CheckRules) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("CheckRules(additionalRules="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
