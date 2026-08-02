package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.state.State;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.adv;
import xsna.av8;
import xsna.bv8;
import xsna.dra;
import xsna.dv8;
import xsna.ftk0;
import xsna.nor0;
import xsna.t33;
import xsna.wu8;
import xsna.xru;
import xsna.xx40;
import xsna.xym;
import xsna.yu8;
import xsna.ztp0;

/* compiled from: ConstraintSetParser.java */
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: ConstraintSetParser.java */
    public static class a implements InterfaceC0017b {
        public boolean a;
        public String b;
        public String c;
        public float d;
        public float e;

        @Override // androidx.constraintlayout.core.state.b.InterfaceC0017b
        public final float value() {
            float f = this.d;
            if (f >= this.e) {
                this.a = true;
            }
            if (!this.a) {
                this.d = f + 1.0f;
            }
            return this.d;
        }
    }

    /* compiled from: ConstraintSetParser.java */
    /* renamed from: androidx.constraintlayout.core.state.b$b, reason: collision with other inner class name */
    public interface InterfaceC0017b {
        float value();
    }

    /* compiled from: ConstraintSetParser.java */
    public static class c implements InterfaceC0017b {
        public float a;
        public float b;

        @Override // androidx.constraintlayout.core.state.b.InterfaceC0017b
        public final float value() {
            float f = this.b + this.a;
            this.b = f;
            return f;
        }
    }

    /* compiled from: ConstraintSetParser.java */
    public static class d {
        public HashMap<String, Integer> a;
        public HashMap<String, InterfaceC0017b> b;
        public HashMap<String, ArrayList<String>> c;

        public final float a(yu8 yu8Var) {
            HashMap<String, Integer> hashMap = this.a;
            HashMap<String, InterfaceC0017b> hashMap2 = this.b;
            if (!(yu8Var instanceof dv8)) {
                return yu8Var instanceof av8 ? ((av8) yu8Var).j() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            String i = ((dv8) yu8Var).i();
            return hashMap2.containsKey(i) ? hashMap2.get(i).value() : hashMap.containsKey(i) ? hashMap.get(i).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(androidx.constraintlayout.core.state.a aVar, d dVar, State state, String str, bv8 bv8Var) throws CLParsingException {
        char c2;
        long j;
        char c3;
        char c4;
        str.getClass();
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1364013995:
                if (str.equals(TtmlNode.CENTER)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 113126854:
                if (str.equals("width")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                String v = bv8Var.v(str);
                androidx.constraintlayout.core.state.a b = v.equals("parent") ? state.b(0) : state.b(v);
                aVar.p(b);
                aVar.e(b);
                return;
            case 1:
                String v2 = bv8Var.v(str);
                androidx.constraintlayout.core.state.a b2 = v2.equals("parent") ? state.b(0) : state.b(v2);
                aVar.o(b2);
                aVar.i(b2);
                aVar.p(b2);
                aVar.e(b2);
                return;
            case 2:
                yu8 t = bv8Var.t(str);
                bv8 bv8Var2 = t instanceof bv8 ? (bv8) t : null;
                if (bv8Var2 == null) {
                    return;
                }
                Iterator<String> it = bv8Var2.y().iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    yu8 q = bv8Var2.q(next);
                    if (q instanceof av8) {
                        float j2 = q.j();
                        if (aVar.j0 == null) {
                            aVar.j0 = new HashMap<>();
                        }
                        aVar.j0.put(next, Float.valueOf(j2));
                    } else if (q instanceof dv8) {
                        String i = q.i();
                        if (i.startsWith("#")) {
                            String substring = i.substring(1);
                            if (substring.length() == 6) {
                                substring = "FF".concat(substring);
                            }
                            j = Long.parseLong(substring, 16);
                        } else {
                            j = -1;
                        }
                        if (j != -1) {
                            aVar.i0.put(next, Integer.valueOf((int) j));
                        }
                    }
                }
                return;
            case 3:
                aVar.z = dVar.a(bv8Var.q(str));
                return;
            case 4:
                aVar.A = dVar.a(bv8Var.q(str));
                return;
            case 5:
                aVar.B = dVar.a(bv8Var.q(str));
                return;
            case 6:
                aVar.C = state.a.b(dVar.a(bv8Var.q(str)));
                return;
            case 7:
                aVar.D = state.a.b(dVar.a(bv8Var.q(str)));
                return;
            case '\b':
                aVar.E = state.a.b(dVar.a(bv8Var.q(str)));
                return;
            case '\t':
                aVar.f0 = d(bv8Var, str, state, state.a);
                return;
            case '\n':
                yu8 q2 = bv8Var.q(str);
                if (q2 instanceof bv8) {
                    bv8 bv8Var3 = (bv8) q2;
                    ztp0 ztp0Var = new ztp0();
                    ztp0Var.a = new int[10];
                    ztp0Var.b = new int[10];
                    ztp0Var.c = 0;
                    ztp0Var.d = new int[10];
                    ztp0Var.e = new float[10];
                    ztp0Var.f = 0;
                    ztp0Var.g = new int[5];
                    ztp0Var.h = new String[5];
                    ztp0Var.i = 0;
                    Iterator<String> it2 = bv8Var3.y().iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        next2.getClass();
                        switch (next2.hashCode()) {
                            case -1897525331:
                                if (next2.equals("stagger")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1310311125:
                                if (next2.equals("easing")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1285003983:
                                if (next2.equals("quantize")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -791482387:
                                if (next2.equals("pathArc")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -236944793:
                                if (next2.equals("relativeTo")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                ztp0Var.a(bv8Var3.r(next2), 600);
                                continue;
                            case 1:
                                ztp0Var.c(603, bv8Var3.v(next2));
                                continue;
                            case 2:
                                yu8 q3 = bv8Var3.q(next2);
                                if (q3 instanceof wu8) {
                                    wu8 wu8Var = (wu8) q3;
                                    int size = wu8Var.f.size();
                                    if (size <= 0) {
                                        break;
                                    } else {
                                        ztp0Var.b(610, wu8Var.getInt(0));
                                        if (size <= 1) {
                                            break;
                                        } else {
                                            ztp0Var.c(611, wu8Var.u(1));
                                            if (size > 2) {
                                                ztp0Var.a(wu8Var.getFloat(2), 602);
                                            }
                                        }
                                    }
                                } else {
                                    yu8 q4 = bv8Var3.q(next2);
                                    if (q4 == null) {
                                        StringBuilder a2 = t33.a("no int found for key <", next2, ">, found [");
                                        a2.append(q4.l());
                                        a2.append("] : ");
                                        a2.append(q4);
                                        throw new CLParsingException(a2.toString(), bv8Var3);
                                    }
                                    ztp0Var.b(610, q4.k());
                                }
                            case 3:
                                String v3 = bv8Var3.v(next2);
                                String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= 6) {
                                        i2 = -1;
                                    } else if (!strArr[i2].equals(v3)) {
                                        i2++;
                                    }
                                }
                                if (i2 != -1) {
                                    ztp0Var.b(IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, i2);
                                    break;
                                } else {
                                    System.err.println("0 pathArc = '" + v3 + "'");
                                    break;
                                }
                            case 4:
                                ztp0Var.c(605, bv8Var3.v(next2));
                                break;
                        }
                    }
                    aVar.getClass();
                    return;
                }
                return;
            case 11:
                aVar.x = dVar.a(bv8Var.q(str));
                return;
            case '\f':
                aVar.y = dVar.a(bv8Var.q(str));
                return;
            case '\r':
                aVar.G = dVar.a(bv8Var.q(str));
                return;
            case 14:
                aVar.H = dVar.a(bv8Var.q(str));
                return;
            case 15:
                float a3 = dVar.a(bv8Var.q(str));
                if (!state.b) {
                    a3 = 1.0f - a3;
                }
                aVar.h = a3;
                return;
            case 16:
                aVar.g = dVar.a(bv8Var.q(str));
                return;
            case 17:
                aVar.F = dVar.a(bv8Var.q(str));
                return;
            case 18:
                aVar.h = dVar.a(bv8Var.q(str));
                return;
            case 19:
                aVar.i = dVar.a(bv8Var.q(str));
                return;
            case 20:
                aVar.e0 = d(bv8Var, str, state, state.a);
                return;
            case 21:
                aVar.f = dVar.a(bv8Var.q(str));
                return;
            case 22:
                String v4 = bv8Var.v(str);
                androidx.constraintlayout.core.state.a b3 = v4.equals("parent") ? state.b(0) : state.b(v4);
                aVar.o(b3);
                aVar.i(b3);
                return;
            case 23:
                String v5 = bv8Var.v(str);
                v5.getClass();
                switch (v5.hashCode()) {
                    case -1901805651:
                        if (v5.equals("invisible")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 3178655:
                        if (v5.equals("gone")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 466743410:
                        if (v5.equals("visible")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                switch (c4) {
                    case 0:
                        aVar.I = 4;
                        aVar.F = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        return;
                    case 1:
                        aVar.I = 8;
                        return;
                    case 2:
                        aVar.I = 0;
                        return;
                    default:
                        return;
                }
            default:
                c(aVar, dVar, state, str, bv8Var);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(int i, ftk0 ftk0Var, d dVar, wu8 wu8Var) throws CLParsingException {
        String i2;
        dra draVar = i == 0 ? (adv) ftk0Var.e(State.Helper.HORIZONTAL_CHAIN) : (nor0) ftk0Var.e(State.Helper.VERTICAL_CHAIN);
        yu8 p = wu8Var.p(1);
        if (p instanceof wu8) {
            wu8 wu8Var2 = (wu8) p;
            if (wu8Var2.f.size() < 1) {
                return;
            }
            for (int i3 = 0; i3 < wu8Var2.f.size(); i3++) {
                draVar.q(wu8Var2.u(i3));
            }
            if (wu8Var.f.size() > 2) {
                yu8 p2 = wu8Var.p(2);
                if (p2 instanceof bv8) {
                    bv8 bv8Var = (bv8) p2;
                    Iterator<String> it = bv8Var.y().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        next.getClass();
                        if (next.equals(TtmlNode.TAG_STYLE)) {
                            yu8 q = bv8Var.q(next);
                            if (q instanceof wu8) {
                                wu8 wu8Var3 = (wu8) q;
                                if (wu8Var3.f.size() > 1) {
                                    i2 = wu8Var3.u(0);
                                    draVar.n0 = wu8Var3.getFloat(1);
                                    i2.getClass();
                                    if (!i2.equals("packed")) {
                                        draVar.t0 = State.Chain.PACKED;
                                    } else if (i2.equals("spread_inside")) {
                                        draVar.t0 = State.Chain.SPREAD_INSIDE;
                                    } else {
                                        draVar.t0 = State.Chain.SPREAD;
                                    }
                                }
                            }
                            i2 = q.i();
                            i2.getClass();
                            if (!i2.equals("packed")) {
                            }
                        } else {
                            c(draVar, dVar, ftk0Var, next, bv8Var);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00ec. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r21v0, types: [androidx.constraintlayout.core.state.a] */
    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.constraintlayout.core.state.State] */
    public static void c(androidx.constraintlayout.core.state.a aVar, d dVar, State state, String str, bv8 bv8Var) throws CLParsingException {
        androidx.constraintlayout.core.state.a b;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = state.b;
        yu8 t = bv8Var.t(str);
        wu8 wu8Var = t instanceof wu8 ? (wu8) t : null;
        ?? r16 = -1;
        r16 = -1;
        r16 = -1;
        r16 = -1;
        if (wu8Var == null || wu8Var.f.size() <= 1) {
            String w = bv8Var.w(str);
            if (w != null) {
                b = w.equals("parent") ? state.b(0) : state.b(w);
                str.getClass();
                switch (str) {
                    case "baseline":
                        state.a(aVar.a);
                        state.a(b.a);
                        aVar.d0 = State.Constraint.BASELINE_TO_BASELINE;
                        aVar.X = b;
                        break;
                    case "bottom":
                        aVar.e(b);
                        break;
                    case "end":
                        if (!z5) {
                            aVar.d0 = State.Constraint.LEFT_TO_LEFT;
                            aVar.J = b;
                            break;
                        } else {
                            aVar.d0 = State.Constraint.RIGHT_TO_RIGHT;
                            aVar.M = b;
                            break;
                        }
                    case "top":
                        aVar.p(b);
                        break;
                    case "start":
                        if (!z5) {
                            aVar.d0 = State.Constraint.RIGHT_TO_RIGHT;
                            aVar.M = b;
                            break;
                        } else {
                            aVar.d0 = State.Constraint.LEFT_TO_LEFT;
                            aVar.J = b;
                            break;
                        }
                }
            }
            return;
        }
        String u = wu8Var.u(0);
        yu8 s = wu8Var.s(1);
        String i = s instanceof dv8 ? s.i() : null;
        int size = wu8Var.f.size();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float b2 = size > 2 ? state.a.b(dVar.a(wu8Var.s(2))) : 0.0f;
        float b3 = wu8Var.f.size() > 3 ? state.a.b(dVar.a(wu8Var.s(3))) : 0.0f;
        androidx.constraintlayout.core.state.a b4 = u.equals("parent") ? state.b(0) : state.b(u);
        str.getClass();
        switch (str.hashCode()) {
            case -1720785339:
                if (str.equals("baseline")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 100571:
                if (str.equals(TtmlNode.END)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 115029:
                if (str.equals("top")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3317767:
                if (str.equals(TtmlNode.LEFT)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 108511772:
                if (str.equals(TtmlNode.RIGHT)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                z = true;
                c3 = 2;
                i.getClass();
                switch (i) {
                    case "baseline":
                        state.a(aVar.a);
                        state.a(b4.a);
                        aVar.d0 = State.Constraint.BASELINE_TO_BASELINE;
                        aVar.X = b4;
                        break;
                    case "bottom":
                        state.a(aVar.a);
                        aVar.d0 = State.Constraint.BASELINE_TO_BOTTOM;
                        aVar.Z = b4;
                        break;
                    case "top":
                        state.a(aVar.a);
                        aVar.d0 = State.Constraint.BASELINE_TO_TOP;
                        aVar.Y = b4;
                        break;
                }
                z2 = z;
                z3 = false;
                break;
            case 1:
                z = true;
                float a2 = dVar.a(wu8Var.p(1));
                if (wu8Var.f.size() > 2) {
                    f = state.a.b(dVar.a(wu8Var.s(2)));
                }
                aVar.a0 = aVar.j(b4);
                aVar.b0 = a2;
                aVar.c0 = f;
                aVar.d0 = State.Constraint.CIRCULAR_CONSTRAINT;
                c3 = 2;
                z2 = z;
                z3 = false;
                break;
            case 2:
                i.getClass();
                switch (i) {
                    case "baseline":
                        state.a(b4.a);
                        aVar.d0 = State.Constraint.BOTTOM_TO_BASELINE;
                        aVar.W = b4;
                        break;
                    case "bottom":
                        aVar.e(b4);
                        break;
                    case "top":
                        aVar.d0 = State.Constraint.BOTTOM_TO_TOP;
                        aVar.U = b4;
                        break;
                }
                z = true;
                c3 = 2;
                z2 = z;
                z3 = false;
                break;
            case 3:
                z2 = !z5;
                z = true;
                c3 = 2;
                z3 = true;
                break;
            case 4:
                i.getClass();
                switch (i) {
                    case "baseline":
                        state.a(b4.a);
                        aVar.d0 = State.Constraint.TOP_TO_BASELINE;
                        aVar.T = b4;
                        break;
                    case "bottom":
                        aVar.d0 = State.Constraint.TOP_TO_BOTTOM;
                        aVar.S = b4;
                        break;
                    case "top":
                        aVar.p(b4);
                        break;
                }
                z = true;
                c3 = 2;
                z2 = z;
                z3 = false;
                break;
            case 5:
                z2 = true;
                z = true;
                c3 = 2;
                z3 = true;
                break;
            case 6:
                z2 = false;
                z = true;
                c3 = 2;
                z3 = true;
                break;
            case 7:
                z2 = z5;
                z = true;
                c3 = 2;
                z3 = true;
                break;
            default:
                z = true;
                c3 = 2;
                z2 = z;
                z3 = false;
                break;
        }
        if (z3) {
            i.getClass();
            switch (i.hashCode()) {
                case 100571:
                    if (i.equals(TtmlNode.END)) {
                        r16 = 0;
                        break;
                    }
                    break;
                case 108511772:
                    if (i.equals(TtmlNode.RIGHT)) {
                        r16 = z;
                        break;
                    }
                    break;
                case 109757538:
                    if (i.equals("start")) {
                        r16 = c3;
                        break;
                    }
                    break;
            }
            switch (r16) {
                case 0:
                    z4 = !z5;
                    break;
                case 1:
                    z4 = false;
                    break;
                case 2:
                    z4 = z5;
                    break;
                default:
                    z4 = z;
                    break;
            }
            if (z2) {
                if (z4) {
                    aVar.d0 = State.Constraint.LEFT_TO_LEFT;
                    aVar.J = b4;
                } else {
                    aVar.d0 = State.Constraint.LEFT_TO_RIGHT;
                    aVar.K = b4;
                }
            } else if (z4) {
                aVar.d0 = State.Constraint.RIGHT_TO_LEFT;
                aVar.L = b4;
            } else {
                aVar.d0 = State.Constraint.RIGHT_TO_RIGHT;
                aVar.M = b4;
            }
        }
        aVar.l(Float.valueOf(b2)).n(Float.valueOf(b3));
    }

    public static xym d(bv8 bv8Var, String str, State state, xx40 xx40Var) throws CLParsingException {
        yu8 q = bv8Var.q(str);
        xym b = xym.b(0);
        if (q instanceof dv8) {
            return e(q.i());
        }
        if (q instanceof av8) {
            return xym.b(state.c(Float.valueOf(xx40Var.b(bv8Var.r(str)))));
        }
        if (q instanceof bv8) {
            bv8 bv8Var2 = (bv8) q;
            String w = bv8Var2.w("value");
            if (w != null) {
                b = e(w);
            }
            yu8 t = bv8Var2.t(UcumUtils.UCUM_MINUTES);
            if (t != null) {
                if (t instanceof av8) {
                    int c2 = state.c(Float.valueOf(xx40Var.b(((av8) t).j())));
                    if (c2 >= 0) {
                        b.a = c2;
                    }
                } else if (t instanceof dv8) {
                    b.a = -2;
                }
            }
            yu8 t2 = bv8Var2.t(InneractiveMediationNameConsts.MAX);
            if (t2 != null) {
                if (t2 instanceof av8) {
                    int c3 = state.c(Float.valueOf(xx40Var.b(((av8) t2).j())));
                    if (b.b >= 0) {
                        b.b = c3;
                        return b;
                    }
                } else if ((t2 instanceof dv8) && b.g) {
                    b.f = xym.i;
                    b.b = Integer.MAX_VALUE;
                }
            }
        }
        return b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static xym e(String str) {
        xym b = xym.b(0);
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c2 = 0;
                    break;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    c2 = 1;
                    break;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        String str2 = xym.i;
        String str3 = xym.j;
        switch (c2) {
            case 0:
                return xym.c(str2);
            case 1:
                return new xym(xym.k);
            case 2:
                return xym.c(str3);
            case 3:
                return new xym(str2);
            default:
                if (str.endsWith("%")) {
                    float parseFloat = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
                    xym xymVar = new xym(xym.l);
                    xymVar.c = parseFloat;
                    xymVar.g = true;
                    xymVar.b = 0;
                    return xymVar;
                }
                if (!str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                    return b;
                }
                xym xymVar2 = new xym(xym.m);
                xymVar2.e = str;
                xymVar2.f = str3;
                xymVar2.g = true;
                return xymVar2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void f(int i, State state, String str, bv8 bv8Var) throws CLParsingException {
        char c2;
        char c3;
        ArrayList<String> y = bv8Var.y();
        androidx.constraintlayout.core.state.a b = state.b(str);
        if (i == 0) {
            state.d(0, str);
        } else {
            state.d(1, str);
        }
        boolean z = state.b || i == 0;
        xru xruVar = (xru) b.c;
        Iterator<String> it = y.iterator();
        boolean z2 = false;
        boolean z3 = true;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        while (it.hasNext()) {
            String next = it.next();
            next.getClass();
            switch (next.hashCode()) {
                case -678927291:
                    if (next.equals("percent")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (next.equals(TtmlNode.END)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3317767:
                    if (next.equals(TtmlNode.LEFT)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 108511772:
                    if (next.equals(TtmlNode.RIGHT)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (next.equals("start")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    yu8 t = bv8Var.t(next);
                    wu8 wu8Var = t instanceof wu8 ? (wu8) t : null;
                    if (wu8Var != null) {
                        if (wu8Var.f.size() > 1) {
                            String u = wu8Var.u(0);
                            float f2 = wu8Var.getFloat(1);
                            u.getClass();
                            switch (u.hashCode()) {
                                case 100571:
                                    if (u.equals(TtmlNode.END)) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3317767:
                                    if (u.equals(TtmlNode.LEFT)) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 108511772:
                                    if (u.equals(TtmlNode.RIGHT)) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 109757538:
                                    if (u.equals("start")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    z3 = !z;
                                    break;
                                case 1:
                                    z3 = true;
                                    f = f2;
                                    z2 = true;
                                    continue;
                                case 2:
                                    z3 = false;
                                    break;
                                case 3:
                                    z3 = z;
                                    break;
                            }
                            f = f2;
                        }
                        z2 = true;
                        break;
                    } else {
                        f = bv8Var.r(next);
                        z2 = true;
                        z3 = true;
                        break;
                    }
                    break;
                case 1:
                    f = state.a.b(bv8Var.r(next));
                    z3 = !z;
                    break;
                case 2:
                    f = state.a.b(bv8Var.r(next));
                    z3 = true;
                    break;
                case 3:
                    f = state.a.b(bv8Var.r(next));
                    z3 = false;
                    break;
                case 4:
                    f = state.a.b(bv8Var.r(next));
                    z3 = z;
                    break;
            }
        }
        if (z2) {
            if (z3) {
                xruVar.d = -1;
                xruVar.e = -1;
                xruVar.f = f;
                return;
            } else {
                xruVar.d = -1;
                xruVar.e = -1;
                xruVar.f = 1.0f - f;
                return;
            }
        }
        if (z3) {
            xruVar.d = xruVar.a.c(Float.valueOf(f));
            xruVar.e = -1;
            xruVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            Float valueOf = Float.valueOf(f);
            xruVar.d = -1;
            xruVar.e = xruVar.a.c(valueOf);
            xruVar.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public static void g(ftk0 ftk0Var, d dVar, String str, bv8 bv8Var) throws CLParsingException {
        androidx.constraintlayout.core.state.a b = ftk0Var.b(str);
        xym xymVar = b.e0;
        String str2 = xym.i;
        if (xymVar == null) {
            b.e0 = new xym(str2);
        }
        if (b.f0 == null) {
            b.f0 = new xym(str2);
        }
        Iterator<String> it = bv8Var.y().iterator();
        while (it.hasNext()) {
            a(b, dVar, ftk0Var, it.next(), bv8Var);
        }
    }
}
