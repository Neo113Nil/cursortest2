package com.vk.dto.narratives;

import android.graphics.RectF;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.model.StoryEntry;
import xsna.epx;
import xsna.up2;
import xsna.zcl;

/* compiled from: HighlightCover.kt */
/* loaded from: classes18.dex */
public final class HighlightLocalStoryCover extends HighlightCover {
    public static final Serializer.c<HighlightLocalStoryCover> CREATOR = new a();
    public final StoryEntry b;
    public final RectF c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<HighlightLocalStoryCover> {
        @Override // com.vk.core.serialize.Serializer.c
        public final HighlightLocalStoryCover a(Serializer serializer) {
            return new HighlightLocalStoryCover((StoryEntry) serializer.G(StoryEntry.class.getClassLoader()), (RectF) serializer.A(RectF.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HighlightLocalStoryCover[i];
        }
    }

    public /* synthetic */ HighlightLocalStoryCover(StoryEntry storyEntry, RectF rectF, int i, zcl zclVar) {
        this(storyEntry, (i & 2) != 0 ? null : rectF);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.e0(this.c);
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final RectF d() {
        return this.c;
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final String e(int i) {
        return this.b.Ib(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightLocalStoryCover)) {
            return false;
        }
        HighlightLocalStoryCover highlightLocalStoryCover = (HighlightLocalStoryCover) obj;
        return epx.f(this.b, highlightLocalStoryCover.b) && epx.f(this.c, highlightLocalStoryCover.c);
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final String f() {
        return up2.a(this.b);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        RectF rectF = this.c;
        return hashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "HighlightLocalStoryCover(story=" + this.b + ", cropRect=" + this.c + ')';
    }

    public HighlightLocalStoryCover(StoryEntry storyEntry, RectF rectF) {
        super(null);
        this.b = storyEntry;
        this.c = rectF;
    }
}
