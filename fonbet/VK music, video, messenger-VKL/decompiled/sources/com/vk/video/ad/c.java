package com.vk.video.ad;

import com.vk.video.ad.data.VideoAdInfo;
import xsna.epx;
import xsna.xl50;

/* compiled from: VideoAdContract.kt */
/* loaded from: classes5.dex */
public abstract class c implements xl50 {

    /* compiled from: VideoAdContract.kt */
    public static final class a extends c {
        public final VideoAdInfo b;

        public a(VideoAdInfo videoAdInfo) {
            this.b = videoAdInfo;
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
            return "Init(videoAdInfo=" + this.b + ')';
        }
    }
}
