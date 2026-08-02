package defpackage;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nv1 implements iw8 {
    public static final nv1 a;
    private static final /* synthetic */ uye descriptor;

    static {
        nv1 nv1Var = new nv1();
        a = nv1Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.BidRequest", nv1Var, 12);
        uyeVar.j("imp", true);
        uyeVar.j("app", true);
        uyeVar.j(U3.i.G, true);
        uyeVar.j("format", true);
        uyeVar.j("user", true);
        uyeVar.j("test", true);
        uyeVar.j("tmax", true);
        uyeVar.j("badv", true);
        uyeVar.j("source", true);
        uyeVar.j("regs", true);
        uyeVar.j("custom_signals", true);
        uyeVar.j("ext", true);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = pv1.m;
        return new KSerializer[]{joaVarArr[0].getValue(), l98.W(y90.a), l98.W(r05.a), om8.a, l98.W(rek.a), qb2.a, a7a.a, l98.W((KSerializer) joaVarArr[7].getValue()), l98.W(zvh.a), l98.W(pvf.a), l98.W(wgh.a), joaVarArr[11].getValue()};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        byte b;
        boolean z;
        boolean z2;
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b2 = decoder.b(uyeVar);
        joa[] joaVarArr = pv1.m;
        Map map = null;
        ygh yghVar = null;
        uvf uvfVar = null;
        dwh dwhVar = null;
        boolean z3 = true;
        String[] strArr = null;
        int i = 0;
        hw9[] hw9VarArr = null;
        ja0 ja0Var = null;
        t05 t05Var = null;
        tm8 tm8Var = null;
        wek wekVar = null;
        byte b3 = 0;
        int i2 = 0;
        while (z3) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    b = b3;
                    z3 = false;
                    b3 = b;
                case 0:
                    z = z3;
                    b = b3;
                    hw9VarArr = (hw9[]) b2.w(uyeVar, 0, (dy4) joaVarArr[0].getValue(), hw9VarArr);
                    i |= 1;
                    z3 = z;
                    b3 = b;
                case 1:
                    z = z3;
                    b = b3;
                    ja0Var = (ja0) b2.i(uyeVar, 1, y90.a, ja0Var);
                    i |= 2;
                    z3 = z;
                    b3 = b;
                case 2:
                    z = z3;
                    b = b3;
                    t05Var = (t05) b2.i(uyeVar, 2, r05.a, t05Var);
                    i |= 4;
                    z3 = z;
                    b3 = b;
                case 3:
                    z = z3;
                    b = b3;
                    tm8Var = (tm8) b2.w(uyeVar, 3, om8.a, tm8Var);
                    i |= 8;
                    z3 = z;
                    b3 = b;
                case 4:
                    z = z3;
                    b = b3;
                    wekVar = (wek) b2.i(uyeVar, 4, rek.a, wekVar);
                    i |= 16;
                    z3 = z;
                    b3 = b;
                case 5:
                    z2 = z3;
                    b3 = b2.A(uyeVar, 5);
                    i |= 32;
                    z3 = z2;
                case 6:
                    z2 = z3;
                    i2 = b2.l(uyeVar, 6);
                    i |= 64;
                    z3 = z2;
                case 7:
                    z = z3;
                    b = b3;
                    strArr = (String[]) b2.i(uyeVar, 7, (dy4) joaVarArr[7].getValue(), strArr);
                    i |= 128;
                    z3 = z;
                    b3 = b;
                case 8:
                    z = z3;
                    b = b3;
                    dwhVar = (dwh) b2.i(uyeVar, 8, zvh.a, dwhVar);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    z3 = z;
                    b3 = b;
                case 9:
                    z = z3;
                    b = b3;
                    uvfVar = (uvf) b2.i(uyeVar, 9, pvf.a, uvfVar);
                    i |= 512;
                    z3 = z;
                    b3 = b;
                case 10:
                    z = z3;
                    b = b3;
                    yghVar = (ygh) b2.i(uyeVar, 10, wgh.a, yghVar);
                    i |= 1024;
                    z3 = z;
                    b3 = b;
                case 11:
                    z = z3;
                    b = b3;
                    map = (Map) b2.w(uyeVar, 11, (dy4) joaVarArr[11].getValue(), map);
                    i |= a.o;
                    z3 = z;
                    b3 = b;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b2.c(uyeVar);
        return new pv1(i, hw9VarArr, ja0Var, t05Var, tm8Var, wekVar, b3, i2, strArr, dwhVar, uvfVar, yghVar, map);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pv1 pv1Var = (pv1) obj;
        encoder.getClass();
        pv1Var.getClass();
        Map map = pv1Var.l;
        String[] strArr = pv1Var.h;
        int i = pv1Var.g;
        hw9[] hw9VarArr = pv1Var.a;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = pv1.m;
        if (b.o(uyeVar) || !Intrinsics.c(hw9VarArr, new hw9[0])) {
            b.f(uyeVar, 0, (KSerializer) joaVarArr[0].getValue(), hw9VarArr);
        }
        if (b.o(uyeVar) || pv1Var.b != null) {
            b.h(uyeVar, 1, y90.a, pv1Var.b);
        }
        if (b.o(uyeVar) || pv1Var.c != null) {
            b.h(uyeVar, 2, r05.a, pv1Var.c);
        }
        if (b.o(uyeVar) || !Intrinsics.c(pv1Var.d, new tm8(0, 0))) {
            b.f(uyeVar, 3, om8.a, pv1Var.d);
        }
        if (b.o(uyeVar) || pv1Var.e != null) {
            b.h(uyeVar, 4, rek.a, pv1Var.e);
        }
        if (b.o(uyeVar) || pv1Var.f != 0) {
            b.q(uyeVar, 5, pv1Var.f);
        }
        if (b.o(uyeVar) || i != 500) {
            b.u(6, i, uyeVar);
        }
        if (b.o(uyeVar) || strArr != null) {
            b.h(uyeVar, 7, (KSerializer) joaVarArr[7].getValue(), strArr);
        }
        if (b.o(uyeVar) || pv1Var.i != null) {
            b.h(uyeVar, 8, zvh.a, pv1Var.i);
        }
        if (b.o(uyeVar) || pv1Var.j != null) {
            b.h(uyeVar, 9, pvf.a, pv1Var.j);
        }
        if (b.o(uyeVar) || pv1Var.k != null) {
            b.h(uyeVar, 10, wgh.a, pv1Var.k);
        }
        if (b.o(uyeVar) || !Intrinsics.c(map, new LinkedHashMap())) {
            b.f(uyeVar, 11, (KSerializer) joaVarArr[11].getValue(), map);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
