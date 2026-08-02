package c6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import g6.v;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3651a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f3652b = new LinkedBlockingQueue();

    public final IBinder a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        v.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f3651a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f3651a = true;
        IBinder iBinder = (IBinder) this.f3652b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3652b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
