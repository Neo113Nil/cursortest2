package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r implements Serializable {
    public final HashMap a;

    public r(HashMap hashMap) {
        this.a = hashMap;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new s(this.a);
    }
}
