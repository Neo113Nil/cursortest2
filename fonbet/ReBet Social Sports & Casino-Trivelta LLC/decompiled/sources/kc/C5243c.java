package kc;

import android.media.ExifInterface;

/* renamed from: kc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5243c {

    /* renamed from: a, reason: collision with root package name */
    public Float f54423a;

    /* renamed from: b, reason: collision with root package name */
    public Float f54424b;

    public C5243c(ExifInterface exifInterface) {
        String attribute = exifInterface.getAttribute("GPSLatitude");
        String attribute2 = exifInterface.getAttribute("GPSLatitudeRef");
        String attribute3 = exifInterface.getAttribute("GPSLongitude");
        String attribute4 = exifInterface.getAttribute("GPSLongitudeRef");
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return;
        }
        if (attribute2.equals("N")) {
            this.f54423a = a(attribute);
        } else {
            this.f54423a = Float.valueOf(0.0f - a(attribute).floatValue());
        }
        if (attribute4.equals("E")) {
            this.f54424b = a(attribute3);
        } else {
            this.f54424b = Float.valueOf(0.0f - a(attribute3).floatValue());
        }
    }

    public final Float a(String str) {
        String[] split = str.split(",", 3);
        String[] split2 = split[0].split("/", 2);
        double doubleValue = Double.valueOf(split2[0]).doubleValue() / Double.valueOf(split2[1]).doubleValue();
        String[] split3 = split[1].split("/", 2);
        double doubleValue2 = Double.valueOf(split3[0]).doubleValue() / Double.valueOf(split3[1]).doubleValue();
        String[] split4 = split[2].split("/", 2);
        return Float.valueOf((float) (doubleValue + (doubleValue2 / 60.0d) + ((Double.valueOf(split4[0]).doubleValue() / Double.valueOf(split4[1]).doubleValue()) / 3600.0d)));
    }

    public Float b() {
        return this.f54423a;
    }

    public Float c() {
        return this.f54424b;
    }
}
