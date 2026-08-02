package defpackage;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class f4f implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ z02 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public f4f(View view, z02 z02Var, int i, String str) {
        this.a = view;
        this.b = z02Var;
        this.c = i;
        this.d = str;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        this.a.removeOnAttachStateChangeListener(this);
        z02 z02Var = this.b;
        ed edVar = (ed) z02Var.d;
        g6b t = qea.t((ComposeView) edVar.c);
        if (t != null) {
            zsk zskVar = new zsk(t, 30);
            zskVar.b((ComposeView) edVar.c, new lc6(z02Var, this.c, this.d), null);
            z02Var.e = zskVar;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
