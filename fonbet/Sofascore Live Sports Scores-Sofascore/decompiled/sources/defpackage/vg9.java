package defpackage;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class vg9 implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zg9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ vg9(zg9 zg9Var, int i, List list) {
        this.b = zg9Var;
        this.c = i;
        this.d = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                zg9 zg9Var = this.b;
                int i = this.c;
                zg9Var.k.getClass();
                try {
                    zg9Var.x.k(i, tp5.CANCEL);
                    synchronized (zg9Var) {
                        zg9Var.z.remove(Integer.valueOf(i));
                        Unit unit = Unit.a;
                    }
                } catch (IOException unused) {
                }
                return Unit.a;
            default:
                zg9 zg9Var2 = this.b;
                int i2 = this.c;
                zg9Var2.k.getClass();
                try {
                    zg9Var2.x.k(i2, tp5.CANCEL);
                    synchronized (zg9Var2) {
                        zg9Var2.z.remove(Integer.valueOf(i2));
                        Unit unit2 = Unit.a;
                    }
                } catch (IOException unused2) {
                }
                return Unit.a;
        }
    }

    public /* synthetic */ vg9(zg9 zg9Var, int i, List list, boolean z) {
        this.b = zg9Var;
        this.c = i;
        this.d = list;
    }
}
