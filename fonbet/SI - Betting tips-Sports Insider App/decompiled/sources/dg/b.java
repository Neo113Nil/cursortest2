package dg;

import gf.c0;
import gf.d0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import y8.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final d f8374c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final b f8375d = new b(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f8376a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8377b;

    public b(long j, long j6) {
        this.f8376a = j;
        this.f8377b = j6;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Intrinsics.checkNotNullParameter(this, "uuid");
        c cVar = new c();
        cVar.f8378a = this.f8376a;
        cVar.f8379b = this.f8377b;
        return cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b other = (b) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        long j = other.f8376a;
        long j6 = this.f8376a;
        if (j6 != j) {
            c0 c0Var = d0.f10017b;
            return Long.compare(j6 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        c0 c0Var2 = d0.f10017b;
        return Long.compare(this.f8377b ^ Long.MIN_VALUE, other.f8377b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8376a == bVar.f8376a && this.f8377b == bVar.f8377b;
    }

    public final int hashCode() {
        long j = this.f8376a ^ this.f8377b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        h8.b.m(this.f8376a, bArr, 0, 0, 4);
        bArr[8] = 45;
        h8.b.m(this.f8376a, bArr, 9, 4, 6);
        bArr[13] = 45;
        h8.b.m(this.f8376a, bArr, 14, 6, 8);
        bArr[18] = 45;
        h8.b.m(this.f8377b, bArr, 19, 0, 2);
        bArr[23] = 45;
        h8.b.m(this.f8377b, bArr, 24, 2, 8);
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }
}
