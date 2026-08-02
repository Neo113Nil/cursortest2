package f1;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.d1;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.q;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.y;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends y {
    private static final e DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private k0 preferences_ = k0.f1640b;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        y.j(e.class, eVar);
    }

    public static k0 l(e eVar) {
        k0 k0Var = eVar.preferences_;
        if (!k0Var.f1641a) {
            eVar.preferences_ = k0Var.d();
        }
        return eVar.preferences_;
    }

    public static c n() {
        return (c) ((w) DEFAULT_INSTANCE.c(5));
    }

    public static e o(InputStream inputStream) {
        l kVar;
        e eVar = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = a0.f1573b;
            int length = bArr.length;
            kVar = new androidx.datastore.preferences.protobuf.j(bArr, 0, length, false);
            try {
                kVar.e(length);
            } catch (c0 e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            kVar = new androidx.datastore.preferences.protobuf.k(inputStream);
        }
        q a7 = q.a();
        y i5 = eVar.i();
        try {
            u0 u0Var = u0.f1715c;
            u0Var.getClass();
            x0 a10 = u0Var.a(i5.getClass());
            m mVar = (m) kVar.f1650b;
            if (mVar == null) {
                mVar = new m(kVar);
            }
            a10.i(i5, mVar, a7);
            a10.b(i5);
            if (y.f(i5, true)) {
                return (e) i5;
            }
            throw new c0(new d1().getMessage());
        } catch (c0 e9) {
            if (e9.f1585a) {
                throw new c0(e9.getMessage(), e9);
            }
            throw e9;
        } catch (d1 e10) {
            throw new c0(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof c0) {
                throw ((c0) e11.getCause());
            }
            throw new c0(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof c0) {
                throw ((c0) e12.getCause());
            }
            throw e12;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.y
    public final Object c(int i5) {
        t0 t0Var;
        switch (v.f.d(i5)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new w0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.f9313a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t0 t0Var2 = PARSER;
                if (t0Var2 != null) {
                    return t0Var2;
                }
                synchronized (e.class) {
                    try {
                        t0Var = PARSER;
                        if (t0Var == null) {
                            t0Var = new x();
                            PARSER = t0Var;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return t0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }
}
