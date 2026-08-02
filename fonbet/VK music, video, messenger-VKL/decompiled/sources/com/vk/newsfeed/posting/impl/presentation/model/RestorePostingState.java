package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;

/* compiled from: RestorePostingState.kt */
/* loaded from: classes4.dex */
public final class RestorePostingState implements Serializer.StreamParcelable {
    public static final Serializer.c<RestorePostingState> CREATOR = new a();
    public final PostingState b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<RestorePostingState> {
        @Override // com.vk.core.serialize.Serializer.c
        public final RestorePostingState a(Serializer serializer) {
            return new RestorePostingState((PostingState) serializer.A(PostingState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RestorePostingState[i];
        }
    }

    public RestorePostingState(PostingState postingState) {
        this.b = postingState;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
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
