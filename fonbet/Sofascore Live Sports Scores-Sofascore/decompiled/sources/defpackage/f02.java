package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f02 extends zz1 {
    public final Boolean a;
    public final x9l b;
    public Window c;
    public boolean d;

    public f02(View view, x9l x9lVar) {
        this.b = x9lVar;
        qzb qzbVar = BottomSheetBehavior.C(view).j;
        ColorStateList backgroundTintList = qzbVar != null ? qzbVar.b.c : view.getBackgroundTintList();
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(o3a.H(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList r = eq3.r(view.getBackground());
        Integer valueOf = r != null ? Integer.valueOf(r.getDefaultColor()) : null;
        if (valueOf != null) {
            this.a = Boolean.valueOf(o3a.H(valueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.zz1
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.zz1
    public final void b(View view) {
        d(view);
    }

    @Override // defpackage.zz1
    public final void c(int i, View view) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        x9l x9lVar = this.b;
        if (top < x9lVar.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                boolean booleanValue = bool == null ? this.d : bool.booleanValue();
                bka bkaVar = new bka(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new aal(window, bkaVar) : i >= 30 ? new z9l(window, bkaVar) : new y9l(window, bkaVar)).C(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), x9lVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                bka bkaVar2 = new bka(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new aal(window2, bkaVar2) : i2 >= 30 ? new z9l(window2, bkaVar2) : new y9l(window2, bkaVar2)).C(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            this.d = new bal(window, window.getDecorView()).a.y();
        }
    }
}
