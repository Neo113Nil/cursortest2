package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class iy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jy0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iy0(jy0 jy0Var, Object obj, int i) {
        this.a = i;
        this.b = jy0Var;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        jy0 jy0Var = this.b;
        switch (i) {
            case 0:
                if (jy0Var.a == 0) {
                    jy0Var.h(obj);
                    break;
                }
                break;
            default:
                int i2 = jy0Var.a - 1;
                jy0Var.a = i2;
                if (i2 == 0) {
                    jy0Var.h(obj);
                    break;
                }
                break;
        }
    }
}
