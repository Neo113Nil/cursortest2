package io.radar.sdk;

import android.app.Notification;
import io.radar.sdk.Radar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarInitializeOptions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u0019"}, d2 = {"Lio/radar/sdk/RadarInitializeOptions;", "", "radarReceiver", "Lio/radar/sdk/RadarReceiver;", "locationProvider", "Lio/radar/sdk/Radar$RadarLocationServicesProvider;", "fraud", "", "customForegroundNotification", "Landroid/app/Notification;", "inAppMessageReceiver", "Lio/radar/sdk/RadarInAppMessageReceiver;", "silentPush", "(Lio/radar/sdk/RadarReceiver;Lio/radar/sdk/Radar$RadarLocationServicesProvider;ZLandroid/app/Notification;Lio/radar/sdk/RadarInAppMessageReceiver;Z)V", "getCustomForegroundNotification", "()Landroid/app/Notification;", "getFraud", "()Z", "getInAppMessageReceiver", "()Lio/radar/sdk/RadarInAppMessageReceiver;", "getLocationProvider", "()Lio/radar/sdk/Radar$RadarLocationServicesProvider;", "getRadarReceiver", "()Lio/radar/sdk/RadarReceiver;", "getSilentPush", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarInitializeOptions {
    private final Notification customForegroundNotification;
    private final boolean fraud;
    private final RadarInAppMessageReceiver inAppMessageReceiver;
    private final Radar.RadarLocationServicesProvider locationProvider;
    private final RadarReceiver radarReceiver;
    private final boolean silentPush;

    public RadarInitializeOptions() {
        this(null, null, false, null, null, false, 63, null);
    }

    public RadarInitializeOptions(RadarReceiver radarReceiver, Radar.RadarLocationServicesProvider locationProvider, boolean z, Notification notification, RadarInAppMessageReceiver radarInAppMessageReceiver, boolean z2) {
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        this.radarReceiver = radarReceiver;
        this.locationProvider = locationProvider;
        this.fraud = z;
        this.customForegroundNotification = notification;
        this.inAppMessageReceiver = radarInAppMessageReceiver;
        this.silentPush = z2;
    }

    public final RadarReceiver getRadarReceiver() {
        return this.radarReceiver;
    }

    public /* synthetic */ RadarInitializeOptions(RadarReceiver radarReceiver, Radar.RadarLocationServicesProvider radarLocationServicesProvider, boolean z, Notification notification, RadarInAppMessageReceiver radarInAppMessageReceiver, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : radarReceiver, (i & 2) != 0 ? Radar.RadarLocationServicesProvider.GOOGLE : radarLocationServicesProvider, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : notification, (i & 16) != 0 ? null : radarInAppMessageReceiver, (i & 32) != 0 ? false : z2);
    }

    public final Radar.RadarLocationServicesProvider getLocationProvider() {
        return this.locationProvider;
    }

    public final boolean getFraud() {
        return this.fraud;
    }

    public final Notification getCustomForegroundNotification() {
        return this.customForegroundNotification;
    }

    public final RadarInAppMessageReceiver getInAppMessageReceiver() {
        return this.inAppMessageReceiver;
    }

    public final boolean getSilentPush() {
        return this.silentPush;
    }
}
