package com.moloco.sdk.internal.ilrd;

import defpackage.dmi;
import defpackage.fn0;
import defpackage.oea;
import defpackage.r5h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class i {

    @NotNull
    public static final a$c$b Companion = new a$c$b();
    public final String a;
    public final g b;
    public final boolean c;
    public final long d;

    public i(int i, String str, g gVar, boolean z, long j) {
        if (15 != (i & 15)) {
            oea.z(i, 15, h.b);
            throw null;
        }
        this.a = str;
        this.b = gVar;
        this.c = z;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.c(this.a, iVar.a) && Intrinsics.c(this.b, iVar.b) && this.c == iVar.c && this.d == iVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + dmi.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionData(sessionId=");
        sb.append(this.a);
        sb.append(", impressionCounts=");
        sb.append(this.b);
        sb.append(", isExpired=");
        sb.append(this.c);
        sb.append(", sessionStartTs=");
        return fn0.n(sb, this.d, ')');
    }

    public i(String str, g gVar, boolean z, long j) {
        str.getClass();
        gVar.getClass();
        this.a = str;
        this.b = gVar;
        this.c = z;
        this.d = j;
    }
}
