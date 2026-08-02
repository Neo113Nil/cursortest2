package com.vk.im.engine.reporters.syncstate;

import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import xsna.vu5;

/* compiled from: StatPostponeEngine.kt */
/* loaded from: classes2.dex */
public final class e {
    public final ImSyncStateStatReporter.State a;
    public final long b;

    public e(ImSyncStateStatReporter.State state, long j) {
        this.a = state;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timing(state=");
        sb.append(this.a);
        sb.append(", timestamp=");
        return vu5.a(')', this.b, sb);
    }
}
