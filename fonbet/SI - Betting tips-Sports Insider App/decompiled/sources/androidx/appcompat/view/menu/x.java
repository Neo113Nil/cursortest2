package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f552a;

    /* renamed from: b, reason: collision with root package name */
    public final n f553b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f554c;

    /* renamed from: d, reason: collision with root package name */
    public final int f555d;

    /* renamed from: e, reason: collision with root package name */
    public View f556e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f558g;

    /* renamed from: h, reason: collision with root package name */
    public y f559h;

    /* renamed from: i, reason: collision with root package name */
    public v f560i;
    public PopupWindow.OnDismissListener j;

    /* renamed from: f, reason: collision with root package name */
    public int f557f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final w f561k = new w(this);

    public x(Context context, n nVar, View view, boolean z5, int i5, int i10) {
        this.f552a = context;
        this.f553b = nVar;
        this.f556e = view;
        this.f554c = z5;
        this.f555d = i5;
    }

    public final v a() {
        v e0Var;
        if (this.f560i == null) {
            Context context = this.f552a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                e0Var = new h(context, this.f556e, this.f555d, this.f554c);
            } else {
                e0Var = new e0(this.f552a, this.f553b, this.f556e, this.f555d, this.f554c);
            }
            e0Var.b(this.f553b);
            e0Var.i(this.f561k);
            e0Var.d(this.f556e);
            e0Var.setCallback(this.f559h);
            e0Var.e(this.f558g);
            e0Var.g(this.f557f);
            this.f560i = e0Var;
        }
        return this.f560i;
    }

    public final boolean b() {
        v vVar = this.f560i;
        return vVar != null && vVar.a();
    }

    public void c() {
        this.f560i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i5, int i10, boolean z5, boolean z7) {
        v a7 = a();
        a7.j(z7);
        if (z5) {
            if ((Gravity.getAbsoluteGravity(this.f557f, this.f556e.getLayoutDirection()) & 7) == 5) {
                i5 -= this.f556e.getWidth();
            }
            a7.h(i5);
            a7.k(i10);
            int i11 = (int) ((this.f552a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a7.f550a = new Rect(i5 - i11, i10 - i11, i5 + i11, i10 + i11);
        }
        a7.show();
    }
}
