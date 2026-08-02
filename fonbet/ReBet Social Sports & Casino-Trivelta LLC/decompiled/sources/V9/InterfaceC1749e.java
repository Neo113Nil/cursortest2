package V9;

import android.app.PendingIntent;
import android.os.Looper;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;

/* renamed from: V9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1749e {
    Task getCurrentLocation(CurrentLocationRequest currentLocationRequest, CancellationToken cancellationToken);

    Task getLastLocation();

    Task removeLocationUpdates(AbstractC1755k abstractC1755k);

    Task removeLocationUpdates(PendingIntent pendingIntent);

    Task requestLocationUpdates(LocationRequest locationRequest, AbstractC1755k abstractC1755k, Looper looper);

    Task requestLocationUpdates(LocationRequest locationRequest, PendingIntent pendingIntent);
}
