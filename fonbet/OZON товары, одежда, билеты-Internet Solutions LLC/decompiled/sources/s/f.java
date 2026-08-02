package s;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import b.InterfaceC5494b;

/* loaded from: classes8.dex */
public abstract class f implements ServiceConnection {
    private Context mApplicationContext;

    final class a extends C9556d {
    }

    public abstract void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull C9556d c9556d);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new a(InterfaceC5494b.a.H(iBinder), componentName));
    }

    void setApplicationContext(@NonNull Context context) {
        this.mApplicationContext = context;
    }
}
