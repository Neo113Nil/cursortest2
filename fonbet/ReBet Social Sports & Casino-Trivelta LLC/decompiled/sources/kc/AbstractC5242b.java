package kc;

import android.media.ExifInterface;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: kc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5242b {
    public static WritableMap a(String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        List<String> b10 = b();
        b10.addAll(c());
        ExifInterface exifInterface = new ExifInterface(str);
        try {
            C5243c c5243c = new C5243c(exifInterface);
            if (c5243c.b() != null && c5243c.c() != null) {
                writableNativeMap.putDouble("Latitude", c5243c.b().floatValue());
                writableNativeMap.putDouble("Longitude", c5243c.c().floatValue());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        for (String str2 : b10) {
            writableNativeMap.putString(str2, exifInterface.getAttribute(str2));
        }
        return writableNativeMap;
    }

    public static List b() {
        return new ArrayList(Arrays.asList("FNumber", "DateTime", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "WhiteBalance"));
    }

    public static List c() {
        return new ArrayList(Arrays.asList("DateTimeDigitized", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal"));
    }
}
