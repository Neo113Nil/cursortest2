package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.internal.playcore_hsdp.zzf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y0p implements d2o {
    public final i1k a;
    public final Activity b;

    public y0p(Activity activity, Intent intent) {
        this.b = activity;
        if (zzf.a(activity)) {
            this.a = new i1k(activity.getApplicationContext(), "HpoaService", intent, new e2f(18));
        } else {
            this.a = null;
        }
    }
}
