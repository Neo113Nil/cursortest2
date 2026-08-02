package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class am3 {
    public final hd2 a;
    public int b;
    public int c;
    public dad d;
    public int e;
    public final ArrayList f;

    public am3() {
        new ArrayList();
        this.a = new hd2(new char[0]);
        this.c = 1000;
        this.e = 0;
        this.f = new ArrayList();
    }

    public static xtc b(xtc xtcVar, ll3 ll3Var, Function1 function1) {
        return xtcVar.z(new zl3(ll3Var, function1));
    }

    public static void e(am3 am3Var, yna[] ynaVarArr) {
        f4a f4aVar = f4a.f;
        int i = am3Var.c;
        am3Var.c = i + 1;
        df9 df9Var = new df9(Integer.valueOf(i));
        bd2 bd2Var = new bd2(new char[0]);
        for (yna ynaVar : ynaVarArr) {
            ynaVar.b.get(duf.a.getOrCreateKotlinClass(zm2.class).getSimpleName());
            bd2Var.q(kd2.q(ynaVar.a().toString()));
        }
        bd2 bd2Var2 = new bd2(new char[0]);
        bd2Var2.q(kd2.q((String) f4aVar.b));
        Float f = (Float) f4aVar.c;
        bd2Var2.q(new fd2(f != null ? f.floatValue() : 0.5f));
        hd2 a = am3Var.a(df9Var);
        a.D("hChain");
        a.C("contains", bd2Var);
        a.C(TtmlNode.TAG_STYLE, bd2Var2);
        am3Var.i(16);
        for (yna ynaVar2 : ynaVarArr) {
            am3Var.i(ynaVar2.hashCode());
        }
        am3Var.i(f4aVar.hashCode());
    }

    public final hd2 a(yna ynaVar) {
        String obj = ynaVar.a().toString();
        hd2 hd2Var = this.a;
        dd2 w = hd2Var.w(obj);
        if ((w instanceof hd2 ? (hd2) w : null) == null) {
            hd2Var.C(obj, new hd2(new char[0]));
        }
        dd2 t = hd2Var.t(obj);
        if (t instanceof hd2) {
            return (hd2) t;
        }
        StringBuilder q = wt3.q("no object found for key <", obj, ">, found [");
        q.append(t.o());
        q.append("] : ");
        q.append(t);
        throw new id2(q.toString(), hd2Var);
    }

    public final xl3 c(float f) {
        int i = this.c;
        this.c = i + 1;
        Integer valueOf = Integer.valueOf(i);
        df9 df9Var = new df9(valueOf);
        bd2 bd2Var = new bd2(new char[0]);
        bd2Var.q(kd2.q(TtmlNode.END));
        bd2Var.q(new fd2(f));
        hd2 a = a(df9Var);
        a.D("vGuideline");
        a.C("percent", bd2Var);
        i(3);
        i(Float.hashCode(f));
        return new xl3(valueOf, 0, df9Var);
    }

    public final xl3 d(float f) {
        int i = this.c;
        this.c = i + 1;
        Integer valueOf = Integer.valueOf(i);
        df9 df9Var = new df9(valueOf);
        bd2 bd2Var = new bd2(new char[0]);
        bd2Var.q(kd2.q("start"));
        bd2Var.q(new fd2(f));
        hd2 a = a(df9Var);
        a.D("vGuideline");
        a.C("percent", bd2Var);
        i(3);
        i(Float.hashCode(f));
        return new xl3(valueOf, 0, df9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am3)) {
            return false;
        }
        return this.a.equals(((am3) obj).a);
    }

    public final ll3 f() {
        int i = this.e;
        this.e = i + 1;
        ArrayList arrayList = this.f;
        ll3 ll3Var = (ll3) CollectionsKt.a0(i, arrayList);
        if (ll3Var != null) {
            return ll3Var;
        }
        ll3 ll3Var2 = new ll3(Integer.valueOf(this.e));
        arrayList.add(ll3Var2);
        return ll3Var2;
    }

    public final dad g() {
        dad dadVar = this.d;
        if (dadVar != null) {
            return dadVar;
        }
        dad dadVar2 = new dad(this, 15);
        this.d = dadVar2;
        return dadVar2;
    }

    public final void h() {
        this.a.e.clear();
        this.c = 1000;
        this.b = 0;
        this.e = 0;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(int i) {
        this.b = ((this.b * 1009) + i) % 1000000007;
    }
}
