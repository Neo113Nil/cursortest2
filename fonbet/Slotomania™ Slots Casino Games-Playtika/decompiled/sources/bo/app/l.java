package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import com.braze.Constants;
import com.braze.location.IBrazeGeofenceApi;
import com.braze.models.BrazeGeofence;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lbo/app/l;", "", "Landroid/content/Context;", "context", "Landroid/app/PendingIntent;", "b", "applicationContext", SDKConstants.PARAM_INTENT, "", Constants.BRAZE_PUSH_CONTENT_KEY, "", "Lcom/braze/models/BrazeGeofence;", "geofenceList", "geofenceRequestIntent", "", "()Z", "isAvailable", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class l {
    private IBrazeGeofenceApi a;

    public l() {
        IBrazeGeofenceApi iBrazeGeofenceApi;
        Object newInstance;
        try {
            newInstance = Class.forName("com.braze.location.BrazeInternalGeofenceApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            iBrazeGeofenceApi = null;
        }
        if (newInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.braze.location.IBrazeGeofenceApi");
        }
        iBrazeGeofenceApi = (IBrazeGeofenceApi) newInstance;
        this.a = iBrazeGeofenceApi;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final PendingIntent b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.a;
        if (iBrazeGeofenceApi == null) {
            return null;
        }
        return iBrazeGeofenceApi.getGeofenceTransitionPendingIntent(context);
    }

    public final void a(Context applicationContext, PendingIntent intent) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(intent, "intent");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.a;
        if (iBrazeGeofenceApi == null) {
            return;
        }
        iBrazeGeofenceApi.teardownGeofences(applicationContext, intent);
    }

    public final void a(Context context, List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.a;
        if (iBrazeGeofenceApi == null) {
            return;
        }
        iBrazeGeofenceApi.registerGeofences(context, geofenceList, geofenceRequestIntent);
    }

    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IBrazeGeofenceApi iBrazeGeofenceApi = this.a;
        if (iBrazeGeofenceApi == null) {
            return;
        }
        iBrazeGeofenceApi.deleteRegisteredGeofenceCache(context);
    }
}
