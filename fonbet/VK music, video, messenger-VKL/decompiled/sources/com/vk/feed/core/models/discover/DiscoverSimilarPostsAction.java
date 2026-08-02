package com.vk.feed.core.models.discover;

import com.vk.core.serialize.Serializer;

/* compiled from: DiscoverAction.kt */
/* loaded from: classes18.dex */
public final class DiscoverSimilarPostsAction extends DiscoverAction {
    public static final Serializer.c<DiscoverSimilarPostsAction> CREATOR = new a();
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DiscoverSimilarPostsAction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DiscoverSimilarPostsAction a(Serializer serializer) {
            return new DiscoverSimilarPostsAction(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DiscoverSimilarPostsAction[i];
        }
    }

    public DiscoverSimilarPostsAction(String str, String str2) {
        super(str2);
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.j0(this.b);
    }
}
