package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import i6.p;
import j6.AbstractC7287a;
import j6.C7290d;
import j6.InterfaceC7288b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements ComponentCallbacks2 {

    /* renamed from: i, reason: collision with root package name */
    private static volatile c f57542i;

    /* renamed from: j, reason: collision with root package name */
    private static volatile boolean f57543j;

    /* renamed from: a, reason: collision with root package name */
    private final W5.d f57544a;

    /* renamed from: b, reason: collision with root package name */
    private final X5.h f57545b;

    /* renamed from: c, reason: collision with root package name */
    private final f f57546c;

    /* renamed from: d, reason: collision with root package name */
    private final W5.i f57547d;

    /* renamed from: e, reason: collision with root package name */
    private final p f57548e;

    /* renamed from: f, reason: collision with root package name */
    private final i6.e f57549f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f57550g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private h f57551h = h.NORMAL;

    public interface a {
        @NonNull
        l6.i build();
    }

    c(@NonNull Context context, @NonNull V5.l lVar, @NonNull X5.h hVar, @NonNull W5.d dVar, @NonNull W5.i iVar, @NonNull p pVar, @NonNull i6.e eVar, int i11, @NonNull a aVar, @NonNull C5132a c5132a, @NonNull List list, @NonNull List list2, AbstractC7287a abstractC7287a, @NonNull g gVar) {
        this.f57544a = dVar;
        this.f57547d = iVar;
        this.f57545b = hVar;
        this.f57548e = pVar;
        this.f57549f = eVar;
        this.f57546c = new f(context, iVar, new k(this, list2, abstractC7287a), new S1.p(), aVar, c5132a, list, lVar, gVar, i11);
    }

    @NonNull
    public static c a(@NonNull Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f57542i == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (InstantiationException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (NoSuchMethodException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            } catch (InvocationTargetException e14) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e14);
            }
            synchronized (c.class) {
                if (f57542i == null) {
                    if (f57543j) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f57543j = true;
                    try {
                        h(context, generatedAppGlideModule);
                        f57543j = false;
                    } catch (Throwable th2) {
                        f57543j = false;
                        throw th2;
                    }
                }
            }
        }
        return f57542i;
    }

    private static void h(@NonNull Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        d dVar = new d();
        Context applicationContext = context.getApplicationContext();
        List<InterfaceC7288b> list = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.isManifestParsingEnabled()) {
            list = new C7290d(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.a().isEmpty()) {
            Set<Class<?>> a11 = generatedAppGlideModule.a();
            Iterator<InterfaceC7288b> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC7288b next = it.next();
                if (a11.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<InterfaceC7288b> it2 = list.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        dVar.f(generatedAppGlideModule != null ? generatedAppGlideModule.b() : null);
        Iterator<InterfaceC7288b> it3 = list.iterator();
        while (it3.hasNext()) {
            it3.next().getClass();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.applyOptions(applicationContext, dVar);
        }
        c a12 = dVar.a(applicationContext, list, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(a12);
        f57542i = a12;
    }

    @NonNull
    public static n m(@NonNull E30.c cVar) {
        Context context = cVar.getContext();
        p6.k.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f57548e.e(cVar);
    }

    @NonNull
    public static n n(@NonNull Context context) {
        p6.k.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f57548e.c(context);
    }

    @NonNull
    public static n o(@NonNull View view) {
        Context context = view.getContext();
        p6.k.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).f57548e.d(view);
    }

    @NonNull
    public final W5.b b() {
        return this.f57547d;
    }

    @NonNull
    public final W5.d c() {
        return this.f57544a;
    }

    final i6.c d() {
        return this.f57549f;
    }

    @NonNull
    public final Context e() {
        return this.f57546c.getBaseContext();
    }

    @NonNull
    final f f() {
        return this.f57546c;
    }

    @NonNull
    public final j g() {
        return this.f57546c.i();
    }

    final void i(n nVar) {
        synchronized (this.f57550g) {
            try {
                if (this.f57550g.contains(nVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f57550g.add(nVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean j(@NonNull m6.h<?> hVar) {
        synchronized (this.f57550g) {
            try {
                Iterator it = this.f57550g.iterator();
                while (it.hasNext()) {
                    if (((n) it.next()).untrack(hVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public final h k(@NonNull h hVar) {
        p6.l.a();
        this.f57545b.h(hVar.a());
        this.f57544a.b(hVar.a());
        h hVar2 = this.f57551h;
        this.f57551h = hVar;
        return hVar2;
    }

    final void l(n nVar) {
        synchronized (this.f57550g) {
            try {
                if (!this.f57550g.contains(nVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f57550g.remove(nVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        p6.l.a();
        this.f57545b.a();
        this.f57544a.e();
        this.f57547d.d();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i11) {
        p6.l.a();
        synchronized (this.f57550g) {
            try {
                Iterator it = this.f57550g.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).onTrimMemory(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f57545b.k(i11);
        this.f57544a.a(i11);
        this.f57547d.j(i11);
    }
}
