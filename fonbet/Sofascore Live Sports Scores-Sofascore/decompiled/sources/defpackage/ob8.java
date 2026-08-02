package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class ob8 implements xgf {
    public static final int a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @Override // defpackage.xgf
    public final void a(ed8 ed8Var) {
        if (ed8Var != null) {
            d(ed8Var);
        } else {
            rha.x(ed8Var, "s is null");
            d(new nhi(ed8Var));
        }
    }

    public final ob8 b(bt8 bt8Var) {
        rha.E(Integer.MAX_VALUE, "maxConcurrency");
        return new ub8(this, bt8Var, 3);
    }

    public final cd8 c() {
        int i = a;
        rha.E(i, "bufferSize");
        AtomicReference atomicReference = new AtomicReference();
        return new cd8(new zc8(atomicReference, i), this, atomicReference, i);
    }

    public final void d(ed8 ed8Var) {
        rha.x(ed8Var, "s is null");
        try {
            e(ed8Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            td4.w0(th);
            hda.L(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void e(ed8 ed8Var);
}
