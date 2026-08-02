package com.vk.newsfeed.posting.impl.domain.model.messages;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import defpackage.q0;
import xsna.epx;
import xsna.nr;
import xsna.zcl;

/* compiled from: PostingUserMessageButton.kt */
/* loaded from: classes4.dex */
public final class PostingUserMessageButton implements Parcelable {
    public static final Parcelable.Creator<PostingUserMessageButton> CREATOR = new a();
    public final PostingUserMessageText b;
    public final PostingAction c;
    public final Integer d;
    public final boolean e;

    /* compiled from: PostingUserMessageButton.kt */
    public static final class a implements Parcelable.Creator<PostingUserMessageButton> {
        @Override // android.os.Parcelable.Creator
        public final PostingUserMessageButton createFromParcel(Parcel parcel) {
            return new PostingUserMessageButton((PostingUserMessageText) parcel.readParcelable(PostingUserMessageButton.class.getClassLoader()), (PostingAction) parcel.readParcelable(PostingUserMessageButton.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingUserMessageButton[] newArray(int i) {
            return new PostingUserMessageButton[i];
        }
    }

    public PostingUserMessageButton(PostingUserMessageText postingUserMessageText, PostingAction postingAction, Integer num, boolean z) {
        this.b = postingUserMessageText;
        this.c = postingAction;
        this.d = num;
        this.e = z;
    }

    public static PostingUserMessageButton a(PostingUserMessageButton postingUserMessageButton, PostingAction.Editing.RemoveTagsForPhoto removeTagsForPhoto) {
        return new PostingUserMessageButton(postingUserMessageButton.b, removeTagsForPhoto, postingUserMessageButton.d, postingUserMessageButton.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingUserMessageButton)) {
            return false;
        }
        PostingUserMessageButton postingUserMessageButton = (PostingUserMessageButton) obj;
        return epx.f(this.b, postingUserMessageButton.b) && epx.f(this.c, postingUserMessageButton.c) && epx.f(this.d, postingUserMessageButton.d) && this.e == postingUserMessageButton.e;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        PostingAction postingAction = this.c;
        int hashCode2 = (hashCode + (postingAction == null ? 0 : postingAction.hashCode())) * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingUserMessageButton(text=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", colorOverrideRes=");
        sb.append(this.d);
        sb.append(", composeWithOriginalAction=");
        return q0.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ PostingUserMessageButton(PostingUserMessageText postingUserMessageText, PostingAction postingAction, Integer num, boolean z, int i, zcl zclVar) {
        this(postingUserMessageText, (i & 2) != 0 ? null : postingAction, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z);
    }
}
