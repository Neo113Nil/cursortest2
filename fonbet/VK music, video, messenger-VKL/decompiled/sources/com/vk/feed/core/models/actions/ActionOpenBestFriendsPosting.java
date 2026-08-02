package com.vk.feed.core.models.actions;

import com.vk.core.serialize.Serializer;

/* compiled from: ActionOpenBestFriendsPosting.kt */
/* loaded from: classes18.dex */
public final class ActionOpenBestFriendsPosting extends HeaderAction {
    public static final Serializer.c<ActionOpenBestFriendsPosting> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionOpenBestFriendsPosting> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionOpenBestFriendsPosting a(Serializer serializer) {
            return new ActionOpenBestFriendsPosting();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionOpenBestFriendsPosting[i];
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
