package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.shy;
import xsna.vu5;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class PostingPollSettings implements Serializer.StreamParcelable {
    public static final Serializer.c<PostingPollSettings> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PostingPollSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PostingPollSettings a(Serializer serializer) {
            return new PostingPollSettings(serializer.u(), serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostingPollSettings[i];
        }
    }

    public PostingPollSettings(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingPollSettings)) {
            return false;
        }
        PostingPollSettings postingPollSettings = (PostingPollSettings) obj;
        return this.b == postingPollSettings.b && this.c == postingPollSettings.c && this.d == postingPollSettings.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingPollSettings(questionMaxLength=");
        sb.append(this.b);
        sb.append(", answerMaxLength=");
        sb.append(this.c);
        sb.append(", answersMaxCount=");
        return vu5.b(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
