package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.api.model.PostingMetricsEntryPoint;
import java.util.UUID;
import xsna.epx;

/* compiled from: PostingScreenContext.kt */
/* loaded from: classes4.dex */
public final class PostingScreenContext implements Parcelable {
    public static final Parcelable.Creator<PostingScreenContext> CREATOR = new a();
    public final PostingMetricsEntryPoint b;
    public final UUID c;

    /* compiled from: PostingScreenContext.kt */
    public static final class a implements Parcelable.Creator<PostingScreenContext> {
        @Override // android.os.Parcelable.Creator
        public final PostingScreenContext createFromParcel(Parcel parcel) {
            return new PostingScreenContext((PostingMetricsEntryPoint) parcel.readParcelable(PostingScreenContext.class.getClassLoader()), (UUID) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final PostingScreenContext[] newArray(int i) {
            return new PostingScreenContext[i];
        }
    }

    public PostingScreenContext(PostingMetricsEntryPoint postingMetricsEntryPoint, UUID uuid) {
        this.b = postingMetricsEntryPoint;
        this.c = uuid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingScreenContext)) {
            return false;
        }
        PostingScreenContext postingScreenContext = (PostingScreenContext) obj;
        return this.b == postingScreenContext.b && epx.f(this.c, postingScreenContext.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "PostingScreenContext(entryPoint=" + this.b + ", screenUniqueId=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeSerializable(this.c);
    }
}
