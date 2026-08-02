package L2;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import z.C6900a;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractC1388m f6933a = new C1376a();

    /* renamed from: b, reason: collision with root package name */
    public static ThreadLocal f6934b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static ArrayList f6935c = new ArrayList();

    public static void a(ViewGroup viewGroup, AbstractC1388m abstractC1388m) {
        if (f6935c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f6935c.add(viewGroup);
        if (abstractC1388m == null) {
            abstractC1388m = f6933a;
        }
        AbstractC1388m clone = abstractC1388m.clone();
        e(viewGroup, clone);
        AbstractC1385j.b(viewGroup, null);
        d(viewGroup, clone);
    }

    public static x b(ViewGroup viewGroup, AbstractC1388m abstractC1388m) {
        if (f6935c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC1388m.N()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f6935c.add(viewGroup);
        AbstractC1388m clone = abstractC1388m.clone();
        y yVar = new y();
        yVar.r0(clone);
        e(viewGroup, yVar);
        AbstractC1385j.b(viewGroup, null);
        d(viewGroup, yVar);
        viewGroup.invalidate();
        return yVar.q();
    }

    public static C6900a c() {
        C6900a c6900a;
        WeakReference weakReference = (WeakReference) f6934b.get();
        if (weakReference != null && (c6900a = (C6900a) weakReference.get()) != null) {
            return c6900a;
        }
        C6900a c6900a2 = new C6900a();
        f6934b.set(new WeakReference(c6900a2));
        return c6900a2;
    }

    public static void d(ViewGroup viewGroup, AbstractC1388m abstractC1388m) {
        if (abstractC1388m == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC1388m, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void e(ViewGroup viewGroup, AbstractC1388m abstractC1388m) {
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC1388m) it.next()).Y(viewGroup);
            }
        }
        if (abstractC1388m != null) {
            abstractC1388m.l(viewGroup, true);
        }
        AbstractC1385j.a(viewGroup);
    }

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC1388m f6936a;

        /* renamed from: b, reason: collision with root package name */
        public ViewGroup f6937b;

        /* renamed from: L2.v$a$a, reason: collision with other inner class name */
        public class C0145a extends u {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C6900a f6938a;

            public C0145a(C6900a c6900a) {
                this.f6938a = c6900a;
            }

            @Override // L2.u, L2.AbstractC1388m.i
            public void g(AbstractC1388m abstractC1388m) {
                ((ArrayList) this.f6938a.get(a.this.f6937b)).remove(abstractC1388m);
                abstractC1388m.b0(this);
            }
        }

        public a(AbstractC1388m abstractC1388m, ViewGroup viewGroup) {
            this.f6936a = abstractC1388m;
            this.f6937b = viewGroup;
        }

        public final void a() {
            this.f6937b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f6937b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!v.f6935c.remove(this.f6937b)) {
                return true;
            }
            C6900a c10 = v.c();
            ArrayList arrayList = (ArrayList) c10.get(this.f6937b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c10.put(this.f6937b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f6936a);
            this.f6936a.c(new C0145a(c10));
            this.f6936a.l(this.f6937b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC1388m) it.next()).d0(this.f6937b);
                }
            }
            this.f6936a.Z(this.f6937b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            v.f6935c.remove(this.f6937b);
            ArrayList arrayList = (ArrayList) v.c().get(this.f6937b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC1388m) it.next()).d0(this.f6937b);
                }
            }
            this.f6936a.m(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
