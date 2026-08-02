package m;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.k0;
import com.facebook.hermes.intl.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;
import m.AbstractC5484f;
import z.C6901b;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5484f {

    /* renamed from: a, reason: collision with root package name */
    public static c f55923a = new c(new d());

    /* renamed from: b, reason: collision with root package name */
    public static int f55924b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static u0.i f55925c = null;

    /* renamed from: d, reason: collision with root package name */
    public static u0.i f55926d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f55927e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f55928f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final C6901b f55929g = new C6901b();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f55930h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f55931i = new Object();

    /* renamed from: m.f$a */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* renamed from: m.f$b */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* renamed from: m.f$c */
    public static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Object f55932a = new Object();

        /* renamed from: b, reason: collision with root package name */
        public final Queue f55933b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        public final Executor f55934c;

        /* renamed from: d, reason: collision with root package name */
        public Runnable f55935d;

        public c(Executor executor) {
            this.f55934c = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }

        public void b() {
            synchronized (this.f55932a) {
                try {
                    Runnable runnable = (Runnable) this.f55933b.poll();
                    this.f55935d = runnable;
                    if (runnable != null) {
                        this.f55934c.execute(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f55932a) {
                try {
                    this.f55933b.add(new Runnable() { // from class: m.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC5484f.c.a(AbstractC5484f.c.this, runnable);
                        }
                    });
                    if (this.f55935d == null) {
                        b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: m.f$d */
    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void G(AbstractC5484f abstractC5484f) {
        synchronized (f55930h) {
            H(abstractC5484f);
        }
    }

    public static void H(AbstractC5484f abstractC5484f) {
        synchronized (f55930h) {
            try {
                Iterator it = f55929g.iterator();
                while (it.hasNext()) {
                    AbstractC5484f abstractC5484f2 = (AbstractC5484f) ((WeakReference) it.next()).get();
                    if (abstractC5484f2 == abstractC5484f || abstractC5484f2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void J(boolean z10) {
        k0.c(z10);
    }

    public static void N(int i10) {
        if ((i10 == -1 || i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) && f55924b != i10) {
            f55924b = i10;
            g();
        }
    }

    public static void T(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().e()) {
                    String b10 = androidx.core.app.e.b(context);
                    Object systemService = context.getSystemService(Constants.LOCALE);
                    if (systemService != null) {
                        b.b(systemService, a.a(b10));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static void U(final Context context) {
        if (x(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f55928f) {
                    return;
                }
                f55923a.execute(new Runnable() { // from class: m.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC5484f.c(context);
                    }
                });
                return;
            }
            synchronized (f55931i) {
                try {
                    u0.i iVar = f55925c;
                    if (iVar == null) {
                        if (f55926d == null) {
                            f55926d = u0.i.b(androidx.core.app.e.b(context));
                        }
                        if (f55926d.e()) {
                        } else {
                            f55925c = f55926d;
                        }
                    } else if (!iVar.equals(f55926d)) {
                        u0.i iVar2 = f55925c;
                        f55926d = iVar2;
                        androidx.core.app.e.a(context, iVar2.g());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        T(context);
        f55928f = true;
    }

    public static void d(AbstractC5484f abstractC5484f) {
        synchronized (f55930h) {
            H(abstractC5484f);
            f55929g.add(new WeakReference(abstractC5484f));
        }
    }

    public static void g() {
        synchronized (f55930h) {
            try {
                Iterator it = f55929g.iterator();
                while (it.hasNext()) {
                    AbstractC5484f abstractC5484f = (AbstractC5484f) ((WeakReference) it.next()).get();
                    if (abstractC5484f != null) {
                        abstractC5484f.f();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static AbstractC5484f j(Activity activity, InterfaceC5482d interfaceC5482d) {
        return new LayoutInflaterFactory2C5486h(activity, interfaceC5482d);
    }

    public static AbstractC5484f k(Dialog dialog, InterfaceC5482d interfaceC5482d) {
        return new LayoutInflaterFactory2C5486h(dialog, interfaceC5482d);
    }

    public static u0.i m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object r10 = r();
            if (r10 != null) {
                return u0.i.i(b.a(r10));
            }
        } else {
            u0.i iVar = f55925c;
            if (iVar != null) {
                return iVar;
            }
        }
        return u0.i.d();
    }

    public static int o() {
        return f55924b;
    }

    public static Object r() {
        Context n10;
        Iterator it = f55929g.iterator();
        while (it.hasNext()) {
            AbstractC5484f abstractC5484f = (AbstractC5484f) ((WeakReference) it.next()).get();
            if (abstractC5484f != null && (n10 = abstractC5484f.n()) != null) {
                return n10.getSystemService(Constants.LOCALE);
            }
        }
        return null;
    }

    public static u0.i t() {
        return f55925c;
    }

    public static boolean x(Context context) {
        if (f55927e == null) {
            try {
                Bundle bundle = u.a(context).metaData;
                if (bundle != null) {
                    f55927e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f55927e = Boolean.FALSE;
            }
        }
        return f55927e.booleanValue();
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int i10);

    public abstract void K(int i10);

    public abstract void L(View view);

    public abstract void M(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void P(Toolbar toolbar);

    public abstract void Q(int i10);

    public abstract void R(CharSequence charSequence);

    public abstract androidx.appcompat.view.b S(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract View l(int i10);

    public abstract Context n();

    public abstract InterfaceC5480b p();

    public abstract int q();

    public abstract MenuInflater s();

    public abstract AbstractC5479a u();

    public abstract void v();

    public abstract void w();

    public abstract void y(Configuration configuration);

    public abstract void z(Bundle bundle);

    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void h(Context context) {
    }
}
