package n8;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;

/* loaded from: classes.dex */
public final class w<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends Annotation> f76618a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f76619b;

    private @interface a {
    }

    public w(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f76618a = cls;
        this.f76619b = cls2;
    }

    @NonNull
    public static <T> w<T> a(Class<T> cls) {
        return new w<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f76619b.equals(wVar.f76619b)) {
            return this.f76618a.equals(wVar.f76618a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f76618a.hashCode() + (this.f76619b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.f76619b;
        Class<? extends Annotation> cls2 = this.f76618a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
