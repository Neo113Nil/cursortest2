package com.zoho.livechat.android.utils;

import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes4.dex */
public abstract class S {
    public static LatLng a(LatLng latLng, double d10, double d11) {
        double d12 = d10 / 6371009.0d;
        double radians = Math.toRadians(d11);
        double radians2 = Math.toRadians(latLng.f33210a);
        double radians3 = Math.toRadians(latLng.f33211b);
        double cos = Math.cos(d12);
        double sin = Math.sin(d12);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (Math.cos(radians) * cos2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }
}
