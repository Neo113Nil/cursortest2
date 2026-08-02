package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.zcl;

/* compiled from: DiscoverErrorLoadContainer.kt */
/* loaded from: classes18.dex */
public final class DiscoverErrorLoadContainer extends StoriesContainer {
    public static final Serializer.c<DiscoverErrorLoadContainer> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DiscoverErrorLoadContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DiscoverErrorLoadContainer a(Serializer serializer) {
            return new DiscoverErrorLoadContainer(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DiscoverErrorLoadContainer[i];
        }
    }

    public DiscoverErrorLoadContainer(List<? extends StoryEntry> list, String str) {
        super(null, list, str, false, 9, null);
    }

    public DiscoverErrorLoadContainer(Serializer serializer) {
        super(serializer);
    }

    public DiscoverErrorLoadContainer(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? "DiscoverErrorLoadContainer" : str);
    }
}
