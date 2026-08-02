package s9;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static final p f23391b = new p(1);

    /* renamed from: a, reason: collision with root package name */
    public final y f23392a;

    public z() {
        e0 e0Var;
        Class cls = c.f23286a;
        try {
            e0Var = (e0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            e0Var = f23391b;
        }
        e0[] e0VarArr = {p.f23365b, e0Var};
        y yVar = new y();
        yVar.f23389a = e0VarArr;
        Charset charset = t.f23375a;
        this.f23392a = yVar;
    }
}
