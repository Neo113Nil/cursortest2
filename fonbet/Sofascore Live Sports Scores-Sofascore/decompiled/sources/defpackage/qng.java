package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qng extends rng {
    public final Path i;
    public final /* synthetic */ vng j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qng(vng vngVar, Path path, float f) {
        super(vngVar, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.j = vngVar;
        this.i = path;
    }

    @Override // defpackage.rng, defpackage.d2a
    public final void B(String str) {
        vng vngVar = this.j;
        if (vngVar.u0()) {
            tng tngVar = (tng) vngVar.c;
            if (tngVar.b) {
                ((Canvas) vngVar.a).drawTextOnPath(str, this.i, this.f, this.g, tngVar.d);
            }
            tng tngVar2 = (tng) vngVar.c;
            if (tngVar2.c) {
                ((Canvas) vngVar.a).drawTextOnPath(str, this.i, this.f, this.g, tngVar2.e);
            }
        }
        this.f = ((tng) vngVar.c).d.measureText(str) + this.f;
    }
}
