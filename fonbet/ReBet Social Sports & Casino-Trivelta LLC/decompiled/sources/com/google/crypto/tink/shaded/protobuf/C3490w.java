package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3490w implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final C3490w f37476a = new C3490w();

    public static C3490w a() {
        return f37476a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.N
    public boolean isSupported(Class cls) {
        return AbstractC3491x.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.N
    public M messageInfoFor(Class cls) {
        if (!AbstractC3491x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (M) AbstractC3491x.p(cls.asSubclass(AbstractC3491x.class)).e();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }
}
