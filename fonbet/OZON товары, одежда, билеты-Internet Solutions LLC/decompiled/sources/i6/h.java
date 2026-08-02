package i6;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes8.dex */
final class h implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f65877a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f65878b;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewTreeObserver.OnDrawListener f65879a;

        a(ViewTreeObserver.OnDrawListener onDrawListener) {
            this.f65879a = onDrawListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c6.t.a().d();
            h.this.f65878b.f65882b = true;
            View view = h.this.f65877a;
            view.getViewTreeObserver().removeOnDrawListener(this.f65879a);
            h.this.f65878b.f65881a.clear();
        }
    }

    h(i iVar, View view) {
        this.f65878b = iVar;
        this.f65877a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        p6.l.j(new a(this));
    }
}
