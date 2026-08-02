package com.vk.newsfeed.posting.impl.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingScreenContext;
import xsna.nr;

/* compiled from: RestorePostingStateMeta.kt */
/* loaded from: classes4.dex */
public final class RestorePostingStateMeta implements Parcelable {
    public static final Parcelable.Creator<RestorePostingStateMeta> CREATOR = new a();
    public final PostingContext b;
    public final PostingScreenContext c;
    public final String d;
    public final Integer e;
    public final String f;
    public final MediaPickerState g;

    /* compiled from: RestorePostingStateMeta.kt */
    public static final class a implements Parcelable.Creator<RestorePostingStateMeta> {
        @Override // android.os.Parcelable.Creator
        public final RestorePostingStateMeta createFromParcel(Parcel parcel) {
            return new RestorePostingStateMeta(PostingContext.CREATOR.createFromParcel(parcel), PostingScreenContext.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), MediaPickerState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RestorePostingStateMeta[] newArray(int i) {
            return new RestorePostingStateMeta[i];
        }
    }

    public RestorePostingStateMeta(PostingContext postingContext, PostingScreenContext postingScreenContext, String str, Integer num, String str2, MediaPickerState mediaPickerState) {
        this.b = postingContext;
        this.c = postingScreenContext;
        this.d = str;
        this.e = num;
        this.f = str2;
        this.g = mediaPickerState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.f);
        this.g.writeToParcel(parcel, i);
    }
}
