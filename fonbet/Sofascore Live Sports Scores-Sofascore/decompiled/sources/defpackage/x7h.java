package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes3.dex */
public final class x7h {

    @NotNull
    public static final w7h Companion = new w7h();
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public /* synthetic */ x7h(int i, String str, int i2, String str2, long j) {
        if (15 != (i & 15)) {
            oea.z(i, 15, v7h.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7h)) {
            return false;
        }
        x7h x7hVar = (x7h) obj;
        return Intrinsics.c(this.a, x7hVar.a) && Intrinsics.c(this.b, x7hVar.b) && this.c == x7hVar.c && this.d == x7hVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + wv8.a(this.c, dmi.c(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", sessionStartTimestampUs=");
        return fn0.n(sb, this.d, ')');
    }

    public x7h(String str, String str2, int i, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }
}
