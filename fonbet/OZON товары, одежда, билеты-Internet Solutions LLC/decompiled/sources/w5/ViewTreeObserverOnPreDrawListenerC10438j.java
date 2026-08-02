package w5;

import Sc.r;
import android.view.View;
import android.view.ViewTreeObserver;
import xe.C10737n;

/* renamed from: w5.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnPreDrawListenerC10438j implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    private boolean f103586a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10439k<View> f103587b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ViewTreeObserver f103588c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10737n f103589d;

    ViewTreeObserverOnPreDrawListenerC10438j(InterfaceC10439k interfaceC10439k, ViewTreeObserver viewTreeObserver, C10737n c10737n) {
        this.f103587b = interfaceC10439k;
        this.f103588c = viewTreeObserver;
        this.f103589d = c10737n;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C10435g size;
        InterfaceC10439k<View> interfaceC10439k = this.f103587b;
        size = interfaceC10439k.getSize();
        if (size != null) {
            ViewTreeObserver viewTreeObserver = this.f103588c;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                interfaceC10439k.getView().getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f103586a) {
                this.f103586a = true;
                r.Companion companion = r.INSTANCE;
                this.f103589d.resumeWith(size);
            }
        }
        return true;
    }
}
