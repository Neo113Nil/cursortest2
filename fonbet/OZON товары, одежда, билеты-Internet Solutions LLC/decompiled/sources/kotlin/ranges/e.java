package kotlin.ranges;

import gd.InterfaceC6712a;
import kd.C7665d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/ranges/e;", "", "", "d", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class e implements Iterable<Integer>, InterfaceC6712a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f71842a;

    /* renamed from: b, reason: collision with root package name */
    private final int f71843b;

    /* renamed from: c, reason: collision with root package name */
    private final int f71844c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/e$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.ranges.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public e(int i11, int i12, int i13) {
        if (i13 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i13 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f71842a = i11;
        this.f71843b = S8.b.b(i11, i12, i13);
        this.f71844c = i13;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.f71842a == eVar.f71842a && this.f71843b == eVar.f71843b && this.f71844c == eVar.f71844c;
    }

    /* renamed from: h, reason: from getter */
    public final int getF71842a() {
        return this.f71842a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f71842a * 31) + this.f71843b) * 31) + this.f71844c;
    }

    /* renamed from: i, reason: from getter */
    public final int getF71843b() {
        return this.f71843b;
    }

    public boolean isEmpty() {
        int i11 = this.f71844c;
        int i12 = this.f71843b;
        int i13 = this.f71842a;
        return i11 > 0 ? i13 > i12 : i13 < i12;
    }

    /* renamed from: k, reason: from getter */
    public final int getF71844c() {
        return this.f71844c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final C7665d iterator() {
        return new C7665d(this.f71842a, this.f71843b, this.f71844c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2;
        int i11 = this.f71843b;
        int i12 = this.f71842a;
        int i13 = this.f71844c;
        if (i13 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append("..");
            sb2.append(i11);
            sb2.append(" step ");
            sb2.append(i13);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append(" downTo ");
            sb2.append(i11);
            sb2.append(" step ");
            sb2.append(-i13);
        }
        return sb2.toString();
    }
}
