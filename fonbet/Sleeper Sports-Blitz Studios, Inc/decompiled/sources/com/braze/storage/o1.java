package com.braze.storage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class o1 {
    public static String a(com.braze.models.k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i = com.braze.models.outgoing.event.push.c.i;
        String a2 = com.braze.models.outgoing.event.push.b.a(event);
        return ((com.braze.models.outgoing.event.b) event).d() + a2;
    }
}
