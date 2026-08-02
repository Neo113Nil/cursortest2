package defpackage;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class hye implements View.OnScrollChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ hye(o8 o8Var, int i) {
        this.a = i;
        this.b = o8Var;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        int i5 = this.a;
        o8 o8Var = this.b;
        switch (i5) {
            case 0:
                pye pyeVar = (pye) o8Var;
                if (pyeVar.y != 1) {
                    pyeVar.x = i;
                    break;
                } else {
                    pyeVar.w = i;
                    break;
                }
            case 1:
                p6j p6jVar = (p6j) o8Var;
                boolean z = i > 0;
                if (p6jVar.i != z) {
                    p6jVar.i = z;
                    bu1 bu1Var = p6jVar.d;
                    if (!z) {
                        tgj.G((View) bu1Var.f, 100L, 2);
                        break;
                    } else {
                        tgj.E((View) bu1Var.f, 100L, null, 14);
                        break;
                    }
                }
                break;
            default:
                dvj.j((dvj) o8Var, i);
                break;
        }
    }
}
