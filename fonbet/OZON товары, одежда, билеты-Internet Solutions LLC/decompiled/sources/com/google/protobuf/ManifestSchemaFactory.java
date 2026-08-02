package com.google.protobuf;

/* loaded from: classes.dex */
final class ManifestSchemaFactory implements K {
    private static final z EMPTY_FACTORY = new z() { // from class: com.google.protobuf.ManifestSchemaFactory.1
        @Override // com.google.protobuf.z
        public boolean isSupported(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.z
        public y messageInfoFor(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    };
    private final z messageInfoFactory;

    private static class CompositeMessageInfoFactory implements z {
        private z[] factories;

        CompositeMessageInfoFactory(z... zVarArr) {
            this.factories = zVarArr;
        }

        @Override // com.google.protobuf.z
        public boolean isSupported(Class<?> cls) {
            for (z zVar : this.factories) {
                if (zVar.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.z
        public y messageInfoFor(Class<?> cls) {
            for (z zVar : this.factories) {
                if (zVar.isSupported(cls)) {
                    return zVar.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f60140a;

        static {
            int[] iArr = new int[G.values().length];
            f60140a = iArr;
            try {
                iArr[G.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ManifestSchemaFactory() {
        this(getDefaultMessageInfoFactory());
    }

    private static boolean allowExtensions(y yVar) {
        return a.f60140a[yVar.getSyntax().ordinal()] != 1;
    }

    private static z getDefaultMessageInfoFactory() {
        return new CompositeMessageInfoFactory(GeneratedMessageInfoFactory.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static z getDescriptorMessageInfoFactory() {
        int i11 = C5950a.f60193b;
        try {
            return (z) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static <T> J<T> newSchema(Class<T> cls, y yVar) {
        if (useLiteRuntime(cls)) {
            return MessageSchema.newSchema(cls, yVar, D.b(), C5968t.b(), L.p(), allowExtensions(yVar) ? C5959j.b() : null, x.b());
        }
        C a11 = D.a();
        AbstractC5958i<?> abstractC5958i = null;
        InterfaceC5967s a12 = C5968t.a();
        N<?, ?> o11 = L.o();
        if (allowExtensions(yVar)) {
            abstractC5958i = C5959j.a();
        }
        return MessageSchema.newSchema(cls, yVar, a11, a12, o11, abstractC5958i, x.a());
    }

    private static boolean useLiteRuntime(Class<?> cls) {
        int i11 = C5950a.f60193b;
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.K
    public <T> J<T> createSchema(Class<T> cls) {
        L.l(cls);
        y messageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        return messageInfoFor.isMessageSetWireFormat() ? useLiteRuntime(cls) ? MessageSetSchema.newSchema(L.p(), C5959j.b(), messageInfoFor.getDefaultInstance()) : MessageSetSchema.newSchema(L.o(), C5959j.a(), messageInfoFor.getDefaultInstance()) : newSchema(cls, messageInfoFor);
    }

    private ManifestSchemaFactory(z zVar) {
        Internal.a(zVar, "messageInfoFactory");
        this.messageInfoFactory = zVar;
    }
}
