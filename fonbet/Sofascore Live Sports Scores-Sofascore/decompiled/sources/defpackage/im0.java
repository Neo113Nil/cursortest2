package defpackage;

import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class im0 implements Serializable {
    public final boolean a;
    public final Drawable b;
    public final int c;
    public float d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    public im0(int i, Drawable drawable, boolean z) {
        this.a = z;
        this.b = drawable;
        this.c = i;
    }
}
