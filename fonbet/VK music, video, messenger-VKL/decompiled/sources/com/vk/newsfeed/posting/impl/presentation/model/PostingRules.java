package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class PostingRules implements Serializer.StreamParcelable {
    public static final Serializer.c<PostingRules> CREATOR = new a();
    public final List<PostingRule> b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PostingRules> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PostingRules a(Serializer serializer) {
            ArrayList k = serializer.k(PostingRule.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new PostingRules(k);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostingRules[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostingRules(List<? extends PostingRule> list) {
        this.b = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostingRules) && epx.f(this.b, ((PostingRules) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("PostingRules(items="), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
