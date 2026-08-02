package com.agontuk.RNFusedLocation;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.twilio.voice.Constants;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f28325a;

    /* renamed from: b, reason: collision with root package name */
    public final long f28326b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28327c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28328d;

    /* renamed from: e, reason: collision with root package name */
    public final long f28329e;

    /* renamed from: f, reason: collision with root package name */
    public final double f28330f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f28331g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f28332h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f28333i;

    public f(b bVar, long j10, long j11, float f10, long j12, double d10, boolean z10, boolean z11, boolean z12) {
        this.f28325a = bVar;
        this.f28326b = j10;
        this.f28327c = j11;
        this.f28328d = f10;
        this.f28329e = j12;
        this.f28330f = d10;
        this.f28331g = z10;
        this.f28332h = z11;
        this.f28333i = z12;
    }

    public static f a(ReadableMap readableMap) {
        return new f(c(readableMap), readableMap.hasKey("interval") ? (long) readableMap.getDouble("interval") : 10000L, readableMap.hasKey("fastestInterval") ? (long) readableMap.getDouble("fastestInterval") : 5000L, readableMap.hasKey("distanceFilter") ? (float) readableMap.getDouble("distanceFilter") : 100.0f, readableMap.hasKey("timeout") ? (long) readableMap.getDouble("timeout") : LongCompanionObject.MAX_VALUE, readableMap.hasKey("maximumAge") ? readableMap.getDouble("maximumAge") : Double.POSITIVE_INFINITY, !readableMap.hasKey("showLocationDialog") || readableMap.getBoolean("showLocationDialog"), readableMap.hasKey("forceRequestLocation") && readableMap.getBoolean("forceRequestLocation"), readableMap.hasKey("forceLocationManager") && readableMap.getBoolean("forceLocationManager"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0073, code lost:
    
        if (r6.equals("balanced") == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b c(ReadableMap readableMap) {
        String str;
        ReadableMap map;
        char c10 = 0;
        boolean z10 = readableMap.hasKey("enableHighAccuracy") && readableMap.getBoolean("enableHighAccuracy");
        if (!readableMap.hasKey("accuracy") || readableMap.getType("accuracy") != ReadableType.Map || (map = readableMap.getMap("accuracy")) == null || !map.hasKey(Constants.PLATFORM_ANDROID) || map.getType(Constants.PLATFORM_ANDROID) != ReadableType.String || (str = map.getString(Constants.PLATFORM_ANDROID)) == null) {
            str = "";
        }
        switch (str.hashCode()) {
            case -1924829944:
                break;
            case -792039641:
                if (str.equals("passive")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 107348:
                if (str.equals("low")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3202466:
                if (str.equals("high")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return b.balanced;
            case 1:
                return b.passive;
            case 2:
                return b.low;
            case 3:
                return b.high;
            default:
                return z10 ? b.high : b.balanced;
        }
    }

    public b b() {
        return this.f28325a;
    }

    public float d() {
        return this.f28328d;
    }

    public long e() {
        return this.f28327c;
    }

    public long f() {
        return this.f28326b;
    }

    public double g() {
        return this.f28330f;
    }

    public long h() {
        return this.f28329e;
    }

    public boolean i() {
        return this.f28333i;
    }

    public boolean j() {
        return this.f28332h;
    }

    public boolean k() {
        return this.f28331g;
    }
}
