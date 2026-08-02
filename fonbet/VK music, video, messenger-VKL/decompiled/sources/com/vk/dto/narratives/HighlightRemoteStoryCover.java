package com.vk.dto.narratives;

import android.graphics.RectF;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stories.model.StoryEntry;
import xsna.epx;
import xsna.ixj0;
import xsna.shy;
import xsna.up2;

/* compiled from: HighlightCover.kt */
/* loaded from: classes18.dex */
public final class HighlightRemoteStoryCover extends HighlightCover {
    public static final Serializer.c<HighlightRemoteStoryCover> CREATOR = new a();
    public final Image b;
    public final StoryEntry c;
    public final int d;
    public final RectF e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<HighlightRemoteStoryCover> {
        @Override // com.vk.core.serialize.Serializer.c
        public final HighlightRemoteStoryCover a(Serializer serializer) {
            return new HighlightRemoteStoryCover((Image) serializer.G(Image.class.getClassLoader()), (StoryEntry) serializer.G(StoryEntry.class.getClassLoader()), serializer.u(), (RectF) serializer.A(RectF.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HighlightRemoteStoryCover[i];
        }
    }

    public HighlightRemoteStoryCover(Image image, StoryEntry storyEntry, int i, RectF rectF) {
        super(null);
        this.b = image;
        this.c = storyEntry;
        this.d = i;
        this.e = rectF;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.S(this.d);
        serializer.e0(this.e);
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final RectF d() {
        return this.e;
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final String e(int i) {
        ImageSize Cb = this.b.Cb(i, true, false);
        if (Cb != null) {
            return Cb.d.d;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightRemoteStoryCover)) {
            return false;
        }
        HighlightRemoteStoryCover highlightRemoteStoryCover = (HighlightRemoteStoryCover) obj;
        return epx.f(this.b, highlightRemoteStoryCover.b) && epx.f(this.c, highlightRemoteStoryCover.c) && this.d == highlightRemoteStoryCover.d && epx.f(this.e, highlightRemoteStoryCover.e);
    }

    @Override // com.vk.dto.narratives.HighlightCover
    public final String f() {
        String a2;
        StoryEntry storyEntry = this.c;
        return (storyEntry == null || (a2 = up2.a(storyEntry)) == null) ? ixj0.h(this.b.b) : a2;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        StoryEntry storyEntry = this.c;
        int a2 = shy.a(this.d, (hashCode + (storyEntry == null ? 0 : storyEntry.hashCode())) * 31, 31);
        RectF rectF = this.e;
        return a2 + (rectF != null ? rectF.hashCode() : 0);
    }

    public final String toString() {
        return "HighlightRemoteStoryCover(croppedImage=" + this.b + ", story=" + this.c + ", storyId=" + this.d + ", cropRect=" + this.e + ')';
    }
}
