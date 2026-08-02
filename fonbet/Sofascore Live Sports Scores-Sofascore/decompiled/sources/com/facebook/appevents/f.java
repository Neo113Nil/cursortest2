package com.facebook.appevents;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        if (Intrinsics.c(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
            readClassDescriptor = ObjectStreamClass.lookup(a.class);
        } else if (Intrinsics.c(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
            readClassDescriptor = ObjectStreamClass.lookup(d.class);
        }
        readClassDescriptor.getClass();
        return readClassDescriptor;
    }
}
