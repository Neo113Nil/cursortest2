package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public final class G implements f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final N f37240b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final N f37241a;

    public class a implements N {
        @Override // com.google.crypto.tink.shaded.protobuf.N
        public boolean isSupported(Class cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public M messageInfoFor(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    public static class b implements N {
        private N[] factories;

        public b(N... nArr) {
            this.factories = nArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public boolean isSupported(Class cls) {
            for (N n10 : this.factories) {
                if (n10.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public M messageInfoFor(Class cls) {
            for (N n10 : this.factories) {
                if (n10.isSupported(cls)) {
                    return n10.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public G() {
        this(a());
    }

    public static N a() {
        return new b(C3490w.a(), b());
    }

    public static N b() {
        try {
            return (N) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f37240b;
        }
    }

    public static boolean c(M m10) {
        return m10.getSyntax() == Z.PROTO2;
    }

    public static e0 d(Class cls, M m10) {
        return AbstractC3491x.class.isAssignableFrom(cls) ? c(m10) ? S.M(cls, m10, W.b(), E.b(), g0.L(), AbstractC3486s.b(), L.b()) : S.M(cls, m10, W.b(), E.b(), g0.L(), null, L.b()) : c(m10) ? S.M(cls, m10, W.a(), E.a(), g0.G(), AbstractC3486s.a(), L.a()) : S.M(cls, m10, W.a(), E.a(), g0.H(), null, L.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public e0 createSchema(Class cls) {
        g0.I(cls);
        M messageInfoFor = this.f37241a.messageInfoFor(cls);
        return messageInfoFor.isMessageSetWireFormat() ? AbstractC3491x.class.isAssignableFrom(cls) ? T.f(g0.L(), AbstractC3486s.b(), messageInfoFor.getDefaultInstance()) : T.f(g0.G(), AbstractC3486s.a(), messageInfoFor.getDefaultInstance()) : d(cls, messageInfoFor);
    }

    public G(N n10) {
        this.f37241a = (N) AbstractC3493z.b(n10, "messageInfoFactory");
    }
}
