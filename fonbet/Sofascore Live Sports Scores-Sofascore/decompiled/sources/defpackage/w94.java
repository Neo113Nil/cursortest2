package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w94 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ aa4 d;

    public /* synthetic */ w94(aa4 aa4Var, String str, Bundle bundle, int i) {
        this.a = i;
        this.d = aa4Var;
        this.b = str;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bundle bundle = this.c;
        String str = this.b;
        aa4 aa4Var = this.d;
        switch (i) {
            case 0:
                aa4Var.b.extraCallback(str, bundle);
                break;
            default:
                aa4Var.b.onPostMessage(str, bundle);
                break;
        }
    }
}
