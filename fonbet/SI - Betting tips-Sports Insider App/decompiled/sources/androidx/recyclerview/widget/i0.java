package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public q0 f2425a;

    /* renamed from: b, reason: collision with root package name */
    public int f2426b;

    /* renamed from: c, reason: collision with root package name */
    public int f2427c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2428d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2429e;

    public i0() {
        d();
    }

    public final void a() {
        this.f2427c = this.f2428d ? this.f2425a.g() : this.f2425a.k();
    }

    public final void b(int i5, View view) {
        if (this.f2428d) {
            int b10 = this.f2425a.b(view);
            q0 q0Var = this.f2425a;
            this.f2427c = (Integer.MIN_VALUE == q0Var.f2515b ? 0 : q0Var.l() - q0Var.f2515b) + b10;
        } else {
            this.f2427c = this.f2425a.e(view);
        }
        this.f2426b = i5;
    }

    public final void c(int i5, View view) {
        q0 q0Var = this.f2425a;
        int l6 = Integer.MIN_VALUE == q0Var.f2515b ? 0 : q0Var.l() - q0Var.f2515b;
        if (l6 >= 0) {
            b(i5, view);
            return;
        }
        this.f2426b = i5;
        if (!this.f2428d) {
            int e7 = this.f2425a.e(view);
            int k6 = e7 - this.f2425a.k();
            this.f2427c = e7;
            if (k6 > 0) {
                int g10 = (this.f2425a.g() - Math.min(0, (this.f2425a.g() - l6) - this.f2425a.b(view))) - (this.f2425a.c(view) + e7);
                if (g10 < 0) {
                    this.f2427c -= Math.min(k6, -g10);
                    return;
                }
                return;
            }
            return;
        }
        int g11 = (this.f2425a.g() - l6) - this.f2425a.b(view);
        this.f2427c = this.f2425a.g() - g11;
        if (g11 > 0) {
            int c2 = this.f2427c - this.f2425a.c(view);
            int k9 = this.f2425a.k();
            int min = c2 - (Math.min(this.f2425a.e(view) - k9, 0) + k9);
            if (min < 0) {
                this.f2427c = Math.min(g11, -min) + this.f2427c;
            }
        }
    }

    public final void d() {
        this.f2426b = -1;
        this.f2427c = Integer.MIN_VALUE;
        this.f2428d = false;
        this.f2429e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f2426b + ", mCoordinate=" + this.f2427c + ", mLayoutFromEnd=" + this.f2428d + ", mValid=" + this.f2429e + '}';
    }
}
