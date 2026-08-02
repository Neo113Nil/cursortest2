package j3;

import j3.s;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final a[] f69333a;

    /* renamed from: b, reason: collision with root package name */
    public final long f69334b;

    public interface a {
        default void a(s.a aVar) {
        }

        default byte[] b() {
            return null;
        }

        default C7272n c() {
            return null;
        }
    }

    public t() {
        throw null;
    }

    public t(a... aVarArr) {
        this(-9223372036854775807L, aVarArr);
    }

    public final t a(a... aVarArr) {
        if (aVarArr.length == 0) {
            return this;
        }
        int i11 = m3.N.f74289a;
        a[] aVarArr2 = this.f69333a;
        Object[] copyOf = Arrays.copyOf(aVarArr2, aVarArr2.length + aVarArr.length);
        System.arraycopy(aVarArr, 0, copyOf, aVarArr2.length, aVarArr.length);
        return new t(this.f69334b, (a[]) copyOf);
    }

    public final t b(t tVar) {
        return tVar == null ? this : a(tVar.f69333a);
    }

    public final t c(long j11) {
        return this.f69334b == j11 ? this : new t(j11, this.f69333a);
    }

    public final a d(int i11) {
        return this.f69333a[i11];
    }

    public final int e() {
        return this.f69333a.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (Arrays.equals(this.f69333a, tVar.f69333a) && this.f69334b == tVar.f69334b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.common.primitives.d.b(this.f69334b) + (Arrays.hashCode(this.f69333a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("entries=");
        sb2.append(Arrays.toString(this.f69333a));
        long j11 = this.f69334b;
        if (j11 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j11;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public t(long j11, a... aVarArr) {
        this.f69334b = j11;
        this.f69333a = aVarArr;
    }

    public t(List<? extends a> list) {
        this((a[]) list.toArray(new a[0]));
    }
}
