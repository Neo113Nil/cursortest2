package com.amplitude.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TrackingOptions {
    private static final String TAG = "com.amplitude.api.TrackingOptions";
    Set<String> disabledFields = new HashSet();
    private static String[] SERVER_SIDE_PROPERTIES = {"city", "country", Constants.AMP_TRACKING_OPTION_DMA, "ip_address", Constants.AMP_TRACKING_OPTION_LAT_LNG, "region"};
    private static String[] COPPA_CONTROL_PROPERTIES = {Constants.AMP_TRACKING_OPTION_ADID, "city", "ip_address", Constants.AMP_TRACKING_OPTION_LAT_LNG};

    public TrackingOptions disableAdid() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_ADID);
        return this;
    }

    boolean shouldTrackAdid() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_ADID);
    }

    public TrackingOptions disableAppSetId() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_APP_SET_ID);
        return this;
    }

    boolean shouldTrackAppSetId() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_APP_SET_ID);
    }

    public TrackingOptions disableCarrier() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_CARRIER);
        return this;
    }

    boolean shouldTrackCarrier() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_CARRIER);
    }

    public TrackingOptions disableCity() {
        disableTrackingField("city");
        return this;
    }

    boolean shouldTrackCity() {
        return shouldTrackField("city");
    }

    public TrackingOptions disableCountry() {
        disableTrackingField("country");
        return this;
    }

    boolean shouldTrackCountry() {
        return shouldTrackField("country");
    }

    public TrackingOptions disableDeviceBrand() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_DEVICE_BRAND);
        return this;
    }

    boolean shouldTrackDeviceBrand() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_DEVICE_BRAND);
    }

    public TrackingOptions disableDeviceManufacturer() {
        disableTrackingField("device_manufacturer");
        return this;
    }

    boolean shouldTrackDeviceManufacturer() {
        return shouldTrackField("device_manufacturer");
    }

    public TrackingOptions disableDeviceModel() {
        disableTrackingField("device_model");
        return this;
    }

    boolean shouldTrackDeviceModel() {
        return shouldTrackField("device_model");
    }

    public TrackingOptions disableDma() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_DMA);
        return this;
    }

    boolean shouldTrackDma() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_DMA);
    }

    public TrackingOptions disableIpAddress() {
        disableTrackingField("ip_address");
        return this;
    }

    boolean shouldTrackIpAddress() {
        return shouldTrackField("ip_address");
    }

    public TrackingOptions disableLanguage() {
        disableTrackingField("language");
        return this;
    }

    boolean shouldTrackLanguage() {
        return shouldTrackField("language");
    }

    public TrackingOptions disableLatLng() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_LAT_LNG);
        return this;
    }

    boolean shouldTrackLatLng() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_LAT_LNG);
    }

    public TrackingOptions disableOsName() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_OS_NAME);
        return this;
    }

    boolean shouldTrackOsName() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_OS_NAME);
    }

    public TrackingOptions disableOsVersion() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_OS_VERSION);
        return this;
    }

    boolean shouldTrackOsVersion() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_OS_VERSION);
    }

    public TrackingOptions disableApiLevel() {
        disableTrackingField(Constants.AMP_TRACKING_OPTION_API_LEVEL);
        return this;
    }

    boolean shouldTrackApiLevel() {
        return shouldTrackField(Constants.AMP_TRACKING_OPTION_API_LEVEL);
    }

    public TrackingOptions disablePlatform() {
        disableTrackingField("platform");
        return this;
    }

    boolean shouldTrackPlatform() {
        return shouldTrackField("platform");
    }

    public TrackingOptions disableRegion() {
        disableTrackingField("region");
        return this;
    }

    boolean shouldTrackRegion() {
        return shouldTrackField("region");
    }

    public TrackingOptions disableVersionName() {
        disableTrackingField("version_name");
        return this;
    }

    boolean shouldTrackVersionName() {
        return shouldTrackField("version_name");
    }

    private void disableTrackingField(String str) {
        this.disabledFields.add(str);
    }

    protected JSONObject getApiPropertiesTrackingOptions() {
        JSONObject jSONObject = new JSONObject();
        if (!this.disabledFields.isEmpty()) {
            for (String str : SERVER_SIDE_PROPERTIES) {
                if (this.disabledFields.contains(str)) {
                    try {
                        jSONObject.put(str, false);
                    } catch (JSONException e) {
                        AmplitudeLog.getLogger().e(TAG, e.toString());
                    }
                }
            }
        }
        return jSONObject;
    }

    private boolean shouldTrackField(String str) {
        return !this.disabledFields.contains(str);
    }

    TrackingOptions mergeIn(TrackingOptions trackingOptions) {
        Iterator<String> it = trackingOptions.disabledFields.iterator();
        while (it.hasNext()) {
            disableTrackingField(it.next());
        }
        return this;
    }

    static TrackingOptions copyOf(TrackingOptions trackingOptions) {
        TrackingOptions trackingOptions2 = new TrackingOptions();
        Iterator<String> it = trackingOptions.disabledFields.iterator();
        while (it.hasNext()) {
            trackingOptions2.disableTrackingField(it.next());
        }
        return trackingOptions2;
    }

    static TrackingOptions forCoppaControl() {
        TrackingOptions trackingOptions = new TrackingOptions();
        for (String str : COPPA_CONTROL_PROPERTIES) {
            trackingOptions.disableTrackingField(str);
        }
        return trackingOptions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ((TrackingOptions) obj).disabledFields.equals(this.disabledFields);
        }
        return false;
    }
}
