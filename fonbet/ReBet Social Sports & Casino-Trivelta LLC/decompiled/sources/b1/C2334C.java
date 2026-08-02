package b1;

import b1.C2333B;
import e1.Z;
import java.util.Arrays;
import java.util.List;

/* renamed from: b1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2334C {

    /* renamed from: a, reason: collision with root package name */
    public final long f24293a;
    private final a[] entries;

    public C2334C(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public C2334C a(a... aVarArr) {
        return aVarArr.length == 0 ? this : new C2334C(this.f24293a, (a[]) Z.f1(this.entries, aVarArr));
    }

    public C2334C b(C2334C c2334c) {
        return c2334c == null ? this : a(c2334c.entries);
    }

    public C2334C c(long j10) {
        return this.f24293a == j10 ? this : new C2334C(j10, this.entries);
    }

    public a d(int i10) {
        return this.entries[i10];
    }

    public int e() {
        return this.entries.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2334C.class == obj.getClass()) {
            C2334C c2334c = (C2334C) obj;
            if (Arrays.equals(this.entries, c2334c.entries) && this.f24293a == c2334c.f24293a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.entries) * 31) + com.google.common.primitives.h.c(this.f24293a);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.entries));
        if (this.f24293a == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f24293a;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public C2334C(long j10, a... aVarArr) {
        this.f24293a = j10;
        this.entries = aVarArr;
    }

    public C2334C(List list) {
        this((a[]) list.toArray(new a[0]));
    }

    public C2334C(long j10, List list) {
        this(j10, (a[]) list.toArray(new a[0]));
    }

    /* renamed from: b1.C$a */
    public interface a {
        default androidx.media3.common.a a() {
            return null;
        }

        default byte[] c() {
            return null;
        }

        default void b(C2333B.b bVar) {
        }
    }
}
