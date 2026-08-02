package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.ApiApplication;
import java.util.List;

/* compiled from: AppGroupedStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class AppGroupedStoriesContainer extends StoriesContainer {
    public static final Serializer.c<AppGroupedStoriesContainer> CREATOR = new b();
    public final List<StoriesContainer> o;
    public final ApiApplication p;
    public final String q;

    /* compiled from: AppGroupedStoriesContainer.kt */
    public static final class a {
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AppGroupedStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AppGroupedStoriesContainer a(Serializer serializer) {
            return new AppGroupedStoriesContainer(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AppGroupedStoriesContainer[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppGroupedStoriesContainer(StoryOwner storyOwner, List<? extends StoryEntry> list, String str, boolean z, List<? extends StoriesContainer> list2, ApiApplication apiApplication) {
        super(storyOwner, list, str, z);
        this.q = "app_grouped_stories";
        this.o = list2;
        this.p = apiApplication;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.W(this.o);
        serializer.i0(this.p);
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Ob() {
        return this.q;
    }

    public AppGroupedStoriesContainer(Serializer serializer) {
        super(serializer);
        this.q = "app_grouped_stories";
        this.o = serializer.k(StoriesContainer.class);
        this.p = (ApiApplication) serializer.G(ApiApplication.class.getClassLoader());
    }
}
