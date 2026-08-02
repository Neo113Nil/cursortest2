package defpackage;

import com.unity3d.services.UnityAdsConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo29;", "Lbuc;", "Llhh;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class o29 extends buc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final uah g;
    public final boolean h;
    public final long i;
    public final long j;
    public final int k;

    public o29(float f, float f2, float f3, float f4, float f5, long j, uah uahVar, boolean z, long j2, long j3, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = j;
        this.g = uahVar;
        this.h = z;
        this.i = j2;
        this.j = j3;
        this.k = i;
    }

    @Override // defpackage.buc
    public final wtc c() {
        lhh lhhVar = new lhh();
        lhhVar.o = this.a;
        lhhVar.p = this.b;
        lhhVar.q = this.c;
        lhhVar.r = this.d;
        lhhVar.s = this.e;
        lhhVar.t = 8.0f;
        lhhVar.u = this.f;
        lhhVar.v = this.g;
        lhhVar.w = this.h;
        lhhVar.x = this.i;
        lhhVar.y = this.j;
        lhhVar.z = this.k;
        lhhVar.A = 3;
        lhhVar.B = new xjd(lhhVar, 8);
        return lhhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o29)) {
            return false;
        }
        o29 o29Var = (o29) obj;
        if (Float.compare(this.a, o29Var.a) != 0 || Float.compare(this.b, o29Var.b) != 0 || Float.compare(this.c, o29Var.c) != 0 || Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0 || Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0 || Float.compare(this.d, o29Var.d) != 0 || Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0 || Float.compare(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0 || Float.compare(this.e, o29Var.e) != 0 || Float.compare(8.0f, 8.0f) != 0 || !xvj.a(this.f, o29Var.f) || !Intrinsics.c(this.g, o29Var.g) || this.h != o29Var.h) {
            return false;
        }
        long j = o29Var.i;
        int i = r13.j;
        return e8k.a(this.i, j) && e8k.a(this.j, o29Var.j) && this.k == o29Var.k;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        wdd wddVar;
        lhh lhhVar = (lhh) wtcVar;
        lhhVar.o = this.a;
        lhhVar.p = this.b;
        lhhVar.q = this.c;
        lhhVar.r = this.d;
        lhhVar.s = this.e;
        lhhVar.t = 8.0f;
        lhhVar.u = this.f;
        lhhVar.v = this.g;
        lhhVar.w = this.h;
        lhhVar.x = this.i;
        lhhVar.y = this.j;
        lhhVar.z = this.k;
        lhhVar.A = 3;
        xjd xjdVar = lhhVar.B;
        if (lhhVar.a.n && (wddVar = c6o.a0(lhhVar, 2).p) != null) {
            wddVar.D1(xjdVar, true);
        }
    }

    public final int hashCode() {
        int a = fc6.a(8.0f, fc6.a(this.e, fc6.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fc6.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fc6.a(this.d, fc6.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fc6.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fc6.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = xvj.c;
        int e = dmi.e((this.g.hashCode() + ljg.c(a, 31, this.f)) * 31, 961, this.h);
        int i2 = r13.j;
        d8k d8kVar = e8k.b;
        return wv8.a(3, wv8.a(this.k, ljg.c(ljg.c(e, 31, this.i), 31, this.j), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.a);
        sb.append(", scaleY=");
        sb.append(this.b);
        sb.append(", alpha=");
        sb.append(this.c);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.d);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.e);
        sb.append(", cameraDistance=8.0, transformOrigin=");
        sb.append((Object) xvj.b(this.f));
        sb.append(", shape=");
        sb.append(this.g);
        sb.append(", clip=");
        sb.append(this.h);
        sb.append(", renderEffect=null, ambientShadowColor=");
        vxd.q(this.i, ", spotShadowColor=", sb);
        vxd.q(this.j, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.k + ')'));
        sb.append(", blendMode=");
        sb.append((Object) rfo.P(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
