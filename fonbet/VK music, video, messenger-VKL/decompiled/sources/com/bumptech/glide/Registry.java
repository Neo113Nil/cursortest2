package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.aiq;
import xsna.b330;
import xsna.bbg0;
import xsna.c330;
import xsna.d330;
import xsna.dyz0;
import xsna.ejp;
import xsna.fjp0;
import xsna.gqz;
import xsna.j540;
import xsna.mag0;
import xsna.nag0;
import xsna.nr2;
import xsna.pag0;
import xsna.qag0;
import xsna.rob;
import xsna.vvb0;
import xsna.yhq;
import xsna.yip;
import xsna.zhq;

/* loaded from: classes12.dex */
public final class Registry {
    public final d330 a;
    public final ejp b;
    public final nag0 c;
    public final qag0 d;
    public final com.bumptech.glide.load.data.b e;
    public final fjp0 f;
    public final rob g;
    public final dyz0 h = new dyz0();
    public final gqz i = new gqz();
    public final yhq.c j;

    public static class MissingComponentException extends RuntimeException {
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException() {
            throw null;
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException() {
            throw null;
        }
    }

    public Registry() {
        yhq.c cVar = new yhq.c(new vvb0(20), new zhq(), new aiq());
        this.j = cVar;
        this.a = new d330(cVar);
        this.b = new ejp();
        this.c = new nag0();
        this.d = new qag0();
        this.e = new com.bumptech.glide.load.data.b();
        this.f = new fjp0();
        this.g = new rob();
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        nag0 nag0Var = this.c;
        synchronized (nag0Var) {
            try {
                ArrayList arrayList2 = new ArrayList(nag0Var.a);
                nag0Var.a.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    nag0Var.a.add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        nag0Var.a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public final void a(@NonNull Class cls, @NonNull Class cls2, @NonNull c330 c330Var) {
        d330 d330Var = this.a;
        synchronized (d330Var) {
            j540 j540Var = d330Var.a;
            synchronized (j540Var) {
                try {
                    j540.b bVar = new j540.b(cls, cls2, c330Var);
                    ArrayList arrayList = j540Var.a;
                    arrayList.add(arrayList.size(), bVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            d330Var.b.a.clear();
        }
    }

    @NonNull
    public final void b(@NonNull Class cls, @NonNull yip yipVar) {
        ejp ejpVar = this.b;
        synchronized (ejpVar) {
            ejpVar.a.add(new ejp.a(cls, yipVar));
        }
    }

    @NonNull
    public final void c(@NonNull Class cls, @NonNull pag0 pag0Var) {
        qag0 qag0Var = this.d;
        synchronized (qag0Var) {
            qag0Var.a.add(new qag0.a(cls, pag0Var));
        }
    }

    @NonNull
    public final void d(@NonNull String str, @NonNull Class cls, @NonNull Class cls2, @NonNull mag0 mag0Var) {
        nag0 nag0Var = this.c;
        synchronized (nag0Var) {
            nag0Var.a(str).add(new nag0.a<>(cls, cls2, mag0Var));
        }
    }

    @NonNull
    public final ArrayList e() {
        ArrayList arrayList;
        rob robVar = this.g;
        synchronized (robVar) {
            arrayList = (ArrayList) robVar.b;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return arrayList;
    }

    @NonNull
    public final <Model> List<b330<Model, ?>> f(@NonNull Model model) {
        List<b330<Model, ?>> list;
        d330 d330Var = this.a;
        d330Var.getClass();
        Class<?> cls = model.getClass();
        synchronized (d330Var) {
            d330.a.C2701a c2701a = (d330.a.C2701a) d330Var.b.a.get(cls);
            list = c2701a == null ? null : c2701a.a;
            if (list == null) {
                list = Collections.unmodifiableList(d330Var.a.a(cls));
                if (((d330.a.C2701a) d330Var.b.a.put(cls, new d330.a.C2701a(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (list.isEmpty()) {
            throw new NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + model.getClass());
        }
        int size = list.size();
        List<b330<Model, ?>> list2 = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            b330<Model, ?> b330Var = list.get(i);
            if (b330Var.b(model)) {
                if (z) {
                    list2 = new ArrayList<>(size - i);
                    z = false;
                }
                list2.add(b330Var);
            }
        }
        if (!list2.isEmpty()) {
            return list2;
        }
        throw new NoModelLoaderAvailableException("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + model);
    }

    @NonNull
    public final <X> com.bumptech.glide.load.data.a<X> g(@NonNull X x) {
        com.bumptech.glide.load.data.a<X> build;
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            try {
                nr2.q(x);
                a.InterfaceC0098a interfaceC0098a = (a.InterfaceC0098a) bVar.a.get(x.getClass());
                if (interfaceC0098a == null) {
                    Iterator it = bVar.a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        a.InterfaceC0098a interfaceC0098a2 = (a.InterfaceC0098a) it.next();
                        if (interfaceC0098a2.b().isAssignableFrom(x.getClass())) {
                            interfaceC0098a = interfaceC0098a2;
                            break;
                        }
                    }
                }
                if (interfaceC0098a == null) {
                    interfaceC0098a = com.bumptech.glide.load.data.b.b;
                }
                build = interfaceC0098a.build(x);
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    @NonNull
    public final void h(@NonNull a.InterfaceC0098a interfaceC0098a) {
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            bVar.a.put(interfaceC0098a.b(), interfaceC0098a);
        }
    }

    @NonNull
    public final void i(@NonNull Class cls, @NonNull Class cls2, @NonNull bbg0 bbg0Var) {
        fjp0 fjp0Var = this.f;
        synchronized (fjp0Var) {
            fjp0Var.a.add(new fjp0.a(cls, cls2, bbg0Var));
        }
    }
}
