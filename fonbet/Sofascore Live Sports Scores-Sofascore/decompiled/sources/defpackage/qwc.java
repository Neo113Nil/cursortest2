package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qwc extends ccc {
    public final dad f;
    public final g62 g;
    public g9i h;

    public qwc(svg svgVar, dad dadVar, sc3 sc3Var, kx4 kx4Var) {
        super(svgVar, sc3Var, kx4Var);
        this.f = dadVar;
        this.g = ml4.g(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(qwc qwcVar, fsf fsfVar, csf csfVar, svg svgVar, fsf fsfVar2, long j, sq3 sq3Var) {
        pwc pwcVar;
        int i;
        svg svgVar2;
        fsf fsfVar3;
        qwc qwcVar2;
        fsf fsfVar4;
        csf csfVar2;
        mwc mwcVar;
        boolean z;
        if (sq3Var instanceof pwc) {
            pwcVar = (pwc) sq3Var;
            int i2 = pwcVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pwcVar.x = i2 - Integer.MIN_VALUE;
                Object obj = pwcVar.w;
                lu3 lu3Var = lu3.a;
                i = pwcVar.x;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    if (j < 0) {
                        return Boolean.FALSE;
                    }
                    ppa ppaVar = new ppa(qwcVar, rq3Var, 18);
                    pwcVar.r = qwcVar;
                    pwcVar.s = fsfVar;
                    pwcVar.t = csfVar;
                    svgVar2 = svgVar;
                    pwcVar.u = svgVar2;
                    fsfVar3 = fsfVar2;
                    pwcVar.v = fsfVar3;
                    pwcVar.x = 1;
                    obj = wba.V(j, ppaVar, pwcVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    qwcVar2 = qwcVar;
                    fsfVar4 = fsfVar;
                    csfVar2 = csfVar;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fsf fsfVar5 = pwcVar.v;
                    svg svgVar3 = pwcVar.u;
                    csfVar2 = pwcVar.t;
                    fsfVar4 = pwcVar.s;
                    qwc qwcVar3 = pwcVar.r;
                    y6a.M(obj);
                    fsfVar3 = fsfVar5;
                    svgVar2 = svgVar3;
                    qwcVar2 = qwcVar3;
                }
                mwcVar = (mwc) obj;
                if (mwcVar == null) {
                    boolean z2 = ((mwc) fsfVar4.a).c;
                    long j2 = mwcVar.a;
                    fsfVar4.a = new mwc(z2, j2, mwcVar.b);
                    csfVar2.a = svgVar2.i(svgVar2.e(j2));
                    fsfVar3.a = t62.a(30, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    fp4 fp4Var = (fp4) qwcVar2.e;
                    long j3 = mwcVar.b;
                    long j4 = mwcVar.a;
                    ((xmk) fp4Var.b).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                    ((xmk) fp4Var.c).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                    z = !aik.W(csfVar2.a);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        pwcVar = new pwc(sq3Var);
        Object obj2 = pwcVar.w;
        lu3 lu3Var2 = lu3.a;
        i = pwcVar.x;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        mwcVar = (mwc) obj2;
        if (mwcVar == null) {
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static mwc o(g62 g62Var) {
        mwc mwcVar = null;
        w4h a = b5h.a(new kj6(new kwc(g62Var, 0), 0 == true ? 1 : 0, 3));
        while (a.hasNext()) {
            mwc mwcVar2 = (mwc) a.next();
            if (mwcVar != null) {
                mwcVar2 = mwcVar.a(mwcVar2);
            }
            mwcVar = mwcVar2;
        }
        return mwcVar;
    }

    public final float k(qvg qvgVar, float f) {
        svg svgVar = (svg) this.b;
        long h = svgVar.h(svgVar.d(f));
        svg svgVar2 = qvgVar.a;
        return svgVar.g(svgVar.e(svgVar2.c(svgVar2.k, h, 1)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x015d, code lost:
    
        if (r0.invoke(r1, r10) != r11) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(svg svgVar, mwc mwcVar, float f, float f2, sq3 sq3Var) {
        nwc nwcVar;
        int i;
        csf csfVar;
        float f3;
        svg svgVar2;
        long i2;
        qwc qwcVar = this;
        fp4 fp4Var = (fp4) qwcVar.e;
        if (sq3Var instanceof nwc) {
            nwcVar = (nwc) sq3Var;
            int i3 = nwcVar.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nwcVar.w = i3 - Integer.MIN_VALUE;
                nwc nwcVar2 = nwcVar;
                Object obj = nwcVar2.u;
                lu3 lu3Var = lu3.a;
                i = nwcVar2.w;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    g.a = mwcVar;
                    long j = mwcVar.b;
                    long j2 = mwcVar.a;
                    ((xmk) fp4Var.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((xmk) fp4Var.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
                    mwc o = o(qwcVar.g);
                    if (o != null) {
                        long j3 = o.b;
                        long j4 = o.a;
                        ((xmk) fp4Var.b).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                        ((xmk) fp4Var.c).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                        g.a = ((mwc) g.a).a(o);
                    }
                    csf csfVar2 = new csf();
                    float g2 = svgVar.g(svgVar.e(((mwc) g.a).a));
                    csfVar2.a = g2;
                    if (aik.W(g2)) {
                        return Unit.a;
                    }
                    fsf fsfVar = new fsf();
                    fsfVar.a = t62.a(30, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    qwcVar = this;
                    owc owcVar = new owc(csfVar2, fsfVar, g, f, qwcVar, f2, svgVar, null);
                    nwcVar2.r = svgVar;
                    nwcVar2.s = csfVar2;
                    nwcVar2.t = f2;
                    nwcVar2.w = 1;
                    if (qwcVar.j(owcVar, nwcVar2) != lu3Var) {
                        csfVar = csfVar2;
                        f3 = f2;
                        svgVar2 = svgVar;
                    }
                    return lu3Var;
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return Unit.a;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f3 = nwcVar2.t;
                csfVar = nwcVar2.s;
                svgVar2 = nwcVar2.r;
                y6a.M(obj);
                i2 = t6a.i(((xmk) fp4Var.b).b(Float.MAX_VALUE), ((xmk) fp4Var.c).b(Float.MAX_VALUE));
                if (i2 == 0) {
                    float d = svgVar2.d(Math.signum(csfVar.a)) * Math.min(Math.abs(csfVar.a) / 100.0f, f3) * 1000.0f;
                    if (d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        i2 = 0;
                    } else {
                        i2 = svgVar2.d == ewd.b ? t6a.i(d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : t6a.i(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d);
                    }
                }
                Function2 function2 = (Function2) qwcVar.c;
                vmk vmkVar = new vmk(i2);
                nwcVar2.r = null;
                nwcVar2.s = null;
                nwcVar2.w = 2;
            }
        }
        nwcVar = new nwc(qwcVar, sq3Var);
        nwc nwcVar22 = nwcVar;
        Object obj2 = nwcVar22.u;
        lu3 lu3Var2 = lu3.a;
        i = nwcVar22.w;
        if (i != 0) {
        }
        i2 = t6a.i(((xmk) fp4Var.b).b(Float.MAX_VALUE), ((xmk) fp4Var.c).b(Float.MAX_VALUE));
        if (i2 == 0) {
        }
        Function2 function22 = (Function2) qwcVar.c;
        vmk vmkVar2 = new vmk(i2);
        nwcVar22.r = null;
        nwcVar22.s = null;
        nwcVar22.w = 2;
    }

    public final boolean n(fze fzeVar) {
        long j;
        kx4 kx4Var = (kx4) this.d;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.b;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : kx4Var.H0(64.0f));
        float f2 = -(i > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : kx4Var.H0(64.0f));
        List list = fzeVar.a;
        dnd dndVar = new dnd(0L);
        int size = list.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            j = dndVar.a;
            if (i2 >= size) {
                break;
            }
            dndVar = new dnd(dnd.i(j, ((mze) list.get(i2)).j));
            i2++;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f) & 4294967295L);
        svg svgVar = (svg) this.b;
        float i3 = svgVar.i(svgVar.e(floatToRawIntBits));
        if (i3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            jvg jvgVar = svgVar.a;
            z = i3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? jvgVar.d() : jvgVar.c();
        }
        if (z) {
            return !(this.g.d(new mwc(false, floatToRawIntBits, ((mze) CollectionsKt.Y(fzeVar.a)).b)) instanceof fo2);
        }
        return this.a;
    }
}
