package V9;

import android.app.PendingIntent;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* renamed from: V9.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1753i {
    Task addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent);

    Task removeGeofences(PendingIntent pendingIntent);

    Task removeGeofences(List list);
}
