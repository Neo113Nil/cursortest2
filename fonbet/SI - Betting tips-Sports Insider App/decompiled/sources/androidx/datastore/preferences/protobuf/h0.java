package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final v f1615b = new v(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f1616a;

    public h0(o oVar) {
        a0.a(oVar, "output");
        this.f1616a = oVar;
        oVar.f1662a = this;
    }

    public void a(int i5, Object obj, x0 x0Var) {
        o oVar = (o) this.f1616a;
        oVar.x0(i5, 3);
        x0Var.e((a) obj, oVar.f1662a);
        oVar.x0(i5, 4);
    }

    public h0() {
        n0 n0Var;
        u0 u0Var = u0.f1715c;
        try {
            n0Var = (n0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            n0Var = f1615b;
        }
        n0[] n0VarArr = {v.f1718b, n0Var};
        g0 g0Var = new g0();
        g0Var.f1613a = n0VarArr;
        Charset charset = a0.f1572a;
        this.f1616a = g0Var;
    }
}
