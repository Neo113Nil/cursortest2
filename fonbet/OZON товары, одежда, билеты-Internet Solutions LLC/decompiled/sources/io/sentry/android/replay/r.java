package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.sentry.InterfaceC7097a0;
import io.sentry.android.replay.r;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class r implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67602a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67603b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f67604c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f67605d;

    public static final class a {

        /* renamed from: io.sentry.android.replay.r$a$a, reason: collision with other inner class name */
        static final class C1108a extends AbstractC7737t implements Function1<ArrayList<View>, ArrayList<View>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f67606b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1108a(r rVar) {
                super(1);
                this.f67606b = rVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public final ArrayList<View> invoke(ArrayList<View> arrayList) {
                ArrayList<View> mViews = arrayList;
                Intrinsics.checkNotNullParameter(mViews, "mViews");
                r rVar = this.f67606b;
                InterfaceC7097a0 a11 = rVar.f67603b.a();
                try {
                    b bVar = rVar.f67605d;
                    bVar.addAll(mViews);
                    a11.close();
                    return bVar;
                } finally {
                }
            }
        }

        @NotNull
        public static r a() {
            final r rVar = new r(0);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: io.sentry.android.replay.q
                @Override // java.lang.Runnable
                public final void run() {
                    AtomicBoolean atomicBoolean;
                    r rVar2 = r.this;
                    atomicBoolean = rVar2.f67602a;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    int i11 = w.f67727d;
                    w.b(new r.a.C1108a(rVar2));
                }
            });
            return rVar;
        }
    }

    public static final class c extends CopyOnWriteArrayList<f> {
        c() {
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final boolean add(Object obj) {
            f fVar = (f) obj;
            r rVar = r.this;
            InterfaceC7097a0 a11 = rVar.f67603b.a();
            try {
                Iterator<View> it = rVar.f67605d.iterator();
                while (it.hasNext()) {
                    View next = it.next();
                    if (fVar != null) {
                        fVar.c(next, true);
                    }
                }
                Unit unit = Unit.f71690a;
                a11.close();
                return super.add(fVar);
            } finally {
            }
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return super.contains((f) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return super.indexOf((f) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return super.lastIndexOf((f) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof f) {
                return super.remove((f) obj);
            }
            return false;
        }
    }

    public /* synthetic */ r(int i11) {
        this();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f67602a.set(true);
        this.f67604c.clear();
    }

    @NotNull
    public final c k() {
        return this.f67604c;
    }

    public static final class b extends ArrayList<View> {
        b() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            View element = (View) obj;
            Intrinsics.checkNotNullParameter(element, "element");
            Iterator<f> it = r.this.k().iterator();
            while (it.hasNext()) {
                it.next().c(element, true);
            }
            return super.add(element);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends View> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<f> it = r.this.k().iterator();
            while (it.hasNext()) {
                f next = it.next();
                Iterator<T> it2 = elements.iterator();
                while (it2.hasNext()) {
                    next.c((View) it2.next(), true);
                }
            }
            return super.addAll(elements);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return super.contains((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return super.indexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return super.lastIndexOf((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return super.remove((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final Object remove(int i11) {
            Object remove = super.remove(i11);
            Intrinsics.checkNotNullExpressionValue(remove, "removeAt(...)");
            View view = (View) remove;
            Iterator<f> it = r.this.k().iterator();
            while (it.hasNext()) {
                it.next().c(view, false);
            }
            return view;
        }
    }

    private r() {
        this.f67602a = new AtomicBoolean(false);
        this.f67603b = new io.sentry.util.a();
        this.f67604c = new c();
        this.f67605d = new b();
    }
}
