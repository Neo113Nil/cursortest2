package com.vk.storycamera.entity.attach;

import com.vk.core.serialize.Serializer;
import com.vk.dto.polls.Poll;
import xsna.pdq;

/* compiled from: StoryEditorPollAttach.kt */
/* loaded from: classes6.dex */
public final class StoryEditorPollAttach extends StoryEditorAttach<Poll> {
    public static final Serializer.c<StoryEditorPollAttach> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryEditorPollAttach> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryEditorPollAttach a(Serializer serializer) {
            return new StoryEditorPollAttach(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryEditorPollAttach[i];
        }
    }

    public StoryEditorPollAttach(Poll poll, StoryEditorAttachPosition storyEditorAttachPosition, boolean z) {
        super(pdq.a(poll), storyEditorAttachPosition, z);
    }

    public StoryEditorPollAttach(Serializer serializer) {
        this((Poll) serializer.G(Poll.class.getClassLoader()), (StoryEditorAttachPosition) serializer.G(StoryEditorAttachPosition.class.getClassLoader()), serializer.m());
    }
}
