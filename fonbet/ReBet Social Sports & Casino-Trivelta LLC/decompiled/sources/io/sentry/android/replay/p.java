package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.sentry.InterfaceC4765j0;
import io.sentry.android.replay.p;
import io.sentry.util.C4843a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class p implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f51645e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f51646f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f51647a;

    /* renamed from: b, reason: collision with root package name */
    public final C4843a f51648b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f51649c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f51650d;

    public static final class a {

        /* renamed from: io.sentry.android.replay.p$a$a, reason: collision with other inner class name */
        public static final class C0760a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p f51651d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0760a(p pVar) {
                super(1);
                this.f51651d = pVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ArrayList invoke(ArrayList mViews) {
                Intrinsics.checkNotNullParameter(mViews, "mViews");
                InterfaceC4765j0 d10 = this.f51651d.f51648b.d();
                try {
                    ArrayList arrayList = this.f51651d.f51650d;
                    arrayList.addAll(mViews);
                    AutoCloseableKt.closeFinally(d10, null);
                    return arrayList;
                } finally {
                }
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final void c(p pVar) {
            if (pVar.f51647a.get()) {
                return;
            }
            v.f51790a.e(new C0760a(pVar));
        }

        public final p b() {
            final p pVar = new p(null);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: io.sentry.android.replay.o
                @Override // java.lang.Runnable
                public final void run() {
                    p.a.c(p.this);
                }
            });
            return pVar;
        }

        public a() {
        }
    }

    public static final class b extends ArrayList {
        public b() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(View element) {
            Intrinsics.checkNotNullParameter(element, "element");
            Iterator it = p.this.B().iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(element, true);
            }
            return super.add(element);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            for (e eVar : p.this.B()) {
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    eVar.d((View) it.next(), true);
                }
            }
            return super.addAll(elements);
        }

        public /* bridge */ boolean b(View view) {
            return super.contains(view);
        }

        public /* bridge */ int c() {
            return super.size();
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return b((View) obj);
            }
            return false;
        }

        public /* bridge */ int e(View view) {
            return super.indexOf(view);
        }

        public /* bridge */ int f(View view) {
            return super.lastIndexOf(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final /* bridge */ View remove(int i10) {
            return i(i10);
        }

        public /* bridge */ boolean h(View view) {
            return super.remove(view);
        }

        public View i(int i10) {
            Object remove = super.remove(i10);
            Intrinsics.checkNotNullExpressionValue(remove, "removeAt(...)");
            View view = (View) remove;
            Iterator it = p.this.B().iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(view, false);
            }
            return view;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return e((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return f((View) obj);
            }
            return -1;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return h((View) obj);
            }
            return false;
        }
    }

    public static final class c extends CopyOnWriteArrayList {
        public c() {
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(e eVar) {
            InterfaceC4765j0 d10 = p.this.f51648b.d();
            try {
                for (View view : p.this.f51650d) {
                    if (eVar != null) {
                        eVar.d(view, true);
                    }
                }
                Unit unit = Unit.INSTANCE;
                AutoCloseableKt.closeFinally(d10, null);
                return super.add(eVar);
            } finally {
            }
        }

        public /* bridge */ boolean b(e eVar) {
            return super.contains(eVar);
        }

        public /* bridge */ int c() {
            return super.size();
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return b((e) obj);
            }
            return false;
        }

        public /* bridge */ int e(e eVar) {
            return super.indexOf(eVar);
        }

        public /* bridge */ int f(e eVar) {
            return super.lastIndexOf(eVar);
        }

        public /* bridge */ boolean g(e eVar) {
            return super.remove(eVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return e((e) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return f((e) obj);
            }
            return -1;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof e) {
                return g((e) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final CopyOnWriteArrayList B() {
        return this.f51649c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51647a.set(true);
        this.f51649c.clear();
    }

    public p() {
        this.f51647a = new AtomicBoolean(false);
        this.f51648b = new C4843a();
        this.f51649c = new c();
        this.f51650d = new b();
    }
}
