package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xna implements c6h {
    public static final xna a = new xna();
    public static final qna b;

    static {
        qna m = qna.m();
        m.getClass();
        b = m;
    }

    @Override // defpackage.c6h
    public final Object getDefaultValue() {
        return b;
    }

    @Override // defpackage.c6h
    public final Object readFrom(InputStream inputStream, rq3 rq3Var) {
        try {
            return qna.p(inputStream);
        } catch (maa e) {
            throw new uu3("Cannot read proto.", e);
        }
    }

    @Override // defpackage.c6h
    public final Object writeTo(Object obj, OutputStream outputStream, rq3 rq3Var) {
        qna qnaVar = (qna) obj;
        qnaVar.getClass();
        int a2 = qnaVar.a(null);
        Logger logger = g03.f;
        if (a2 > 4096) {
            a2 = 4096;
        }
        g03 g03Var = new g03(outputStream, a2);
        hff hffVar = hff.c;
        hffVar.getClass();
        usg a3 = hffVar.a(qnaVar.getClass());
        sz8 sz8Var = g03Var.a;
        if (sz8Var == null) {
            sz8Var = new sz8(g03Var);
        }
        a3.f(qnaVar, sz8Var);
        if (g03Var.d > 0) {
            g03Var.k();
        }
        return Unit.a;
    }
}
