package com.vk.video.ui.discovery.minimizable.related_videos;

import java.util.List;
import xsna.epx;
import xsna.mct0;
import xsna.ms9;

/* compiled from: VideoRelatedVideosVideoQueuePagingState.kt */
/* loaded from: classes7.dex */
public interface o {

    /* compiled from: VideoRelatedVideosVideoQueuePagingState.kt */
    public static final class a implements o {
        public final List<mct0> a;

        public a(List<mct0> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("VideoQueuePaging(pagingList="), this.a);
        }
    }
}
