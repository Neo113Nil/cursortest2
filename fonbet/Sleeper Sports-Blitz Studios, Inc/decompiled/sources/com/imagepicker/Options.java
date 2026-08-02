package com.imagepicker;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import io.radar.sdk.RadarTrackingOptions;

/* loaded from: classes8.dex */
public class Options {
    int durationLimit;
    Boolean includeBase64;
    Boolean includeExtra;
    int maxHeight;
    int maxWidth;
    String mediaType;
    int quality;
    Boolean saveToPhotos;
    int selectionLimit;
    Boolean useFrontCamera;
    int videoQuality;

    Options(ReadableMap readableMap) {
        this.videoQuality = 1;
        this.useFrontCamera = false;
        this.mediaType = readableMap.getString("mediaType");
        this.selectionLimit = readableMap.getInt("selectionLimit");
        this.includeBase64 = Boolean.valueOf(readableMap.getBoolean("includeBase64"));
        this.includeExtra = Boolean.valueOf(readableMap.getBoolean("includeExtra"));
        String string = readableMap.getString("videoQuality");
        if (!TextUtils.isEmpty(string) && !string.toLowerCase().equals(RadarTrackingOptions.RadarTrackingOptionsDesiredAccuracy.HIGH_STR)) {
            this.videoQuality = 0;
        }
        if (readableMap.getString("cameraType").equals(ApiConstant.DOCUMENT_FRONT)) {
            this.useFrontCamera = true;
        }
        this.quality = (int) (readableMap.getDouble("quality") * 100.0d);
        this.maxHeight = readableMap.getInt(ViewProps.MAX_HEIGHT);
        this.maxWidth = readableMap.getInt(ViewProps.MAX_WIDTH);
        this.saveToPhotos = Boolean.valueOf(readableMap.getBoolean("saveToPhotos"));
        this.durationLimit = readableMap.getInt("durationLimit");
    }
}
