package com.vk.video.ui.discovery.minimizable;

import com.vk.video.ui.discovery.minimizable.c;
import xsna.vu5;

/* compiled from: VideoMinimizableDiscoveryAction.kt */
/* loaded from: classes7.dex */
public final class e implements c.s0 {
    public final int b;
    public final long c;

    public e(int i, long j) {
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.b == eVar.b && this.c == eVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnCurrentPlaylistSortChanged(albumId=");
        sb.append(this.b);
        sb.append(", albumOwnerId=");
        return vu5.a(')', this.c, sb);
    }
}
