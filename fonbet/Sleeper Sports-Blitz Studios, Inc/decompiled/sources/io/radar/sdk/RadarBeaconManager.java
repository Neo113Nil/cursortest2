package io.radar.sdk;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.react.modules.appstate.AppStateModule;
import io.radar.sdk.Radar;
import io.radar.sdk.model.RadarBeacon;
import io.sentry.SentryEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadarBeaconManager.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 E2\u00020\u0001:\u0001EB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0015H\u0002J\u001f\u0010)\u001a\u00020'2\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fH\u0002¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J'\u0010/\u001a\u00020'2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f2\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0004\b2\u00103J)\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020.2\b\u00106\u001a\u0004\u0018\u0001072\b\b\u0002\u00108\u001a\u00020%H\u0000¢\u0006\u0002\b9J\u0010\u0010:\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J=\u0010;\u001a\u00020'2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010<\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010=J+\u0010>\u001a\u00020'2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010<\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010?J+\u0010@\u001a\u00020'2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0002\u0010AJ\u0019\u0010B\u001a\u00020'2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f¢\u0006\u0002\u0010*J\u0006\u0010C\u001a\u00020'J\b\u0010D\u001a\u00020'H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012R2\u0010\u0013\u001a&\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015 \u0016*\u0012\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\u00170\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lio/radar/sdk/RadarBeaconManager;", "", "context", "Landroid/content/Context;", SentryEvent.JsonKeys.LOGGER, "Lio/radar/sdk/RadarLogger;", "permissionsHelper", "Lio/radar/sdk/RadarPermissionsHelper;", "(Landroid/content/Context;Lio/radar/sdk/RadarLogger;Lio/radar/sdk/RadarPermissionsHelper;)V", "adapter", "Landroid/bluetooth/BluetoothAdapter;", "beaconUIDs", "", "", "[Ljava/lang/String;", "beaconUUIDs", RadarTrackingOptions.KEY_BEACONS, "Lio/radar/sdk/model/RadarBeacon;", "[Lio/radar/sdk/model/RadarBeacon;", "callbacks", "", "Lio/radar/sdk/Radar$RadarBeaconCallback;", "kotlin.jvm.PlatformType", "", "handler", "Landroid/os/Handler;", "monitoredBeaconIdentifiers", "", "nearbyBeacons", "", "getPermissionsHelper$sdk_release", "()Lio/radar/sdk/RadarPermissionsHelper;", "setPermissionsHelper$sdk_release", "(Lio/radar/sdk/RadarPermissionsHelper;)V", "scanCallback", "Landroid/bluetooth/le/ScanCallback;", "started", "", "addCallback", "", "callback", "callCallbacks", "([Lio/radar/sdk/model/RadarBeacon;)V", "getScanSettings", "Landroid/bluetooth/le/ScanSettings;", "scanMode", "", "handleBeacons", "source", "Lio/radar/sdk/Radar$RadarLocationSource;", "handleBeacons$sdk_release", "([Lio/radar/sdk/model/RadarBeacon;Lio/radar/sdk/Radar$RadarLocationSource;)V", "handleScanResult", "callbackType", "result", "Landroid/bluetooth/le/ScanResult;", "ranging", "handleScanResult$sdk_release", "isBluetoothSupported", "rangeBeaconUUIDs", AppStateModule.APP_STATE_BACKGROUND, "([Ljava/lang/String;[Ljava/lang/String;ZLio/radar/sdk/Radar$RadarBeaconCallback;)V", "rangeBeacons", "([Lio/radar/sdk/model/RadarBeacon;ZLio/radar/sdk/Radar$RadarBeaconCallback;)V", "startMonitoringBeaconUUIDs", "([Ljava/lang/String;[Ljava/lang/String;)V", "startMonitoringBeacons", "stopMonitoringBeacons", "stopRanging", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarBeaconManager {
    private static final String TIMEOUT_TOKEN = "timeout";
    private BluetoothAdapter adapter;
    private String[] beaconUIDs;
    private String[] beaconUUIDs;
    private RadarBeacon[] beacons;
    private final List<Radar.RadarBeaconCallback> callbacks;
    private final Context context;
    private final Handler handler;
    private final RadarLogger logger;
    private Set<String> monitoredBeaconIdentifiers;
    private Set<RadarBeacon> nearbyBeacons;
    private RadarPermissionsHelper permissionsHelper;
    private ScanCallback scanCallback;
    private boolean started;

    public RadarBeaconManager(Context context, RadarLogger logger, RadarPermissionsHelper permissionsHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(permissionsHelper, "permissionsHelper");
        this.context = context;
        this.logger = logger;
        this.permissionsHelper = permissionsHelper;
        this.callbacks = Collections.synchronizedList(new ArrayList());
        this.monitoredBeaconIdentifiers = SetsKt.emptySet();
        this.nearbyBeacons = new LinkedHashSet();
        this.beacons = new RadarBeacon[0];
        this.beaconUUIDs = new String[0];
        this.beaconUIDs = new String[0];
        this.handler = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ RadarBeaconManager(Context context, RadarLogger radarLogger, RadarPermissionsHelper radarPermissionsHelper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, radarLogger, (i & 4) != 0 ? new RadarPermissionsHelper() : radarPermissionsHelper);
    }

    /* renamed from: getPermissionsHelper$sdk_release, reason: from getter */
    public final RadarPermissionsHelper getPermissionsHelper() {
        return this.permissionsHelper;
    }

    public final void setPermissionsHelper$sdk_release(RadarPermissionsHelper radarPermissionsHelper) {
        Intrinsics.checkNotNullParameter(radarPermissionsHelper, "<set-?>");
        this.permissionsHelper = radarPermissionsHelper;
    }

    private final void addCallback(Radar.RadarBeaconCallback callback) {
        if (callback == null) {
            return;
        }
        List<Radar.RadarBeaconCallback> callbacks = this.callbacks;
        Intrinsics.checkNotNullExpressionValue(callbacks, "callbacks");
        synchronized (callbacks) {
            this.callbacks.add(callback);
        }
    }

    static /* synthetic */ void callCallbacks$default(RadarBeaconManager radarBeaconManager, RadarBeacon[] radarBeaconArr, int i, Object obj) {
        if ((i & 1) != 0) {
            radarBeaconArr = null;
        }
        radarBeaconManager.callCallbacks(radarBeaconArr);
    }

    private final void callCallbacks(RadarBeacon[] nearbyBeacons) {
        List<Radar.RadarBeaconCallback> callbacks = this.callbacks;
        Intrinsics.checkNotNullExpressionValue(callbacks, "callbacks");
        synchronized (callbacks) {
            if (this.callbacks.isEmpty()) {
                return;
            }
            RadarLogger.d$default(this.logger, "Calling callbacks | callbacks.size = " + this.callbacks.size(), null, null, 6, null);
            Iterator<Radar.RadarBeaconCallback> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onComplete(Radar.RadarStatus.SUCCESS, nearbyBeacons);
            }
            this.callbacks.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void startMonitoringBeacons(RadarBeacon[] beacons) {
        ScanFilter scanFilter;
        Intrinsics.checkNotNullParameter(beacons, "beacons");
        if (RadarSettings.INSTANCE.getSdkConfiguration(this.context).getUseRadarModifiedBeacon()) {
            return;
        }
        if (!this.permissionsHelper.bluetoothPermissionsGranted$sdk_release(this.context)) {
            RadarLogger.d$default(this.logger, "Bluetooth permissions not granted", null, null, 6, null);
            return;
        }
        if (!isBluetoothSupported(this.context)) {
            RadarLogger.d$default(this.logger, "Bluetooth not supported", null, null, 6, null);
            return;
        }
        if (this.adapter == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter(...)");
            this.adapter = defaultAdapter;
        }
        BluetoothAdapter bluetoothAdapter = this.adapter;
        BluetoothAdapter bluetoothAdapter2 = null;
        if (bluetoothAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            bluetoothAdapter = null;
        }
        if (!bluetoothAdapter.isEnabled()) {
            RadarLogger.d$default(this.logger, "Bluetooth not enabled", null, null, 6, null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (RadarBeacon radarBeacon : beacons) {
            String str = radarBeacon.get_id();
            if (str != null) {
                arrayList.add(str);
            }
        }
        Set<String> set = CollectionsKt.toSet(arrayList);
        if (Intrinsics.areEqual(this.monitoredBeaconIdentifiers, set)) {
            RadarLogger.d$default(this.logger, "Already monitoring beacons", null, null, 6, null);
            return;
        }
        stopMonitoringBeacons();
        if (beacons.length == 0) {
            RadarLogger.d$default(this.logger, "No beacons to monitor", null, null, 6, null);
            return;
        }
        this.monitoredBeaconIdentifiers = set;
        ArrayList arrayList2 = new ArrayList();
        for (RadarBeacon radarBeacon2 : beacons) {
            try {
                RadarLogger.d$default(this.logger, "Building scan filter for monitoring | _id = " + radarBeacon2.get_id(), null, null, 6, null);
                scanFilter = RadarBeaconUtils.INSTANCE.getScanFilterForBeacon(radarBeacon2);
            } catch (Exception e) {
                this.logger.d("Error building scan filter for monitoring | _id = " + radarBeacon2.get_id(), Radar.RadarLogType.SDK_EXCEPTION, e);
                scanFilter = null;
            }
            if (scanFilter != null) {
                RadarLogger.d$default(this.logger, "Starting monitoring beacon | _id = " + radarBeacon2.get_id() + "; uuid = " + radarBeacon2.getUuid() + "; major = " + radarBeacon2.getMajor() + "; minor = " + radarBeacon2.getMinor(), null, null, 6, null);
                arrayList2.add(scanFilter);
            }
        }
        if (arrayList2.size() == 0) {
            RadarLogger.d$default(this.logger, "No scan filters for monitoring", null, null, 6, null);
            return;
        }
        try {
            ScanSettings scanSettings = getScanSettings(0);
            RadarLogger.d$default(this.logger, "Starting monitoring beacons", null, null, 6, null);
            BluetoothAdapter bluetoothAdapter3 = this.adapter;
            if (bluetoothAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                bluetoothAdapter2 = bluetoothAdapter3;
            }
            bluetoothAdapter2.getBluetoothLeScanner().startScan((List<ScanFilter>) arrayList2, scanSettings, RadarLocationReceiver.INSTANCE.getBeaconPendingIntent$sdk_release(this.context));
        } catch (Exception e2) {
            this.logger.e("Error starting monitoring beacons", Radar.RadarLogType.SDK_EXCEPTION, e2);
        }
    }

    public final void startMonitoringBeaconUUIDs(String[] beaconUUIDs, String[] beaconUIDs) {
        ScanFilter scanFilter;
        ScanFilter scanFilter2;
        if (RadarSettings.INSTANCE.getSdkConfiguration(this.context).getUseRadarModifiedBeacon()) {
            return;
        }
        if (!this.permissionsHelper.bluetoothPermissionsGranted$sdk_release(this.context)) {
            RadarLogger.d$default(this.logger, "Bluetooth permissions not granted", null, null, 6, null);
            return;
        }
        if (!isBluetoothSupported(this.context)) {
            RadarLogger.d$default(this.logger, "Bluetooth not supported", null, null, 6, null);
            return;
        }
        if (this.adapter == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter(...)");
            this.adapter = defaultAdapter;
        }
        BluetoothAdapter bluetoothAdapter = this.adapter;
        BluetoothAdapter bluetoothAdapter2 = null;
        if (bluetoothAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            bluetoothAdapter = null;
        }
        if (!bluetoothAdapter.isEnabled()) {
            RadarLogger.d$default(this.logger, "Bluetooth not enabled", null, null, 6, null);
            return;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (beaconUUIDs != null) {
            CollectionsKt.addAll(linkedHashSet, beaconUUIDs);
        }
        if (beaconUIDs != null) {
            CollectionsKt.addAll(linkedHashSet, beaconUIDs);
        }
        if (Intrinsics.areEqual(this.monitoredBeaconIdentifiers, linkedHashSet)) {
            RadarLogger.d$default(this.logger, "Already monitoring beacons", null, null, 6, null);
            return;
        }
        stopMonitoringBeacons();
        if ((beaconUUIDs == null || beaconUUIDs.length == 0) && (beaconUIDs == null || beaconUIDs.length == 0)) {
            RadarLogger.d$default(this.logger, "No beacon UUIDs or UIDs to monitor", null, null, 6, null);
            return;
        }
        this.monitoredBeaconIdentifiers = linkedHashSet;
        ArrayList arrayList = new ArrayList();
        if (beaconUUIDs != null) {
            Iterator it = ArrayIteratorKt.iterator(beaconUUIDs);
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    RadarLogger.d$default(this.logger, "Building scan filter for monitoring | beaconUUID = " + str, null, null, 6, null);
                    scanFilter2 = RadarBeaconUtils.INSTANCE.getScanFilterForBeacon(str);
                } catch (Exception e) {
                    this.logger.d("Error building scan filter for monitoring | beaconUUID = " + str, Radar.RadarLogType.SDK_EXCEPTION, e);
                    scanFilter2 = null;
                }
                if (scanFilter2 != null) {
                    RadarLogger.d$default(this.logger, "Starting monitoring beacon UUID | beaconUUID = " + str, null, null, 6, null);
                    arrayList.add(scanFilter2);
                }
            }
        }
        if (beaconUIDs != null) {
            Iterator it2 = ArrayIteratorKt.iterator(beaconUIDs);
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                try {
                    RadarLogger.d$default(this.logger, "Building scan filter for monitoring | beaconUID = " + str2, null, null, 6, null);
                    scanFilter = RadarBeaconUtils.INSTANCE.getScanFilterForBeaconUID(str2);
                } catch (Exception e2) {
                    this.logger.d("Error building scan filter for monitoring | beaconUID = " + str2, Radar.RadarLogType.SDK_EXCEPTION, e2);
                    scanFilter = null;
                }
                if (scanFilter != null) {
                    RadarLogger.d$default(this.logger, "Starting monitoring beacon UID | beaconUID = " + str2, null, null, 6, null);
                    arrayList.add(scanFilter);
                }
            }
        }
        if (arrayList.size() == 0) {
            RadarLogger.d$default(this.logger, "No scan filters for monitoring", null, null, 6, null);
            return;
        }
        try {
            ScanSettings scanSettings = getScanSettings(0);
            RadarLogger.d$default(this.logger, "Starting monitoring beacon UUIDs", null, null, 6, null);
            BluetoothAdapter bluetoothAdapter3 = this.adapter;
            if (bluetoothAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                bluetoothAdapter2 = bluetoothAdapter3;
            }
            bluetoothAdapter2.getBluetoothLeScanner().startScan((List<ScanFilter>) arrayList, scanSettings, RadarLocationReceiver.INSTANCE.getBeaconPendingIntent$sdk_release(this.context));
        } catch (Exception e3) {
            this.logger.e("Error starting monitoring beacon UUIDs", Radar.RadarLogType.SDK_EXCEPTION, e3);
        }
    }

    public final void stopMonitoringBeacons() {
        if (!RadarSettings.INSTANCE.getSdkConfiguration(this.context).getUseRadarModifiedBeacon() && this.permissionsHelper.bluetoothPermissionsGranted$sdk_release(this.context) && isBluetoothSupported(this.context)) {
            if (this.adapter == null) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter(...)");
                this.adapter = defaultAdapter;
            }
            BluetoothAdapter bluetoothAdapter = this.adapter;
            BluetoothAdapter bluetoothAdapter2 = null;
            if (bluetoothAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                bluetoothAdapter = null;
            }
            if (!bluetoothAdapter.isEnabled()) {
                RadarLogger.d$default(this.logger, "Bluetooth not enabled", null, null, 6, null);
                return;
            }
            RadarLogger.d$default(this.logger, "Stopping monitoring beacons", null, null, 6, null);
            try {
                BluetoothAdapter bluetoothAdapter3 = this.adapter;
                if (bluetoothAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    bluetoothAdapter2 = bluetoothAdapter3;
                }
                bluetoothAdapter2.getBluetoothLeScanner().stopScan(RadarLocationReceiver.INSTANCE.getBeaconPendingIntent$sdk_release(this.context));
            } catch (Exception e) {
                this.logger.d("Error stopping monitoring beacons", Radar.RadarLogType.SDK_EXCEPTION, e);
            }
            this.monitoredBeaconIdentifiers = SetsKt.emptySet();
        }
    }

    public final void rangeBeacons(RadarBeacon[] beacons, boolean background, Radar.RadarBeaconCallback callback) {
        ScanFilter scanFilter;
        Intrinsics.checkNotNullParameter(beacons, "beacons");
        BluetoothAdapter bluetoothAdapter = null;
        if (!this.permissionsHelper.bluetoothPermissionsGranted$sdk_release(this.context)) {
            RadarLogger.d$default(this.logger, "Bluetooth permissions not granted", null, null, 6, null);
            Radar.sendError$sdk_release$default(Radar.INSTANCE, Radar.RadarStatus.ERROR_PERMISSIONS, null, 2, null);
            if (callback != null) {
                Radar.RadarBeaconCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PERMISSIONS, null, 2, null);
                return;
            }
            return;
        }
        if (!isBluetoothSupported(this.context)) {
            RadarLogger.d$default(this.logger, "Bluetooth not supported", null, null, 6, null);
            Radar.sendError$sdk_release$default(Radar.INSTANCE, Radar.RadarStatus.ERROR_BLUETOOTH, null, 2, null);
            if (callback != null) {
                Radar.RadarBeaconCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_BLUETOOTH, null, 2, null);
                return;
            }
            return;
        }
        if (this.adapter == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter(...)");
            this.adapter = defaultAdapter;
        }
        BluetoothAdapter bluetoothAdapter2 = this.adapter;
        if (bluetoothAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            bluetoothAdapter2 = null;
        }
        if (!bluetoothAdapter2.isEnabled()) {
            RadarLogger.d$default(this.logger, "Bluetooth not enabled", null, null, 6, null);
            Radar.sendError$sdk_release$default(Radar.INSTANCE, Radar.RadarStatus.ERROR_BLUETOOTH, null, 2, null);
            if (callback != null) {
                Radar.RadarBeaconCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_BLUETOOTH, null, 2, null);
                return;
            }
            return;
        }
        if (beacons.length == 0) {
            RadarLogger.d$default(this.logger, "No beacons to range", null, null, 6, null);
            if (callback != null) {
                callback.onComplete(Radar.RadarStatus.SUCCESS, new RadarBeacon[0]);
                return;
            }
            return;
        }
        addCallback(callback);
        if (this.started) {
            RadarLogger.d$default(this.logger, "Already ranging beacons", null, null, 6, null);
            return;
        }
        this.beacons = beacons;
        this.started = true;
        ArrayList arrayList = new ArrayList();
        for (RadarBeacon radarBeacon : beacons) {
            try {
                RadarLogger.d$default(this.logger, "Building scan filter for ranging | _id = " + radarBeacon.get_id(), null, null, 6, null);
                scanFilter = RadarBeaconUtils.INSTANCE.getScanFilterForBeacon(radarBeacon);
            } catch (Exception e) {
                this.logger.d("Error building scan filter for ranging | _id = " + radarBeacon.get_id(), Radar.RadarLogType.SDK_EXCEPTION, e);
                scanFilter = null;
            }
            if (scanFilter != null) {
                RadarLogger.d$default(this.logger, "Starting ranging beacon | type = " + radarBeacon.getType() + "; _id = " + radarBeacon.get_id() + "; uuid = " + radarBeacon.getUuid() + "; major = " + radarBeacon.getMajor() + "; minor = " + radarBeacon.getMinor(), null, null, 6, null);
                arrayList.add(scanFilter);
            }
        }
        if (arrayList.size() == 0) {
            RadarLogger.d$default(this.logger, "No scan filters for ranging", null, null, 6, null);
            callCallbacks$default(this, null, 1, null);
            return;
        }
        ScanSettings scanSettings = getScanSettings(background ? 0 : 2);
        this.scanCallback = new ScanCallback() { // from class: io.radar.sdk.RadarBeaconManager$rangeBeacons$1
            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int callbackType, ScanResult result) {
                super.onScanResult(callbackType, result);
                RadarBeaconManager.handleScanResult$sdk_release$default(RadarBeaconManager.this, callbackType, result, false, 4, null);
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(List<ScanResult> results) {
                super.onBatchScanResults(results);
                if (results != null) {
                    RadarBeaconManager radarBeaconManager = RadarBeaconManager.this;
                    Iterator<T> it = results.iterator();
                    while (it.hasNext()) {
                        RadarBeaconManager.handleScanResult$sdk_release$default(radarBeaconManager, 2, (ScanResult) it.next(), false, 4, null);
                    }
                }
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int errorCode) {
                RadarLogger radarLogger;
                super.onScanFailed(errorCode);
                radarLogger = this.logger;
                RadarLogger.d$default(radarLogger, "Scan failed", null, null, 6, null);
                RadarBeaconManager.this.stopRanging();
            }
        };
        try {
            BluetoothAdapter bluetoothAdapter3 = this.adapter;
            if (bluetoothAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                bluetoothAdapter = bluetoothAdapter3;
            }
            bluetoothAdapter.getBluetoothLeScanner().startScan(arrayList, scanSettings, this.scanCallback);
        } catch (Exception e2) {
            this.logger.e("Error starting ranging beacons", Radar.RadarLogType.SDK_EXCEPTION, e2);
        }
        this.handler.postAtTime(new Runnable() { // from class: io.radar.sdk.RadarBeaconManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                RadarBeaconManager.rangeBeacons$lambda$3(RadarBeaconManager.this);
            }
        }, "timeout", SystemClock.uptimeMillis() + 5000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rangeBeacons$lambda$3(RadarBeaconManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RadarLogger.d$default(this$0.logger, "Beacon ranging timeout", null, null, 6, null);
        this$0.stopRanging();
    }

    public final void rangeBeaconUUIDs(String[] beaconUUIDs, String[] beaconUIDs, boolean background, Radar.RadarBeaconCallback callback) {
        ScanFilter scanFilter;
        ScanFilter scanFilter2;
        BluetoothAdapter bluetoothAdapter = null;
        if (!this.permissionsHelper.bluetoothPermissionsGranted$sdk_release(this.context)) {
            RadarLogger.d$default(this.logger, "Bluetooth permissions not granted", null, null, 6, null);
            Radar.sendError$sdk_release$default(Radar.INSTANCE, Radar.RadarStatus.ERROR_PERMISSIONS, null, 2, null);
            if (callback != null) {
                Radar.RadarBeaconCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_PERMISSIONS, null, 2, null);
                return;
            }
            return;
        }
        if (!isBluetoothSupported(this.context)) {
            RadarLogger.d$default(this.logger, "Bluetooth not supported", null, null, 6, null);
            Radar.sendError$sdk_release$default(Radar.INSTANCE, Radar.RadarStatus.ERROR_BLUETOOTH, null, 2, null);
            if (callback != null) {
                Radar.RadarBeaconCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_BLUETOOTH, null, 2, null);
                return;
            }
            return;
        }
        if (this.adapter == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter(...)");
            this.adapter = defaultAdapter;
        }
        BluetoothAdapter bluetoothAdapter2 = this.adapter;
        if (bluetoothAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            bluetoothAdapter2 = null;
        }
        if (!bluetoothAdapter2.isEnabled()) {
            RadarLogger.d$default(this.logger, "Bluetooth not enabled", null, null, 6, null);
            Radar.sendError$sdk_release$default(Radar.INSTANCE, Radar.RadarStatus.ERROR_BLUETOOTH, null, 2, null);
            if (callback != null) {
                Radar.RadarBeaconCallback.DefaultImpls.onComplete$default(callback, Radar.RadarStatus.ERROR_BLUETOOTH, null, 2, null);
                return;
            }
            return;
        }
        if ((beaconUUIDs == null || beaconUUIDs.length == 0) && (beaconUIDs == null || beaconUIDs.length == 0)) {
            RadarLogger.d$default(this.logger, "No beacon UUIDs or UIDs to range", null, null, 6, null);
            if (callback != null) {
                callback.onComplete(Radar.RadarStatus.SUCCESS, new RadarBeacon[0]);
                return;
            }
            return;
        }
        addCallback(callback);
        if (this.started) {
            RadarLogger.d$default(this.logger, "Already ranging beacons", null, null, 6, null);
            return;
        }
        this.beaconUUIDs = beaconUUIDs == null ? new String[0] : beaconUUIDs;
        this.beaconUIDs = beaconUIDs == null ? new String[0] : beaconUIDs;
        this.started = true;
        ArrayList arrayList = new ArrayList();
        if (beaconUUIDs != null) {
            Iterator it = ArrayIteratorKt.iterator(beaconUUIDs);
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    RadarLogger.d$default(this.logger, "Building scan filter for ranging | beaconUUID = " + str, null, null, 6, null);
                    scanFilter2 = RadarBeaconUtils.INSTANCE.getScanFilterForBeacon(str);
                } catch (Exception e) {
                    this.logger.d("Error building scan filter for ranging | beaconUUID = " + str, Radar.RadarLogType.SDK_EXCEPTION, e);
                    scanFilter2 = null;
                }
                if (scanFilter2 != null) {
                    RadarLogger.d$default(this.logger, "Starting ranging beacon UUID | beaconUUID = " + str, null, null, 6, null);
                    arrayList.add(scanFilter2);
                }
            }
        }
        if (beaconUIDs != null) {
            Iterator it2 = ArrayIteratorKt.iterator(beaconUIDs);
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                try {
                    RadarLogger.d$default(this.logger, "Building scan filter for ranging | beaconUID = " + str2, null, null, 6, null);
                    scanFilter = RadarBeaconUtils.INSTANCE.getScanFilterForBeaconUID(str2);
                } catch (Exception e2) {
                    this.logger.d("Error building scan filter for ranging | beaconUID = " + str2, Radar.RadarLogType.SDK_EXCEPTION, e2);
                    scanFilter = null;
                }
                if (scanFilter != null) {
                    RadarLogger.d$default(this.logger, "Starting ranging beacon UID | beaconUID = " + str2, null, null, 6, null);
                    arrayList.add(scanFilter);
                }
            }
        }
        if (arrayList.size() == 0) {
            RadarLogger.d$default(this.logger, "No scan filters for ranging", null, null, 6, null);
            callCallbacks$default(this, null, 1, null);
            return;
        }
        ScanSettings scanSettings = getScanSettings(background ? 0 : 2);
        this.scanCallback = new ScanCallback() { // from class: io.radar.sdk.RadarBeaconManager$rangeBeaconUUIDs$1
            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int callbackType, ScanResult result) {
                super.onScanResult(callbackType, result);
                RadarBeaconManager.handleScanResult$sdk_release$default(RadarBeaconManager.this, callbackType, result, false, 4, null);
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(List<ScanResult> results) {
                super.onBatchScanResults(results);
                if (results != null) {
                    RadarBeaconManager radarBeaconManager = RadarBeaconManager.this;
                    Iterator<T> it3 = results.iterator();
                    while (it3.hasNext()) {
                        RadarBeaconManager.handleScanResult$sdk_release$default(radarBeaconManager, 2, (ScanResult) it3.next(), false, 4, null);
                    }
                }
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int errorCode) {
                RadarLogger radarLogger;
                super.onScanFailed(errorCode);
                radarLogger = this.logger;
                RadarLogger.d$default(radarLogger, "Scan failed", null, null, 6, null);
                RadarBeaconManager.this.stopRanging();
            }
        };
        try {
            BluetoothAdapter bluetoothAdapter3 = this.adapter;
            if (bluetoothAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                bluetoothAdapter = bluetoothAdapter3;
            }
            bluetoothAdapter.getBluetoothLeScanner().startScan(arrayList, scanSettings, this.scanCallback);
        } catch (Exception e3) {
            this.logger.e("Error starting ranging beacon UUIDs", Radar.RadarLogType.SDK_EXCEPTION, e3);
        }
        this.handler.postAtTime(new Runnable() { // from class: io.radar.sdk.RadarBeaconManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                RadarBeaconManager.rangeBeaconUUIDs$lambda$4(RadarBeaconManager.this);
            }
        }, "timeout", SystemClock.uptimeMillis() + 5000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rangeBeaconUUIDs$lambda$4(RadarBeaconManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RadarLogger.d$default(this$0.logger, "Beacon ranging timeout", null, null, 6, null);
        this$0.stopRanging();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopRanging() {
        if (this.permissionsHelper.bluetoothPermissionsGranted$sdk_release(this.context) && isBluetoothSupported(this.context)) {
            if (this.adapter == null) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                Intrinsics.checkNotNullExpressionValue(defaultAdapter, "getDefaultAdapter(...)");
                this.adapter = defaultAdapter;
            }
            RadarLogger.d$default(this.logger, "Stopping ranging", null, null, 6, null);
            this.handler.removeCallbacksAndMessages("timeout");
            try {
                BluetoothAdapter bluetoothAdapter = this.adapter;
                if (bluetoothAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    bluetoothAdapter = null;
                }
                bluetoothAdapter.getBluetoothLeScanner().stopScan(this.scanCallback);
            } catch (Exception e) {
                this.logger.d("Error stopping ranging beacons", Radar.RadarLogType.SDK_EXCEPTION, e);
            }
            this.scanCallback = null;
            callCallbacks((RadarBeacon[]) this.nearbyBeacons.toArray(new RadarBeacon[0]));
            this.beacons = new RadarBeacon[0];
            this.started = false;
            this.nearbyBeacons.clear();
        }
    }

    public final void handleBeacons$sdk_release(RadarBeacon[] beacons, Radar.RadarLocationSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (beacons == null || beacons.length == 0) {
            RadarLogger.d$default(this.logger, "No beacons to handle", null, null, 6, null);
            return;
        }
        for (RadarBeacon radarBeacon : beacons) {
            if (source == Radar.RadarLocationSource.BEACON_EXIT) {
                RadarLogger.d$default(this.logger, "Handling beacon exit | beacon.type = " + radarBeacon.getType() + "; beacon.uuid = " + radarBeacon.getUuid() + "; beacon.major = " + radarBeacon.getMajor() + "; beacon.minor = " + radarBeacon.getMinor() + "; beacon.rssi = " + radarBeacon.getRssi(), null, null, 6, null);
                this.nearbyBeacons.remove(radarBeacon);
            } else {
                RadarLogger.d$default(this.logger, "Handling beacon entry | beacon.type = " + radarBeacon.getType() + "; beacon.uuid = " + radarBeacon.getUuid() + "; beacon.major = " + radarBeacon.getMajor() + "; beacon.minor = " + radarBeacon.getMinor() + "; beacon.rssi = " + radarBeacon.getRssi(), null, null, 6, null);
                this.nearbyBeacons.add(radarBeacon);
            }
        }
    }

    public static /* synthetic */ void handleScanResult$sdk_release$default(RadarBeaconManager radarBeaconManager, int i, ScanResult scanResult, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        radarBeaconManager.handleScanResult$sdk_release(i, scanResult, z);
    }

    public final void handleScanResult$sdk_release(int callbackType, ScanResult result, boolean ranging) {
        RadarBeacon beacon;
        RadarLogger.d$default(this.logger, "Handling scan result", null, null, 6, null);
        if (result != null) {
            try {
                ScanRecord scanRecord = result.getScanRecord();
                if (scanRecord != null && (beacon = RadarBeaconUtils.INSTANCE.getBeacon(result, scanRecord)) != null) {
                    RadarLogger.d$default(this.logger, "Ranged beacon | beacon.type = " + beacon.getType() + "; beacon.uuid = " + beacon.getUuid() + "; beacon.major = " + beacon.getMajor() + "; beacon.minor = " + beacon.getMinor() + "; beacon.rssi = " + beacon.getRssi(), null, null, 6, null);
                    if (callbackType == 4) {
                        RadarLogger.d$default(this.logger, "Handling beacon exit | beacon.type = " + beacon.getType() + "; beacon.uuid = " + beacon.getUuid() + "; beacon.major = " + beacon.getMajor() + "; beacon.minor = " + beacon.getMinor() + "; beacon.rssi = " + beacon.getRssi(), null, null, 6, null);
                        this.nearbyBeacons.remove(beacon);
                    } else {
                        RadarLogger.d$default(this.logger, "Handling beacon entry | beacon.type = " + beacon.getType() + "; beacon.uuid = " + beacon.getUuid() + "; beacon.major = " + beacon.getMajor() + "; beacon.minor = " + beacon.getMinor() + "; beacon.rssi = " + beacon.getRssi(), null, null, 6, null);
                        this.nearbyBeacons.add(beacon);
                    }
                }
            } catch (Exception e) {
                this.logger.e("Error handling scan result", Radar.RadarLogType.SDK_EXCEPTION, e);
            }
        }
        if (this.nearbyBeacons.size() == this.beacons.length && ranging) {
            RadarLogger.d$default(this.logger, "Finished ranging", null, null, 6, null);
            stopRanging();
        }
    }

    private final boolean isBluetoothSupported(Context context) {
        BluetoothAdapter defaultAdapter;
        if (this.adapter == null && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
            this.adapter = defaultAdapter;
        }
        if (!context.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
            return false;
        }
        if (this.adapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        BluetoothAdapter bluetoothAdapter = this.adapter;
        if (bluetoothAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            bluetoothAdapter = null;
        }
        return bluetoothAdapter.getBluetoothLeScanner() != null;
    }

    private final ScanSettings getScanSettings(int scanMode) {
        ScanSettings build = new ScanSettings.Builder().setScanMode(scanMode).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
