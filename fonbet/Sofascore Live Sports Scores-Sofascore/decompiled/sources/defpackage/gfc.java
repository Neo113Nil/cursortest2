package defpackage;

import android.content.Context;
import android.view.ActionProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gfc implements ActionProvider.VisibilityListener {
    public final Context a;
    public by9 b;
    public final ActionProvider c;

    public gfc(jfc jfcVar, Context context, ActionProvider actionProvider) {
        this.a = context;
        this.c = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        by9 by9Var = this.b;
        if (by9Var != null) {
            vec vecVar = ((efc) by9Var.a).n;
            vecVar.h = true;
            vecVar.p(true);
        }
    }
}
