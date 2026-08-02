package com.vk.media.entities;

import com.vk.core.serialize.Serializer;

/* compiled from: StoryEditorParams.kt */
/* loaded from: classes3.dex */
public final class StoryEditorParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryEditorParams> CREATOR = new a();
    public final int b;
    public final int c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryEditorParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryEditorParams a(Serializer serializer) {
            return new StoryEditorParams(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryEditorParams[i];
        }
    }

    public StoryEditorParams(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
    }

    public StoryEditorParams(Serializer serializer) {
        this(serializer.u(), serializer.u());
    }
}
