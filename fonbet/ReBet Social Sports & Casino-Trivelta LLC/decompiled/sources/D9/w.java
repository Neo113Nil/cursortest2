package D9;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final Messenger f2653a;

    /* renamed from: b, reason: collision with root package name */
    public final zzd f2654b;

    public w(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f2653a = new Messenger(iBinder);
            this.f2654b = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f2654b = new zzd(iBinder);
            this.f2653a = null;
        }
    }

    public final void a(Message message) {
        Messenger messenger = this.f2653a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzd zzdVar = this.f2654b;
        if (zzdVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        zzdVar.b(message);
    }
}
