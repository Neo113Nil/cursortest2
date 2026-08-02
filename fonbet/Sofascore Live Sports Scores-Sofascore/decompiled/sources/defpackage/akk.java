package defpackage;

import com.ironsource.Va;
import com.unity3d.mediation.LevelPlayAdError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class akk implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LevelPlayAdError b;
    public final /* synthetic */ Va c;

    public /* synthetic */ akk(Va va, LevelPlayAdError levelPlayAdError) {
        this.c = va;
        this.b = levelPlayAdError;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Va va = this.c;
        LevelPlayAdError levelPlayAdError = this.b;
        switch (i) {
            case 0:
                Va.a(va, levelPlayAdError);
                break;
            default:
                Va.a(levelPlayAdError, va);
                break;
        }
    }

    public /* synthetic */ akk(LevelPlayAdError levelPlayAdError, Va va) {
        this.b = levelPlayAdError;
        this.c = va;
    }
}
