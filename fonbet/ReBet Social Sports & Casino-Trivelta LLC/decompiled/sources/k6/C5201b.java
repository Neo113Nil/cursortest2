package k6;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import g6.C4331C;
import h6.p;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import l6.C5406a;

/* renamed from: k6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5201b {

    /* renamed from: a, reason: collision with root package name */
    public static final C5201b f54234a = new C5201b();

    /* renamed from: k6.b$a */
    public static final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public C5406a f54235a;

        /* renamed from: b, reason: collision with root package name */
        public WeakReference f54236b;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference f54237c;

        /* renamed from: d, reason: collision with root package name */
        public View.OnClickListener f54238d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f54239e;

        public a(C5406a mapping, View rootView, View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f54235a = mapping;
            this.f54236b = new WeakReference(hostView);
            this.f54237c = new WeakReference(rootView);
            this.f54238d = l6.f.g(hostView);
            this.f54239e = true;
        }

        public final boolean a() {
            return this.f54239e;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                View.OnClickListener onClickListener = this.f54238d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = (View) this.f54237c.get();
                View view3 = (View) this.f54236b.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                C5201b c5201b = C5201b.f54234a;
                C5201b.d(this.f54235a, view2, view3);
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }
    }

    /* renamed from: k6.b$b, reason: collision with other inner class name */
    public static final class C0782b implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        public C5406a f54240a;

        /* renamed from: b, reason: collision with root package name */
        public WeakReference f54241b;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference f54242c;

        /* renamed from: d, reason: collision with root package name */
        public AdapterView.OnItemClickListener f54243d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f54244e;

        public C0782b(C5406a mapping, View rootView, AdapterView hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f54240a = mapping;
            this.f54241b = new WeakReference(hostView);
            this.f54242c = new WeakReference(rootView);
            this.f54243d = hostView.getOnItemClickListener();
            this.f54244e = true;
        }

        public final boolean a() {
            return this.f54244e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            Intrinsics.checkNotNullParameter(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f54243d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = (View) this.f54242c.get();
            AdapterView adapterView2 = (AdapterView) this.f54241b.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            C5201b c5201b = C5201b.f54234a;
            C5201b.d(this.f54240a, view2, adapterView2);
        }
    }

    public static final a b(C5406a mapping, View rootView, View hostView) {
        if (Y7.a.d(C5201b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            Y7.a.b(th2, C5201b.class);
            return null;
        }
    }

    public static final C0782b c(C5406a mapping, View rootView, AdapterView hostView) {
        if (Y7.a.d(C5201b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new C0782b(mapping, rootView, hostView);
        } catch (Throwable th2) {
            Y7.a.b(th2, C5201b.class);
            return null;
        }
    }

    public static final void d(C5406a mapping, View rootView, View hostView) {
        if (Y7.a.d(C5201b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            final String b10 = mapping.b();
            final Bundle b11 = g.f54257f.b(mapping, rootView, hostView);
            f54234a.f(b11);
            C4331C.t().execute(new Runnable() { // from class: k6.a
                @Override // java.lang.Runnable
                public final void run() {
                    C5201b.e(b10, b11);
                }
            });
        } catch (Throwable th2) {
            Y7.a.b(th2, C5201b.class);
        }
    }

    public static final void e(String eventName, Bundle parameters) {
        if (Y7.a.d(C5201b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "$eventName");
            Intrinsics.checkNotNullParameter(parameters, "$parameters");
            p.f47798b.g(C4331C.l()).f(eventName, parameters);
        } catch (Throwable th2) {
            Y7.a.b(th2, C5201b.class);
        }
    }

    public final void f(Bundle parameters) {
        if (Y7.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                parameters.putDouble("_valueToSum", p6.g.g(string));
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
        }
    }
}
