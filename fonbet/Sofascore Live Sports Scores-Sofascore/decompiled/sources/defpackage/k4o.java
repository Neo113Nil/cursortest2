package defpackage;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.internal.ads.zzelq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class k4o extends zzelq {
    public Activity a;
    public zzm b;
    public String c;
    public String d;

    public final l4o a() {
        Activity activity = this.a;
        if (activity != null) {
            return new l4o(activity, this.b, this.c, this.d);
        }
        a70.r("Missing required properties: activity");
        return null;
    }
}
