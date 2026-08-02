package com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.impl.feedlikes.FeedLikesFilter;
import xsna.epx;
import xsna.tw60;
import xsna.ur60;
import xsna.wwf0;

/* compiled from: ReactionsFeedMviState.kt */
/* loaded from: classes4.dex */
public final class ReactionsFeedMviState implements tw60<ReactionsFeedMviState>, Serializer.StreamParcelable {
    public static final Serializer.c<ReactionsFeedMviState> CREATOR = new a();
    public final String b;
    public final ur60 c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ReactionsFeedMviState> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.serialize.Serializer.c
        public final ReactionsFeedMviState a(Serializer serializer) {
            return new ReactionsFeedMviState(((FeedLikesFilter) FeedLikesFilter.h().get(serializer.u())).i(), ur60.h);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReactionsFeedMviState[i];
        }
    }

    public ReactionsFeedMviState(String str, ur60 ur60Var) {
        this.b = str;
        this.c = ur60Var;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(wwf0.q(this));
    }

    @Override // xsna.tw60
    public final ReactionsFeedMviState b(ur60 ur60Var) {
        return new ReactionsFeedMviState(this.b, ur60Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionsFeedMviState)) {
            return false;
        }
        ReactionsFeedMviState reactionsFeedMviState = (ReactionsFeedMviState) obj;
        return epx.f(this.b, reactionsFeedMviState.b) && epx.f(this.c, reactionsFeedMviState.c);
    }

    public final int hashCode() {
        String str = this.b;
        return this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.c;
    }

    public final String toString() {
        return "ReactionsFeedMviState(filter=" + this.b + ", listState=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
