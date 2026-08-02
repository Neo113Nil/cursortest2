package w1;

import android.util.Log;
import com.android.billingclient.api.f0;
import io.sentry.android.core.w0;
import io.sentry.b5;
import io.sentry.f5;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends FutureTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f24952a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, f0 f0Var) {
        super(f0Var);
        this.f24952a = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.f24952a;
        AtomicBoolean atomicBoolean = aVar.f24950d;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            aVar.a(obj);
        } catch (InterruptedException e7) {
            w0.a("AsyncTask", b5.WARNING, null, e7);
            w0.b(f5.WARN, null, e7);
            Log.w("AsyncTask", e7);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            aVar.a(null);
        } catch (ExecutionException e9) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e9.getCause());
        } catch (Throwable th2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th2);
        }
    }
}
