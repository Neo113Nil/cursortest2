package com.bumptech.glide;

import V5.t;
import V5.v;
import Z5.p;
import Z5.q;
import Z5.r;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import h6.C6818f;
import h6.InterfaceC6817e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k6.C7595a;
import q6.C8990a;
import ru.ozon.app.android.pikazon.glide.loaders.ResizeUrlLoader;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final r f57599a;

    /* renamed from: b, reason: collision with root package name */
    private final C7595a f57600b;

    /* renamed from: c, reason: collision with root package name */
    private final k6.e f57601c;

    /* renamed from: d, reason: collision with root package name */
    private final k6.f f57602d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f57603e;

    /* renamed from: f, reason: collision with root package name */
    private final C6818f f57604f;

    /* renamed from: g, reason: collision with root package name */
    private final k6.b f57605g;

    /* renamed from: h, reason: collision with root package name */
    private final k6.d f57606h = new k6.d();

    /* renamed from: i, reason: collision with root package name */
    private final k6.c f57607i = new k6.c();

    /* renamed from: j, reason: collision with root package name */
    private final x2.f<List<Throwable>> f57608j;

    /* loaded from: classes8.dex */
    public static class a extends RuntimeException {
    }

    /* loaded from: classes8.dex */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes8.dex */
    public static class d extends a {
        public d(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes8.dex */
    public static class e extends a {
        public e(@NonNull Class<?> cls) {
            super(U7.m.a(cls, "Failed to find source encoder for data class: "));
        }
    }

    public j() {
        x2.f<List<Throwable>> b11 = C8990a.b();
        this.f57608j = b11;
        this.f57599a = new r(b11);
        this.f57600b = new C7595a();
        this.f57601c = new k6.e();
        this.f57602d = new k6.f();
        this.f57603e = new com.bumptech.glide.load.data.f();
        this.f57604f = new C6818f();
        this.f57605g = new k6.b();
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f57601c.f(arrayList);
    }

    @NonNull
    public final void a(@NonNull T5.k kVar, @NonNull Class cls, @NonNull Class cls2, @NonNull String str) {
        this.f57601c.a(kVar, cls, cls2, str);
    }

    @NonNull
    public final void b(@NonNull Class cls, @NonNull T5.d dVar) {
        this.f57600b.a(cls, dVar);
    }

    @NonNull
    public final void c(@NonNull Class cls, @NonNull T5.l lVar) {
        this.f57602d.a(cls, lVar);
    }

    @NonNull
    public final void d(@NonNull Class cls, @NonNull Class cls2, @NonNull q qVar) {
        this.f57599a.a(cls, cls2, qVar);
    }

    @NonNull
    public final ArrayList e() {
        ArrayList b11 = this.f57605g.b();
        if (b11.isEmpty()) {
            throw new b();
        }
        return b11;
    }

    public final <Data, TResource, Transcode> t<Data, TResource, Transcode> f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        x2.f<List<Throwable>> fVar;
        Class<Data> cls4;
        Class<TResource> cls5;
        Class<Transcode> cls6;
        Class<Data> cls7 = cls;
        k6.c cVar = this.f57607i;
        t<Data, TResource, Transcode> a11 = cVar.a(cls7, cls2, cls3);
        t<Data, TResource, Transcode> tVar = null;
        if (k6.c.b(a11)) {
            return null;
        }
        if (a11 != null) {
            return a11;
        }
        ArrayList arrayList = new ArrayList();
        k6.e eVar = this.f57601c;
        Iterator it = eVar.d(cls7, cls2).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = this.f57608j;
            if (!hasNext) {
                break;
            }
            Class cls8 = (Class) it.next();
            C6818f c6818f = this.f57604f;
            Iterator it2 = c6818f.b(cls8, cls3).iterator();
            while (it2.hasNext()) {
                Class cls9 = (Class) it2.next();
                x2.f<List<Throwable>> fVar2 = fVar;
                arrayList.add(new V5.j(cls7, cls8, cls9, eVar.b(cls7, cls8), c6818f.a(cls8, cls9), fVar2));
                cls7 = cls;
                fVar = fVar2;
            }
            cls7 = cls;
        }
        if (arrayList.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            tVar = new t<>(cls4, cls5, cls6, arrayList, fVar);
        }
        cVar.c(cls4, cls5, cls6, tVar);
        return tVar;
    }

    @NonNull
    public final <Model> List<p<Model, ?>> g(@NonNull Model model) {
        return this.f57599a.c(model);
    }

    @NonNull
    public final <Model, TResource, Transcode> List<Class<?>> h(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        k6.d dVar = this.f57606h;
        List<Class<?>> a11 = dVar.a(cls, cls2, cls3);
        List<Class<?>> list = a11;
        if (a11 == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f57599a.b(cls).iterator();
            while (it.hasNext()) {
                Iterator it2 = this.f57601c.d((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!this.f57604f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            dVar.b(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list = arrayList;
        }
        return list;
    }

    @NonNull
    public final <X> T5.l<X> i(@NonNull v<X> vVar) throws d {
        T5.l<X> b11 = this.f57602d.b(vVar.b());
        if (b11 != null) {
            return b11;
        }
        throw new d(vVar.b());
    }

    @NonNull
    public final <X> com.bumptech.glide.load.data.e<X> j(@NonNull X x11) {
        return this.f57603e.a(x11);
    }

    @NonNull
    public final <X> T5.d<X> k(@NonNull X x11) throws e {
        T5.d<X> b11 = this.f57600b.b(x11.getClass());
        if (b11 != null) {
            return b11;
        }
        throw new e(x11.getClass());
    }

    public final boolean l(@NonNull v<?> vVar) {
        return this.f57602d.b(vVar.b()) != null;
    }

    @NonNull
    public final void m(@NonNull Ra.h hVar) {
        this.f57602d.c(hVar);
    }

    @NonNull
    public final void n(@NonNull T5.k kVar, @NonNull Class cls, @NonNull Class cls2, @NonNull String str) {
        this.f57601c.e(kVar, cls, cls2, str);
    }

    @NonNull
    public final void o(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f57605g.a(imageHeaderParser);
    }

    @NonNull
    public final void p(@NonNull e.a aVar) {
        this.f57603e.b(aVar);
    }

    @NonNull
    public final void q(@NonNull Class cls, @NonNull Class cls2, @NonNull InterfaceC6817e interfaceC6817e) {
        this.f57604f.c(cls, cls2, interfaceC6817e);
    }

    @NonNull
    public final void r(@NonNull ResizeUrlLoader.Factory factory) {
        this.f57599a.d(factory);
    }

    /* loaded from: classes8.dex */
    public static class c extends a {
        public c(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(@NonNull M m11, @NonNull List<p<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m11);
        }

        public c(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }
}
