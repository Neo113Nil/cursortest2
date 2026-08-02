package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class gwd {
    public final n a;
    public int b = Integer.MIN_VALUE;
    public final Rect c = new Rect();

    public gwd(n nVar) {
        this.a = nVar;
    }

    public static gwd a(n nVar, int i) {
        if (i == 0) {
            return new fwd(nVar, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new fwd(nVar, i2);
        }
        a70.p("invalid orientation");
        return null;
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

    public abstract void o(int i);
}
