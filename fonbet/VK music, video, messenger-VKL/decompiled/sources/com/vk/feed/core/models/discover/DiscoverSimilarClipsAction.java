package com.vk.feed.core.models.discover;

import com.vk.core.serialize.Serializer;

/* compiled from: DiscoverAction.kt */
/* loaded from: classes18.dex */
public final class DiscoverSimilarClipsAction extends DiscoverAction {
    public static final Serializer.c<DiscoverSimilarClipsAction> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DiscoverSimilarClipsAction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DiscoverSimilarClipsAction a(Serializer serializer) {
            return new DiscoverSimilarClipsAction(serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DiscoverSimilarClipsAction[i];
        }
    }

    public DiscoverSimilarClipsAction(String str) {
        super(str);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }
}
