package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dw implements knh {
    public final /* synthetic */ dx a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ cw c;

    public dw(dx dxVar, Function1 function1, cw cwVar) {
        this.a = dxVar;
        this.b = function1;
        this.c = cwVar;
    }

    @Override // defpackage.knh
    public final float a(float f) {
        dx dxVar = this.a;
        float k = dxVar.k();
        Object p = zm2.p(dxVar.f(), k, f, this.b, this.c);
        if (!((Boolean) ((Function1) dxVar.b).invoke(p)).booleanValue()) {
            p = ((eoh) ((e1d) dxVar.d)).getValue();
        }
        return dxVar.f().c(p) - k;
    }

    @Override // defpackage.knh
    public final float b(float f, float f2) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
