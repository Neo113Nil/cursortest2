package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k5f extends hw8 {
    private static final k5f DEFAULT_INSTANCE;
    private static volatile q9e PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private wtb preferences_ = wtb.b;

    static {
        k5f k5fVar = new k5f();
        DEFAULT_INSTANCE = k5fVar;
        hw8.j(k5f.class, k5fVar);
    }

    public static i5f n() {
        return (i5f) ((dw8) DEFAULT_INSTANCE.c(5));
    }

    public static k5f o(InputStream inputStream) {
        qo2 c03Var;
        k5f k5fVar = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = w7a.b;
            int length = bArr.length;
            c03Var = new a03(bArr, 0, length, false);
            try {
                c03Var.i(length);
            } catch (naa e) {
                ilg.k(e);
                return null;
            }
        } else {
            c03Var = new c03(inputStream);
        }
        ok6 a = ok6.a();
        hw8 i = k5fVar.i();
        try {
            kff kffVar = kff.c;
            kffVar.getClass();
            wsg a2 = kffVar.a(i.getClass());
            zz0 zz0Var = (zz0) c03Var.b;
            if (zz0Var == null) {
                zz0Var = new zz0(c03Var, (byte) 0);
            }
            a2.h(i, zz0Var, a);
            a2.b(i);
            if (hw8.f(i, true)) {
                return (k5f) i;
            }
            throw new naa(new hak().getMessage());
        } catch (hak e2) {
            throw new naa(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof naa) {
                throw ((naa) e3.getCause());
            }
            throw e3;
        } catch (naa e4) {
            if (e4.a) {
                throw new naa(e4.getMessage(), e4);
            }
            throw e4;
        } catch (IOException e5) {
            if (e5.getCause() instanceof naa) {
                throw ((naa) e5.getCause());
            }
            throw new naa(e5.getMessage(), e5);
        }
    }

    @Override // defpackage.hw8
    public final Object c(int i) {
        q9e q9eVar;
        switch (wt3.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new lnf(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", j5f.a});
            case 3:
                return new k5f();
            case 4:
                return new i5f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q9e q9eVar2 = PARSER;
                if (q9eVar2 != null) {
                    return q9eVar2;
                }
                synchronized (k5f.class) {
                    try {
                        q9eVar = PARSER;
                        if (q9eVar == null) {
                            q9eVar = new fw8();
                            PARSER = q9eVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return q9eVar;
            default:
                a70.i();
                return null;
        }
    }

    public final Map l() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public final wtb m() {
        wtb wtbVar = this.preferences_;
        if (wtbVar.a) {
            return wtbVar;
        }
        wtb i = wtbVar.i();
        this.preferences_ = i;
        return i;
    }
}
