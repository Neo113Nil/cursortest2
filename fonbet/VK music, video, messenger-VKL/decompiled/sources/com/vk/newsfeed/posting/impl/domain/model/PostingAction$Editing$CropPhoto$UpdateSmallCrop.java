package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import defpackage.q0;
import xsna.epx;

/* compiled from: PostingAction.kt */
/* loaded from: classes4.dex */
public final class PostingAction$Editing$CropPhoto$UpdateSmallCrop implements PostingAction.Editing {
    public static final Parcelable.Creator<PostingAction$Editing$CropPhoto$UpdateSmallCrop> CREATOR = new a();
    public final MediaPickerSelectedItem b;
    public final boolean c;

    /* compiled from: PostingAction.kt */
    public static final class a implements Parcelable.Creator<PostingAction$Editing$CropPhoto$UpdateSmallCrop> {
        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$UpdateSmallCrop createFromParcel(Parcel parcel) {
            return new PostingAction$Editing$CropPhoto$UpdateSmallCrop((MediaPickerSelectedItem) parcel.readParcelable(PostingAction$Editing$CropPhoto$UpdateSmallCrop.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingAction$Editing$CropPhoto$UpdateSmallCrop[] newArray(int i) {
            return new PostingAction$Editing$CropPhoto$UpdateSmallCrop[i];
        }
    }

    public PostingAction$Editing$CropPhoto$UpdateSmallCrop(MediaPickerSelectedItem mediaPickerSelectedItem, boolean z) {
        this.b = mediaPickerSelectedItem;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingAction$Editing$CropPhoto$UpdateSmallCrop)) {
            return false;
        }
        PostingAction$Editing$CropPhoto$UpdateSmallCrop postingAction$Editing$CropPhoto$UpdateSmallCrop = (PostingAction$Editing$CropPhoto$UpdateSmallCrop) obj;
        return epx.f(this.b, postingAction$Editing$CropPhoto$UpdateSmallCrop.b) && this.c == postingAction$Editing$CropPhoto$UpdateSmallCrop.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateSmallCrop(item=");
        sb.append(this.b);
        sb.append(", selected=");
        return q0.a(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
