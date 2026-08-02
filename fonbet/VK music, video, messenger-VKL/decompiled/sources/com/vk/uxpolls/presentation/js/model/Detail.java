package com.vk.uxpolls.presentation.js.model;

import com.vk.uxpolls.presentation.js.model.VKWebAppEventData;
import xsna.epx;
import xsna.pmi0;

/* compiled from: VKWebAppEvent.kt */
/* loaded from: classes6.dex */
public final class Detail<TEvent extends VKWebAppEventData> {

    @pmi0("data")
    private final TEvent data;

    @pmi0("type")
    private final String type;

    public Detail(String str, TEvent tevent) {
        this.type = str;
        this.data = tevent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Detail)) {
            return false;
        }
        Detail detail = (Detail) obj;
        return epx.f(this.type, detail.type) && epx.f(this.data, detail.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + (this.type.hashCode() * 31);
    }

    public final String toString() {
        return "Detail(type=" + this.type + ", data=" + this.data + ')';
    }
}
