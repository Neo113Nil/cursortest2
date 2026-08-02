package com.vk.profile.core.scheduled_clips;

import com.vk.dto.common.ClipVideoFile;
import xsna.epx;

/* compiled from: CommunityScheduledClipsGridSideEffect.kt */
/* loaded from: classes5.dex */
public interface g {

    /* compiled from: CommunityScheduledClipsGridSideEffect.kt */
    public static final class a implements g {
        public static final a a = new a();
    }

    /* compiled from: CommunityScheduledClipsGridSideEffect.kt */
    public static final class b implements g {
        public final ClipVideoFile a;

        public b(ClipVideoFile clipVideoFile) {
            this.a = clipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnClipClicked(clip=" + this.a + ')';
        }
    }

    /* compiled from: CommunityScheduledClipsGridSideEffect.kt */
    public static final class c implements g {
        public static final c a = new c();
    }

    /* compiled from: CommunityScheduledClipsGridSideEffect.kt */
    public static final class d implements g {
        public static final d a = new d();
    }
}
