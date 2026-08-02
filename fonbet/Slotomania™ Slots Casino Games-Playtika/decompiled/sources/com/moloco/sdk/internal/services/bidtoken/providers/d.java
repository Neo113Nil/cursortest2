package com.moloco.sdk.internal.services.bidtoken.providers;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class d {
    public static final int b = 0;
    public final Long a;

    public d(Long l) {
        this.a = l;
    }

    public final Long a() {
        return this.a;
    }

    public final Long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.areEqual(this.a, ((d) obj).a);
    }

    public int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        return "AppDirInfo(appDirSize=" + this.a + ')';
    }

    public final d a(Long l) {
        return new d(l);
    }

    public static /* synthetic */ d a(d dVar, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = dVar.a;
        }
        return dVar.a(l);
    }
}
