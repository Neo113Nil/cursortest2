package com.moloco.sdk.acm.db;

import defpackage.dmi;
import defpackage.fc6;
import defpackage.ljg;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b {
    public final long a;
    public final String b;
    public final long c;
    public final c d;
    public final Long e;
    public final List f;

    public b(long j, String str, long j2, c cVar, Long l, List list) {
        str.getClass();
        cVar.getClass();
        list.getClass();
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = cVar;
        this.e = l;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && Intrinsics.c(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && Intrinsics.c(this.e, bVar.e) && Intrinsics.c(this.f, bVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ljg.c(dmi.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31;
        Long l = this.e;
        return this.f.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventEntity(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", timestamp=");
        sb.append(this.c);
        sb.append(", eventType=");
        sb.append(this.d);
        sb.append(", data=");
        sb.append(this.e);
        sb.append(", tags=");
        return fc6.p(sb, this.f, ')');
    }
}
