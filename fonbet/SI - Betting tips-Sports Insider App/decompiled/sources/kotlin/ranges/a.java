package kotlin.ranges;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import of.c;
import org.jetbrains.annotations.NotNull;
import zf.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class a implements Iterable, KMappedMarker {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final zf.a f19233d = new zf.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f19234a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19235b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19236c;

    public a(int i5, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f19234a = i5;
        this.f19235b = c.a(i5, i10, i11);
        this.f19236c = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f19234a == aVar.f19234a && this.f19235b == aVar.f19235b && this.f19236c == aVar.f19236c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f19234a * 31) + this.f19235b) * 31) + this.f19236c;
    }

    public boolean isEmpty() {
        int i5 = this.f19236c;
        int i10 = this.f19235b;
        int i11 = this.f19234a;
        return i5 > 0 ? i11 > i10 : i11 < i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f19234a, this.f19235b, this.f19236c);
    }

    public String toString() {
        StringBuilder sb2;
        int i5 = this.f19235b;
        int i10 = this.f19234a;
        int i11 = this.f19236c;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i5);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i5);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}
