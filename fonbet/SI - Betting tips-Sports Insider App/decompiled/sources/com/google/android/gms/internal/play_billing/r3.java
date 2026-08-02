package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r3 implements u3 {

    /* renamed from: b, reason: collision with root package name */
    public static final e3 f5557b = new e3(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f5558a;

    public r3(u3... u3VarArr) {
        this.f5558a = u3VarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.u3
    public c4 a(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            u3 u3Var = ((u3[]) this.f5558a)[i5];
            if (u3Var.b(cls)) {
                return u3Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.u3
    public boolean b(Class cls) {
        for (int i5 = 0; i5 < 2; i5++) {
            if (((u3[]) this.f5558a)[i5].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i5, Object obj, d4 d4Var) {
        z2 z2Var = (z2) this.f5558a;
        z2Var.Y(i5, 3);
        d4Var.i((t2) obj, z2Var.f5662b);
        z2Var.Y(i5, 4);
    }

    public void d(int i5, Object obj, d4 d4Var) {
        t2 t2Var = (t2) obj;
        z2 z2Var = (z2) this.f5558a;
        z2Var.a0((i5 << 3) | 2);
        z2Var.a0(t2Var.a(d4Var));
        d4Var.i(t2Var, z2Var.f5662b);
    }

    public r3() {
        a4 a4Var = a4.f5397c;
        r3 r3Var = new r3(e3.f5439b, f5557b);
        Charset charset = l3.f5497a;
        this.f5558a = r3Var;
    }

    public r3(z2 z2Var) {
        Charset charset = l3.f5497a;
        this.f5558a = z2Var;
        z2Var.f5662b = this;
    }
}
