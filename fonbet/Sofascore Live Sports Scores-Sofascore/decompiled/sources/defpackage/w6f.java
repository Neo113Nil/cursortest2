package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class w6f implements x6f {
    public final String a;
    public final long b;

    public w6f(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6f)) {
            return false;
        }
        w6f w6fVar = (w6f) obj;
        if (!Intrinsics.c(this.a, w6fVar.a)) {
            return false;
        }
        long j = w6fVar.b;
        int i = r13.j;
        return e8k.a(this.b, j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = r13.j;
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return bf3.k("Text(text=", this.a, ", fillColor=", r13.i(this.b), ")");
    }
}
