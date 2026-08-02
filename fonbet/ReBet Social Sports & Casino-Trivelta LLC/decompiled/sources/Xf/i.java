package Xf;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* loaded from: classes4.dex */
public class i extends Scroller {

    /* renamed from: a, reason: collision with root package name */
    public double f13816a;

    public i(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.f13816a = 1.0d;
    }

    public void a(double d10) {
        this.f13816a = d10;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i10, int i11, int i12, int i13, int i14) {
        super.startScroll(i10, i11, i12, i13, (int) (i14 * this.f13816a));
    }
}
