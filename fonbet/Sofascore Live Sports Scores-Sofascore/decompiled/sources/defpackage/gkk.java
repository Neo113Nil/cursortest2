package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gkk extends o41 {
    public final Object i;

    public gkk(wj9 wj9Var, Object obj) {
        super(Collections.EMPTY_LIST);
        j(wj9Var);
        this.i = obj;
    }

    @Override // defpackage.o41
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.o41
    public final Object e() {
        wj9 wj9Var = this.e;
        Object obj = this.i;
        float f = this.d;
        return wj9Var.C(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, obj, obj, f, f, f);
    }

    @Override // defpackage.o41
    public final Object f(nja njaVar, float f) {
        return e();
    }

    @Override // defpackage.o41
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // defpackage.o41
    public final void i(float f) {
        this.d = f;
    }
}
