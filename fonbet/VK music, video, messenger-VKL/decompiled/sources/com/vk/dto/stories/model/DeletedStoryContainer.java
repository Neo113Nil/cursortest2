package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import kotlin.collections.EmptyList;

/* compiled from: DeletedStoryContainer.kt */
/* loaded from: classes18.dex */
public final class DeletedStoryContainer extends StoriesContainer {
    public static final Serializer.c<DeletedStoryContainer> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DeletedStoryContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DeletedStoryContainer a(Serializer serializer) {
            return new DeletedStoryContainer(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeletedStoryContainer[i];
        }
    }

    public DeletedStoryContainer(Serializer serializer) {
        super(serializer);
    }

    public DeletedStoryContainer() {
        super(null, EmptyList.b, null, false, 13, null);
    }
}
