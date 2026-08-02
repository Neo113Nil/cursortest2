package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class c55 implements xn3, bt8 {
    public final /* synthetic */ TaskCompletionSource a;

    @Override // defpackage.xn3
    public void accept(Object obj) {
        this.a.setResult(obj);
    }

    @Override // defpackage.bt8
    public Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        boolean z = th instanceof Exception;
        TaskCompletionSource taskCompletionSource = this.a;
        if (z) {
            taskCompletionSource.setException((Exception) th);
        } else {
            taskCompletionSource.setException(new RuntimeException(th));
        }
        return j0c.a;
    }
}
