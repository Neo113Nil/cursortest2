package defpackage;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hzm implements View.OnLayoutChangeListener {
    public final /* synthetic */ asf a;
    public final /* synthetic */ vxm b;
    public final /* synthetic */ fsf c;

    public hzm(asf asfVar, vxm vxmVar, fsf fsfVar) {
        this.a = asfVar;
        this.b = vxmVar;
        this.c = fsfVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        if (!this.a.a) {
            this.b.invoke(view);
        }
        this.c.a = null;
    }
}
