package com.vk.uxpolls.presentation.js.model;

import com.vk.uxpolls.presentation.js.model.VKWebAppEventData;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VKWebAppEvent.kt */
/* loaded from: classes6.dex */
public final class VKWebAppEvent<TEvent extends VKWebAppEventData> {

    @pmi0("detail")
    private final Detail<TEvent> detail;

    public VKWebAppEvent(Detail<TEvent> detail) {
        this.detail = detail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VKWebAppEvent) && epx.f(this.detail, ((VKWebAppEvent) obj).detail);
    }

    public final int hashCode() {
        return this.detail.hashCode();
    }

    public final String toString() {
        return "VKWebAppEvent(detail=" + this.detail + ')';
    }
}
