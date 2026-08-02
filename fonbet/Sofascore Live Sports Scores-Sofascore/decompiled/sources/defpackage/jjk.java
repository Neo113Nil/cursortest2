package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class jjk implements Comparable, Serializable {

    @NotNull
    public static final ijk c = new ijk(null);
    public static final jjk d = new jjk(0, 0);
    public final long a;
    public final long b;

    public jjk(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        njk njkVar = new njk();
        njkVar.a = this.a;
        njkVar.b = this.b;
        return njkVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jjk jjkVar = (jjk) obj;
        jjkVar.getClass();
        long j = jjkVar.a;
        long j2 = this.a;
        if (j2 != j) {
            d8k d8kVar = e8k.b;
            return Long.compareUnsigned(j2, j);
        }
        d8k d8kVar2 = e8k.b;
        return Long.compareUnsigned(this.b, jjkVar.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjk)) {
            return false;
        }
        jjk jjkVar = (jjk) obj;
        return this.a == jjkVar.a && this.b == jjkVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.a ^ this.b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        ljk.a(this.a, 0, 0, 4, bArr);
        bArr[8] = 45;
        ljk.a(this.a, 9, 4, 6, bArr);
        bArr[13] = 45;
        ljk.a(this.a, 14, 6, 8, bArr);
        bArr[18] = 45;
        ljk.a(this.b, 19, 0, 2, bArr);
        bArr[23] = 45;
        ljk.a(this.b, 24, 2, 8, bArr);
        return c.k(bArr);
    }
}
