package com.vk.story.api.domain.interactor.upload;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.media.entities.StoryEditorParams;
import com.vk.story.api.media.StoryMediaData;
import java.util.List;
import xsna.epx;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StoryMultiData.kt */
/* loaded from: classes6.dex */
public final class StoryMultiData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryMultiData> CREATOR = new a();
    public final List<StoryMediaData> b;
    public final StoryEditorParams c;
    public final CommonUploadParams d;
    public final int e;
    public final Integer f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryMultiData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryMultiData a(Serializer serializer) {
            return new StoryMultiData(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryMultiData[i];
        }
    }

    public /* synthetic */ StoryMultiData(List list, StoryEditorParams storyEditorParams, CommonUploadParams commonUploadParams, int i, Integer num, int i2, zcl zclVar) {
        this(list, storyEditorParams, commonUploadParams, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : num);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
        serializer.S(this.e);
        serializer.V(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryMultiData)) {
            return false;
        }
        StoryMultiData storyMultiData = (StoryMultiData) obj;
        return epx.f(this.b, storyMultiData.b) && epx.f(this.c, storyMultiData.c) && epx.f(this.d, storyMultiData.d) && this.e == storyMultiData.e && epx.f(this.f, storyMultiData.f);
    }

    public final int hashCode() {
        int a2 = shy.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31);
        Integer num = this.f;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryMultiData(stories=");
        sb.append(this.b);
        sb.append(", editorParams=");
        sb.append(this.c);
        sb.append(", commonUploadParams=");
        sb.append(this.d);
        sb.append(", uploadId=");
        sb.append(this.e);
        sb.append(", duration=");
        return uqi.b(sb, this.f, ')');
    }

    public StoryMultiData(List<StoryMediaData> list, StoryEditorParams storyEditorParams, CommonUploadParams commonUploadParams, int i, Integer num) {
        this.b = list;
        this.c = storyEditorParams;
        this.d = commonUploadParams;
        this.e = i;
        this.f = num;
    }

    public StoryMultiData(Serializer serializer) {
        this(serializer.l(StoryMediaData.class.getClassLoader()), (StoryEditorParams) serializer.G(StoryEditorParams.class.getClassLoader()), (CommonUploadParams) serializer.G(CommonUploadParams.class.getClassLoader()), serializer.u(), serializer.v());
    }
}
