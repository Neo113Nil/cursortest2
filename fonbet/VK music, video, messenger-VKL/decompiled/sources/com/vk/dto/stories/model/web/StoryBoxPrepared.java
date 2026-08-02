package com.vk.dto.stories.model.web;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.StorySharingInfo;
import com.vk.superapp.api.dto.story.WebStoryBox;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: StoryBoxPrepared.kt */
/* loaded from: classes18.dex */
public final class StoryBoxPrepared extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryBoxPrepared> CREATOR = new a();
    public final WebStoryBox b;
    public final StorySharingInfo c;
    public final Integer d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryBoxPrepared> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryBoxPrepared a(Serializer serializer) {
            return new StoryBoxPrepared(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryBoxPrepared[i];
        }
    }

    public /* synthetic */ StoryBoxPrepared(WebStoryBox webStoryBox, StorySharingInfo storySharingInfo, Integer num, String str, int i, zcl zclVar) {
        this(webStoryBox, storySharingInfo, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }

    public final String Ab() {
        return this.e;
    }

    public final StorySharingInfo Bb() {
        return this.c;
    }

    public final WebStoryBox Cb() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.V(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryBoxPrepared)) {
            return false;
        }
        StoryBoxPrepared storyBoxPrepared = (StoryBoxPrepared) obj;
        return epx.f(this.b, storyBoxPrepared.b) && epx.f(this.c, storyBoxPrepared.c) && epx.f(this.d, storyBoxPrepared.d) && epx.f(this.e, storyBoxPrepared.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        StorySharingInfo storySharingInfo = this.c;
        int hashCode2 = (hashCode + (storySharingInfo == null ? 0 : storySharingInfo.hashCode())) * 31;
        Integer num = this.d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryBoxPrepared(storyBox=");
        sb.append(this.b);
        sb.append(", shareInfo=");
        sb.append(this.c);
        sb.append(", appId=");
        sb.append(this.d);
        sb.append(", requestId=");
        return ho8.a(sb, this.e, ')');
    }

    public final Integer zb() {
        return this.d;
    }

    public StoryBoxPrepared(WebStoryBox webStoryBox, StorySharingInfo storySharingInfo, Integer num, String str) {
        this.b = webStoryBox;
        this.c = storySharingInfo;
        this.d = num;
        this.e = str;
    }

    public StoryBoxPrepared(Serializer serializer, zcl zclVar) {
        this((WebStoryBox) serializer.G(WebStoryBox.class.getClassLoader()), (StorySharingInfo) serializer.G(StorySharingInfo.class.getClassLoader()), serializer.v(), serializer.H());
    }
}
