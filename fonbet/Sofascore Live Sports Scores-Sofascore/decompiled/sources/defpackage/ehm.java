package defpackage;

import com.ironsource.C4111hb;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class ehm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C4111hb b;
    public final /* synthetic */ LevelPlayAdInfo c;

    public /* synthetic */ ehm(C4111hb c4111hb, LevelPlayAdInfo levelPlayAdInfo, int i) {
        this.a = i;
        this.b = c4111hb;
        this.c = levelPlayAdInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        LevelPlayAdInfo levelPlayAdInfo = this.c;
        C4111hb c4111hb = this.b;
        switch (i) {
            case 0:
                C4111hb.b(c4111hb, levelPlayAdInfo);
                break;
            default:
                C4111hb.a(c4111hb, levelPlayAdInfo);
                break;
        }
    }
}
