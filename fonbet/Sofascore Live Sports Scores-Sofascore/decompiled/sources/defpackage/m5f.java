package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m5f extends hw8 {
    private static final m5f DEFAULT_INSTANCE;
    private static volatile q9e PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private t7a strings_ = mff.d;

    static {
        m5f m5fVar = new m5f();
        DEFAULT_INSTANCE = m5fVar;
        hw8.j(m5f.class, m5fVar);
    }

    public static m5f m() {
        return DEFAULT_INSTANCE;
    }

    public static l5f o() {
        return (l5f) ((dw8) DEFAULT_INSTANCE.c(5));
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
                return new lnf(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new m5f();
            case 4:
                return new l5f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                q9e q9eVar2 = PARSER;
                if (q9eVar2 != null) {
                    return q9eVar2;
                }
                synchronized (m5f.class) {
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

    public final void l(Iterable iterable) {
        t7a t7aVar = this.strings_;
        boolean z = ((mff) t7aVar).a;
        t7a t7aVar2 = t7aVar;
        if (!z) {
            mff mffVar = (mff) t7aVar;
            int i = mffVar.c;
            mff e = mffVar.e(i == 0 ? 10 : i * 2);
            this.strings_ = e;
            t7aVar2 = e;
        }
        Charset charset = w7a.a;
        if (iterable instanceof xsa) {
            ((xsa) iterable).getUnderlyingElements();
            pvd.j();
            return;
        }
        if (iterable instanceof f7f) {
            ((mff) t7aVar2).addAll((Collection) iterable);
            return;
        }
        if ((t7aVar2 instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) t7aVar2).ensureCapacity(((Collection) iterable).size() + ((mff) t7aVar2).c);
        }
        mff mffVar2 = (mff) t7aVar2;
        int i2 = mffVar2.c;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (mffVar2.c - i2) + " is null.";
                for (int i3 = mffVar2.c - 1; i3 >= i2; i3--) {
                    mffVar2.remove(i3);
                }
                yhk.s(str);
                return;
            }
            mffVar2.add(obj);
        }
    }

    public final t7a n() {
        return this.strings_;
    }
}
