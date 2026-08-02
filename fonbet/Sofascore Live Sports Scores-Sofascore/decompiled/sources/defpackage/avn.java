package defpackage;

import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class avn implements atn {
    public static avn d;
    public float a;
    public rrn b;
    public tsn c;

    public static avn a() {
        avn avnVar = d;
        if (avnVar != null) {
            return avnVar;
        }
        new hrn();
        new yrn();
        avn avnVar2 = new avn();
        avnVar2.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        d = avnVar2;
        return avnVar2;
    }

    @Override // defpackage.atn
    public final void zzd(boolean z) {
        if (z) {
            j0o.f.getClass();
            j0o.b();
            return;
        }
        j0o.f.getClass();
        Handler handler = j0o.h;
        if (handler != null) {
            handler.removeCallbacks(j0o.j);
            j0o.h = null;
        }
    }
}
