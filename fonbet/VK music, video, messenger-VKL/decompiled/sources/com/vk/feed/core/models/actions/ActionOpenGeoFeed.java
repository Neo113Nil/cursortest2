package com.vk.feed.core.models.actions;

import com.vk.core.serialize.Serializer;

/* compiled from: ActionOpenGeoFeed.kt */
/* loaded from: classes18.dex */
public final class ActionOpenGeoFeed extends HeaderAction {
    public static final Serializer.c<ActionOpenGeoFeed> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionOpenGeoFeed> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionOpenGeoFeed a(Serializer serializer) {
            return new ActionOpenGeoFeed();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionOpenGeoFeed[i];
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
