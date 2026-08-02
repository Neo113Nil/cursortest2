package wa;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final View f67542a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f67543b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f67544c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(InterfaceC6734a interfaceC6734a) {
        this.f67542a = (View) interfaceC6734a;
    }

    public final void a() {
        ViewParent parent = this.f67542a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).g(this.f67542a);
        }
    }

    public int b() {
        return this.f67544c;
    }

    public boolean c() {
        return this.f67543b;
    }

    public void d(Bundle bundle) {
        this.f67543b = bundle.getBoolean("expanded", false);
        this.f67544c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f67543b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f67543b);
        bundle.putInt("expandedComponentIdHint", this.f67544c);
        return bundle;
    }

    public void f(int i10) {
        this.f67544c = i10;
    }
}
