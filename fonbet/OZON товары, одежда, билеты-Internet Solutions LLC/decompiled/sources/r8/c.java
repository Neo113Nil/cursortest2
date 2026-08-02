package r8;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f83203a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Object> f83204b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f83205a;

        /* renamed from: b, reason: collision with root package name */
        private HashMap f83206b = null;

        a(String str) {
            this.f83205a = str;
        }

        @NonNull
        public final c a() {
            return new c(this.f83205a, 0, this.f83206b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f83206b)));
        }

        @NonNull
        public final void b(@NonNull Annotation annotation) {
            if (this.f83206b == null) {
                this.f83206b = new HashMap();
            }
            this.f83206b.put(annotation.annotationType(), annotation);
        }
    }

    /* synthetic */ c(String str, int i11, Map map) {
        this(str, map);
    }

    @NonNull
    public static a a(@NonNull String str) {
        return new a(str);
    }

    @NonNull
    public static c d(@NonNull String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    @NonNull
    public final String b() {
        return this.f83203a;
    }

    public final <T extends Annotation> T c(@NonNull Class<T> cls) {
        return (T) this.f83204b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f83203a.equals(cVar.f83203a) && this.f83204b.equals(cVar.f83204b);
    }

    public final int hashCode() {
        return this.f83204b.hashCode() + (this.f83203a.hashCode() * 31);
    }

    @NonNull
    public final String toString() {
        return "FieldDescriptor{name=" + this.f83203a + ", properties=" + this.f83204b.values() + "}";
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f83203a = str;
        this.f83204b = map;
    }
}
