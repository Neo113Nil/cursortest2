package defpackage;

import com.ironsource.C4164kb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class pmm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4164kb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ pmm(C4164kb c4164kb, boolean z, int i) {
        this.a = i;
        this.b = c4164kb;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.c;
        C4164kb c4164kb = this.b;
        switch (i) {
            case 0:
                C4164kb.c(c4164kb, z);
                break;
            case 1:
                C4164kb.b(c4164kb, z);
                break;
            default:
                C4164kb.a(c4164kb, z);
                break;
        }
    }
}
