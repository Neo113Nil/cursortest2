package com.vk.dto.stories.model.ads;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.dt50;
import xsna.gjx;
import xsna.zcl;

/* compiled from: MyTargetAdStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class MyTargetAdStoriesContainer extends StoriesContainer {
    public static final Serializer.c<MyTargetAdStoriesContainer> CREATOR = new a();
    public final HashMap<StoryEntry, dt50> o;
    public final HashMap<StoryEntry, gjx> p;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MyTargetAdStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MyTargetAdStoriesContainer a(Serializer serializer) {
            return new MyTargetAdStoriesContainer(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MyTargetAdStoriesContainer[i];
        }
    }

    public MyTargetAdStoriesContainer(StoryOwner storyOwner, List<? extends StoryEntry> list, String str, boolean z) {
        super(storyOwner, list, str, z);
        this.o = new HashMap<>();
        this.p = new HashMap<>();
    }

    public final HashMap<StoryEntry, gjx> Tb() {
        return this.p;
    }

    public final HashMap<StoryEntry, dt50> Ub() {
        return this.o;
    }

    public final boolean Vb() {
        CopyOnWriteArrayList<StoryEntry> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return true;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (!((StoryEntry) it.next()).Pb()) {
                return false;
            }
        }
        return true;
    }

    public MyTargetAdStoriesContainer(Serializer serializer, zcl zclVar) {
        super(serializer);
        this.o = new HashMap<>();
        this.p = new HashMap<>();
    }
}
