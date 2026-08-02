package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;

/* compiled from: LiveStubStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class LiveStubStoriesContainer extends StoriesContainer {
    public static final Serializer.c<LiveStubStoriesContainer> CREATOR = new a();
    public final boolean o;
    public final boolean p;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<LiveStubStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LiveStubStoriesContainer a(Serializer serializer) {
            return new LiveStubStoriesContainer(serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LiveStubStoriesContainer[i];
        }
    }

    public LiveStubStoriesContainer(boolean z) {
        super(null, new ArrayList(), null, false, 12, null);
        this.o = z;
        this.p = true;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final boolean Cb() {
        return this.p;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.o ? (byte) 1 : (byte) 0);
    }
}
