package D9;

import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z10) {
        if (!Objects.equals(str, "com.google.android.gms.iid.MessengerCompat")) {
            return super.loadClass(str, z10);
        }
        Log.isLoggable("CloudMessengerCompat", 3);
        return zzd.class;
    }
}
