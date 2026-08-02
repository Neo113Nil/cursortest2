package ka;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public abstract class f extends CoordinatorLayout.c {

    /* renamed from: a, reason: collision with root package name */
    public g f54360a;

    /* renamed from: b, reason: collision with root package name */
    public int f54361b;

    /* renamed from: c, reason: collision with root package name */
    public int f54362c;

    public f() {
        this.f54361b = 0;
        this.f54362c = 0;
    }

    public int I() {
        g gVar = this.f54360a;
        if (gVar != null) {
            return gVar.c();
        }
        return 0;
    }

    public void J(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.E(view, i10);
    }

    public boolean K(int i10) {
        g gVar = this.f54360a;
        if (gVar != null) {
            return gVar.f(i10);
        }
        this.f54361b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        J(coordinatorLayout, view, i10);
        if (this.f54360a == null) {
            this.f54360a = new g(view);
        }
        this.f54360a.d();
        this.f54360a.a();
        int i11 = this.f54361b;
        if (i11 != 0) {
            this.f54360a.f(i11);
            this.f54361b = 0;
        }
        int i12 = this.f54362c;
        if (i12 == 0) {
            return true;
        }
        this.f54360a.e(i12);
        this.f54362c = 0;
        return true;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54361b = 0;
        this.f54362c = 0;
    }
}
