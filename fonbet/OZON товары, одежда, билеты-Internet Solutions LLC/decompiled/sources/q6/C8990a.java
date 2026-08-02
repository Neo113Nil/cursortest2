package q6;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.List;
import x2.f;
import x2.h;

/* renamed from: q6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8990a {

    /* renamed from: a, reason: collision with root package name */
    private static final e<Object> f81724a = new C1377a();

    /* renamed from: q6.a$a, reason: collision with other inner class name */
    final class C1377a implements e<Object> {
        @Override // q6.C8990a.e
        public final void a(@NonNull Object obj) {
        }
    }

    /* renamed from: q6.a$b */
    public interface b<T> {
        T create();
    }

    /* renamed from: q6.a$c */
    private static final class c<T> implements f<T> {

        /* renamed from: a, reason: collision with root package name */
        private final b<T> f81725a;

        /* renamed from: b, reason: collision with root package name */
        private final e<T> f81726b;

        /* renamed from: c, reason: collision with root package name */
        private final h f81727c;

        c(@NonNull h hVar, @NonNull b bVar, @NonNull e eVar) {
            this.f81727c = hVar;
            this.f81725a = bVar;
            this.f81726b = eVar;
        }

        @Override // x2.f
        public final T a() {
            T t2 = (T) this.f81727c.a();
            if (t2 == null) {
                t2 = this.f81725a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + t2.getClass());
                }
            }
            if (t2 instanceof d) {
                t2.d().b(false);
            }
            return (T) t2;
        }

        @Override // x2.f
        public final boolean b(@NonNull T t2) {
            if (t2 instanceof d) {
                ((d) t2).d().b(true);
            }
            this.f81726b.a(t2);
            return this.f81727c.b(t2);
        }
    }

    /* renamed from: q6.a$d */
    public interface d {
        @NonNull
        AbstractC8993d d();
    }

    /* renamed from: q6.a$e */
    public interface e<T> {
        void a(@NonNull T t2);
    }

    @NonNull
    public static <T extends d> f<T> a(int i11, @NonNull b<T> bVar) {
        return new c(new h(i11), bVar, f81724a);
    }

    @NonNull
    public static <T> f<List<T>> b() {
        return new c(new h(20), new C8991b(), new C8992c());
    }
}
