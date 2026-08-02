package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ax8 implements ndi {
    public final tik a;
    public final TaskCompletionSource b;

    public ax8(tik tikVar, TaskCompletionSource taskCompletionSource) {
        this.a = tikVar;
        this.b = taskCompletionSource;
    }

    @Override // defpackage.ndi
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // defpackage.ndi
    public final boolean b(uu0 uu0Var) {
        if (uu0Var.b == 4 && !this.a.a(uu0Var)) {
            String str = uu0Var.c;
            if (str != null) {
                this.b.setResult(new mu0(str, uu0Var.e, uu0Var.f));
                return true;
            }
            yhk.s("Null token");
        }
        return false;
    }
}
