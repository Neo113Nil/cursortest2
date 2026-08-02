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
public abstract class d implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final int f7468f = com.bumptech.glide.i.f29618a;

    /* renamed from: a, reason: collision with root package name */
    public final a f7469a;

    /* renamed from: b, reason: collision with root package name */
    public final View f7470b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnAttachStateChangeListener f7471c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7472d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7473e;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static Integer f7474e;

        /* renamed from: a, reason: collision with root package name */
        public final View f7475a;

        /* renamed from: b, reason: collision with root package name */
        public final List f7476b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public boolean f7477c;

        /* renamed from: d, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC0148a f7478d;

        /* renamed from: M4.d$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0148a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a, reason: collision with root package name */
            public final WeakReference f7479a;

            public ViewTreeObserverOnPreDrawListenerC0148a(a aVar) {
                this.f7479a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                Log.isLoggable("CustomViewTarget", 2);
                a aVar = (a) this.f7479a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.f7475a = view;
        }

        public static int c(Context context) {
            if (f7474e == null) {
                Display defaultDisplay = ((WindowManager) com.bumptech.glide.util.k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f7474e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f7474e.intValue();
        }

        public void a() {
            if (this.f7476b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f7475a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f7478d);
            }
            this.f7478d = null;
            this.f7476b.clear();
        }

        public void d(i iVar) {
            int g10 = g();
            int f10 = f();
            if (i(g10, f10)) {
                iVar.d(g10, f10);
                return;
            }
            if (!this.f7476b.contains(iVar)) {
                this.f7476b.add(iVar);
            }
            if (this.f7478d == null) {
                ViewTreeObserver viewTreeObserver = this.f7475a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0148a viewTreeObserverOnPreDrawListenerC0148a = new ViewTreeObserverOnPreDrawListenerC0148a(this);
                this.f7478d = viewTreeObserverOnPreDrawListenerC0148a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0148a);
            }
        }

        public final int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f7477c && this.f7475a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f7475a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f7475a.getContext());
        }

        public final int f() {
            int paddingTop = this.f7475a.getPaddingTop() + this.f7475a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f7475a.getLayoutParams();
            return e(this.f7475a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f7475a.getPaddingLeft() + this.f7475a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f7475a.getLayoutParams();
            return e(this.f7475a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        public final boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        public final void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f7476b).iterator();
            while (it.hasNext()) {
                ((i) it.next()).d(i10, i11);
            }
        }

        public void k(i iVar) {
            this.f7476b.remove(iVar);
        }
    }

    public d(View view) {
        this.f7470b = (View) com.bumptech.glide.util.k.d(view);
        this.f7469a = new a(view);
    }

    private Object f() {
        return this.f7470b.getTag(f7468f);
    }

    private void k() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f7471c;
        if (onAttachStateChangeListener == null || this.f7473e) {
            return;
        }
        this.f7470b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f7473e = true;
    }

    private void l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f7471c;
        if (onAttachStateChangeListener == null || !this.f7473e) {
            return;
        }
        this.f7470b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f7473e = false;
    }

    private void q(Object obj) {
        this.f7470b.setTag(f7468f, obj);
    }

    @Override // M4.j
    public final L4.d c() {
        Object f10 = f();
        if (f10 == null) {
            return null;
        }
        if (f10 instanceof L4.d) {
            return (L4.d) f10;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // M4.j
    public final void e(i iVar) {
        this.f7469a.k(iVar);
    }

    @Override // M4.j
    public final void g(L4.d dVar) {
        q(dVar);
    }

    @Override // M4.j
    public final void h(i iVar) {
        this.f7469a.d(iVar);
    }

    @Override // M4.j
    public final void i(Drawable drawable) {
        k();
        p(drawable);
    }

    @Override // M4.j
    public final void j(Drawable drawable) {
        this.f7469a.b();
        o(drawable);
        if (this.f7472d) {
            return;
        }
        l();
    }

    public abstract void o(Drawable drawable);

    public String toString() {
        return "Target for: " + this.f7470b;
    }

    @Override // com.bumptech.glide.manager.k
    public void a() {
    }

    @Override // com.bumptech.glide.manager.k
    public void b() {
    }

    @Override // com.bumptech.glide.manager.k
    public void d() {
    }

    public void p(Drawable drawable) {
    }
}
