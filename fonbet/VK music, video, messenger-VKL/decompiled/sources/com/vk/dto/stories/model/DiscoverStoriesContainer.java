package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import kotlin.collections.EmptyList;
import xsna.zcl;

/* compiled from: DiscoverStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class DiscoverStoriesContainer extends StoriesContainer {
    public static final Serializer.c<DiscoverStoriesContainer> CREATOR = new a();
    public final String o;
    public final String p;
    public final boolean q;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DiscoverStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DiscoverStoriesContainer a(Serializer serializer) {
            return new DiscoverStoriesContainer(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DiscoverStoriesContainer[i];
        }
    }

    public /* synthetic */ DiscoverStoriesContainer(String str, String str2, boolean z, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3);
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final boolean Cb() {
        return this.e;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final boolean Eb() {
        return this.q;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Ib() {
        return this.p;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        super.O7(serializer);
        serializer.j0(this.o);
        serializer.j0(this.p);
    }

    public DiscoverStoriesContainer(Serializer serializer, zcl zclVar) {
        super(serializer);
        this.q = true;
        String H = serializer.H();
        if (H == null) {
            throw new IllegalStateException("trackCode is empty");
        }
        this.o = H;
        this.p = serializer.H();
    }

    public DiscoverStoriesContainer(String str, String str2, boolean z, String str3) {
        super(null, EmptyList.b, str3, z);
        this.q = true;
        this.o = str;
        this.p = str2;
    }
}
