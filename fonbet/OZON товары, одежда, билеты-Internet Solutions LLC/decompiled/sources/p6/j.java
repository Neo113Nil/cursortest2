package p6;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f80277a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f80278b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f80279c;

    public j() {
    }

    public final void a(@NonNull Class<?> cls, @NonNull Class<?> cls2, Class<?> cls3) {
        this.f80277a = cls;
        this.f80278b = cls2;
        this.f80279c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f80277a.equals(jVar.f80277a) && this.f80278b.equals(jVar.f80278b) && l.b(this.f80279c, jVar.f80279c);
    }

    public final int hashCode() {
        int hashCode = (this.f80278b.hashCode() + (this.f80277a.hashCode() * 31)) * 31;
        Class<?> cls = this.f80279c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f80277a + ", second=" + this.f80278b + '}';
    }

    public j(@NonNull Class<?> cls, @NonNull Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
