package k5;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* loaded from: classes8.dex */
final class e3 extends D0<Om0.a> {

    /* renamed from: f, reason: collision with root package name */
    static final String f70733f = C7563s0.a(new byte[]{68, 18, 52, -29, 93, 52, -45, 90, -48, -92, 93, -80, 110, -8, -46, -3});

    /* renamed from: g, reason: collision with root package name */
    static final String f70734g = C7563s0.a(new byte[]{116, -106, 82, 93, 116, -28, -6, -89, -65, -48, -31, -99, -9, 25, -72, 77});

    /* renamed from: e, reason: collision with root package name */
    final g3 f70735e;

    e3(g3 g3Var) {
        super(Mm0.e.ShareScreenInfo);
        this.f70735e = g3Var;
    }

    @Override // k5.D0
    public final Om0.a u() throws Mm0.a, D1 {
        return s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k5.D0
    @NonNull
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final Om0.a s() throws P2, P1, C7571u0, C7502c2 {
        Om0.a aVar = new Om0.a();
        l3 l3Var = (l3) this.f70735e;
        if (l3Var.b()) {
            for (int i11 = 0; i11 < l3Var.a().size(); i11++) {
                Om0.a aVar2 = new Om0.a();
                String str = f70734g;
                String str2 = f70733f;
                if (i11 >= 6) {
                    int size = l3Var.a().size() - 1;
                    aVar2.put(str2, (Serializable) ((x2.d) l3Var.a().get(size)).f104935a);
                    aVar2.put(str, (Serializable) ((x2.d) l3Var.a().get(size)).f104936b);
                    aVar.put(String.valueOf(i11), aVar2);
                    return aVar;
                }
                aVar2.put(str2, (Serializable) ((x2.d) l3Var.a().get(i11)).f104935a);
                aVar2.put(str, (Serializable) ((x2.d) l3Var.a().get(i11)).f104936b);
                aVar.put(String.valueOf(i11), aVar2);
            }
        }
        return aVar;
    }
}
