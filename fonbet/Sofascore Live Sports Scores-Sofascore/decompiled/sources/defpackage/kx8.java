package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kx8 implements ndi {
    public final TaskCompletionSource a;

    public kx8(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // defpackage.ndi
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.ndi
    public final boolean b(uu0 uu0Var) {
        int i = uu0Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.trySetResult(uu0Var.a);
        return true;
    }
}
