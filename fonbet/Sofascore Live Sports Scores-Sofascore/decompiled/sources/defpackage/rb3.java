package defpackage;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class rb3 implements zpd {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ rb3(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // defpackage.zpd
    public final void a(ComponentActivity componentActivity) {
        int i = this.a;
        ComponentActivity componentActivity2 = this.b;
        switch (i) {
            case 0:
                ComponentActivity.g(componentActivity2, componentActivity);
                break;
            default:
                int i2 = FragmentActivity.g;
                wn8 wn8Var = (wn8) ((FragmentActivity) componentActivity2).b.a;
                wn8Var.d.b(wn8Var, wn8Var, null);
                break;
        }
    }
}
