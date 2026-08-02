package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class quj extends ccc {
    public final g62 f;
    public g9i g;

    public quj(svg svgVar, sc3 sc3Var, kx4 kx4Var) {
        super(svgVar, sc3Var, kx4Var);
        this.f = ml4.g(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ouj m(g62 g62Var) {
        ouj oujVar = null;
        w4h a = b5h.a(new kj6(new kwc(g62Var, 1), 0 == true ? 1 : 0, 3));
        while (a.hasNext()) {
            ouj oujVar2 = (ouj) a.next();
            if (oujVar != null) {
                oujVar2 = oujVar.a(oujVar2);
            }
            oujVar = oujVar2;
        }
        return oujVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00db, code lost:
    
        if (r0.invoke(r3, r7) != r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00dd, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        if (j(r0, r7) == r8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(svg svgVar, ouj oujVar, sq3 sq3Var) {
        puj pujVar;
        int i;
        fp4 fp4Var = (fp4) this.e;
        if (sq3Var instanceof puj) {
            pujVar = (puj) sq3Var;
            int i2 = pujVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pujVar.t = i2 - Integer.MIN_VALUE;
                puj pujVar2 = pujVar;
                Object obj = pujVar2.r;
                Object obj2 = lu3.a;
                i = pujVar2.t;
                if (i != 0) {
                    fsf g = lnb.g(obj);
                    g.a = oujVar;
                    long j = oujVar.b;
                    long j2 = oujVar.a;
                    ((xmk) fp4Var.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((xmk) fp4Var.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
                    ouj m = m(this.f);
                    if (m != null) {
                        long j3 = m.b;
                        long j4 = m.a;
                        ((xmk) fp4Var.b).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                        ((xmk) fp4Var.c).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                        g.a = ((ouj) g.a).a(m);
                    }
                    Function2 ajjVar = new ajj(this, svgVar, g, null, 4);
                    pujVar2.t = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Function2 function2 = (Function2) this.c;
                vmk vmkVar = new vmk(t6a.i(((xmk) fp4Var.b).b(Float.MAX_VALUE), ((xmk) fp4Var.c).b(Float.MAX_VALUE)));
                pujVar2.t = 2;
            }
        }
        pujVar = new puj(this, sq3Var);
        puj pujVar22 = pujVar;
        Object obj3 = pujVar22.r;
        Object obj22 = lu3.a;
        i = pujVar22.t;
        if (i != 0) {
        }
        Function2 function22 = (Function2) this.c;
        vmk vmkVar2 = new vmk(t6a.i(((xmk) fp4Var.b).b(Float.MAX_VALUE), ((xmk) fp4Var.c).b(Float.MAX_VALUE)));
        pujVar22.t = 2;
    }

    public final boolean l(fze fzeVar) {
        boolean z;
        boolean z2;
        boolean z3;
        g62 g62Var;
        svg svgVar = (svg) this.b;
        mze mzeVar = (mze) CollectionsKt.firstOrNull(fzeVar.a);
        if (mzeVar != null) {
            List list = mzeVar.m;
            if (list == null) {
                list = km5.a;
            }
            int size = list.size();
            int i = 0;
            z3 = false;
            while (true) {
                g62Var = this.f;
                if (i >= size) {
                    break;
                }
                gb9 gb9Var = (gb9) list.get(i);
                long j = gb9Var.d ^ (-9223372034707292160L);
                if (!(svgVar.i(svgVar.e(j)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                    z3 = !(g62Var.d(new ouj(false, j, gb9Var.a)) instanceof fo2) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = mzeVar.l ^ (-9223372034707292160L);
            boolean z4 = fzeVar.f == 12;
            if (!(svgVar.i(svgVar.e(j2)) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || z4) {
                if (!(g62Var.d(new ouj(z4, j2, mzeVar.b)) instanceof fo2) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.a) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
