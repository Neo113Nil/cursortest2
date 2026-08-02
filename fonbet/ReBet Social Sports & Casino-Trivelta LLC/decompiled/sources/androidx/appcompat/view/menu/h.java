package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import androidx.core.view.AbstractC2112t;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16762a;

    /* renamed from: b, reason: collision with root package name */
    public final e f16763b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16764c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16765d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16766e;

    /* renamed from: f, reason: collision with root package name */
    public View f16767f;

    /* renamed from: g, reason: collision with root package name */
    public int f16768g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16769h;

    /* renamed from: i, reason: collision with root package name */
    public i.a f16770i;

    /* renamed from: j, reason: collision with root package name */
    public r.d f16771j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f16772k;

    /* renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f16773l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.e();
        }
    }

    public h(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    public final r.d a() {
        Display defaultDisplay = ((WindowManager) this.f16762a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        r.d bVar = Math.min(point.x, point.y) >= this.f16762a.getResources().getDimensionPixelSize(l.d.f55021a) ? new b(this.f16762a, this.f16767f, this.f16765d, this.f16766e, this.f16764c) : new k(this.f16762a, this.f16763b, this.f16767f, this.f16765d, this.f16766e, this.f16764c);
        bVar.k(this.f16763b);
        bVar.u(this.f16773l);
        bVar.p(this.f16767f);
        bVar.c(this.f16770i);
        bVar.r(this.f16769h);
        bVar.s(this.f16768g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.f16771j.dismiss();
        }
    }

    public r.d c() {
        if (this.f16771j == null) {
            this.f16771j = a();
        }
        return this.f16771j;
    }

    public boolean d() {
        r.d dVar = this.f16771j;
        return dVar != null && dVar.isShowing();
    }

    public void e() {
        this.f16771j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f16772k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f16767f = view;
    }

    public void g(boolean z10) {
        this.f16769h = z10;
        r.d dVar = this.f16771j;
        if (dVar != null) {
            dVar.r(z10);
        }
    }

    public void h(int i10) {
        this.f16768g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f16772k = onDismissListener;
    }

    public void j(i.a aVar) {
        this.f16770i = aVar;
        r.d dVar = this.f16771j;
        if (dVar != null) {
            dVar.c(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i10, int i11, boolean z10, boolean z11) {
        r.d c10 = c();
        c10.v(z11);
        if (z10) {
            if ((AbstractC2112t.b(this.f16768g, this.f16767f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f16767f.getWidth();
            }
            c10.t(i10);
            c10.w(i11);
            int i12 = (int) ((this.f16762a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.show();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f16767f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f16767f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public h(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f16768g = 8388611;
        this.f16773l = new a();
        this.f16762a = context;
        this.f16763b = eVar;
        this.f16767f = view;
        this.f16764c = z10;
        this.f16765d = i10;
        this.f16766e = i11;
    }
}
