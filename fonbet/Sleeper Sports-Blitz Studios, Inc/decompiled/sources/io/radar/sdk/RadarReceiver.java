package io.radar.sdk;

import android.content.Context;
import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.radar.sdk.Radar;
import io.radar.sdk.model.RadarEvent;
import io.radar.sdk.model.RadarUser;
import kotlin.Metadata;

/* compiled from: RadarReceiver.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH&J-\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH&¨\u0006\u001b"}, d2 = {"Lio/radar/sdk/RadarReceiver;", "", "()V", "onClientLocationUpdated", "", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "stopped", "", "source", "Lio/radar/sdk/Radar$RadarLocationSource;", "onError", "status", "Lio/radar/sdk/Radar$RadarStatus;", "onEventsReceived", "events", "", "Lio/radar/sdk/model/RadarEvent;", "user", "Lio/radar/sdk/model/RadarUser;", "(Landroid/content/Context;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V", "onLocationUpdated", "onLog", "message", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class RadarReceiver {
    public abstract void onClientLocationUpdated(Context context, Location location, boolean stopped, Radar.RadarLocationSource source);

    public abstract void onError(Context context, Radar.RadarStatus status);

    public abstract void onEventsReceived(Context context, RadarEvent[] events, RadarUser user);

    public abstract void onLocationUpdated(Context context, Location location, RadarUser user);

    public abstract void onLog(Context context, String message);
}
