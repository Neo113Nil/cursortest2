package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f524a;
    public final String b;
    public final String c;

    public h(String mite, String host, String auth) {
        Intrinsics.checkNotNullParameter(mite, "mite");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(auth, "auth");
        this.f524a = mite;
        this.b = host;
        this.c = auth;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.f524a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f524a, hVar.f524a) && Intrinsics.areEqual(this.b, hVar.b) && Intrinsics.areEqual(this.c, hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f524a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DustConfigReceivedEvent(mite=" + this.f524a + ", host=" + this.b + ", auth=" + this.c + ")";
    }
}
