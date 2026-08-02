package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vmi implements tmi {
    public static final tr4 d = new tr4(5);
    public final Object a = new Object();
    public volatile tmi b;
    public Object c;

    public vmi(tmi tmiVar) {
        tmiVar.getClass();
        this.b = tmiVar;
    }

    @Override // defpackage.tmi
    public final Object get() {
        tmi tmiVar = this.b;
        tr4 tr4Var = d;
        if (tmiVar != tr4Var) {
            synchronized (this.a) {
                try {
                    if (this.b != tr4Var) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = tr4Var;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == d) {
            obj = mz1.n(new StringBuilder("<supplier that returned "), this.c, ">");
        }
        return mz1.n(sb, obj, ")");
    }
}
