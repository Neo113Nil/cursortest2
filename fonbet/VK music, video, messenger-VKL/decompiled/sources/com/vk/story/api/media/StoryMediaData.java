package com.vk.story.api.media;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.media.model.CameraVideoEncoderParameters;
import java.io.File;
import xsna.zcl;

/* compiled from: StoryMediaData.kt */
/* loaded from: classes6.dex */
public final class StoryMediaData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryMediaData> CREATOR = new a();
    public final File b;
    public final CameraVideoEncoderParameters c;
    public final StoryUploadParams d;
    public final boolean e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryMediaData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryMediaData a(Serializer serializer) {
            return new StoryMediaData(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryMediaData[i];
        }
    }

    public /* synthetic */ StoryMediaData(File file, CameraVideoEncoderParameters cameraVideoEncoderParameters, StoryUploadParams storyUploadParams, zcl zclVar) {
        this(file, cameraVideoEncoderParameters, storyUploadParams);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.i0(this.c);
        serializer.i0(this.d);
    }

    public StoryMediaData(File file, CameraVideoEncoderParameters cameraVideoEncoderParameters, StoryUploadParams storyUploadParams) {
        this.b = file;
        this.c = cameraVideoEncoderParameters;
        this.d = storyUploadParams;
        this.e = file != null;
    }

    public StoryMediaData(Serializer serializer) {
        this((File) serializer.C(), (CameraVideoEncoderParameters) serializer.G(CameraVideoEncoderParameters.class.getClassLoader()), (StoryUploadParams) serializer.G(StoryUploadParams.class.getClassLoader()));
    }
}
