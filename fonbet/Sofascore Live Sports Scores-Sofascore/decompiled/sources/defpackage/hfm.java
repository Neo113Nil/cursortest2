package defpackage;

import android.view.View;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hfm implements View.OnLayoutChangeListener {
    public final /* synthetic */ wgm a;
    public final /* synthetic */ dlm b;
    public final /* synthetic */ BlazeMomentsPlayerStyle c;
    public final /* synthetic */ boolean d;

    public hfm(wgm wgmVar, dlm dlmVar, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, boolean z) {
        this.a = wgmVar;
        this.b = dlmVar;
        this.c = blazeMomentsPlayerStyle;
        this.d = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        mm3 mm3Var = new mm3();
        wgm wgmVar = this.a;
        mm3Var.e(wgmVar.a);
        dlm dlmVar = this.b;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = this.c;
        boolean z = this.d;
        dlm.l(dlmVar, mm3Var, blazeMomentsPlayerStyle, z);
        dlmVar.d(mm3Var, z);
        mm3Var.a(wgmVar.a);
    }
}
