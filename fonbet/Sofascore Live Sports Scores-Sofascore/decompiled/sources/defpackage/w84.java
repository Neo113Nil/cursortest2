package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w84 {
    public final boolean a;
    public final AtomicReference b = new AtomicReference(null);
    public final xnh c = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    public w84(boolean z) {
        this.a = z;
    }
}
