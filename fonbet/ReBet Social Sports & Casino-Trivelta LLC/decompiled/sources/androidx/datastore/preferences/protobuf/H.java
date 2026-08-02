package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class H implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final O f19423b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final O f19424a;

    public class a implements O {
        @Override // androidx.datastore.preferences.protobuf.O
        public boolean isSupported(Class cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public N messageInfoFor(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    public static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$ProtoSyntax;

        static {
            int[] iArr = new int[a0.values().length];
            $SwitchMap$com$google$protobuf$ProtoSyntax = iArr;
            try {
                iArr[a0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class c implements O {
        private O[] factories;

        public c(O... oArr) {
            this.factories = oArr;
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public boolean isSupported(Class cls) {
            for (O o10 : this.factories) {
                if (o10.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public N messageInfoFor(Class cls) {
            for (O o10 : this.factories) {
                if (o10.isSupported(cls)) {
                    return o10.messageInfoFor(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public H() {
        this(b());
    }

    public static boolean a(N n10) {
        return b.$SwitchMap$com$google$protobuf$ProtoSyntax[n10.getSyntax().ordinal()] != 1;
    }

    public static O b() {
        return new c(C2146v.a(), c());
    }

    public static O c() {
        if (b0.f19462d) {
            return f19423b;
        }
        try {
            return (O) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f19423b;
        }
    }

    public static f0 d(Class cls, N n10) {
        if (e(cls)) {
            return T.G(cls, n10, X.b(), F.b(), h0.K(), a(n10) ? r.b() : null, M.b());
        }
        V a10 = X.a();
        AbstractC2141p abstractC2141p = null;
        D a11 = F.a();
        m0 J10 = h0.J();
        if (a(n10)) {
            abstractC2141p = r.a();
        }
        return T.G(cls, n10, a10, a11, J10, abstractC2141p, M.a());
    }

    public static boolean e(Class cls) {
        return b0.f19462d || AbstractC2147w.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public f0 createSchema(Class cls) {
        h0.G(cls);
        N messageInfoFor = this.f19424a.messageInfoFor(cls);
        return messageInfoFor.isMessageSetWireFormat() ? e(cls) ? U.e(h0.K(), r.b(), messageInfoFor.getDefaultInstance()) : U.e(h0.J(), r.a(), messageInfoFor.getDefaultInstance()) : d(cls, messageInfoFor);
    }

    public H(O o10) {
        this.f19424a = (O) AbstractC2149y.b(o10, "messageInfoFactory");
    }
}
