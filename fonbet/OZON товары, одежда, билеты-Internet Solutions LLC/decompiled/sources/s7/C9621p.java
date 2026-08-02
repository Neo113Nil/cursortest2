package s7;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.core.view.C5353y0;
import androidx.core.view.D;
import androidx.core.view.Y;

/* renamed from: s7.p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9621p {

    /* renamed from: s7.p$a */
    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f98344a;

        a(View view) {
            this.f98344a = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f98344a;
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    /* renamed from: s7.p$b */
    final class b implements D {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f98345a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f98346b;

        b(c cVar, d dVar) {
            this.f98345a = cVar;
            this.f98346b = dVar;
        }

        @Override // androidx.core.view.D
        public final C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
            d dVar = new d();
            d dVar2 = this.f98346b;
            dVar.f98347a = dVar2.f98347a;
            dVar.f98348b = dVar2.f98348b;
            dVar.f98349c = dVar2.f98349c;
            dVar.f98350d = dVar2.f98350d;
            return this.f98345a.a(view, c5353y0, dVar);
        }
    }

    /* renamed from: s7.p$c */
    public interface c {
        C5353y0 a(View view, C5353y0 c5353y0, d dVar);
    }

    /* renamed from: s7.p$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f98347a;

        /* renamed from: b, reason: collision with root package name */
        public int f98348b;

        /* renamed from: c, reason: collision with root package name */
        public int f98349c;

        /* renamed from: d, reason: collision with root package name */
        public int f98350d;
    }

    public static void a(@NonNull View view, @NonNull c cVar) {
        int i11 = Y.f42258g;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        d dVar = new d();
        dVar.f98347a = paddingStart;
        dVar.f98348b = paddingTop;
        dVar.f98349c = paddingEnd;
        dVar.f98350d = paddingBottom;
        Y.J(view, new b(cVar, dVar));
        if (view.isAttachedToWindow()) {
            Y.A(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC9622q());
        }
    }

    public static float b(int i11, @NonNull Context context) {
        return TypedValue.applyDimension(1, i11, context.getResources().getDisplayMetrics());
    }

    public static float c(@NonNull View view) {
        float f7 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f7 += Y.k((View) parent);
        }
        return f7;
    }

    public static boolean d(View view) {
        int i11 = Y.f42258g;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode e(int i11, PorterDuff.Mode mode) {
        if (i11 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i11 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i11 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i11) {
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

    public static void f(@NonNull View view) {
        view.requestFocus();
        view.post(new a(view));
    }
}
