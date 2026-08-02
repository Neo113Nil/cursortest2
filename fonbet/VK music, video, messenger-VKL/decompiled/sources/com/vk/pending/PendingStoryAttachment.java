package com.vk.pending;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.dto.stories.model.CommonUploadParams;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.story.api.media.StoryMediaData;

/* loaded from: classes4.dex */
public class PendingStoryAttachment extends Attachment {
    public static final Serializer.c<PendingStoryAttachment> CREATOR = new a();
    public final StoryMediaData f;
    public final StoryUploadParams g;
    public final CommonUploadParams h;

    public class a extends Serializer.c<PendingStoryAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PendingStoryAttachment a(@NonNull Serializer serializer) {
            return new PendingStoryAttachment(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PendingStoryAttachment[i];
        }
    }

    public PendingStoryAttachment(StoryMediaData storyMediaData, CommonUploadParams commonUploadParams, StoryUploadParams storyUploadParams) {
        this.f = storyMediaData;
        this.h = commonUploadParams;
        this.g = storyUploadParams;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.i0(this.f);
        serializer.i0(this.h);
        serializer.i0(this.g);
    }

    public PendingStoryAttachment(Serializer serializer) {
        this.f = (StoryMediaData) serializer.G(StoryMediaData.class.getClassLoader());
        this.h = (CommonUploadParams) serializer.G(CommonUploadParams.class.getClassLoader());
        this.g = (StoryUploadParams) serializer.G(StoryUploadParams.class.getClassLoader());
    }
}
