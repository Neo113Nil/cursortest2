package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m implements View.OnAttachStateChangeListener {
    public final /* synthetic */ u a;
    public final /* synthetic */ n b;

    public m(n nVar, u uVar) {
        this.b = nVar;
        this.a = uVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        u uVar = this.a;
        Fragment fragment = uVar.c;
        uVar.i();
        h.j((ViewGroup) fragment.mView.getParent(), this.b.a).i();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
