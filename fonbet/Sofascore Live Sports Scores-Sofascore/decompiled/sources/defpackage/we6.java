package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class we6 implements zff {
    public final /* synthetic */ int a;
    public final ejg b;

    public /* synthetic */ we6(int i, ejg ejgVar) {
        this.a = i;
        this.b = ejgVar;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        ejg ejgVar = this.b;
        switch (i) {
            case 0:
                Executor executor = (Executor) ejgVar.c;
                i2a.v(executor);
                return executor;
            case 1:
                Executor executor2 = (Executor) ejgVar.b;
                i2a.v(executor2);
                return executor2;
            default:
                Executor executor3 = (Executor) ejgVar.d;
                i2a.v(executor3);
                return executor3;
        }
    }
}
