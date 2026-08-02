package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t0f extends s0f {
    public final Object c;

    public t0f(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.s0f, defpackage.r0f
    public final boolean b(Object obj) {
        boolean b;
        obj.getClass();
        synchronized (this.c) {
            b = super.b(obj);
        }
        return b;
    }

    @Override // defpackage.s0f, defpackage.r0f
    public final Object c() {
        Object c;
        synchronized (this.c) {
            c = super.c();
        }
        return c;
    }
}
