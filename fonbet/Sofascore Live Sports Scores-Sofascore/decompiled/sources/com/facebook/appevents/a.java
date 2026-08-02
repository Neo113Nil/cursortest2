package com.facebook.appevents;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a implements Serializable {
    public final String a;

    public a(String str) {
        this.a = str;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new b(null, this.a);
    }
}
