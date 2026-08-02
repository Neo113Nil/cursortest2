package xa;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.core.view.J;
import androidx.core.view.h1;
import l0.AbstractC5338c;

/* loaded from: classes3.dex */
public abstract class o {

    public class a implements J {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f68086a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f68087b;

        public a(c cVar, d dVar) {
            this.f68086a = cVar;
            this.f68087b = dVar;
        }

        @Override // androidx.core.view.J
        public F0 f(View view, F0 f02) {
            return this.f68086a.a(view, f02, new d(this.f68087b));
        }
    }

    public interface c {
        F0 a(View view, F0 f02, d dVar);
    }

    public static void b(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void c(View view, c cVar) {
        AbstractC2082d0.x0(view, new a(cVar, new d(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        n(view);
    }

    public static float d(Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer e(View view) {
        ColorStateList f10 = ua.d.f(view.getBackground());
        if (f10 != null) {
            return Integer.valueOf(f10.getDefaultColor());
        }
        return null;
    }

    public static ViewGroup f(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static InputMethodManager g(View view) {
        return (InputMethodManager) AbstractC5338c.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static float h(View view) {
        float f10 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f10 += ((View) parent).getElevation();
        }
        return f10;
    }

    public static void i(View view, boolean z10) {
        h1 K10;
        if (z10 && (K10 = AbstractC2082d0.K(view)) != null) {
            K10.b(F0.p.b());
            return;
        }
        InputMethodManager g10 = g(view);
        if (g10 != null) {
            g10.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean j(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode k(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void l(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            m(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void m(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void n(View view) {
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void o(final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: xa.n
            @Override // java.lang.Runnable
            public final void run() {
                o.p(view, z10);
            }
        });
    }

    public static void p(View view, boolean z10) {
        h1 K10;
        if (!z10 || (K10 = AbstractC2082d0.K(view)) == null) {
            g(view).showSoftInput(view, 1);
        } else {
            K10.g(F0.p.b());
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f68088a;

        /* renamed from: b, reason: collision with root package name */
        public int f68089b;

        /* renamed from: c, reason: collision with root package name */
        public int f68090c;

        /* renamed from: d, reason: collision with root package name */
        public int f68091d;

        public d(int i10, int i11, int i12, int i13) {
            this.f68088a = i10;
            this.f68089b = i11;
            this.f68090c = i12;
            this.f68091d = i13;
        }

        public void a(View view) {
            view.setPaddingRelative(this.f68088a, this.f68089b, this.f68090c, this.f68091d);
        }

        public d(d dVar) {
            this.f68088a = dVar.f68088a;
            this.f68089b = dVar.f68089b;
            this.f68090c = dVar.f68090c;
            this.f68091d = dVar.f68091d;
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            view.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
