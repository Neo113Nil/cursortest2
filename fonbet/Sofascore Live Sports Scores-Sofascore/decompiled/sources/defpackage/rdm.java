package defpackage;

import com.ironsource.C4088g6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class rdm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4088g6 b;

    public /* synthetic */ rdm(C4088g6 c4088g6, int i) {
        this.a = i;
        this.b = c4088g6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4088g6 c4088g6 = this.b;
        switch (i) {
            case 0:
                C4088g6.a(c4088g6);
                break;
            case 1:
                C4088g6.d(c4088g6);
                break;
            case 2:
                C4088g6.c(c4088g6);
                break;
            case 3:
                C4088g6.f(c4088g6);
                break;
            case 4:
                C4088g6.b(c4088g6);
                break;
            default:
                C4088g6.e(c4088g6);
                break;
        }
    }
}
