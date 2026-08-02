package defpackage;

import com.ironsource.C4432za;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LevelPlayAdInfo b;
    public final /* synthetic */ C4432za c;

    public /* synthetic */ r1n(LevelPlayAdInfo levelPlayAdInfo, C4432za c4432za, int i) {
        this.a = i;
        this.b = levelPlayAdInfo;
        this.c = c4432za;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        C4432za c4432za = this.c;
        LevelPlayAdInfo levelPlayAdInfo = this.b;
        switch (i) {
            case 0:
                C4432za.c(levelPlayAdInfo, c4432za);
                break;
            case 1:
                C4432za.e(levelPlayAdInfo, c4432za);
                break;
            case 2:
                C4432za.d(levelPlayAdInfo, c4432za);
                break;
            case 3:
                C4432za.a(levelPlayAdInfo, c4432za);
                break;
            default:
                C4432za.b(levelPlayAdInfo, c4432za);
                break;
        }
    }
}
