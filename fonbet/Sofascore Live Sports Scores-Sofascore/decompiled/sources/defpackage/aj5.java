package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class aj5 {
    public static final i4k a;
    public static final i4k b;
    public static final i4k c;

    static {
        h74 h74Var = new h74(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6f, 1.0f);
        a = new i4k(120, jg5.a, 2);
        b = new i4k(150, h74Var, 2);
        c = new i4k(120, h74Var, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0017, code lost:
    
        if ((r10 instanceof defpackage.rd8) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0033, code lost:
    
        if ((r9 instanceof defpackage.rd8) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q50 q50Var, float f, i7a i7aVar, i7a i7aVar2, sq3 sq3Var) {
        i4k i4kVar;
        i4k i4kVar2 = null;
        if (i7aVar2 != null) {
            boolean z = i7aVar2 instanceof l6f;
            i4kVar = a;
            if (!z) {
                if (!(i7aVar2 instanceof m95)) {
                    if (!(i7aVar2 instanceof sf9)) {
                    }
                }
            }
            i4kVar2 = i4kVar;
        } else if (i7aVar != null) {
            boolean z2 = i7aVar instanceof l6f;
            i4kVar = b;
            if (!z2 && !(i7aVar instanceof m95)) {
                if (i7aVar instanceof sf9) {
                    i4kVar2 = c;
                }
            }
            i4kVar2 = i4kVar;
        }
        i4k i4kVar3 = i4kVar2;
        if (i4kVar3 != null) {
            Object a2 = q50.a(q50Var, new p75(f), i4kVar3, null, sq3Var, 12);
            return a2 == lu3.a ? a2 : Unit.a;
        }
        Object f2 = q50Var.f(sq3Var, new p75(f));
        return f2 == lu3.a ? f2 : Unit.a;
    }
}
