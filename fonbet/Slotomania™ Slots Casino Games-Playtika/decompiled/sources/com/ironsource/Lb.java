package com.ironsource;

import android.os.Debug;

/* loaded from: classes3.dex */
public final class Lb {
    private final int a;
    private final int b;
    private final int c;

    public interface a {

        /* renamed from: com.ironsource.Lb$a$a, reason: collision with other inner class name */
        public static final class C0178a implements a {
            @Override // com.ironsource.Lb.a
            public Lb get() {
                Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                int i = memoryInfo.dalvikPss;
                int i2 = memoryInfo.nativePss;
                return new Lb(i, i2, Math.max(0, (memoryInfo.getTotalPss() - i2) - i));
            }
        }

        Lb get();
    }

    public Lb(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lb)) {
            return false;
        }
        Lb lb = (Lb) obj;
        return this.a == lb.a && this.b == lb.b && this.c == lb.c;
    }

    public final int f() {
        return this.c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c);
    }

    public String toString() {
        return "MemoryInfo(javaHeapKb=" + this.a + ", nativeHeapKb=" + this.b + ", sharedOtherKb=" + this.c + ")";
    }

    public final Lb a(int i, int i2, int i3) {
        return new Lb(i, i2, i3);
    }

    public static /* synthetic */ Lb a(Lb lb, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = lb.a;
        }
        if ((i4 & 2) != 0) {
            i2 = lb.b;
        }
        if ((i4 & 4) != 0) {
            i3 = lb.c;
        }
        return lb.a(i, i2, i3);
    }
}
