package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import xsna.fg50;
import xsna.fpf0;
import xsna.irl;
import xsna.jgz;
import xsna.nyt0;
import xsna.qbk;
import xsna.rfc;
import xsna.vr;
import xsna.vyt0;
import xsna.wyt0;
import xsna.xyt0;
import xsna.zd2;

/* compiled from: ViewModelProvider.android.kt */
/* loaded from: classes.dex */
public final class e0 {
    public static final f b = new f();
    public final vyt0 a;

    /* compiled from: ViewModelProvider.android.kt */
    public static class a extends d {
        public static a c;
        public static final C0039a d = new C0039a();
        public final Application b;

        /* compiled from: CreationExtras.kt */
        /* renamed from: androidx.lifecycle.e0$a$a, reason: collision with other inner class name */
        public static final class C0039a implements qbk.b<Application> {
        }

        public a(Application application) {
            this.b = application;
        }

        public static nyt0 d(Class cls, Application application) {
            if (!zd2.class.isAssignableFrom(cls)) {
                return jgz.o(cls);
            }
            try {
                return (nyt0) cls.getConstructor(Application.class).newInstance(application);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(vr.b(cls, "Cannot create an instance of "), e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(vr.b(cls, "Cannot create an instance of "), e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(vr.b(cls, "Cannot create an instance of "), e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException(vr.b(cls, "Cannot create an instance of "), e4);
            }
        }

        @Override // androidx.lifecycle.e0.d, androidx.lifecycle.e0.c
        public final <T extends nyt0> T a(Class<T> cls) {
            Application application = this.b;
            if (application != null) {
                return (T) d(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.e0.d, androidx.lifecycle.e0.c
        public final nyt0 c(Class cls, fg50 fg50Var) {
            if (this.b != null) {
                return a(cls);
            }
            Application application = (Application) fg50Var.a.get(d);
            if (application != null) {
                return d(cls, application);
            }
            if (zd2.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return jgz.o(cls);
        }
    }

    /* compiled from: ViewModelProvider.android.kt */
    public static final class b {
        public static e0 a(xyt0 xyt0Var, z zVar, int i) {
            c cVar = zVar;
            if ((i & 2) != 0) {
                cVar = xyt0Var instanceof androidx.lifecycle.f ? ((androidx.lifecycle.f) xyt0Var).getDefaultViewModelProviderFactory() : irl.a;
            }
            return new e0(xyt0Var.getViewModelStore(), cVar, xyt0Var instanceof androidx.lifecycle.f ? ((androidx.lifecycle.f) xyt0Var).getDefaultViewModelCreationExtras() : qbk.a.b);
        }
    }

    /* compiled from: ViewModelProvider.android.kt */
    public interface c {
        default <T extends nyt0> T a(Class<T> cls) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }

        default nyt0 b(rfc rfcVar, fg50 fg50Var) {
            return c(rfcVar.a(), fg50Var);
        }

        default nyt0 c(Class cls, fg50 fg50Var) {
            return a(cls);
        }
    }

    /* compiled from: ViewModelProvider.android.kt */
    public static class d implements c {
        public static d a;

        @Override // androidx.lifecycle.e0.c
        public <T extends nyt0> T a(Class<T> cls) {
            return (T) jgz.o(cls);
        }

        @Override // androidx.lifecycle.e0.c
        public final nyt0 b(rfc rfcVar, fg50 fg50Var) {
            return c(rfcVar.a(), fg50Var);
        }

        @Override // androidx.lifecycle.e0.c
        public nyt0 c(Class cls, fg50 fg50Var) {
            return a(cls);
        }
    }

    /* compiled from: CreationExtras.kt */
    public static final class f implements qbk.b<String> {
    }

    public e0(wyt0 wyt0Var, c cVar, qbk qbkVar) {
        this.a = new vyt0(wyt0Var, cVar, qbkVar);
    }

    public final <T extends nyt0> T a(Class<T> cls) {
        rfc a2 = fpf0.a(cls);
        String h = a2.h();
        if (h == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) this.a.a("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(h), a2);
    }

    /* compiled from: ViewModelProvider.android.kt */
    public static class e {
        public void d(nyt0 nyt0Var) {
        }
    }
}
