package com.braze.models.outgoing.event.push;

import com.braze.models.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class b {
    public static String a(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String string = ((com.braze.models.outgoing.event.b) event).b.getString("cid");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
