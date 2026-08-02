package com.vk.dto.user;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: OnlineInfo.kt */
/* loaded from: classes18.dex */
public abstract class OnlineInfo extends Serializer.StreamParcelableAdapter {
    public /* synthetic */ OnlineInfo(zcl zclVar) {
        this();
    }

    public final boolean Ab() {
        VisibleStatus visibleStatus = this instanceof VisibleStatus ? (VisibleStatus) this : null;
        return (visibleStatus != null && (visibleStatus.c ^ true)) || (this instanceof InvisibleStatus);
    }

    public final boolean Bb() {
        return !Ab();
    }

    public final VisibleStatus zb() {
        if (this instanceof VisibleStatus) {
            return (VisibleStatus) this;
        }
        return null;
    }

    public OnlineInfo() {
    }
}
