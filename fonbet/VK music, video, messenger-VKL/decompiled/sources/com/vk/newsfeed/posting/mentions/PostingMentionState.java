package com.vk.newsfeed.posting.mentions;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.mentions.MentionProfileVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.zcl;

/* compiled from: PostingMentionState.kt */
/* loaded from: classes4.dex */
public final class PostingMentionState implements Parcelable {
    public static final Parcelable.Creator<PostingMentionState> CREATOR = new a();
    public final PostingMentionLoadingState b;
    public final List<MentionProfileVO> c;

    /* compiled from: PostingMentionState.kt */
    public static final class a implements Parcelable.Creator<PostingMentionState> {
        @Override // android.os.Parcelable.Creator
        public final PostingMentionState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            PostingMentionLoadingState valueOf = PostingMentionLoadingState.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(PostingMentionState.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new PostingMentionState(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PostingMentionState[] newArray(int i) {
            return new PostingMentionState[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PostingMentionState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static PostingMentionState a(PostingMentionState postingMentionState, PostingMentionLoadingState postingMentionLoadingState) {
        List<MentionProfileVO> list = postingMentionState.c;
        postingMentionState.getClass();
        return new PostingMentionState(postingMentionLoadingState, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostingMentionState)) {
            return false;
        }
        PostingMentionState postingMentionState = (PostingMentionState) obj;
        return this.b == postingMentionState.b && epx.f(this.c, postingMentionState.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List<MentionProfileVO> list = this.c;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostingMentionState(state=");
        sb.append(this.b);
        sb.append(", mentions=");
        return ms9.a(')', sb, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        List<MentionProfileVO> list = this.c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public PostingMentionState(PostingMentionLoadingState postingMentionLoadingState, List<MentionProfileVO> list) {
        this.b = postingMentionLoadingState;
        this.c = list;
    }

    public /* synthetic */ PostingMentionState(PostingMentionLoadingState postingMentionLoadingState, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? PostingMentionLoadingState.EMPTY : postingMentionLoadingState, (i & 2) != 0 ? null : list);
    }
}
