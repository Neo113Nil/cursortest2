package defpackage;

import com.ironsource.C4359v9;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class uym implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4359v9 b;

    public /* synthetic */ uym(C4359v9 c4359v9, int i) {
        this.a = i;
        this.b = c4359v9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4359v9 c4359v9 = this.b;
        switch (i) {
            case 0:
                C4359v9.b(c4359v9);
                break;
            case 1:
                C4359v9.a(c4359v9);
                break;
            case 2:
                C4359v9.c(c4359v9);
                break;
            default:
                C4359v9.d(c4359v9);
                break;
        }
    }
}
