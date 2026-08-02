package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class o extends RecyclerView.A {

    /* renamed from: k, reason: collision with root package name */
    public PointF f23203k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f23204l;

    /* renamed from: n, reason: collision with root package name */
    public float f23206n;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f23201i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f23202j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    public boolean f23205m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f23207o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f23208p = 0;

    public o(Context context) {
        this.f23204l = context.getResources().getDisplayMetrics();
    }

    public final float A() {
        if (!this.f23205m) {
            this.f23206n = v(this.f23204l);
            this.f23205m = true;
        }
        return this.f23206n;
    }

    public int B() {
        PointF pointF = this.f23203k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.y;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }

    public void C(RecyclerView.A.a aVar) {
        PointF a10 = a(f());
        if (a10 == null || (a10.x == 0.0f && a10.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a10);
        this.f23203k = a10;
        this.f23207o = (int) (a10.x * 10000.0f);
        this.f23208p = (int) (a10.y * 10000.0f);
        aVar.d((int) (this.f23207o * 1.2f), (int) (this.f23208p * 1.2f), (int) (x(10000) * 1.2f), this.f23201i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    public void l(int i10, int i11, RecyclerView.B b10, RecyclerView.A.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f23207o = y(this.f23207o, i10);
        int y10 = y(this.f23208p, i11);
        this.f23208p = y10;
        if (this.f23207o == 0 && y10 == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    public void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    public void n() {
        this.f23208p = 0;
        this.f23207o = 0;
        this.f23203k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    public void o(View view, RecyclerView.B b10, RecyclerView.A.a aVar) {
        int t10 = t(view, z());
        int u10 = u(view, B());
        int w10 = w((int) Math.sqrt((t10 * t10) + (u10 * u10)));
        if (w10 > 0) {
            aVar.d(-t10, -u10, w10, this.f23202j);
        }
    }

    public int s(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    public int t(View view, int i10) {
        RecyclerView.q e10 = e();
        if (e10 == null || !e10.A()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(e10.g0(view) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, e10.j0(view) + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, e10.getPaddingLeft(), e10.z0() - e10.getPaddingRight(), i10);
    }

    public int u(View view, int i10) {
        RecyclerView.q e10 = e();
        if (e10 == null || !e10.B()) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) view.getLayoutParams();
        return s(e10.k0(view) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, e10.e0(view) + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin, e10.getPaddingTop(), e10.m0() - e10.getPaddingBottom(), i10);
    }

    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int w(int i10) {
        return (int) Math.ceil(x(i10) / 0.3356d);
    }

    public int x(int i10) {
        return (int) Math.ceil(Math.abs(i10) * A());
    }

    public final int y(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    public int z() {
        PointF pointF = this.f23203k;
        if (pointF == null) {
            return 0;
        }
        float f10 = pointF.x;
        if (f10 == 0.0f) {
            return 0;
        }
        return f10 > 0.0f ? 1 : -1;
    }
}
