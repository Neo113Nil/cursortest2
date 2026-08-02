package defpackage;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pfc implements PopupWindow.OnDismissListener {
    public final /* synthetic */ qfc a;

    public pfc(qfc qfcVar) {
        this.a = qfcVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
