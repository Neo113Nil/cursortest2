package com.vk.video.ui.discovery.minimizable;

import com.vk.dto.video.VideoAlbum;
import com.vk.video.ui.discovery.minimizable.c;
import xsna.epx;

/* compiled from: VideoMinimizableDiscoveryAction.kt */
/* loaded from: classes7.dex */
public final class f implements c.s0 {
    public final VideoAlbum b;

    public f(VideoAlbum videoAlbum) {
        this.b = videoAlbum;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OnPlayListUpdated(playlist=" + this.b + ')';
    }
}
