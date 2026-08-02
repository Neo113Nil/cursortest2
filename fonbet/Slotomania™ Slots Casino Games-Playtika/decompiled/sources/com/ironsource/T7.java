package com.ironsource;

/* loaded from: classes3.dex */
public final class T7 {
    private final int a;
    private final int b;

    public T7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T7)) {
            return false;
        }
        T7 t7 = (T7) obj;
        return this.a == t7.a && this.b == t7.b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "ISContainerParams(width=" + this.a + ", height=" + this.b + ")";
    }

    public final T7 a(int i, int i2) {
        return new T7(i, i2);
    }

    public static /* synthetic */ T7 a(T7 t7, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = t7.a;
        }
        if ((i3 & 2) != 0) {
            i2 = t7.b;
        }
        return t7.a(i, i2);
    }
}
