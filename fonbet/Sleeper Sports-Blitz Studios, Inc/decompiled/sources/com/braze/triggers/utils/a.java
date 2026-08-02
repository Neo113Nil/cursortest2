package com.braze.triggers.utils;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.enums.b f820a;
    public final String b;

    public a(com.braze.triggers.enums.b pathType, String remoteUrl) {
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        this.f820a = pathType;
        this.b = remoteUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f820a == aVar.f820a && Intrinsics.areEqual(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f820a.hashCode() * 31);
    }

    public final String toString() {
        return "RemotePath(pathType=" + this.f820a + ", remoteUrl=" + this.b + ")";
    }
}
