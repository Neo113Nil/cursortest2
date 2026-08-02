package defpackage;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class djm implements View.OnLayoutChangeListener {
    public final /* synthetic */ efm a;
    public final /* synthetic */ nsl b;

    public djm(efm efmVar, nsl nslVar) {
        this.a = efmVar;
        this.b = nslVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        efm.l(this.a, this.b);
    }
}
