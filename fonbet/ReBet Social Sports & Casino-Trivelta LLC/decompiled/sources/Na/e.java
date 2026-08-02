package Na;

import Oa.i;
import Oa.j;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class e extends j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f7978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f7979c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f7979c = gVar;
        this.f7978b = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Oa.f, android.os.IInterface] */
    @Override // Oa.j
    public final void a() {
        i iVar;
        String str;
        String str2;
        String str3;
        try {
            ?? e10 = this.f7979c.f7984a.e();
            str2 = this.f7979c.f7985b;
            Bundle a10 = h.a();
            g gVar = this.f7979c;
            TaskCompletionSource taskCompletionSource = this.f7978b;
            str3 = gVar.f7985b;
            e10.p0(str2, a10, new com.google.android.play.core.review.c(gVar, taskCompletionSource, str3));
        } catch (RemoteException e11) {
            iVar = g.f7983c;
            str = this.f7979c.f7985b;
            iVar.c(e11, "error requesting in-app review for %s", str);
            this.f7978b.trySetException(new RuntimeException(e11));
        }
    }
}
