package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.models.response.m f537a;

    public w(com.braze.models.response.m serverConfig) {
        Intrinsics.checkNotNullParameter(serverConfig, "serverConfig");
        this.f537a = serverConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.areEqual(this.f537a, ((w) obj).f537a);
    }

    public final int hashCode() {
        return this.f537a.hashCode();
    }

    public final String toString() {
        return "ServerConfigReceivedEvent(serverConfig=" + this.f537a + ")";
    }
}
