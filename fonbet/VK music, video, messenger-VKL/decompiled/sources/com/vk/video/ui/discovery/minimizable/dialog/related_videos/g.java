package com.vk.video.ui.discovery.minimizable.dialog.related_videos;

import xsna.epx;
import xsna.xl50;

/* compiled from: VideoRelatedVideosPatch.kt */
/* loaded from: classes7.dex */
public abstract class g implements xl50 {

    /* compiled from: VideoRelatedVideosPatch.kt */
    public static final class a extends g {
        public final j b;

        public a(j jVar) {
            this.b = jVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateState(state=" + this.b + ')';
        }
    }
}
