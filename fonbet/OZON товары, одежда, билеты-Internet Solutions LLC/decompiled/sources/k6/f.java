package k6;

import Ra.h;
import S5.k;
import T5.l;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f70929a = new ArrayList();

    private static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<T> f70930a;

        /* renamed from: b, reason: collision with root package name */
        final l<T> f70931b;

        a(@NonNull Class<T> cls, @NonNull l<T> lVar) {
            this.f70930a = cls;
            this.f70931b = lVar;
        }

        final boolean a(@NonNull Class<?> cls) {
            return this.f70930a.isAssignableFrom(cls);
        }
    }

    public final synchronized <Z> void a(@NonNull Class<Z> cls, @NonNull l<Z> lVar) {
        this.f70929a.add(new a(cls, lVar));
    }

    public final synchronized <Z> l<Z> b(@NonNull Class<Z> cls) {
        int size = this.f70929a.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) this.f70929a.get(i11);
            if (aVar.a(cls)) {
                return (l<Z>) aVar.f70931b;
            }
        }
        return null;
    }

    public final synchronized void c(@NonNull h hVar) {
        this.f70929a.add(0, new a(k.class, hVar));
    }
}
