package M4;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class k extends M4.a {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f7483f;

    /* renamed from: g, reason: collision with root package name */
    public static int f7484g = com.bumptech.glide.i.f29618a;

    /* renamed from: a, reason: collision with root package name */
    public final View f7485a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7486b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnAttachStateChangeListener f7487c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7488d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7489e;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static Integer f7490e;

        /* renamed from: a, reason: collision with root package name */
        public final View f7491a;

        /* renamed from: b, reason: collision with root package name */
        public final List f7492b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public boolean f7493c;

        /* renamed from: d, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC0149a f7494d;

        /* renamed from: M4.k$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0149a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference f7495a;

            public ViewTreeObserverOnPreDrawListenerC0149a(a aVar) {
                this.f7495a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable("ViewTarget", 2);
                a aVar = (a) this.f7495a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.f7491a = view;
        }

        public static int c(Context context) {
            if (f7490e == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f7490e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f7490e.intValue();
        }

        public void a() {
            if (this.f7492b.isEmpty()) {
                return;
            }
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                j(g10, f10);
                b();
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.f7491a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f7494d);
            }
            this.f7494d = null;
            this.f7492b.clear();
        }

        public void d(i iVar) {
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                iVar.d(g10, f10);
                return;
            }
            if (!this.f7492b.contains(iVar)) {
                this.f7492b.add(iVar);
            }
            if (this.f7494d == null) {
                ViewTreeObserver viewTreeObserver = this.f7491a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0149a viewTreeObserverOnPreDrawListenerC0149a = new ViewTreeObserverOnPreDrawListenerC0149a(this);
                this.f7494d = viewTreeObserverOnPreDrawListenerC0149a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0149a);
            }
        }

        public final int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f7493c && this.f7491a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f7491a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f7491a.getContext());
        }

        public final int f() {
            int paddingTop = this.f7491a.getPaddingTop() + this.f7491a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f7491a.getLayoutParams();
            return e(this.f7491a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f7491a.getPaddingLeft() + this.f7491a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f7491a.getLayoutParams();
            return e(this.f7491a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        public final boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        public final void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f7492b).iterator();
            while (it.hasNext()) {
                ((i) it.next()).d(i10, i11);
            }
        }

        public void k(i iVar) {
            this.f7492b.remove(iVar);
        }
    }

    public k(View view) {
        this.f7485a = (View) com.bumptech.glide.util.k.d(view);
        this.f7486b = new a(view);
    }

    @Override // M4.j
    public L4.d c() {
        Object k10 = k();
        if (k10 == null) {
            return null;
        }
        if (k10 instanceof L4.d) {
            return (L4.d) k10;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // M4.j
    public void e(i iVar) {
        this.f7486b.k(iVar);
    }

    @Override // M4.j
    public void g(L4.d dVar) {
        q(dVar);
    }

    @Override // M4.j
    public void h(i iVar) {
        this.f7486b.d(iVar);
    }

    @Override // M4.a, M4.j
    public void i(Drawable drawable) {
        super.i(drawable);
        o();
    }

    @Override // M4.a, M4.j
    public void j(Drawable drawable) {
        super.j(drawable);
        this.f7486b.b();
        if (this.f7488d) {
            return;
        }
        p();
    }

    public final Object k() {
        return this.f7485a.getTag(f7484g);
    }

    public View l() {
        return this.f7485a;
    }

    public final void o() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f7487c;
        if (onAttachStateChangeListener == null || this.f7489e) {
            return;
        }
        this.f7485a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f7489e = true;
    }

    public final void p() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f7487c;
        if (onAttachStateChangeListener == null || !this.f7489e) {
            return;
        }
        this.f7485a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f7489e = false;
    }

    public final void q(Object obj) {
        f7483f = true;
        this.f7485a.setTag(f7484g, obj);
    }

    public String toString() {
        return "Target for: " + this.f7485a;
    }
}
