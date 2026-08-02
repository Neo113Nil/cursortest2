package L9;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzg;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f7099a;

    public a(Looper looper) {
        this.f7099a = new zzg(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f7099a.post(runnable);
    }
}
