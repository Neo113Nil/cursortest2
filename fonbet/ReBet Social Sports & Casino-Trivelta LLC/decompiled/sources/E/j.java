package E;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final a f2914c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f2915d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final j f2916e = new j(0, 0, new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public int f2917a;

    /* renamed from: b, reason: collision with root package name */
    public int f2918b;

    @NotNull
    private Object[] buffer;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.f2916e;
        }

        public a() {
        }
    }

    public j(int i10, int i11, Object[] objArr, F.b bVar) {
        this.f2917a = i10;
        this.f2918b = i11;
        this.buffer = objArr;
    }

    public final boolean b(Object obj) {
        IntProgression step = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(obj, this.buffer[first])) {
                if (first != last) {
                    first += step2;
                }
            }
            return true;
        }
        return false;
    }

    public final Object c(Object obj) {
        IntProgression step = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return null;
        }
        while (!Intrinsics.areEqual(obj, k(first))) {
            if (first == last) {
                return null;
            }
            first += step2;
        }
        return n(first);
    }

    public final boolean d(int i10, Object obj, int i11) {
        int a10 = 1 << n.a(i10, i11);
        if (i(a10)) {
            return Intrinsics.areEqual(obj, k(f(a10)));
        }
        if (!j(a10)) {
            return false;
        }
        j l10 = l(m(a10));
        return i11 == 30 ? l10.b(obj) : l10.d(i10, obj, i11 + 5);
    }

    public final int e() {
        return Integer.bitCount(this.f2917a);
    }

    public final int f(int i10) {
        return Integer.bitCount((i10 - 1) & this.f2917a) * 2;
    }

    public final Object g(int i10, Object obj, int i11) {
        int a10 = 1 << n.a(i10, i11);
        if (i(a10)) {
            int f10 = f(a10);
            if (Intrinsics.areEqual(obj, k(f10))) {
                return n(f10);
            }
            return null;
        }
        if (!j(a10)) {
            return null;
        }
        j l10 = l(m(a10));
        return i11 == 30 ? l10.c(obj) : l10.g(i10, obj, i11 + 5);
    }

    public final Object[] h() {
        return this.buffer;
    }

    public final boolean i(int i10) {
        return (i10 & this.f2917a) != 0;
    }

    public final boolean j(int i10) {
        return (i10 & this.f2918b) != 0;
    }

    public final Object k(int i10) {
        return this.buffer[i10];
    }

    public final j l(int i10) {
        Object obj = this.buffer[i10];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (j) obj;
    }

    public final int m(int i10) {
        return (this.buffer.length - 1) - Integer.bitCount((i10 - 1) & this.f2918b);
    }

    public final Object n(int i10) {
        return this.buffer[i10 + 1];
    }

    public j(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
    }
}
