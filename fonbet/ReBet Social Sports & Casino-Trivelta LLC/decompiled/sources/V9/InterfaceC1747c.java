package V9;

import android.app.PendingIntent;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.tasks.Task;

/* renamed from: V9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC1747c {
    Task removeActivityUpdates(PendingIntent pendingIntent);

    Task requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent);
}
