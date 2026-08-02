package ka;

import android.view.View;
import androidx.core.view.AbstractC2082d0;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final View f54363a;

    /* renamed from: b, reason: collision with root package name */
    public int f54364b;

    /* renamed from: c, reason: collision with root package name */
    public int f54365c;

    /* renamed from: d, reason: collision with root package name */
    public int f54366d;

    /* renamed from: e, reason: collision with root package name */
    public int f54367e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f54368f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f54369g = true;

    public g(View view) {
        this.f54363a = view;
    }

    public void a() {
        View view = this.f54363a;
        AbstractC2082d0.W(view, this.f54366d - (view.getTop() - this.f54364b));
        View view2 = this.f54363a;
        AbstractC2082d0.V(view2, this.f54367e - (view2.getLeft() - this.f54365c));
    }

    public int b() {
        return this.f54364b;
    }

    public int c() {
        return this.f54366d;
    }

    public void d() {
        this.f54364b = this.f54363a.getTop();
        this.f54365c = this.f54363a.getLeft();
    }

    public boolean e(int i10) {
        if (!this.f54369g || this.f54367e == i10) {
            return false;
        }
        this.f54367e = i10;
        a();
        return true;
    }

    public boolean f(int i10) {
        if (!this.f54368f || this.f54366d == i10) {
            return false;
        }
        this.f54366d = i10;
        a();
        return true;
    }
}
