package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x2 extends s2 implements t2 {
    public static final Method E;
    public h9.c D;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // androidx.appcompat.widget.t2
    public final void c(androidx.appcompat.view.menu.n nVar, androidx.appcompat.view.menu.p pVar) {
        h9.c cVar = this.D;
        if (cVar != null) {
            cVar.c(nVar, pVar);
        }
    }

    @Override // androidx.appcompat.widget.t2
    public final void g(androidx.appcompat.view.menu.n nVar, MenuItem menuItem) {
        h9.c cVar = this.D;
        if (cVar != null) {
            cVar.g(nVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.s2
    public final g2 n(Context context, boolean z5) {
        w2 w2Var = new w2(context, z5);
        w2Var.setHoverListener(this);
        return w2Var;
    }
}
