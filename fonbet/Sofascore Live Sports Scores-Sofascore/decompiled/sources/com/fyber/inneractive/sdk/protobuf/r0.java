package com.fyber.inneractive.sdk.protobuf;

import defpackage.a70;
import defpackage.vp2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r0 implements b2 {
    public static final r0 a = new r0();

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final boolean a(Class cls) {
        return z0.class.isAssignableFrom(cls);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final r2 b(Class cls) {
        if (!z0.class.isAssignableFrom(cls)) {
            a70.p("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (r2) z0.getDefaultInstance(cls.asSubclass(z0.class)).buildMessageInfo();
        } catch (Exception e) {
            vp2.e("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
