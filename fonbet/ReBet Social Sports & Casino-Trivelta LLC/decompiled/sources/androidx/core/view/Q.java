package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final c f19174a;

    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final View f19175a;

        public a(View view) {
            this.f19175a = view;
        }

        @Override // androidx.core.view.Q.c
        public void a() {
            View view = this.f19175a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f19175a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.Q.c
        public void b() {
            final View view = this.f19175a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
            }
            if (view == null) {
                view = this.f19175a.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: androidx.core.view.P
                @Override // java.lang.Runnable
                public final void run() {
                    ((InputMethodManager) r0.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    public static class c {
        public abstract void a();

        public abstract void b();
    }

    public Q(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f19174a = new b(view);
        } else {
            this.f19174a = new a(view);
        }
    }

    public void a() {
        this.f19174a.a();
    }

    public void b() {
        this.f19174a.b();
    }

    public static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public View f19176b;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsetsController f19177c;

        public b(View view) {
            super(view);
            this.f19176b = view;
        }

        @Override // androidx.core.view.Q.a, androidx.core.view.Q.c
        public void a() {
            int ime;
            View view;
            WindowInsetsController windowInsetsController = this.f19177c;
            if (windowInsetsController == null) {
                View view2 = this.f19176b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.Y
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((r2 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f19176b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f19176b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
        }

        @Override // androidx.core.view.Q.a, androidx.core.view.Q.c
        public void b() {
            int ime;
            View view = this.f19176b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f19177c;
            if (windowInsetsController == null) {
                View view2 = this.f19176b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.b();
        }

        public b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f19177c = windowInsetsController;
        }
    }

    public Q(WindowInsetsController windowInsetsController) {
        this.f19174a = new b(windowInsetsController);
    }
}
