package com.vk.im.engine.models.camera;

import com.vk.core.serialize.Serializer;

/* compiled from: StoryParams.kt */
/* loaded from: classes2.dex */
public final class StoryParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryParams> CREATOR = new a();
    public final VideoParams b;
    public final PhotoParams c;
    public final UploadParams d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryParams a(Serializer serializer) {
            return new StoryParams(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryParams[i];
        }
    }

    public StoryParams(VideoParams videoParams, PhotoParams photoParams, UploadParams uploadParams) {
        this.b = videoParams;
        this.c = photoParams;
        this.d = uploadParams;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
    }

    public StoryParams(Serializer serializer) {
        this.b = (VideoParams) serializer.G(VideoParams.class.getClassLoader());
        this.c = (PhotoParams) serializer.G(PhotoParams.class.getClassLoader());
        this.d = (UploadParams) serializer.G(UploadParams.class.getClassLoader());
    }
}
