package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    public int f23193b;

    /* renamed from: c, reason: collision with root package name */
    public int f23194c;

    /* renamed from: d, reason: collision with root package name */
    public int f23195d;

    /* renamed from: e, reason: collision with root package name */
    public int f23196e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f23199h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f23200i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f23192a = true;

    /* renamed from: f, reason: collision with root package name */
    public int f23197f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f23198g = 0;

    public boolean a(RecyclerView.B b10) {
        int i10 = this.f23194c;
        return i10 >= 0 && i10 < b10.b();
    }

    public View b(RecyclerView.x xVar) {
        View o10 = xVar.o(this.f23194c);
        this.f23194c += this.f23195d;
        return o10;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f23193b + ", mCurrentPosition=" + this.f23194c + ", mItemDirection=" + this.f23195d + ", mLayoutDirection=" + this.f23196e + ", mStartLine=" + this.f23197f + ", mEndLine=" + this.f23198g + '}';
    }
}
