package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f2514a;

    /* renamed from: b, reason: collision with root package name */
    public int f2515b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f2516c = new Rect();

    public q0(k1 k1Var) {
        this.f2514a = k1Var;
    }

    public static q0 a(k1 k1Var, int i5) {
        if (i5 == 0) {
            return new p0(k1Var, 0);
        }
        if (i5 == 1) {
            return new p0(k1Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i5);
}
