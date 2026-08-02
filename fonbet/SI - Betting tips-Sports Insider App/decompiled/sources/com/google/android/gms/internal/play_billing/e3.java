package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e3 implements u3 {

    /* renamed from: b, reason: collision with root package name */
    public static final e3 f5439b = new e3(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5440a;

    public /* synthetic */ e3(int i5) {
        this.f5440a = i5;
    }

    public static final s3 c(Object obj, Object obj2) {
        s3 s3Var = (s3) obj;
        s3 s3Var2 = (s3) obj2;
        if (!s3Var2.isEmpty()) {
            if (!s3Var.f5582a) {
                if (s3Var.isEmpty()) {
                    s3Var = new s3();
                } else {
                    s3 s3Var3 = new s3(s3Var);
                    s3Var3.f5582a = true;
                    s3Var = s3Var3;
                }
            }
            s3Var.d();
            if (!s3Var2.isEmpty()) {
                s3Var.putAll(s3Var2);
            }
        }
        return s3Var;
    }

    @Override // com.google.android.gms.internal.play_billing.u3
    public c4 a(Class cls) {
        switch (this.f5440a) {
            case 0:
                if (!g3.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (c4) g3.h(cls.asSubclass(g3.class)).d(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.u3
    public boolean b(Class cls) {
        switch (this.f5440a) {
            case 0:
                return g3.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
