package androidx.media3.session;

import android.os.RemoteException;

/* loaded from: classes5.dex */
class SessionUtil {
    private SessionUtil() {
    }

    public static void disconnectIMediaController(IMediaController iMediaController) {
        if (iMediaController != null) {
            try {
                iMediaController.onDisconnected(0);
            } catch (RemoteException unused) {
            }
        }
    }
}
