package defpackage;

import com.unity3d.ads.core.domain.adquality.AndroidInitializeAdQuality;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class c10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ c10(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String reportLoadFailure$lambda$3;
        int i = this.a;
        Throwable th = this.b;
        switch (i) {
            case 0:
                reportLoadFailure$lambda$3 = AndroidInitializeAdQuality.reportLoadFailure$lambda$3(th);
                break;
            case 1:
                ljd ljdVar = ljd.a;
                break;
            default:
                cam camVar = cam.a;
                break;
        }
        return th;
    }
}
