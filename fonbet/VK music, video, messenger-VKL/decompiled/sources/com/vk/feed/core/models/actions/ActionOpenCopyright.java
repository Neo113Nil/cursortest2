package com.vk.feed.core.models.actions;

import com.vk.core.serialize.Serializer;

/* compiled from: ActionOpenCopyright.kt */
/* loaded from: classes18.dex */
public final class ActionOpenCopyright extends HeaderAction {
    public static final Serializer.c<ActionOpenCopyright> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ActionOpenCopyright> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionOpenCopyright a(Serializer serializer) {
            return new ActionOpenCopyright();
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionOpenCopyright[i];
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
