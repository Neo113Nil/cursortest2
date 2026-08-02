package qb;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f63447a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f63448b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f63449a;

        /* renamed from: b, reason: collision with root package name */
        public Map f63450b = null;

        public b(String str) {
            this.f63449a = str;
        }

        public d a() {
            return new d(this.f63449a, this.f63450b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f63450b)));
        }

        public b b(Annotation annotation) {
            if (this.f63450b == null) {
                this.f63450b = new HashMap();
            }
            this.f63450b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static d d(String str) {
        return new d(str, Collections.EMPTY_MAP);
    }

    public String b() {
        return this.f63447a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f63448b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f63447a.equals(dVar.f63447a) && this.f63448b.equals(dVar.f63448b);
    }

    public int hashCode() {
        return (this.f63447a.hashCode() * 31) + this.f63448b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f63447a + ", properties=" + this.f63448b.values() + "}";
    }

    public d(String str, Map map) {
        this.f63447a = str;
        this.f63448b = map;
    }
}
