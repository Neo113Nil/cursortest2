package defpackage;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jhm implements View.OnLayoutChangeListener {
    public final /* synthetic */ dlm a;
    public final /* synthetic */ nsl b;

    public jhm(dlm dlmVar, nsl nslVar) {
        this.a = dlmVar;
        this.b = nslVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        dlm.m(this.a, this.b);
    }
}
