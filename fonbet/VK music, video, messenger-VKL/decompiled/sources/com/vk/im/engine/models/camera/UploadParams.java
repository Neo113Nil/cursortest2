package com.vk.im.engine.models.camera;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: UploadParams.kt */
/* loaded from: classes2.dex */
public final class UploadParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<UploadParams> CREATOR = new a();
    public final StoryUploadParams b;
    public final CommonUploadParams c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UploadParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UploadParams a(Serializer serializer) {
            return new UploadParams(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UploadParams[i];
        }
    }

    public UploadParams() {
        this(null, null, null, 7, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadParams)) {
            return false;
        }
        UploadParams uploadParams = (UploadParams) obj;
        return epx.f(this.b, uploadParams.b) && epx.f(this.c, uploadParams.c) && epx.f(this.d, uploadParams.d);
    }

    public final int hashCode() {
        StoryUploadParams storyUploadParams = this.b;
        int hashCode = (storyUploadParams == null ? 0 : storyUploadParams.hashCode()) * 31;
        CommonUploadParams commonUploadParams = this.c;
        int hashCode2 = (hashCode + (commonUploadParams == null ? 0 : commonUploadParams.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadParams(storyUploadParams=");
        sb.append(this.b);
        sb.append(", commonUploadParams=");
        sb.append(this.c);
        sb.append(", analytics=");
        return ho8.a(sb, this.d, ')');
    }

    public /* synthetic */ UploadParams(StoryUploadParams storyUploadParams, CommonUploadParams commonUploadParams, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : storyUploadParams, (i & 2) != 0 ? null : commonUploadParams, (i & 4) != 0 ? null : str);
    }

    public UploadParams(StoryUploadParams storyUploadParams, CommonUploadParams commonUploadParams, String str) {
        this.b = storyUploadParams;
        this.c = commonUploadParams;
        this.d = str;
    }

    public UploadParams(Serializer serializer) {
        this((StoryUploadParams) serializer.G(StoryUploadParams.class.getClassLoader()), (CommonUploadParams) serializer.G(CommonUploadParams.class.getClassLoader()), serializer.H());
    }
}
