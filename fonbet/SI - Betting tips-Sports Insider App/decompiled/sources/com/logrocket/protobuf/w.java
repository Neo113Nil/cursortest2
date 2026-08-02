package com.logrocket.protobuf;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w implements s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final w f6812b = new w(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6813a;

    public /* synthetic */ w(int i5) {
        this.f6813a = i5;
    }

    @Override // com.logrocket.protobuf.s0
    public final c1 a(Class cls) {
        switch (this.f6813a) {
            case 0:
                if (!z.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (c1) z.h(cls.asSubclass(z.class)).g(3);
                } catch (Exception e7) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.logrocket.protobuf.s0
    public final boolean b(Class cls) {
        switch (this.f6813a) {
            case 0:
                return z.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
