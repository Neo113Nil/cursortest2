package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class z94 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ aa4 g;

    public z94(aa4 aa4Var, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.g = aa4Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.b.onActivityLayout(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
