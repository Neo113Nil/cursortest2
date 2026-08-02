package com.vk.story.api.domain.interactor.upload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.media.model.CameraVideoEncoderParameters;
import java.io.File;

/* loaded from: classes6.dex */
public class StoryTaskParams extends Serializer.StreamParcelableAdapter {
    public File b;
    public CameraVideoEncoderParameters c;
    public ClipsEncoderParameters d;
    public CommonUploadParams e;
    public StoryUploadParams f;
    public static int g = (int) (System.currentTimeMillis() / 1000);
    public static final Serializer.c<StoryTaskParams> CREATOR = new a();

    public class a extends Serializer.c<StoryTaskParams> {
        @Override // com.vk.core.serialize.Serializer.c
        @Nullable
        public final StoryTaskParams a(@NonNull Serializer serializer) {
            StoryTaskParams storyTaskParams = new StoryTaskParams();
            String H = serializer.H();
            if (H != null) {
                storyTaskParams.b = new File(H);
            }
            storyTaskParams.c = (CameraVideoEncoderParameters) serializer.G(CameraVideoEncoderParameters.class.getClassLoader());
            storyTaskParams.e = (CommonUploadParams) serializer.G(CommonUploadParams.class.getClassLoader());
            storyTaskParams.f = (StoryUploadParams) serializer.G(StoryUploadParams.class.getClassLoader());
            storyTaskParams.d = (ClipsEncoderParameters) serializer.A(ClipsEncoderParameters.class.getClassLoader());
            return storyTaskParams;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryTaskParams[i];
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        File file = this.b;
        if (file != null) {
            serializer.j0(file.getAbsolutePath());
        } else {
            serializer.j0(null);
        }
        serializer.i0(this.c);
        serializer.i0(this.e);
        serializer.i0(this.f);
        serializer.e0(this.d);
    }

    public final int zb() {
        int i = g + 1;
        g = i;
        return i;
    }
}
