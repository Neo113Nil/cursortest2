package com.vk.movika.sdk.base.model;

import xsna.epx;
import xsna.zr;

/* loaded from: classes3.dex */
public final class c {
    public final String a;

    public c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr.a("ChapterPlaybackHistoryItem(chapterId=", this.a, ")");
    }
}
