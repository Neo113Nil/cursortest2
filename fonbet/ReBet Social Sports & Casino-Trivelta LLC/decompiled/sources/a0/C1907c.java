package a0;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1907c {

    /* renamed from: a, reason: collision with root package name */
    public int f14969a;

    @NotNull
    private int[] hashes;

    @NotNull
    private Object[] keyValues;

    public C1907c(int i10) {
        if (i10 == 0) {
            this.hashes = AbstractC1905a.EMPTY_INTS;
            this.keyValues = AbstractC1905a.EMPTY_OBJECTS;
        } else {
            this.hashes = new int[i10];
            this.keyValues = new Object[i10 << 1];
        }
        this.f14969a = 0;
    }

    public final boolean a(Object obj) {
        return d(obj) >= 0;
    }

    public final Object b(Object obj) {
        int d10 = d(obj);
        if (d10 >= 0) {
            return this.keyValues[(d10 << 1) + 1];
        }
        return null;
    }

    public final int c(Object key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        int i11 = this.f14969a;
        if (i11 == 0) {
            return -1;
        }
        int a10 = AbstractC1905a.a(this.hashes, i11, i10);
        if (a10 < 0 || Intrinsics.areEqual(key, this.keyValues[a10 << 1])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.hashes[i12] == i10) {
            if (Intrinsics.areEqual(key, this.keyValues[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a10 - 1; i13 >= 0 && this.hashes[i13] == i10; i13--) {
            if (Intrinsics.areEqual(key, this.keyValues[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int d(Object obj) {
        return obj == null ? e() : c(obj, obj.hashCode());
    }

    public final int e() {
        int i10 = this.f14969a;
        if (i10 == 0) {
            return -1;
        }
        int a10 = AbstractC1905a.a(this.hashes, i10, 0);
        if (a10 < 0 || this.keyValues[a10 << 1] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.hashes[i11] == 0) {
            if (this.keyValues[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.hashes[i12] == 0; i12--) {
            if (this.keyValues[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1907c) {
                C1907c c1907c = (C1907c) obj;
                int i10 = this.f14969a;
                if (i10 != c1907c.f14969a) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    Object g10 = g(i11);
                    Object h10 = h(i11);
                    Object b10 = c1907c.b(g10);
                    if (h10 == null) {
                        if (b10 != null || !c1907c.a(g10)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(h10, b10)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f14969a != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f14969a;
            for (int i13 = 0; i13 < i12; i13++) {
                Object g11 = g(i13);
                Object h11 = h(i13);
                Object obj2 = ((Map) obj).get(g11);
                if (h11 == null) {
                    if (obj2 != null || !((Map) obj).containsKey(g11)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(h11, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final boolean f() {
        return this.f14969a <= 0;
    }

    public final Object g(int i10) {
        return this.keyValues[i10 << 1];
    }

    public final Object h(int i10) {
        return this.keyValues[(i10 << 1) + 1];
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i10 = this.f14969a;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f14969a * 28);
        sb2.append('{');
        int i10 = this.f14969a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object g10 = g(i11);
            if (g10 != this) {
                sb2.append(g10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object h10 = h(i11);
            if (h10 != this) {
                sb2.append(h10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "buffer.toString()");
        return sb3;
    }

    public /* synthetic */ C1907c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
