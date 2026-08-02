package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xi9 implements otc {
    public static final ivd b = ivd.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final cqa a;

    public xi9(cqa cqaVar) {
        this.a = cqaVar;
    }

    @Override // defpackage.otc
    public final ntc a(Object obj, int i, int i2, uvd uvdVar) {
        qz8 qz8Var = (qz8) obj;
        ltc ltcVar = (ltc) this.a.a;
        mtc a = mtc.a(qz8Var);
        Object c = ltcVar.c(a);
        ArrayDeque arrayDeque = mtc.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(a);
        }
        qz8 qz8Var2 = (qz8) c;
        if (qz8Var2 == null) {
            ltcVar.f(mtc.a(qz8Var), qz8Var);
        } else {
            qz8Var = qz8Var2;
        }
        return new ntc(qz8Var, new ll9(qz8Var, ((Integer) uvdVar.c(b)).intValue()));
    }

    @Override // defpackage.otc
    public final boolean b(Object obj) {
        return true;
    }
}
