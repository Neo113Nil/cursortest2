package defpackage;

import com.google.protobuf.Internal;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zb8 extends ob8 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ zb8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public static void f(ed8 ed8Var, Iterator it) {
        try {
            if (!it.hasNext()) {
                xm5.a(ed8Var);
            } else if (ed8Var instanceof ai3) {
                ed8Var.b(new pc8((ai3) ed8Var, it, 0));
            } else {
                ed8Var.b(new pc8(ed8Var, it, 1));
            }
        } catch (Throwable th) {
            td4.w0(th);
            xm5.b(th, ed8Var);
        }
    }

    @Override // defpackage.ob8
    public final void e(ed8 ed8Var) {
        int i = this.b;
        int i2 = 0;
        int i3 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                int C = wt3.C(3);
                vb8 wb8Var = C != 0 ? C != 1 ? C != 3 ? C != 4 ? new wb8(ed8Var, ob8.a) : new wb8(ed8Var) : new xb8(ed8Var, i2) : new xb8(ed8Var, i3) : new yb8(ed8Var);
                ed8Var.b(wb8Var);
                try {
                    ((yc8) obj).d(wb8Var);
                    break;
                } catch (Throwable th) {
                    td4.w0(th);
                    wb8Var.f(th);
                    return;
                }
            case 1:
                Object[] objArr = (Object[]) obj;
                if (!(ed8Var instanceof ai3)) {
                    ed8Var.b(new oc8(ed8Var, objArr, 1));
                    break;
                } else {
                    ed8Var.b(new oc8((ai3) ed8Var, objArr, 0));
                    break;
                }
            case 2:
                try {
                    f(ed8Var, ((Internal.ProtobufList) obj).iterator());
                    break;
                } catch (Throwable th2) {
                    td4.w0(th2);
                    xm5.b(th2, ed8Var);
                    return;
                }
            case 3:
                ((tz9) obj).N(new qc8(ed8Var));
                break;
            default:
                ((p0c) obj).b(new y0c(ed8Var));
                break;
        }
    }
}
