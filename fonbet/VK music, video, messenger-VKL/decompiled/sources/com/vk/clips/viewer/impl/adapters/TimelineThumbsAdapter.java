package com.vk.clips.viewer.impl.adapters;

import com.vk.clips.sdk.shared.api.deps.SdkTimelineThumbs;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.TimelineThumbs;

/* compiled from: TimelineThumbsAdapter.kt */
/* loaded from: classes17.dex */
public final class TimelineThumbsAdapter extends SdkTimelineThumbs {
    public static final Serializer.c<TimelineThumbsAdapter> CREATOR = new a();
    public final TimelineThumbs b;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<TimelineThumbsAdapter> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TimelineThumbsAdapter a(Serializer serializer) {
            return new TimelineThumbsAdapter(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TimelineThumbsAdapter[i];
        }
    }

    public TimelineThumbsAdapter(TimelineThumbs timelineThumbs) {
        this.b = timelineThumbs;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
    }

    public TimelineThumbsAdapter(Serializer serializer) {
        this((TimelineThumbs) serializer.G(TimelineThumbs.class.getClassLoader()));
    }
}
