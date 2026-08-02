package defpackage;

import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class q53 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u53 b;
    public final /* synthetic */ lcd c;
    public final /* synthetic */ pkk d;

    public /* synthetic */ q53(u53 u53Var, lcd lcdVar, pkk pkkVar, int i) {
        this.a = i;
        this.b = u53Var;
        this.c = lcdVar;
        this.d = pkkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        pkk pkkVar = this.d;
        lcd lcdVar = this.c;
        u53 u53Var = this.b;
        switch (i) {
            case 0:
                u53Var.d(lcdVar, pkkVar);
                break;
            default:
                u53Var.d(lcdVar, pkkVar);
                break;
        }
    }
}
