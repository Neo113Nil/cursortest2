package defpackage;

import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class mb3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ mb3(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ComponentActivity componentActivity = this.b;
        switch (i) {
            case 0:
                int i2 = ComponentActivity.a;
                componentActivity.invalidateMenu();
                break;
            default:
                ComponentActivity.j(componentActivity);
                break;
        }
    }
}
