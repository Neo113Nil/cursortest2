package defpackage;

import androidx.compose.runtime.e;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pp3 {
    public final zo5 a;
    public final of6 b;
    public final xnh c;
    public kkh d;

    public pp3(zo5 zo5Var, of6 of6Var, float f, kkh kkhVar) {
        this.a = zo5Var;
        this.b = of6Var;
        this.c = e.b(f);
        this.d = kkhVar;
    }

    public /* synthetic */ pp3(zo5 zo5Var, of6 of6Var, int i) {
        this(zo5Var, of6Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (i & 8) != 0 ? l98.G(3) : null);
    }
}
