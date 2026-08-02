package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xec implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, xfc {
    public vec a;
    public xm b;
    public lcb c;

    @Override // defpackage.xfc
    public final void b(vec vecVar, boolean z) {
        xm xmVar;
        if ((z || vecVar == this.a) && (xmVar = this.b) != null) {
            xmVar.dismiss();
        }
    }

    @Override // defpackage.xfc
    public final boolean k(vec vecVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        vec vecVar = this.a;
        lcb lcbVar = this.c;
        kcb kcbVar = lcbVar.f;
        if (kcbVar == null) {
            kcbVar = new kcb(lcbVar);
            lcbVar.f = kcbVar;
        }
        vecVar.q(kcbVar.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.b(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        vec vecVar = this.a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                vecVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return vecVar.performShortcut(i, keyEvent, 0);
    }
}
