package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e5 implements y5 {

    /* renamed from: b, reason: collision with root package name */
    public static final e5 f5028b = new e5(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5029a;

    public /* synthetic */ e5(int i5) {
        this.f5029a = i5;
    }

    public static final w5 c(Object obj, Object obj2) {
        w5 w5Var = (w5) obj;
        w5 w5Var2 = (w5) obj2;
        if (!w5Var2.isEmpty()) {
            if (!w5Var.f5338a) {
                w5Var = w5Var.a();
            }
            w5Var.e();
            if (!w5Var2.isEmpty()) {
                w5Var.putAll(w5Var2);
            }
        }
        return w5Var;
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public boolean a(Class cls) {
        switch (this.f5029a) {
            case 0:
                return g5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.measurement.y5
    public g6 b(Class cls) {
        switch (this.f5029a) {
            case 0:
                if (!g5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (g6) g5.l(cls.asSubclass(g5.class)).o(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
