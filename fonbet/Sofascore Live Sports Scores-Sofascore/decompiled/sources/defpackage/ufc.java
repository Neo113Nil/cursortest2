package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ufc extends qcb implements dfc {
    public static final Method D;
    public de0 C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // defpackage.dfc
    public final void c(vec vecVar, MenuItem menuItem) {
        de0 de0Var = this.C;
        if (de0Var != null) {
            de0Var.c(vecVar, menuItem);
        }
    }

    @Override // defpackage.dfc
    public final void h(vec vecVar, efc efcVar) {
        de0 de0Var = this.C;
        if (de0Var != null) {
            de0Var.h(vecVar, efcVar);
        }
    }

    @Override // defpackage.qcb
    public final qc5 p(Context context, boolean z) {
        tfc tfcVar = new tfc(context, z);
        tfcVar.setHoverListener(this);
        return tfcVar;
    }
}
