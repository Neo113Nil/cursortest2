package com.vk.newsfeed.api.posting.domain.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;

/* compiled from: PostingStateCacheKey.kt */
/* loaded from: classes3.dex */
public final class PostingStateCacheKey implements Serializer.StreamParcelable {
    public static final Serializer.c<PostingStateCacheKey> CREATOR = new a();
    public final String b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PostingStateCacheKey> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PostingStateCacheKey a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new PostingStateCacheKey(H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostingStateCacheKey[i];
        }
    }

    public PostingStateCacheKey(String str) {
        this.b = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
