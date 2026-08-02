package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
import androidx.media3.common.b;
import com.google.android.gms.internal.fido.zzfv;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ironsource.U3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pp4 implements vuk, zzfv {
    public static final int[] e = {8, 13, 11, 2, 0, 1, 7};
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public Object d;

    public pp4(MessageDigest messageDigest, int i) {
        this.a = 8;
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.d = messageDigest;
        this.c = i;
    }

    public static void d(ArrayList arrayList, int i) {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (e[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public static int e(ArrayList arrayList, int i, umg umgVar) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        smg smgVar = umgVar.b;
        if (obj != smgVar) {
            return -1;
        }
        Iterator it = smgVar.a().iterator();
        while (it.hasNext()) {
            if (((wmg) it.next()) == umgVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList h(qd2 qd2Var) {
        ArrayList arrayList = new ArrayList();
        while (!qd2Var.q()) {
            String str = (String) qd2Var.d;
            String str2 = null;
            if (!qd2Var.q()) {
                int i = qd2Var.b;
                char charAt = str.charAt(i);
                if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                    qd2Var.b = i;
                } else {
                    int h = qd2Var.h();
                    while (true) {
                        if ((h < 65 || h > 90) && (h < 97 || h > 122)) {
                            break;
                        }
                        h = qd2Var.h();
                    }
                    str2 = str.substring(i, qd2Var.b);
                }
            }
            if (str2 == null) {
                break;
            }
            try {
                arrayList.add(rd2.valueOf(str2));
            } catch (IllegalArgumentException unused) {
            }
            if (!qd2Var.P()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean o(ae2 ae2Var, int i, ArrayList arrayList, int i2, umg umgVar) {
        be2 be2Var = (be2) ae2Var.a.get(i);
        if (!r(be2Var, umgVar)) {
            return false;
        }
        int i3 = be2Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!q(ae2Var, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return q(ae2Var, i - 1, arrayList, i2);
        }
        int e2 = e(arrayList, i2, umgVar);
        if (e2 <= 0) {
            return false;
        }
        return o(ae2Var, i - 1, arrayList, i2, (umg) umgVar.b.a().get(e2 - 1));
    }

    public static boolean p(ae2 ae2Var, umg umgVar) {
        ArrayList arrayList = new ArrayList();
        Object obj = umgVar.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((wmg) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = ae2Var.a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = ae2Var.a;
        if (size2 == 1) {
            return r((be2) arrayList3.get(0), umgVar);
        }
        return o(ae2Var, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, umgVar);
    }

    public static boolean q(ae2 ae2Var, int i, ArrayList arrayList, int i2) {
        be2 be2Var = (be2) ae2Var.a.get(i);
        umg umgVar = (umg) arrayList.get(i2);
        if (!r(be2Var, umgVar)) {
            return false;
        }
        int i3 = be2Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (q(ae2Var, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return q(ae2Var, i - 1, arrayList, i2 - 1);
        }
        int e2 = e(arrayList, i2, umgVar);
        if (e2 <= 0) {
            return false;
        }
        return o(ae2Var, i - 1, arrayList, i2, (umg) umgVar.b.a().get(e2 - 1));
    }

    public static boolean r(be2 be2Var, umg umgVar) {
        ArrayList arrayList;
        String str = be2Var.b;
        if (str != null && !str.equals(umgVar.o().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList arrayList2 = be2Var.c;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                pd2 pd2Var = (pd2) it.next();
                String str2 = pd2Var.a;
                String str3 = pd2Var.c;
                if (str2.equals("id")) {
                    if (!str3.equals(umgVar.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = umgVar.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = be2Var.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            if (!((sd2) it2.next()).a(umgVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vuk
    public void a() {
        this.b = true;
    }

    @Override // defpackage.vuk
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.b = false;
    }

    @Override // defpackage.vuk
    public void c() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.d;
        actionBarContextView.f = null;
        super/*android.view.View*/.setVisibility(this.c);
    }

    public b f(b bVar) {
        if (!this.b || !((zic) this.d).i(bVar)) {
            return bVar;
        }
        qm8 a = bVar.a();
        String str = bVar.k;
        a.n = sjc.p("application/x-media3-cues");
        a.L = ((zic) this.d).f(bVar);
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.o);
        sb.append(str != null ? " ".concat(str) : "");
        a.j = sb.toString();
        a.s = Long.MAX_VALUE;
        return new b(a);
    }

    public void g(zl1 zl1Var, qd2 qd2Var) {
        int intValue;
        char charAt;
        int S;
        String U = qd2Var.U();
        qd2Var.Q();
        if (U == null) {
            throw new od2("Invalid '@' rule");
        }
        int i = 0;
        if (!this.b && U.equals(U3.i.I0)) {
            ArrayList h = h(qd2Var);
            if (!qd2Var.m('{')) {
                throw new od2("Invalid @media rule: missing rule set");
            }
            qd2Var.Q();
            rd2 rd2Var = (rd2) this.d;
            Iterator it = h.iterator();
            while (it.hasNext()) {
                rd2 rd2Var2 = (rd2) it.next();
                if (rd2Var2 == rd2.a || rd2Var2 == rd2Var) {
                    this.b = true;
                    zl1Var.h(j(qd2Var));
                    this.b = false;
                    break;
                }
            }
            j(qd2Var);
            if (!qd2Var.q() && !qd2Var.m('}')) {
                throw new od2("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.b || !U.equals("import")) {
            while (!qd2Var.q() && ((intValue = qd2Var.F().intValue()) != 59 || i != 0)) {
                if (intValue == 123) {
                    i++;
                } else if (intValue == 125 && i > 0 && i - 1 == 0) {
                    break;
                }
            }
        } else {
            String str = null;
            if (!qd2Var.q()) {
                int i2 = qd2Var.b;
                if (qd2Var.o("url(")) {
                    qd2Var.Q();
                    String T = qd2Var.T();
                    if (T == null) {
                        String str2 = (String) qd2Var.d;
                        StringBuilder sb = new StringBuilder();
                        while (!qd2Var.q() && (charAt = str2.charAt(qd2Var.b)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !j12.B(charAt) && !Character.isISOControl((int) charAt)) {
                            qd2Var.b++;
                            if (charAt == '\\') {
                                if (!qd2Var.q()) {
                                    int i3 = qd2Var.b;
                                    qd2Var.b = i3 + 1;
                                    charAt = str2.charAt(i3);
                                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                        int S2 = qd2.S(charAt);
                                        if (S2 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !qd2Var.q() && (S = qd2.S(str2.charAt(qd2Var.b))) != -1; i4++) {
                                                qd2Var.b++;
                                                S2 = (S2 * 16) + S;
                                            }
                                            sb.append((char) S2);
                                        }
                                    }
                                }
                            }
                            sb.append(charAt);
                        }
                        T = sb.length() == 0 ? null : sb.toString();
                    }
                    if (T == null) {
                        qd2Var.b = i2;
                    } else {
                        qd2Var.Q();
                        if (qd2Var.q() || qd2Var.o(")")) {
                            str = T;
                        } else {
                            qd2Var.b = i2;
                        }
                    }
                }
            }
            if (str == null) {
                str = qd2Var.T();
            }
            if (str == null) {
                throw new od2("Invalid @import rule: expected string or url()");
            }
            qd2Var.Q();
            h(qd2Var);
            if (!qd2Var.q() && !qd2Var.m(';')) {
                throw new od2("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        qd2Var.Q();
    }

    public boolean i(zl1 zl1Var, qd2 qd2Var) {
        ArrayList V = qd2Var.V();
        if (V == null || V.isEmpty()) {
            return false;
        }
        if (!qd2Var.m('{')) {
            throw new od2("Malformed rule block: expected '{'");
        }
        qd2Var.Q();
        omg omgVar = new omg();
        do {
            String U = qd2Var.U();
            qd2Var.Q();
            if (!qd2Var.m(':')) {
                throw new od2("Expected ':'");
            }
            qd2Var.Q();
            String str = (String) qd2Var.d;
            String str2 = null;
            if (!qd2Var.q()) {
                int i = qd2Var.b;
                int charAt = str.charAt(i);
                int i2 = i;
                while (charAt != -1 && charAt != 59 && charAt != 125 && charAt != 33 && charAt != 10 && charAt != 13) {
                    if (!j12.B(charAt)) {
                        i2 = qd2Var.b + 1;
                    }
                    charAt = qd2Var.h();
                }
                if (qd2Var.b > i) {
                    str2 = str.substring(i, i2);
                } else {
                    qd2Var.b = i;
                }
            }
            if (str2 == null) {
                throw new od2("Expected property value");
            }
            qd2Var.Q();
            if (qd2Var.m('!')) {
                qd2Var.Q();
                if (!qd2Var.o("important")) {
                    throw new od2("Malformed rule set: found unexpected '!'");
                }
                qd2Var.Q();
            }
            qd2Var.m(';');
            fog.C(omgVar, U, str2);
            qd2Var.Q();
            if (qd2Var.q()) {
                break;
            }
        } while (!qd2Var.m('}'));
        qd2Var.Q();
        Iterator it = V.iterator();
        while (it.hasNext()) {
            ae2 ae2Var = (ae2) it.next();
            int i3 = this.c;
            zd2 zd2Var = new zd2();
            zd2Var.a = ae2Var;
            zd2Var.b = omgVar;
            zd2Var.c = i3;
            zl1Var.g(zd2Var);
        }
        return true;
    }

    public zl1 j(qd2 qd2Var) {
        zl1 zl1Var = new zl1(1);
        while (!qd2Var.q()) {
            try {
                if (!qd2Var.o("<!--") && !qd2Var.o("-->")) {
                    if (!qd2Var.m('@')) {
                        if (!i(zl1Var, qd2Var)) {
                            break;
                        }
                    } else {
                        g(zl1Var, qd2Var);
                    }
                }
            } catch (od2 e2) {
                e2.getMessage();
                return zl1Var;
            }
        }
        return zl1Var;
    }

    public kotlinx.serialization.json.b k() {
        kotlinx.serialization.json.b cVar;
        Object obj;
        Object invoke;
        n4 n4Var = (n4) this.d;
        byte x = n4Var.x();
        if (x == 1) {
            return n(true);
        }
        if (x == 0) {
            return n(false);
        }
        if (x != 6) {
            if (x == 8) {
                return l();
            }
            n4.s(n4Var, "Cannot read Json element because of unexpected ".concat(lz.R(x)), 0, null, 6);
            throw null;
        }
        int i = this.c + 1;
        this.c = i;
        if (i == 200) {
            gha ghaVar = new gha(this, null);
            Unit unit = Unit.a;
            lu3 lu3Var = tm4.a;
            vm4 vm4Var = new vm4(null);
            vm4Var.a = ghaVar;
            vm4Var.b = unit;
            vm4Var.c = vm4Var;
            lu3 lu3Var2 = tm4.a;
            vm4Var.d = lu3Var2;
            while (true) {
                obj = vm4Var.d;
                rq3 rq3Var = vm4Var.c;
                if (rq3Var == null) {
                    break;
                }
                p2g p2gVar = w2g.b;
                if (Intrinsics.c(lu3Var2, obj)) {
                    try {
                        gha ghaVar2 = vm4Var.a;
                        Unit unit2 = vm4Var.b;
                        if (ghaVar2 == null) {
                            ghaVar2.getClass();
                            CoroutineContext context = rq3Var.getContext();
                            Object x9aVar = context == g.a ? new x9a(rq3Var) : new y9a(rq3Var, context);
                            i5k.e(3, ghaVar2);
                            invoke = ghaVar2.invoke(vm4Var, unit2, x9aVar);
                        } else {
                            i5k.e(3, ghaVar2);
                            invoke = ghaVar2.invoke(vm4Var, unit2, rq3Var);
                        }
                        if (invoke != lu3.a) {
                            rq3Var.resumeWith(invoke);
                        }
                    } catch (Throwable th) {
                        p2g p2gVar2 = w2g.b;
                        rq3Var.resumeWith(new u2g(th));
                    }
                } else {
                    vm4Var.d = lu3Var2;
                    rq3Var.resumeWith(obj);
                }
            }
            y6a.M(obj);
            cVar = (kotlinx.serialization.json.b) obj;
        } else {
            byte i2 = n4Var.i((byte) 6);
            if (n4Var.x() == 4) {
                n4.s(n4Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!n4Var.e()) {
                    break;
                }
                String n = this.b ? n4Var.n() : n4Var.l();
                n4Var.i((byte) 5);
                linkedHashMap.put(n, k());
                i2 = n4Var.h();
                if (i2 != 4) {
                    if (i2 != 7) {
                        n4.s(n4Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (i2 == 6) {
                n4Var.i((byte) 7);
            } else if (i2 == 4) {
                yfa.r(n4Var, "object");
                throw null;
            }
            cVar = new c(linkedHashMap);
        }
        this.c--;
        return cVar;
    }

    public a l() {
        n4 n4Var = (n4) this.d;
        byte h = n4Var.h();
        if (n4Var.x() == 4) {
            n4.s(n4Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (n4Var.e()) {
            arrayList.add(k());
            h = n4Var.h();
            if (h != 4) {
                boolean z = h == 9;
                int i = n4Var.b;
                if (!z) {
                    n4.s(n4Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (h == 8) {
            n4Var.i((byte) 9);
        } else if (h == 4) {
            yfa.r(n4Var, "array");
            throw null;
        }
        return new a(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(um4 um4Var, h21 h21Var) {
        hha hhaVar;
        int i;
        LinkedHashMap linkedHashMap;
        um4 um4Var2;
        byte b;
        n4 n4Var;
        pp4 pp4Var;
        n4 n4Var2 = (n4) this.d;
        if (h21Var instanceof hha) {
            hhaVar = (hha) h21Var;
            int i2 = hhaVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hhaVar.y = i2 - Integer.MIN_VALUE;
                Object obj = hhaVar.w;
                lu3 lu3Var = lu3.a;
                i = hhaVar.y;
                int i3 = 0;
                if (i != 0) {
                    y6a.M(obj);
                    byte i4 = n4Var2.i((byte) 6);
                    if (n4Var2.x() == 4) {
                        n4.s(n4Var2, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                    um4Var2 = um4Var;
                    b = i4;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = hhaVar.v;
                    String str = hhaVar.u;
                    linkedHashMap = hhaVar.t;
                    pp4Var = hhaVar.s;
                    um4Var2 = hhaVar.r;
                    y6a.M(obj);
                    linkedHashMap.put(str, (kotlinx.serialization.json.b) obj);
                    b = ((n4) pp4Var.d).h();
                    if (b != 4) {
                        if (b != 7) {
                            n4.s((n4) pp4Var.d, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        n4 n4Var3 = (n4) pp4Var.d;
                        if (b != 6) {
                            n4Var3.i((byte) 7);
                        } else if (b == 4) {
                            yfa.r(n4Var3, "object");
                            throw null;
                        }
                        return new c(linkedHashMap);
                    }
                    i3 = i5;
                    this = pp4Var;
                }
                n4Var = (n4) this.d;
                if (n4Var.e()) {
                    pp4Var = this;
                    n4 n4Var32 = (n4) pp4Var.d;
                    if (b != 6) {
                    }
                    return new c(linkedHashMap);
                }
                String n = this.b ? n4Var.n() : n4Var.l();
                n4Var.i((byte) 5);
                Unit unit = Unit.a;
                hhaVar.r = um4Var2;
                hhaVar.s = this;
                hhaVar.t = linkedHashMap;
                hhaVar.u = n;
                hhaVar.v = i3;
                hhaVar.y = 1;
                vm4 vm4Var = (vm4) um4Var2;
                vm4Var.getClass();
                vm4Var.c = hhaVar;
                vm4Var.b = unit;
                return lu3Var;
            }
        }
        hhaVar = new hha(this, h21Var);
        Object obj2 = hhaVar.w;
        lu3 lu3Var2 = lu3.a;
        i = hhaVar.y;
        int i32 = 0;
        if (i != 0) {
        }
        n4Var = (n4) this.d;
        if (n4Var.e()) {
        }
    }

    public d n(boolean z) {
        n4 n4Var = (n4) this.d;
        String n = (this.b || !z) ? n4Var.n() : n4Var.l();
        return (z || !Intrinsics.c(n, "null")) ? new dga(n, z, null) : JsonNull.INSTANCE;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                en0 I = qea.I(this);
                I.e((jh2) this.d, "callOptions");
                I.f("previousAttempts", String.valueOf(this.c));
                I.d("isTransparentRetry", this.b);
                return I.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pp4(byte b, int i) {
        this.a = i;
    }

    public pp4(gfa gfaVar, n4 n4Var) {
        this.a = 6;
        this.d = n4Var;
        this.b = gfaVar.c;
    }

    public pp4(FloatingActionButton floatingActionButton) {
        this.a = 5;
        this.b = false;
        this.c = 0;
        this.d = floatingActionButton;
    }

    public pp4(jh2 jh2Var, int i, boolean z) {
        this.a = 3;
        z1a.y(jh2Var, "callOptions");
        this.d = jh2Var;
        this.c = i;
        this.b = z;
    }

    public pp4(ActionBarContextView actionBarContextView) {
        this.a = 1;
        this.d = actionBarContextView;
        this.b = false;
    }

    public pp4(int i) {
        this.a = 2;
        this.b = false;
        this.d = rd2.b;
        this.c = i;
    }
}
