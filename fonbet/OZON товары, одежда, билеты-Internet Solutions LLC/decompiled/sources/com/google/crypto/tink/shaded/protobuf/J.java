package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
final class J {

    /* renamed from: b, reason: collision with root package name */
    private static final a f59314b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final c f59315a;

    final class a implements Q {
        @Override // com.google.crypto.tink.shaded.protobuf.Q
        public final boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q
        public final P messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59316a;

        static {
            int[] iArr = new int[b0.values().length];
            f59316a = iArr;
            try {
                iArr[b0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements Q {

        /* renamed from: a, reason: collision with root package name */
        private Q[] f59317a;

        c(Q... qArr) {
            this.f59317a = qArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q
        public final boolean isSupported(Class<?> cls) {
            for (Q q11 : this.f59317a) {
                if (q11.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q
        public final P messageInfoFor(Class<?> cls) {
            for (Q q11 : this.f59317a) {
                if (q11.isSupported(cls)) {
                    return q11.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public J() {
        C5916w a11 = C5916w.a();
        int i11 = c0.f59349d;
        Object obj = f59314b;
        try {
            obj = (Q) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
        }
        c cVar = new c(a11, obj);
        byte[] bArr = C5919z.f59481b;
        this.f59315a = cVar;
    }

    public final <T> f0<T> a(Class<T> cls) {
        g0.k(cls);
        P messageInfoFor = this.f59315a.messageInfoFor(cls);
        if (messageInfoFor.isMessageSetWireFormat()) {
            int i11 = c0.f59349d;
            return AbstractC5917x.class.isAssignableFrom(cls) ? W.g(g0.o(), C5912s.b(), messageInfoFor.getDefaultInstance()) : W.g(g0.n(), C5912s.a(), messageInfoFor.getDefaultInstance());
        }
        int i12 = c0.f59349d;
        if (AbstractC5917x.class.isAssignableFrom(cls)) {
            Y b11 = Z.b();
            G b12 = H.b();
            o0 o11 = g0.o();
            r b13 = b.f59316a[messageInfoFor.getSyntax().ordinal()] != 1 ? C5912s.b() : null;
            N b14 = O.b();
            int i13 = V.f59325r;
            if (messageInfoFor instanceof e0) {
                return V.x((e0) messageInfoFor, b11, b12, o11, b13, b14);
            }
            throw null;
        }
        X a11 = Z.a();
        F a12 = H.a();
        m0<?, ?> n11 = g0.n();
        AbstractC5911q<?> a13 = b.f59316a[messageInfoFor.getSyntax().ordinal()] != 1 ? C5912s.a() : null;
        M a14 = O.a();
        int i14 = V.f59325r;
        if (messageInfoFor instanceof e0) {
            return V.x((e0) messageInfoFor, a11, a12, n11, a13, a14);
        }
        throw null;
    }
}
