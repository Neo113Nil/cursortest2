package f1;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.v0;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends y {
    private static final g DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private z strings_ = v0.f1720d;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        y.j(g.class, gVar);
    }

    public static void l(g gVar, Set set) {
        z zVar = gVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) zVar).f1577a) {
            v0 v0Var = (v0) zVar;
            int i5 = v0Var.f1722c;
            gVar.strings_ = v0Var.c(i5 == 0 ? 10 : i5 * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = a0.f1572a;
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((v0) randomAccess).f1722c);
        }
        v0 v0Var2 = (v0) randomAccess;
        int i10 = v0Var2.f1722c;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (v0Var2.f1722c - i10) + " is null.";
                for (int i11 = v0Var2.f1722c - 1; i11 >= i10; i11--) {
                    v0Var2.remove(i11);
                }
                throw new NullPointerException(str);
            }
            v0Var2.add(obj);
        }
    }

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        return (f) ((w) DEFAULT_INSTANCE.c(5));
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
                return new w0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                t0 t0Var2 = PARSER;
                if (t0Var2 != null) {
                    return t0Var2;
                }
                synchronized (g.class) {
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

    public final z n() {
        return this.strings_;
    }
}
