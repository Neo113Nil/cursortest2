package com.vk.movika.sdk.base;

import xsna.epx;
import xsna.ozl;

@ozl
/* loaded from: classes3.dex */
public final class c {
    public final com.vk.movika.sdk.base.presenter.a a;

    public c(com.vk.movika.sdk.base.presenter.a aVar) {
        this.a = aVar;
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
        return "PlayerState(presenterState=" + this.a + ")";
    }
}
