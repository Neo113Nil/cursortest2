package defpackage;

import android.view.View;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rbm implements View.OnLayoutChangeListener {
    public final /* synthetic */ wgm a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dlm d;
    public final /* synthetic */ BlazeMomentsPlayerStyle e;
    public final /* synthetic */ boolean f;

    public rbm(wgm wgmVar, int i, int i2, dlm dlmVar, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, boolean z) {
        this.a = wgmVar;
        this.b = i;
        this.c = i2;
        this.d = dlmVar;
        this.e = blazeMomentsPlayerStyle;
        this.f = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        mm3 mm3Var;
        view.removeOnLayoutChangeListener(this);
        mm3 mm3Var2 = new mm3();
        wgm wgmVar = this.a;
        mm3Var2.e(wgmVar.a);
        int top = wgmVar.t.getTop();
        int bottom = wgmVar.F.getBottom() + this.b;
        boolean z = this.f;
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = this.e;
        dlm dlmVar = this.d;
        if (top >= bottom) {
            mm3Var2.g(wgmVar.x.getId(), 4, wgmVar.F.getId(), 4, this.c);
            mm3Var = mm3Var2;
            mm3Var.g(wgmVar.q.getId(), 4, wgmVar.F.getId(), 4, this.c);
            int id = wgmVar.F.getId();
            int i9 = dlm.o;
            dlmVar.b(mm3Var, blazeMomentsPlayerStyle, id, 7);
        } else {
            mm3Var = mm3Var2;
            dlm.l(dlmVar, mm3Var, blazeMomentsPlayerStyle, z);
        }
        dlmVar.d(mm3Var, z);
        mm3Var.a(wgmVar.a);
    }
}
