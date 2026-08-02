package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class c implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    public static volatile c f29496k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile boolean f29497l;

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.k f29498a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f29499b;

    /* renamed from: c, reason: collision with root package name */
    public final z4.h f29500c;

    /* renamed from: d, reason: collision with root package name */
    public final e f29501d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.b f29502e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.manager.n f29503f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.manager.c f29504g;

    /* renamed from: i, reason: collision with root package name */
    public final a f29506i;

    /* renamed from: h, reason: collision with root package name */
    public final List f29505h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public g f29507j = g.NORMAL;

    public interface a {
        L4.h build();
    }

    public c(Context context, com.bumptech.glide.load.engine.k kVar, z4.h hVar, com.bumptech.glide.load.engine.bitmap_recycle.d dVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, com.bumptech.glide.manager.n nVar, com.bumptech.glide.manager.c cVar, int i10, a aVar, Map map, List list, List list2, J4.a aVar2, f fVar) {
        this.f29498a = kVar;
        this.f29499b = dVar;
        this.f29502e = bVar;
        this.f29500c = hVar;
        this.f29503f = nVar;
        this.f29504g = cVar;
        this.f29506i = aVar;
        this.f29501d = new e(context, bVar, k.d(this, list2, aVar2), new M4.g(), aVar, map, list, kVar, fVar, i10);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f29497l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f29497l = true;
        try {
            n(context, generatedAppGlideModule);
        } finally {
            f29497l = false;
        }
    }

    public static c d(Context context) {
        if (f29496k == null) {
            GeneratedAppGlideModule e10 = e(context.getApplicationContext());
            synchronized (c.class) {
                try {
                    if (f29496k == null) {
                        a(context, e10);
                    }
                } finally {
                }
            }
        }
        return f29496k;
    }

    public static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e10) {
            r(e10);
            return null;
        } catch (InstantiationException e11) {
            r(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            r(e12);
            return null;
        } catch (InvocationTargetException e13) {
            r(e13);
            return null;
        }
    }

    public static com.bumptech.glide.manager.n m(Context context) {
        com.bumptech.glide.util.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).l();
    }

    public static void n(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        o(context, new d(), generatedAppGlideModule);
    }

    public static void o(Context context, d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List list = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            list = new J4.d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set d10 = generatedAppGlideModule.d();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                J4.b bVar = (J4.b) it.next();
                if (d10.contains(bVar.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        bVar.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((J4.b) it2.next()).getClass().toString();
            }
        }
        dVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((J4.b) it3.next()).a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, dVar);
        }
        c a10 = dVar.a(applicationContext, list, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(a10);
        f29496k = a10;
    }

    public static void r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static m u(Context context) {
        return m(context).d(context);
    }

    public void b() {
        com.bumptech.glide.util.l.a();
        this.f29498a.e();
    }

    public void c() {
        com.bumptech.glide.util.l.b();
        this.f29500c.b();
        this.f29499b.b();
        this.f29502e.b();
    }

    public com.bumptech.glide.load.engine.bitmap_recycle.b f() {
        return this.f29502e;
    }

    public com.bumptech.glide.load.engine.bitmap_recycle.d g() {
        return this.f29499b;
    }

    public com.bumptech.glide.manager.c h() {
        return this.f29504g;
    }

    public Context i() {
        return this.f29501d.getBaseContext();
    }

    public e j() {
        return this.f29501d;
    }

    public j k() {
        return this.f29501d.i();
    }

    public com.bumptech.glide.manager.n l() {
        return this.f29503f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        s(i10);
    }

    public void p(m mVar) {
        synchronized (this.f29505h) {
            try {
                if (this.f29505h.contains(mVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f29505h.add(mVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean q(M4.j jVar) {
        synchronized (this.f29505h) {
            try {
                Iterator it = this.f29505h.iterator();
                while (it.hasNext()) {
                    if (((m) it.next()).D(jVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(int i10) {
        com.bumptech.glide.util.l.b();
        synchronized (this.f29505h) {
            try {
                Iterator it = this.f29505h.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f29500c.a(i10);
        this.f29499b.a(i10);
        this.f29502e.a(i10);
    }

    public void t(m mVar) {
        synchronized (this.f29505h) {
            try {
                if (!this.f29505h.contains(mVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f29505h.remove(mVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
