package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lm3e;", "Lbuc;", "Lo3e;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class m3e extends buc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final Function1 e;

    public m3e(float f, float f2, float f3, float f4, Function1 function1) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = function1;
        boolean z = true;
        boolean z2 = (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.isNaN(f)) & (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.isNaN(f2)) & (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.isNaN(f3));
        if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            p3a.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.buc
    public final wtc c() {
        o3e o3eVar = new o3e();
        o3eVar.o = this.a;
        o3eVar.p = this.b;
        o3eVar.q = this.c;
        o3eVar.r = this.d;
        o3eVar.s = true;
        return o3eVar;
    }

    public final boolean equals(Object obj) {
        m3e m3eVar = obj instanceof m3e ? (m3e) obj : null;
        return m3eVar != null && p75.b(this.a, m3eVar.a) && p75.b(this.b, m3eVar.b) && p75.b(this.c, m3eVar.c) && p75.b(this.d, m3eVar.d);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        o3e o3eVar = (o3e) wtcVar;
        o3eVar.o = this.a;
        o3eVar.p = this.b;
        o3eVar.q = this.c;
        o3eVar.r = this.d;
        o3eVar.s = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + fc6.a(this.d, fc6.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
