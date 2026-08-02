package defpackage;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ux3 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ux3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ft0 ft0Var = (ft0) obj2;
                ww3 ww3Var = (ww3) obj;
                et0 a = ft0Var.a();
                hx3 hx3Var = ft0Var.c;
                gt0 a2 = hx3Var.a();
                it0 it0Var = (it0) ((ht0) hx3Var).a;
                List list = it0Var.a;
                bx3 bx3Var = it0Var.b;
                rw3 rw3Var = it0Var.c;
                lt0 lt0Var = it0Var.e;
                List list2 = it0Var.f;
                if (list2 != null) {
                    a2.a = new it0(list, bx3Var, rw3Var, ww3Var, lt0Var, list2);
                    a.c = a2.a();
                    return a.a();
                }
                StringBuilder sb = new StringBuilder();
                if (list2 == null) {
                    sb.append(" binaries");
                }
                a70.r(bf3.m("Missing required properties:", sb));
                return null;
            case 1:
                return (AtomicBoolean) ((q73) obj2).invoke(obj);
            case 2:
                return (ln2) ((q73) obj2).invoke(obj);
            case 3:
                return (DateTimeFormatter) ((jp1) obj2).invoke(obj);
            default:
                return (Map) ((s80) obj2).invoke(obj);
        }
    }
}
