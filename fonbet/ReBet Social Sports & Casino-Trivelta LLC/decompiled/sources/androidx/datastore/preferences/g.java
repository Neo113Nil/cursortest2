package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.AbstractC2126a;
import androidx.datastore.preferences.protobuf.AbstractC2147w;
import androidx.datastore.preferences.protobuf.AbstractC2149y;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends AbstractC2147w implements Q {
    private static final g DEFAULT_INSTANCE;
    private static volatile Y PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC2149y.b strings_ = AbstractC2147w.p();

    public static final class a extends AbstractC2147w.a implements Q {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a m(Iterable iterable) {
            h();
            ((g) this.f19681b).M(iterable);
            return this;
        }

        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC2147w.H(g.class, gVar);
    }

    public static g O() {
        return DEFAULT_INSTANCE;
    }

    public static a Q() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public final void M(Iterable iterable) {
        N();
        AbstractC2126a.b(iterable, this.strings_);
    }

    public final void N() {
        AbstractC2149y.b bVar = this.strings_;
        if (bVar.isModifiable()) {
            return;
        }
        this.strings_ = AbstractC2147w.B(bVar);
    }

    public List P() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2147w
    public final Object o(AbstractC2147w.d dVar, Object obj, Object obj2) {
        Y y10;
        e eVar = null;
        switch (e.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC2147w.D(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y y11 = PARSER;
                if (y11 != null) {
                    return y11;
                }
                synchronized (g.class) {
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
