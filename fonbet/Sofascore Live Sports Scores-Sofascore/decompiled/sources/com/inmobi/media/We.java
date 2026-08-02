package com.inmobi.media;

import defpackage.dmi;
import defpackage.fn0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class We {
    public final long a;
    public final Map b;
    public final int c;
    public final String d;

    public We(long j, Map map, int i, String str) {
        map.getClass();
        this.a = j;
        this.b = map;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof We)) {
            return false;
        }
        We we = (We) obj;
        return this.a == we.a && Intrinsics.c(this.b, we.b) && this.c == we.c && Intrinsics.c(this.d, we.d);
    }

    public final int hashCode() {
        int a = Ai.a(this.c, dmi.g(this.b, Long.hashCode(this.a) * 31, 31), 31);
        String str = this.d;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        long j = this.a;
        Map map = this.b;
        int i = this.c;
        String str = this.d;
        StringBuilder sb = new StringBuilder("NetworkMetaData(timeTaken=");
        sb.append(j);
        sb.append(", headers=");
        sb.append(map);
        fn0.s(i, ", contentLength=", ", contentType=", str, sb);
        sb.append(")");
        return sb.toString();
    }
}
