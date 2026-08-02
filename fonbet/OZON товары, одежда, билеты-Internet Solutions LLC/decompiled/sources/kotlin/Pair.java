package kotlin;

import K1.Q;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Pair<A, B> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final A f71688a;

    /* renamed from: b, reason: collision with root package name */
    private final B f71689b;

    public Pair(A a11, B b11) {
        this.f71688a = a11;
        this.f71689b = b11;
    }

    public static Pair d(Pair pair, Q q11) {
        A a11 = pair.f71688a;
        pair.getClass();
        return new Pair(a11, q11);
    }

    public final A a() {
        return this.f71688a;
    }

    public final B b() {
        return this.f71689b;
    }

    public final A e() {
        return this.f71688a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Intrinsics.d(this.f71688a, pair.f71688a) && Intrinsics.d(this.f71689b, pair.f71689b);
    }

    public final B f() {
        return this.f71689b;
    }

    public final int hashCode() {
        A a11 = this.f71688a;
        int hashCode = (a11 == null ? 0 : a11.hashCode()) * 31;
        B b11 = this.f71689b;
        return hashCode + (b11 != null ? b11.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "(" + this.f71688a + ", " + this.f71689b + ')';
    }
}
