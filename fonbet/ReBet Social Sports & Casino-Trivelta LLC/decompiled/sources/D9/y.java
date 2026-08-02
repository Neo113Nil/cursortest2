package D9;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f2655a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f2656b = new TaskCompletionSource();

    /* renamed from: c, reason: collision with root package name */
    public final int f2657c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f2658d;

    public y(int i10, int i11, Bundle bundle) {
        this.f2655a = i10;
        this.f2657c = i11;
        this.f2658d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(z zVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            zVar.toString();
        }
        this.f2656b.setException(zVar);
    }

    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            String.valueOf(obj);
        }
        this.f2656b.setResult(obj);
    }

    public final String toString() {
        return "Request { what=" + this.f2657c + " id=" + this.f2655a + " oneWay=" + b() + "}";
    }
}
