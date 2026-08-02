package com.vk.dto.attaches;

import xsna.epx;
import xsna.htx0;

/* compiled from: AttachWithId.kt */
/* loaded from: classes18.dex */
public interface AttachWithId extends Attach, htx0 {
    default boolean Ua(Attach attach) {
        return (attach instanceof AttachWithId) && getId() == ((AttachWithId) attach).getId() && epx.f(q(), attach.q()) && getClass() == attach.getClass();
    }
}
