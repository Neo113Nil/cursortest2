package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PostingContext;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;

/* compiled from: PostingContext.kt */
/* loaded from: classes4.dex */
public final class EditingPost implements Parcelable {
    public static final Parcelable.Creator<EditingPost> CREATOR = new a();
    public final PostType b;
    public final UserId c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final PostSigner i;
    public final MobileOfficialAppsFeedStat$PostingContext.PostType j;
    public final String k;

    /* compiled from: PostingContext.kt */
    public static final class a implements Parcelable.Creator<EditingPost> {
        @Override // android.os.Parcelable.Creator
        public final EditingPost createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            PostType valueOf = PostType.valueOf(parcel.readString());
            UserId userId = (UserId) parcel.readParcelable(EditingPost.class.getClassLoader());
            int readInt = parcel.readInt();
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z = z2;
            }
            return new EditingPost(valueOf, userId, readInt, z5, z3, z4, z, parcel.readInt() == 0 ? null : PostSigner.CREATOR.createFromParcel(parcel), MobileOfficialAppsFeedStat$PostingContext.PostType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditingPost[] newArray(int i) {
            return new EditingPost[i];
        }
    }

    public EditingPost(PostType postType, UserId userId, int i, boolean z, boolean z2, boolean z3, boolean z4, PostSigner postSigner, MobileOfficialAppsFeedStat$PostingContext.PostType postType2, String str) {
        this.b = postType;
        this.c = userId;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = postSigner;
        this.j = postType2;
        this.k = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditingPost)) {
            return false;
        }
        EditingPost editingPost = (EditingPost) obj;
        return this.b == editingPost.b && epx.f(this.c, editingPost.c) && this.d == editingPost.d && this.e == editingPost.e && this.f == editingPost.f && this.g == editingPost.g && this.h == editingPost.h && epx.f(this.i, editingPost.i) && this.j == editingPost.j && epx.f(this.k, editingPost.k);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.d, bh10.a(this.b.hashCode() * 31, 31, this.c.b), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        PostSigner postSigner = this.i;
        int hashCode = (this.j.hashCode() + ((b + (postSigner == null ? 0 : postSigner.hashCode())) * 31)) * 31;
        String str = this.k;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditingPost(postType=");
        sb.append(this.b);
        sb.append(", ownerId=");
        sb.append(this.c);
        sb.append(", postId=");
        sb.append(this.d);
        sb.append(", isSuggested=");
        sb.append(this.e);
        sb.append(", isPostponed=");
        sb.append(this.f);
        sb.append(", isDraft=");
        sb.append(this.g);
        sb.append(", isDonut=");
        sb.append(this.h);
        sb.append(", signer=");
        sb.append(this.i);
        sb.append(", statsType=");
        sb.append(this.j);
        sb.append(", trackCode=");
        return ho8.a(sb, this.k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        PostSigner postSigner = this.i;
        if (postSigner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            postSigner.writeToParcel(parcel, i);
        }
        parcel.writeString(this.j.name());
        parcel.writeString(this.k);
    }
}
