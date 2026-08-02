package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qna extends gw8 {
    private static final qna DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile p9e PARSER;
    private s7a layout_ = lff.d;
    private int nextIndex_;

    static {
        qna qnaVar = new qna();
        DEFAULT_INSTANCE = qnaVar;
        gw8.i(qna.class, qnaVar);
    }

    public static qna m() {
        return DEFAULT_INSTANCE;
    }

    public static qna p(InputStream inputStream) {
        qo2 b03Var;
        qna qnaVar = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = u7a.b;
            int length = bArr.length;
            b03Var = new zz2(bArr, 0, length, false);
            try {
                b03Var.i(length);
            } catch (maa e) {
                ilg.k(e);
                return null;
            }
        } else {
            b03Var = new b03(inputStream);
        }
        nk6 a = nk6.a();
        gw8 h = qnaVar.h();
        try {
            hff hffVar = hff.c;
            hffVar.getClass();
            usg a2 = hffVar.a(h.getClass());
            zz0 zz0Var = (zz0) b03Var.b;
            if (zz0Var == null) {
                zz0Var = new zz0(b03Var);
            }
            a2.e(h, zz0Var, a);
            a2.b(h);
            if (gw8.e(h, true)) {
                return (qna) h;
            }
            throw new maa(new gak().getMessage());
        } catch (gak e2) {
            throw new maa(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof maa) {
                throw ((maa) e3.getCause());
            }
            throw e3;
        } catch (maa e4) {
            if (e4.a) {
                throw new maa(e4.getMessage(), e4);
            }
            throw e4;
        } catch (IOException e5) {
            if (e5.getCause() instanceof maa) {
                throw ((maa) e5.getCause());
            }
            throw new maa(e5.getMessage(), e5);
        }
    }

    @Override // defpackage.gw8
    public final Object b(int i) {
        p9e p9eVar;
        switch (wt3.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new jnf(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", sna.class, "nextIndex_"});
            case 3:
                return new qna();
            case 4:
                return new pna(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p9e p9eVar2 = PARSER;
                if (p9eVar2 != null) {
                    return p9eVar2;
                }
                synchronized (qna.class) {
                    try {
                        p9eVar = PARSER;
                        if (p9eVar == null) {
                            p9eVar = new ew8();
                            PARSER = p9eVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return p9eVar;
            default:
                a70.i();
                return null;
        }
    }

    public final void k(sna snaVar) {
        s7a s7aVar = this.layout_;
        if (!((lff) s7aVar).a) {
            lff lffVar = (lff) s7aVar;
            int i = lffVar.c;
            s7aVar = lffVar.e(i == 0 ? 10 : i * 2);
            this.layout_ = s7aVar;
        }
        ((lff) s7aVar).add(snaVar);
    }

    public final void l() {
        this.layout_ = lff.d;
    }

    public final s7a n() {
        return this.layout_;
    }

    public final int o() {
        return this.nextIndex_;
    }

    public final void q(int i) {
        this.nextIndex_ = i;
    }
}
