package com.vk.movika.sdk.base.model;

import xsna.epx;

/* loaded from: classes3.dex */
public final class i {
    public final h a;
    public final boolean b;

    public i(h hVar, boolean z) {
        this.a = hVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return epx.f(this.a, iVar.a) && this.b == iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "EpisodeInfo(episode=" + this.a + ", isCompleted=" + this.b + ")";
    }
}
