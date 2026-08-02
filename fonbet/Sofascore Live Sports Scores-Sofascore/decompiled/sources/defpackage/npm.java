package defpackage;

import com.ironsource.C4195m6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class npm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4195m6 b;

    public /* synthetic */ npm(C4195m6 c4195m6, int i) {
        this.a = i;
        this.b = c4195m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4195m6 c4195m6 = this.b;
        switch (i) {
            case 0:
                C4195m6.a(c4195m6);
                break;
            default:
                C4195m6.b(c4195m6);
                break;
        }
    }
}
