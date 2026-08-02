package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(M2.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f18828a = (IconCompat) aVar.v(remoteActionCompat.f18828a, 1);
        remoteActionCompat.f18829b = aVar.l(remoteActionCompat.f18829b, 2);
        remoteActionCompat.f18830c = aVar.l(remoteActionCompat.f18830c, 3);
        remoteActionCompat.f18831d = (PendingIntent) aVar.r(remoteActionCompat.f18831d, 4);
        remoteActionCompat.f18832e = aVar.h(remoteActionCompat.f18832e, 5);
        remoteActionCompat.f18833f = aVar.h(remoteActionCompat.f18833f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, M2.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f18828a, 1);
        aVar.D(remoteActionCompat.f18829b, 2);
        aVar.D(remoteActionCompat.f18830c, 3);
        aVar.H(remoteActionCompat.f18831d, 4);
        aVar.z(remoteActionCompat.f18832e, 5);
        aVar.z(remoteActionCompat.f18833f, 6);
    }
}
