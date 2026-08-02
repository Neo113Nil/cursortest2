package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.StoryOwner;
import xsna.fsk;
import xsna.zcl;

/* compiled from: HighlightStoriesContainer.kt */
/* loaded from: classes18.dex */
public final class HighlightStoriesContainer extends StoriesContainer {
    public static final Serializer.c<HighlightStoriesContainer> CREATOR = new a();
    public final Narrative o;
    public final int p;
    public final UserId q;
    public final String r;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<HighlightStoriesContainer> {
        @Override // com.vk.core.serialize.Serializer.c
        public final HighlightStoriesContainer a(Serializer serializer) {
            return new HighlightStoriesContainer((Narrative) serializer.G(Narrative.class.getClassLoader()), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HighlightStoriesContainer[i];
        }
    }

    public HighlightStoriesContainer(Narrative narrative) {
        this(narrative, 0, 2, null);
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final UserId Ab() {
        return this.q;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final int Kb() {
        int i = this.p;
        if (i == 0) {
            return super.Kb();
        }
        int indexOf = this.o.l.indexOf(Integer.valueOf(i));
        return indexOf == -1 ? super.Kb() : indexOf;
    }

    @Override // com.vk.dto.stories.model.StoriesContainer, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.o);
        serializer.S(this.p);
    }

    @Override // com.vk.dto.stories.model.StoriesContainer
    public final String Ob() {
        return this.r;
    }

    public /* synthetic */ HighlightStoriesContainer(Narrative narrative, int i, int i2, zcl zclVar) {
        this(narrative, (i2 & 2) != 0 ? 0 : i);
    }

    public HighlightStoriesContainer(Narrative narrative, int i) {
        super(new StoryOwner.Owner(narrative.f), narrative.g, null, false, 12, null);
        this.o = narrative;
        this.p = i;
        this.q = narrative.c;
        this.r = fsk.M(narrative.b);
    }
}
