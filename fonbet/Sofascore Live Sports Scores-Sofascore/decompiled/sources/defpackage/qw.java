package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qw implements oug {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qw(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.oug
    public final float a(float f) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                sw swVar = (sw) obj2;
                float i2 = swVar.J.i(f);
                float h = i2 - ((xnh) swVar.J.f).h();
                ((ax) obj).a(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return h;
            default:
                svg svgVar = (svg) obj2;
                if (Math.abs(f) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ((Boolean) svgVar.h.invoke()).booleanValue()) {
                    return svgVar.d(svgVar.g(((qvg) obj).a(2, svgVar.e(svgVar.h(f)))));
                }
                throw new s78("The fling animation was cancelled", 0);
        }
    }
}
