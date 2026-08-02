package k6;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import l6.C5406a;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f54273a = new h();

    public static final class a implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        public final C5406a f54274a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f54275b;

        /* renamed from: c, reason: collision with root package name */
        public final WeakReference f54276c;

        /* renamed from: d, reason: collision with root package name */
        public final View.OnTouchListener f54277d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f54278e;

        public a(C5406a mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f54274a = mapping;
            this.f54275b = new WeakReference(hostView);
            this.f54276c = new WeakReference(rootView);
            this.f54277d = l6.f.h(hostView);
            this.f54278e = true;
        }

        public final boolean a() {
            return this.f54278e;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            View view2 = (View) this.f54276c.get();
            View view3 = (View) this.f54275b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                C5201b c5201b = C5201b.f54234a;
                C5201b.d(this.f54274a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f54277d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    public static final a a(C5406a mapping, View rootView, View hostView) {
        if (Y7.a.d(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            Y7.a.b(th2, h.class);
            return null;
        }
    }
}
