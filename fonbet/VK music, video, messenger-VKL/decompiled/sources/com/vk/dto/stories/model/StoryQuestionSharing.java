package com.vk.dto.stories.model;

import com.vk.core.serialize.Serializer;

/* compiled from: StoryQuestion.kt */
/* loaded from: classes18.dex */
public final class StoryQuestionSharing extends StoryQuestion {
    public static final StoryQuestionSharing b = new StoryQuestionSharing(null);
    public static final Serializer.c<StoryQuestionSharing> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StoryQuestionSharing> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryQuestionSharing a(Serializer serializer) {
            return StoryQuestionSharing.b;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryQuestionSharing[i];
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
    }
}
