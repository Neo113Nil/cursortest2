package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ral {
    public final a4a f;
    public final a4a g;
    public final e1d a = e.f(Boolean.TRUE);
    public final e1d b = e.f(Boolean.FALSE);
    public final xnh c = e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final boh d = e.d(0);
    public final xnh e = e.b(1.0f);
    public long h = -1;
    public long i = -1;
    public long j = -1;
    public long k = -1;

    public ral(String str) {
        this.f = new a4a(str.concat(" source"));
        this.g = new a4a(str.concat(" target"));
    }
}
