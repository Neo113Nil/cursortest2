package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, y {

    /* renamed from: a, reason: collision with root package name */
    public f0 f514a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.appcompat.app.l f515b;

    /* renamed from: c, reason: collision with root package name */
    public j f516c;

    @Override // androidx.appcompat.view.menu.y
    public final boolean c(n nVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        f0 f0Var = this.f514a;
        j jVar = this.f516c;
        if (jVar.f507f == null) {
            jVar.f507f = new i(jVar);
        }
        f0Var.performItemAction(jVar.f507f.getItem(i5), 0);
    }

    @Override // androidx.appcompat.view.menu.y
    public final void onCloseMenu(n nVar, boolean z5) {
        androidx.appcompat.app.l lVar;
        if ((z5 || nVar == this.f514a) && (lVar = this.f515b) != null) {
            lVar.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f516c.onCloseMenu(this.f514a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i5, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        f0 f0Var = this.f514a;
        if (i5 == 82 || i5 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f515b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f515b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                f0Var.close(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return f0Var.performShortcut(i5, keyEvent, 0);
    }
}
