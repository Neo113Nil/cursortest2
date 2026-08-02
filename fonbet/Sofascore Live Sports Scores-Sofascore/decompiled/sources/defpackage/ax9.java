package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class ax9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ax9(Context context, int i, int i2) {
        this.a = i2;
        this.b = i;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                if (cw3.a.contains(bx9.class)) {
                    return;
                }
                try {
                    if (i2 == 0) {
                        throw null;
                    }
                    bx9 bx9Var = bx9.a;
                    String packageName = context.getPackageName();
                    packageName.getClass();
                    bx9Var.a(i2, packageName);
                    return;
                } catch (Throwable th) {
                    cw3.a(bx9.class, th);
                    return;
                }
            default:
                if (cw3.a.contains(bx9.class)) {
                    return;
                }
                try {
                    if (i2 == 0) {
                        throw null;
                    }
                    bx9 bx9Var2 = bx9.a;
                    String packageName2 = context.getPackageName();
                    packageName2.getClass();
                    bx9Var2.a(i2, packageName2);
                    return;
                } catch (Throwable th2) {
                    cw3.a(bx9.class, th2);
                    return;
                }
        }
    }
}
