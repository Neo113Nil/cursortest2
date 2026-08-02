package com.braze.events.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f536a;

    public v(ArrayList logs) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.f536a = logs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.areEqual(this.f536a, ((v) obj).f536a);
    }

    public final int hashCode() {
        return this.f536a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerSendLogEvent(logs=" + this.f536a + ")";
    }
}
