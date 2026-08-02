package w;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import g.InterfaceC4312b;

/* loaded from: classes.dex */
public abstract class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public Context f67212a;

    public class a extends c {
        public a(InterfaceC4312b interfaceC4312b, ComponentName componentName, Context context) {
            super(interfaceC4312b, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, c cVar);

    public void b(Context context) {
        this.f67212a = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f67212a == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(InterfaceC4312b.a.c(iBinder), componentName, this.f67212a));
    }
}
