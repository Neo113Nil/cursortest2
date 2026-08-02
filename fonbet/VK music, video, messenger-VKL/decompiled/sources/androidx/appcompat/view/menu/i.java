package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.j;
import com.vkontakte.android.R;
import xsna.b820;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes11.dex */
public class i {
    public final Context a;
    public final f b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public j.a h;
    public b820 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final a k = new a();

    /* compiled from: MenuPopupHelper.java */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    public i(@NonNull Context context, @NonNull f fVar, @NonNull View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = fVar;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    @NonNull
    public final b820 a() {
        b820 lVar;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                lVar = new b(context, this.e, this.d, this.c);
            } else {
                lVar = new l(this.a, this.b, this.e, this.d, this.c);
            }
            lVar.k(this.b);
            lVar.q(this.k);
            lVar.m(this.e);
            lVar.i(this.h);
            lVar.n(this.g);
            lVar.o(this.f);
            this.i = lVar;
        }
        return this.i;
    }

    public final boolean b() {
        b820 b820Var = this.i;
        return b820Var != null && b820Var.isShowing();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        b820 a2 = a();
        a2.r(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a2.p(i);
            a2.s(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.b = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.show();
    }
}
