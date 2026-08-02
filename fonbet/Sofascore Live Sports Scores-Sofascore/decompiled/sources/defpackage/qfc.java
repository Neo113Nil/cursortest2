package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class qfc {
    public final Context a;
    public final vec b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public xfc i;
    public ofc j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final pfc l = new pfc(this);

    public qfc(int i, int i2, vec vecVar, Context context, View view, boolean z) {
        this.a = context;
        this.b = vecVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public final ofc a() {
        ofc m9iVar;
        ofc ofcVar = this.j;
        if (ofcVar != null) {
            return ofcVar;
        }
        Context context = this.a;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int min = Math.min(point.x, point.y);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
        Context context2 = this.a;
        if (min >= dimensionPixelSize) {
            m9iVar = new ql2(context2, this.f, this.d, this.e, this.c);
        } else {
            View view = this.f;
            m9iVar = new m9i(this.d, this.e, this.b, context2, view, this.c);
        }
        m9iVar.j(this.b);
        m9iVar.q(this.l);
        m9iVar.l(this.f);
        m9iVar.e(this.i);
        m9iVar.m(this.h);
        m9iVar.o(this.g);
        this.j = m9iVar;
        return m9iVar;
    }

    public final boolean b() {
        ofc ofcVar = this.j;
        return ofcVar != null && ofcVar.a();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        ofc a = a();
        a.r(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.g, this.f.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            a.p(i);
            a.s(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.show();
    }
}
