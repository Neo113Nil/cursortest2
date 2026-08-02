package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractC2147w;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.r0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends AbstractC2147w implements Q {
    private static final f DEFAULT_INSTANCE;
    private static volatile Y PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private J preferences_ = J.d();

    public static final class a extends AbstractC2147w.a implements Q {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a m(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            h();
            ((f) this.f19681b).M().put(str, hVar);
            return this;
        }

        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final I f19389a = I.d(r0.b.f19590k, "", r0.b.f19592m, h.V());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC2147w.H(f.class, fVar);
    }

    public static a Q() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public static f R(InputStream inputStream) {
        return (f) AbstractC2147w.F(DEFAULT_INSTANCE, inputStream);
    }

    public final Map M() {
        return O();
    }

    public Map N() {
        return Collections.unmodifiableMap(P());
    }

    public final J O() {
        if (!this.preferences_.h()) {
            this.preferences_ = this.preferences_.k();
        }
        return this.preferences_;
    }

    public final J P() {
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2147w
    public final Object o(AbstractC2147w.d dVar, Object obj, Object obj2) {
        Y y10;
        e eVar = null;
        switch (e.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC2147w.D(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f19389a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y11 = PARSER;
                if (y11 != null) {
                    return y11;
                }
                synchronized (f.class) {
                    try {
                        y10 = PARSER;
                        if (y10 == null) {
                            y10 = new AbstractC2147w.b(DEFAULT_INSTANCE);
                            PARSER = y10;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return y10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
