package androidx.lifecycle;

import X0.a;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public class U {

    /* renamed from: b, reason: collision with root package name */
    public static final b f20355b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final a.c f20356c;

    /* renamed from: a, reason: collision with root package name */
    public final X0.d f20357a;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ U c(b bVar, W w10, c cVar, X0.a aVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                cVar = Y0.g.f13899a.b(w10);
            }
            if ((i10 & 4) != 0) {
                aVar = Y0.g.f13899a.a(w10);
            }
            return bVar.b(w10, cVar, aVar);
        }

        public final U a(V store, c factory, X0.a extras) {
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new U(store, factory, extras);
        }

        public final U b(W owner, c factory, X0.a extras) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new U(owner.getViewModelStore(), factory, extras);
        }

        public b() {
        }
    }

    public interface c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f20362c = a.f20363a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f20363a = new a();
        }

        default Q create(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return Y0.g.f13899a.d();
        }

        default Q create(Class modelClass, X0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return create(modelClass);
        }

        default Q create(KClass modelClass, X0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return create(JvmClassMappingKt.getJavaClass(modelClass), extras);
        }
    }

    public static class d implements c {

        /* renamed from: b, reason: collision with root package name */
        public static d f20365b;

        /* renamed from: a, reason: collision with root package name */
        public static final a f20364a = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final a.c f20366d = U.f20356c;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a() {
                if (d.f20365b == null) {
                    d.f20365b = new d();
                }
                d dVar = d.f20365b;
                Intrinsics.checkNotNull(dVar);
                return dVar;
            }

            public a() {
            }
        }

        @Override // androidx.lifecycle.U.c
        public Q create(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return Y0.d.f13894a.a(modelClass);
        }

        @Override // androidx.lifecycle.U.c
        public Q create(Class modelClass, X0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return create(modelClass);
        }

        @Override // androidx.lifecycle.U.c
        public Q create(KClass modelClass, X0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return create(JvmClassMappingKt.getJavaClass(modelClass), extras);
        }
    }

    public static class e {
        public abstract void a(Q q10);
    }

    public static final class f implements a.c {
    }

    static {
        a.C0276a c0276a = X0.a.f13373b;
        f20356c = new f();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U(V store, c factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public Q a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return c(JvmClassMappingKt.getKotlinClass(modelClass));
    }

    public final Q b(String key, KClass modelClass) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return this.f20357a.d(modelClass, key);
    }

    public final Q c(KClass modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return X0.d.e(this.f20357a, modelClass, null, 2, null);
    }

    public static class a extends d {

        /* renamed from: f, reason: collision with root package name */
        public static final C0382a f20358f = new C0382a(null);

        /* renamed from: g, reason: collision with root package name */
        public static a f20359g;

        /* renamed from: h, reason: collision with root package name */
        public static final a.c f20360h;

        /* renamed from: e, reason: collision with root package name */
        public final Application f20361e;

        /* renamed from: androidx.lifecycle.U$a$a, reason: collision with other inner class name */
        public static final class C0382a {
            public /* synthetic */ C0382a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.f20359g == null) {
                    a.f20359g = new a(application);
                }
                a aVar = a.f20359g;
                Intrinsics.checkNotNull(aVar);
                return aVar;
            }

            public C0382a() {
            }
        }

        public static final class b implements a.c {
        }

        static {
            a.C0276a c0276a = X0.a.f13373b;
            f20360h = new b();
        }

        public a(Application application, int i10) {
            this.f20361e = application;
        }

        @Override // androidx.lifecycle.U.d, androidx.lifecycle.U.c
        public Q create(Class modelClass, X0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f20361e != null) {
                return create(modelClass);
            }
            Application application = (Application) extras.a(f20360h);
            if (application != null) {
                return e(modelClass, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return super.create(modelClass);
        }

        public final Q e(Class cls, Application application) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                Q q10 = (Q) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNull(q10);
                return q10;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }

        @Override // androidx.lifecycle.U.d, androidx.lifecycle.U.c
        public Q create(Class modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f20361e;
            if (application != null) {
                return e(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public U(X0.d dVar) {
        this.f20357a = dVar;
    }

    public /* synthetic */ U(V v10, c cVar, X0.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(v10, cVar, (i10 & 4) != 0 ? a.b.f13375c : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U(V store, c factory, X0.a defaultCreationExtras) {
        this(new X0.d(store, factory, defaultCreationExtras));
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public U(W owner) {
        this(r0, r1.b(owner), r1.a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        V viewModelStore = owner.getViewModelStore();
        Y0.g gVar = Y0.g.f13899a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U(W owner, c factory) {
        this(owner.getViewModelStore(), factory, Y0.g.f13899a.a(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
