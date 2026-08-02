package com.fyber.inneractive.sdk.metrics;

import java.util.UUID;

/* loaded from: classes12.dex */
public final class h {
    public final String a = UUID.randomUUID().toString();
    public final String b;

    public h(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
