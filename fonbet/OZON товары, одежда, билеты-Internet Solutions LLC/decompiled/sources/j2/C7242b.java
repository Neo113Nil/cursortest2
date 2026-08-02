package j2;

import B90.C2603e;
import E0.C2942q;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e2.C6253A;
import h2.q;
import i2.C6998a;
import i2.C7000c;
import i2.h;
import j2.f;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k2.i;
import k2.j;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* renamed from: j2.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7242b {

    /* renamed from: j2.b$a */
    static class a implements InterfaceC1127b {

        /* renamed from: a, reason: collision with root package name */
        boolean f68865a;

        /* renamed from: b, reason: collision with root package name */
        String f68866b;

        /* renamed from: c, reason: collision with root package name */
        String f68867c;

        /* renamed from: d, reason: collision with root package name */
        float f68868d;

        /* renamed from: e, reason: collision with root package name */
        float f68869e;

        @Override // j2.C7242b.InterfaceC1127b
        public final float value() {
            float f7 = this.f68868d;
            if (f7 >= this.f68869e) {
                this.f68865a = true;
            }
            if (!this.f68865a) {
                this.f68868d = f7 + 1.0f;
            }
            return this.f68868d;
        }
    }

    /* renamed from: j2.b$b, reason: collision with other inner class name */
    interface InterfaceC1127b {
        float value();
    }

    /* renamed from: j2.b$c */
    static class c implements InterfaceC1127b {

        /* renamed from: a, reason: collision with root package name */
        float f68870a;

        /* renamed from: b, reason: collision with root package name */
        float f68871b;

        @Override // j2.C7242b.InterfaceC1127b
        public final float value() {
            float f7 = this.f68871b + this.f68870a;
            this.f68871b = f7;
            return f7;
        }
    }

    /* renamed from: j2.b$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        HashMap<String, Integer> f68872a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        HashMap<String, InterfaceC1127b> f68873b = new HashMap<>();

        /* renamed from: c, reason: collision with root package name */
        HashMap<String, ArrayList<String>> f68874c = new HashMap<>();

        final float a(C7000c c7000c) {
            if (!(c7000c instanceof h)) {
                if (c7000c instanceof i2.e) {
                    return ((i2.e) c7000c).c();
                }
                return 0.0f;
            }
            String b11 = ((h) c7000c).b();
            HashMap<String, InterfaceC1127b> hashMap = this.f68873b;
            if (hashMap.containsKey(b11)) {
                return hashMap.get(b11).value();
            }
            HashMap<String, Integer> hashMap2 = this.f68872a;
            if (hashMap2.containsKey(b11)) {
                return hashMap2.get(b11).floatValue();
            }
            return 0.0f;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0177, code lost:
    
        if (r0.equals("visible") == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(C6253A c6253a, i2.f fVar, C7241a c7241a, d dVar, String str) throws i2.g {
        char c11;
        long j11;
        char c12;
        char c13 = 2;
        str.getClass();
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1364013995:
                if (str.equals(RichContentDTO.ALIGN_CENTER)) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            case 113126854:
                if (str.equals("width")) {
                    c11 = 20;
                    break;
                }
                c11 = 65535;
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    c11 = 21;
                    break;
                }
                c11 = 65535;
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    c11 = 22;
                    break;
                }
                c11 = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c11 = 23;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                String v11 = fVar.v(str);
                C7241a c14 = v11.equals("parent") ? c6253a.c(0) : c6253a.c(v11);
                c7241a.F(c14);
                c7241a.g(c14);
                break;
            case 1:
                String v12 = fVar.v(str);
                C7241a c15 = v12.equals("parent") ? c6253a.c(0) : c6253a.c(v12);
                c7241a.D(c15);
                c7241a.m(c15);
                c7241a.F(c15);
                c7241a.g(c15);
                break;
            case 2:
                C7000c t2 = fVar.t(str);
                i2.f fVar2 = t2 instanceof i2.f ? (i2.f) t2 : null;
                if (fVar2 != null) {
                    Iterator<String> it = fVar2.z().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        C7000c m11 = fVar2.m(next);
                        if (m11 instanceof i2.e) {
                            c7241a.e(next, m11.c());
                        } else if (m11 instanceof h) {
                            String b11 = m11.b();
                            if (b11.startsWith("#")) {
                                String substring = b11.substring(1);
                                if (substring.length() == 6) {
                                    substring = "FF".concat(substring);
                                }
                                j11 = Long.parseLong(substring, 16);
                            } else {
                                j11 = -1;
                            }
                            if (j11 != -1) {
                                c7241a.d((int) j11, next);
                            }
                        }
                    }
                    break;
                }
                break;
            case 3:
                c7241a.f68863z = dVar.a(fVar.m(str));
                break;
            case 4:
                c7241a.f68802A = dVar.a(fVar.m(str));
                break;
            case 5:
                c7241a.f68803B = dVar.a(fVar.m(str));
                break;
            case 6:
                c7241a.f68804C = i(c6253a, dVar.a(fVar.m(str)));
                break;
            case 7:
                c7241a.f68805D = i(c6253a, dVar.a(fVar.m(str)));
                break;
            case '\b':
                c7241a.f68806E = i(c6253a, dVar.a(fVar.m(str)));
                break;
            case '\t':
                c7241a.f68839f0 = d(fVar, str, c6253a, c6253a.e());
                break;
            case '\n':
                C7000c m12 = fVar.m(str);
                if (m12 instanceof i2.f) {
                    i2.f fVar3 = (i2.f) m12;
                    q qVar = new q();
                    Iterator<String> it2 = fVar3.z().iterator();
                    while (it2.hasNext()) {
                        String next2 = it2.next();
                        next2.getClass();
                        switch (next2.hashCode()) {
                            case -1897525331:
                                if (next2.equals("stagger")) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1310311125:
                                if (next2.equals("easing")) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1285003983:
                                if (next2.equals("quantize")) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -791482387:
                                if (next2.equals("pathArc")) {
                                    c12 = 3;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -236944793:
                                if (next2.equals("relativeTo")) {
                                    c12 = 4;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            default:
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                            case 0:
                                qVar.a(fVar3.o(next2), 600);
                                break;
                            case 1:
                                qVar.c(603, fVar3.v(next2));
                                break;
                            case 2:
                                C7000c m13 = fVar3.m(next2);
                                if (!(m13 instanceof C6998a)) {
                                    qVar.b(610, fVar3.q(next2));
                                    break;
                                } else {
                                    C6998a c6998a = (C6998a) m13;
                                    int size = c6998a.size();
                                    if (size <= 0) {
                                        break;
                                    } else {
                                        qVar.b(610, c6998a.getInt(0));
                                        if (size <= 1) {
                                            break;
                                        } else {
                                            qVar.c(611, c6998a.u(1));
                                            if (size <= 2) {
                                                break;
                                            } else {
                                                qVar.a(c6998a.getFloat(2), 602);
                                                break;
                                            }
                                        }
                                    }
                                }
                            case 3:
                                String v13 = fVar3.v(next2);
                                String[] strArr = {DevicePublicKeyStringDef.NONE, "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= 6) {
                                        i11 = -1;
                                    } else if (!strArr[i11].equals(v13)) {
                                        i11++;
                                    }
                                }
                                if (i11 != -1) {
                                    qVar.b(607, i11);
                                    break;
                                } else {
                                    System.err.println("0 pathArc = '" + v13 + "'");
                                    break;
                                }
                            case 4:
                                qVar.c(605, fVar3.v(next2));
                                break;
                        }
                    }
                    c7241a.getClass();
                    break;
                }
                break;
            case 11:
                c7241a.f68861x = dVar.a(fVar.m(str));
                break;
            case '\f':
                c7241a.f68862y = dVar.a(fVar.m(str));
                break;
            case '\r':
                c7241a.f68808G = dVar.a(fVar.m(str));
                break;
            case 14:
                c7241a.f68809H = dVar.a(fVar.m(str));
                break;
            case 15:
                float a11 = dVar.a(fVar.m(str));
                if (c6253a.j()) {
                    a11 = 1.0f - a11;
                }
                c7241a.f68842h = a11;
                break;
            case 16:
                c7241a.f68840g = dVar.a(fVar.m(str));
                break;
            case 17:
                c7241a.f68807F = dVar.a(fVar.m(str));
                break;
            case 18:
                c7241a.f68842h = dVar.a(fVar.m(str));
                break;
            case 19:
                c7241a.f68844i = dVar.a(fVar.m(str));
                break;
            case 20:
                c7241a.f68837e0 = d(fVar, str, c6253a, c6253a.e());
                break;
            case 21:
                c7241a.f68838f = dVar.a(fVar.m(str));
                break;
            case 22:
                String v14 = fVar.v(str);
                C7241a c16 = v14.equals("parent") ? c6253a.c(0) : c6253a.c(v14);
                c7241a.D(c16);
                c7241a.m(c16);
                break;
            case 23:
                String v15 = fVar.v(str);
                v15.getClass();
                switch (v15.hashCode()) {
                    case -1901805651:
                        if (v15.equals("invisible")) {
                            c13 = 0;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 3178655:
                        if (v15.equals("gone")) {
                            c13 = 1;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 466743410:
                        break;
                    default:
                        c13 = 65535;
                        break;
                }
                switch (c13) {
                    case 0:
                        c7241a.f68810I = 4;
                        c7241a.f68807F = 0.0f;
                        break;
                    case 1:
                        c7241a.f68810I = 8;
                        break;
                    case 2:
                        c7241a.f68810I = 0;
                        break;
                }
            default:
                c(c6253a, fVar, c7241a, dVar, str);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void b(int i11, C6253A c6253a, d dVar, C6998a c6998a) throws i2.g {
        String b11;
        k2.d dVar2 = i11 == 0 ? (i) c6253a.h(f.d.HORIZONTAL_CHAIN) : (j) c6253a.h(f.d.VERTICAL_CHAIN);
        C7000c l11 = c6998a.l(1);
        if (l11 instanceof C6998a) {
            C6998a c6998a2 = (C6998a) l11;
            if (c6998a2.size() < 1) {
                return;
            }
            for (int i12 = 0; i12 < c6998a2.size(); i12++) {
                dVar2.H(c6998a2.u(i12));
            }
            if (c6998a.size() > 2) {
                C7000c l12 = c6998a.l(2);
                if (l12 instanceof i2.f) {
                    i2.f fVar = (i2.f) l12;
                    Iterator<String> it = fVar.z().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        next.getClass();
                        if (next.equals("style")) {
                            C7000c m11 = fVar.m(next);
                            if (m11 instanceof C6998a) {
                                C6998a c6998a3 = (C6998a) m11;
                                if (c6998a3.size() > 1) {
                                    b11 = c6998a3.u(0);
                                    dVar2.M(c6998a3.getFloat(1));
                                    b11.getClass();
                                    if (!b11.equals("packed")) {
                                        dVar2.R(f.a.PACKED);
                                    } else if (b11.equals("spread_inside")) {
                                        dVar2.R(f.a.SPREAD_INSIDE);
                                    } else {
                                        dVar2.R(f.a.SPREAD);
                                    }
                                }
                            }
                            b11 = m11.b();
                            b11.getClass();
                            if (!b11.equals("packed")) {
                            }
                        } else {
                            c(c6253a, fVar, dVar2, dVar, next);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x00f6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r22v0, types: [e2.A, j2.f] */
    /* JADX WARN: Type inference failed for: r24v0, types: [j2.a] */
    static void c(C6253A c6253a, i2.f fVar, C7241a c7241a, d dVar, String str) throws i2.g {
        C7241a c11;
        char c12;
        boolean z11;
        char c13;
        boolean z12;
        boolean z13;
        ?? r13;
        boolean j11 = c6253a.j();
        boolean z14 = !j11;
        C7000c t2 = fVar.t(str);
        C6998a c6998a = t2 instanceof C6998a ? (C6998a) t2 : null;
        if (c6998a == null || c6998a.size() <= 1) {
            String w11 = fVar.w(str);
            if (w11 != null) {
                c11 = w11.equals("parent") ? c6253a.c(0) : c6253a.c(w11);
                str.getClass();
                switch (str) {
                    case "baseline":
                        c6253a.b(c7241a.getKey());
                        c6253a.b(c11.getKey());
                        c7241a.f68835d0 = f.b.BASELINE_TO_BASELINE;
                        c7241a.f68825X = c11;
                        break;
                    case "bottom":
                        c7241a.g(c11);
                        break;
                    case "end":
                        if (!j11) {
                            c7241a.f68835d0 = f.b.RIGHT_TO_RIGHT;
                            c7241a.f68814M = c11;
                            break;
                        } else {
                            c7241a.f68835d0 = f.b.LEFT_TO_LEFT;
                            c7241a.f68811J = c11;
                            break;
                        }
                    case "top":
                        c7241a.F(c11);
                        break;
                    case "start":
                        if (!j11) {
                            c7241a.f68835d0 = f.b.LEFT_TO_LEFT;
                            c7241a.f68811J = c11;
                            break;
                        } else {
                            c7241a.f68835d0 = f.b.RIGHT_TO_RIGHT;
                            c7241a.f68814M = c11;
                            break;
                        }
                }
            }
            return;
        }
        String u11 = c6998a.u(0);
        C7000c s11 = c6998a.s(1);
        String b11 = s11 instanceof h ? s11.b() : null;
        float p11 = c6998a.size() > 2 ? C6253A.p((C6253A) c6253a.e().f3144a, dVar.a(c6998a.s(2))) : 0.0f;
        float p12 = c6998a.size() > 3 ? C6253A.p((C6253A) c6253a.e().f3144a, dVar.a(c6998a.s(3))) : 0.0f;
        C7241a c14 = u11.equals("parent") ? c6253a.c(0) : c6253a.c(u11);
        str.getClass();
        switch (str.hashCode()) {
            case -1720785339:
                if (str.equals("baseline")) {
                    c12 = 0;
                    break;
                }
                c12 = 65535;
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    c12 = 1;
                    break;
                }
                c12 = 65535;
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c12 = 2;
                    break;
                }
                c12 = 65535;
                break;
            case 100571:
                if (str.equals("end")) {
                    c12 = 3;
                    break;
                }
                c12 = 65535;
                break;
            case 115029:
                if (str.equals("top")) {
                    c12 = 4;
                    break;
                }
                c12 = 65535;
                break;
            case 3317767:
                if (str.equals("left")) {
                    c12 = 5;
                    break;
                }
                c12 = 65535;
                break;
            case 108511772:
                if (str.equals("right")) {
                    c12 = 6;
                    break;
                }
                c12 = 65535;
                break;
            case 109757538:
                if (str.equals("start")) {
                    c12 = 7;
                    break;
                }
                c12 = 65535;
                break;
            default:
                c12 = 65535;
                break;
        }
        switch (c12) {
            case 0:
                z11 = true;
                c13 = 2;
                b11.getClass();
                switch (b11) {
                    case "baseline":
                        c6253a.b(c7241a.getKey());
                        c6253a.b(c14.getKey());
                        c7241a.f68835d0 = f.b.BASELINE_TO_BASELINE;
                        c7241a.f68825X = c14;
                        break;
                    case "bottom":
                        c6253a.b(c7241a.getKey());
                        c7241a.f68835d0 = f.b.BASELINE_TO_BOTTOM;
                        c7241a.f68827Z = c14;
                        break;
                    case "top":
                        c6253a.b(c7241a.getKey());
                        c7241a.f68835d0 = f.b.BASELINE_TO_TOP;
                        c7241a.f68826Y = c14;
                        break;
                }
                z12 = z11;
                z13 = false;
                break;
            case 1:
                z11 = true;
                c7241a.i(c14, dVar.a(c6998a.l(1)), c6998a.size() > 2 ? C6253A.p((C6253A) c6253a.e().f3144a, dVar.a(c6998a.s(2))) : 0.0f);
                c13 = 2;
                z12 = z11;
                z13 = false;
                break;
            case 2:
                b11.getClass();
                switch (b11) {
                    case "baseline":
                        c6253a.b(c14.getKey());
                        c7241a.f68835d0 = f.b.BOTTOM_TO_BASELINE;
                        c7241a.f68824W = c14;
                        break;
                    case "bottom":
                        c7241a.g(c14);
                        break;
                    case "top":
                        c7241a.h(c14);
                        break;
                }
                z11 = true;
                c13 = 2;
                z12 = z11;
                z13 = false;
                break;
            case 3:
                z12 = j11;
                z11 = true;
                c13 = 2;
                z13 = true;
                break;
            case 4:
                b11.getClass();
                switch (b11) {
                    case "baseline":
                        c6253a.b(c14.getKey());
                        c7241a.f68835d0 = f.b.TOP_TO_BASELINE;
                        c7241a.f68821T = c14;
                        break;
                    case "bottom":
                        c7241a.E(c14);
                        break;
                    case "top":
                        c7241a.F(c14);
                        break;
                }
                z11 = true;
                c13 = 2;
                z12 = z11;
                z13 = false;
                break;
            case 5:
                z12 = true;
                z11 = true;
                c13 = 2;
                z13 = true;
                break;
            case 6:
                z12 = false;
                z11 = true;
                c13 = 2;
                z13 = true;
                break;
            case 7:
                z12 = z14;
                z11 = true;
                c13 = 2;
                z13 = true;
                break;
            default:
                z11 = true;
                c13 = 2;
                z12 = z11;
                z13 = false;
                break;
        }
        if (z13) {
            b11.getClass();
            switch (b11.hashCode()) {
                case 100571:
                    if (b11.equals("end")) {
                        r13 = 0;
                        break;
                    }
                    r13 = -1;
                    break;
                case 108511772:
                    if (b11.equals("right")) {
                        r13 = z11;
                        break;
                    }
                    r13 = -1;
                    break;
                case 109757538:
                    if (b11.equals("start")) {
                        r13 = c13;
                        break;
                    }
                    r13 = -1;
                    break;
                default:
                    r13 = -1;
                    break;
            }
            switch (r13) {
                case 0:
                    z11 = j11;
                    break;
                case 1:
                    z11 = false;
                    break;
                case 2:
                    z11 = z14;
                    break;
            }
            if (z12) {
                if (z11) {
                    c7241a.f68835d0 = f.b.LEFT_TO_LEFT;
                    c7241a.f68811J = c14;
                } else {
                    c7241a.f68835d0 = f.b.LEFT_TO_RIGHT;
                    c7241a.f68812K = c14;
                }
            } else if (z11) {
                c7241a.f68835d0 = f.b.RIGHT_TO_LEFT;
                c7241a.f68813L = c14;
            } else {
                c7241a.f68835d0 = f.b.RIGHT_TO_RIGHT;
                c7241a.f68814M = c14;
            }
        }
        c7241a.t(Float.valueOf(p11)).v(Float.valueOf(p12));
    }

    static j2.c d(i2.f fVar, String str, C6253A c6253a, C2603e c2603e) throws i2.g {
        C7000c m11 = fVar.m(str);
        j2.c c11 = j2.c.c(0);
        if (m11 instanceof h) {
            return e(m11.b());
        }
        if (m11 instanceof i2.e) {
            return j2.c.c(c6253a.d(Float.valueOf(C6253A.p((C6253A) c2603e.f3144a, fVar.o(str)))));
        }
        if (m11 instanceof i2.f) {
            i2.f fVar2 = (i2.f) m11;
            String w11 = fVar2.w(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (w11 != null) {
                c11 = e(w11);
            }
            C7000c t2 = fVar2.t("min");
            if (t2 != null) {
                if (t2 instanceof i2.e) {
                    c11.i(c6253a.d(Float.valueOf(C6253A.p((C6253A) c2603e.f3144a, ((i2.e) t2).c()))));
                } else if (t2 instanceof h) {
                    c11.f68881a = -2;
                }
            }
            C7000c t11 = fVar2.t("max");
            if (t11 != null) {
                if (t11 instanceof i2.e) {
                    int d11 = c6253a.d(Float.valueOf(C6253A.p((C6253A) c2603e.f3144a, ((i2.e) t11).c())));
                    if (c11.f68882b >= 0) {
                        c11.f68882b = d11;
                        return c11;
                    }
                } else if (t11 instanceof h) {
                    String str2 = j2.c.f68876i;
                    if (c11.f68887g) {
                        c11.f68886f = str2;
                        c11.f68882b = Integer.MAX_VALUE;
                    }
                }
            }
        }
        return c11;
    }

    static j2.c e(String str) {
        j2.c c11;
        String str2;
        c11 = j2.c.c(0);
        str.getClass();
        str2 = j2.c.f68877j;
        switch (str) {
            case "preferWrap":
                return j2.c.g(j2.c.f68876i);
            case "parent":
                return j2.c.d();
            case "spread":
                return j2.c.g(str2);
            case "wrap":
                return j2.c.h();
            default:
                if (str.endsWith("%")) {
                    j2.c e11 = j2.c.e(Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f);
                    e11.f68887g = true;
                    e11.f68882b = 0;
                    return e11;
                }
                if (!str.contains(ProductContainerDTO.RATIO_DELIMITER)) {
                    return c11;
                }
                j2.c f7 = j2.c.f(str);
                f7.f68886f = str2;
                f7.f68887g = true;
                return f7;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0085. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x012c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void f(int i11, C6253A c6253a, String str, i2.f fVar) throws i2.g {
        String next;
        char c11;
        char c12;
        float p11;
        ArrayList<String> z11 = fVar.z();
        C7241a c13 = c6253a.c(str);
        if (i11 == 0) {
            c6253a.f(0, str);
        } else {
            c6253a.f(1, str);
        }
        boolean z12 = !c6253a.j() || i11 == 0;
        k2.h hVar = (k2.h) c13.f68832c;
        Iterator<String> it = z11.iterator();
        float f7 = 0.0f;
        boolean z13 = false;
        while (true) {
            boolean z14 = true;
            while (it.hasNext()) {
                next = it.next();
                next.getClass();
                switch (next.hashCode()) {
                    case -678927291:
                        if (next.equals("percent")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 100571:
                        if (next.equals("end")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3317767:
                        if (next.equals("left")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 108511772:
                        if (next.equals("right")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 109757538:
                        if (next.equals("start")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        C7000c t2 = fVar.t(next);
                        C6998a c6998a = t2 instanceof C6998a ? (C6998a) t2 : null;
                        if (c6998a == null) {
                            f7 = fVar.o(next);
                        } else {
                            if (c6998a.size() > 1) {
                                String u11 = c6998a.u(0);
                                float f11 = c6998a.getFloat(1);
                                u11.getClass();
                                switch (u11.hashCode()) {
                                    case 100571:
                                        if (u11.equals("end")) {
                                            c12 = 0;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 3317767:
                                        if (u11.equals("left")) {
                                            c12 = 1;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 108511772:
                                        if (u11.equals("right")) {
                                            c12 = 2;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 109757538:
                                        if (u11.equals("start")) {
                                            c12 = 3;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    default:
                                        c12 = 65535;
                                        break;
                                }
                                switch (c12) {
                                    case 0:
                                        z14 = !z12;
                                        f7 = f11;
                                        break;
                                    case 1:
                                        f7 = f11;
                                        break;
                                    case 2:
                                        f7 = f11;
                                        z14 = false;
                                        break;
                                    case 3:
                                        z14 = z12;
                                        f7 = f11;
                                        break;
                                    default:
                                        f7 = f11;
                                        break;
                                }
                            }
                            z13 = true;
                        }
                        z13 = true;
                        z14 = true;
                    case 1:
                        p11 = C6253A.p((C6253A) c6253a.e().f3144a, fVar.o(next));
                        z14 = !z12;
                        f7 = p11;
                    case 3:
                        f7 = C6253A.p((C6253A) c6253a.e().f3144a, fVar.o(next));
                        z14 = false;
                    case 4:
                        p11 = C6253A.p((C6253A) c6253a.e().f3144a, fVar.o(next));
                        z14 = z12;
                        f7 = p11;
                }
                while (it.hasNext()) {
                }
            }
            if (z13) {
                if (z14) {
                    hVar.e(f7);
                    return;
                } else {
                    hVar.e(1.0f - f7);
                    return;
                }
            }
            if (z14) {
                hVar.h(Float.valueOf(f7));
                return;
            } else {
                hVar.d(Float.valueOf(f7));
                return;
            }
            f7 = C6253A.p((C6253A) c6253a.e().f3144a, fVar.o(next));
        }
    }

    static void g(C6253A c6253a, d dVar, String str, i2.f fVar) throws i2.g {
        C7241a c11 = c6253a.c(str);
        if (c11.f68837e0 == null) {
            c11.f68837e0 = j2.c.h();
        }
        if (c11.f68839f0 == null) {
            c11.f68839f0 = j2.c.h();
        }
        Iterator<String> it = fVar.z().iterator();
        while (it.hasNext()) {
            a(c6253a, fVar, c11, dVar, it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(11:177|(2:179|(11:181|(1:183)|184|185|186|(1:188)|189|(1:191)|162|163|51))(1:195)|194|185|186|(0)|189|(0)|162|163|51) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:104|(2:106|(12:108|(1:110)|111|112|113|(1:115)|116|(1:118)|96|49|50|51))(1:122)|121|112|113|(0)|116|(0)|96|49|50|51) */
    /* JADX WARN: Removed duplicated region for block: B:115:0x044a A[Catch: NumberFormatException -> 0x03ba, TryCatch #3 {NumberFormatException -> 0x03ba, blocks: (B:113:0x043c, B:115:0x044a, B:116:0x0451, B:118:0x0459), top: B:112:0x043c }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0459 A[Catch: NumberFormatException -> 0x03ba, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x03ba, blocks: (B:113:0x043c, B:115:0x044a, B:116:0x0451, B:118:0x0459), top: B:112:0x043c }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x062b A[Catch: NumberFormatException -> 0x05bc, TryCatch #5 {NumberFormatException -> 0x05bc, blocks: (B:186:0x061d, B:188:0x062b, B:189:0x0632, B:191:0x063a), top: B:185:0x061d }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x063a A[Catch: NumberFormatException -> 0x05bc, TRY_LEAVE, TryCatch #5 {NumberFormatException -> 0x05bc, blocks: (B:186:0x061d, B:188:0x062b, B:189:0x0632, B:191:0x063a), top: B:185:0x061d }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x093e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(@NonNull i2.f fVar, @NonNull C6253A c6253a, @NonNull d dVar) throws i2.g {
        String str;
        char c11;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i11;
        char c12;
        i2.f fVar2;
        String w11;
        i2.f fVar3;
        String w12;
        String str13;
        i2.f fVar4;
        Iterator<String> it;
        String str14;
        String str15;
        char c13;
        char c14;
        String str16;
        int i12;
        C7000c m11;
        Iterator<String> it2;
        float e11;
        float f7;
        float f11;
        float f12;
        char c15;
        Iterator<String> it3;
        int i13;
        k2.d dVar2;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        String b11;
        String str17;
        char c16;
        char c17;
        k2.f fVar5;
        Iterator<String> it4;
        char c18;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String b12;
        String str23;
        String str24;
        C7000c c7000c;
        Float f18;
        Float valueOf;
        Float f19;
        char c19;
        String b13;
        String str25;
        String str26;
        float e12;
        float f21;
        float f22;
        float f23;
        C7000c c7000c2;
        Float f24;
        Float valueOf2;
        Float f25;
        C7000c c7000c3;
        C6998a c6998a;
        String str27;
        float f26;
        float f27;
        float f28;
        String str28 = "hGuideline";
        String str29 = "hFlow";
        String str30 = "hChain";
        String str31 = "vGuideline";
        String str32 = "type";
        String str33 = "start";
        String str34 = "end";
        String str35 = "bottom";
        Iterator<String> it5 = fVar.z().iterator();
        while (it5.hasNext()) {
            String next = it5.next();
            C7000c m12 = fVar.m(next);
            next.getClass();
            switch (next.hashCode()) {
                case -1824489883:
                    str = str33;
                    if (next.equals("Helpers")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1875016085:
                    str = str33;
                    if (next.equals("Generate")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1921490263:
                    str = str33;
                    if (next.equals("Variables")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    str = str33;
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                    str6 = str32;
                    str7 = str34;
                    str8 = str35;
                    str9 = str;
                    if (m12 instanceof C6998a) {
                        C6998a c6998a2 = (C6998a) m12;
                        int i14 = 0;
                        while (i14 < c6998a2.size()) {
                            C7000c l11 = c6998a2.l(i14);
                            if (l11 instanceof C6998a) {
                                C6998a c6998a3 = (C6998a) l11;
                                if (c6998a3.size() > 1) {
                                    String u11 = c6998a3.u(0);
                                    u11.getClass();
                                    switch (u11.hashCode()) {
                                        case -1785507558:
                                            str10 = str2;
                                            str11 = str5;
                                            str12 = str4;
                                            if (u11.equals(str11)) {
                                                c12 = 0;
                                                break;
                                            } else {
                                                c12 = 65535;
                                                break;
                                            }
                                        case -1252464839:
                                            str10 = str2;
                                            str12 = str4;
                                            if (u11.equals(str12)) {
                                                str11 = str5;
                                                c12 = 1;
                                                break;
                                            } else {
                                                c12 = 65535;
                                                str11 = str5;
                                                break;
                                            }
                                        case -851656725:
                                            str10 = str2;
                                            if (u11.equals("vChain")) {
                                                str11 = str5;
                                                str12 = str4;
                                                c12 = 2;
                                                break;
                                            }
                                            c12 = 65535;
                                            str11 = str5;
                                            str12 = str4;
                                            break;
                                        case 965681512:
                                            str10 = str2;
                                            if (u11.equals(str10)) {
                                                str11 = str5;
                                                str12 = str4;
                                                c12 = 3;
                                                break;
                                            }
                                            c12 = 65535;
                                            str11 = str5;
                                            str12 = str4;
                                            break;
                                        default:
                                            c12 = 65535;
                                            str10 = str2;
                                            str11 = str5;
                                            str12 = str4;
                                            break;
                                    }
                                    switch (c12) {
                                        case 0:
                                            i11 = 1;
                                            C7000c l12 = c6998a3.l(1);
                                            if ((l12 instanceof i2.f) && (w11 = (fVar2 = (i2.f) l12).w("id")) != null) {
                                                f(1, c6253a, w11, fVar2);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            i11 = 1;
                                            b(0, c6253a, dVar, c6998a3);
                                            break;
                                        case 2:
                                            i11 = 1;
                                            b(1, c6253a, dVar, c6998a3);
                                            break;
                                        case 3:
                                            C7000c l13 = c6998a3.l(1);
                                            if ((l13 instanceof i2.f) && (w12 = (fVar3 = (i2.f) l13).w("id")) != null) {
                                                f(0, c6253a, w12, fVar3);
                                            }
                                            i11 = 1;
                                            break;
                                    }
                                    i14 += i11;
                                    str2 = str10;
                                    str4 = str12;
                                    str5 = str11;
                                } else {
                                    i11 = 1;
                                    str10 = str2;
                                    str11 = str5;
                                    str12 = str4;
                                    i14 += i11;
                                    str2 = str10;
                                    str4 = str12;
                                    str5 = str11;
                                }
                            } else {
                                str10 = str2;
                                str11 = str5;
                                str12 = str4;
                            }
                            i11 = 1;
                            i14 += i11;
                            str2 = str10;
                            str4 = str12;
                            str5 = str11;
                        }
                        break;
                    }
                    break;
                case 1:
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                    str6 = str32;
                    str7 = str34;
                    str8 = str35;
                    str9 = str;
                    if (m12 instanceof i2.f) {
                        i2.f fVar6 = (i2.f) m12;
                        Iterator<String> it6 = fVar6.z().iterator();
                        while (it6.hasNext()) {
                            String next2 = it6.next();
                            C7000c m13 = fVar6.m(next2);
                            HashMap<String, ArrayList<String>> hashMap = dVar.f68874c;
                            ArrayList<String> arrayList = hashMap.containsKey(next2) ? hashMap.get(next2) : null;
                            if (arrayList != null && (m13 instanceof i2.f)) {
                                Iterator<String> it7 = arrayList.iterator();
                                while (it7.hasNext()) {
                                    g(c6253a, dVar, it7.next(), (i2.f) m13);
                                }
                            }
                        }
                        break;
                    }
                    break;
                case 2:
                    str2 = str28;
                    str3 = str29;
                    str4 = str30;
                    str5 = str31;
                    str6 = str32;
                    str13 = str34;
                    str8 = str35;
                    str9 = str;
                    if (m12 instanceof i2.f) {
                        i2.f fVar7 = (i2.f) m12;
                        Iterator<String> it8 = fVar7.z().iterator();
                        while (it8.hasNext()) {
                            String next3 = it8.next();
                            C7000c m14 = fVar7.m(next3);
                            if (m14 instanceof i2.e) {
                                dVar.f68872a.put(next3, Integer.valueOf(m14.e()));
                            } else if (m14 instanceof i2.f) {
                                i2.f fVar8 = (i2.f) m14;
                                if (fVar8.x("from") && fVar8.x("to")) {
                                    float a11 = dVar.a(fVar8.m("from"));
                                    float a12 = dVar.a(fVar8.m("to"));
                                    String w13 = fVar8.w("prefix");
                                    String w14 = fVar8.w("postfix");
                                    HashMap<String, InterfaceC1127b> hashMap2 = dVar.f68873b;
                                    if (hashMap2.containsKey(next3)) {
                                        hashMap2.get(next3);
                                    }
                                    fVar4 = fVar7;
                                    a aVar = new a();
                                    it = it8;
                                    aVar.f68865a = false;
                                    aVar.f68868d = 0.0f;
                                    if (w13 == null) {
                                        w13 = "";
                                    }
                                    aVar.f68866b = w13;
                                    if (w14 == null) {
                                        w14 = "";
                                    }
                                    aVar.f68867c = w14;
                                    aVar.f68869e = a12;
                                    hashMap2.put(next3, aVar);
                                    HashMap<String, ArrayList<String>> hashMap3 = dVar.f68874c;
                                    ArrayList<String> arrayList2 = new ArrayList<>();
                                    int i15 = (int) a11;
                                    int i16 = (int) a12;
                                    int i17 = i15;
                                    while (i15 <= i16) {
                                        arrayList2.add(aVar.f68866b + i17 + aVar.f68867c);
                                        i17 += (int) 1.0f;
                                        i15++;
                                        str13 = str13;
                                    }
                                    str14 = str13;
                                    hashMap3.put(next3, arrayList2);
                                } else {
                                    fVar4 = fVar7;
                                    it = it8;
                                    str14 = str13;
                                    if (fVar8.x("from") && fVar8.x("step")) {
                                        float a13 = dVar.a(fVar8.m("from"));
                                        float a14 = dVar.a(fVar8.m("step"));
                                        HashMap<String, InterfaceC1127b> hashMap4 = dVar.f68873b;
                                        if (hashMap4.containsKey(next3)) {
                                            hashMap4.get(next3);
                                        }
                                        c cVar = new c();
                                        cVar.f68870a = a14;
                                        cVar.f68871b = a13;
                                        hashMap4.put(next3, cVar);
                                    } else if (fVar8.x("ids")) {
                                        C6998a n11 = fVar8.n();
                                        ArrayList<String> arrayList3 = new ArrayList<>();
                                        for (int i18 = 0; i18 < n11.size(); i18++) {
                                            arrayList3.add(n11.u(i18));
                                        }
                                        dVar.f68874c.put(next3, arrayList3);
                                    } else if (fVar8.x("tag")) {
                                        String v11 = fVar8.v("tag");
                                        HashMap<String, ArrayList<String>> hashMap5 = c6253a.f68895e;
                                        dVar.f68874c.put(next3, hashMap5.containsKey(v11) ? hashMap5.get(v11) : null);
                                    }
                                }
                                fVar7 = fVar4;
                                it8 = it;
                                str13 = str14;
                            }
                            fVar4 = fVar7;
                            it = it8;
                            str14 = str13;
                            fVar7 = fVar4;
                            it8 = it;
                            str13 = str14;
                        }
                    }
                    str7 = str13;
                    break;
                default:
                    if (m12 instanceof i2.f) {
                        i2.f fVar9 = (i2.f) m12;
                        Iterator<String> it9 = fVar9.z().iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                Iterator<String> it10 = it9;
                                if (it9.next().equals(str32)) {
                                    str15 = fVar9.v(str32);
                                } else {
                                    it9 = it10;
                                }
                            } else {
                                str15 = null;
                            }
                        }
                        if (str15 != null) {
                            String str36 = str34;
                            str8 = str35;
                            switch (str15.hashCode()) {
                                case -1785507558:
                                    str2 = str28;
                                    if (str15.equals(str31)) {
                                        c13 = 0;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case -1354837162:
                                    str2 = str28;
                                    if (str15.equals("column")) {
                                        c13 = 1;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case -1252464839:
                                    str2 = str28;
                                    if (str15.equals(str30)) {
                                        c13 = 2;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case -851656725:
                                    str2 = str28;
                                    if (str15.equals("vChain")) {
                                        c13 = 3;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case -333143113:
                                    str2 = str28;
                                    if (str15.equals("barrier")) {
                                        c13 = 4;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 113114:
                                    str2 = str28;
                                    if (str15.equals("row")) {
                                        c13 = 5;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 3181382:
                                    str2 = str28;
                                    if (str15.equals("grid")) {
                                        c13 = 6;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 98238902:
                                    str2 = str28;
                                    if (str15.equals(str29)) {
                                        c13 = 7;
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 111168196:
                                    str2 = str28;
                                    if (str15.equals("vFlow")) {
                                        c13 = '\b';
                                        break;
                                    }
                                    c13 = 65535;
                                    break;
                                case 965681512:
                                    if (str15.equals(str28)) {
                                        str2 = str28;
                                        c13 = '\t';
                                        break;
                                    }
                                default:
                                    str2 = str28;
                                    c13 = 65535;
                                    break;
                            }
                            switch (c13) {
                                case 0:
                                    str3 = str29;
                                    str4 = str30;
                                    str5 = str31;
                                    str6 = str32;
                                    str9 = str;
                                    str13 = str36;
                                    f(1, c6253a, next, fVar9);
                                    break;
                                case 1:
                                case 5:
                                case 6:
                                    str3 = str29;
                                    str4 = str30;
                                    str5 = str31;
                                    str6 = str32;
                                    str9 = str;
                                    str13 = str36;
                                    C7241a c21 = c6253a.c(next);
                                    Object obj = c21.f68832c;
                                    if (obj == null || !(obj instanceof k2.g)) {
                                        f.d dVar3 = f.d.GRID;
                                        if (str15.charAt(0) == 'r') {
                                            dVar3 = f.d.ROW;
                                        } else if (str15.charAt(0) == 'c') {
                                            dVar3 = f.d.COLUMN;
                                        }
                                        k2.g gVar = new k2.g(c6253a, dVar3);
                                        c21.f68832c = gVar;
                                        c21.a(gVar.b());
                                    }
                                    k2.g gVar2 = (k2.g) c21.f68832c;
                                    Iterator<String> it11 = fVar9.z().iterator();
                                    while (it11.hasNext()) {
                                        String next4 = it11.next();
                                        next4.getClass();
                                        switch (next4.hashCode()) {
                                            case -1439500848:
                                                if (next4.equals("orientation")) {
                                                    c14 = 0;
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            case -806339567:
                                                if (next4.equals("padding")) {
                                                    c14 = 1;
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            case -567445985:
                                                if (next4.equals("contains")) {
                                                    c14 = 2;
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            case 3169614:
                                                if (next4.equals("hGap")) {
                                                    c14 = 3;
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            case 3506649:
                                                if (next4.equals("rows")) {
                                                    c14 = 4;
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            case 3586688:
                                                if (next4.equals("vGap")) {
                                                    c14 = 5;
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            case 97513095:
                                                if (next4.equals("flags")) {
                                                    c14 = 6;
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            case 109497044:
                                                if (next4.equals("skips")) {
                                                    c14 = 7;
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            case 109638249:
                                                if (next4.equals("spans")) {
                                                    c14 = '\b';
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            case 144441793:
                                                if (next4.equals("rowWeights")) {
                                                    c14 = '\t';
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            case 949721053:
                                                if (next4.equals("columns")) {
                                                    c14 = '\n';
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            case 2033353925:
                                                if (next4.equals("columnWeights")) {
                                                    c14 = 11;
                                                    break;
                                                }
                                                c14 = 65535;
                                                break;
                                            default:
                                                c14 = 65535;
                                                break;
                                        }
                                        switch (c14) {
                                            case 0:
                                                it2 = it11;
                                                gVar2.Q(fVar9.m(next4).e());
                                                break;
                                            case 1:
                                                C7000c m15 = fVar9.m(next4);
                                                if (m15 instanceof C6998a) {
                                                    C6998a c6998a4 = (C6998a) m15;
                                                    if (c6998a4.size() > 1) {
                                                        e11 = c6998a4.getInt(0);
                                                        f11 = c6998a4.getInt(1);
                                                        it2 = it11;
                                                        if (c6998a4.size() > 2) {
                                                            f7 = c6998a4.getInt(2);
                                                            try {
                                                                try {
                                                                    f12 = ((C6998a) m15).getInt(3);
                                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                                    f12 = 0.0f;
                                                                    gVar2.T(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, e11)));
                                                                    gVar2.U(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f11)));
                                                                    gVar2.S(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f7)));
                                                                    gVar2.R(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f12)));
                                                                    it11 = it2;
                                                                }
                                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                            }
                                                            gVar2.T(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, e11)));
                                                            gVar2.U(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f11)));
                                                            gVar2.S(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f7)));
                                                            gVar2.R(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f12)));
                                                        } else {
                                                            f7 = e11;
                                                            f12 = f11;
                                                            gVar2.T(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, e11)));
                                                            gVar2.U(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f11)));
                                                            gVar2.S(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f7)));
                                                            gVar2.R(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f12)));
                                                        }
                                                    }
                                                }
                                                it2 = it11;
                                                e11 = m15.e();
                                                f7 = e11;
                                                f11 = f7;
                                                f12 = f11;
                                                gVar2.T(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, e11)));
                                                gVar2.U(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f11)));
                                                gVar2.S(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f7)));
                                                gVar2.R(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f12)));
                                            case 2:
                                                C7000c t2 = fVar9.t(next4);
                                                C6998a c6998a5 = t2 instanceof C6998a ? (C6998a) t2 : null;
                                                if (c6998a5 != null) {
                                                    for (int i19 = 0; i19 < c6998a5.size(); i19++) {
                                                        gVar2.H(c6253a.c(c6998a5.l(i19).b()));
                                                    }
                                                }
                                                it2 = it11;
                                                break;
                                            case 3:
                                                gVar2.P(C6253A.p((C6253A) c6253a.e().f3144a, fVar9.m(next4).c()));
                                                it2 = it11;
                                                break;
                                            case 4:
                                                int e13 = fVar9.m(next4).e();
                                                if (e13 > 0) {
                                                    gVar2.W(e13);
                                                }
                                                it2 = it11;
                                                break;
                                            case 5:
                                                gVar2.Z(C6253A.p((C6253A) c6253a.e().f3144a, fVar9.m(next4).c()));
                                                it2 = it11;
                                                break;
                                            case 6:
                                                try {
                                                    m11 = fVar9.m(next4);
                                                } catch (Exception e14) {
                                                    System.err.println("Error parsing grid flags " + e14);
                                                    str16 = "";
                                                }
                                                if (m11 instanceof i2.e) {
                                                    i12 = m11.e();
                                                    str16 = "";
                                                    if (str16 != null || str16.isEmpty()) {
                                                        gVar2.N(i12);
                                                    } else {
                                                        gVar2.O(str16);
                                                    }
                                                    it2 = it11;
                                                    break;
                                                } else {
                                                    str16 = m11.b();
                                                    i12 = 0;
                                                    if (str16 != null) {
                                                    }
                                                    gVar2.N(i12);
                                                    it2 = it11;
                                                }
                                            case 7:
                                                String b14 = fVar9.m(next4).b();
                                                if (b14 != null && b14.contains(ProductContainerDTO.RATIO_DELIMITER)) {
                                                    gVar2.X(b14);
                                                }
                                                it2 = it11;
                                                break;
                                            case '\b':
                                                String b15 = fVar9.m(next4).b();
                                                if (b15 != null && b15.contains(ProductContainerDTO.RATIO_DELIMITER)) {
                                                    gVar2.Y(b15);
                                                }
                                                it2 = it11;
                                                break;
                                            case '\t':
                                                String b16 = fVar9.m(next4).b();
                                                if (b16 != null && b16.contains(",")) {
                                                    gVar2.V(b16);
                                                }
                                                it2 = it11;
                                                break;
                                            case '\n':
                                                int e15 = fVar9.m(next4).e();
                                                if (e15 > 0) {
                                                    gVar2.M(e15);
                                                }
                                                it2 = it11;
                                                break;
                                            case 11:
                                                String b17 = fVar9.m(next4).b();
                                                if (b17 != null && b17.contains(",")) {
                                                    gVar2.L(b17);
                                                }
                                                it2 = it11;
                                                break;
                                            default:
                                                a(c6253a, fVar9, c6253a.c(next), dVar, next4);
                                                it2 = it11;
                                                break;
                                        }
                                        it11 = it2;
                                    }
                                    break;
                                case 2:
                                case 3:
                                    str3 = str29;
                                    str4 = str30;
                                    str5 = str31;
                                    str6 = str32;
                                    str9 = str;
                                    str13 = str36;
                                    String str37 = str8;
                                    k2.d dVar4 = str15.charAt(0) == 'h' ? (i) c6253a.h(f.d.HORIZONTAL_CHAIN) : (j) c6253a.h(f.d.VERTICAL_CHAIN);
                                    dVar4.y(next);
                                    Iterator<String> it12 = fVar9.z().iterator();
                                    while (it12.hasNext()) {
                                        String next5 = it12.next();
                                        next5.getClass();
                                        switch (next5.hashCode()) {
                                            case -1383228885:
                                                if (next5.equals(str37)) {
                                                    c15 = 0;
                                                    break;
                                                }
                                                c15 = 65535;
                                                break;
                                            case -567445985:
                                                if (next5.equals("contains")) {
                                                    c15 = 1;
                                                    break;
                                                }
                                                c15 = 65535;
                                                break;
                                            case 100571:
                                                if (next5.equals(str13)) {
                                                    c15 = 2;
                                                    break;
                                                }
                                                c15 = 65535;
                                                break;
                                            case 115029:
                                                if (next5.equals("top")) {
                                                    c15 = 3;
                                                    break;
                                                }
                                                c15 = 65535;
                                                break;
                                            case 3317767:
                                                if (next5.equals("left")) {
                                                    c15 = 4;
                                                    break;
                                                }
                                                c15 = 65535;
                                                break;
                                            case 108511772:
                                                if (next5.equals("right")) {
                                                    c15 = 5;
                                                    break;
                                                }
                                                c15 = 65535;
                                                break;
                                            case 109757538:
                                                if (next5.equals(str9)) {
                                                    c15 = 6;
                                                    break;
                                                }
                                                c15 = 65535;
                                                break;
                                            case 109780401:
                                                if (next5.equals("style")) {
                                                    c15 = 7;
                                                    break;
                                                }
                                                c15 = 65535;
                                                break;
                                            default:
                                                c15 = 65535;
                                                break;
                                        }
                                        switch (c15) {
                                            case 0:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                                it3 = it12;
                                                str8 = str37;
                                                c(c6253a, fVar9, dVar4, dVar, next5);
                                                it12 = it3;
                                                str37 = str8;
                                            case 1:
                                                it3 = it12;
                                                str8 = str37;
                                                C7000c m16 = fVar9.m(next5);
                                                if (m16 instanceof C6998a) {
                                                    C6998a c6998a6 = (C6998a) m16;
                                                    if (c6998a6.size() >= 1) {
                                                        int i21 = 0;
                                                        while (i21 < c6998a6.size()) {
                                                            C7000c l14 = c6998a6.l(i21);
                                                            if (l14 instanceof C6998a) {
                                                                C6998a c6998a7 = (C6998a) l14;
                                                                if (c6998a7.size() > 0) {
                                                                    String b18 = c6998a7.l(0).b();
                                                                    int size = c6998a7.size();
                                                                    i13 = i21;
                                                                    if (size == 2) {
                                                                        dVar2 = dVar4;
                                                                        f13 = c6998a7.getFloat(1);
                                                                        f14 = Float.NaN;
                                                                        f15 = Float.NaN;
                                                                        f16 = Float.NaN;
                                                                    } else if (size != 3) {
                                                                        if (size == 4) {
                                                                            dVar2 = dVar4;
                                                                            float f29 = c6998a7.getFloat(1);
                                                                            float i22 = i(c6253a, c6998a7.getFloat(2));
                                                                            f15 = C6253A.p((C6253A) c6253a.e().f3144a, c6998a7.getFloat(3));
                                                                            f14 = i22;
                                                                            f13 = f29;
                                                                            f16 = Float.NaN;
                                                                        } else if (size != 6) {
                                                                            dVar2 = dVar4;
                                                                            f13 = Float.NaN;
                                                                            f14 = Float.NaN;
                                                                            f15 = Float.NaN;
                                                                            f16 = Float.NaN;
                                                                        } else {
                                                                            float f31 = c6998a7.getFloat(1);
                                                                            float i23 = i(c6253a, c6998a7.getFloat(2));
                                                                            dVar2 = dVar4;
                                                                            float p11 = C6253A.p((C6253A) c6253a.e().f3144a, c6998a7.getFloat(3));
                                                                            f16 = C6253A.p((C6253A) c6253a.e().f3144a, c6998a7.getFloat(4));
                                                                            f14 = i23;
                                                                            f17 = C6253A.p((C6253A) c6253a.e().f3144a, c6998a7.getFloat(5));
                                                                            f13 = f31;
                                                                            f15 = p11;
                                                                            dVar2.L(b18, f13, f14, f15, f16, f17);
                                                                            dVar4 = dVar2;
                                                                        }
                                                                        f17 = f16;
                                                                        dVar2.L(b18, f13, f14, f15, f16, f17);
                                                                        dVar4 = dVar2;
                                                                    } else {
                                                                        dVar2 = dVar4;
                                                                        float f32 = c6998a7.getFloat(1);
                                                                        f14 = i(c6253a, c6998a7.getFloat(2));
                                                                        f15 = f14;
                                                                        f13 = f32;
                                                                        f16 = Float.NaN;
                                                                    }
                                                                    f17 = f16;
                                                                    dVar2.L(b18, f13, f14, f15, f16, f17);
                                                                    dVar4 = dVar2;
                                                                } else {
                                                                    i13 = i21;
                                                                }
                                                            } else {
                                                                i13 = i21;
                                                                dVar4.H(l14.b());
                                                            }
                                                            i21 = i13 + 1;
                                                        }
                                                        it12 = it3;
                                                        str37 = str8;
                                                    }
                                                }
                                                PrintStream printStream = System.err;
                                                StringBuilder e16 = C2942q.e(next, " contains should be an array \"");
                                                e16.append(m16.b());
                                                e16.append("\"");
                                                printStream.println(e16.toString());
                                                break;
                                            case 7:
                                                C7000c m17 = fVar9.m(next5);
                                                if (m17 instanceof C6998a) {
                                                    C6998a c6998a8 = (C6998a) m17;
                                                    it3 = it12;
                                                    str8 = str37;
                                                    if (c6998a8.size() > 1) {
                                                        b11 = c6998a8.u(0);
                                                        dVar4.M(c6998a8.getFloat(1));
                                                        b11.getClass();
                                                        if (!b11.equals("packed")) {
                                                            dVar4.R(f.a.PACKED);
                                                        } else if (b11.equals("spread_inside")) {
                                                            dVar4.R(f.a.SPREAD_INSIDE);
                                                        } else {
                                                            dVar4.R(f.a.SPREAD);
                                                        }
                                                        it12 = it3;
                                                        str37 = str8;
                                                    }
                                                } else {
                                                    it3 = it12;
                                                    str8 = str37;
                                                }
                                                b11 = m17.b();
                                                b11.getClass();
                                                if (!b11.equals("packed")) {
                                                }
                                                it12 = it3;
                                                str37 = str8;
                                            default:
                                                it3 = it12;
                                                str8 = str37;
                                                it12 = it3;
                                                str37 = str8;
                                        }
                                        break;
                                    }
                                    str8 = str37;
                                case 4:
                                    str3 = str29;
                                    str4 = str30;
                                    str5 = str31;
                                    str6 = str32;
                                    str9 = str;
                                    str13 = str36;
                                    str17 = str8;
                                    boolean j11 = c6253a.j();
                                    f.c cVar2 = f.c.END;
                                    C7241a c22 = c6253a.c(next);
                                    Object obj2 = c22.f68832c;
                                    if (obj2 == null || !(obj2 instanceof k2.c)) {
                                        k2.c cVar3 = new k2.c(c6253a);
                                        cVar3.L(cVar2);
                                        c22.f68832c = cVar3;
                                        c22.a(cVar3.b());
                                    }
                                    k2.c cVar4 = (k2.c) c22.f68832c;
                                    Iterator<String> it13 = fVar9.z().iterator();
                                    while (it13.hasNext()) {
                                        String next6 = it13.next();
                                        next6.getClass();
                                        switch (next6.hashCode()) {
                                            case -1081309778:
                                                if (next6.equals("margin")) {
                                                    c16 = 0;
                                                    break;
                                                }
                                                c16 = 65535;
                                                break;
                                            case -962590849:
                                                if (next6.equals("direction")) {
                                                    c16 = 1;
                                                    break;
                                                }
                                                c16 = 65535;
                                                break;
                                            case -567445985:
                                                if (next6.equals("contains")) {
                                                    c16 = 2;
                                                    break;
                                                }
                                                c16 = 65535;
                                                break;
                                            default:
                                                c16 = 65535;
                                                break;
                                        }
                                        switch (c16) {
                                            case 0:
                                                C7000c t11 = fVar9.t(next6);
                                                float c23 = t11 instanceof i2.e ? t11.c() : Float.NaN;
                                                if (Float.isNaN(c23)) {
                                                    break;
                                                } else {
                                                    cVar4.t(Float.valueOf(C6253A.p((C6253A) c6253a.e().f3144a, c23)));
                                                    break;
                                                }
                                            case 1:
                                                String v12 = fVar9.v(next6);
                                                v12.getClass();
                                                switch (v12.hashCode()) {
                                                    case -1383228885:
                                                        if (v12.equals(str17)) {
                                                            c17 = 0;
                                                            break;
                                                        }
                                                        c17 = 65535;
                                                        break;
                                                    case 100571:
                                                        if (v12.equals(str13)) {
                                                            c17 = 1;
                                                            break;
                                                        }
                                                        c17 = 65535;
                                                        break;
                                                    case 115029:
                                                        if (v12.equals("top")) {
                                                            c17 = 2;
                                                            break;
                                                        }
                                                        c17 = 65535;
                                                        break;
                                                    case 3317767:
                                                        if (v12.equals("left")) {
                                                            c17 = 3;
                                                            break;
                                                        }
                                                        c17 = 65535;
                                                        break;
                                                    case 108511772:
                                                        if (v12.equals("right")) {
                                                            c17 = 4;
                                                            break;
                                                        }
                                                        c17 = 65535;
                                                        break;
                                                    case 109757538:
                                                        if (v12.equals(str9)) {
                                                            c17 = 5;
                                                            break;
                                                        }
                                                        c17 = 65535;
                                                        break;
                                                    default:
                                                        c17 = 65535;
                                                        break;
                                                }
                                                switch (c17) {
                                                    case 0:
                                                        cVar4.L(f.c.BOTTOM);
                                                        break;
                                                    case 1:
                                                        if (j11) {
                                                            cVar4.L(f.c.LEFT);
                                                            break;
                                                        } else {
                                                            cVar4.L(f.c.RIGHT);
                                                            break;
                                                        }
                                                    case 2:
                                                        cVar4.L(f.c.TOP);
                                                        break;
                                                    case 3:
                                                        cVar4.L(f.c.LEFT);
                                                        break;
                                                    case 4:
                                                        cVar4.L(f.c.RIGHT);
                                                        break;
                                                    case 5:
                                                        if (j11) {
                                                            cVar4.L(f.c.RIGHT);
                                                            break;
                                                        } else {
                                                            cVar4.L(f.c.LEFT);
                                                            break;
                                                        }
                                                }
                                            case 2:
                                                C7000c t12 = fVar9.t(next6);
                                                C6998a c6998a9 = t12 instanceof C6998a ? (C6998a) t12 : null;
                                                if (c6998a9 != null) {
                                                    for (int i24 = 0; i24 < c6998a9.size(); i24++) {
                                                        cVar4.H(c6253a.c(c6998a9.l(i24).b()));
                                                    }
                                                    break;
                                                } else {
                                                    break;
                                                }
                                        }
                                    }
                                    str8 = str17;
                                    break;
                                case 7:
                                case '\b':
                                    boolean z11 = str15.charAt(0) == 'v';
                                    C7241a c24 = c6253a.c(next);
                                    boolean z12 = z11;
                                    Object obj3 = c24.f68832c;
                                    if (obj3 == null || !(obj3 instanceof k2.f)) {
                                        if (z12) {
                                            str5 = str31;
                                            fVar5 = new k2.f(c6253a, f.d.VERTICAL_FLOW);
                                        } else {
                                            str5 = str31;
                                            fVar5 = new k2.f(c6253a, f.d.HORIZONTAL_FLOW);
                                        }
                                        c24.f68832c = fVar5;
                                        c24.a(fVar5.b());
                                    } else {
                                        str5 = str31;
                                    }
                                    k2.f fVar10 = (k2.f) c24.f68832c;
                                    Iterator<String> it14 = fVar9.z().iterator();
                                    while (it14.hasNext()) {
                                        String next7 = it14.next();
                                        next7.getClass();
                                        switch (next7.hashCode()) {
                                            case -1254185091:
                                                it4 = it14;
                                                if (next7.equals("hAlign")) {
                                                    c18 = 0;
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case -1237307863:
                                                it4 = it14;
                                                if (next7.equals("hStyle")) {
                                                    c18 = 1;
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case -1198076529:
                                                it4 = it14;
                                                if (next7.equals("hFlowBias")) {
                                                    c18 = 2;
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case -853376977:
                                                it4 = it14;
                                                if (next7.equals("vAlign")) {
                                                    c18 = 3;
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case -836499749:
                                                it4 = it14;
                                                if (next7.equals("vStyle")) {
                                                    c18 = 4;
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case -806339567:
                                                it4 = it14;
                                                if (next7.equals("padding")) {
                                                    c18 = 5;
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case -732635235:
                                                it4 = it14;
                                                if (next7.equals("vFlowBias")) {
                                                    c18 = 6;
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case -567445985:
                                                it4 = it14;
                                                if (next7.equals("contains")) {
                                                    c18 = 7;
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case -488900360:
                                                it4 = it14;
                                                if (next7.equals("maxElement")) {
                                                    c18 = '\b';
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case 3169614:
                                                it4 = it14;
                                                if (next7.equals("hGap")) {
                                                    c18 = '\t';
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case 3575610:
                                                it4 = it14;
                                                if (next7.equals(str32)) {
                                                    c18 = '\n';
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case 3586688:
                                                it4 = it14;
                                                if (next7.equals("vGap")) {
                                                    c18 = 11;
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            case 3657802:
                                                it4 = it14;
                                                if (next7.equals("wrap")) {
                                                    c18 = '\f';
                                                    break;
                                                }
                                                c18 = 65535;
                                                break;
                                            default:
                                                it4 = it14;
                                                c18 = 65535;
                                                break;
                                        }
                                        switch (c18) {
                                            case 0:
                                                str3 = str29;
                                                str18 = str30;
                                                str19 = str32;
                                                str20 = str8;
                                                String b19 = fVar9.m(next7).b();
                                                b19.getClass();
                                                str21 = str36;
                                                if (b19.equals(str21)) {
                                                    str22 = str;
                                                    fVar10.Q(1);
                                                } else {
                                                    str22 = str;
                                                    if (b19.equals(str22)) {
                                                        fVar10.Q(0);
                                                    } else {
                                                        fVar10.Q(2);
                                                    }
                                                }
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            case 1:
                                                str3 = str29;
                                                str18 = str30;
                                                str19 = str32;
                                                str20 = str8;
                                                C7000c m18 = fVar9.m(next7);
                                                if (m18 instanceof C6998a) {
                                                    C6998a c6998a10 = (C6998a) m18;
                                                    if (c6998a10.size() > 1) {
                                                        String u12 = c6998a10.u(0);
                                                        b12 = c6998a10.u(1);
                                                        str24 = c6998a10.size() > 2 ? c6998a10.u(2) : "";
                                                        str23 = u12;
                                                        if (!b12.equals("")) {
                                                            fVar10.S(f.a.a(b12));
                                                        }
                                                        if (!str23.equals("")) {
                                                            fVar10.N(f.a.a(str23));
                                                        }
                                                        if (!str24.equals("")) {
                                                            fVar10.U(f.a.a(str24));
                                                        }
                                                        str22 = str;
                                                        str21 = str36;
                                                        str8 = str20;
                                                        str36 = str21;
                                                        str = str22;
                                                        it14 = it4;
                                                        str29 = str3;
                                                        str30 = str18;
                                                        str32 = str19;
                                                    }
                                                }
                                                b12 = m18.b();
                                                str23 = "";
                                                str24 = str23;
                                                if (!b12.equals("")) {
                                                }
                                                if (!str23.equals("")) {
                                                }
                                                if (!str24.equals("")) {
                                                }
                                                str22 = str;
                                                str21 = str36;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            case 2:
                                                str3 = str29;
                                                str18 = str30;
                                                str19 = str32;
                                                str20 = str8;
                                                C7000c m19 = fVar9.m(next7);
                                                Float valueOf3 = Float.valueOf(0.5f);
                                                Float valueOf4 = Float.valueOf(0.5f);
                                                if (m19 instanceof C6998a) {
                                                    C6998a c6998a11 = (C6998a) m19;
                                                    c7000c = m19;
                                                    f18 = valueOf3;
                                                    if (c6998a11.size() > 1) {
                                                        Float valueOf5 = Float.valueOf(c6998a11.getFloat(0));
                                                        Float valueOf6 = Float.valueOf(c6998a11.getFloat(1));
                                                        f19 = valueOf5;
                                                        if (c6998a11.size() > 2) {
                                                            valueOf4 = Float.valueOf(c6998a11.getFloat(2));
                                                        }
                                                        valueOf = valueOf6;
                                                        fVar10.f68842h = valueOf.floatValue();
                                                        if (f19.floatValue() != 0.5f) {
                                                            fVar10.M(f19.floatValue());
                                                        }
                                                        if (valueOf4.floatValue() != 0.5f) {
                                                            fVar10.T(valueOf4.floatValue());
                                                        }
                                                        str22 = str;
                                                        str21 = str36;
                                                        str8 = str20;
                                                        str36 = str21;
                                                        str = str22;
                                                        it14 = it4;
                                                        str29 = str3;
                                                        str30 = str18;
                                                        str32 = str19;
                                                    }
                                                } else {
                                                    c7000c = m19;
                                                    f18 = valueOf3;
                                                }
                                                valueOf = Float.valueOf(c7000c.c());
                                                f19 = f18;
                                                fVar10.f68842h = valueOf.floatValue();
                                                if (f19.floatValue() != 0.5f) {
                                                }
                                                if (valueOf4.floatValue() != 0.5f) {
                                                }
                                                str22 = str;
                                                str21 = str36;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            case 3:
                                                str3 = str29;
                                                str18 = str30;
                                                str19 = str32;
                                                String b21 = fVar9.m(next7).b();
                                                b21.getClass();
                                                switch (b21.hashCode()) {
                                                    case -1720785339:
                                                        str20 = str8;
                                                        if (b21.equals("baseline")) {
                                                            c19 = 0;
                                                            break;
                                                        }
                                                        c19 = 65535;
                                                        break;
                                                    case -1383228885:
                                                        str20 = str8;
                                                        if (b21.equals(str20)) {
                                                            c19 = 1;
                                                            break;
                                                        }
                                                        c19 = 65535;
                                                        break;
                                                    case 115029:
                                                        if (b21.equals("top")) {
                                                            str20 = str8;
                                                            c19 = 2;
                                                            break;
                                                        }
                                                    default:
                                                        c19 = 65535;
                                                        str20 = str8;
                                                        break;
                                                }
                                                switch (c19) {
                                                    case 0:
                                                        fVar10.d0(3);
                                                        break;
                                                    case 1:
                                                        fVar10.d0(1);
                                                        break;
                                                    case 2:
                                                        fVar10.d0(0);
                                                        break;
                                                    default:
                                                        fVar10.d0(2);
                                                        break;
                                                }
                                                str22 = str;
                                                str21 = str36;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            case 4:
                                                str3 = str29;
                                                str18 = str30;
                                                str19 = str32;
                                                C7000c m21 = fVar9.m(next7);
                                                if (m21 instanceof C6998a) {
                                                    C6998a c6998a12 = (C6998a) m21;
                                                    if (c6998a12.size() > 1) {
                                                        str25 = c6998a12.u(0);
                                                        b13 = c6998a12.u(1);
                                                        str26 = c6998a12.size() > 2 ? c6998a12.u(2) : "";
                                                        if (!b13.equals("")) {
                                                            fVar10.f0(f.a.a(b13));
                                                        }
                                                        if (!str25.equals("")) {
                                                            fVar10.P(f.a.a(str25));
                                                        }
                                                        if (!str26.equals("")) {
                                                            fVar10.W(f.a.a(str26));
                                                        }
                                                        str22 = str;
                                                        str21 = str36;
                                                        str20 = str8;
                                                        str8 = str20;
                                                        str36 = str21;
                                                        str = str22;
                                                        it14 = it4;
                                                        str29 = str3;
                                                        str30 = str18;
                                                        str32 = str19;
                                                    }
                                                }
                                                b13 = m21.b();
                                                str25 = "";
                                                str26 = str25;
                                                if (!b13.equals("")) {
                                                }
                                                if (!str25.equals("")) {
                                                }
                                                if (!str26.equals("")) {
                                                }
                                                str22 = str;
                                                str21 = str36;
                                                str20 = str8;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            case 5:
                                                str3 = str29;
                                                str19 = str32;
                                                C7000c m22 = fVar9.m(next7);
                                                if (m22 instanceof C6998a) {
                                                    C6998a c6998a13 = (C6998a) m22;
                                                    if (c6998a13.size() > 1) {
                                                        float f33 = c6998a13.getInt(0);
                                                        f22 = c6998a13.getInt(1);
                                                        if (c6998a13.size() > 2) {
                                                            float f34 = c6998a13.getInt(2);
                                                            try {
                                                                f23 = ((C6998a) m22).getInt(3);
                                                                f21 = f34;
                                                                e12 = f33;
                                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                                f21 = f34;
                                                                e12 = f33;
                                                                f23 = 0.0f;
                                                            }
                                                        } else {
                                                            f23 = f22;
                                                            e12 = f33;
                                                            f21 = e12;
                                                        }
                                                        str18 = str30;
                                                        fVar10.a0(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, e12)));
                                                        fVar10.c0(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f22)));
                                                        fVar10.b0(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f21)));
                                                        fVar10.Z(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f23)));
                                                        str22 = str;
                                                        str21 = str36;
                                                        str20 = str8;
                                                        str8 = str20;
                                                        str36 = str21;
                                                        str = str22;
                                                        it14 = it4;
                                                        str29 = str3;
                                                        str30 = str18;
                                                        str32 = str19;
                                                    }
                                                }
                                                e12 = m22.e();
                                                f21 = e12;
                                                f22 = f21;
                                                f23 = f22;
                                                str18 = str30;
                                                fVar10.a0(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, e12)));
                                                fVar10.c0(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f22)));
                                                fVar10.b0(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f21)));
                                                fVar10.Z(Math.round(C6253A.p((C6253A) c6253a.e().f3144a, f23)));
                                                str22 = str;
                                                str21 = str36;
                                                str20 = str8;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            case 6:
                                                str3 = str29;
                                                str19 = str32;
                                                C7000c m23 = fVar9.m(next7);
                                                Float valueOf7 = Float.valueOf(0.5f);
                                                Float valueOf8 = Float.valueOf(0.5f);
                                                if (m23 instanceof C6998a) {
                                                    C6998a c6998a14 = (C6998a) m23;
                                                    c7000c2 = m23;
                                                    f24 = valueOf7;
                                                    if (c6998a14.size() > 1) {
                                                        Float valueOf9 = Float.valueOf(c6998a14.getFloat(0));
                                                        Float valueOf10 = Float.valueOf(c6998a14.getFloat(1));
                                                        f25 = valueOf9;
                                                        if (c6998a14.size() > 2) {
                                                            valueOf8 = Float.valueOf(c6998a14.getFloat(2));
                                                        }
                                                        valueOf2 = valueOf10;
                                                        fVar10.f68844i = valueOf2.floatValue();
                                                        if (f25.floatValue() != 0.5f) {
                                                            fVar10.O(f25.floatValue());
                                                        }
                                                        if (valueOf8.floatValue() != 0.5f) {
                                                            fVar10.V(valueOf8.floatValue());
                                                        }
                                                        str18 = str30;
                                                        str22 = str;
                                                        str21 = str36;
                                                        str20 = str8;
                                                        str8 = str20;
                                                        str36 = str21;
                                                        str = str22;
                                                        it14 = it4;
                                                        str29 = str3;
                                                        str30 = str18;
                                                        str32 = str19;
                                                    }
                                                } else {
                                                    c7000c2 = m23;
                                                    f24 = valueOf7;
                                                }
                                                valueOf2 = Float.valueOf(c7000c2.c());
                                                f25 = f24;
                                                fVar10.f68844i = valueOf2.floatValue();
                                                if (f25.floatValue() != 0.5f) {
                                                }
                                                if (valueOf8.floatValue() != 0.5f) {
                                                }
                                                str18 = str30;
                                                str22 = str;
                                                str21 = str36;
                                                str20 = str8;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            case 7:
                                                C7000c m24 = fVar9.m(next7);
                                                if (m24 instanceof C6998a) {
                                                    C6998a c6998a15 = (C6998a) m24;
                                                    c7000c3 = m24;
                                                    str3 = str29;
                                                    if (c6998a15.size() >= 1) {
                                                        int i25 = 0;
                                                        while (i25 < c6998a15.size()) {
                                                            C7000c l15 = c6998a15.l(i25);
                                                            int i26 = i25;
                                                            if (l15 instanceof C6998a) {
                                                                C6998a c6998a16 = (C6998a) l15;
                                                                if (c6998a16.size() > 0) {
                                                                    String b22 = c6998a16.l(0).b();
                                                                    c6998a = c6998a15;
                                                                    int size2 = c6998a16.size();
                                                                    str27 = str32;
                                                                    if (size2 == 2) {
                                                                        f26 = c6998a16.getFloat(1);
                                                                        f27 = Float.NaN;
                                                                    } else if (size2 != 3) {
                                                                        if (size2 != 4) {
                                                                            f27 = Float.NaN;
                                                                            f26 = Float.NaN;
                                                                            f28 = Float.NaN;
                                                                        } else {
                                                                            float f35 = c6998a16.getFloat(1);
                                                                            float p12 = C6253A.p((C6253A) c6253a.e().f3144a, c6998a16.getFloat(2));
                                                                            f27 = C6253A.p((C6253A) c6253a.e().f3144a, c6998a16.getFloat(3));
                                                                            f28 = p12;
                                                                            f26 = f35;
                                                                        }
                                                                        fVar10.L(f26, f28, f27, b22);
                                                                    } else {
                                                                        float f36 = c6998a16.getFloat(1);
                                                                        f27 = C6253A.p((C6253A) c6253a.e().f3144a, c6998a16.getFloat(2));
                                                                        f26 = f36;
                                                                    }
                                                                    f28 = f27;
                                                                    fVar10.L(f26, f28, f27, b22);
                                                                } else {
                                                                    c6998a = c6998a15;
                                                                    str27 = str32;
                                                                }
                                                            } else {
                                                                c6998a = c6998a15;
                                                                str27 = str32;
                                                                fVar10.H(l15.b());
                                                            }
                                                            i25 = i26 + 1;
                                                            c6998a15 = c6998a;
                                                            str32 = str27;
                                                        }
                                                        str19 = str32;
                                                        str18 = str30;
                                                        str22 = str;
                                                        str21 = str36;
                                                        str20 = str8;
                                                        str8 = str20;
                                                        str36 = str21;
                                                        str = str22;
                                                        it14 = it4;
                                                        str29 = str3;
                                                        str30 = str18;
                                                        str32 = str19;
                                                    }
                                                } else {
                                                    c7000c3 = m24;
                                                    str3 = str29;
                                                }
                                                str6 = str32;
                                                PrintStream printStream2 = System.err;
                                                StringBuilder e17 = C2942q.e(next, " contains should be an array \"");
                                                e17.append(c7000c3.b());
                                                e17.append("\"");
                                                printStream2.println(e17.toString());
                                                break;
                                            case '\b':
                                                fVar10.X(fVar9.m(next7).e());
                                                str3 = str29;
                                                str18 = str30;
                                                str19 = str32;
                                                str22 = str;
                                                str21 = str36;
                                                str20 = str8;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            case '\t':
                                                fVar10.R(fVar9.m(next7).e());
                                                str3 = str29;
                                                str18 = str30;
                                                str19 = str32;
                                                str22 = str;
                                                str21 = str36;
                                                str20 = str8;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            case '\n':
                                                if (fVar9.m(next7).b().equals(str29)) {
                                                    fVar10.Y(0);
                                                } else {
                                                    fVar10.Y(1);
                                                }
                                                str3 = str29;
                                                str18 = str30;
                                                str19 = str32;
                                                str22 = str;
                                                str21 = str36;
                                                str20 = str8;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            case 11:
                                                fVar10.e0(fVar9.m(next7).e());
                                                str3 = str29;
                                                str18 = str30;
                                                str19 = str32;
                                                str22 = str;
                                                str21 = str36;
                                                str20 = str8;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            case '\f':
                                                String b23 = fVar9.m(next7).b();
                                                fVar10.g0(f.e.valueMap.containsKey(b23) ? f.e.valueMap.get(b23).intValue() : -1);
                                                str3 = str29;
                                                str18 = str30;
                                                str19 = str32;
                                                str22 = str;
                                                str21 = str36;
                                                str20 = str8;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                            default:
                                                a(c6253a, fVar9, c6253a.c(next), dVar, next7);
                                                str3 = str29;
                                                str18 = str30;
                                                str19 = str32;
                                                str22 = str;
                                                str21 = str36;
                                                str20 = str8;
                                                str8 = str20;
                                                str36 = str21;
                                                str = str22;
                                                it14 = it4;
                                                str29 = str3;
                                                str30 = str18;
                                                str32 = str19;
                                        }
                                        str4 = str30;
                                        str9 = str;
                                        str13 = str36;
                                        str17 = str8;
                                        str8 = str17;
                                        break;
                                    }
                                    str3 = str29;
                                    str6 = str32;
                                    str4 = str30;
                                    str9 = str;
                                    str13 = str36;
                                    str17 = str8;
                                    str8 = str17;
                                    break;
                                case '\t':
                                    f(0, c6253a, next, fVar9);
                                default:
                                    str3 = str29;
                                    str4 = str30;
                                    str5 = str31;
                                    str6 = str32;
                                    str9 = str;
                                    str13 = str36;
                                    break;
                            }
                        } else {
                            str2 = str28;
                            str3 = str29;
                            str4 = str30;
                            str5 = str31;
                            str6 = str32;
                            str13 = str34;
                            str8 = str35;
                            str9 = str;
                            g(c6253a, dVar, next, fVar9);
                        }
                    } else {
                        str2 = str28;
                        str3 = str29;
                        str4 = str30;
                        str5 = str31;
                        str6 = str32;
                        str13 = str34;
                        str8 = str35;
                        str9 = str;
                        if (m12 instanceof i2.e) {
                            dVar.f68872a.put(next, Integer.valueOf(m12.e()));
                        }
                    }
                    str7 = str13;
                    break;
            }
            str28 = str2;
            str30 = str4;
            str34 = str7;
            str29 = str3;
            str32 = str6;
            str33 = str9;
            str31 = str5;
            str35 = str8;
        }
    }

    private static float i(C6253A c6253a, float f7) {
        return C6253A.p((C6253A) c6253a.e().f3144a, f7);
    }
}
